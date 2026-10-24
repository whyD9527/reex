# 04 · 原生层分析（arm64-v8a，15 个 .so）

> 数据来源：自写 ELF64 解析器（`tools/elf_info.py`）读取 `.dynsym`/`.dynamic`/`.comment`，
> 以及 `strings` 扫描与 capstone 反汇编。

## 1. 总表

| 库 | 大小 | SONAME | DT_NEEDED（精简） | 版本线索 |
| --- | --- | --- | --- | --- |
| `libapp.so` | 7.73 MB | — | — | Dart AOT 快照（Dart 3.3.3） |
| `libflutter.so` | 10.55 MB | libflutter.so | libc libdl libm libandroid libEGL libGLESv2 liblog libjnigraphics | Dart 3.3.3 (stable) 2024-03-26 |
| `libmpv.so` | 5.12 MB | libmpv.so | avcodec avfilter avformat avutil placebo swresample swscale android OpenSLES EGL m z dl | mpv（FFmpeg git-2024-03-27 构建链） |
| `libmpvclient.so` | 48 KB | libmpvclient.so | mpv smb2 placebo av* log m dl | 作者自写，clang 12.0.8 |
| `libmmr.so` | 11.6 KB | libmmr.so | av* log m dl | 作者自写，clang 12.0.8（r23b）；**无任何代码引用，死代码** |
| `libplacebo.so` | 1.31 MB | libplacebo.so | m dl c | API 6.338.0 / 7.347.0 |
| `libavcodec.so` | 12.16 MB | libavcodec.so | swresample avutil android z dl | FFmpeg `git-2024-03-27-1ad0e81f38` |
| `libavformat.so` | 2.27 MB | libavformat.so | avcodec avutil z | 同上 |
| `libavfilter.so` | 3.85 MB | libavfilter.so | swscale avformat avcodec swresample avutil | 同上 |
| `libavutil.so` | 702 KB | libavutil.so | m android dl | 同上 |
| `libavdevice.so` | 8.8 KB | libavdevice.so | avformat avutil | 同上（几乎空壳） |
| `libswresample.so` | 95.9 KB | libswresample.so | avutil | 同上 |
| `libswscale.so` | 576 KB | libswscale.so | avutil | 同上 |
| `libsmb2.so` | 257 KB | libsmb2.so | m dl | **3.1.1** |
| `libsqlite3.so` | 1.33 MB | libsqlite3.so | m dl | **3.45.1** |

所有库均为 clang/LLD 交叉编译的 Android arm64 产物，`.note.android.ident` 存在。
FFmpeg 系列带 `LIBAVCODEC_61`/`LIBAVFORMAT_61`/`LIBAVUTIL_59`/`LIBSWSCALE_8` 版本符号，
与 FFmpeg 7.0 的 ABI 号一致（2024-03 主干）。

## 2. `libmmr.so` —— 自写「媒体元数据读取器」（**本版本未使用**）

> ⚠️ **重要更正**：遍历 `classes.dex`、`libapp.so`、`libmpvclient.so` 的全部字节，
> **找不到任何 `mmr` 字样**（连 `libmmr` / `mmr.so` / `loadLibrary("mmr")` 都没有）。
> 这个库被打包进来但从未被加载或调用，属于遗留死代码。
>
> Reex 实际用 **mpv 自己的属性**完成元数据/封面/截图：
> `metadata`、`track-list`、`chapters`、`albumart`、
> `screenshot-to-file` / `screenshot-format` / `screenshot-directory` / `screenshot-template`
> （见 `dart/blutter/strings.txt`）。
> 因此下面的 ABI 描述仍是对该库的准确还原，但**不代表线上行为**。

导出符号（全部为 C ABI，无 C++ 修饰）：

```
media_metadata_retriever_create
media_metadata_retriever_release
media_metadata_retriever_get_metadata      // 标签字典（title/artist/album/...）
media_metadata_retriever_get_attached_image // 内嵌封面
media_metadata_retriever_get_duration
media_metadata_retriever_get_video_track    // 视频轨参数
media_metadata_retriever_get_audio_track    // 音频轨参数
media_metadata_retriever_get_subtitle_track // 字幕轨列表
media_metadata_retriever_get_frame_at_time  // 指定时间点截帧（缩略图）
media_image_release
```

实现方式（从导入符号推断）：直接调用 FFmpeg 的
`avformat_open_input → avformat_find_stream_info → av_find_best_stream`，
用 `avcodec_* / av_read_frame / av_seek_frame` 解码，再用 `sws_getContext / sws_scale` 缩放为位图。
即**替代 Android 的 `MediaMetadataRetriever`**，以支持 FFmpeg 才认识的容器（rmvb、ts、m2ts…）。
这也是它只依赖 `libavcodec/libavformat/libavutil/libswscale` 而不依赖 `libandroid` 的原因。

