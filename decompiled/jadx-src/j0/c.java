package j0;

import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import w1.n;
import w1.o;
import z0.j;
import z0.k;

/* loaded from: classes.dex */
public final class c implements k.c {

    /* renamed from: a, reason: collision with root package name */
    private final PackageManager f3600a;

    /* renamed from: b, reason: collision with root package name */
    private final WindowManager f3601b;

    public c(PackageManager packageManager, WindowManager windowManager) {
        kotlin.jvm.internal.k.e(packageManager, "packageManager");
        kotlin.jvm.internal.k.e(windowManager, "windowManager");
        this.f3600a = packageManager;
        this.f3601b = windowManager;
    }

    private final List<String> a() {
        int i2;
        FeatureInfo[] systemAvailableFeatures = this.f3600a.getSystemAvailableFeatures();
        kotlin.jvm.internal.k.d(systemAvailableFeatures, "packageManager.systemAvailableFeatures");
        ArrayList arrayList = new ArrayList();
        for (FeatureInfo featureInfo : systemAvailableFeatures) {
            if (!(featureInfo.name == null)) {
                arrayList.add(featureInfo);
            }
        }
        i2 = h1.k.i(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(i2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FeatureInfo) it.next()).name);
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r0 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean b() {
        boolean o2;
        boolean o3;
        boolean o4;
        boolean r2;
        boolean r3;
        boolean r4;
        boolean r5;
        boolean r6;
        boolean r7;
        boolean r8;
        boolean r9;
        boolean r10;
        boolean r11;
        boolean o5;
        String BRAND = Build.BRAND;
        kotlin.jvm.internal.k.d(BRAND, "BRAND");
        o2 = n.o(BRAND, "generic", false, 2, null);
        if (o2) {
            String DEVICE = Build.DEVICE;
            kotlin.jvm.internal.k.d(DEVICE, "DEVICE");
            o5 = n.o(DEVICE, "generic", false, 2, null);
        }
        String FINGERPRINT = Build.FINGERPRINT;
        kotlin.jvm.internal.k.d(FINGERPRINT, "FINGERPRINT");
        o3 = n.o(FINGERPRINT, "generic", false, 2, null);
        if (!o3) {
            kotlin.jvm.internal.k.d(FINGERPRINT, "FINGERPRINT");
            o4 = n.o(FINGERPRINT, "unknown", false, 2, null);
            if (!o4) {
                String HARDWARE = Build.HARDWARE;
                kotlin.jvm.internal.k.d(HARDWARE, "HARDWARE");
                r2 = o.r(HARDWARE, "goldfish", false, 2, null);
                if (!r2) {
                    kotlin.jvm.internal.k.d(HARDWARE, "HARDWARE");
                    r3 = o.r(HARDWARE, "ranchu", false, 2, null);
                    if (!r3) {
                        String MODEL = Build.MODEL;
                        kotlin.jvm.internal.k.d(MODEL, "MODEL");
                        r4 = o.r(MODEL, "google_sdk", false, 2, null);
                        if (!r4) {
                            kotlin.jvm.internal.k.d(MODEL, "MODEL");
                            r5 = o.r(MODEL, "Emulator", false, 2, null);
                            if (!r5) {
                                kotlin.jvm.internal.k.d(MODEL, "MODEL");
                                r6 = o.r(MODEL, "Android SDK built for x86", false, 2, null);
                                if (!r6) {
                                    String MANUFACTURER = Build.MANUFACTURER;
                                    kotlin.jvm.internal.k.d(MANUFACTURER, "MANUFACTURER");
                                    r7 = o.r(MANUFACTURER, "Genymotion", false, 2, null);
                                    if (!r7) {
                                        String PRODUCT = Build.PRODUCT;
                                        kotlin.jvm.internal.k.d(PRODUCT, "PRODUCT");
                                        r8 = o.r(PRODUCT, "sdk", false, 2, null);
                                        if (!r8) {
                                            kotlin.jvm.internal.k.d(PRODUCT, "PRODUCT");
                                            r9 = o.r(PRODUCT, "vbox86p", false, 2, null);
                                            if (!r9) {
                                                kotlin.jvm.internal.k.d(PRODUCT, "PRODUCT");
                                                r10 = o.r(PRODUCT, "emulator", false, 2, null);
                                                if (!r10) {
                                                    kotlin.jvm.internal.k.d(PRODUCT, "PRODUCT");
                                                    r11 = o.r(PRODUCT, "simulator", false, 2, null);
                                                    if (!r11) {
                                                        return false;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // z0.k.c
    public void m(j call, k.d result) {
        List e3;
        List e4;
        List e5;
        String str;
        String str2;
        kotlin.jvm.internal.k.e(call, "call");
        kotlin.jvm.internal.k.e(result, "result");
        if (!call.f4754a.equals("getDeviceInfo")) {
            result.b();
            return;
        }
        HashMap hashMap = new HashMap();
        String BOARD = Build.BOARD;
        kotlin.jvm.internal.k.d(BOARD, "BOARD");
        hashMap.put("board", BOARD);
        String BOOTLOADER = Build.BOOTLOADER;
        kotlin.jvm.internal.k.d(BOOTLOADER, "BOOTLOADER");
        hashMap.put("bootloader", BOOTLOADER);
        String BRAND = Build.BRAND;
        kotlin.jvm.internal.k.d(BRAND, "BRAND");
        hashMap.put("brand", BRAND);
        String DEVICE = Build.DEVICE;
        kotlin.jvm.internal.k.d(DEVICE, "DEVICE");
        hashMap.put("device", DEVICE);
        String DISPLAY = Build.DISPLAY;
        kotlin.jvm.internal.k.d(DISPLAY, "DISPLAY");
        hashMap.put("display", DISPLAY);
        String FINGERPRINT = Build.FINGERPRINT;
        kotlin.jvm.internal.k.d(FINGERPRINT, "FINGERPRINT");
        hashMap.put("fingerprint", FINGERPRINT);
        String HARDWARE = Build.HARDWARE;
        kotlin.jvm.internal.k.d(HARDWARE, "HARDWARE");
        hashMap.put("hardware", HARDWARE);
        String HOST = Build.HOST;
        kotlin.jvm.internal.k.d(HOST, "HOST");
        hashMap.put("host", HOST);
        String ID = Build.ID;
        kotlin.jvm.internal.k.d(ID, "ID");
        hashMap.put("id", ID);
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.k.d(MANUFACTURER, "MANUFACTURER");
        hashMap.put("manufacturer", MANUFACTURER);
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.k.d(MODEL, "MODEL");
        hashMap.put("model", MODEL);
        String PRODUCT = Build.PRODUCT;
        kotlin.jvm.internal.k.d(PRODUCT, "PRODUCT");
        hashMap.put("product", PRODUCT);
        int i2 = Build.VERSION.SDK_INT;
        String[] SUPPORTED_32_BIT_ABIS = Build.SUPPORTED_32_BIT_ABIS;
        kotlin.jvm.internal.k.d(SUPPORTED_32_BIT_ABIS, "SUPPORTED_32_BIT_ABIS");
        e3 = h1.j.e(Arrays.copyOf(SUPPORTED_32_BIT_ABIS, SUPPORTED_32_BIT_ABIS.length));
        hashMap.put("supported32BitAbis", e3);
        String[] SUPPORTED_64_BIT_ABIS = Build.SUPPORTED_64_BIT_ABIS;
        kotlin.jvm.internal.k.d(SUPPORTED_64_BIT_ABIS, "SUPPORTED_64_BIT_ABIS");
        e4 = h1.j.e(Arrays.copyOf(SUPPORTED_64_BIT_ABIS, SUPPORTED_64_BIT_ABIS.length));
        hashMap.put("supported64BitAbis", e4);
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        kotlin.jvm.internal.k.d(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        e5 = h1.j.e(Arrays.copyOf(SUPPORTED_ABIS, SUPPORTED_ABIS.length));
        hashMap.put("supportedAbis", e5);
        String TAGS = Build.TAGS;
        kotlin.jvm.internal.k.d(TAGS, "TAGS");
        hashMap.put("tags", TAGS);
        String TYPE = Build.TYPE;
        kotlin.jvm.internal.k.d(TYPE, "TYPE");
        hashMap.put("type", TYPE);
        hashMap.put("isPhysicalDevice", Boolean.valueOf(!b()));
        hashMap.put("systemFeatures", a());
        HashMap hashMap2 = new HashMap();
        String BASE_OS = Build.VERSION.BASE_OS;
        kotlin.jvm.internal.k.d(BASE_OS, "BASE_OS");
        hashMap2.put("baseOS", BASE_OS);
        hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
        String SECURITY_PATCH = Build.VERSION.SECURITY_PATCH;
        kotlin.jvm.internal.k.d(SECURITY_PATCH, "SECURITY_PATCH");
        hashMap2.put("securityPatch", SECURITY_PATCH);
        String CODENAME = Build.VERSION.CODENAME;
        kotlin.jvm.internal.k.d(CODENAME, "CODENAME");
        hashMap2.put("codename", CODENAME);
        String INCREMENTAL = Build.VERSION.INCREMENTAL;
        kotlin.jvm.internal.k.d(INCREMENTAL, "INCREMENTAL");
        hashMap2.put("incremental", INCREMENTAL);
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.k.d(RELEASE, "RELEASE");
        hashMap2.put("release", RELEASE);
        hashMap2.put("sdkInt", Integer.valueOf(i2));
        hashMap.put("version", hashMap2);
        Display defaultDisplay = this.f3601b.getDefaultDisplay();
        kotlin.jvm.internal.k.d(defaultDisplay, "windowManager.defaultDisplay");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("widthPx", Double.valueOf(displayMetrics.widthPixels));
        hashMap3.put("heightPx", Double.valueOf(displayMetrics.heightPixels));
        hashMap3.put("xDpi", Float.valueOf(displayMetrics.xdpi));
        hashMap3.put("yDpi", Float.valueOf(displayMetrics.ydpi));
        hashMap.put("displayMetrics", hashMap3);
        if (i2 >= 26) {
            try {
                str = Build.getSerial();
            } catch (SecurityException unused) {
                str = "unknown";
            }
            str2 = "try {\n                  …UNKNOWN\n                }";
        } else {
            str = Build.SERIAL;
            str2 = "SERIAL";
        }
        kotlin.jvm.internal.k.d(str, str2);
        hashMap.put("serialNumber", str);
        result.a(hashMap);
    }
}
