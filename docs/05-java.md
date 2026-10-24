# 05 · Java/Kotlin 壳层分析

## 1. DEX 概况

| 项 | 值 |
| --- | --- |
| 文件 | `classes.dex`（单 dex，1,736,812 字节，magic `dex\n035`） |
| 字符串 | 11,161 |
| 类型 | 3,026 |
| 方法引用 | 16,310 |
| 类定义 | **2,183** |
| 反编译 | jadx 1.5.1 → 1,209 个 `.java`（含内部类合并） |

### 1.1 包分布（Top 20）

```
175  androidx.appcompat.widget
122  androidx.core.view
 98  x1        ← R8 重排的混淆包
 72  androidx.core.app
 71  y0        ← 混淆
 66  e2        ← 应用插件包（10 个 Channel + 辅助类；另有 AudioManagerChannel 在主包）
 64  io.flutter.embedding.android
 59  androidx.window.layout
 58  androidx.fragment.app
 47  io.flutter.view
 45  io.flutter.plugin.platform
 44  c         ← 混淆
 41  kotlinx.coroutines.internal
 40  android.support.v4.media.session
 40  androidx.lifecycle
 40  z0        ← Channel 框架（k=MethodChannel 包装、r=编解码器、j=事件）
 37  androidx.core.widget
 34  androidx.window.embedding
 33  h1        ← 混淆
```

### 1.2 只有 5 个类保留原名

Manifest 引用的符号无法被 R8 重命名，因此成为分析 Java 层的**唯一锚点**：

| 类 | 父类 | 作用 |
| --- | --- | --- |
| `xyz.re.player.ex.MainActivity` | `io.flutter.embedding.android.e`（`FlutterActivity`） | 入口、插件注册、PiP 回调 |
| `xyz.re.player.ex.ReexPlaybackService` | `android.app.Service` | 前台保活服务 |
| `xyz.re.player.ex.AudioManagerChannel` | `Object` | 音频焦点/音量通道 |
| `xyz.re.player.ex.ReexPlaybackService$a` | `Object` | 服务内部类（静态通知 setter） |
| `xyz.lhtls.mpv_client.MPVJniUtils` | `Object` | mpv JNI 入口 |

## 2. MainActivity 逐行解读

```java
public final class MainActivity extends io.flutter.embedding.android.e {
    private final o0 f4491j = new o0();      // SystemVideoPipMode 通道实例
    private a f4492k;                         // FlutterEngine

    @Override public a B(Context ctx) {        // createFlutterEngine
        a engine = new a(ctx, y().b()/*dartExecutor*/, true/*automaticallyRegisterPlugins*/,
                         q()/*isDebug*/);
        engine.q().i(new e2.e());              // AndroidChannel
        engine.q().i(new e2.s0());             // SystemVideoPopupView
        engine.q().i(new o0());                // SystemVideoPipMode
        engine.q().i(new AudioManagerChannel());
        engine.q().i(new e2.f0());             // MediaStoreChannel
        engine.q().i(new e2.s());              // HeadsetPlugChannel
        engine.q().i(new e2.p());              // ContentResolverChannel
        engine.q().i(new e2.q());              // DocumentTreeChannel
        engine.q().i(new e2.i0());             // NewPlaylistItemChannel
        engine.q().i(new e2.o());              // BackgroundServiceChannel
        engine.q().i(new e2.j0());             // PermissionChannel
        return engine;
    }

    @Override public boolean n() { return false; }   // shouldDestroyEngineWithHost() = false → 引擎复用

    @Override protected void onCreate(Bundle b) {
        c.f4333b.a(this);                    // androidx.core.splashscreen 安装
        super.onCreate(b);
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        a engine = this.f4492k;
        if (engine != null) {
            this.f4492k = null;
            new Handler(Looper.getMainLooper()).postDelayed(() -> engine.g(), 300); // engine.destroy()
        }
    }

    @Override public void onPictureInPictureModeChanged(boolean inPip, Configuration cfg) {
        super.onPictureInPictureModeChanged(inPip, cfg);
        this.f4491j.c(inPip);                 // 通知 Dart：PiP 状态变化
    }
}
```

要点：

