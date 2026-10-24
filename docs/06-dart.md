# 06 · Dart AOT 层还原（blutter 实证结果）

> 目标文件：`lib/arm64-v8a/libapp.so`（7,734,192 字节）
> 这是 Flutter 的 AOT 产物：**ARM64 机器码 + 序列化对象堆**，不是字节码，也不是可反编译的中间表示。
> 本页所有数字都来自实际跑通的 blutter 分析，产物见 [`dart/blutter/`](../dart/blutter/)。

## 1. 快照结构

ELF 导出符号：

```
_kDartVmSnapshotData              0x000200   15,632 B
_kDartVmSnapshotInstructions      0x1e0000   91,488 B
_kDartIsolateSnapshotData         0x003f40 1,926,160 B
_kDartIsolateSnapshotInstructions 0x1f6580 5,647,808 B
_kDartSnapshotBuildId             0x0001c8       32 B
```

`_kDartVmSnapshotData` 头部（0x200）：

```
f5 f5 dc dc  7a 37 00 00  00 00 00 00  03 00 00 00 00 00 00 00
ee1eb666c76a5cb7746faf39d0b97547
product no-code_comments dwarf_stack_traces_mode no-lazy_dispatchers
dedup_instructions no-tsan no-asserts arm64 android compressed-pointers null-safety
```

- `magic = 0xdcdcf5f5`，快照哈希 `ee1eb666c76a5cb7746faf39d0b97547`
- `product`：release 构建
- `no-code_comments`：**函数名/行号被剥离**（崩溃栈不可读）
- `compressed-pointers`：堆指针是 32 位压缩形式（blutter 必须按此解析）
- `dwarf_stack_traces_mode`：栈回溯走 DWARF 而不是代码注释

## 2. 混淆

Dart 侧启用了 `--obfuscate`：

| 证据 | 说明 |
| --- | --- |
| 3,265 个「名字@库ID」符号，名字是 1–3 字符随机串（`_TD@82050165`、`_qG@314475501`） | 私有符号被重命名 |
| asm 中应用类名形如 `bza`、`_Qr`、`oKa`、`zZ` | 类名同样被重命名 |
| 框架类名完好：`MethodChannel`、`Expando`、`FragmentProgram`、`_GrowableList` | 混淆只作用于应用代码 |
| 7,541 条字符串常量完好 | 字符串不被混淆，是语义还原的入口 |

## 3. 对象池还原结果（`pp.txt`）

| 指标 | 数值 |
| --- | --- |
| 对象池条目 | **46,540** |
| 不同类对象 | **762**（其中 540 个应用类在 asm 中有完整定义） |
| 字段（Field 对象） | **953** |
| 字符串（去重） | **7,541**（中文 344 条，简/繁各一份） |
| 函数（带地址的） | **1,858** |
| 反汇编文件 | **544**（`asm/`，共 5.9 MB） |
| Frida 脚本 | 314 KB（`blutter_frida.js`） |

## 4. 逆向出的原始工程信息

对象池里保留了 `dart_plugin_registrant` 的 URI：

```
file:///G:/MyProject/Reex/re_player_ex/.dart_tool/flutter_build/dart_plugin_registrant.dart
```

→ **作者的构建机：`G:\MyProject\Reex\re_player_ex`，Dart 包名 `re_player_ex`。**

以及唯一一条保留的源码路径：

```
package:re_player_ex/utils/ffi_io.dart
```

说明工程里有 `utils/` 目录，`ffi_io.dart` 负责 FFI 加载（对应 `libmpvclient.so`）。
这两条信息足以确定 `pubspec.yaml` 的 `name:` 与目录命名习惯。

## 5. 界面文案（blutter 精确提取，节选）

`strings_zh.txt` 共 344 条，以下为按功能归类的样本（每项通常有简/繁两份）：

### 5.1 首页与导航
```
首页 / 首頁      网络共享 / 網絡共享     播放列表
视频 / 視頻      文件夹                 设置 / 設置
播放历史 / 播放歷史   显示播放记录 / 顯示播放記錄
关于 / 關於      常规 / 常規            主题切换
语言             其他                   支持
隐私政策 / 隱私政策   查看许可           权限 / 權限
```

