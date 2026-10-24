# 13 · 真机动态验证结果

> 设备：**Redmi K90（2510DRK44C / annibale）**，Android 17（SDK 37），arm64-v8a，KernelSU root
> 时间：2026-10-24
> 方法：无线 adb（USB 端口 Code 10 不可用）→ 安装注入版 APK（frida-gadget）→ Frida 17.24.3
> 产物：[`data/reex.sqlite`](../data/reex.sqlite)（空库）、[`data/reex-schema.sql`](../data/reex-schema.sql)、
> [`frida/verify_abi.js`](../frida/verify_abi.js)、[`frida/trace_native.js`](../frida/trace_native.js)

---

## 0. 连接与注入路线（踩坑记录）

| 步骤 | 结果 |
| --- | --- |
| USB 直连 | 枚举成功（`VID_18D1&PID_4E11`）但 Windows 报 **Code 10 / CM_PROB_FAILED_START**；装 Google ADB 驱动、重置 xHCI 均无效 → 放弃 USB |
| 无线调试 | `adb pair` + `adb connect 192.168.1.6:45745` 成功 |
| frida-server（root） | 能枚举进程，但 **ptrace 被拒**：`PermissionDeniedError: unable to access process`（即使 SELinux permissive） |
| MIUI 检测 | 日志出现 `force-stop-pfrida-server-p1init`，系统会因 frida-server 强杀目标应用 |
| **frida-gadget** | ✅ 可行：把 gadget 打进 APK，应用自己加载，不依赖 ptrace |

> 结论：**新 Android（14+）+ MIUI/HyperOS 下，免 root 的 gadget 注入是最稳的方案**，
> 与 docs/12 的判断一致。

---

## 1. V1 —— `get_frame_at_time`（独立 ABI 测试）

用 10 秒 H.264 MP4 调用：

```
duration = 0 us
video bit_rate = 34359738392   (0x800000008，明显是错位读)
video avg_fps  = 30.000        (正确)
video r_fps    = 30.000        (正确)
video codec    = h264          (正确)
pos=0    -> NULL
pos=2    -> NULL
pos=2000 -> NULL
pos=5000 -> NULL
attached_image = null
frame(jpg) = null
```

**结论**：
- `avg_frame_rate` / `r_frame_rate` / codec 名来自 `AVStream`（布局稳定）→ 读取正确；
- `duration`（`fmt+0x48`）与 `bit_rate`（`codecpar+0x38`）读到垃圾 → **结构体偏移与 FFmpeg 7.0 不符**；
- 截帧全部返回 NULL → **该函数在这套 FFmpeg 上不可用**。

时间单位问题因此**无法从行为上判定**（函数根本没输出），但它已无所谓：
`libmmr` 在应用里根本没被调用（见 §5）。

---

## 2. V2 —— 音频轨字段（独立 ABI 测试）

用 **2 声道 / 44.1 kHz** 的 WAV：

```
+0x08 = 0        ← 期望 sample_rate ≈ 44100
+0x0c = 0        ← 期望 channels = 2
+0x10 type  = audio
+0x18 codec = pcm_s16le
+0x20 long  = PCM signed 16-bit little-endian
```

**结论**：类型/编码名正确，但两个整型字段读的是 **0** —— 与静态分析的推断一致：
作者用的头文件版本与 FFmpeg 7.0 的 `AVCodecParameters` 布局不一致，
`codecpar+0x94` / `codecpar+0x74` 在 7.0 里分别落在 `ch_layout.u` 的高 32 位与 `color_trc`。

---

## 3. V3 —— SMB 凭据（**已确认**）

### 3.1 运行时抓到真实的 mpv 命令

给应用发一条带密码的 `smb2://` URI 后，Frida hook `mpv_command_async` 得到：

```
mpv_command_async: loadfile smb2://{"server":"10.0.0.5","share":"media",
                  "path":"/c.mkv","username":"u3","password":"SEKRET789"}
                  replace 0 stream-buffer-size=1MiB,cache=yes
```

**明文密码确实作为 URI 的一部分传给 mpv。** 这是 S-11 的直接证据。

### 3.2 原生解析器验证

直接调用 `libmpvclient.so+0xa63c`（`smb_url_parse`）也确认它按 JSON 解析出
`domain/username/password/server/share/path`。

### 3.3 日志落盘（条件性）

本次会话中 `files/mpv_logs.jsonl` **未生成** —— 说明 mpv 日志默认不落盘，
需要用户在设置里开启（应用里有对应开关与"错误日志"文案）。
因此 S-11 应表述为：

- **确定**：明文凭据进入 mpv 的 `loadfile` 参数；
- **条件**：开启日志后，该 URI 会写进 `mpv_logs.jsonl`。

---

## 4. 运行时的流协议（架构修正）

