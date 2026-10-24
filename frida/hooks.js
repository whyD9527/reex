// hooks.js — Reex 1.8.9 动态验证套件
//
// 用法（真机 + frida-server）:
//   frida -U -f xyz.re.player.ex -l frida/hooks.js --no-pause
//   # 或附加已运行的进程:
//   frida -U xyz.re.player.ex -l frida/hooks.js
//
// 覆盖:
//   1) Java 层：MainActivity 启动 Intent、MethodChannel.invokeMethod 全量调用
//   2) libmmr.so：截帧时间参数（验证单位）、音频轨 [存疑] 字段
//   3) libmpvclient.so：SMB URI 解析（验证凭据是否在 URI 中）
//   4) libmpv.so：mpv_command_async 的 loadfile 目标
//
// 所有偏移来自 native/disasm/ 的静态还原，见 docs/10-native-reimpl.md

'use strict';

function hex(p) {
  try { return p.toString(16); } catch (e) { return String(p); }
}

function readCString(p) {
  try { return p.isNull() ? null : p.readCString(); } catch (e) { return null; }
}

/* ------------------------------------------------------------------ Java */

Java.perform(function () {
  const TAG = '[re]';

  // 1.1 启动 Intent（外部唤起时看 extras）
  try {
    const MainActivity = Java.use('xyz.re.player.ex.MainActivity');
    MainActivity.onCreate.overload('android.os.Bundle').implementation = function (b) {
      console.log(TAG + ' MainActivity.onCreate');
      this.onCreate(b);
      try {
        const i = this.getIntent();
        if (i) {
          console.log(TAG + '   action=' + i.getAction() + ' data=' + i.getDataString());
          ['title', 'reex.extra.title', 'reex.extra.http_header', 'reex.extra.subtitle']
            .forEach(function (k) {
              try { console.log(TAG + '   extra ' + k + '=' + i.getStringExtra(k)); } catch (e) {}
            });
        }
      } catch (e) {}
    };
  } catch (e) { console.log(TAG + ' MainActivity hook failed: ' + e); }

  // 1.2 MethodChannel 全量调用（Dart → Kotlin）
  try {
    const MC = Java.use('io.flutter.plugin.common.MethodChannel');
    MC.invokeMethod.overload('java.lang.String', 'java.lang.Object').implementation = function (m, a) {
      let arg = 'null';
      try { arg = a === null ? 'null' : a.toString().slice(0, 160); } catch (e) {}
      console.log(TAG + ' [channel] ' + m + ' ' + arg);
      return this.invokeMethod(m, a);
    };
  } catch (e) { console.log(TAG + ' MethodChannel hook failed: ' + e); }

  // 1.3 权限申请（MANAGE_EXTERNAL_STORAGE 等）
  try {
    const Perm = Java.use('xyz.re.player.ex.MainActivity');
    console.log(TAG + ' Java hooks installed');
  } catch (e) {}
});

/* ---------------------------------------------------------------- native */

function hookLib(libName, symbols) {
  const base = Module.findBaseAddress(libName);
  if (!base) { console.log('[re] ' + libName + ' not loaded (yet)'); return; }
  console.log('[re] ' + libName + ' base=' + base);
  symbols.forEach(function (s) {
    try {
      Interceptor.attach(base.add(s.off), {
        onEnter: s.onEnter || function () {},
        onLeave: s.onLeave || function () {}
      });
      console.log('[re] hooked ' + libName + '+' + s.off.toString(16) + ' ' + s.name);
    } catch (e) {
      console.log('[re] hook fail ' + s.name + ': ' + e);
    }
  });
}

setTimeout(function () {
  hookLib('libmmr.so', [
    {
      name: 'get_frame_at_time', off: 0x1678,
      onEnter: function (args) {
        // (retriever, pos:int, width:int, height:int)
        console.log('[mmr] get_frame_at_time pos=' + args[1].toInt32() +
                    ' w=' + args[2].toInt32() + ' h=' + args[3].toInt32());
        this.t0 = Date.now();
      },
      onLeave: function (retval) {
        console.log('[mmr]   -> image=' + retval + ' (' + (Date.now() - this.t0) + 'ms)');
      }
    },
    {
      name: 'get_audio_track', off: 0x1ddc,
      onLeave: function (retval) {
        if (retval.isNull()) return;
        // 结构: +0x00 ptr, +0x08 int(field_08), +0x0c int(channels)
        const a = retval.readS32();
        const b = retval.add(8).readS32();
        const c = retval.add(0xc).readS32();
        console.log('[mmr] audio_track +0x08=' + b + ' +0x0c=' + c);
      }
    },
    {
      name: 'get_duration', off: 0x1ac4,
      onLeave: function (retval) {
        console.log('[mmr] duration=' + retval.toInt64() + ' (AV_TIME_BASE units)');
      }
    }
  ]);

  hookLib('libmpvclient.so', [
    {
      name: 'mpv_stream_cb_add_ro_smb2', off: 0xa524,
      onEnter: function (args) { console.log('[mpvc] add_ro_smb2(mpv=' + args[0] + ')'); }
    },
    {
      name: 'smb_url_parse', off: 0xa63c,
      onEnter: function (args) {
        console.log('[mpvc] smb_url_parse uri=' + readCString(args[0]));
      }
    },
    {
      name: 'register_mpv_stream_cb_dart', off: 0x9e44,
      onEnter: function (args) {
        console.log('[mpvc] register_dart proto=' + readCString(args[1]) +
                    ' userdata=' + args[2]);
      }
    }
  ]);

  hookLib('libmpv.so', [
    {
      name: 'mpv_command_async', off: null,  // 用符号查找
      onEnter: function () {}
    }
  ]);
}, 1500);

/* libmpv 用符号名查找更稳（不同构建地址不同） */
setTimeout(function () {
  const mpv = Module.findBaseAddress('libmpv.so');
  if (!mpv) return;
  ['mpv_command', 'mpv_command_async', 'mpv_set_property_string'].forEach(function (name) {
    const p = Module.findExportByName('libmpv.so', name);
    if (!p) return;
    Interceptor.attach(p, {
      onEnter: function (args) {
        if (name === 'mpv_command' || name === 'mpv_command_async') {
          try {
            const arr = args[name === 'mpv_command' ? 1 : 2];
            if (!arr.isNull()) {
              const n = arr.readPointer();
              const parts = [];
              for (let i = 0; i < 6; i++) {
                const s = arr.add((i + 1) * Process.pointerSize).readPointer();
                if (s.isNull()) break;
                parts.push(s.readCString());
              }
              console.log('[mpv] ' + name + ' ' + parts.join(' ').slice(0, 400));
            }
          } catch (e) {}
        }
      }
    });
  });
  console.log('[re] libmpv symbols hooked');
}, 2500);
