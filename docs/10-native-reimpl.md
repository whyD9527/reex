# 10 · 自写原生库的完整还原

> 对象：`libmmr.so`（11,568 B）与 `libmpvclient.so`（48,072 B）
> 方法：自写 ARM64 反汇编器（[`tools/disasm_arm64.py`](../tools/disasm_arm64.py)）+ 符号/字符串交叉引用
> 产出：[`native/libmmr.h`](../native/libmmr.h)、[`native/libmpvclient.h`](../native/libmpvclient.h)、
>       [`native/pseudo/libmmr.c`](../native/pseudo/libmmr.c)、[`native/pseudo/libmpvclient.c`](../native/pseudo/libmpvclient.c)

与 mpv/FFmpeg 不同，这两个库是**作者自己写的薄胶水**，没有混淆、没有裁剪符号，
因此可以还原到「等价重写」的程度——这是整个逆向工程里唯一能真正"重做"的代码。

---

## 1. 工具：为什么要自己写反汇编器

现成工具的限制：

| 工具 | 问题 |
| --- | --- |
| IDA/Ghidra | 无 license / 需下载 400 MB+，且对 11 KB 的小库过重 |
| `objdump` | 环境里没有 binutils |
| blutter 的 asm | 只覆盖 Dart 代码，不处理这两个 .so |

自写的 `disasm_arm64.py` 做了四件事：

1. 解析 `.dynsym` / `.rela.plt` / `.rela.dyn`，把 PLT 桩与 GOT 槽映射回**导入函数名**；
2. 线性反汇编 `.text`，以「导出符号 + `bl` 目标 + 函数序言（`stp x29,x30,[sp,#-N]!`）」切分函数；
3. 跟踪 `adrp`+`add`/`ldr` 的页基址寄存器，把数据引用解析成**字符串 / GOT 槽 / .data.rel.ro 指针**；
4. 输出带注释的汇编，并可直接导出 JSON 供后续脚本统计调用图、结构体偏移。

用法：

```bash
python tools/disasm_arm64.py libmmr.so                 # 全部函数
python tools/disasm_arm64.py libmmr.so --func create   # 过滤
python tools/disasm_arm64.py libmpvclient.so --json out.json
```

> 局限性：线性扫描会把数据当指令（用符号边界规避）、不恢复类型、不处理间接跳转表；
> 对本项目的两个小库足够，对大库需要 CFG 递归下降。

---

## 2. libmmr.so —— 媒体元数据检索器

### 2.1 函数表（26 个函数，其中 10 个导出）

| 地址 | 名称 | 大小 | 作用 |
| --- | --- | --- | --- |
| 0x1610 | `media_metadata_retriever_create` | 104 | 打开媒体、读流信息 |
| 0x1678 | `media_metadata_retriever_get_frame_at_time` | 264 | 指定时间截帧 → JPEG |
| 0x1a1c | `media_metadata_retriever_get_attached_image` | 148 | 内嵌封面 |
| 0x1ac4 | `media_metadata_retriever_get_duration` | 12 | 时长 |
| 0x1ad0 | `media_metadata_retriever_get_metadata` | 52 | 容器标签（懒加载） |
| 0x1bdc | `media_metadata_retriever_get_video_track` | 48 | 视频轨链表 |
| 0x1c0c | `media_metadata_retriever_get_audio_track` | 44 | 音频轨链表 |
| 0x1c38 | （音频字段填充） | 52 | — |
| 0x1e3c | `media_metadata_retriever_release` | 272 | 释放全部 |
| 0x1f94 | `media_image_release` | 40 | 释放图像 |
| 0x17fc | （解码→缩放→MJPEG 编码） | 472 | 截帧核心 |

### 2.2 结构体（从 calloc 大小与偏移直接读出）

```c
retriever (0x30)              video_track (0x48)        audio_track (0x38)
+0x00 fmt                     +0x00 coded_side_data     +0x00 coded_side_data
+0x08 metadata (缓存)          +0x08 bit_rate            +0x08 field_08 [存疑]
+0x10 tracks_built (u8)       +0x10 avg_frame_rate      +0x0c channels [存疑]
+0x18 video 链表头             +0x18 r_frame_rate        +0x10 media_type
+0x20 audio 链表头             +0x20 media_type          +0x18 codec_name
+0x28 subtitle 链表头          +0x28 codec_name          +0x20 codec_long_name
                              +0x30 codec_long_name     +0x28 metadata
metadata (0x18)               +0x38 metadata            +0x30 next
+0x00 count                   +0x40 next
+0x08 keys[]                                            subtitle_track (0x30)
+0x10 values[]                image (0x10)              +0x00 coded_side_data
                              +0x00 data                +0x08 media_type
                              +0x08 size                +0x10 codec_name
                                                        +0x18 codec_long_name
                                                        +0x20 metadata
                                                        +0x28 next
```

