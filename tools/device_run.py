#!/usr/bin/env python3
"""device_run.py — 一键在真机上完成 Reex 动态验证。

步骤:
  1) 检查 adb 设备
  2) 安装注入版 APK（debuggable + frida-gadget）
  3) 把测试媒体写入应用私有目录（run-as + stdin 管道）
  4) 启动应用，adb forward 27042，用 frida 注入 verify_abi.js
  5) 拉取 reex.sqlite（debuggable 版可直接 run-as）

用法:
  python tools/device_run.py --adb C:\\path\\adb.exe \
      --apk patches/out/Reex-1.8.9-analysis.apk \
      --media C:\\re_work\\media \
      --script frida/verify_abi.js --out frida/out
"""
import argparse, os, subprocess, sys, time


def run(cmd, **kw):
    return subprocess.run(cmd, capture_output=True, **kw)


def adb(args, adb_path, **kw):
    return run([adb_path] + args, **kw)


def pair_and_connect(adb_path, pair, connect):
    if pair:
        host, code = pair
        print('pair:', host)
        r = adb(['pair', host, code], adb_path, text=True)
        print((r.stdout or '') + (r.stderr or ''))
    if connect:
        print('connect:', connect)
        r = adb(['connect', connect], adb_path, text=True)
        print((r.stdout or '') + (r.stderr or ''))
        time.sleep(2)


def check_device(adb_path):
    r = adb(['devices', '-l'], adb_path, text=True)
    lines = [l for l in (r.stdout or '').splitlines()[1:] if l.strip()]
    if not lines:
        print('!! 没有检测到设备。请检查：')
        print('   1. 数据线（不是充电线），换一个 USB 口')
        print('   2. 手机已解锁，USB 模式选“文件传输/MTP”')
        print('   3. 开发者选项 → USB 调试 已开启，授权弹窗点“允许”')
        print('   4. 若仍不行：Windows 设备管理器里是否出现“未知 USB 设备(设备描述符请求失败)”')
        sys.exit(2)
    dev = lines[0].split()[0]
    state = lines[0].split()[1]
    if state != 'device':
        print('!! 设备状态为 %s（可能未授权）' % state)
        sys.exit(3)
    print('[1/5] device:', lines[0])
    return dev


def install(apk, adb_path):
    print('[2/5] install', apk)
    r = adb(['install', '-r', '-t', apk], adb_path, text=True)
    print((r.stdout or '') + (r.stderr or ''))
    if 'Success' not in (r.stdout or '') + (r.stderr or ''):
        print('!! 安装失败（可能需先卸载原版：adb uninstall xyz.re.player.ex）')
        sys.exit(4)


def push_media(pkg, media_dir, adb_path):
    print('[3/5] push media -> /data/user/0/%s/files/' % pkg)
    names = ['sample10s.mp4', 'test_2ch_44100.wav', 'test.jpg']
    for n in names:
        p = os.path.join(media_dir, n)
        if not os.path.exists(p):
            print('   skip', n)
            continue
        cmd = [adb_path, 'shell', 'run-as', pkg, 'sh', '-c', 'cat > files/%s' % n]
        with open(p, 'rb') as f:
            r = subprocess.run(cmd, stdin=f, capture_output=True)
        print('   %s -> rc=%d %s' % (n, r.returncode, r.stderr.decode('utf-8', 'ignore')[:120]))


def start_app(pkg, activity, adb_path):
    print('[4/5] start', pkg)
    adb(['shell', 'am', 'force-stop', pkg], adb_path)
    r = adb(['shell', 'am', 'start', '-n', '%s/%s' % (pkg, activity)], adb_path, text=True)
    print('   ' + (r.stdout or '').strip())


def attach(host, port, script_path, out_dir, seconds):
    import frida
    os.makedirs(out_dir, exist_ok=True)
    log_path = os.path.join(out_dir, 'abi.log')

    print('[5/5] frida -> %s:%d' % (host, port))
    mgr = frida.get_device_manager()
    dev = mgr.add_remote_device('%s:%d' % (host, port))
    procs = dev.enumerate_processes()
    print('   processes:', [(p.pid, p.name) for p in procs][:8])
    if not procs:
        print('!! 没有可见进程（gadget 是否成功加载？）')
        return
    target = None
    for p in procs:
        if 'reex' in p.name.lower() or p.name.startswith('xyz.'):
            target = p
            break
    target = target or procs[0]
    print('   attach:', target.pid, target.name)

    session = dev.attach(target.pid)
    js = open(script_path, encoding='utf-8').read()
    script = session.create_script(js)

    lines = []

    def on_message(message, data):
        if message.get('type') == 'send':
            lines.append(str(message['payload']))
        elif message.get('type') == 'error':
            lines.append('ERROR: ' + str(message.get('description')))

    script.on('message', on_message)
    script.load()
    time.sleep(seconds)
    session.detach()

    with open(log_path, 'w', encoding='utf-8') as f:
        f.write('\n'.join(lines))
    print('   log ->', log_path, '(%d lines)' % len(lines))
    print('\n'.join(lines[-60:]))


def pull_db(pkg, adb_path, out_dir):
    os.makedirs(out_dir, exist_ok=True)
    dst = os.path.join(out_dir, 'reex.sqlite')
    cmd = [adb_path, 'shell', 'run-as', pkg, 'cat', 'files/reex.sqlite']
    with open(dst, 'wb') as f:
        r = subprocess.run(cmd, stdout=f, stderr=subprocess.PIPE)
    if os.path.getsize(dst) > 1024:
        print('sqlite ->', dst, os.path.getsize(dst), 'bytes')
    else:
        print('!! sqlite 拉取失败：', r.stderr.decode('utf-8', 'ignore')[:200])
        os.remove(dst)


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('--adb', default='adb')
    ap.add_argument('--apk', default='patches/out/Reex-1.8.9-analysis.apk')
    ap.add_argument('--pkg', default='xyz.re.player.ex')
    ap.add_argument('--activity', default='.MainActivity')
    ap.add_argument('--media', default='media')
    ap.add_argument('--script', default='frida/verify_abi.js')
    ap.add_argument('--out', default='frida/out')
    ap.add_argument('--host', default='127.0.0.1')
    ap.add_argument('--port', type=int, default=27042)
    ap.add_argument('--seconds', type=int, default=40)
    ap.add_argument('--skip-install', action='store_true')
    ap.add_argument('--pair', nargs=2, metavar=('HOST_PORT', 'CODE'),
                    help='wireless pairing: --pair 192.168.1.23:37123 123456')
    ap.add_argument('--connect', default='', help='wireless connect: --connect 192.168.1.23:5555')
    args = ap.parse_args()

    if args.pair or args.connect:
        pair_and_connect(args.adb, args.pair, args.connect)
    check_device(args.adb)
    if not args.skip_install:
        install(os.path.abspath(args.apk), args.adb)
    push_media(args.pkg, os.path.abspath(args.media), args.adb)
    start_app(args.pkg, args.activity, args.adb)
    run([args.adb, 'forward', 'tcp:%d' % args.port, 'tcp:%d' % args.port])
    time.sleep(6)
    attach(args.host, args.port, os.path.abspath(args.script), args.out, args.seconds)
    pull_db(args.pkg, args.adb, args.out)


if __name__ == '__main__':
    main()