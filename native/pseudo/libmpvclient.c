/*
 * libmpvclient.c — Reex 自写 mpv 桥（伪代码重建）
 *
 * 覆盖三块：JNI 胶水、Dart 自定义流、SMB2 协议。
 * 每段标注原始地址，便于与 tools/disasm_arm64.py 输出对照。
 * 结构体见 ../libmpvclient.h
 */
#include "libmpvclient.h"

#include <jni.h>
#include <pthread.h>
#include <stdlib.h>
#include <string.h>
#include <android/log.h>
#include <mpv/client.h>
#include <cjson/cJSON.h>
#include <smb2/smb2.h>
#include <smb2/libsmb2.h>

#include "dart_api_dl.h"

#define LOG_TAG "stream_cb_smb2"

/* ============================================================ JNI 胶水 */

/* 0x4ed0 —— JNIEnv 表索引 21 = NewGlobalRef */
JNIEXPORT jlong JNICALL
Java_xyz_lhtls_mpv_1client_MPVJniUtils_newGlobalNativePtr(JNIEnv *env, jobject thiz, jobject obj)
{
    return (jlong)(intptr_t)(*env)->NewGlobalRef(env, obj);
}

/* 0x4ee0 —— 索引 22 = DeleteGlobalRef */
JNIEXPORT void JNICALL
Java_xyz_lhtls_mpv_1client_MPVJniUtils_deleteGlobalNativePtr(JNIEnv *env, jobject thiz, jlong ptr)
{
    (*env)->DeleteGlobalRef(env, (jobject)(intptr_t)ptr);
}

/* 0x4ef0 */
JNIEXPORT void JNICALL
Java_xyz_lhtls_mpv_1client_MPVJniUtils_mpvTerminateDestroy(JNIEnv *env, jobject thiz, jlong ptr)
{
    mpv_terminate_destroy((mpv_handle *)(intptr_t)ptr);
}

/* 0x4ef8 —— 索引 219 = GetJavaVM */
JNIEXPORT void JNICALL
Java_xyz_lhtls_mpv_1client_MPVJniUtils_avJniSetJavaVM(JNIEnv *env, jobject thiz)
{
    JavaVM *vm = NULL;
    (*env)->GetJavaVM(env, &vm);
    av_jni_set_java_vm(vm, NULL);
}

/* ====================================================== Dart 侧唤醒/流 */

/* 0x9db8 —— 向 Dart port 发一个 null CObject */
void dart_wakeup_callback(void *user_data)
{
    Dart_Port port = *(Dart_Port *)user_data;
    Dart_CObject msg;
    msg.type = Dart_CObject_kNull;
    Dart_PostCObject_DL(port, &msg);
}

/* 0x9e14 —— Dart 完成一次流操作后唤醒等待中的 mpv 线程 */
void mpv_stream_method_done(void *cookie)
{
    struct dart_stream_ctx *c = cookie;
    pthread_mutex_lock(&c->mutex);
    pthread_cond_signal(&c->cond);
    pthread_mutex_unlock(&c->mutex);
}

struct dart_stream_ctx {
    Dart_Port       port;        /* +0x00 从 user_data 复制 */
    pthread_mutex_t mutex;       /* +0x08 */
    pthread_cond_t  cond;        /* +0x10 */
    void           *info;        /* +0x18 mpv_stream_cb_info* */
    /* +0x20.. 结果槽 / 参数（Dart 通过 cookie 指针直接写入） */
    uint8_t         rest[0x48];
};

/* 0xa020 —— read_fn 的骨架（seek/size/close/cancel 结构相同） */
static int64_t dart_stream_read(void *cookie, char *buf, uint64_t nbytes)
{
    struct dart_stream_ctx *c = cookie;

    Dart_CObject arr[4];
    Dart_CObject m0, m1, m2, m3;
    m0.type = Dart_CObject_kString; m0.value.as_string = "read";
    m1.type = Dart_CObject_kInt64;  m1.value.as_int64  = (int64_t)(intptr_t)c;
    m2.type = Dart_CObject_kInt64;  m2.value.as_int64  = (int64_t)(intptr_t)buf;
    m3.type = Dart_CObject_kInt64;  m3.value.as_int64  = (int64_t)nbytes;
    arr[0] = m0; arr[1] = m1; arr[2] = m2; arr[3] = m3;

    Dart_CObject msg;
    msg.type = Dart_CObject_kArray;
    msg.value.as_array.length = 4;
    msg.value.as_array.values = arr;

    int64_t result = 0;

    pthread_mutex_lock(&c->mutex);
    bool ok = Dart_PostCObject_DL(c->port, &msg);
    if (ok)
        pthread_cond_wait(&c->cond, &c->mutex);
    pthread_mutex_unlock(&c->mutex);

    /* 原始实现：Dart 把读取字节数写到栈上的结果槽，这里用局部变量代替 */
    return ok ? result : -18 /* MPV_ERROR_GENERIC */;
}

