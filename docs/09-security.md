# 09 · 安全与合规审计

> 审计对象：Reex 1.8.9（`xyz.re.player.ex`，SHA-256 `d71d4ac3…a483ff`）
> 方法：**纯静态**——Manifest 解码、jadx 反编译源码、Dart 对象池字符串、ELF 符号。
> 未做动态验证（本机无 VT-x，无法跑模拟器；见文末"局限性"）。
> 证据均给出仓库内路径与行号，可逐条复核。

## 1. 结论摘要

| 编号 | 发现 | 严重度 | 影响面 |
| --- | --- | --- | --- |
| S-01 | 全局允许明文 HTTP（`usesCleartextTraffic=true`） | 中 | 网络播放/WebDAV 可被中间人 |
| S-02 | 无证书固定；内置 140 张 CA 证书 | 低 | 依赖系统 CA 体系 |
| S-03 | 外部应用可注入播放 URI 与任意 HTTP 头 | 中 | 任意 App → Reex 发起带自定义头的请求 |
| S-04 | 权限面过宽（`MANAGE_EXTERNAL_STORAGE` + `SYSTEM_ALERT_WINDOW`） | 中 | 合规/商店政策；滥用面 |
| S-05 | `allowBackup` 未关闭（默认 true） | 低 | 应用数据可被备份导出 |
| S-06 | 悬浮窗在 Android 8.0 以下用 `TYPE_PHONE` | 低 | 需 `SYSTEM_ALERT_WINDOW`，行为受限 |
| S-07 | 凭据与媒体库同存于未加密的 `reex.sqlite` | 中 | 备份/root 场景下密码可读 |
| S-08 | FFmpeg 快照落后于 7.0.2/7.0.3 安全修复 | 中 | 恶意媒体文件可触发解析漏洞 |
| S-09 | mpv 日志落盘（`mpv_logs.jsonl`） | 低 | 可能含文件路径/URL |
| S-10 | 内置 WebView 支持 JS（仅应用内可拉起） | 信息 | 攻击面很小 |
| S-11 | **SMB 凭据被编码进播放 URI**，会进入 mpv 日志 | 中高 | 明文密码落盘/外泄 |
| C-01 | **LGPL 合规缺口**：FFmpeg 无许可文本、无源码获取途径 | 中 | 分发合规风险 |

**总体评价**：这是一个"工具型"应用，没有账号体系、没有遥测、没有动态代码加载，
攻击面主要是 **本地媒体解析（FFmpeg）** 与 **外部 Intent 契约**。
真正需要关注的是 S-03/S-07/S-08 与 C-01。

---

## 2. 详细发现

### S-01 全局明文流量

```xml
<!-- decompiled/apktool/AndroidManifest.xml -->
<application android:usesCleartextTraffic="true"
             android:networkSecurityConfig="@xml/network_security_config">
```

```xml
<!-- res/xml/network_security_config.xml -->
<base-config cleartextTrafficPermitted="true">
  <trust-anchors><certificates src="system" /></trust-anchors>
</base-config>
```

- **影响**：所有 `http://` 流、WebDAV、FTP-over-HTTP 都可被中间人篡改（播放内容替换、封面替换）。
  播放器场景下这是"合理的功能取舍"，但对隐私敏感用户是风险。
- **建议**：改为 `cleartextTrafficPermitted="false"` + `domain-config` 白名单，
  仅对用户手工添加的 http 源放行。

### S-02 无证书固定 + 140 张内置 CA

- `assets/flutter_assets/assets/cacert.pem`：**140 张证书**，222,477 字节，是标准 Mozilla CA 包。
- 用途推断：给 `dio` 的 `SecurityContext` 用，修复 Android 7.0 以下系统根证书过旧导致的 HTTPS 失败。
- **影响**：没有 pinning（本来也没有自家服务端），风险取决于用户访问的第三方服务。
- **说明**：这不是"信任任意证书"，包里没有自签证书；`strings.txt` 中也没有
  `badCertificateCallback`/`onBadCertificate` 相关证据。

### S-03 外部 Intent 契约（重点）

`MainActivity` 导出，且注册了 URL/视频/文本四类 filter。它把启动 Intent 原样交给 Dart：

```java
// decompiled/jadx-src/e2/t0.java:8-17
public static final HashMap<String, Object> a(Intent intent) {
    String title = intent.getStringExtra("reex.extra.title");   // 回退 "title"
    return map(
        "title",      title,
        "uriString",  intent.getDataString(),
        "httpHeader", intent.getStringExtra("reex.extra.http_header"),
        "subtitle",   intent.getStringExtra("reex.extra.subtitle"));
}
```

```java
// decompiled/jadx-src/e2/i0.java:22 —— 新任务投递也走 getDataString()
if (intent.getDataString() == null) { ... }
```

`AndroidChannel` 还向 Dart 暴露了 `StartedIntentChannel.{getStringExtra,type,package,scheme,dataString,action}`
（见 `decompiled/jadx-src/e2/e.java`），即**启动 Intent 的全部字段都可被 Dart 读取**。

