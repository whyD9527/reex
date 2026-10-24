/*
 * libmpvclient.h — Reex 自写 mpv 桥（逆向重建）
 *
 * 目标库: lib/arm64-v8a/libmpvclient.so  (48,072 字节)
 * 来源:   Reex 1.8.9 (xyz.re.player.ex)
 * 方法:   静态反汇编（tools/disasm_arm64.py）+ 导入/导出符号 + .rodata 字符串
 *
 * 这个库把三件事揉在一起：
 *   1. JNI 胶水：给 Kotlin 的 MPVJniUtils 提供 4 个 native 方法
 *   2. Dart FFI 扩展：注册自定义流协议、把 mpv 事件投递回 Dart isolate
 *   3. SMB2 直连：把 smb2://{JSON} 变成 mpv 可读的流（libsmb2）
 *
 * 置信度: [确定] 反汇编直接可见；[推断] 由上下文推理；[存疑] 需运行时验证
 */
#ifndef REEX_MPVCLIENT_H
#define REEX_MPVCLIENT_H

#include <stdint.h>
#include <stddef.h>
#include <jni.h>          /* JNIEnv / jobject */

#ifdef __cplusplus
extern "C" {
#endif

struct mpv_handle;
struct mpv_stream_cb_info;

/* =====================================================================
 * 1. JNI 入口（Kotlin: xyz.lhtls.mpv_client.MPVJniUtils）
 * ===================================================================== */

/* JNIEnv 方法表索引 0xa8/8 = 21 = NewGlobalRef
 * 返回值被当作 "native pointer" 交给 Dart 侧持有。            [确定] */
JNIEXPORT jlong JNICALL
Java_xyz_lhtls_mpv_1client_MPVJniUtils_newGlobalNativePtr(JNIEnv *env, jobject thiz, jobject obj);

/* JNIEnv 方法表索引 0xb0/8 = 22 = DeleteGlobalRef            [确定] */
JNIEXPORT void JNICALL
Java_xyz_lhtls_mpv_1client_MPVJniUtils_deleteGlobalNativePtr(JNIEnv *env, jobject thiz, jlong ptr);

/* 直接尾调用 mpv_terminate_destroy(ptr)                       [确定] */
JNIEXPORT void JNICALL
Java_xyz_lhtls_mpv_1client_MPVJniUtils_mpvTerminateDestroy(JNIEnv *env, jobject thiz, jlong ptr);

/* GetJavaVM（JNIEnv 索引 219）→ av_jni_set_java_vm(vm, NULL)   [确定]
 * 让 FFmpeg/libmpv 的 MediaCodec 等 JNI 路径可用。 */
JNIEXPORT void JNICALL
Java_xyz_lhtls_mpv_1client_MPVJniUtils_avJniSetJavaVM(JNIEnv *env, jobject thiz);

/* =====================================================================
 * 2. Dart FFI 入口
 * ===================================================================== */

/* 注册一个"由 Dart 提供数据"的自定义流协议。
 *   反汇编: register_mpv_stream_cb_dart @0x9e44
 *   实现:   return mpv_stream_cb_add_ro(mpv, protocol, user_data, cb@0x9e50);
 *   user_data: 指向一个结构体，**首字段是 Dart_Port(Dart_Port id)**
 *   返回:   mpv_stream_cb_add_ro 的返回值（0 = 成功）
 *   [确定] */
int register_mpv_stream_cb_dart(struct mpv_handle *mpv,
                                const char *protocol,
                                void *user_data);

/* Dart 完成一次 open/read/seek/size/close 后调用，唤醒阻塞在 condvar 的 mpv 线程。
 *   反汇编: mpv_stream_method_done @0x9e14
 *   实现:   pthread_mutex_lock(ctx+8);
 *           pthread_cond_signal(ctx+0x10);
 *           pthread_mutex_unlock(ctx+8);                       [确定] */
void mpv_stream_method_done(void *cookie);

/* 注册内置的 SMB2 流协议（协议名 "smb2"）。
 *   反汇编: mpv_stream_cb_add_ro_smb2 @0xa524
 *   实现:   mpv_stream_cb_add_ro(mpv, "smb2", NULL, open_cb@0xa57c);
 *           if (ret == -13) __android_log_print(3, "stream_cb_smb2",
 *                                               "mpv_stream_cb_add_ro failed to add smb2");
 *   返回:   mpv 错误码（0 成功，-13 = MPV_ERROR_LOADING_FAILED）
 *   [确定] */
int mpv_stream_cb_add_ro_smb2(struct mpv_handle *mpv);

/* mpv 的 wakeup 回调：向 Dart port 投递一个 "null" CObject 作为唤醒信号。
 *   反汇编: dart_wakeup_callback @0x9db8
 *   实现:   Dart_PostCObject_DL(*(Dart_Port*)user_data, &(Dart_CObject){kNull});
 *   注意:   user_data 的首字段即 port id（与 register_mpv_stream_cb_dart 相同约定）[确定] */
void dart_wakeup_callback(void *user_data);

/* =====================================================================
 * 3. SMB2 流协议（重点发现）
 * =====================================================================
 *
 * mpv 打开形如：
 *
 *   smb2://{"server":"192.168.1.10","share":"media","path":"/a/b.mkv",
 *           "username":"u","password":"p","domain":"WORKGROUP"}
 *
 * 解析（open 回调 @0xa57c → sub_a63c @0xa63c）[确定]：
 *   - 跳过前 7 个字符（即 "smb2://"）
 *   - 对剩余部分做 cJSON_Parse，必须是 JSON object
 *   - 取 "server"/"share"/"path" 三个**必填**字符串，缺一即失败
 *   - 可选 "domain"/"username"/"password"
 *
 * 解析结果（calloc 0x38）[确定]：
 *   +0x00 const char *domain
 *   +0x08 const char *username
 *   +0x10 const char *password
 *   +0x18 const char *server
 *   +0x20 const char *share
 *   +0x28 const char *path
 *   +0x30 cJSON *root          （用于 cJSON_Delete）
 */

typedef struct reex_smb_url {
    const char *domain;     /* +0x00 */
    const char *username;   /* +0x08 */
    const char *password;   /* +0x10 */
    const char *server;     /* +0x18 */
    const char *share;      /* +0x20 */
    const char *path;       /* +0x28 */
    void       *json_root;  /* +0x30  cJSON* */
} reex_smb_url;

/* SMB 流上下文（open 回调中 calloc(1, 0x28)）[确定] */
typedef struct reex_smb_stream {
    void         *smb2;        /* +0x00  smb2_context*（推断，见 sub_a7e4） */
    void         *fh;          /* +0x08  smb2fh*（smb2_open 返回）          */
    reex_smb_url *url;         /* +0x10  解析结果                            */
    uint8_t       _pad[0x10];  /* +0x18..                                    */
} reex_smb_stream;

/*
 * SMB 流内部调用链 [确定]：
 *
 *   open  @0xa57c : sub_a63c(uri) → calloc(0x28)
 *                   → sub_a7e4(ctx)  smb2_init_context
 *                                    smb2_set_security_mode(1)
 *                                    smb2_set_timeout(8)
 *                                    smb2_set_domain / _user / _password
 *                   → sub_a874(ctx)  smb2_connect_share(server, share, user)
 *                                    smb2_open(path)
 *                                    smb2_fstat  → size
 *                   → info = { cookie=ctx, read=0xa9c4, seek=0xa96c,
 *                              size=0xa954, close=0xaa9c }
 *
 *   seek  @0xa96c : smb2_lseek
 *   read  @0xa9c4 : smb2_get_max_read_size 分块 + smb2_read（失败时 lseek 重试）
 *   close @0xaa9c : smb2_destroy_context → cJSON_Delete → free
 *
 * 注意: 凭据以明文出现在 URI 字符串里，mpv 的日志（mpv_logs.jsonl）可能记录该 URI，
 *       属于敏感信息落盘风险，见 docs/09-security.md 的补充说明。
 */

/* =====================================================================
 * 4. Dart 流协议的消息格式（register_mpv_stream_cb_dart 的回调）
 * =====================================================================
 *
 * 回调 open 函数（0x9e50）：
 *   calloc(1, 0x68) 建立每流上下文 → 组装 Dart_CObject 数组
 *   → pthread_mutex_lock(ctx+8) → Dart_PostCObject_DL(port, msg)
 *   → pthread_cond_wait(ctx+?, ctx+8) → unlock
 *   → 成功则填写 mpv_stream_cb_info，把 cookie=ctx 交给 mpv
 *
 * 消息是 Dart_CObject 的嵌套数组，首元素为方法名字符串：
 *
 *   "open"   参数: cookie, uri
 *   "read"   参数: cookie, buffer_ptr, nbytes
 *   "seek"   参数: cookie, offset
 *   "size"   参数: cookie
 *   "close"  参数: cookie
 *   "cancel" 参数: cookie
 *
 *   Dart 侧处理后直接写 native buffer / 结果槽，再调用 mpv_stream_method_done(cookie)。
 *   [确定方法名与数据流；参数顺序与结果槽偏移需运行时验证]
 */

#ifdef __cplusplus
}
#endif
#endif /* REEX_MPVCLIENT_H */