### 2.3 抓帧流程（0x17fc）

```
av_find_best_stream(VIDEO)
→ avcodec_alloc_context3 / parameters_to_context / open2
→ av_seek_frame(av_rescale(pos, tb.den, tb.num), BACKWARD) + flush
→ av_read_frame → send_packet → receive_frame（丢弃非目标流）
→ av_frame_alloc: 宽高 = 参数>0 ? 参数 : 源尺寸；format = 12 (AV_PIX_FMT_YUVJ420P)
→ sws_getContext/sws_scale（SWS_BILINEAR=4）
→ avcodec_find_encoder(7 = AV_CODEC_ID_MJPEG)
→ send_frame → receive_packet → malloc+memcpy → mmr_image
```

**证据**：`mov w6,#4`（SWS_BILINEAR）、`mov w8,#0xc`（YUVJ420P）、`mov w0,#7` 后紧跟
`avcodec_find_encoder`；并且 MJPEG 是唯一接受 YUVJ420P 的常见编码器，两者互相印证。

> 顺带确认：FFmpeg n7.0 的 `AV_CODEC_ID_MJPEG` 数值确实是 **7**
> （NONE=0, MPEG1=1, MPEG2=2, H261=3, H263=4, RV10=5, RV20=6, MJPEG=7），
> 用官方 `codec_id.h` 逐项计数核对过。

### 2.4 两处需要标注的疑点

1. **音频轨 +0x08 / +0x0c 的来源偏移**（`codecpar+0x94`、`codecpar+0x74`）
   在 FFmpeg 7.0 的 `AVCodecParameters` 里分别是 `ch_layout.u` 的高 32 位与 `color_trc`，
   语义上不可能是声道数/采样率；而在 6.x 布局里它们是 `channels` 一类字段。
   → **疑似作者按旧版头文件编译、或字段语义与命名不符**，已在头文件中标 `[存疑]`，
   需要运行时导出实际值验证。
2. **`get_frame_at_time` 的时间单位**：`av_rescale(pos, tb.den, tb.num)` 少了 `/1000`，
   若 Dart 传毫秒会偏移 1000 倍。→ 标 `[存疑]`，建议用一段 10 秒视频实测。

---

## 3. libmpvclient.so —— JNI + Dart FFI + SMB2

### 3.1 导出面（去掉 cJSON/Dart API 转发后）

| 地址 | 名称 | 作用 |
| --- | --- | --- |
| 0x4ed0 | `Java_..._newGlobalNativePtr` | `NewGlobalRef(env, obj)`（JNIEnv 索引 21） |
| 0x4ee0 | `Java_..._deleteGlobalNativePtr` | `DeleteGlobalRef`（索引 22） |
| 0x4ef0 | `Java_..._mpvTerminateDestroy` | 尾调用 `mpv_terminate_destroy` |
| 0x4ef8 | `Java_..._avJniSetJavaVM` | `GetJavaVM` → `av_jni_set_java_vm` |
| 0x4f54 | `FindFunctionPointer` | 16 字节步长遍历 `{name,ptr}` 表（给 Dart API DL 用） |
| 0x9db8 | `dart_wakeup_callback` | `Dart_PostCObject(port, {kNull})` 唤醒 Dart |
| 0x9e14 | `mpv_stream_method_done` | `lock(ctx+8) → signal(ctx+0x10) → unlock` |
| 0x9e44 | `register_mpv_stream_cb_dart` | `mpv_stream_cb_add_ro(mpv, proto, ud, cb)` |
| 0x9e50 | （Dart 流 open 回调） | 组 `Dart_CObject` → post → 等待 |
| 0xa524 | `mpv_stream_cb_add_ro_smb2` | 注册 `"smb2"` 协议 |

### 3.2 最重要的发现：SMB 凭据被塞进 URI

SMB 协议的 open 回调（0xa57c → 0xa63c）是这样解析 URI 的：

```c
strncpy(buf, uri + 7, strlen(uri) - 7);   // 跳过 "smb2://"
cJSON *root = cJSON_Parse(buf);           // 剩余部分必须是 JSON 对象
server = cJSON_GetObjectItem(root, "server")->valuestring;   // 必填
share  = cJSON_GetObjectItem(root, "share")->valuestring;    // 必填
path   = cJSON_GetObjectItem(root, "path")->valuestring;     // 必填
domain / username / password 可选
```

即真实播放地址是：

```
smb2://{"server":"192.168.1.10","share":"media","path":"/a/b.mkv",
        "username":"u","password":"p","domain":"WORKGROUP"}
```

**影响**：
- 这是把「结构化凭据」编码进 URL 的设计，配合 mpv 的日志（`mpv_logs.jsonl`）、
  `mpv_request_log_messages` 会**把明文密码写进日志文件**。
