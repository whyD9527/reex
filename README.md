# Reex 1.8.9 — 完整逆向工程与开源重建

> 目标 APK：`arm64-v8a-release-v1.8.9 (1).apk`（21.1 MB，仅 arm64-v8a）
> 包名：`xyz.re.player.ex` · 应用名：**Reex** · versionCode 2142 · minSdk 23 / targetSdk 33 / compileSdk 34
> 引擎：Flutter 3.19.x（Dart **3.3.3** stable，2024-03-26）· 业务代码 **AOT 编译且已混淆**

本仓库由一名逆向工程分析者（AI 代理）从零完成：不依赖任何线上源码，全部结论来自对 APK 的静态分析。
仓库同时包含**可重建的反编译工程**（apktool 资源 + smali + jadx Java）、**Dart AOT 结构化还原结果**、
以及**逐项分析文档**，目标是让这个闭源播放器变成一份可以研究、修改、重新打包的开源资料。

---

## 1. 这个 App 是什么

Reex 是一个 **基于 libmpv 的本地/网络视频播放器**，Flutter 编写 UI，原生层用 mpv + FFmpeg + libplacebo 渲染，
用 libsmb2 直接挂载 SMB 共享，用 SQLite(drift) 做媒体库，支持：

- 本地媒体库（MediaStore 扫描、封面提取、播放历史、收藏、播放列表）
- 网络协议：HTTP(S)、SMB2、FTP/FTPS、SFTP、WebDAV、RTSP/RTMP/UDP 等
- 作为系统播放器被其它 App 以 `ACTION_VIEW` / `ACTION_SEND` 拉起（Manifest 中注册了 116 条扩展名 pathPattern）
- 画中画（PiP）、TV/Leanback、耳机插拔事件、后台播放前台服务
- 完整的中文/英文界面（Dart 侧文案，见 [docs/06-dart.md](docs/06-dart.md)）

---

## 2. 逆向方法与工具链

| 阶段 | 工具 | 产出 |
| --- | --- | --- |
| 解包 | Python `zipfile` | 562 个条目，`classes.dex` 1.7 MB，15 个 arm64 `.so` |
| 资源/清单 | **apktool 2.10.0**（OpenJDK 21） | 完整 `res/`、可读 `AndroidManifest.xml`、`smali/` |
| Java 层 | **jadx 1.5.1**（Maven Central 按 POM 递归解析依赖） | 1209 个 `.java`（R8 混淆后仍可读） |
| 原生层 | 自写 ELF 解析器 + strings + DT_NEEDED/SONAME | 库版本、依赖图、JNI 导出符号 |
| Dart 层 | **blutter**（自编译 Dart 3.3.3 AOT runtime）+ 对象池转储 | 类/函数/对象池、伪汇编、Frida 模板 |
| 校验 | apktool 重打包 + apksigner | 可安装的重新签名 APK |

> 说明：Dart AOT 快照是**机器码 + 序列化对象堆**，工业界没有能把 Dart AOT 完整还原成可编译源码的工具。
> 本仓库对 Dart 层给出的是**结构级还原**（类、字段、方法、字符串、调用关系、反汇编），
> 而不是「假装」能 `flutter build` 的源码——后者是不诚实的。详见 [docs/06-dart.md](docs/06-dart.md)。

---

## 3. 目录结构

