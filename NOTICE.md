# NOTICE — 权利归属与第三方组件

## 1. 原应用

- 应用名称：Reex
- 包名：`xyz.re.player.ex`
- 版本：1.8.9 (versionCode 2142)
- 上游作者线索（APK 内自述）：Dart 包名前缀 `re_player_ex`；Java 包 `xyz.lhtls.mpv_client`；
  应用内链接 `https://afdian.net/a/lntls`（爱发电）。版权归原作者所有。

本仓库是对该 APK 的**静态分析产物**，用于互操作研究、安全审计与学习。`decompiled/` 与 `dart/`
目录中的内容属于对原作品的演绎，不因本仓库的 LICENSE 而改变其版权归属。若原作者要求，
可随时删除相应目录。

## 2. 原生库

| 组件 | 许可证 | 本 APK 中的位置 |
| --- | --- | --- |
| mpv | LGPL-2.1+ / GPL-2.0+（视构建选项） | `lib/arm64-v8a/libmpv.so`，许可全文 `assets/flutter_assets/license/libmpv` |
| libplacebo | LGPL-2.1+ | `libplacebo.so` |
| FFmpeg (libav*) | LGPL-2.1+ / GPL（视编译选项） | 8 个 `libav*/libsw*.so` |
| libsmb2 | LGPL-2.1+ | `libsmb2.so`，许可全文 `assets/flutter_assets/license/libsmb2` |
| SQLite | Public Domain | `libsqlite3.so` |
| Flutter engine / Dart | BSD-3-Clause | `libflutter.so` |
| AndroidX / Kotlin | Apache-2.0 | `classes.dex` |

## 3. Dart/pub 依赖

应用内置的 `assets/flutter_assets/NOTICES.Z`（1.85 MB，解压后）完整列出了全部 1055 个许可条目，
其中可直接识别的 pub 包共 100+ 个（见 `docs/08-appendix.md`）。所有包均遵循其各自许可证
（多为 MIT/BSD/Apache-2.0）。
