// verify_abi.js — 在设备上直接调用 libmmr / libmpvclient 的导出函数，用 ABI 层验证 [存疑] 项
//
// 用法（gadget 注入版 APK）:
//   adb forward tcp:27042 tcp:27042
//   frida -H 127.0.0.1:27042 -l frida/verify_abi.js
//
// 前提: 应用已启动；测试媒体已放进应用私有目录:
//   /data/user/0/xyz.re.player.ex/files/{sample10s.mp4,test_2ch_44100.wav,test.jpg}
//
// 结果直接打印在控制台，可 -o 保存。

'use strict';

const MEDIA = '/sdcard/Download/reex_media/';
const FILES = {
  mp4: MEDIA + 'sample10s.mp4',
  wav: MEDIA + 'test_2ch_44100.wav',
  jpg: MEDIA + 'test.jpg',
};

function log(s) { console.log('[abi] ' + s); }

function exportOf(mod, sym) {
  try { return Process.getModuleByName(mod).getExportByName(sym); } catch (e) {}
  try { return Module.getExportByName(mod, sym); } catch (e) {}
  try { return Module.findExportByName(mod, sym); } catch (e) {}
  return null;
}

let NATIVE_DIR = null;
(function () {
  // 不依赖 Java bridge：从已加载的 libapp.so 路径推导 nativeLibraryDir
  try {
    const m = Process.enumerateModules().filter(function (x) {
      return x.name === 'libapp.so' || x.name === 'libmmr.so';
    })[0];
    if (m) NATIVE_DIR = m.path.substring(0, m.path.lastIndexOf('/'));
    log('nativeLibraryDir = ' + NATIVE_DIR);
  } catch (e) { log('nativeLibraryDir unavailable: ' + e); }
})();

function findBase(name) {
  // Frida 17 移除了 Module.findBaseAddress，用 Process.findModuleByName 代替
  try { const m = Process.findModuleByName(name); return m ? m.base : null; } catch (e) { return null; }
}

function waitLib(name, cb, tries) {
  tries = tries || 0;
  const b = findBase(name);
  if (b) return cb(b);
  // libmmr 在应用里没有被加载过：主动 dlopen 一次（它就在 nativeLibraryDir 里）
  if (name === 'libmmr.so' && tries === 20 && NATIVE_DIR) {
    try {
      // Frida 17 去掉了 Module.load()，直接调 libc dlopen
      const libc = Process.getModuleByName('libc.so');
      const dlopen = new NativeFunction(libc.getExportByName('dlopen'), 'pointer', ['pointer', 'int']);
      const h = dlopen(Memory.allocUtf8String(NATIVE_DIR + '/' + name), 2 /* RTLD_NOW */);
      log('dlopen ' + NATIVE_DIR + '/' + name + ' -> ' + h);
    } catch (e) { log('dlopen failed: ' + e); }
  }
  if (tries > 60) { log(name + ' not loaded, give up'); return; }
  setTimeout(function () { waitLib(name, cb, tries + 1); }, 500);
}

function cstr(p) {
  try { return p.isNull() ? null : p.readCString(); } catch (e) { return '<unreadable>'; }
}

function jpegSize(img) {
  if (!img || img.isNull()) return null;
  try { return img.add(8).readU64().toNumber(); } catch (e) { return null; }
}

function jpegHeader(img) {
  if (!img || img.isNull()) return null;
  try { return img.readPointer().readByteArray(4); } catch (e) { return null; }
}