/* 0x9e50 —— open 回调：注册上述五个函数指针 */
static int dart_stream_open(void *user_data, char *uri, mpv_stream_cb_info *info)
{
    Dart_Port port = *(Dart_Port *)user_data;

    struct dart_stream_ctx *c = calloc(1, 0x68);
    if (!c)
        return -2;                       /* MPV_ERROR_NOMEM */

    c->port = port;
    pthread_mutex_init(&c->mutex, NULL);
    pthread_cond_init(&c->cond, NULL);
    c->info = info;

    /* 组装 ["open", cookie, uri] 并 post，等待 Dart 打开成功 */
    ...

    info->cookie    = c;
    info->read_fn   = dart_stream_read;      /* 0xa020 */
    info->seek_fn   = ...;                   /* 0xa134 */
    info->size_fn   = ...;                   /* 0xa248 */
    info->close_fn  = ...;                   /* 0xa35c */
    info->cancel_fn = ...;                   /* 0xa474 */
    return 0;
}

/* 0x9e44 */
int register_mpv_stream_cb_dart(mpv_handle *mpv, const char *protocol, void *user_data)
{
    return mpv_stream_cb_add_ro(mpv, protocol, user_data, dart_stream_open);
}

/* ============================================================ SMB2 流 */

/* 0x0a63c —— 解析 smb2://{JSON} */
static reex_smb_url *smb_url_parse(const char *uri)
{
    size_t len = strlen(uri);
    char *json = alloca(len - 7 + 1);
    strncpy(json, uri + 7, len - 7);          /* 跳过 "smb2://" */
    json[len - 7] = '\0';

    cJSON *root = cJSON_Parse(json);
    if (!root || !cJSON_IsObject(root)) {
        cJSON_Delete(root);
        return NULL;
    }

    cJSON *server = cJSON_GetObjectItem(root, "server");
    cJSON *share  = cJSON_GetObjectItem(root, "share");
    cJSON *path   = cJSON_GetObjectItem(root, "path");
    if (!cJSON_IsString(server) || !cJSON_IsString(share) || !cJSON_IsString(path)) {
        cJSON_Delete(root);
        return NULL;
    }

    reex_smb_url *u = calloc(1, 0x38);
    if (!u) {
        cJSON_Delete(root);
        return NULL;
    }
    u->server = server->valuestring;
    u->share  = share->valuestring;
    u->path   = path->valuestring;
    u->json_root = root;

    cJSON *v;
    if ((v = cJSON_GetObjectItem(root, "domain")) && cJSON_IsString(v))
        u->domain = v->valuestring;
    if ((v = cJSON_GetObjectItem(root, "username")) && cJSON_IsString(v))
        u->username = v->valuestring;
    if ((v = cJSON_GetObjectItem(root, "password")) && cJSON_IsString(v))
        u->password = v->valuestring;
    return u;
}

/* 0x0a7e4 —— 初始化 smb2 上下文 + 认证 */
static int smb_ctx_init(reex_smb_stream *s)
{
    struct smb2_context *smb2 = smb2_init_context();
    if (!smb2)
        return 0;

    smb2_set_security_mode(smb2, 1);
    smb2_set_timeout(smb2, 8);

    if (s->url->domain)   smb2_set_domain(smb2, s->url->domain);
    if (s->url->password) smb2_set_password(smb2, s->url->password);
    if (s->url->username) smb2_set_user(smb2, s->url->username);

    s->smb2 = smb2;
    return 1;
}

/* 0x0a874 —— 连接共享 + 打开文件 */
static int smb_connect_open(reex_smb_stream *s)
{
    if (smb2_connect_share(s->smb2, s->url->server, s->url->share,
                           s->url->username) < 0)
        return 0;

    s->fh = smb2_open(s->smb2, s->url->path);
    if (!s->fh)
        return 0;

    struct smb2_stat_64 st;
    if (smb2_fstat(s->smb2, s->fh, &st) < 0)
        return 0;

    s->size = st.smb2_size;
    return 1;
}

/* 0x0a57c —— SMB 协议的 open 回调 */
static int smb_open_cb(void *user_data, char *uri, mpv_stream_cb_info *info)
{
    reex_smb_url *url = smb_url_parse(uri);
    if (!url) {
        __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, "smb_url_parse failed");
        return -13;                     /* MPV_ERROR_LOADING_FAILED */
    }

    reex_smb_stream *s = calloc(1, 0x28);
    if (!s) {
        cJSON_Delete(url->json_root);
        free(url);
        return -2;
    }
    s->url = url;

    if (!smb_ctx_init(s) || !smb_connect_open(s)) {
        free(s);
        cJSON_Delete(url->json_root);
        free(url);
        return -13;
    }

    info->cookie    = s;
    info->read_fn   = smb_read;      /* 0xa9c4 */
    info->seek_fn   = smb_seek;      /* 0xa96c */
    info->size_fn   = smb_size;      /* 0xa954 */
    info->close_fn  = smb_close;     /* 0xaa9c */
    return 0;
}

/* 0xa524 */
int mpv_stream_cb_add_ro_smb2(mpv_handle *mpv)
{
    int ret = mpv_stream_cb_add_ro(mpv, "smb2", NULL, smb_open_cb);
    if (ret == -13)
        __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG,
                            "mpv_stream_cb_add_ro failed to add smb2");
    return ret;
}