## 3. `libmpvclient.so` —— Dart ↔ mpv 的桥

### 3.1 结构

| 能力 | 证据 |
| --- | --- |
| Dart FFI 原生扩展 | 导入 `Dart_InitializeApiDL` 及全部 `Dart_*_DL` 函数指针 |
| 事件回传 Dart | `dart_wakeup_callback`（注册为 mpv 的 wakeup 回调）+ `Dart_PostCObject_DL` |
| JNI | `Java_xyz_lhtls_mpv_1client_MPVJniUtils_*`（4 个）、`av_jni_set_java_vm` |
| JSON 序列化 | 内置 cJSON（`cJSON_CreateObject` … `cJSON_PrintUnformatted`） |
| mpv 流协议扩展 | `mpv_stream_cb_add_ro`、`register_mpv_stream_cb_dart` |
| SMB2 流 | `mpv_stream_cb_add_ro_smb2` + `smb2_*` 全套 |
| 生命周期 | `mpv_terminate_destroy`（JNI 调用）、`mpv_stream_method_done` |

### 3.2 两种自定义流

1. **Dart 回调流**（`register_mpv_stream_cb_dart`）：mpv 需要数据时，通过 `Dart_PostCObject`
   把 `open/read/seek/close/cancel` 请求发到 Dart isolate，Dart 返回字节。
2. **SMB2 原生流**（`mpv_stream_cb_add_ro_smb2`）：完全在 C 侧完成，参数从
   `smb://[domain;]user:pass@server/share/path` 解析（字符串表里有 `server/share/domain/username/password/path`），
   随后 `smb2_init_context → smb2_set_security_mode → smb2_connect_share → smb2_open → smb2_read/smb2_lseek → smb2_fstat`。

这条路径让 mpv 可以直接播放 NAS 上的视频，无需把文件下载到本地，也无需挂载 CIFS。

### 3.3 mpv 事件通道

Dart 侧字符串里出现 `mpv_logs.jsonl`、`mpv_wait_event`、`mpv_observe_property`、
`mpv_command_async`、`mpv_set_property_async` 等，说明 Dart 通过 FFI 直接操作 mpv 句柄，
事件（`property-change`、`log-message`、`end-file`…）经 wakeup 回调 → native port → Dart。

## 4. mpv 侧配置面（Dart 代码实际用到的属性）

从 `libapp.so` 字符串可确认的属性名：

```
video-rotate video-unscaled video-zoom video-pan-x/y video-scale-x/y video-aspect-override video-params video-out-params
audio-delay audio-file-auto sub-delay sub-font sub-font-size sub-bold sub-italic sub-border-size sub-border-color
sub-color sub-text sub-auto sub-ass-override
seekable seekable-ranges video-add audio-add sub-add loadfile seek
```

以及命令/事件：`mpv_command_async`、`mpv_set_property_async`、`mpv_get_property_async`、
`mpv_observe_property`、`mpv_hook_add`/`mpv_hook_continue`、`mpv_request_log_messages`。

## 5. 渲染与音频

- `libmpv.so` 依赖 `libEGL.so` + `libandroid.so` + `libOpenSLES.so`：
  视频走 EGL/GLES（libplacebo 的 gpu 渲染器），音频走 OpenSL ES。
- **没有** `libmediandk.so` 依赖：说明**未启用 MediaCodec 硬件解码**，解码由 FFmpeg 软解完成
  （与 rmvb 等格式需求一致，但功耗较高）。
- `libavdevice.so` 仅 8.8 KB：构建时禁用了绝大多数设备输入，仅保留 ABI 占位。

## 6. 体积分布与裁剪情况

```
17.3%  libavcodec + swscale + swresample（解码与缩放）
12.3%  libflutter.so
49.9%  libmpv + libplacebo + 其余 av*（播放与渲染）
 8.9%  libapp.so（Dart 业务）
 1.9%  libsqlite3 + libsmb2 + 自写库
```

未做 ABI 拆分（仅 arm64），未做 symbol strip 之外的裁剪；`libavdevice` 已被裁到最小。

## 7. 许可合规

APK 自带两份许可全文（`assets/flutter_assets/license/libmpv`、`license/libsmb2`，均为 LGPL-2.1），
符合 LGPL 动态链接分发要求。FFmpeg 未附独立许可文件，但其组件在 NOTICES 中列出。
