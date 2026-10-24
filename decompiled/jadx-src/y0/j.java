package y0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z0.k;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final z0.k f4550a;

    /* renamed from: b, reason: collision with root package name */
    private h f4551b;

    /* renamed from: c, reason: collision with root package name */
    final k.c f4552c;

    class a implements k.c {
        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0143 A[Catch: JSONException -> 0x024c, TryCatch #11 {JSONException -> 0x024c, blocks: (B:7:0x002c, B:8:0x0030, B:12:0x00db, B:14:0x00e0, B:15:0x00eb, B:17:0x00f0, B:19:0x0109, B:20:0x0119, B:28:0x011d, B:23:0x0137, B:25:0x0143, B:30:0x0122, B:31:0x0150, B:32:0x015a, B:33:0x018c, B:34:0x0197, B:36:0x0218, B:44:0x0232, B:60:0x0183, B:41:0x0187, B:66:0x01bb, B:78:0x01d9, B:54:0x01f5, B:72:0x0212, B:40:0x022c, B:48:0x0246, B:79:0x0035, B:82:0x0040, B:85:0x004b, B:88:0x0057, B:91:0x0063, B:94:0x006e, B:97:0x0079, B:100:0x0083, B:103:0x008d, B:106:0x0097, B:109:0x00a1, B:112:0x00ab, B:115:0x00b6, B:118:0x00c1, B:121:0x00cc, B:50:0x01de), top: B:6:0x002c, inners: #1, #2, #5, #8 }] */
        @Override // z0.k.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m(z0.j jVar, k.d dVar) {
            String message;
            e b3;
            CharSequence a3;
            if (j.this.f4551b == null) {
            }
            String str = jVar.f4754a;
            Object obj = jVar.f4755b;
            n0.b.f("PlatformChannel", "Received '" + str + "' message.");
            try {
                switch (str) {
                    case "SystemSound.play":
                        try {
                            j.this.f4551b.o(i.b((String) obj));
                            dVar.a(null);
                            break;
                        } catch (NoSuchFieldException e3) {
                            message = e3.getMessage();
                            dVar.c("error", message, null);
                            return;
                        }
                    case "HapticFeedback.vibrate":
                        try {
                            j.this.f4551b.j(g.b((String) obj));
                            dVar.a(null);
                            break;
                        } catch (NoSuchFieldException e4) {
                            message = e4.getMessage();
                            dVar.c("error", message, null);
                            return;
                        }
                    case "SystemChrome.setPreferredOrientations":
                        try {
                            j.this.f4551b.l(j.this.h((JSONArray) obj));
                            dVar.a(null);
                            break;
                        } catch (NoSuchFieldException | JSONException e5) {
                            message = e5.getMessage();
                            dVar.c("error", message, null);
                            return;
                        }
                    case "SystemChrome.setApplicationSwitcherDescription":
                        try {
                            j.this.f4551b.e(j.this.g((JSONObject) obj));
                            dVar.a(null);
                            break;
                        } catch (JSONException e6) {
                            message = e6.getMessage();
                            dVar.c("error", message, null);
                            return;
                        }
                    case "SystemChrome.setEnabledSystemUIOverlays":
                        try {
                            j.this.f4551b.c(j.this.k((JSONArray) obj));
                            dVar.a(null);
                            break;
                        } catch (NoSuchFieldException | JSONException e7) {
                            message = e7.getMessage();
                            dVar.c("error", message, null);
                            return;
                        }
                    case "SystemChrome.setEnabledSystemUIMode":
                        try {
                            j.this.f4551b.k(j.this.j((String) obj));
                            dVar.a(null);
                            break;
                        } catch (NoSuchFieldException | JSONException e8) {
                            message = e8.getMessage();
                            dVar.c("error", message, null);
                            return;
                        }
                    case "SystemChrome.setSystemUIChangeListener":
                        j.this.f4551b.d();
                        dVar.a(null);
                        break;
                    case "SystemChrome.restoreSystemUIOverlays":
                        j.this.f4551b.h();
                        dVar.a(null);
                        break;
                    case "SystemChrome.setSystemUIOverlayStyle":
                        try {
                            j.this.f4551b.f(j.this.i((JSONObject) obj));
                            dVar.a(null);
                            break;
                        } catch (NoSuchFieldException | JSONException e9) {
                            message = e9.getMessage();
                            dVar.c("error", message, null);
                            return;
                        }
                    case "SystemNavigator.setFrameworkHandlesBack":
                        j.this.f4551b.g(((Boolean) obj).booleanValue());
                        dVar.a(null);
                        break;
                    case "SystemNavigator.pop":
                        j.this.f4551b.b();
                        dVar.a(null);
                        break;
                    case "Clipboard.getData":
                        String str2 = (String) obj;
                        if (str2 != null) {
                            try {
                                b3 = e.b(str2);
                            } catch (NoSuchFieldException unused) {
                                dVar.c("error", "No such clipboard content format: " + str2, null);
                            }
                            a3 = j.this.f4551b.a(b3);
                            if (a3 != null) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("text", a3);
                                dVar.a(jSONObject);
                                break;
                            }
                            dVar.a(null);
                            break;
                        }
                        b3 = null;
                        a3 = j.this.f4551b.a(b3);
                        if (a3 != null) {
                        }
                        dVar.a(null);
                    case "Clipboard.setData":
                        j.this.f4551b.i(((JSONObject) obj).getString("text"));
                        dVar.a(null);
                        break;
                    case "Clipboard.hasStrings":
                        boolean n2 = j.this.f4551b.n();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("value", n2);
                        dVar.a(jSONObject2);
                        break;
                    case "Share.invoke":
                        j.this.f4551b.m((String) obj);
                        dVar.a(null);
                        break;
                    default:
                        dVar.b();
                        break;
                }
            } catch (JSONException e10) {
                dVar.c("error", "JSON error: " + e10.getMessage(), null);
            }
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4554a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f4555b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f4556c;

        static {
            int[] iArr = new int[k.values().length];
            f4556c = iArr;
            try {
                iArr[k.LEAN_BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4556c[k.IMMERSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4556c[k.IMMERSIVE_STICKY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4556c[k.EDGE_TO_EDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[l.values().length];
            f4555b = iArr2;
            try {
                iArr2[l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4555b[l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[f.values().length];
            f4554a = iArr3;
            try {
                iArr3[f.PORTRAIT_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4554a[f.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4554a[f.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4554a[f.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f4557a;

        /* renamed from: b, reason: collision with root package name */
        public final String f4558b;

        public c(int i2, String str) {
            this.f4557a = i2;
            this.f4558b = str;
        }
    }

    public enum d {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");


        /* renamed from: e, reason: collision with root package name */
        private String f4562e;

        d(String str) {
            this.f4562e = str;
        }

        static d b(String str) {
            for (d dVar : values()) {
                if (dVar.f4562e.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    public enum e {
        PLAIN_TEXT("text/plain");


        /* renamed from: e, reason: collision with root package name */
        private String f4565e;

        e(String str) {
            this.f4565e = str;
        }

        static e b(String str) {
            for (e eVar : values()) {
                if (eVar.f4565e.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    public enum f {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");


        /* renamed from: e, reason: collision with root package name */
        private String f4571e;

        f(String str) {
            this.f4571e = str;
        }

        static f b(String str) {
            for (f fVar : values()) {
                if (fVar.f4571e.equals(str)) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    public enum g {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");


        /* renamed from: e, reason: collision with root package name */
        private final String f4578e;

        g(String str) {
            this.f4578e = str;
        }

        static g b(String str) {
            for (g gVar : values()) {
                String str2 = gVar.f4578e;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    public interface h {
        CharSequence a(e eVar);

        void b();

        void c(List<l> list);

        void d();

        void e(c cVar);

        void f(C0073j c0073j);

        void g(boolean z2);

        void h();

        void i(String str);

        void j(g gVar);

        void k(k kVar);

        void l(int i2);

        void m(String str);

        boolean n();

        void o(i iVar);
    }

    public enum i {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");


        /* renamed from: e, reason: collision with root package name */
        private final String f4582e;

        i(String str) {
            this.f4582e = str;
        }

        static i b(String str) {
            for (i iVar : values()) {
                if (iVar.f4582e.equals(str)) {
                    return iVar;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    /* renamed from: y0.j$j, reason: collision with other inner class name */
    public static class C0073j {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f4583a;

        /* renamed from: b, reason: collision with root package name */
        public final d f4584b;

        /* renamed from: c, reason: collision with root package name */
        public final Boolean f4585c;

        /* renamed from: d, reason: collision with root package name */
        public final Integer f4586d;

        /* renamed from: e, reason: collision with root package name */
        public final d f4587e;

        /* renamed from: f, reason: collision with root package name */
        public final Integer f4588f;

        /* renamed from: g, reason: collision with root package name */
        public final Boolean f4589g;

        public C0073j(Integer num, d dVar, Boolean bool, Integer num2, d dVar2, Integer num3, Boolean bool2) {
            this.f4583a = num;
            this.f4584b = dVar;
            this.f4585c = bool;
            this.f4586d = num2;
            this.f4587e = dVar2;
            this.f4588f = num3;
            this.f4589g = bool2;
        }
    }

    public enum k {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");


        /* renamed from: e, reason: collision with root package name */
        private String f4595e;

        k(String str) {
            this.f4595e = str;
        }

        static k b(String str) {
            for (k kVar : values()) {
                if (kVar.f4595e.equals(str)) {
                    return kVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    public enum l {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");


        /* renamed from: e, reason: collision with root package name */
        private String f4599e;

        l(String str) {
            this.f4599e = str;
        }

        static l b(String str) {
            for (l lVar : values()) {
                if (lVar.f4599e.equals(str)) {
                    return lVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public j(o0.a aVar) {
        a aVar2 = new a();
        this.f4552c = aVar2;
        z0.k kVar = new z0.k(aVar, "flutter/platform", z0.g.f4753a);
        this.f4550a = kVar;
        kVar.e(aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c g(JSONObject jSONObject) {
        int i2 = jSONObject.getInt("primaryColor");
        if (i2 != 0) {
            i2 |= -16777216;
        }
        return new c(i2, jSONObject.getString("label"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int h(JSONArray jSONArray) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            int i5 = b.f4554a[f.b(jSONArray.getString(i4)).ordinal()];
            if (i5 == 1) {
                i2 |= 1;
            } else if (i5 == 2) {
                i2 |= 4;
            } else if (i5 == 3) {
                i2 |= 2;
            } else if (i5 == 4) {
                i2 |= 8;
            }
            if (i3 == 0) {
                i3 = i2;
            }
        }
        if (i2 == 0) {
            return -1;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
            case 6:
            case 7:
            case 9:
            case 12:
            case 13:
            case 14:
                if (i3 != 2) {
                    if (i3 != 4) {
                        return i3 != 8 ? 1 : 8;
                    }
                    return 9;
                }
                return 0;
            case 4:
                return 9;
            case 5:
                return 12;
            case 8:
                return 8;
            case 10:
                return 11;
            case 11:
                return 2;
            case 15:
                return 13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0073j i(JSONObject jSONObject) {
        return new C0073j(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? d.b(jSONObject.getString("statusBarIconBrightness")) : null, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? d.b(jSONObject.getString("systemNavigationBarIconBrightness")) : null, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k j(String str) {
        int i2 = b.f4556c[k.b(str).ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? k.EDGE_TO_EDGE : k.EDGE_TO_EDGE : k.IMMERSIVE_STICKY : k.IMMERSIVE : k.LEAN_BACK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<l> k(JSONArray jSONArray) {
        l lVar;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            int i3 = b.f4555b[l.b(jSONArray.getString(i2)).ordinal()];
            if (i3 == 1) {
                lVar = l.TOP_OVERLAYS;
            } else if (i3 == 2) {
                lVar = l.BOTTOM_OVERLAYS;
            }
            arrayList.add(lVar);
        }
        return arrayList;
    }

    public void l(h hVar) {
        this.f4551b = hVar;
    }

    public void m(boolean z2) {
        n0.b.f("PlatformChannel", "Sending 'systemUIChange' message.");
        this.f4550a.c("SystemChrome.systemUIChange", Arrays.asList(Boolean.valueOf(z2)));
    }
}
