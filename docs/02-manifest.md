# 02 · AndroidManifest 逐项分析

> 来源：`decompiled/apktool/AndroidManifest.xml`（apktool 解码，资源 ID 已还原为名字）

## 1. 根元素

```xml
<manifest package="xyz.re.player.ex"
          android:versionCode="2142"
          android:versionName="1.8.9"
          android:compileSdkVersion="34"
          android:compileSdkVersionCodename="14">
  <uses-sdk android:minSdkVersion="23" android:targetSdkVersion="33"/>
  ...
```

- `compileSdk 34` 但 `targetSdk 33`：典型的 Flutter 3.19 + AGP 7.3 工程，未跟进 Android 14 行为变更。
- `minSdk 23`（Android 6.0），与 Flutter 3.19 的下限一致。

## 2. 权限

| 权限 | maxSdk | 用途推断 |
| --- | --- | --- |
| `READ_EXTERNAL_STORAGE` | 32 | 媒体库扫描（旧系统） |
| `READ_MEDIA_AUDIO` / `READ_MEDIA_VIDEO` | — | Android 13+ 细分媒体权限 |
| `WRITE_EXTERNAL_STORAGE` | 29 | 旧系统下载/缓存 |
| `MANAGE_EXTERNAL_STORAGE` | — | “所有文件访问”（Android 11+），用于任意目录播放 |
| `INTERNET` | — | 网络流 / WebDAV / SMB |
| `FOREGROUND_SERVICE` | — | `ReexPlaybackService` 后台播放 |
| `CHANGE_WIFI_MULTICAST_STATE` | — | **DLNA/SSDP 发现**（多播锁） |
| `SYSTEM_ALERT_WINDOW` | — | 悬浮窗（画中画/小窗播放的兜底实现） |
| `WAKE_LOCK` | — | 播放时保持唤醒 |
| `BLUETOOTH` | — | 蓝牙耳机媒体按键 |
| `VIBRATE` | — | 触感反馈（Dart 侧 `vibration` 包） |

自定义权限：`xyz.re.player.ex.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION`（`protectionLevel=signature`），
由 androidx.core 在 `targetSdk>=33` 时自动注入，用于保护动态注册的广播接收器。

## 3. 组件

### 3.1 `xyz.re.player.ex.MainActivity`（exported）

- 继承链：`io.flutter.embedding.android.e`（jadx 视角）→ 实际为 `FlutterActivity`。
- `launchMode="singleTask"`，`configChanges` 覆盖 density/fontScale/keyboard/orientation/screenSize/uiMode，
  避免旋转与分屏重建 Flutter 引擎。
- `supportsPictureInPicture="true"` + `resizeableActivity="true"`：系统级 PiP。
- `theme="@style/JetpackSplashTheme"`：**androidx.core.splashscreen**（版本 `1.0.0-rc01`，见 META-INF）。
- Meta-data：
  - `flutterEmbedding = 2`（Flutter v2 embedding）
  - `io.flutter.embedding.android.NormalTheme` → `@style/NormalTheme`
  - `io.flutter.network-policy` → `@xml/network_security_config`

**Intent filters（4 组）**：

1. **启动器**：`MAIN` + `LAUNCHER` + `LEANBACK_LAUNCHER`（TV 桌面）。
2. **流媒体协议**：`VIEW` + `BROWSABLE`，scheme `rtmp/rtmpe/rtmps/rtp/rtsp/mms/mmsh/icyx/httplive/udp`，mime `video/*`。
3. **本地/网络文件**：scheme `file/ftp/ftps/sftp/content/http/https/smb`，mime 包含
   `video/* audio/* */rmvb */avi */mkv application/x-matroska application/vnd.rn-realmedia*` 等 20+ 个。
4. **按扩展名匹配**：`pathPattern` 覆盖 **116 条**（58 个扩展名，大小写各一套），从 `3g2` 到 `xesc`，
   包含 `rmvb/mkv/avi/flv/ts/m2ts/wmv/vob/webm` 等 —— 说明它被设计成系统默认播放器。
