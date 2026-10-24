# 03 · 整体架构与跨语言调用链

## 1. 分层视图

```
┌──────────────────────────────────────────────────────────────────────┐
│  Dart 层（libapp.so，AOT + 混淆）                                     │
│  Riverpod 状态容器 · 页面/路由 · 媒体库(drift) · 网络(dio/ftp/webdav) │
│  播放控制器（调用 mpv_client 的 FFI 绑定）                            │
└───────────────┬───────────────────────────────┬──────────────────────┘
                │ MethodChannel ×10             │ FFI (dart:ffi / JNI)
┌───────────────▼───────────────────────────────▼──────────────────────┐
│  Kotlin 壳层（classes.dex，R8 混淆）                                  │
│  MainActivity(FlutterActivity) · 10 个插件类 + AudioManagerChannel     │
│  ReexPlaybackService · MPVJniUtils(3 个 native 方法)                  │
└───────────────┬───────────────────────────────┬──────────────────────┘
                │ Android SDK                    │ JNI
┌───────────────▼──────────────┐  ┌──────────────▼──────────────────────┐
│ MediaStore / DocumentTree    │  │ libmpvclient.so → libmpv.so          │
│ AudioManager / PiP / Overlay │  │   ├─ libav* (FFmpeg 7.0-dev)         │
└──────────────────────────────┘  │   ├─ libplacebo (GL/Vulkan 渲染)     │
                                  │   └─ libsmb2 (smb:// 自定义流)       │
                                  └─────────────────────────────────────┘
```

## 2. 插件的注册方式

`MainActivity.B(Context)` 里手工注册了 11 个插件（顺序即注册顺序）：

```java
a engine = new a(context, dartExecutor, true, isDebug);
engine.q().i(new e2.e());            // AndroidChannel
engine.q().i(new e2.s0());           // SystemVideoPopupView
engine.q().i(this.f4491j);           // SystemVideoPipMode (o0)
engine.q().i(new AudioManagerChannel());
engine.q().i(new e2.f0());           // MediaStoreChannel
engine.q().i(new e2.s());            // HeadsetPlugChannel
engine.q().i(new e2.p());            // ContentResolverChannel
engine.q().i(new e2.q());            // DocumentTreeChannel
engine.q().i(new e2.i0());           // NewPlaylistItemChannel
engine.q().i(new e2.o());            // BackgroundServiceChannel
engine.q().i(new e2.j0());           // PermissionChannel
```

> 全部为**手写 MethodChannel**，没有使用 pigeon 生成的代码（除 url_launcher 自带 pigeon 通道外）。

## 3. 十一条自定义 MethodChannel

通道名统一前缀 `xyz.re.player.ex/`。

### 3.1 `AndroidChannel`（e2.e）

系统能力聚合通道。

| 方法 | 作用 |
| --- | --- |
| `restartTextInput` | 重启输入法连接 |
| `pushSystemHomeScreen` | 发 `ACTION_MAIN/HOME` 回桌面 |
| `setScreenBrightness` / `getScreenBrightness` | 读写当前 Activity 亮度 |
| `canTouchScreen` | 查询 `android.hardware.touchscreen`（TV 判定辅助） |
| `setDisplayCutoutMode` | 刘海屏显示模式 |
| `getStorageVolumes` | 枚举存储卷（state/mounted/root.path/External） |
| `showOverlayPermissionSettingScreen` | 跳转悬浮窗权限页 |
| `setRequestedOrientation` | 屏幕方向 |
| `getDeviceApiLevel` | Build.VERSION.SDK_INT |
| `keepScreenOn` | 常亮 |
| `isTelevision` | `uiMode & UI_MODE_TYPE_TELEVISION` |

### 3.2 `SystemVideoPipMode`（e2.o0）

| 方法 | 作用 |
| --- | --- |
| `init` | 绑定 Activity，注册 `onPictureInPictureModeChanged` 回调 |
| `enter` | 进入 PiP（setAspectRatio + PictureInPictureParams） |
| `setAspectRatio` | 宽高比（numerator/denominator） |
| `isInPipMode` / `hasPipMode` | 查询状态/能力 |
| `setIsPlaying` / `isPlaying` | 同步播放状态，驱动 PiP 播放/暂停按钮 |
| `dispose` | 释放 |

### 3.3 `SystemVideoPopupView`（e2.s0）

悬浮窗播放（`SYSTEM_ALERT_WINDOW`）。

