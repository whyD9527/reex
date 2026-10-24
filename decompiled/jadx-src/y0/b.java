package y0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import z0.k;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final z0.k f4514a;

    /* renamed from: b, reason: collision with root package name */
    private p0.a f4515b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, List<k.d>> f4516c;

    /* renamed from: d, reason: collision with root package name */
    final k.c f4517d;

    class a implements k.c {
        a() {
        }

        @Override // z0.k.c
        public void m(z0.j jVar, k.d dVar) {
            int intValue;
            String str;
            String str2;
            if (b.this.f4515b == null) {
                return;
            }
            String str3 = jVar.f4754a;
            Map map = (Map) jVar.b();
            n0.b.f("DeferredComponentChannel", "Received '" + str3 + "' message.");
            intValue = ((Integer) map.get("loadingUnitId")).intValue();
            str = (String) map.get("componentName");
            str3.hashCode();
            switch (str3) {
                case "uninstallDeferredComponent":
                    b.this.f4515b.b(intValue, str);
                    str2 = null;
                    break;
                case "getDeferredComponentInstallState":
                    str2 = b.this.f4515b.a(intValue, str);
                    break;
                case "installDeferredComponent":
                    b.this.f4515b.e(intValue, str);
                    if (!b.this.f4516c.containsKey(str)) {
                        b.this.f4516c.put(str, new ArrayList());
                    }
                    ((List) b.this.f4516c.get(str)).add(dVar);
                    return;
                default:
                    dVar.b();
                    return;
            }
            dVar.a(str2);
        }
    }

    public b(o0.a aVar) {
        a aVar2 = new a();
        this.f4517d = aVar2;
        z0.k kVar = new z0.k(aVar, "flutter/deferredcomponent", z0.r.f4769b);
        this.f4514a = kVar;
        kVar.e(aVar2);
        this.f4515b = n0.a.e().a();
        this.f4516c = new HashMap();
    }

    public void c(p0.a aVar) {
        this.f4515b = aVar;
    }
}