1. **引擎复用**：`shouldDestroyEngineWithHost()=false` + 延迟 300 ms `destroy()`，
   保证旋转/后台切换时 Flutter 状态不丢，同时避免销毁时还在渲染导致崩溃。
2. **手动注册插件**：`automaticallyRegisterPlugins=true` 其实会注册 Flutter 官方插件
   （path_provider、url_launcher、shared_preferences…），随后再手动加 11 个应用通道。
3. **PiP 状态注入**：Activity 回调直接推给 `o0` 通道，Dart 侧据此切换 UI。

## 3. 插件框架（z0 包）

R8 把 Flutter 的 `MethodChannel` 包装成了自定义框架：

| 类 | 推断语义 | 依据 |
| --- | --- | --- |
| `z0.k` | `MethodChannelWrapper` | 构造 `new z0.k(binaryMessenger, name)`，方法 `e(handler)`、`c(name, args)` |
| `z0.r` | `StandardMethodCodec` 单例 | `z0.r.f4769b` 被作为 codec 传入 |
| `z0.j` | `EventChannelWrapper` | HeadsetPlugChannel 用 `z0.d`（EventChannel）→ `z0.j` |
| `z0.d` | `EventChannel` | `new z0.d(ctx, "…/HeadsetPlugChannel")` |
| `s0.a` | 插件接口 A（绑定 Application context） | `h(a.b)`/`l(a.b)` |
| `t0.a` | 插件接口 B（绑定 Activity） | `i(t0.c)`/`j(t0.c)`/`e()` |
| `s0.b` / `t0.c` | 绑定对象（applicationContext / activity） | `binding.a()`、`binding.b()`、`binding.d()` |

插件生命周期（从调用顺序还原）：

```
onAttachedToEngine   : h(appBinding) → 建立 MethodChannel → k.e(this)
onAttachedToActivity : i(actBinding) → j(actBinding) → 保存 Activity
onDetachedFromActivityForConfigChanges : l(...) / e()
onDetachedFromEngine : d() → channel.e(null)
```

这套框架本质是 **flutter_plugin_android_lifecycle** 的自研复刻。

## 4. 十一条 Channel 的实现要点

（通道名与方法表见 [03-architecture.md](03-architecture.md)）

### 4.1 AndroidChannel（e2.e）
- `getStorageVolumes` 遍历 `StorageManager.getStorageVolumes()`，返回 `{storage,mounted,volume.state,root.path}`，
  用 `externalMediaDirs` 判定 `External` 卷。
- `setDisplayCutoutMode` 直接改 `WindowManager.LayoutParams.layoutInDisplayCutoutMode`。
- `isTelevision` 用 `UiModeManager.getCurrentModeType() == UI_MODE_TYPE_TELEVISION`。

### 4.2 SystemVideoPipMode（e2.o0）
- 构造 `PictureInPictureParams.Builder`，`setAspectRatio(Rational(n,d))`。
- 注册 `Activity.onPictureInPictureModeChanged` 回调（`n0.java` 里还有一个动态广播
  `xyz.re.player.ex/SystemVideoPipMode/action` 的实现，用于 API 26 以下或分屏场景）。

### 4.3 SystemVideoPopupView（e2.s0）
- 基于 `WindowManager.addView` 的悬浮窗（需 `SYSTEM_ALERT_WINDOW`）。
- 参数：`aspectRatio/position/duration/thumbColor/progressColor`，即一个带进度条的小窗播放器。

### 4.4 MediaStoreChannel（e2.f0）
- 用 `ContentResolver.query` 查 `MediaStore.Video`/`Audio`/`Files`，投影含
  `relative_path, volume_name, date_modified, author, album, artist, title, duration`。
- `createDeleteRequest` → `MediaStore.createDeleteRequest`（API 30+ 批量删除）。
- `createImage` → `MediaStore.Images.Media.insert`（封面写回相册）。

### 4.5 ContentResolverChannel（e2.p）
- 持久化 URI 权限：`takePersistableUriPermission(uri, FLAG_GRANT_READ_URI_PERMISSION)`。
- 读写：`openFileDescriptor(uri, mode)` + `FileInputStream/FileOutputStream`，异常转 `"FileNotFound"`。

