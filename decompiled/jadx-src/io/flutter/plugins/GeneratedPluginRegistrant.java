package io.flutter.plugins;

import androidx.annotation.Keep;
import d1.j;
import h0.e;
import i0.d;
import io.flutter.embedding.engine.a;
import k0.c;
import n0.b;

@Keep
/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(a aVar) {
        try {
            aVar.q().i(new j0.a());
        } catch (Exception e3) {
            b.c(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e3);
        }
        try {
            aVar.q().i(new g0.b());
        } catch (Exception e4) {
            b.c(TAG, "Error registering plugin flutter_displaymode, com.ajinasokan.flutterdisplaymode.DisplayModePlugin", e4);
        }
        try {
            aVar.q().i(new d2.b());
        } catch (Exception e5) {
            b.c(TAG, "Error registering plugin mpv_client, xyz.lhtls.mpv_client.MpvClientPlugin", e5);
        }
        try {
            aVar.q().i(new d());
        } catch (Exception e6) {
            b.c(TAG, "Error registering plugin nsd_android, com.haberey.flutter.nsd_android.NsdAndroidPlugin", e6);
        }
        try {
            aVar.q().i(new c());
        } catch (Exception e7) {
            b.c(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e7);
        }
        try {
            aVar.q().i(new j());
        } catch (Exception e8) {
            b.c(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e8);
        }
        try {
            aVar.q().i(new m0.a());
        } catch (Exception e9) {
            b.c(TAG, "Error registering plugin sqlite3_flutter_libs, eu.simonbinder.sqlite3_flutter_libs.Sqlite3FlutterLibsPlugin", e9);
        }
        try {
            aVar.q().i(new l0.a());
        } catch (Exception e10) {
            b.c(TAG, "Error registering plugin storage_access, dev.lntls.storage_access.StorageAccessPlugin", e10);
        }
        try {
            aVar.q().i(new e1.j());
        } catch (Exception e11) {
            b.c(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e11);
        }
        try {
            aVar.q().i(new e());
        } catch (Exception e12) {
            b.c(TAG, "Error registering plugin vibration, com.benjaminabel.vibration.VibrationPlugin", e12);
        }
    }
}
