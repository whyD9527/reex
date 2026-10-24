# 01 · 总览与技术栈

## 1. 目标样本

| 项 | 值 |
| --- | --- |
| 文件名 | `arm64-v8a-release-v1.8.9 (1).apk` |
| 大小 | 22,097,606 字节（21.07 MiB） |
| SHA-256 | `d71d4ac33ab8f1ebe9745bc0eb5660a570226d469a8dcd802be0a6f4a3a483ff` |
| MD5 | `d9e8f6878ccb3e4b2c95b861c171c71a` |
| 包名 | `xyz.re.player.ex` |
| 应用名 | Reex |
| versionName / versionCode | 1.8.9 / 2142 |
| minSdk / targetSdk / compileSdk | 23 / 33 / 34 |
| ABI | 仅 arm64-v8a |
| 签名 | v1 (JAR, `META-INF/CERT.RSA`) + APK Signature Scheme v2/v3（8184 字节签名块） |
| 构建工具 | Android Gradle Plugin **7.3.0**（`META-INF/com/android/build/gradle/app-metadata.properties`） |
| Zip 条目 | 562 |

## 2. 包体构成

| 部分 | 大小 | 内容 |
| --- | --- | --- |
| `lib/arm64-v8a/` | 44.0 MiB（压缩后） | 15 个 `.so`：mpv、libplacebo、FFmpeg(8)、libsmb2、sqlite3、libmmr、libmpvclient、libflutter、libapp |
| `classes.dex` | 1.70 MiB | Android 壳层 + Flutter embedding + 插件（R8 混淆） |
| `resources.arsc` | 301 KiB | 资源表（多语言、主题、图标） |
| `res/` | 297 KiB | 资源文件 |
| `assets/flutter_assets/` | 394 KiB | Dart 资产：证书、字体、图标字体、许可、着色器 |
| `kotlin/` + `DebugProbesKt.bin` | 30 KiB | Kotlin 协程调试探针（未裁剪） |

## 3. 运行时架构（一句话）

```
Android UI 线程
   └── MainActivity (FlutterActivity, Kotlin)
         └── FlutterEngine
               ├── MethodChannel: 11 条自定义通道 → Kotlin 插件（10 个类 + AudioManagerChannel）
               ├── Dart 业务层（libapp.so，AOT+混淆，Riverpod 架构）
               │     ├── dio / ftpconnect / webdav_client  →  网络与 WebDAV/FTP
               │     ├── drift + sqlite3                  →  媒体库数据库
               │     └── mpv_client (FFI/JNI)             →  libmpvclient.so → libmpv.so
               │                                                  ├── libsmb2.so（smb:// 流）
               │                                                  ├── libplacebo.so + EGL（渲染）
               │                                                  └── FFmpeg（解封装/解码）
               └── FlutterActivity 的 SurfaceView/TextureView 承载 mpv 视频输出
```

## 4. Flutter / Dart 版本判定

`libflutter.so` 的 `.rodata` 中存在引擎版本串：

```
3.3.3 (stable) (Tue Mar 26 14:21:33 2024 +0000) on "android_arm64"
```

Dart 3.3.3 对应 **Flutter 3.19.6**（2024-04 稳定版），与 APK 内 2024-03-27 的 FFmpeg git 快照时间吻合。
`libapp.so` 的 ELF 导出符号确认这是标准的 AOT 产物：

```
_kDartVmSnapshotData            0x200    15632
_kDartVmSnapshotInstructions    0x1e0000 91488
_kDartIsolateSnapshotData       0x3f40   1926160
_kDartIsolateSnapshotInstructions 0x1f6580 5647808
_kDartSnapshotBuildId           0x1c8    32
```

## 5. 混淆情况

| 层 | 是否混淆 | 证据 |
| --- | --- | --- |
| Java/Kotlin（DEX） | 是（R8） | 2183 个类中 2178 个是 `a/b/c…`、`e2/f0` 之类短名；仅 Manifest 引用的 5 个类保留原名 |
| Dart（libapp.so） | 是（`--obfuscate`） | 类名/私有名形如 `_TD@82050165`、`_qG@314475501`；**字符串常量未混淆** |
| 资源 | 否 | `resources.arsc` 完整，`res/` 可直接反编译 |
| 原生库 | 符号部分保留 | mpv/FFmpeg 导出完整；`libmmr.so` 仅 11 KB（作者自写） |

## 6. 分析工具链（可复现）

| 工具 | 版本 | 获取方式（本仓库实际使用） |
| --- | --- | --- |
| Python | 3.12.14 | DSH 内置运行时 |
| OpenJDK | 21.0.12 (Microsoft Build) | `aka.ms/download-jdk` |
| apktool | 2.10.0 | Maven Central `org.apktool:apktool-cli` |
| jadx | 1.5.1 | Maven Central `io.github.skylot:jadx-cli` + 106 个传递依赖（脚本按 POM 递归解析） |
| blutter | main (2026) | GitHub `worawit/blutter`，用 MSYS2 UCRT64 g++ 16.2 + CMake 编译 Dart 3.3.3 runtime |
| ELF/APK 解析 | 自写 Python | `tools/` |
