# 08 · 附录：清单、依赖与字符串

## A. Dart/pub 依赖（从 `assets/flutter_assets/NOTICES.Z` 解析）

`NOTICES.Z` 是 Flutter 打包的许可证聚合文件（zlib 压缩，解压后 1,848,726 字节，1055 个许可段落）。
按「段落首行为包名」规则解析出 **197 个包**（含开发期依赖，因为 `custom_lint`/`riverpod_lint`
被带进了运行时）：

```
accessibility analyzer analyzer_plugin angle animations archive args async boolean_selector
boringssl bot_toast build build_config build_daemon build_resolvers build_runner build_runner_core
built_collection built_value ceval characters charcode checked_yaml ci cli_util clock code_builder
collection convert cross_device crypto custom_lint custom_lint_builder custom_lint_core dart
dart_style device_info_plus device_info_plus_platform_interface dio drift drift_dev engine
etc_decoder eva_icons_flutter expat fake_async fallback_root_certificates ffi ffx_spd fiat file
fixnum flatbuffers flutter flutter_colorpicker flutter_displaymode flutter_lints flutter_preferences
flutter_riverpod freetype2 freezed freezed_annotation frontend_server_client ftpconnect fuchsia_sdk
fuzzywuzzy glfw glob glslang graphs harfbuzz hotreloader http http_multi_server http_parser icu
image include inja intl io js json json_annotation json_serializable khronos leak_tracker
leak_tracker_flutter_testing leak_tracker_testing libcxx libcxxabi libjxl libmicrohttpd libpng
libtess2 libwebp lints loading_animation_widget loading_animations logging lpinyin matcher
material_color_utilities meta mime mpv_client nested nsd nsd_android nsd_ios nsd_macos
nsd_platform_interface nsd_windows package_config package_info_plus
package_info_plus_platform_interface palette_generator path path_provider path_provider_android
path_provider_foundation path_provider_linux path_provider_platform_interface path_provider_windows
perfetto petitparser platform platform_detect plugin_platform_interface pointycastle pool provider
pub_semver pubspec_parse rapidjson recase retry riverpod riverpod_analyzer_utils riverpod_lint
rxdart scrollable_positioned_list shelf shelf_web_socket skia sliver_tools slivers smb2_client
source_gen source_helper source_span spring_animation sqlite sqlite3 sqlite3_flutter_libs sqlparser
stack_trace standard_message_codec state_notifier storage_access stream_channel stream_transform
string_scanner string_splitter term_glyph test_api timing toml tonic txt typed_data url_launcher
url_launcher_android url_launcher_ios url_launcher_linux url_launcher_macos
url_launcher_platform_interface url_launcher_web url_launcher_windows uuid vector_math vibration
vm_service watcher web web_locale_keymap web_socket_channel web_test_fonts web_unicode webdav_client
win32 win32_registry xdg_directories xml xxhash yaml zlib
```

其中 **引擎/第三方 C 库**（非 pub 包，因 Flutter 引擎的 NOTICES 混入）：
`angle boringssl expat freetype2 fuchsia_sdk glfw glslang harfbuzz icu khronos libcxx libcxxabi
libjxl libmicrohttpd libpng libtess2 libwebp perfetto rapidjson skia zlib`。

### 直接依赖推断（仅列出应用自用、非传递依赖）