```
Reex-Reverse/
├── README.md                    本文件
├── LICENSE                      分析成果（文档/脚本）许可：MIT
├── NOTICE.md                    原应用与第三方组件权利声明
├── docs/
│   ├── 01-overview.md           总览与技术栈
│   ├── 02-manifest.md           AndroidManifest 逐项分析
│   ├── 03-architecture.md       整体架构与跨语言调用链
│   ├── 04-native.md             原生库清单、版本、JNI 接口
│   ├── 05-java.md               Java 层逐类分析（含通道协议）
│   ├── 06-dart.md               Dart AOT 还原：类/方法/字符串/依赖
│   ├── 07-rebuild.md            重打包、签名、安装、差异校验
│   ├── 08-appendix.md           资源、权限、依赖、字符串附录
│   ├── 09-security.md           安全与合规审计（含 CVE / LGPL / S-01..S-11）
│   ├── 10-native-reimpl.md      自写原生库的完整还原（libmmr / libmpvclient）
│   ├── 11-protocol-map.md       **机器码级协议图谱**（11 通道 → 方法 → 函数地址）
│   ├── 12-dynamic-playbook.md   真机动态验证 Playbook（配合 frida/）
│   ├── 13-dynamic-results.md    **真机验证结果**（Redmi K90 / Android 17）
│   └── 14-native-stack-upgrade.md  **原生栈升级评估**（版本对比 / ABI / 16KB）
├── decompiled/
│   ├── apktool/                 apktool 全量反编译（manifest/res/smali/assets/lib）
│   └── jadx-src/                jadx 反编译的 Java 源码（1209 个文件）
├── dart/
│   ├── README.md                说明
│   ├── pubspec.reconstructed.yaml  反推的依赖清单
│   └── blutter/                 **blutter 实测输出**：
│       ├── pp.txt               46,540 个对象池条目 / 762 类 / 953 字段 / 7,541 字符串
│       ├── objs.txt             对象实例树
│       ├── asm/                 544 个反汇编文件（1,858 个带地址的函数）
│       ├── blutter_frida.js     Frida 脚本（类/函数地址表）
│       └── strings_zh.txt       344 条中文界面文案
├── native/                      原生层：依赖图、版本、**重建的 C 头与伪代码**
│   ├── libmmr.h                 媒体元数据检索器 ABI（结构体+10 个函数；该库在本版本未被调用）
│   ├── libmpvclient.h           JNI/FFI/SMB2 协议 ABI
│   ├── pseudo/                  等价重写的伪 C（带原始地址注释）
│   ├── disasm/                  两个自写库的完整反汇编文本
│   └── graph.md                 库依赖图（Mermaid）
├── build/                       重打包验证产物（已签名 APK + 校验结果）
├── patches/                     **加固补丁流水线**（allowBackup / http_header / 明文流量）
│   └── out/                     加固并签名的 APK
├── frida/                       动态验证脚本（hooks.js）
└── tools/                       一键复现脚本 + blutter 编译补丁说明
```

---

## 4. 技术栈（从 APK 中实证得到）

**Flutter/Dart 侧**（来自 `assets/flutter_assets/NOTICES.Z` 的 1055 个许可块与 `libapp.so` 符号）：

- 状态管理：`flutter_riverpod`（+ `riverpod_analyzer_utils`、`custom_lint`）
- 网络：`dio`、`pointycastle`（加密）、`webdav_client`、`ftpconnect`
- 数据库：`drift` + `sqlite3` + `sqlparser`
- UI：`eva_icons_flutter`、`flutter_colorpicker`、`loading_animations`、`sliver_tools`、`scrollable_positioned_list`、`nested`、`bot_toast`
- 工具：`archive`、`image`、`lpinyin`（拼音排序）、`fuzzywuzzy`、`uuid`、`rxdart`、`strings`/`string_splitter`、`etc_decoder`（字幕）、`vibration`、`flutter_displaymode`、`device_info_plus`、`package_info_plus`
- 本地插件：`mpv_client`（`xyz.lhtls.mpv_client`，Dart↔JNI↔libmpv 的绑定层）

**Android 原生侧**：Kotlin（R8 混淆）+ Flutter embedding + `androidx.core.splashscreen` + `FileProvider`。

**C/C++ 原生库**：

| 库 | 说明 | 版本线索 |
| --- | --- | --- |
| `libmpv.so` | mpv 播放核心 | FFmpeg git-2024-03-27 / clang 17（mpv-android 官方构建链） |
| `libplacebo.so` | GPU 视频渲染（libmpv 依赖） | API 6.338.0 / 7.347.0 |
| `libavcodec/libavformat/libavfilter/libavutil/libavdevice/libswresample/libswscale` | FFmpeg 7.0-dev | `FFmpeg version git-2024-03-27-1ad0e81f38` |
| `libsmb2.so` | SMB2/3 客户端 | 3.1.1 |
| `libsqlite3.so` | SQLite | 3.45.1 |
| `libmmr.so` | 作者自写的媒体元数据/封面读取库（11 KB）；**全 APK 无任何代码引用，属遗留死代码**（见 docs/04 §2、docs/10 §2） | 链接 FFmpeg |
| `libmpvclient.so` | 作者自写的 mpv JNI 桥（48 KB，`xyz.lhtls.mpv_client.MPVJniUtils`） | 含 smb2 流回调 |
| `libflutter.so` | Flutter 引擎 | Dart 3.3.3 stable |

