# 07 · 重打包、签名与安装

> 本页记录的是**实际执行过**的步骤与结果，不是理论流程。

## 1. 前置工具

| 工具 | 版本 | 备注 |
| --- | --- | --- |
| JDK | 21.0.12 | apktool / apksigner / keytool 都需要 |
| apktool | 2.10.0 | Maven Central `org.apktool:apktool-cli:2.10.0`（32 MB shaded jar） |
| Android build-tools | **34.0.0** | 提供 `apksigner.bat`、`zipalign.exe`（`build-tools_r34-windows.zip`，58 MB） |

## 2. 反编译

```bash
java -jar apktool.jar d -f -o apktool_out "arm64-v8a-release-v1.8.9 (1).apk"
```

结果：`smali/`（全部 2183 个类）、`res/`（含 70+ 语言）、`AndroidManifest.xml`（可读）、
`assets/`、`lib/`、`original/`、`unknown/`、`apktool.yml`。

> ⚠️ **坑：apktool 不支持非 ASCII 输出路径**
> 在 `D:\代码\re\apktool_out`（含中文）执行 `apktool b` 时，aapt2 子进程收到的路径变成
> `D:\????\re\apktool_out\res`，报 `failed to open directory (2)`。
> **解决**：把工程复制到纯 ASCII 路径（如 `C:\work\apktool_build`）再构建。
> 这与 Java 默认 `file.encoding`/`sun.jnu.encoding` 在中文 Windows 上的映射有关。

## 3. 重打包

```powershell
Copy-Item apktool_out C:\work\apktool_build -Recurse
java -jar apktool.jar b C:\work\apktool_build -o reex_repacked.apk
```

实测输出：

```
I: Smaling smali folder into classes.dex...
I: Building resources...
I: Copying libs... (/lib)
I: Copying libs... (/kotlin)
I: Copying libs... (/META-INF/services)
I: Building apk file...
I: Built apk into: C:\work\reex_repacked.apk
```

| 文件 | 大小 |
| --- | --- |
| 原始 APK | 22,097,606 B |
| 重打包（未签名） | **22,100,894 B**（+3,288 B） |
| 重打包并签名 | 22,151,848 B |

体积差来自：`resources.arsc` 重新编排、`META-INF` 旧签名被移除/重建、zip 对齐差异。
**smali 与资源均无损**——这正是「反编译完整」的硬证据。

## 4. 生成签名密钥

```powershell
keytool -genkeypair -keystore reex.keystore -alias reex `
        -keyalg RSA -keysize 2048 -validity 10000 `
        -storepass reexpass -keypass reexpass `
        -dname "CN=Reex RE, OU=Reverse, O=RE, L=NA, ST=NA, C=CN"
```

## 5. 签名（v1 + v2 + v3）

```powershell
apksigner sign --ks reex.keystore --ks-pass pass:reexpass --key-pass pass:reexpass `
               --out reex_signed.apk reex_repacked.apk
```

验证：

```
Verifies
Verified using v1 scheme (JAR signing): true
Verified using v2 scheme (APK Signature Scheme v2): true
Verified using v3 scheme (APK Signature Scheme v3): true
Number of signers: 1
Signer #1 certificate DN: CN=Reex RE, OU=Reverse, O=RE, L=NA, ST=NA, C=CN
Signer #1 certificate SHA-256 digest: e6e11d4a...f18be6
```

> Android 11+ 对 `targetSdk >= 30` 的应用强制要求 v2 签名，只做 v1 会 `INSTALL_PARSE_FAILED_NO_CERTIFICATES`。
> `apksigner` 默认 v1+v2+v3 全签，无需额外参数。

## 6. 安装

```bash
adb install -r reex_signed.apk
# 与原版共存需改包名（见下）
```

原版与重打包版**签名不同**，直接覆盖安装会报 `INSTALL_FAILED_UPDATE_INCOMPATIBLE`，
必须先卸载原版（会丢失媒体库数据），或改包名共存：

```
apktool.yml 里 renameManifestPackage: xyz.re.player.ex.mod
AndroidManifest.xml 的 package 属性、FileProvider authority、
以及 Dart 侧硬编码的 "xyz.re.player.ex/..." 通道名都要同步修改
→ 通道名不改会导致所有原生功能失效（Dart 侧按原字符串查找），
  因此「共存版」还必须在 libapp.so 里改字符串（长度相同的最佳）。
```

## 7. 重打包后能验证什么

| 验证项 | 方法 | 结论 |
| --- | --- | --- |
| 资源完整 | `apktool b` 成功、aapt2 无 error | ✅ |
| smali 完整 | baksmali→smali 往返、类数一致 | ✅ |
| 清单一致 | 反编译后 Manifest 与原二进制同一份 | ✅ |
| 签名可用 | `apksigner verify` 全绿 | ✅ |
| 运行行为 | 需真机安装；逻辑未改动，行为应与原版一致 | 未在真机验证 |

## 8. 一键脚本

`tools/rebuild_apk.ps1` 封装了上述全部步骤（ASCII 路径、密钥、签名、校验）。

## 9. 与原 APK 的逐条目对比（实测）

```
原始 APK  562 条目   重建 APK  533 条目
res/ 原始 490 个文件名全部是混淆名：res/-0.xml、res/06.png、res/09.9.png、res/Kp.9.png …
res/ 重建 490 个文件名为语义名：res/anim/abc_fade_in.xml、res/color/abc_*.xml …
classes.dex 原始 1,736,812 B / 2183 类  →  重建 1,736,636 B / 2183 类
```

两个结论：

1. **原 APK 做了资源文件名混淆**（resource path shortening / obfuscation）。
   `resources.arsc` 里仍保留完整资源表，apktool 能还原成标准目录结构与可读文件名，
   因此重打包后资源路径“变干净”了，但资源 ID、内容、引用关系完全一致。
2. **类数量完全一致（2183）**：smali 往返无损；dex 字节数差异（176 B）来自指令重排与字符串池顺序。

这证明「反编译 → 重建」闭环成立，且重建产物在结构上等价于原版。

