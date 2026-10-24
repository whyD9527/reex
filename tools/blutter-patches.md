# blutter 在 Windows/MinGW 下的编译补丁

目标：用 **MSYS2 UCRT64 + GCC 16.2 + CMake 4.4 + Ninja** 编译 blutter 及其 Dart 3.3.3 运行时。
官方支持矩阵是 MSVC / Linux / macOS，以下 4 处补丁是在 GCC 下通过编译的最小集合。

## 环境

```bash
pacman -S mingw-w64-ucrt-x86_64-gcc mingw-w64-ucrt-x86_64-cmake \
          mingw-w64-ucrt-x86_64-ninja mingw-w64-ucrt-x86_64-pkgconf \
          mingw-w64-ucrt-x86_64-capstone mingw-w64-ucrt-x86_64-icu git
```

## 补丁 1 — `runtime/vm/os_thread_win.h`

MSVC 接受在 `friend class Mutex;` 之后直接用 `Mutex*` 声明静态成员；GCC 要求真正的声明。

```diff
 namespace dart {
 
+class Mutex;
+
 typedef DWORD ThreadLocalKey;
```

## 补丁 2 — `runtime/platform/globals.h`

MinGW 的 `<windows.h>`（经 COM 头）定义了 `#define interface struct`，
与 Dart 中大量 `Type& interface = ...` 冲突。

```diff
 #include <windows.h>
 #include <winsock2.h>
+#if defined(interface)
+#undef interface
+#endif
 #endif  // defined(_WIN32)
```

## 补丁 3 — `runtime/vm/os_win.cc`

宏名拼写错误，导致 GCC 走到 MSVC 的 `__asm { int 3 }` 分支。

```diff
 #if defined(_MSC_VER)
   __debugbreak();
-#elif defined(__GCC__)
+#elif defined(__GNUC__)
   __builtin_trap();
```

## 补丁 4 — 函数指针与 `void*` 互转

MSVC 允许隐式转换；GCC 必须显式 `reinterpret_cast`。

`runtime/vm/unwinding_records_win.cc`：

```diff
-  auto function = static_cast<decltype(&::RtlAddGrowableFunctionTable)>(
+  auto function = reinterpret_cast<decltype(&::RtlAddGrowableFunctionTable)>(
       UnwindingRecordsPlatform::GetAddGrowableFunctionTableFunc());
```

`runtime/platform/unwinding_records_win.cc`：

```diff
 void* UnwindingRecordsPlatform::GetAddGrowableFunctionTableFunc() {
-  return add_growable_function_table_func_;
+  return reinterpret_cast<void*>(add_growable_function_table_func_);
 }
```

## 补丁 5 — 链接库

`scripts/CMakeLists.txt`（Dart VM 静态库）：

```diff
 if (MSVC)
   target_link_libraries(${LIBNAME} PUBLIC ${ICU_LIBRARIES})
+elseif (WIN32)
+  target_link_libraries(${LIBNAME} PUBLIC pthread ${ICU_LIBRARIES} ws2_32 bcrypt dbghelp advapi32 userenv version psapi)
 else()
   target_link_libraries(${LIBNAME} PUBLIC dl pthread ${ICU_LIBRARIES})
 endif()
```

## 另有两点非代码问题

1. **Dart 源码不能由 blutter 自动 git clone**：codeload 可用、`git clone` 常超时，
   可先下载 `https://codeload.github.com/dart-lang/sdk/tar.gz/refs/tags/3.3.3`
   解包到 `blutter/dartsdk/v3.3.3`，并先生成 `runtime/vm/version.cc`：
   ```bash
   cd dartsdk/v3.3.3
   python tools/make_version.py --output runtime/vm/version.cc --input runtime/vm/version_in.cc
   ```
   否则 blutter 会判定目录不完整并删除重来。
2. **ICU**：MSYS2 的 ICU 不带 `ICUConfig.cmake`，CMake 的 `find_package(ICU)`
   需要能找到 `C:/msys64/ucrt64/include/unicode` 与 `libicuuc`；
   必要时显式传 `-DICU_ROOT=C:/msys64/ucrt64`。
## 补丁 6 — blutter.py 在 MinGW 下的“重复重编”问题

`blutter.py` 判断 Dart VM 静态库是否已构建时，Windows 分支只看 `packages/<lib>.lib`：

```python
if os.name == 'nt':
    dartlib_file = os.path.join(PKG_LIB_DIR, input.dart_info.lib_name + '.lib')
```

MinGW 产出的是 `.a`（或 `lib<name>.a`），于是每次都判定“未构建”，
重新执行 `cmake_dart()` → 重写 `CMakeLists.txt` → ninja 全量重编 263 个文件（约 10 分钟）。

绕过办法（任选）：
1. 首次构建完成后，手动创建空文件 `packages/dartvm3.3.3_android_arm64.lib` 骗过检查；
2. 或绕过 `blutter.py`，直接执行它内部的 cmake 命令构建 `blutter` 可执行文件。

## 补丁 7 — capstone 头文件路径

MSYS2 的 `capstone.pc` 给的是 `-I<prefix>/include`，而 blutter 源码写的是 `#include <capstone.h>`。
需要在 `blutter/CMakeLists.txt` 的 pkg-config 分支追加子目录：

```diff
-	include_directories(AFTER ${CAPSTONE_INCLUDEDIR})
+	include_directories(AFTER ${CAPSTONE_INCLUDEDIR} ${CAPSTONE_INCLUDEDIR}/capstone)
```

运行时还需要把 `C:\msys64\ucrt64\bin` 加进 `PATH`（ICU/capstone 的 DLL）。
