# 12 · 真机动态验证 Playbook

> 目标：用一台 Android 真机坐实静态分析留下的 **[存疑]** 项，并补全协议映射。
> 本文配套 [`frida/hooks.js`](../frida/hooks.js)，所有 hook 偏移来自
> [`native/disasm/`](../native/disasm/) 的静态还原。

## 0. 前置

| 项 | 要求 |
| --- | --- |
| 手机 | arm64，Android 8+（Android 13 最佳，能覆盖 targetSdk 33 行为） |
| adb | `adb devices` 能看到设备，已开启 USB 调试 |
| frida-server | 与主机 frida 版本一致，arm64 版本 |
| 主机 frida | `pip install frida-tools` |
| 待测 APK | 原版 `arm64-v8a-release-v1.8.9.apk` 或加固版 `patches/out/Reex-1.8.9-hardened.apk` |

```bash
# 1) 安装
adb install -r patches/out/Reex-1.8.9-hardened.apk

# 2) 推送并启动 frida-server（需要 root）
adb push frida-server /data/local/tmp/
adb shell "su -c 'chmod 755 /data/local/tmp/frida-server'"
adb shell "su -c '/data/local/tmp/frida-server &'"

# 3) 确认进程可见
frida-ps -U | grep -i reex
```

## 1. 启动并注入

```bash
frida -U -f xyz.re.player.ex -l frida/hooks.js --no-pause
```

预期日志：

```
[re] hooked libmmr.so+1678 get_frame_at_time
[re] hooked libmpvclient.so+a63c smb_url_parse
[re] libmpv symbols hooked
[re] MainActivity.onCreate
[channel] getStorageVolumes null
```

## 2. 验证清单（按优先级）

> ⚠️ **前置更正**：`libmmr.so` 在本版本 APK 中**没有被任何代码引用**（详见 docs/10 §2）。
> 所以 V1/V2 是**对该库 ABI 的独立验证**（把它当成一个可复用的组件来测），
> 不代表应用实际行为；应用真正的元数据/封面/截图走 mpv 属性（V5 里顺带观察）。

### ✅ V1 截帧时间单位（对应 docs/10 [存疑] #2，**独立 ABI 测试**）

**操作**：`frida/verify_abi.js` 会直接调用 `media_metadata_retriever_get_frame_at_time`，
传入 pos=0/2/2000/5000，比较返回的 JPEG 大小：

- pos=2 与 pos=0 结果**相同**、pos=2000 不同 → 单位是**毫秒**；
- pos=2 与 pos=0 **不同**、pos=2000 返回 NULL → 单位是**秒**。

**也可**：进入媒体库，让应用为视频生成缩略图（观察是否触发；预期**不会**触发 libmmr）。

**观察**：

```
[mmr] get_frame_at_time pos=5000 w=0 h=0
```

- 若 `pos` 是 **毫秒**（5000 = 5 秒）→ 说明 Dart 传毫秒；
  此时如果缩略图总是首帧/黑帧，则可确认内部 `av_rescale` 少除了 1000（原版 bug）。
- 若 `pos` 是 **秒**（5、30 之类小值）→ 单位一致，无问题。

**结论记录**：pos 单位 = ______；缩略图是否正确 = ______。

### ✅ V2 音频轨字段（对应 docs/10 [存疑] #1，**独立 ABI 测试**）

**操作**：`verify_abi.js` 用 2 声道/44.1 kHz 的 WAV 调用 `get_audio_track`，
直接打印结构体 +0x08/+0x0c（以及 type/codec 字符串）。

> 若应用不加载 libmmr，脚本会用 `Module.findBaseAddress` 等待——可以用
> `frida -H 127.0.0.1:27042 -l frida/verify_abi.js` 时手动 `dlopen` 触发，或接受 `not loaded` 的结果。

**另一条路径（真实播放）**：播放一首已知参数的音频，观察 `[channel]` 与 mpv 的 `track-list` 属性。

**观察**：

```
[mmr] audio_track +0x08=<A> +0x0c=<B>
```

- 若 `+0x0c` ≈ 2 且 `+0x08` ≈ 44100 → 字段语义与作者命名一致（但偏移与 FFmpeg 7.0 头文件不符，
  说明构建时用了不同的头文件版本）。
- 若两者是乱值（如 0、-1、巨大数）→ 证实是 ABI 偏移错误，属于原版缺陷。

