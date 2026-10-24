package e2;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import s0.a;
import z0.k;

/* loaded from: classes.dex */
public final class e implements s0.a, k.c, t0.a {

    /* renamed from: a, reason: collision with root package name */
    private z0.k f2648a;

    /* renamed from: b, reason: collision with root package name */
    private a.b f2649b;

    /* renamed from: c, reason: collision with root package name */
    private t0.c f2650c;

    /* renamed from: d, reason: collision with root package name */
    private Activity f2651d;

    private final Context a() {
        a.b bVar = this.f2649b;
        if (bVar == null) {
            kotlin.jvm.internal.k.o("binding");
            bVar = null;
        }
        Context a3 = bVar.a();
        kotlin.jvm.internal.k.d(a3, "binding.applicationContext");
        return a3;
    }

    @Override // t0.a
    public void e() {
    }

    @Override // s0.a
    public void h(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        z0.k kVar = new z0.k(binding.b(), "xyz.re.player.ex/AndroidChannel");
        this.f2648a = kVar;
        kVar.e(this);
        this.f2649b = binding;
    }

    @Override // t0.a
    public void i(t0.c binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        j(binding);
    }

    @Override // t0.a
    public void j(t0.c binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        this.f2650c = binding;
        Activity d3 = binding.d();
        kotlin.jvm.internal.k.d(d3, "binding.activity");
        this.f2651d = d3;
    }