方法：`init`、`show`（aspectRatio/position/duration/thumbColor/progressColor）、
`setProgress`、`setAspectRatio`、`canDrawOverlays`、`dispose`。

### 3.4 `AudioManagerChannel`

| 方法 | 作用 |
| --- | --- |
| `requestAudioFocus` | 申请音频焦点（contentType/focusGain，Android 8+ 用 AudioFocusRequest） |
| `abandonAudioFocus` | 放弃焦点 |
| `getStreamVolume` / `setStreamVolume` | 音量读写 |
| `getStreamMaxVolume` / `getStreamMinVolume` | 音量范围 |
| `adjustStreamVolume` | 调节（direction/flags） |

事件回调：`focusChange`（int，AudioManager 常量），由 Kotlin 主动 `invokeMethod` 推给 Dart。

### 3.5 `MediaStoreChannel`（e2.f0）

媒体库扫描，Dart 侧「本地视频/音乐」页面的数据源。

| 方法 | 作用 |
| --- | --- |
| `queryVideos` / `queryAudios` / `queryFiles` | 查询（返回 path/relative_path/volume_name/date_modified/author/album/artist/title/duration） |
| `scanFilePaths` | 触发 MediaScanner |
| `createDeleteRequest` | Android 11+ 批量删除请求 |
| `createImage` | 把封面写入 MediaStore（`external_primary`，mime_type，parentDirname） |

### 3.6 `ContentResolverChannel`（e2.p）

SAF / content:// 读写。

| 方法 | 作用 |
| --- | --- |
| `takePersistableUriReadPermission` / `releasePersistableUriReadPermission` | 持久化读权限 |
| `getPersistedUriReadPermissions` | 列出已授权 URI |
| `delete` | 删除（uriStringList） |
| `readBytes` / `writeBytes` | 读写（openFileDescriptor + mode） |
| `isDocumentUri` | 判断 SAF URI |
| `queryDisplayName` | 显示名 |

### 3.7 `DocumentTreeChannel`（e2.q）

| 方法 | 作用 |
| --- | --- |
| `listFile` | 遍历 `DocumentFile` 树（document_id/mime_type/flags） |
| `request` | 发起 `ACTION_OPEN_DOCUMENT_TREE`，把用户选的目录交给 Dart |
| `queryTreeUris` | 查询已授权的目录树 |

### 3.8 `PermissionChannel`（e2.j0）

运行时权限：`requestPermissions`（数组）+ 结果回调；配合 `MANAGE_EXTERNAL_STORAGE` 检测。

### 3.9 `HeadsetPlugChannel`（e2.s）

**EventChannel**，监听 `ACTION_HEADSET_PLUG` 与蓝牙 A2DP 状态，向 Dart 推 `state`。
用于「拔耳机自动暂停」。

### 3.10 `NewPlaylistItemChannel`（e2.i0）

`start`/`stop` 注册/注销 receiver（`onNewPlaylistItem`），把外部 `ACTION_VIEW`
新播放项投递给 Dart（`singleTask` 复用实例时走这里）。

### 3.11 `BackgroundServiceChannel`（e2.o）

Java 侧只实现 `create` / `dispose`，但 **Dart 侧调用的方法名远多于这两个**
（机器码扫描结果，见 [11-protocol-map.md](11-protocol-map.md)）：

```
create, dispose, updateNotification, setNotificationActions, setNotificationIcon,
setMediaMetadata, setPlaybackState,
title, artist, album, albumArtist, duration, position, playbackSpeed,
isPlaying, canSkipToNext, canSkipToPrevious, displayIconUri
```

说明 Java 侧 `create` 接收的是一个 **Map**，Dart 把整套通知/媒体元数据打包传入，
Kotlin 只做转发与 `Notification` 构建（notification 字段名即上面这些 key）。

### 3.12 `PermissionChannel` 的真实方法名（补充）

Dart 侧实际调用（机器码扫描）：

```
checkMediaPermission, requestMediaPermission,
checkManualExternalStorage, requestManualExternalStorage
```

比 jadx 里看到的单一 `requestPermissions` 更细：权限被分成「媒体权限」与
「所有文件访问（MANAGE_EXTERNAL_STORAGE）」两组分别检查/申请。

## 4. Dart ↔ mpv 的 JNI 桥

`xyz.lhtls.mpv_client.MPVJniUtils` 只有 3 个 native 方法：