---

## 5. 关键发现（结论速览）

1. **Dart 业务代码已混淆**：类/函数名被替换为 2–3 字符符号（如 `_TD@82050165`），
   但**字符串常量、对象池结构、调用图完整保留**，可直接还原功能语义。
2. **Java 层也被 R8 混淆**，只有 5 个保留类：`MainActivity`、`ReexPlaybackService`、
   `AudioManagerChannel`、`MPVJniUtils` 及一个内部类；其余 2178 个类均为 `a/b/c…` 短名。
3. **跨语言协议清晰**：Dart 与 Kotlin 之间共有 11 条自定义 MethodChannel（10 条在 `e2` 插件包 + `AudioManagerChannel`，见 docs/03），
   Dart 与 libmpv 之间通过 FFI/JNI（`xyz.lhtls.mpv_client`）通信。
4. **播放器是系统级播放器**：Manifest 注册了 `http/https/smb/ftp/sftp/rtsp/rtmp/udp` 等 scheme 与
   116 条扩展名匹配规则，可被浏览器、文件管理器直接唤起。
5. **可重打包**：apktool 反编译产物已通过 `apktool b` 重建并签名（见 docs/07），
   证明资源与 smali 完整无损。
6. **Dart 层已完整结构化还原**：blutter（自编译 Dart 3.3.3 运行时）成功解析 AOT 快照，
   导出 46,540 个对象池条目、762 个类、953 个字段、7,541 条字符串与 544 份反汇编。
7. **还原出作者的原始工程路径**：`file:///G:/MyProject/Reex/re_player_ex/...`，
   Dart 包名确认为 `re_player_ex`，并保留了一条源码路径 `package:re_player_ex/utils/ffi_io.dart`。
8. **11 条通道在 Dart 机器码中全部定位**：自写 PP(x27) 引用扫描器扫了 141 万条指令、
   7.2 万处对象池引用，得到「通道 → 方法名 → 函数地址」的完整映射（docs/11），
   并发现 Java 侧未暴露的方法（如通知 API 的 14 个 key、权限通道的 4 个细分方法）。
9. **两个自写原生库已还原到可重写程度**：`libmmr`（元数据/封面/截帧，10 个导出函数）
   与 `libmpvclient`（JNI + Dart FFI + SMB2 流）。但**真机验证发现两者的 SMB/元数据路径都没被调用**：
   - `libmmr` 全 APK 零引用（死代码）；
   - 原生 SMB 流（`mpv_stream_cb_add_ro_smb2`）同样未被调用，**SMB 实际由 Dart 通过 libsmb2 FFI 实现**。
10. **真机动态验证（Redmi K90 / Android 17 / KernelSU）已完成**：
   - 抓到 `loadfile smb2://{... "password":"SEKRET789" ...}` → **S-11 确认**；
   - 导出 `reex.sqlite`（user_version=10），`network_accounts.password TEXT` → **S-07 确认**；
   - `extended_playlist_items.http_header` → S-03 会持久化到磁盘；
   - `libmmr` 的截帧/音频字段实测返回 NULL / 0（与其编译头文件版本不符的旁证）。

---

## 6. 快速开始

```bash
# 1) 看清单
cat decompiled/apktool/AndroidManifest.xml

# 2) 看 Java 层入口
cat decompiled/jadx-src/xyz/re/player/ex/MainActivity.java

# 3) 重打包（需要 apktool + JDK17+）
apktool b decompiled/apktool -o Reex-repacked.apk
# 4) 签名（需要 Android SDK build-tools）
apksigner sign --ks my.keystore --out Reex-signed.apk Reex-repacked.apk
```

---

## 7. 许可与声明

- `docs/`、`tools/`、`README`、以及本次分析新生成的脚本/清单：**MIT**（见 LICENSE）。
- `decompiled/`、`dart/` 中的内容源自原应用，**版权归原作者**；本仓库仅用于安全研究、互操作与学习，
  不构成对原应用代码的再许可。第三方组件（FFmpeg/mpv/libplacebo/libsmb2/SQLite/Flutter/Dart 及所有 pub 包）
  仍适用各自许可证，详见 `NOTICE.md`。
- 请勿将本项目用于绕过付费、传播盗版内容或任何违法用途。
