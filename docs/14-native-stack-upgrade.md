# 14 · 原生栈升级评估

> 评估时间：2026-10-24 · 对象：Reex 1.8.9 内置的 arm64 原生栈
> 结论先行：**不建议在原 APK 上原地升级**；如果要做，只有 `libsmb2` / `sqlite3` 值得单独替换，
> 且必须先在真机上做回归（我们已有全套验证工具）。

---

## 1. 现状快照（从 APK 实测）

| 组件 | 版本/证据 | 说明 |
| --- | --- | --- |
| FFmpeg（8 个 .so） | `git-2024-03-27-1ad0e81f38`，ABI `LIBAVCODEC_61` = **7.0 分支** | clang 17 / LLD 17 构建 |
| mpv（`libmpv.so`） | 2024-03 的 mpv-android 构建（约 **v0.37** 时代） | 依赖 placebo / OpenSLES / EGL |
| libplacebo | API `6.338.0` / `7.347.0`（≈ **v7.347**） | |
| libsmb2 | **3.1.1** | 明显落后 |
| SQLite | **3.45.1** | |
| Flutter / Dart | Dart **3.3.3**（Flutter 3.19.x，2024-04） | AOT，不可重编 |
| Android | minSdk 23 / targetSdk **33** / compileSdk 34 / AGP 7.3.0 | |

---

## 2. 与最新版对比（2026-10）

| 组件 | 当前 | 最新 | 差距 |
| --- | --- | --- | --- |
| FFmpeg | 7.0-dev（ABI 61） | **9.0.2**（ABI 63；8.0 为 62） | 2 个大版本 |
| mpv | ~0.37（2024-03） | **v0.41.0**（2025-12） | 4 个小版本 |
| libplacebo | 7.347 | **v7.360.1**（2026-03） | 同大版本，小版本差 |
| libsmb2 | 3.1.1 | **6.3**（2026-10-21） | 3 个大版本 |
| SQLite | 3.45.1 | **3.54.0**（2026-10-09） | |
| Flutter/Dart | Dart 3.3.3 / Flutter 3.19 | **Flutter 3.47.8** | 与本题无关（无 Dart 源码） |

> 数据来源：ffmpeg.org/download（9.0.2）、GitHub releases（mpv v0.41.0 / libplacebo v7.360.1 /
> libsmb2 6.3）、sqlite.org（3.54.0）、docs.flutter.dev（3.47.8）。
> FFmpeg 的 ABI major 由各 tag 的 `libavcodec/version_major.h` 核对：7.0=61、8.0=62、9.0=63。

---

## 3. 四个评估维度

### 3.1 安全（最直接的升级理由）

- FFmpeg 7.0-dev（2024-03）之后，官方陆续修复了大量解复用/解码 CVE（见
  <https://ffmpeg.org/security.html> 的 7.0.2 / 7.0.3 / 8.x / 9.x 章节）。
  播放器**必然解析不可信媒体**，这是最高风险面。
- libsmb2 3.1.1 → 6.3 跨了 3 个大版本，包含 SMB2/3 协议与认证相关修复。
  该库被 **Dart 通过 FFI 直接调用**（24 个 `smb2_*` 函数），升级后行为/签名变化会直接影响应用。

### 3.2 ABI 兼容（最关键的约束）

> **Dart AOT 是预编译的，无法重新编译**，所以任何 .so 的替换都必须保持
> "被 Dart/Java 调用的那部分符号与语义"不变。

| 替换对象 | 谁在调用 | ABI 风险 | 判断 |
| --- | --- | --- | --- |
| `libmpv.so` + FFmpeg 全家 | Dart FFI（`mpv_*` 符号） | libmpv 的 client API 长期稳定；FFmpeg 只被 mpv 内部使用（`libmmr` 已确认死代码） | **中等**，可整组替换后冒烟测试 |
| `libsmb2.so` | Dart FFI 直调 24 个 `smb2_*` 函数 | 函数签名/结构体（`smb2_stat_64` 等）可能变化；Dart 侧 struct 布局写死 | **高**，必须逐头文件核对 |
| `libsqlite3.so` | Dart `sqlite3` 包（标准 C API） | SQLite C API 向后兼容极强 | **低**，可安全替换 |
| `libflutter.so` / `libapp.so` | — | 引擎与快照必须成对，且需要 Dart 源码 | **不可替换** |
| `libmmr.so` / `libmpvclient.so` 的 SMB 部分 | 无人调用（死代码） | — | 无关 |

### 3.3 Android 平台

| 项 | 现状 | 要求 | 影响 |
| --- | --- | --- | --- |
| targetSdk | 33 | Google Play 对新提交/更新要求 **API 36**（Android 16）；16KB 页适配自 2025-11 对 targetSdk 35+ 强制 | 仅在打算上架时重要；侧载无强制 |
| 16KB page size | **只有 3 个库合格**（见 §4） | Android 15+ 的 16KB 设备要求 `.so` 的 `PT_LOAD p_align >= 0x4000` | 在 16KB 设备上会**直接加载失败** |
| AGP / Gradle | 7.3.0 | 8.x | 只影响重编译，不影响运行 |

