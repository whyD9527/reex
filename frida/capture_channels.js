// capture_channels.js — Java 层通道抓包（需要 Frida 16 的 Java bridge）
'use strict';
Java.perform(function () {
  const TAG = '[ch]';
  try {
    const MC = Java.use('io.flutter.plugin.common.MethodChannel');
    MC.invokeMethod.overload('java.lang.String', 'java.lang.Object').implementation = function (m, a) {
      let arg = 'null';
      try { arg = a === null ? 'null' : a.toString().slice(0, 220); } catch (e) {}
      console.log(TAG + ' invokeMethod ' + m + ' | ' + arg);
      return this.invokeMethod(m, a);
    };
    console.log(TAG + ' MethodChannel hooked');
  } catch (e) { console.log(TAG + ' hook fail: ' + e); }

  try {
    const Main = Java.use('xyz.re.player.ex.MainActivity');
    Main.onCreate.overload('android.os.Bundle').implementation = function (b) {
      console.log(TAG + ' MainActivity.onCreate');
      this.onCreate(b);
      try {
        const i = this.getIntent();
        if (i) console.log(TAG + '   intent data=' + i.getDataString());
      } catch (e) {}
    };
  } catch (e) { console.log(TAG + ' MainActivity hook fail: ' + e); }
});
