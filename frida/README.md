# frida/ — 动态验证脚本

| 文件 | 说明 |
| --- | --- |
| `hooks.js` | 注入脚本：Java 层 Intent/通道 + native 层 libmmr/libmpvclient/libmpv |

## 快速使用

```bash
# 需要 root 的 frida-server（arm64，版本与主机 frida 一致）
adb push frida-server /data/local/tmp/ && adb shell "su -c '/data/local/tmp/frida-server &'"

frida -U -f xyz.re.player.ex -l frida/hooks.js --no-pause
```

hook 的偏移全部来自 `native/disasm/` 的静态还原，含义见
[`docs/10-native-reimpl.md`](../docs/10-native-reimpl.md)；
完整验证步骤与预期输出见 [`docs/12-dynamic-playbook.md`](../docs/12-dynamic-playbook.md)。

## 覆盖点

1. `MainActivity.onCreate`：外部 Intent 的 action / data / extras
2. `MethodChannel.invokeMethod`：Dart→Kotlin 全量调用
3. `libmmr.so+0x1678` `get_frame_at_time`：截帧时间单位（验证 [存疑]）
4. `libmmr.so+0x1ddc` `get_audio_track`：音频轨 +0x08/+0x0c 字段（验证 [存疑]）
5. `libmpvclient.so+0xa63c` `smb_url_parse`：SMB URI 是否含明文密码（S-11）
6. `libmpv.so` `mpv_command_async`：loadfile 目标（协议面）