5. **文本分享**：`SEND` + `text/plain`（分享链接/磁力链时唤起）。

> 注：第 3、4 组 filter 同时声明 `host="*"` 与 `pathPattern`，这在 AOSP 上合法但会带来匹配歧义，
> 属于「能多匹配就多匹配」的激进注册策略。

### 3.2 `xyz.re.player.ex.ReexPlaybackService`

- `exported="false"`，`foregroundServiceType="0x00000002"`（= `mediaPlayback`）。
- 代码仅 40 行：静态保存 `Notification`，`onCreate` 时 `startForeground(741852963, n)`，
  `onDestroy` 调 `stopForeground(1)`。真正的播放控制由 Dart/mpv 完成，此服务只负责「保活」。
- 通知 ID `741852963` 是随手敲的数字串。

### 3.3 `io.flutter.plugins.urllauncher.WebViewActivity`

- `exported="false"`，Flutter `url_launcher` 插件的应用内浏览器。

### 3.4 `androidx.core.content.FileProvider`

- authority：`xyz.re.player.ex.fileprovider`，`grantUriPermissions="true"`。
- 路径配置（`res/xml/*.xml`）：
  - `cache-path` → `AudioCovers/`、`VideoCovers/`（把提取的封面分享出去）
  - `files-path` → `image_provider/`（分享图片）
- 说明应用会把媒体封面写入缓存目录，再以 `content://` 分享给其它应用。

### 3.5 `<queries>`

```xml
<intent><action android:name="android.media.browse.MediaBrowserService"/></intent>
```
用于 Android 11+ 包可见性：查询系统中其他媒体浏览器服务（Android Auto / 车机 / 手表）。

## 4. application 属性

```xml
<application android:label="Reex"
             android:icon="@mipmap/ic_launcher"
             android:roundIcon="@mipmap/ic_launcher_round"
             android:banner="@mipmap/reex_banner"
             android:extractNativeLibs="true"
             android:usesCleartextTraffic="true"
             android:networkSecurityConfig="@xml/network_security_config"
             android:requestLegacyExternalStorage="true"
             android:enableOnBackInvokedCallback="true"
             android:appComponentFactory="androidx.core.app.CoreComponentFactory">
```

逐项含义：

- `extractNativeLibs="true"`：`.so` 会解压到 `/data/app/.../lib/arm64`，便于 mpv 动态 `dlopen`
  以及读取 `/proc/self/maps` 做堆栈符号化；也意味着 APK 更大但启动稍快。
- `usesCleartextTraffic="true"` + network-security-config 允许明文：**支持 http:// 流和自建 WebDAV/SMB 网关**，
  安全上属于降级，但播放器场景合理。
- `requestLegacyExternalStorage="true"`：Android 10 的过渡开关，配合 `MANAGE_EXTERNAL_STORAGE` 兼容旧逻辑。
- `enableOnBackInvokedCallback="true"`：Android 13 预测式返回手势。
- `appComponentFactory=CoreComponentFactory`：androidx.core 标准注入。
- `banner`：TV 端（Leanback）图标。

## 5. 安全面观察

| 观察 | 风险/说明 |
| --- | --- |
| `MainActivity` 对所有 `file://`/`content://` 开放 | 任意应用可拉起播放器加载任意 URI；播放器本身只读，风险有限 |
| `SYSTEM_ALERT_WINDOW` + `MANAGE_EXTERNAL_STORAGE` | 权限面较宽，上架 Google Play 会受限（本 APK 显然非 Play 分发） |
| 明文 HTTP 允许 | 中间人可篡改媒体流；不涉及账号体系，影响较小 |
| 无 `android:debuggable` | release 构建，无法直接 `run-as` |
| 签名 v1+v2+v3 | 标准 release 签名；重打包需自签名（见 docs/07） |
| `META-INF` 内含全部 androidx `.version` 文件 | 可用于精确还原 Gradle 依赖版本（见 docs/08） |