| 包 | 用途 |
| --- | --- |
| `flutter_riverpod` / `riverpod` / `state_notifier` | 状态管理（ProviderScope + Notifier） |
| `dio` / `http` / `web_socket_channel` | HTTP / WebSocket |
| `drift` / `drift_dev` / `sqlite3` / `sqlite3_flutter_libs` / `sqlparser` | 本地媒体库（SQL） |
| `ftpconnect` | FTP/FTPS |
| `webdav_client` | WebDAV |
| `smb2_client` | Dart 侧 SMB2（与原生 libsmb2 双路径） |
| `nsd` / `nsd_android` / `nsd_windows` | **DLNA/SSDP/mDNS 设备发现** |
| `mpv_client` | 本地 path 包，mpv FFI 绑定 |
| `path_provider` / `url_launcher` / `package_info_plus` / `device_info_plus` | 平台能力 |
| `flutter_preferences` | 偏好存储 |
| `storage_access` | 存储权限处理 |
| `palette_generator` | 从封面提取主色（UI 主题色） |
| `image` / `archive` / `pointycastle` / `crypto` | 图片处理、压缩包、加密 |
| `lpinyin` / `fuzzywuzzy` / `string_splitter` | 中文拼音排序、模糊搜索、分词 |
| `etc_decoder` | 字幕/歌词解码（.ass/.srt 等） |
| `eva_icons_flutter` / `flutter_colorpicker` / `loading_animations` / `spring_animation` / `sliver_tools` / `scrollable_positioned_list` / `nested` / `bot_toast` | UI 组件 |
| `vibration` / `flutter_displaymode` | 触感、高刷屏 |
| `rxdart` | 响应式流 |
| `custom_lint` / `riverpod_lint` / `freezed` / `json_serializable` | 代码生成/静态检查（运行时被带入） |

## B. AndroidX 版本（来自 `META-INF/*.version`）

| 组件 | 版本 |
| --- | --- |
| activity | 1.0.0 |
| annotation-experimental | 1.3.0 |
| appcompat / appcompat-resources | 1.2.0 |
| arch.core core-runtime | 2.1.0 |
| core | **1.10.1** |
| core-splashscreen | **1.0.0-rc01** |
| cursoradapter / customview / drawerlayout / interpolator / loader / savedstate / tracing / viewpager | 1.0.0 |
| documentfile | 1.0.1 |
| fragment | 1.1.0 |
| lifecycle-livedata / livedata-core | 2.0.0 |
| lifecycle-runtime | 2.3.1 |
| lifecycle-viewmodel | 2.1.0 |
| media | 1.3.1 |
| vectordrawable / vectordrawable-animated | 1.1.0 |
| versionedparcelable | 1.1.1 |
| window / window-java | 1.0.0-beta04 |
| Android Gradle Plugin | 7.3.0 |

## C. 权限与组件

见 [02-manifest.md](02-manifest.md)。摘要：

- 权限 12 个（含 `MANAGE_EXTERNAL_STORAGE`、`SYSTEM_ALERT_WINDOW`、`CHANGE_WIFI_MULTICAST_STATE`）。
- 组件：1 个 Activity（MainActivity）+ 1 个 Service + 1 个 FileProvider + 1 个 Flutter 内置 WebViewActivity。
- Intent filter：4 组，覆盖 18 种 scheme（25 条声明）+ 116 条扩展名匹配 + text/plain 分享。

## D. 通道与方法（汇总表）

| 通道 | 类型 | 方法 |
| --- | --- | --- |
| AndroidChannel | Method | restartTextInput, pushSystemHomeScreen, setScreenBrightness, getScreenBrightness, canTouchScreen, setDisplayCutoutMode, getStorageVolumes, showOverlayPermissionSettingScreen, setRequestedOrientation, getDeviceApiLevel, keepScreenOn, isTelevision |
| SystemVideoPipMode | Method | init, enter, setAspectRatio, isInPipMode, hasPipMode, setIsPlaying, isPlaying, dispose |
| SystemVideoPopupView | Method | init, show, setProgress, setAspectRatio, canDrawOverlays, dispose |
| AudioManagerChannel | Method | requestAudioFocus, abandonAudioFocus, getStreamVolume, setStreamVolume, getStreamMaxVolume, getStreamMinVolume, adjustStreamVolume（事件：focusChange） |
| MediaStoreChannel | Method | queryVideos, queryAudios, queryFiles, scanFilePaths, createDeleteRequest, createImage |
| ContentResolverChannel | Method | takePersistableUriReadPermission, releasePersistableUriReadPermission, getPersistedUriReadPermissions, delete, readBytes, writeBytes, isDocumentUri, queryDisplayName |
| DocumentTreeChannel | Method | listFile, request, queryTreeUris |
| PermissionChannel | Method | requestPermissions（+ 结果回调） |
| HeadsetPlugChannel | **Event** | state |
| NewPlaylistItemChannel | Method | start, stop（事件：onNewPlaylistItem） |
| BackgroundServiceChannel | Method | create, dispose |