function runMmr(base) {
  log('libmmr.so @ ' + base);
  const f = {};
  ['media_metadata_retriever_create', 'media_metadata_retriever_release',
   'media_metadata_retriever_get_duration', 'media_metadata_retriever_get_metadata',
   'media_metadata_retriever_get_video_track', 'media_metadata_retriever_get_audio_track',
   'media_metadata_retriever_get_subtitle_track',
   'media_metadata_retriever_get_attached_image',
   'media_metadata_retriever_get_frame_at_time', 'media_image_release'].forEach(function (n) {
    const p = exportOf('libmmr.so', n);
    f[n] = p;
  });
  if (!f.media_metadata_retriever_create) { log('create() not found'); return; }

  const create = new NativeFunction(f.media_metadata_retriever_create, 'pointer', ['pointer']);
  const release = new NativeFunction(f.media_metadata_retriever_release, 'void', ['pointer']);
  const duration = new NativeFunction(f.media_metadata_retriever_get_duration, 'int64', ['pointer']);
  const videoT = new NativeFunction(f.media_metadata_retriever_get_video_track, 'pointer', ['pointer']);
  const audioT = new NativeFunction(f.media_metadata_retriever_get_audio_track, 'pointer', ['pointer']);
  const subT = new NativeFunction(f.media_metadata_retriever_get_subtitle_track, 'pointer', ['pointer']);
  const cover = new NativeFunction(f.media_metadata_retriever_get_attached_image, 'pointer', ['pointer']);
  const frame = new NativeFunction(f.media_metadata_retriever_get_frame_at_time, 'pointer',
                                   ['pointer', 'int', 'int', 'int']);
  const imgRel = new NativeFunction(f.media_image_release, 'void', ['pointer']);

  /* ---------------- V2: 音频轨字段 ---------------- */
  (function testAudio() {
    log('--- V2 audio track test: ' + FILES.wav);
    const r = create(Memory.allocUtf8String(FILES.wav));
    if (r.isNull()) { log('  create() failed'); return; }
    log('  duration = ' + duration(r).toString());
    const t = audioT(r);
    if (t.isNull()) { log('  audio_track = null'); release(r); return; }
    log('  +0x08 = ' + t.add(8).readS32() + '   (推测 codecpar+0x94)');
    log('  +0x0c = ' + t.add(0xc).readS32() + ' (推测 channels)');
    log('  +0x10 type  = ' + cstr(t.add(0x10).readPointer()));
    log('  +0x18 codec = ' + cstr(t.add(0x18).readPointer()));
    log('  +0x20 long  = ' + cstr(t.add(0x20).readPointer()));
    const v = videoT(r);
    log('  video_track = ' + v);
    const s = subT(r);
    log('  subtitle_track = ' + s);
    release(r);
  })();

  /* ---------------- V1: 截帧时间单位 ---------------- */
  (function testFrame() {
    log('--- V1 frame time-unit test: ' + FILES.mp4);
    const r = create(Memory.allocUtf8String(FILES.mp4));
    if (r.isNull()) { log('  create() failed'); return; }
    log('  duration = ' + duration(r).toString() + ' us  (= ' +
        (Number(duration(r)) / 1e6).toFixed(2) + ' s)');

    const vt = videoT(r);
    if (!vt.isNull()) {
      log('  video bit_rate = ' + vt.add(8).readS64().toString());
      log('  video avg_fps  = ' + vt.add(0x10).readDouble().toFixed(3));
      log('  video r_fps    = ' + vt.add(0x18).readDouble().toFixed(3));
      log('  video codec    = ' + cstr(vt.add(0x28).readPointer()));
    }

    [[0, 'pos=0'], [2, 'pos=2'], [2000, 'pos=2000'], [5000, 'pos=5000']].forEach(function (pair) {
      const pos = pair[0], label = pair[1];
      const img = frame(r, pos, 0, 0);
      if (img.isNull()) {
        log('  ' + label + ' -> NULL');
        return;
      }
      const size = jpegSize(img);
      const hdr = jpegHeader(img);
      const hex = hdr ? Array.from(new Uint8Array(hdr)).map(function (b) {
        return ('0' + b.toString(16)).slice(-2);
      }).join(' ') : '?';
      log('  ' + label + ' -> image size=' + size + ' head=' + hex);
      imgRel(img);
    });

    const cv = cover(r);
    log('  attached_image = ' + (cv.isNull() ? 'null' : ('size=' + jpegSize(cv))));
    if (!cv.isNull()) imgRel(cv);
    release(r);
  })();

  /* ---------------- V1b: JPEG 单图（验证 MJPEG 编码路径） ---------------- */
  (function testJpeg() {
    log('--- frame on still image: ' + FILES.jpg);
    const r = create(Memory.allocUtf8String(FILES.jpg));
    if (r.isNull()) { log('  create() failed'); return; }
    const img = frame(r, 0, 0, 0);
    log('  frame(0) = ' + (img.isNull() ? 'null' : ('size=' + jpegSize(img))));
    if (!img.isNull()) imgRel(img);
    release(r);
  })();
}

function runSmb(base) {
  log('libmpvclient.so @ ' + base + '  (smb_url_parse @ +0xa63c)');
  const parseAddr = base.add(0xa63c);
  const parse = new NativeFunction(parseAddr, 'pointer', ['pointer']);

  const uri = 'smb2://{"server":"10.0.0.5","share":"media","path":"/a/b.mkv",' +
              '"username":"tester","password":"SEKRET123","domain":"WORKGROUP"}';
  log('input uri = ' + uri);
  const p = parse(Memory.allocUtf8String(uri));
  if (p.isNull()) { log('  parse -> NULL'); return; }
  log('  --- parsed reex_smb_url ---');
  log('  +0x00 domain   = ' + cstr(p.add(0x00).readPointer()));
  log('  +0x08 username = ' + cstr(p.add(0x08).readPointer()));
  log('  +0x10 password = ' + cstr(p.add(0x10).readPointer()));
  log('  +0x18 server   = ' + cstr(p.add(0x18).readPointer()));
  log('  +0x20 share    = ' + cstr(p.add(0x20).readPointer()));
  log('  +0x28 path     = ' + cstr(p.add(0x28).readPointer()));
  log('  (若 password 以明文出现在这里，即证实 S-11: 凭据随 URI 进入 mpv 日志)');
}

setTimeout(function () {
  waitLib('libmmr.so', function (base) {
    try { runMmr(base); } catch (e) { log('mmr test error: ' + e); }
  });
  waitLib('libmpvclient.so', function (base) {
    try { runSmb(base); } catch (e) { log('smb test error: ' + e); }
  });
}, 2000);