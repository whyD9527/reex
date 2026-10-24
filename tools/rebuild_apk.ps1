# rebuild_apk.ps1 - one-shot: apktool rebuild -> keystore -> apksigner sign -> verify
# usage: .\rebuild_apk.ps1 -DecodedDir .\decompiled\apktool -Out .\out\Reex-repacked.apk
param(
    [string]$DecodedDir = ".\decompiled\apktool",
    [string]$Out = ".\out\Reex-repacked.apk",
    [string]$ApktoolJar = "apktool.jar",
    [string]$BuildTools = "",
    [string]$Keystore = ".\out\reex.keystore",
    [string]$StorePass = "reexpass"
)
$ErrorActionPreference = "Stop"

# apktool (aapt2) rejects non-ASCII paths: copy to an ASCII-only work dir first
$work = Join-Path $env:TEMP "reex_build"
if (Test-Path $work) { Remove-Item $work -Recurse -Force }
Copy-Item $DecodedDir $work -Recurse

New-Item -ItemType Directory -Force -Path (Split-Path $Out) | Out-Null
java -jar $ApktoolJar b $work -o $Out
if ($LASTEXITCODE -ne 0) { throw "apktool build failed" }

if (-not (Test-Path $Keystore)) {
    New-Item -ItemType Directory -Force -Path (Split-Path $Keystore) | Out-Null
    keytool -genkeypair -keystore $Keystore -alias reex -keyalg RSA -keysize 2048 -validity 10000 -storepass $StorePass -keypass $StorePass -dname "CN=Reex RE, OU=Reverse, O=RE, L=NA, ST=NA, C=CN"
}
$apksigner = if ($BuildTools) { Join-Path $BuildTools "apksigner.bat" } else { "apksigner" }
& $apksigner sign --ks $Keystore --ks-pass "pass:$StorePass" --key-pass "pass:$StorePass" --out $Out $Out
& $apksigner verify --verbose $Out
Write-Host "OK: $Out"