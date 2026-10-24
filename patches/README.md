# patches/ — 加固补丁流水线

对反编译产物做 **资源/smali 层** 的定点修改，重新打包并签名。
不依赖 Dart 源码，也不需要原始工程。

## 补丁清单

| 编号 | 补丁 | 对应审计项 | 默认 | 副作用 |
| --- | --- | --- | --- | --- |
| P1 | `android:allowBackup="false"` | S-05 / 缓解 S-07、S-11 | ✅ 开启 | 无（云备份/ adb backup 被禁用） |
| P2 | 外部 `reex.extra.http_header` 改名禁用 | S-03 | ⬜ `--strict-intent` | 外部应用无法再注入自定义 HTTP 头；**依赖自定义头的流可能播放失败** |
| P3 | 关闭全局明文流量 | S-01 | ⬜ `--no-cleartext` | `http://` 流、明文 WebDAV 不可用 |

> 为什么只做这三项：其余发现（S-07 凭据明文、S-11 凭据进 URI、S-08 FFmpeg 版本）
> 要么在 Dart AOT 里、要么在预编译 .so 里，smali 层改不动——已在
> [`docs/09-security.md`](../docs/09-security.md) 里给出替代方案（关备份、限权限、升级 FFmpeg 重编）。

## 用法

```bash
python patches/apply_patches.py \
    --src decompiled/apktool \
    --out patches/out/Reex-1.8.9-hardened.apk \
    --apktool /path/to/apktool.jar \
    --build-tools /path/to/build-tools/34.0.0 \
    --strict-intent
```

可选参数：

- `--strict-intent`：启用 P2
- `--no-cleartext`：启用 P3
- `--dry-run`：只打印补丁结果，不构建
- `--keystore` / `--storepass`：复用已有签名密钥（默认自动生成）

脚本会：复制到 ASCII 临时目录（apktool 不支持非 ASCII 路径）→ 打补丁 → `apktool b` →
`apksigner sign`（v1+v2+v3）→ `apksigner verify`。

## 本次产物（已实测）

| 文件 | 大小 | 说明 |
| --- | --- | --- |
| `out/Reex-1.8.9-hardened.apk` | 22,151,848 B | P1+P2，已签名 |
| `out/Reex-1.8.9-hardened.apk.idsig` | 181,750 B | v4 签名附属文件 |
| `out/reex-hardened.keystore` | 2,692 B | 自动生成的测试密钥（口令 `reexhardened`） |

校验结果：

```
Signed with v1/v2/v3
Signer #1 certificate DN: CN=Reex Hardened, OU=RE, O=RE, L=NA, ST=NA, C=CN
android:allowBackup = "false"        （已生效）
android:usesCleartextTraffic = "true"（未改动，P3 未启用）
classes.dex 含 "reex.extra.http_header.disabled"
```

## 安装

```bash
adb install -r patches/out/Reex-1.8.9-hardened.apk
```

签名与原版不同，必须先卸载原版（会丢数据），或将来自行改包名共存
（注意 Dart 侧硬编码通道名，改包名会导致原生功能全失效，见 docs/07）。
