package d1;

import d1.a;
import java.util.ArrayList;
import z0.a;
import z0.q;

/* loaded from: classes.dex */
public final /* synthetic */ class i {
    public static z0.i<Object> a() {
        return new q();
    }

    public static /* synthetic */ void b(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.a());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.e());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void d(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.c());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.b());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void f(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.g());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void g(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.d());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void h(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.f(arrayList2.get(0) == null ? null : a.c.values()[((Integer) arrayList2.get(0)).intValue()]));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static void i(z0.c cVar, final a.b bVar) {
        z0.a aVar = new z0.a(cVar, "dev.flutter.pigeon.PathProviderApi.getTemporaryPath", a(), cVar.b());
        if (bVar != null) {
            aVar.e(new a.d() { // from class: d1.b
                @Override // z0.a.d
                public final void a(Object obj, a.e eVar) {
                    i.b(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        z0.a aVar2 = new z0.a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationSupportPath", a(), cVar.b());
        if (bVar != null) {
            aVar2.e(new a.d() { // from class: d1.c
                @Override // z0.a.d
                public final void a(Object obj, a.e eVar) {
                    i.c(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        z0.a aVar3 = new z0.a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationDocumentsPath", a(), cVar.b());
        if (bVar != null) {
            aVar3.e(new a.d() { // from class: d1.d
                @Override // z0.a.d
                public final void a(Object obj, a.e eVar) {
                    i.d(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        z0.a aVar4 = new z0.a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationCachePath", a(), cVar.b());
        if (bVar != null) {
            aVar4.e(new a.d() { // from class: d1.e
                @Override // z0.a.d
                public final void a(Object obj, a.e eVar) {
                    i.e(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar4.e(null);
        }
        z0.a aVar5 = new z0.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePath", a(), cVar.b());
        if (bVar != null) {
            aVar5.e(new a.d() { // from class: d1.f
                @Override // z0.a.d
                public final void a(Object obj, a.e eVar) {
                    i.f(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar5.e(null);
        }
        z0.a aVar6 = new z0.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalCachePaths", a(), cVar.b());
        if (bVar != null) {
            aVar6.e(new a.d() { // from class: d1.g
                @Override // z0.a.d
                public final void a(Object obj, a.e eVar) {
                    i.g(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar6.e(null);
        }
        z0.a aVar7 = new z0.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePaths", a(), cVar.b());
        if (bVar != null) {
            aVar7.e(new a.d() { // from class: d1.h
                @Override // z0.a.d
                public final void a(Object obj, a.e eVar) {
                    i.h(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar7.e(null);
        }
    }
}
