# build/ — 重打包验证产物

| 文件 | 说明 |
| --- | --- |
| `Reex-1.8.9-repacked-signed.apk` | 由 `decompiled/apktool` 经 `apktool b` 重建、再用 `apksigner` 签名（v1+v2+v3） |

## 校验结果

```
Verifies
Verified using v1 scheme (JAR signing): true
Verified using v2 scheme (APK Signature Scheme v2): true
Verified using v3 scheme (APK Signature Scheme v3): true
Signer #1 certificate DN: CN=Reex RE, OU=Reverse, O=RE, L=NA, ST=NA, C=CN
```

- 原始 APK：22,097,606 B
- 重建未签名：22,100,894 B
- 重建已签名：22,151,848 B
- classes.dex 类数：2183 → 2183（无损）

## 安装

```bash
adb install -r Reex-1.8.9-repacked-signed.apk
```

与原版签名不同，覆盖安装前需先卸载原版（会清空应用数据）。
若需与原版共存，必须改包名，且要同步修改 Dart 侧硬编码的通道名（否则原生功能全部失效），
详见 [../docs/07-rebuild.md](../docs/07-rebuild.md)。

> 本 APK 仅用于验证「反编译产物可完整重建」，不含任何功能改动。