- 任何能读到日志/URI 的组件（包括崩溃报告、分享功能）都会拿到凭据。
- 已在 [`docs/09-security.md`](09-security.md) 补充为 S-11。

### 3.3 SMB 流的调用链

```
open  @0xa57c
 ├─ sub_a63c(uri)           解析 JSON → reex_smb_url(0x38)
 ├─ calloc(0x28)            流上下文
 ├─ sub_a7e4(ctx)
 │    smb2_init_context
 │    smb2_set_security_mode(1)
 │    smb2_set_timeout(8)
 │    smb2_set_domain(url->domain)
 │    smb2_set_password(url->password)
 │    smb2_set_user(url->username)
 └─ sub_a874(ctx)
      smb2_connect_share(server, share, user)
      smb2_open(path)
      smb2_fstat → 文件大小
 → info = { cookie=ctx, read=0xa9c4, seek=0xa96c, size=0xa954, close=0xaa9c }
```

读路径（0xa9c4）用 `smb2_get_max_read_size` 分块读；失败时会 `smb2_lseek` 重试一次，
再失败则销毁上下文并返回错误。关闭路径（0xaa9c）依次 `smb2_destroy_context`、
`cJSON_Delete`、两次 `free`。

### 3.4 Dart 自定义流协议

`register_mpv_stream_cb_dart(mpv, protocol, user_data)` 里 `user_data` 的首字段就是
`Dart_Port`。回调（0x9e50）的步骤：

```
calloc(1, 0x68)                 每流上下文（+0x00 port, +0x08 mutex, +0x10 cond, …）
组装 Dart_CObject 数组          [ "open"|"read"|"seek"|"size"|"close"|"cancel", cookie, … ]
pthread_mutex_lock(ctx+8)
Dart_PostCObject_DL(port, msg)
pthread_cond_wait(…)             ← Dart 处理完后调用 mpv_stream_method_done(ctx) 唤醒
pthread_mutex_unlock(ctx+8)
填写 mpv_stream_cb_info，cookie = ctx
```

方法名字符串在 `.rodata` 中可直接看到：`open`(0x394d)、`read`(0x3617)、`seek`(0x37ce)、
`size`(0x3852)、`close`(0x36ed)、`cancel`(0x38db)。

### 3.5 与 Kotlin 的关系（修正 docs/03 的说法）

`xyz.lhtls.mpv_client` **不是一个纯 JNI 插件**：Kotlin 侧（`d2/b.java`）还建了一条
同名 MethodChannel，只做三件事：

```
SurfaceTextureEntry.create         → 返回 textureId + surfacePtr
SurfaceTextureEntry.setDefaultBufferSize(width, height)
SurfaceTextureEntry.release
```

即 **Flutter 外接纹理（SurfaceTexture）→ ANativeWindow → mpv 渲染** 这条链路。
Dart 拿到 `surfacePtr` 后通过 FFI 交给 mpv（`wid` 之类参数），mpv 直接渲染到该 Surface。
【已在 docs/03 §4 追加说明】

---

## 4. 产出与验证

| 文件 | 内容 |
| --- | --- |
| `native/libmmr.h` | 完整 ABI：结构体 + 10 个导出函数 + 置信度标记 |
| `native/libmpvclient.h` | JNI/FFI 导出面 + SMB JSON 协议 + 流上下文布局 |
| `native/pseudo/libmmr.c` | 可直接对照阅读的伪 C（含每个函数的原始地址） |
| `native/pseudo/libmpvclient.c` | SMB 流与 Dart 流回调的伪 C |
| `native/disasm/` | 原始反汇编文本（mmr.txt / mpvclient.txt） |

### 验证建议（需要设备）

1. **mmr 时间单位**：准备 10 秒视频，调用 `get_frame_at_time(r, 5000, 0, 0)`：
   若返回的是第 5 秒画面 → 传毫秒且内部有误；若是第 5000 秒（失败/黑帧）→ 说明需要秒。
2. **音频字段**：对一首 2 声道/44.1 kHz 的 flac 调 `get_audio_track`，
   打印 +0x08/+0x0c，与预期 (2, 44100) 对比即可判定 [存疑] 字段真实语义。
3. **SMB 凭据落盘**：播放一次 SMB 视频后 `adb shell run-as` 读取 `mpv_logs.jsonl`，
   确认密码是否出现（静态推断为"会出现"）。

---

## 5. 结论

- 两个库合计不到 60 KB，但承担了「元数据/封面/截帧」与「mpv↔Dart↔SMB」两件核心工作，
  是理解 Reex 播放链路的关键。
- `libmmr` 可以被**完整重写**（接口与行为已知）；`libmpvclient` 的 SMB 与流协议也可重写，
  只有 Dart API DL 的转发表属于机械代码。
- 两个值得向上游反馈的问题：音频字段偏移（`[存疑]`）与 SMB 凭据进入 URI/日志（S-11）。
