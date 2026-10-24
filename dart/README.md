# dart/ — Dart AOT 还原产物

| 路径 | 说明 |
| --- | --- |
| `pubspec.reconstructed.yaml` | 从 NOTICES 反推的依赖清单（版本未知，全部 `any`） |
| `blutter/` | blutter 对象池与反汇编输出（`pp.txt`、`objs.txt`、`asm/`、`blutter_frida.js`） |
| `strings/` | 从 `libapp.so` 提取的字符串（ASCII / UTF-16） |

说明：Flutter AOT 产物是机器码 + 序列化堆，**不存在**能还原成可编译 Dart 源码的工具。
本目录提供的是结构级证据：类、字段、函数、字符串、反汇编、调用图。