**结论记录**：A = ______，B = ______，是否符合预期 = ______。

### ✅ V3 SMB 凭据是否进 URI/日志（对应 S-11）

**操作**：添加一个 SMB 源并播放其中视频。

**观察**：

```
[mpvc] smb_url_parse uri=smb2://{"server":"192.168.1.10","share":"media",...}
[mpv] mpv_command_async loadfile smb2://{"server":...} ...
```

若日志中出现完整 JSON（含 `password`），即证实凭据在 URI 中。

**进一步**：`adb shell` 进入应用目录读取 `mpv_logs.jsonl`（需 root 或 debuggable 版）：

```bash
adb shell "su -c 'grep -o "password[^,]*" /data/data/xyz.re.player.ex/files/mpv_logs.jsonl | head'"
```

**结论记录**：日志是否含明文密码 = ______。

### ✅ V4 通道调用全量抓取（对应 docs/11）

**操作**：遍历主要页面：首页 → 媒体库 → 网络共享 → 播放 → 设置 → 画中画。

**观察**：所有 `[channel] <method>` 行即为 Dart→Kotlin 的真实调用序列。
可与 [`docs/11-protocol-map.md`](11-protocol-map.md) 的方法表对照，
补充静态分析没覆盖到的分支（例如错误处理路径）。

### ✅ V5 播放管线确认

**观察** `[mpv]` 行：

- 本地文件：`loadfile /storage/.../a.mkv`
- SMB：`loadfile smb2://{...}`
- WebDAV/FTP：`loadfile https://...` / `ftp://...`

再配合 `libmpvclient` 的 `register_mpv_stream_cb_dart` 日志，可确认哪些协议走 Dart 流、哪些走原生流。

## 3. 数据落盘（可选，需 root）

```bash
adb shell "su -c 'ls -l /data/data/xyz.re.player.ex/files/'"
adb shell "su -c 'cp /data/data/xyz.re.player.ex/files/reex.sqlite /sdcard/'"
adb pull /sdcard/reex.sqlite
sqlite3 reex.sqlite '.schema'        # 得到完整建表语句 → 补齐 docs/10 的数据模型
```

> 若手机未 root：用 `--debuggable` 重新打包（可在 `patches/apply_patches.py` 里加一行
> `android:debuggable="true"`），然后 `adb shell run-as xyz.re.player.ex cat files/reex.sqlite`。

## 4. 常见问题

| 现象 | 处理 |
| --- | --- |
| `Failed to spawn: unable to find process` | 包名核对；或先手动打开 App 再用 `frida -U "Reex" -l hooks.js` |
| hook 未触发 | 检查 `Module.findBaseAddress` 是否为 null（库未加载），把注入延后到 `libmmr.so` 加载后 |
| 应用闪退 | 关闭 `--no-cleartext` 的包；或先只用 Java hook 定位 |
| SMB 无法连接 | 确认手机与 NAS 同网段；SMB1 不支持（libsmb2 只做 SMB2/3） |

## 5. 回填方式

把 V1–V3 的结论回填到：

- `docs/10-native-reimpl.md` 的 [存疑] 标注
- `docs/09-security.md` 的 S-11 状态
- `README.md` 的关键发现

并把新的 `[channel]` 日志整理进 `docs/11-protocol-map.md` 的附录（如果有新增）。
---

## 6. 无线调试（USB 不通时的备用通道）

本机在 Windows 10 上实测遇到：手机（REDMI K90，`VID_18D1&PID_4E11`）能枚举，
绑定 Google USB 驱动后仍是 **Code 10（CM_PROB_FAILED_START）**，adb 看不到设备。
此时改用无线调试最快：

1. 手机与电脑连同一个 Wi-Fi（本机 `192.168.1.9`）；
2. 手机：开发者选项 → **无线调试** → 打开 → “使用配对码配对设备”，记下 `IP:端口` 与 6 位配对码；
3. 电脑：

```bash
adb pair 192.168.1.x:37123 123456    # 手机屏上的配对码
adb connect 192.168.1.x:5555        # 手机屏上的 IP:端口
adb devices
```

4. 之后直接：

```bash
python tools/device_run.py --adb <adb路径> \
    --pair 192.168.1.x:37123 123456 --connect 192.168.1.x:5555
```

> 无线调试不需要 USB 驱动；frida-gadget 注入版 APK 同样适用（adb forward 走 TCP）。