Frida hook `register_mpv_stream_cb_dart` 得到两条注册：

```
register_mpv_stream_cb_dart proto=smb2
register_mpv_stream_cb_dart proto=content
```

即 **Dart 自己实现了 `smb2` 与 `content` 两个 mpv 流协议**。

进一步在 Dart 字符串里找到 24 个 `smb2_*` 符号（`smb2_init_context`、
`smb2_connect_share_async`、`smb2_open_async`、`smb2_pread_async`、
`smb2_which_events`、`smb2_service`、`smb2_get_fd` …）以及 `libsmb2.so`。

**结论（对 docs/03、docs/10 的修正）**：

1. SMB 走的是 **Dart FFI → libsmb2.so**（异步 API 轮询）+ 自定义流协议，
   不是 `libmpvclient.so` 里的原生 SMB 流。
2. `libmpvclient.so` 的 `mpv_stream_cb_add_ro_smb2` / `smb_url_parse` **从未被调用**
   （Dart 字符串里没有该符号，disassembly 里也没有内部调用者）——与 `libmmr` 一样属于**死代码**。
3. 播放 SMB 时抓不到 `smb_url_parse` 的调用，正是因为走的是 Dart 那条路。

---

## 5. 数据库 schema（已还原）

文件：`/data/data/xyz.re.player.ex/files/reex.sqlite`（32 KB，`PRAGMA user_version = 10`）

```sql
CREATE TABLE extended_playlist_items (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  playlist_id INTEGER NOT NULL,
  title TEXT NOT NULL,
  "group" TEXT NULL,
  uri TEXT NOT NULL,
  subtitle TEXT NULL,
  http_header TEXT NULL,      -- ← S-03：自定义 HTTP 头被持久化
  key TEXT NOT NULL
);

CREATE TABLE extended_playlists (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  title TEXT NOT NULL,
  options TEXT NULL
);

CREATE TABLE network_accounts (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  kind INTEGER NOT NULL,
  server TEXT NOT NULL,
  username TEXT NULL,
  password TEXT NULL,         -- ← S-07：明文密码列
  port INTEGER NULL,
  domain TEXT NULL,
  share TEXT NULL,
  alias TEXT NULL
);

CREATE TABLE network_directory_favorites (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  network_account_id INTEGER NOT NULL,
  display_name TEXT NOT NULL,
  share TEXT NULL,
  path TEXT NOT NULL
);

CREATE TABLE playback_histories (
  unique_uri TEXT NOT NULL,
  player_value TEXT NOT NULL,
  platform_value TEXT NOT NULL,
  modified_time INTEGER NOT NULL,
  PRIMARY KEY (unique_uri)
);
```

**直接结论**：
- **S-07 确认**：`network_accounts.password` 是普通 `TEXT` 列，无加密；
- **S-03 扩展**：`extended_playlist_items.http_header` 说明自定义 HTTP 头会随播放列表**落库**，
  不只是 Intent 注入问题；
- 媒体库本身不在这张库里（只有收藏/历史/播放列表/网络账号），
  说明"本地媒体库"是实时扫描 MediaStore，不持久化（与 manifest 权限相符）。

---

## 6. 未完成项

| 项 | 原因 | 补救 |
| --- | --- | --- |
| Java 层 MethodChannel 抓包 | Frida 17 的 gadget 运行时**不含 Java bridge**（`typeof Java === undefined`，也没有 `require`） | 用 frida 16.x（自带 bridge）重建 gadget，或用 `frida-compile` 把 `frida-java-bridge` 打包进脚本 |
| 真实 SMB 文件播放 | 没有可用的 SMB 服务器 | 起一个 Samba 容器/另一台电脑共享即可 |
| mpv 日志落盘 | 需在应用设置里开启 | 打开"错误日志"开关后重放一次 SMB URI |
| USB 直连 | Code 10（链路层） | 换 USB 2.0 口/数据线，或继续用无线 |

---

## 7. 复现命令

```bash
# 1) 无线连接
adb pair 192.168.1.6:38295 <code>
adb connect 192.168.1.6:45745

# 2) 安装注入版（debuggable + gadget，127.0.0.1:27042）
adb install -r patches/out/Reex-1.8.9-analysis.apk
adb shell am start -n xyz.re.player.ex/.MainActivity
adb forward tcp:27042 tcp:27042

# 3) ABI 测试（V1/V2/V3）
python tools/device_run.py --skip-install --script frida/verify_abi.js --media media

# 4) 运行时抓 mpv 命令
frida -H 127.0.0.1:27042 -l frida/trace_native.js
adb shell sh /data/local/tmp/smb_intent.sh   # 内含带密码的 smb2:// URI

# 5) 取库
adb shell run-as xyz.re.player.ex cat files/reex.sqlite > reex.sqlite
```