### 4.6 DocumentTreeChannel（e2.q）
- `request` 发 `ACTION_OPEN_DOCUMENT_TREE`；`listFile` 用 `DocumentFile.fromTreeUri` 递归。
- `queryTreeUris` 读 `contentResolver.getPersistedUriPermissions()`，构建 `SafRoot` 列表。

### 4.7 HeadsetPlugChannel（e2.s）
- **EventChannel**：`onListen` 注册 `ACTION_HEADSET_PLUG` 与蓝牙 `A2DP` 的 BroadcastReceiver，
  `state` 为 0/1（拔出/插入）与蓝牙连接态。

### 4.8 NewPlaylistItemChannel（e2.i0）
- `start` 注册 receiver 监听 `ACTION_VIEW`，收到后用 `onNewPlaylistItem` 把 URI 推给 Dart；
  `stop` 注销。配合 `singleTask` 的 `onNewIntent` 生效。

### 4.9 BackgroundServiceChannel（e2.o）
- `create` 接收通知字段 → 构造 `Notification` → 存入 `ReexPlaybackService.f4494f` →
  `startForegroundService`；`dispose` → `stopService`。

### 4.10 PermissionChannel（e2.j0）
- `requestPermissions`：`ActivityCompat.requestPermissions` + `onRequestPermissionsResult` 回调。
- 另有 `MANAGE_EXTERNAL_STORAGE` 的 `Environment.isExternalStorageManager()` 检测与设置页跳转。

## 5. AudioManagerChannel

- 双路径音频焦点：API < 26 用 `requestAudioFocus(listener, streamType, gain)`，
  API ≥ 26 用 `AudioFocusRequest.Builder`。
- `focusChange` 事件（`AudioManager.AUDIOFOCUS_LOSS / LOSS_TRANSIENT / GAIN`…）实时回传 Dart，
  由播放器决定暂停/降低音量。
- 音量接口直接映射 `AudioManager.getStreamVolume / setStreamVolume / adjustStreamVolume`。

## 6. ReexPlaybackService

```java
public final class ReexPlaybackService extends Service {
    private static Notification f4494f;          // 由 Channel 静态注入

    public void onCreate() {
        Notification n = f4494f;
        if (n != null) { startForeground(741852963, n); f4494f = null; }
        Log.v("ReexPlaybackService", "ReexPlaybackService create");
    }
    public void onDestroy() { stopForeground(1); Log.v(...); super.onDestroy(); }
    public int onStartCommand(Intent i, int f, int id) { return 2; } // START_STICKY
    public IBinder onBind(Intent i) { return null; }
}
```

- `foregroundServiceType=mediaPlayback`（Manifest）。
- 通知内容（标题/封面/按钮）由 Dart 通过 `BackgroundServiceChannel.create` 传入 —— 意味着
  **通知栏媒体控制和播放进度由 Dart 侧驱动**，Service 只负责保活，不持有 MediaSession。
  这也解释了为什么 MANIFEST 里声明了 `MediaBrowserService` 的 `<queries>` 却**没有**实现
  `MediaBrowserService`（只有一个普通 Service）。

## 7. MPVJniUtils

```java
public final class MPVJniUtils {
    public static final MPVJniUtils f4484a = new MPVJniUtils();
    public final native void avJniSetJavaVM();
    public final native long newGlobalNativePtr(Object obj);
    public final native void deleteGlobalNativePtr(long j);
}
```

配合 `libmpvclient.so` 的 `av_jni_set_java_vm`，让 mpv 的 `hwdec=mediacodec` 之类需要 JNI 的
路径可用（虽然本 APK 未链接 libmediandk，但保留了该能力）。
`newGlobalNativePtr` 把 Java 对象包成全局引用返回指针，供 Dart FFI 侧持有并回调。

## 8. Kotlin 痕迹

- `kotlin.jvm.internal.k`（Intrinsics）遍布全部业务类：**Kotlin 编译**。
- 协程库完整保留（`kotlinx.coroutines`），但业务代码里未见 suspend 函数（都是直通 JNI/Channel）。
- `DebugProbesKt.bin` + `kotlin/` 目录：未启用 R8 的 kotlin 元数据裁剪，
  保留了调试探针（对分析有利）。
