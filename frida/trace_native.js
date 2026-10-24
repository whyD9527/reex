// trace_native.js — 抓 mpv 命令与 SMB URI（Frida 17，无 Java bridge）
'use strict';
function log(s) { console.log('[trace] ' + s); }
function cstr(p) { try { return p.isNull() ? null : p.readCString(); } catch (e) { return null; } }

function hook(name, mod, sym, onEnter) {
  try {
    const m = Process.getModuleByName(mod);
    const addr = m.getExportByName(sym);
    Interceptor.attach(addr, { onEnter: onEnter });
    log('hooked ' + mod + '!' + sym);
  } catch (e) { log('hook fail ' + sym + ': ' + e); }
}

setTimeout(function () {
  // 1) mpv 命令：loadfile 的 URI 会带出 SMB JSON（含密码）
  hook('mpv_command_async', 'libmpv.so', 'mpv_command_async', function (args) {
    try {
      const argv = args[2];   // mpv_command_async(ctx, userdata, args)
      const parts = [];
      for (let i = 0; i < 8; i++) {
        const s = argv.add(i * Process.pointerSize).readPointer();
        if (s.isNull()) break;
        parts.push(s.readCString());
      }
      log('mpv_command_async: ' + parts.join(' ').slice(0, 500));
    } catch (e) { log('cmd err ' + e); }
  });

  // 2) SMB URI 解析（内部函数，按偏移）
  try {
    const base = Process.getModuleByName('libmpvclient.so').base;
    Interceptor.attach(base.add(0xa63c), {
      onEnter: function (args) { log('smb_url_parse: ' + cstr(args[0])); }
    });
    log('hooked libmpvclient+0xa63c smb_url_parse');
  } catch (e) { log('smb hook fail ' + e); }

  // 3) 自定义流注册
  try {
    const base2 = Process.getModuleByName('libmpvclient.so').base;
    Interceptor.attach(base2.add(0x9e44), {
      onEnter: function (args) { log('register_mpv_stream_cb_dart proto=' + cstr(args[1])); }
    });
  } catch (e) {}
}, 1500);