- **影响**：任意已安装应用可对 Reex 发 `ACTION_VIEW`，指定任意 URI + 任意 `http_header`，
  让 Reex 以"受害者身份"发起带攻击者指定头的请求（Cookie/Authorization 注入、
  对内网地址发起请求、加载 `file://` 路径）。
  由于请求方是本机 App（无服务端凭据），实际危害有限，但**属于权限混淆**。
- **建议**：对 `http_header` 做白名单（只允许 Referer/User-Agent），
  对 `file://`/`content://` 校验调用方或改由用户确认。

### S-04 权限面过宽

| 权限 | 实际用途（代码证据） |
| --- | --- |
| `MANAGE_EXTERNAL_STORAGE` | `e2/e.java:453` `Environment.isExternalStorageManager()`、`e2/j0.java:246` —— 全盘文件访问，用于任意目录播放 |
| `SYSTEM_ALERT_WINDOW` | `e2/s0.java` + `e2/r0.java` 悬浮窗播放器 |
| `CHANGE_WIFI_MULTICAST_STATE` | `nsd` 包的 SSDP/mDNS 发现（DLNA） |
| `READ_MEDIA_VIDEO/AUDIO` | MediaStore 扫描 |

- `MANAGE_EXTERNAL_STORAGE` 在 Google Play 上需要专项审核；本 App 非商店分发，属自选路径。
- 权限使用点与声明是**匹配**的（没有发现声明却完全不用的权限）。

### S-05 `allowBackup` 默认开启

`AndroidManifest.xml` 的 `<application>` **没有** `android:allowBackup`，
targetSdk 33 下默认 `true`，且没有 `dataExtractionRules`/`fullBackupContent`。

- **影响**：`reex.sqlite`、SharedPreferences（播放历史、源配置）可被云备份或 `adb backup` 导出。
- **建议**：`android:allowBackup="false"`，或提供 `dataExtractionRules` 排除含凭据的表。

### S-06 悬浮窗实现细节

```java
// decompiled/jadx-src/e2/r0.java:273-278
WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
lp.type  = Build.VERSION.SDK_INT >= 26 ? 2038 /* TYPE_APPLICATION_OVERLAY */ : 2002 /* TYPE_PHONE */;
lp.flags = 8;   // FLAG_NOT_FOCUSABLE
lp.gravity = 8388693;
```

- Android 8.0+ 使用 `TYPE_APPLICATION_OVERLAY`（正确）；8.0 以下退化为 `TYPE_PHONE`（需悬浮窗权限，可用但已废弃）。
- `FLAG_NOT_FOCUSABLE`：悬浮窗不抢焦点，符合预期。
- 布局 `R.layout.video_popup_view` 含关闭/返回按钮 + 进度条，无输入控件被滥用风险。

### S-07 凭据存储

Dart 字符串给出数据库名与版本：

```
reex.sqlite
PRAGMA user_version = 10;
```

SMB/WebDAV/FTP 源需要用户名与密码（`dart/blutter/strings.txt` 中有 `用户名/密码/端口/域`、
`smb2_set_password`、`password: ` 等）。**没有任何加密/密钥库（Keystore）相关字符串**，
推断凭据以明文列存储在 `reex.sqlite` 里。

- **影响**：root、备份导出、或设备被取证时可读；不影响正常使用。
- **建议**：用 `EncryptedSharedPreferences`/`androidx.security`，或至少 `SQLCipher`；
  仅做个人使用时，把 `allowBackup` 关掉即可显著降低风险。

### S-08 依赖漏洞（FFmpeg）

- `libavcodec.so` 内嵌版本串：`FFmpeg version git-2024-03-27-1ad0e81f38`
  （≈ 7.0 发布前一周的 master 快照）。
- 按 FFmpeg 官方安全页（<https://ffmpeg.org/security.html>），7.0.2 / 7.0.3 修了如下 CVE，
  **本快照必然不包含**：

  | 版本 | CVE |
  | --- | --- |
  | 7.0.2 | CVE-2024-7055 |
  | 7.0.3 | CVE-2023-6602、CVE-2023-6604、CVE-2023-6605、CVE-2024-35368、CVE-2025-0518、CVE-2025-1594、CVE-2025-1816、CVE-2025-22919、CVE-2025-59728 |

- **影响**：播放器必然要解析不可信媒体文件，这些漏洞多为解复用/解码路径的内存破坏，
  可导致崩溃甚至代码执行（在应用沙箱内）。
- **建议**：升级到 FFmpeg 7.0.3+/7.1 并重新编译 mpv；或在打开来源可疑的文件时提示用户。

> libsmb2 3.1.1 与 mpv 本体：检索未发现公开 CVE 记录，但 mpv 的解析路径依赖 FFmpeg，
> 风险等同上述条目。

### S-09 日志落盘

Dart 侧字符串含 `mpv_logs.jsonl`、`mpv_request_log_messages`、`brieflyShowPassword`。
mpv 日志会包含被播放文件的 URL/路径（可能含 SMB 用户名）。

- **建议**：日志文件名与内容做脱敏；设置里提供"清除日志"（已有"清理缓存/清理成功"文案，可复用）。

### S-10 内置 WebView

`io.flutter.plugins.urllauncher.WebViewActivity`：