## E. 原生库符号摘要

### E.1 `libflutter.so` / `libapp.so`

```
_kDartVmSnapshotData            _kDartVmSnapshotInstructions
_kDartIsolateSnapshotData       _kDartIsolateSnapshotInstructions
_kDartSnapshotBuildId
```

### E.2 `libmpvclient.so`（自写）

```
JNI:  Java_xyz_lhtls_mpv_1client_MPVJniUtils_{avJniSetJavaVM, newGlobalNativePtr,
      deleteGlobalNativePtr, mpvTerminateDestroy}
Dart: Dart_InitializeApiDL + 全部 Dart_*_DL 指针；dart_wakeup_callback
mpv:  mpv_stream_cb_add_ro, mpv_stream_cb_add_ro_smb2, mpv_stream_method_done, mpv_terminate_destroy
smb:  smb2_init_context, smb2_set_security_mode, smb2_set_timeout, smb2_set_user/password/domain,
      smb2_connect_share, smb2_open, smb2_read, smb2_lseek, smb2_fstat, smb2_get_max_read_size
json: cJSON_*（事件序列化）
```

### E.3 `libmmr.so`（自写）

```
media_metadata_retriever_create / _release
media_metadata_retriever_get_metadata / _get_attached_image / _get_duration
media_metadata_retriever_get_video_track / _get_audio_track / _get_subtitle_track
media_metadata_retriever_get_frame_at_time
media_image_release
```

## F. 应用内 URL

```
https://afdian.net/a/lntls            # 爱发电赞助页（作者 lntls）
https://mpv.io/manual/master/         # mpv 文档（设置页帮助入口）
https://xxxxxxxx/dav                  # WebDAV 示例占位符
```

## G. 资源与资产

| 文件 | 大小 | 说明 |
| --- | --- | --- |
| `assets/flutter_assets/assets/cacert.pem` | 222,477 B | CA 证书包（约 140 个根证书），供 dio 自定义信任链 |
| `assets/flutter_assets/fonts/MaterialIcons-Regular.otf` | 13,684 B | 被裁剪的 Material 图标字体（只保留用到的字形） |
| `assets/flutter_assets/fonts/rx_player.ttf` | 972 B | 自制图标字体（family: `iconfont`），约 20 个自定义图标 |
| `packages/eva_icons_flutter/lib/fonts/Eva-Icons.ttf` | 1,280 B | eva_icons 字体（同样被 tree-shake） |
| `license/libmpv`、`license/libsmb2` | 27 KB × 2 | LGPL-2.1 全文 |
| `shaders/ink_sparkle.frag` | 11,544 B | Flutter 默认着色器 |
| `res/` | 297 KB | 图标/主题/启动图；`values-*` 覆盖 70+ 语言（来自 androidx） |

## H. 混淆对照线索

虽然 Dart 符号被重命名，但**库 ID → 库用途**仍可从配套信息推断：

- `@0150898` = `dart:core`（149 个符号）
- `@14069316`、`@4048458` 等 = Flutter framework 库
- 应用自有库的 ID 出现在含有业务字符串（`smb2`、`sub-font-size`、`MediaStore`…）的代码附近

blutter 的对象池转储（`dart/pp.txt`）给出了更完整的类 → 库映射，见 [06-dart.md](06-dart.md)。