```java
public final native void avJniSetJavaVM();          // 缓存 JavaVM*
public final native long newGlobalNativePtr(Object obj); // 建立 Dart 对象 ↔ native 指针映射
public final native void deleteGlobalNativePtr(long ptr);
```

`libmpvclient.so` 导出的 JNI 符号证实了实现（细节见 [10-native-reimpl.md](10-native-reimpl.md)）：

```
Java_xyz_lhtls_mpv_1client_MPVJniUtils_avJniSetJavaVM
Java_xyz_lhtls_mpv_1client_MPVJniUtils_newGlobalNativePtr
Java_xyz_lhtls_mpv_1client_MPVJniUtils_deleteGlobalNativePtr
Java_xyz_lhtls_mpv_1client_MPVJniUtils_mpvTerminateDestroy
```

**补充（反汇编后修正）**：`xyz.lhtls.mpv_client` 插件在 Kotlin 侧还有一条同名 MethodChannel，
只负责 Flutter 外接纹理：

| 方法 | 作用 |
| --- | --- |
| `SurfaceTextureEntry.create` | 创建 SurfaceTexture，返回 `{textureId, surfacePtr}` |
| `SurfaceTextureEntry.setDefaultBufferSize` | 设置宽高 |
| `SurfaceTextureEntry.release` | 释放 |

Dart 通过 FFI 把 `surfacePtr`（ANativeWindow*）交给 mpv，mpv 直接渲染到该 Surface，
Flutter 侧用 textureId 显示 —— 这就是视频画面的完整链路（没有走平台视图）。

该库还导出了 `mpv_stream_cb_add_ro_smb2`（原生 `smb2://` 流实现），
但**真机动态验证证明它从未被调用**（见 [13-dynamic-results.md](13-dynamic-results.md) §4）：

- 运行时 Frida 抓到的是 `register_mpv_stream_cb_dart proto=smb2` 和 `proto=content`；
- Dart 字符串里有 **24 个 `smb2_*` 符号**（`smb2_init_context`、`smb2_connect_share_async`、
  `smb2_open_async`、`smb2_pread_async`、`smb2_which_events`、`smb2_service`…）以及 `libsmb2.so`。

所以真实链路是：**Dart FFI → libsmb2.so（异步事件循环）→ 通过自定义 mpv 流协议喂数据**，
与 `libmpvclient.so` 里的原生 SMB 实现无关（后者是死代码，和 `libmmr` 一样）。

Dart 侧通过 `dart:ffi` 直接 `DynamicLibrary.open("libmpvclient.so")` 调用上述封装
（`libapp.so` 字符串中含 `libmpvclient.so`、`mpv_command_async`、`mpv_observe_property` 等）。

> 全部 11 条通道在 Dart 机器码中的调用点、方法名与函数地址，
> 见自动生成的 [11-protocol-map.md](11-protocol-map.md)（1.4M 条指令、72,391 处池引用扫描结果）。

## 5. 播放数据流（推断并经字符串/符号验证）

```
用户点播放
  → Dart: 解析 URI（本地/content:// /smb:///ftp:///webdav:///http(s)://）
  → mpv_client: mpv_command_async(["loadfile", uri, ...])
  → libmpv: 选择 demuxer
       ├─ 普通网络/本地：FFmpeg avformat
       └─ smb2://：
            Dart 自定义流协议（register_mpv_stream_cb_dart）
            → Dart FFI 调 libsmb2.so（smb2_open_async / smb2_pread_async / smb2_service）
            → 数据回填给 mpv
  → 解码：FFmpeg libavcodec（硬解走 mediacodec? 未见 libmediandk 依赖 → 走 libavcodec 软解 + libplacebo 渲染）
  → 渲染：libplacebo (OpenGL ES) → ANativeWindow（Flutter 提供的外接纹理）
  → 音频：OpenSL ES（libOpenSLES.so 依赖）
  → 事件：mpv_wait_event → Dart 回调 → Riverpod 状态 → UI 刷新
```

## 6. 存储与配置

- 数据库：drift(SQLite)，文件位于应用私有目录；同时用 `libsqlite3.so`（非系统 SQLite）以保证版本一致。
- 媒体封面：写入 `cache/AudioCovers`、`cache/VideoCovers`，再通过 FileProvider 分享。
- 证书：`assets/cacert.pem`（222 KB）交给 `dio`/`HttpClient` 做自签/私有 CA 场景的信任锚。
