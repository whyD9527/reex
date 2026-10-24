#!/usr/bin/env python3
"""apply_patches.py — Reex 加固补丁流水线（smali/资源层，无需 Dart 源码）

流程: 复制反编译目录到 ASCII 工作区 → 打补丁 → apktool 重建 → apksigner 签名 → 校验

用法:
    python patches/apply_patches.py \
        --src decompiled/apktool \
        --out patches/out/Reex-hardened.apk \
        --apktool /path/apktool.jar \
        --build-tools /path/build-tools/34.0.0 \
        [--strict-intent] [--no-cleartext] [--dry-run]

补丁:
    P1  android:allowBackup="false"              → 对应 S-05（备份泄露）
    P2  http_header extra 改名（可选 --strict-intent） → 对应 S-03（外部头注入）
    P3  关闭明文流量（可选 --no-cleartext）       → 对应 S-01（会破坏 http 流播放）
"""
import argparse, os, re, shutil, subprocess, sys, tempfile, uuid

PATCHES = []


def log(msg):
    print(msg, flush=True)


def record(name, before, after):
    PATCHES.append((name, before, after))


def patch_manifest(app_dir, keep_backup=False, no_cleartext=False):
    path = os.path.join(app_dir, 'AndroidManifest.xml')
    s = open(path, encoding='utf-8').read()
    orig = s

    if not keep_backup:
        m = re.search(r'<application\b[^>]*>', s)
        if not m:
            raise SystemExit('AndroidManifest.xml: <application> not found')
        tag = m.group(0)
        if 'android:allowBackup' not in tag:
            new_tag = tag[:-1] + ' android:allowBackup="false">'
            s = s[:m.start()] + new_tag + s[m.end():]
            record('P1 allowBackup=false', 'absent', 'false')
        else:
            s = re.sub(r'android:allowBackup="[^"]*"', 'android:allowBackup="false"', s, count=1)
            record('P1 allowBackup=false', 'existing', 'false')

    if no_cleartext:
        s = s.replace('android:usesCleartextTraffic="true"',
                      'android:usesCleartextTraffic="false"')
        record('P3 usesCleartextTraffic=false', 'true', 'false')

    if s != orig:
        open(path, 'w', encoding='utf-8').write(s)


def patch_network_config(app_dir):
    path = os.path.join(app_dir, 'res', 'xml', 'network_security_config.xml')
    if not os.path.exists(path):
        log('  ! network_security_config.xml missing, skip P3')
        return
    s = open(path, encoding='utf-8').read()
    s2 = s.replace('cleartextTrafficPermitted="true"', 'cleartextTrafficPermitted="false"')
    if s2 != s:
        open(path, 'w', encoding='utf-8').write(s2)
        record('P3 cleartextTrafficPermitted=false', 'true', 'false')


def patch_http_header(app_dir):
    path = os.path.join(app_dir, 'smali', 'e2', 't0.smali')
    if not os.path.exists(path):
        log('  ! smali/e2/t0.smali missing, skip P2')
        return
    s = open(path, encoding='utf-8').read()
    key = 'reex.extra.http_header'
    new_key = 'reex.extra.http_header.disabled'
    if key not in s:
        log('  ! http_header const not found, skip P2')
        return
    # 只改给 getStringExtra 用的那一处常量，保留 "httpHeader" 这个 map key
    s2 = s.replace('const-string v1, "%s"' % key, 'const-string v1, "%s"' % new_key)
    if s2 != s:
        open(path, 'w', encoding='utf-8').write(s2)
        record('P2 http_header extra 禁用', key, new_key)
    else:
        log('  ! P2 pattern mismatch')


def run(cmd, **kw):
    log('  $ ' + ' '.join(str(c) for c in cmd))
    r = subprocess.run(cmd, capture_output=True, text=True, **kw)
    if r.returncode != 0:
        sys.stderr.write(r.stdout[-4000:] + '\n' + r.stderr[-4000:] + '\n')
        raise SystemExit(f'command failed ({r.returncode}): {cmd[0]}')
    return r


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('--src', default='decompiled/apktool')
    ap.add_argument('--out', default='patches/out/Reex-hardened.apk')
    ap.add_argument('--apktool', default='apktool.jar')
    ap.add_argument('--build-tools', default='')
    ap.add_argument('--keystore', default='patches/out/reex-hardened.keystore')
    ap.add_argument('--storepass', default='reexhardened')
    ap.add_argument('--strict-intent', action='store_true')
    ap.add_argument('--no-cleartext', action='store_true')
    ap.add_argument('--dry-run', action='store_true')
    args = ap.parse_args()

    src = os.path.abspath(args.src)
    out = os.path.abspath(args.out)
    os.makedirs(os.path.dirname(out), exist_ok=True)

    # apktool/aapt2 不接受非 ASCII 路径 → 用 ASCII 临时工作区
    work = os.path.join(tempfile.gettempdir(), 'reex_patch_' + uuid.uuid4().hex[:8])
    log(f'[1/5] workdir: {work}')
    shutil.copytree(src, work)

    log('[2/5] applying patches')
    patch_manifest(work, no_cleartext=args.no_cleartext)
    if args.no_cleartext:
        patch_network_config(work)
    if args.strict_intent:
        patch_http_header(work)

    if not PATCHES:
        log('  (no changes)')
    for name, before, after in PATCHES:
        log(f'  - {name}: {before} -> {after}')

    if args.dry_run:
        log('[dry-run] stop before build')
        shutil.rmtree(work, ignore_errors=True)
        return

    log('[3/5] apktool build')
    run(['java', '-jar', os.path.abspath(args.apktool), 'b', work, '-o', out])

    log('[4/5] sign')
    ks = os.path.abspath(args.keystore)
    if not os.path.exists(ks):
        run(['keytool', '-genkeypair', '-keystore', ks, '-alias', 'reex',
             '-keyalg', 'RSA', '-keysize', '2048', '-validity', '10000',
             '-storepass', args.storepass, '-keypass', args.storepass,
             '-dname', 'CN=Reex Hardened, OU=RE, O=RE, L=NA, ST=NA, C=CN'])
    apksigner = os.path.join(args.build_tools, 'apksigner.bat') if args.build_tools else 'apksigner'
    run([apksigner, 'sign', '--ks', ks, '--ks-pass', f'pass:{args.storepass}',
         '--key-pass', f'pass:{args.storepass}', '--out', out, out])

    log('[5/5] verify')
    r = run([apksigner, 'verify', '--verbose', '--print-certs', out])
    log(r.stdout)
    shutil.rmtree(work, ignore_errors=True)
    log(f'OK -> {out}  ({os.path.getsize(out):,} bytes)')


if __name__ == '__main__':
    main()
