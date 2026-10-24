# blutter 输出说明（Dart AOT 还原）

| 文件/目录 | 大小 | 内容 |
| --- | --- | --- |
| `pp.txt` | 1.6 MB | **对象池全量转储**：46,540 个对象，含 762 个类对象、953 个字段、7,541 个字符串 |
| `objs.txt` | 483 KB | 对象实例树（每个 `Obj!Class@addr` 的字段值） |
| `asm/` | 5.9 MB | 544 个 .dart 文件：540 个类定义 + 反汇编（1,858 个带地址的函数） |
| `blutter_frida.js` | 314 KB | Frida 脚本：类/函数地址表，可直接注入做动态分析 |
| `ida_script/` | — | IDA 用的符号标注脚本 |
| `classes.txt` | — | 从 asm 提取的 1,384 个类名 |
| `strings.txt` | — | 7,541 条去重字符串 |
| `strings_zh.txt` | — | 344 条中文字符串（简/繁各一份） |

## 关键信息

### 原始工程路径

`pp.txt` 中保留了 dart_plugin_registrant 的 URI：

```
file:///G:/MyProject/Reex/re_player_ex/.dart_tool/flutter_build/dart_plugin_registrant.dart
```

→ 作者的构建机盘符 `G:`，工程目录 `G:\MyProject\Reex\re_player_ex`，Dart 包名 **`re_player_ex`**。

### 唯一保留的源码路径

```
package:re_player_ex/utils/ffi_io.dart
```

说明 Dart 代码里有一层 `utils/` 目录，且 `ffi_io.dart` 负责 FFI 的 I/O 封装（对应 libmpvclient.so 的加载）。

### 混淆后的命名

- 应用类名：`bza`、`_Qr`、`oKa`、`zZ`…（1–3 字符）
- 框架类名保持原样：`MethodChannel`、`Expando`、`FragmentProgram`、`_GrowableList`
- 私有成员：`_yUb@308332722`（名字 + 库 ID）

### 反汇编样例（`asm/aHh.dart`）

```dart
class bza extends Object {
  iza<Y0> call<Y0 extends UB?>(bza, (dynamic, fza<Y0>) => Y0, {String? name, Iterable<hPa>? zYc}) {
    // ** addr: 0x707d1c, size: 0x1f8
    // 0x707d1c: stp  fp, lr, [SP, #-0x10]!
    // 0x707d28: SetupParameters(bza this /* r4, fp-0x28 */, ...)
    ...
  }
}
```

每行机器码都带注释（`SetupParameters`、`AllocStack`、对象池引用 `[pp+0x66e0] "name"`），
足以还原控制流与常量。

## 复现

```bash
# blutter 需要与 APK 同版本的 Dart runtime
python blutter.py <apk>/lib/arm64-v8a out/
# 或在 Windows/MinGW 下直接调用已编译的二进制（路径必须全 ASCII）
blutter_dartvm3.3.3_android_arm64.exe -i libapp.so -o out/
```

> ⚠️ blutter 使用 `std::filesystem`，在中文路径下会抛
> `filesystem error: Cannot convert character sequence`，必须把 `libapp.so` 与输出目录放在纯 ASCII 路径。