    @Override // s0.a
    public void l(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        z0.k kVar = this.f2648a;
        if (kVar == null) {
            kotlin.jvm.internal.k.o("channel");
            kVar = null;
        }
        kVar.e(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ff, code lost:
    
        if (r3 == null) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x042b, code lost:
    
        r3.startActivity(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0427, code lost:
    
        kotlin.jvm.internal.k.o("activity");
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0425, code lost:
    
        if (r3 == null) goto L198;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v108, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v113, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v116, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r1v91, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v95, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v97, types: [java.lang.Boolean] */
    @Override // z0.k.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(z0.j call, k.d result) {
        Intent intent;
        Activity activity;
        Object action;
        StorageVolume storageVolume;
        HashMap b3;
        HashMap b4;
        List<StorageVolume> storageVolumes;
        File directory;
        File directory2;
        HashMap b5;
        int i2;
        boolean isExternalStorageManager;
        kotlin.jvm.internal.k.e(call, "call");
        kotlin.jvm.internal.k.e(result, "result");
        String str = call.f4754a;
        if (str != null) {
            Activity activity2 = null;
            switch (str.hashCode()) {
                case -1839842994:
                    if (str.equals("restartTextInput")) {
                        Object systemService = a().getSystemService("input_method");
                        kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        Activity activity3 = this.f2651d;
                        if (activity3 == null) {
                            kotlin.jvm.internal.k.o("activity");
                            activity3 = null;
                        }
                        inputMethodManager.restartInput(activity3.findViewById(io.flutter.embedding.android.e.f2999i));
                        result.a(null);
                        g1.q qVar = g1.q.f2865a;
                        break;
                    }
                    break;
                case -1493017356:
                    if (str.equals("pushSystemHomeScreen")) {
                        intent = new Intent();
                        intent.setAction("android.intent.action.MAIN");
                        intent.addCategory("android.intent.category.HOME");
                        g1.q qVar2 = g1.q.f2865a;
                        activity = this.f2651d;
                        break;
                    }
                    break;
                case -1438129858:
                    if (str.equals("StartedIntentChannel.action")) {
                        Activity activity4 = this.f2651d;
                        if (activity4 == null) {
                            kotlin.jvm.internal.k.o("activity");
                        } else {
                            activity2 = activity4;
                        }
                        action = activity2.getIntent().getAction();
                        result.a(action);
                        g1.q qVar3 = g1.q.f2865a;
                        break;
                    }
                    break;
                case -1350947233:
                    if (str.equals("setScreenBrightness")) {
                        Double d3 = (Double) call.a("brightness");
                        Activity activity5 = this.f2651d;
                        if (activity5 == null) {
                            kotlin.jvm.internal.k.o("activity");
                            activity5 = null;
                        }
                        WindowManager.LayoutParams attributes = activity5.getWindow().getAttributes();
                        kotlin.jvm.internal.k.b(d3);
                        attributes.screenBrightness = (float) d3.doubleValue();
                        activity5.getWindow().setAttributes(attributes);
                        g1.q qVar4 = g1.q.f2865a;
                        result.a(null);
                        break;
                    }
                    break;
                case -1277611458:
                    if (str.equals("StartedIntentChannel.package")) {
                        Activity activity6 = this.f2651d;
                        if (activity6 == null) {
                            kotlin.jvm.internal.k.o("activity");
                        } else {
                            activity2 = activity6;
                        }
                        action = activity2.getIntent().getPackage();
                        result.a(action);
                        g1.q qVar32 = g1.q.f2865a;
                        break;
                    }
                    break;
                case -923166547:
                    if (str.equals("StartedIntentChannel.scheme")) {
                        Activity activity7 = this.f2651d;
                        if (activity7 == null) {
                            kotlin.jvm.internal.k.o("activity");
                        } else {
                            activity2 = activity7;
                        }
                        action = activity2.getIntent().getScheme();
                        result.a(action);
                        g1.q qVar322 = g1.q.f2865a;
                        break;
                    }
                    break;
                case -842004837:
                    if (str.equals("canTouchScreen")) {
                        action = Boolean.valueOf(a().getPackageManager().hasSystemFeature("android.hardware.touchscreen"));
                        result.a(action);
                        g1.q qVar3222 = g1.q.f2865a;
                        break;
                    }
                    break;
                case -792013905:
                    if (str.equals("setDisplayCutoutMode")) {
                        Object b6 = call.b();
                        kotlin.jvm.internal.k.b(b6);
                        int intValue = ((Number) b6).intValue();
                        if (Build.VERSION.SDK_INT >= 28) {
                            Activity activity8 = this.f2651d;
                            if (activity8 == null) {
                                kotlin.jvm.internal.k.o("activity");
                                activity8 = null;
                            }
                            activity8.getWindow().getAttributes().layoutInDisplayCutoutMode = intValue;
                        }
                        result.a(null);
                        g1.q qVar32222 = g1.q.f2865a;
                        break;
                    }
                    break;
                case -661361004:
                    if (str.equals("getStorageVolumes")) {
                        action = new ArrayList();
                        int i3 = Build.VERSION.SDK_INT;
                        if (i3 >= 30) {
                            Object systemService2 = a().getSystemService("storage");
                            kotlin.jvm.internal.k.c(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
                            storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
                            for (StorageVolume storageVolume2 : storageVolumes) {
                                if (kotlin.jvm.internal.k.a(storageVolume2.getState(), "mounted")) {
                                    directory = storageVolume2.getDirectory();
                                    if (directory != null) {
                                        directory2 = storageVolume2.getDirectory();
                                        kotlin.jvm.internal.k.b(directory2);
                                        String path = directory2.getPath();
                                        kotlin.jvm.internal.k.d(path, "volume.directory!!.path");
                                        String description = storageVolume2.getDescription(a());
                                        kotlin.jvm.internal.k.d(description, "volume.getDescription(applicationContext)");
                                        boolean isEmulated = storageVolume2.isEmulated();
                                        boolean isPrimary = storageVolume2.isPrimary();
                                        boolean isRemovable = storageVolume2.isRemovable();
                                        String state = storageVolume2.getState();
                                        kotlin.jvm.internal.k.d(state, "volume.state");
                                        b5 = f.b(path, description, isEmulated, isPrimary, isRemovable, state);
                                        action.add(b5);
                                    }
                                }
                            }
                            result.a(action);
                            break;
                        } else if (i3 <= 23) {
                            String path2 = Environment.getExternalStorageDirectory().getPath();
                            kotlin.jvm.internal.k.d(path2, "root.path");
                            b4 = f.b(path2, "External", false, true, false, "mounted");
                            action.add(b4);
                            result.a(action);
                            break;
                        } else {
                            Object systemService3 = a().getSystemService("storage");
                            kotlin.jvm.internal.k.c(systemService3, "null cannot be cast to non-null type android.os.storage.StorageManager");
                            StorageManager storageManager = (StorageManager) systemService3;
                            File[] externalMediaDirs = a().getExternalMediaDirs();
                            kotlin.jvm.internal.k.d(externalMediaDirs, "applicationContext.externalMediaDirs");
                            for (File file : externalMediaDirs) {
                                storageVolume = storageManager.getStorageVolume(file);
                                if (storageVolume != null && kotlin.jvm.internal.k.a(storageVolume.getState(), "mounted")) {
                                    while (true) {
                                        File parentFile = file.getParentFile();
                                        if (kotlin.jvm.internal.k.a(parentFile != null ? storageManager.getStorageVolume(parentFile) : null, storageVolume)) {
                                            file = file.getParentFile();
                                        } else {
                                            String path3 = file.getPath();
                                            kotlin.jvm.internal.k.d(path3, "root.path");
                                            String description2 = storageVolume.getDescription(a());
                                            kotlin.jvm.internal.k.d(description2, "storageVolume.getDescription(applicationContext)");
                                            boolean isEmulated2 = storageVolume.isEmulated();
                                            boolean isPrimary2 = storageVolume.isPrimary();
                                            boolean isRemovable2 = storageVolume.isRemovable();
                                            String state2 = storageVolume.getState();
                                            kotlin.jvm.internal.k.d(state2, "storageVolume.state");
                                            b3 = f.b(path3, description2, isEmulated2, isPrimary2, isRemovable2, state2);
                                            action.add(b3);
                                        }
                                    }
                                }
                            }
                            result.a(action);
                            g1.q qVar322222 = g1.q.f2865a;
                            break;
                        }
                    }
                    break;
                case -571549382:
                    if (str.equals("showOverlayPermissionSettingScreen")) {
                        intent = new Intent();
                        intent.setAction("android.settings.action.MANAGE_OVERLAY_PERMISSION");
                        intent.setData(Uri.parse("package:" + a().getPackageName()));
                        g1.q qVar5 = g1.q.f2865a;
                        activity = this.f2651d;
                        break;
                    }
                    break;
                case -239099644:
                    if (str.equals("setRequestedOrientation")) {
                        Object b7 = call.b();
                        kotlin.jvm.internal.k.b(b7);
                        int intValue2 = ((Number) b7).intValue();
                        Activity activity9 = this.f2651d;
                        if (activity9 == null) {
                            kotlin.jvm.internal.k.o("activity");
                            activity9 = null;
                        }
                        activity9.setRequestedOrientation(intValue2);
                        result.a(null);
                        g1.q qVar3222222 = g1.q.f2865a;
                        break;
                    }
                    break;
                case -24328111:
                    if (str.equals("StartedIntentChannel.getStringExtra")) {
                        String str2 = (String) call.b();
                        Activity activity10 = this.f2651d;
                        if (activity10 == null) {
                            kotlin.jvm.internal.k.o("activity");
                        } else {
                            activity2 = activity10;
                        }
                        action = activity2.getIntent().getStringExtra(str2);
                        result.a(action);
                        g1.q qVar32222222 = g1.q.f2865a;
                        break;
                    }
                    break;
                case 43783234:
                    if (str.equals("StartedIntentChannel.type")) {
                        Activity activity11 = this.f2651d;
                        if (activity11 == null) {
                            kotlin.jvm.internal.k.o("activity");
                        } else {
                            activity2 = activity11;
                        }
                        action = activity2.getIntent().getType();
                        result.a(action);
                        g1.q qVar322222222 = g1.q.f2865a;
                        break;
                    }
                    break;
                case 192780627:
                    if (str.equals("getScreenBrightness")) {
                        Activity activity12 = this.f2651d;
                        if (activity12 == null) {
                            kotlin.jvm.internal.k.o("activity");
                        } else {
                            activity2 = activity12;
                        }
                        float f2 = activity2.getWindow().getAttributes().screenBrightness;
                        if (f2 < 0.0f) {
                            try {
                                f2 = Settings.System.getInt(a().getContentResolver(), "screen_brightness") / 255.0f;
                            } catch (Settings.SettingNotFoundException unused) {
                            }
                            g1.q qVar6 = g1.q.f2865a;
                        }
                        action = Double.valueOf(f2);
                        result.a(action);
                        g1.q qVar3222222222 = g1.q.f2865a;
                        break;
                    }
                    break;
                case 343149302:
                    if (str.equals("getDeviceApiLevel")) {
                        i2 = Build.VERSION.SDK_INT;
                        action = Integer.valueOf(i2);
                        result.a(action);
                        g1.q qVar32222222222 = g1.q.f2865a;
                        break;
                    }
                    break;
                case 532060688:
                    if (str.equals("keepScreenOn")) {
                        Object a3 = call.a("keepOn");
                        kotlin.jvm.internal.k.b(a3);
                        if (((Boolean) a3).booleanValue()) {
                            Activity activity13 = this.f2651d;
                            if (activity13 == null) {
                                kotlin.jvm.internal.k.o("activity");
                                activity13 = null;
                            }
                            Window window = activity13.getWindow();
                            kotlin.jvm.internal.k.b(window);
                            window.addFlags(128);
                        } else {
                            Activity activity14 = this.f2651d;
                            if (activity14 == null) {
                                kotlin.jvm.internal.k.o("activity");
                                activity14 = null;
                            }
                            Window window2 = activity14.getWindow();
                            kotlin.jvm.internal.k.b(window2);
                            window2.clearFlags(128);
                        }
                        result.a(null);
                        g1.q qVar322222222222 = g1.q.f2865a;
                        break;
                    }
                    break;
                case 853521628:
                    if (str.equals("isTelevision")) {
                        Object systemService4 = a().getSystemService("uimode");
                        kotlin.jvm.internal.k.c(systemService4, "null cannot be cast to non-null type android.app.UiModeManager");
                        action = Boolean.valueOf(((UiModeManager) systemService4).getCurrentModeType() == 4);
                        result.a(action);
                        g1.q qVar3222222222222 = g1.q.f2865a;
                        break;
                    }
                    break;
                case 1673463490:
                    if (str.equals("Environment.isExternalStorageManager")) {
                        if (Build.VERSION.SDK_INT >= 30) {
                            isExternalStorageManager = Environment.isExternalStorageManager();
                            action = Boolean.valueOf(isExternalStorageManager);
                        } else {
                            action = Boolean.FALSE;
                        }
                        result.a(action);
                        g1.q qVar32222222222222 = g1.q.f2865a;
                        break;
                    }
                    break;
                case 1779264536:
                    if (str.equals("Environment.getExternalStorageDirectory")) {
                        try {
                            File externalStorageDirectory = Environment.getExternalStorageDirectory();
                            result.a(externalStorageDirectory != null ? externalStorageDirectory.getPath() : null);
                        } catch (Exception unused2) {
                            break;
                        }
                        g1.q qVar322222222222222 = g1.q.f2865a;
                        break;
                    }
                    break;
                case 1916964189:
                    if (str.equals("picturesDirPath")) {
                        action = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getPath();
                        result.a(action);
                        g1.q qVar3222222222222222 = g1.q.f2865a;
                        break;
                    }
                    break;
                case 1924985699:
                    if (str.equals("StartedIntentChannel.dataString")) {
                        Activity activity15 = this.f2651d;
                        if (activity15 == null) {
                            kotlin.jvm.internal.k.o("activity");
                        } else {
                            activity2 = activity15;
                        }
                        action = activity2.getIntent().getDataString();
                        result.a(action);
                        g1.q qVar32222222222222222 = g1.q.f2865a;
                        break;
                    }
                    break;
                case 2003595768:
                    if (str.equals("getRequestedOrientation")) {
                        Activity activity16 = this.f2651d;
                        if (activity16 == null) {
                            kotlin.jvm.internal.k.o("activity");
                        } else {
                            activity2 = activity16;
                        }
                        i2 = activity2.getRequestedOrientation();
                        action = Integer.valueOf(i2);
                        result.a(action);
                        g1.q qVar322222222222222222 = g1.q.f2865a;
                        break;
                    }
                    break;
            }
        }
        result.b();
        g1.q qVar3222222222222222222 = g1.q.f2865a;
    }

    @Override // t0.a
    public void n() {
        e();
    }
}
