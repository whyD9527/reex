package e1;

import e1.a;
import java.util.ArrayList;
import java.util.Map;
import z0.a;

/* loaded from: classes.dex */
public final /* synthetic */ class g {
    public static z0.i<Object> a() {
        return a.d.f2634d;
    }

    public static /* synthetic */ void b(a.c cVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, cVar.a((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(a.c cVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, cVar.c((String) arrayList2.get(0), (Map) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void d(a.c cVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, cVar.e((String) arrayList2.get(0), (Boolean) arrayList2.get(1), (a.e) arrayList2.get(2), (a.C0040a) arrayList2.get(3)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(a.c cVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, cVar.d());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void f(a.c cVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            cVar.b();
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static void g(z0.c cVar, final a.c cVar2) {
        z0.a aVar = new z0.a(cVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", a());
        if (cVar2 != null) {
            aVar.e(new a.d() { // from class: e1.b
                @Override // z0.a.d
                public final void a(Object obj, a.e eVar) {
                    g.b(a.c.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        z0.a aVar2 = new z0.a(cVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", a());
        if (cVar2 != null) {
            aVar2.e(new a.d() { // from class: e1.c
                @Override // z0.a.d
                public final void a(Object obj, a.e eVar) {
                    g.c(a.c.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        z0.a aVar3 = new z0.a(cVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", a());
        if (cVar2 != null) {
            aVar3.e(new a.d() { // from class: e1.d
                @Override // z0.a.d
                public final void a(Object obj, a.e eVar) {
                    g.d(a.c.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        z0.a aVar4 = new z0.a(cVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", a());
        if (cVar2 != null) {
            aVar4.e(new a.d() { // from class: e1.e
                @Override // z0.a.d
                public final void a(Object obj, a.e eVar) {
                    g.e(a.c.this, obj, eVar);
                }
            });
        } else {
            aVar4.e(null);
        }
        z0.a aVar5 = new z0.a(cVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", a());
        if (cVar2 != null) {
            aVar5.e(new a.d() { // from class: e1.f
                @Override // z0.a.d
                public final void a(Object obj, a.e eVar) {
                    g.f(a.c.this, obj, eVar);
                }
            });
        } else {
            aVar5.e(null);
        }
    }
}
