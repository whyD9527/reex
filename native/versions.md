# 原生库版本与构建信息

| 库 | 版本证据 | 编译器/链接器 |
| --- | --- | --- |
| FFmpeg (libavcodec 等 8 个) | `FFmpeg version git-2024-03-27-1ad0e81f38`；ABI 符号 `LIBAVCODEC_61 / LIBAVFORMAT_61 / LIBAVUTIL_59 / LIBSWSCALE_8` | clang 17.0.2 + LLD 17.0.2 (Android r487747d) |
| libmpv | 链接 av*、placebo、OpenSLES、EGL；无独立版本串 | 同上 |
| libplacebo | `libplacebo %s (API v%d)`；API 6.338.0 / 7.347.0 | 同上 |
| libsmb2 | 3.1.1 | 同上 |
| libsqlite3 | 3.45.1 | clang 14.0.7 + LLD 14.0.7 |
| libmmr (自写) | 无版本串，导出 media_metadata_retriever_* | clang 12.0.8 + LLD 12.0.8 (Android r416183b1) |
| libmpvclient (自写) | 无版本串，导出自定义 JNI/Dart FFI | clang 12.0.8 + LLD 12.0.8 |
| libflutter | Dart 3.3.3 (stable) 2024-03-26, `android_arm64` | Flutter 官方构建链 |
| libapp | Dart AOT，SnapshotBuildId 见 ELF 符号 | Flutter AOT (gen_snapshot) |

## 依赖关系

见 [graph.md](graph.md)（Mermaid）与 [graph.md.json](graph.md.json)（机器可读）。

## 关键结论

- **两套构建工具链**：mpv/FFmpeg/placebo/smb2 用 clang 17（Android r487747d，与 mpv-android 官方 CI 一致）；
  作者自写的 `libmmr`/`libmpvclient` 用 clang 12.0.8（Android r416183b1，较老的 NDK 23）。
  说明作者是**直接复用 mpv-android 的预编译产物**，自己只写了两层薄薄的原生胶水。
- **sqlite3 用 clang 14**（NDK 25），与 `sqlite3_flutter_libs` 的官方预编译版本一致。
- `libmpvclient.so` 同时依赖 `libmpv.so` 与 `libsmb2.so`，并实现 `mpv_stream_cb_add_ro_smb2`，
  是 SMB 直连播放的关键。