```java
// decompiled/jadx-src/io/flutter/plugins/urllauncher/WebViewActivity.java:123-126
this.f3430g.getSettings().setJavaScriptEnabled(booleanExtra);
this.f3430g.getSettings().setDomStorageEnabled(booleanExtra2);
this.f3430g.getSettings().setSupportMultipleWindows(true);
```

- 该 Activity **`exported=false`**，只能被应用自己拉起；JS 开关由 Dart 传入。
- 没有 `addJavascriptInterface`，无 JS 桥泄漏风险。

### S-11 SMB 凭据进入 URI 与日志（本次反汇编新发现）

`libmpvclient.so` 的 SMB 流协议把**整个凭据对象序列化成 JSON 塞进 URI**：

```c
// native/pseudo/libmpvclient.c（对应 libmpvclient.so +0xa63c）
strncpy(buf, uri + 7, strlen(uri) - 7);    // 跳过 "smb2://"
cJSON *root = cJSON_Parse(buf);            // 剩余部分必须是 JSON
server/share/path 必填，username/password/domain 可选
```

真实播放地址形如：

```
smb2://{"server":"192.168.1.10","share":"media","path":"/a/b.mkv",
        "username":"u","password":"p","domain":"WORKGROUP"}
```

- **影响**：mpv 会在日志/错误信息中打印"文件名"（即整条 URI），
  而应用开启了 `mpv_request_log_messages` 并把日志写进 `mpv_logs.jsonl`。
  因此 **NAS 明文密码会落盘**，并可能随错误日志被分享/上传。
- 该 URI 还会出现在：
  - 播放历史/最近播放（若按 URI 存库）
  - 崩溃堆栈、截图分享
- **建议**：改用 `mpv_stream_cb_add_ro` 的自定义协议名传 opaque token（指针），
  凭据放内存结构体；或至少对日志做 `password` 字段脱敏。
- **证据**：`native/disasm/libmpvclient.txt` 中 0xa63c 起；`native/libmpvclient.h` §3。

---

## 3. 未发现的问题（同样重要）

| 检查项 | 结果 |
| --- | --- |
| 动态代码加载（DexClassLoader/插件化） | **未发现**；只有 `System.loadLibrary`（flutter/sqlite3/mpvclient/mpv） |
| `android:debuggable` | 未设置（release） |
| 备份组件 / BackupAgent | 无自定义实现 |
| 导出组件最小化 | Service、FileProvider、WebViewActivity 均 `exported=false` |
| FileProvider 路径 | 仅 `cache/AudioCovers`、`cache/VideoCovers`（FileProvider 声明部分）；另有 `files/image_provider/` 配置 |
| 明文存储的第三方密钥 | 未发现（无账号体系，无硬编码 API key） |
| 原型污染/JS 桥 | 无 |

---

## 4. 合规审计（C-01：LGPL）

| 组件 | 许可 | APK 内是否提供许可文本 |
| --- | --- | --- |
| libmpv | LGPL-2.1+（或 GPL，取决于构建） | ✅ `assets/flutter_assets/license/libmpv` |
| libsmb2 | LGPL-2.1+ | ✅ `assets/flutter_assets/license/libsmb2` |
| **FFmpeg（8 个 libav*/libsw*）** | **LGPL-2.1+ / GPL** | ❌ **未提供** |
| libplacebo | LGPL-2.1+ | ❌ 未提供 |
| Flutter/Dart | BSD-3 | ✅（NOTICES） |
| SQLite | Public Domain | — |

**缺口**：`NOTICES.Z` 中 **0 次** 出现 `FFmpeg`/`libavcodec`/LGPL 文本（见 `dart/NOTICES.txt`），
而分发 LGPL 库必须附许可文本与版权声明，并提供获取源码的途径（LGPL-2.1 §6）。
本应用通过动态链接（`.so` 独立文件）满足了"可重新链接"的技术条件，但**书面合规仍缺失**。

> 这不是"安全问题"，但如果要把本项目开源发布，建议同时补一份 `THIRD_PARTY_NOTICES.md`，
> 说明这些库的版本与源码地址。

---

## 5. 加固建议（针对自用/重打包）

按投入产出排序：

1. `android:allowBackup="false"`（1 行改动，消除 S-05/S-07 的大部分风险）
2. 收窄明文流量：仅允许用户显式添加的 http 源
3. `http_header` extra 白名单化（S-03）
4. FFmpeg 升级（S-08）——需要重编 mpv，成本最高
5. 日志脱敏（S-09）

以上 1/3/5 可以在 **smali 层**直接改（见 `docs/07-rebuild.md` 的重打包流程），
不需要 Dart 源码。

---

## 6. 局限性

- 全部结论来自静态分析；未在真机/模拟器上验证（本机 CPU 无 VT-x，模拟器不可用）。
- S-07（凭据明文）是**强烈推断**而非实证：需要 root 后导出 `reex.sqlite` 才能确认。
- FFmpeg CVE 列表取自官方安全页，是否可触发取决于具体编解码器是否被编入
  （本 APK 为全量构建，`libavcodec.so` 12 MB，基本可认为全功能）。