### 5.2 媒体库
```
布局   列   网格 / 網格
个视频 / 個視頻
过滤视频的大小 / 過濾視頻的大小
识别 .nomedia / 識別 .nomedia
自动扫描   回收站
清理缓存 / 清理緩存   清理成功   错误日志
```

### 5.3 网络存储
```
服务器 / 服務器    用户名 / 用戶名    密码 / 密碼
端口              域                共享
别名 / 別名       网络 / 網絡
```

### 5.4 通用操作
```
打开   选择 / 選擇   编辑 / 編輯   删除   重命名   禁用   可选 / 可選
什么也没有 / 什麼也沒有
```

### 5.5 权限说明（完整句）
```
用于后台播放
用于实现画中画功能
用于播放视频时防止屏幕休眠
用于访问网络媒体
用于读取和删除媒体文件
用于长按倍速震动提醒
```

## 6. 类与调用关系

- `asm/` 下 540 个根文件 = 540 个应用类，文件名即混淆后的类名（如 `aHh.dart` 定义 `bza`）。
- 每个类文件里含继承关系、方法签名（含泛型、命名参数）与逐条 ARM64 反汇编。
- 常量引用通过对象池偏移标注，例如 `[pp+0x66e0] "name"`，可与 `pp.txt` 对照还原字符串。

示例（`asm/aHh.dart`）：

```dart
class bza extends Object {
  iza<Y0> call<Y0 extends UB?>(bza, (dynamic, fza<Y0>) => Y0,
                              {String? name, Iterable<hPa>? zYc}) {
    // ** addr: 0x707d1c, size: 0x1f8
    // 0x707d28: SetupParameters(bza this /* r4, fp-0x28 */, ...)
  }
}
```

## 7. 与原生层的边界

```
dart:ffi  ──►  libmpvclient.so  ──►  libmpv.so
                   ├─ Dart_InitializeApiDL（原生回调 Dart）
                   ├─ cJSON（事件序列化）
                   ├─ mpv_stream_cb_add_ro（Dart 提供数据源）
                   ├─ mpv_stream_cb_add_ro_smb2（libsmb2 直连 NAS）
                   └─ JNI: MPVJniUtils
```

Dart 侧对 mpv 的属性面（来自字符串）：

```
video-rotate video-unscaled video-zoom video-pan-x/y video-scale-x/y
video-aspect-override video-params video-out-params
audio-delay audio-file-auto audio-add
sub-delay sub-font sub-font-size sub-bold sub-italic sub-border-size
sub-border-color sub-color sub-text sub-auto sub-ass-override sub-add
seekable seekable-ranges
```

命令/事件：`loadfile`、`seek`、`video-add`、`mpv_command_async`、`mpv_observe_property`、
`mpv_hook_add`/`mpv_hook_continue`、`mpv_request_log_messages`（日志 `mpv_logs.jsonl`）、`mpv.conf`。

## 8. 复现 blutter 分析

```bash
# Dart runtime 必须与 APK 一致：3.3.3 / android / arm64
python blutter.py <apk>/lib/arm64-v8a out/
```

Windows + MinGW 下的 7 处补丁见 [`tools/blutter-patches.md`](../tools/blutter-patches.md)：
MSVC 宽容语法、`interface` 宏、`__GCC__` 拼写、函数指针转换、链接库、`interface` 全局、capstone 头路径。

> ⚠️ blutter 用 `std::filesystem`，**中文路径会直接抛**
> `filesystem error: Cannot convert character sequence`。
> 必须把 `libapp.so` 和输出目录放到纯 ASCII 路径（本仓库在 `C:\re_work\` 下完成分析）。

## 9. 局限（诚实声明）

1. **Dart AOT 无法还原为可编译源码**：没有类型信息、控制流结构、局部变量名。
2. 本 APK 混淆 + `no-code_comments`，方法名不可恢复；blutter 也只还原了 1,858 个函数
   （应用实际函数数量更多，混淆导致部分函数无法定位）。
3. 因此本仓库交付的是：对象池 + 类结构 + 反汇编 + 字符串 + Frida 脚本 + 依赖清单，
   而不是「一份能 `flutter build` 的源码」。