### 3.4 构建链

- mpv/FFmpeg/libplacebo 是一组（mpv-android 官方构建链），要升就整组升；
- libsmb2 是独立库，但**被 Dart FFI 绑死**，升级必须做接口对账；
- 16KB 对齐需要 NDK r28+（或 `patchelf` 后处理），现有库是 clang 17 构建的 4KB 对齐。

---

## 4. 16KB 页对齐实测（本仓库）

```
libapp.so            0x00010000  YES
libflutter.so        0x00010000  YES
libmpv.so            0x00010000  YES
libavcodec.so        0x00001000  NO
libavformat.so       0x00001000  NO
libavfilter.so       0x00001000  NO
libavutil.so         0x00001000  NO
libavdevice.so       0x00001000  NO
libswresample.so     0x00001000  NO
libswscale.so        0x00001000  NO
libplacebo.so        0x00001000  NO
libsmb2.so           0x00001000  NO
libsqlite3.so        0x00001000  NO
libmpvclient.so      0x00001000  NO
libmmr.so            0x00001000  NO
```

**含义**：在 16KB page 的设备（部分 2025+ 机型）上，这个 APK 会在 `dlopen` 阶段失败。
我们测试的 Redmi K90 是 4KB（`getconf PAGE_SIZE = 4096`），所以能跑。

---

## 5. 分组件建议

| 组件 | 是否建议升级 | 理由 | 动作 |
| --- | --- | --- | --- |
| **libsqlite3** | ✅ 推荐 | C API 稳定、3.45→3.54 有性能/安全修复 | 直接替换 `lib/arm64-v8a/libsqlite3.so`，跑 DB 读写冒烟 |
| **libsmb2** | ⚠️ 谨慎 | 3→6 跨度大，Dart FFI 写死签名/结构体 | 先拿 6.3 头文件逐个核对 24 个函数与 `smb2_stat_64`，再做真机 SMB 回归 |
| **mpv + FFmpeg + libplacebo** | ⚠️ 整组替换 | libmpv client API 稳定，但 FFmpeg ABI 61→63、placebo 小版本变化 | 整组替换为 mpv 0.41 + FFmpeg 9.0.2 + placebo 7.360，跑播放/字幕/SMB 冒烟 |
| **libflutter / libapp** | ❌ 不可 | 需要 Dart 源码 | — |
| **Android targetSdk** | 可选 | 侧载无强制；上架才需要 | 改 manifest 到 36 需回归行为变更（边到边、前台服务类型） |

---

## 6. 三条路线

### A. 保持现状（最稳，推荐给"日常使用"）

- 不换任何 .so；
- 缓解措施：只打开可信媒体、不启用 mpv 日志、关掉备份（已有 `patches/out/Reex-1.8.9-hardened.apk`）；
- 风险：FFmpeg/libsmb2 的已知 CVE 仍在。

### B. 选择性原地替换（推荐给"愿意折腾"）

1. `libsqlite3.so` → 3.54.0（低风险，先做）
2. `libsmb2.so` → 6.3（先做接口对账 + 真机 SMB 回归）
3. `libmpv.so` + FFmpeg 8 个 → mpv 0.41 构建（整组，最后做）

验证工具已经现成：`frida/verify_abi.js`（ABI）、`frida/trace_native.js`（mpv 命令）、
`tools/device_run.py`（安装+注入+抓日志）。每替换一个库，跑一遍：
播放本地 MP4 → 切换音轨/字幕 → 播放 SMB → 打开设置 → 检查崩溃。

### C. 重写时用新栈（长期）

| 层 | 目标版本 |
| --- | --- |
| Flutter / Dart | 3.47.8 / 对应 Dart |
| mpv | 0.41.0 |
| FFmpeg | 9.0.2 |
| libplacebo | 7.360.1 |
| libsmb2 | 6.3 |
| SQLite | 3.54.0 |
| NDK | r28+（16KB 对齐） |
| targetSdk | 36 |

---

## 7. 结论

1. **"原生栈是否需要升级"的答案是：是，但不适合在这个 APK 上直接升。**
   安全上确实落后 2–3 年（FFmpeg 7.0→9.0、libsmb2 3.1→6.3），
   但 Dart AOT 不可重编，任何 ABI 变化都会变成运行时崩溃，且没有源码可修。
2. **可安全先做的是 `libsqlite3` 替换**；`libsmb2` 需要接口对账；mpv/FFmpeg 必须整组替换并回归。
3. **16KB 页对齐是一个容易被忽略的硬伤**：15 个库里只有 3 个合格，
   在 16KB 设备上会直接加载失败——这一点比重不重要，因为它决定"能不能启动"。
4. 如果目标是"长期可维护"，正确做法不是给旧 APK 打补丁，而是
   **用 §6C 的新栈重写一个兼容 Reex 数据（`data/reex-schema.sql`）的播放器**。
