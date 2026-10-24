package y0;

import java.util.HashMap;
import z0.k;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final z0.k f4547a;

    /* renamed from: b, reason: collision with root package name */
    private final k.c f4548b;

    class a implements k.c {
        a() {
        }

        @Override // z0.k.c
        public void m(z0.j jVar, k.d dVar) {
            dVar.a(null);
        }
    }

    public i(o0.a aVar) {
        a aVar2 = new a();
        this.f4548b = aVar2;
        z0.k kVar = new z0.k(aVar, "flutter/navigation", z0.g.f4753a);
        this.f4547a = kVar;
        kVar.e(aVar2);
    }

    public void a() {
        n0.b.f("NavigationChannel", "Sending message to pop route.");
        this.f4547a.c("popRoute", null);
    }

    public void b(String str) {
        n0.b.f("NavigationChannel", "Sending message to push route information '" + str + "'");
        HashMap hashMap = new HashMap();
        hashMap.put("location", str);
        this.f4547a.c("pushRouteInformation", hashMap);
    }

    public void c(String str) {
        n0.b.f("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f4547a.c("setInitialRoute", str);
    }
}
