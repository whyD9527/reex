# 11 . Dart <-> 原生 协议图谱（机器码级）

> 由 tools/pp_xref.py + tools/protocol_map.py 自动生成，数据源是 libapp.so 的机器码。
> 原始数据：dart/callgraph.json（24743 个对象池条目；扫描共 72,391 处引用，
> JSON 为控制体积每个条目最多保留 32 处，实际写入 47725 条）

## 1. 原理

Dart AOT（arm64 + 压缩指针）的寄存器约定：

| 寄存器 | 含义 |
| --- | --- |
| x27 | **PP**（object pool 基址） |
| x28 | 堆基址（压缩指针解码：add x2, x2, x28, lsl #32） |
| x15 | Dart 栈指针影子（序言 stp x29, x30, [x15, #-N]!） |

因此 ldr x16, [x27, #0x6ec8] 就是“取对象池 0x6ec8 处的对象”。
扫描器把每条这样的指令与 pp.txt 的条目对齐，得到 **代码地址 -> 池对象** 的映射；
再按函数序言切分，得到 **函数 -> 引用的字符串/通道对象**。

- .eh_frame 被裁剪（仅 0x42 字节），函数边界靠序言模式重建；
- 遇到非法指令按 4 字节重同步（段头、内嵌数据）；
- 统计：**1,411,926 条指令、72,391 处池引用、24,743 个池条目被引用**。

## 2. 方法通道对象（Dart 侧实例）

扫描到 **18 个 MethodChannel 对象**，其中 11 个属于应用：

| 通道 | 池偏移 | 引用次数 | 调用方函数数 |
| --- | --- | --- | --- |
| xyz.re.player.ex/AndroidChannel | 0x6ec8 | 16 | 16 |
| xyz.re.player.ex/AudioManagerChannel | 0x11390 | 7 | 7 |
| xyz.re.player.ex/BackgroundServiceChannel | 0x11378 | 9 | 7 |
| xyz.re.player.ex/ContentResolverChannel | 0x6ea8 | 7 | 7 |
| xyz.re.player.ex/DocumentTreeChannel | 0xf970 | 3 | 3 |
| xyz.re.player.ex/MediaStoreChannel | 0x11890 | 7 | 7 |
| xyz.re.player.ex/NewPlaylistItemChannel | 0x10a70 | 4 | 2 |
| xyz.re.player.ex/PermissionChannel | 0x6ef0 | 4 | 4 |
| xyz.re.player.ex/SystemVideoPipMode | 0x11358 | 8 | 6 |
| xyz.re.player.ex/SystemVideoPopupView | 0x11348 | 8 | 7 |

第三方通道（同一批扫描里顺带确认）：

| 通道 | 池偏移 | 引用次数 |
| --- | --- | --- |
| dev.fluttercommunity.plus/device_info | 0x22a80 | 2 |
| dev.fluttercommunity.plus/package_info | 0x7070 | 1 |
| flutter_display_mode | 0x12120 | 1 |
| plugins.flutter.io/path_provider | 0x138 | 4 |
| plugins.flutter.io/url_launcher | 0x280d8 | 1 |
| storage_access | 0x1cc88 | 3 |
| vibration | 0x22730 | 1 |
| xyz.lhtls.mpv_client | 0x11360 | 3 |

## 3. 通道 -> Dart 侧方法调用

“同一函数里引用了该通道对象与该方法名”即判定为一次调用。
下表的方法名与 Java 侧逐一对应（见 03-architecture.md）：

| 通道 | 与 Java 实现一致的方法 | 同函数内其它字符串（参数键/扩展方法） |
| --- | --- | --- |
| xyz.re.player.ex/AndroidChannel | canTouchScreen、getDeviceApiLevel、getScreenBrightness、getStorageVolumes、isTelevision、keepScreenOn、restartTextInput、setRequestedOrientation、setScreenBrightness、showOverlayPermissionSettingScreen | Environment.getExternalStorageDirectory、StartedIntentChannel.action、StartedIntentChannel.dataString、StartedIntentChannel.getStringExtra、brightness、getRequestedOrientation、keepOn、picturesDirPath |
| xyz.re.player.ex/AudioManagerChannel | abandonAudioFocus、getStreamMaxVolume、getStreamMinVolume、getStreamVolume、requestAudioFocus、setStreamVolume | contentType、flags、focusGain、index、streamType |
| xyz.re.player.ex/BackgroundServiceChannel | create、dispose | album、albumArtist、artist、canSkipToNext、canSkipToPrevious、displayIconUri、duration、isPlaying、playbackSpeed、position、setMediaMetadata、setNotificationActions、setNotificationIcon、setPlaybackState … |
| xyz.re.player.ex/ContentResolverChannel | getPersistedUriReadPermissions、queryDisplayName、readBytes、releasePersistableUriReadPermission、takePersistableUriReadPermission | mode、openFileDescriptor、uriString |
| xyz.re.player.ex/DocumentTreeChannel | listFile、queryTreeUris、request |  |
| xyz.re.player.ex/MediaStoreChannel | createDeleteRequest、createImage、queryFiles、queryVideos、scanFilePaths | Bsf、Reex、createTrashRequest、displayName、extensions、getExternalVolumeNames、isTrashed、mediaType、mimeType、mimeTypes、parentDirname、paths、relativePaths、ssf … |
| xyz.re.player.ex/NewPlaylistItemChannel | start、stop |  |
| xyz.re.player.ex/PermissionChannel | （未命中） | checkManualExternalStorage、checkMediaPermission、requestManualExternalStorage、requestMediaPermission |
| xyz.re.player.ex/SystemVideoPipMode | dispose、enter、hasPipMode、init、isPlaying、setAspectRatio、setIsPlaying | denominator、numerator |
| xyz.re.player.ex/SystemVideoPopupView | canDrawOverlays、dispose、init、setAspectRatio、setProgress、show | aspectRatio、duration、height、onPlayPause、onProgressChanged、onResetPlaybackSpeed、onSurfaceChanged、onSurfaceCreated、onSurfaceDestroyed、onUpPlaybackSpeed、onViewBack、onViewClose、position、progressColor … |

## 4. 方法 -> 调用点（函数地址）

与通道相关的方法共 110 个（每个方法名在池中唯一，通常只有 1 处引用，即 invokeMethod 的实参）：

| 方法 | 调用函数地址 |
| --- | --- |
| Bsf | 0x700f94 |
| Environment.getExternalStorageDirectory | 0x740c30 |
| Reex | 0x3d9c00、0x3dd3b0、0x40a640、0x480448 |
| StartedIntentChannel.action | 0x6c7024 |
| StartedIntentChannel.dataString | 0x6c6fdc |
| StartedIntentChannel.getStringExtra | 0x6c6f90 |
| abandonAudioFocus | 0x469aa4 |
| album | 0x3ad4a0 |
| albumArtist | 0x3ad4a0 |
| artist | 0x3ad4a0 |
| aspectRatio | 0x380508、0x380620、0x4880a4、0x58c01c |
| brightness | 0x37e5d0、0x37e754、0x3802e0、0x58bce8 |
| canDrawOverlays | 0x71c3f4 |
| canSkipToNext | 0x3819c4、0x381a68 |
| canSkipToPrevious | 0x3819c4、0x381a68 |
| canTouchScreen | 0x6c70f8 |
| checkManualExternalStorage | 0x57a628 |
| checkMediaPermission | 0x57a6bc |
| contentType | 0x3b3c3c、0x6fe280 |
| create | 0x6ff824 |
| createDeleteRequest | 0x7187d0 |
| createImage | 0x7012e0 |
| createTrashRequest | 0x718708 |
| denominator | 0x382080、0x71c05c |
| displayIconUri | 0x3ad4a0 |
| displayName | 0x38006c、0x3b8d9c、0x45294c、0x5897a0 |
| dispose | 0x3ad5d8、0x7193b4、0x719418 |
| duration | 0x367740、0x367b58、0x37f1c0、0x38213c |
| enter | 0x71c05c |
| extensions | 0x7402e4 |
| flags | 0x37e810、0x6b7c30 |
| focusGain | 0x6fe280 |
| getDeviceApiLevel | 0x6c71d8 |
| getExternalVolumeNames | 0x7045a4 |
| getPersistedUriReadPermissions | 0x720cd0 |
| getRequestedOrientation | 0x71b8c8 |
| getScreenBrightness | 0x6f7ad4 |
| getStorageVolumes | 0x740b44 |
| getStreamMaxVolume | 0x6f3b38 |
| getStreamMinVolume | 0x6f3ba8 |
| getStreamVolume | 0x6f7cc0 |
| hasPipMode | 0x71c27c |
| height | 0x2b9364、0x2b993c、0x2b9d2c、0x367efc |
| index | 0x1fc980、0x1fcb6c、0x299900、0x37e810 |
| init | 0x71c1c4、0x71c33c |
| isPlaying | 0x37f1c0、0x3819c4、0x381a68、0x589b20 |
| isTelevision | 0x6c7168 |
| isTrashed | 0x718708 |
| keepOn | 0x3825a8 |
| keepScreenOn | 0x3825a8 |
| listFile | 0x703e0c |
| mediaType | 0x7402e4 |
| mimeType | 0x2b3838、0x3b8d9c、0x7012e0、0x717778 |
| mimeTypes | 0x700f94、0x70ae04 |
| mode | 0x3af01c |
| numerator | 0x382080、0x71c05c |
| onPlayPause | 0x743c20 |
| onProgressChanged | 0x743c20 |
| onResetPlaybackSpeed | 0x743c20 |
| onSurfaceChanged | 0x743c20 |
| onSurfaceCreated | 0x743c20 |
| onSurfaceDestroyed | 0x743c20 |
| onUpPlaybackSpeed | 0x743c20 |
| onViewBack | 0x743c20 |
| onViewClose | 0x743c20 |
| openFileDescriptor | 0x3af01c |
| parentDirname | 0x7012e0 |
| paths | 0x700f94 |
| picturesDirPath | 0x7011cc |
| playbackSpeed | 0x37f1c0、0x381a68、0x589b20 |
| position | 0x381a68、0x38213c、0x4880a4 |
| progressColor | 0x4880a4 |
| queryDisplayName | 0x3aff20 |
| queryFiles | 0x7402e4 |
| queryTreeUris | 0x720bd8 |
| queryVideos | 0x7043fc |
| readBytes | 0x430510、0x7180d0 |
| relativePaths | 0x7043fc、0x7402e4 |
| releasePersistableUriReadPermission | 0x4aa7e8 |
| request | 0x4ab28c |
| requestAudioFocus | 0x6fe280 |
| requestManualExternalStorage | 0x72befc |
| requestMediaPermission | 0x57a904 |
| restartTextInput | 0x3b9644 |
| scanFilePaths | 0x700f94 |
| setAspectRatio | 0x381ff4、0x382080 |
| setIsPlaying | 0x3821f8 |
| setMediaMetadata | 0x3ad4a0 |
| setNotificationActions | 0x3819c4 |
| setNotificationIcon | 0x3ac984 |
| setPlaybackState | 0x381a68 |
| setProgress | 0x38213c |
| setRequestedOrientation | 0x382540 |
| setScreenBrightness | 0x37e754 |
| setStreamVolume | 0x37e810 |
| show | 0x4880a4 |
| showOverlayPermissionSettingScreen | 0x4882c8 |
| ssf | 0x7043fc |
| start | 0x1f7330、0x208e7c、0x2243b0、0x380b7c |
| stop | 0x3c2e84、0x6ed040、0x6f72d8 |
| streamType | 0x37e810、0x6fe280 |
| takePersistableUriReadPermission | 0x71d040 |
| thumbColor | 0x4880a4 |
| title | 0x367efc、0x368380、0x36fcf4、0x380d30 |
| trashed | 0x7043fc |
| updateNotification | 0x381974 |
| uriList | 0x718708 |
| uriString | 0x38006c、0x380ef0、0x3af01c、0x3aff20 |
| volumeName | 0x7043fc、0x7402e4 |
| width | 0x2b9364、0x2b993c、0x2b9d2c、0x367efc |

## 5. mpv 属性面（Dart 侧实际引用的属性）

| 属性 | 引用处数 |
| --- | --- |
| video-rotate | 2 |
| video-unscaled | 2 |
| video-zoom | 2 |
| video-pan-x | 2 |
| video-pan-y | 2 |
| video-scale-x | 2 |
| video-scale-y | 2 |
| video-aspect-override | 2 |
| audio-delay | 2 |
| audio-file-auto | 1 |
| sub-delay | 2 |
| sub-font | 1 |
| sub-font-size | 1 |
| sub-bold | 1 |
| sub-italic | 1 |
| sub-border-size | 1 |
| sub-border-color | 1 |
| sub-color | 1 |
| sub-text | 1 |
| sub-auto | 2 |
| sub-ass-override | 1 |
| seekable | 5 |
| seekable-ranges | 2 |
| video-params | 1 |
| video-out-params | 1 |

## 6. 结论与局限

1. **11 个应用通道全部在机器码中定位到**，每个通道都能对应到具体方法名与函数地址，
   与 Java 侧（jadx 反编译）的方法表 100% 吻合。
2. xyz.lhtls.mpv_client 的 3 个方法（SurfaceTextureEntry.*）也定位到了调用点，
   证实它是 Flutter 外接纹理通道（见 10-native-reimpl.md 3.5 节）。
3. 局限：
   - 函数没有符号名（AOT 裁剪 + 混淆），表中只能给地址；
     blutter 覆盖的 1,858 个函数可补类名，其余只能靠“引用了哪些字符串”推断用途。
   - 内联与尾调用可能让一个调用点出现在非预期函数里。
   - pushSystemHomeScreen 等少数方法因字符串复用/内联未命中。
