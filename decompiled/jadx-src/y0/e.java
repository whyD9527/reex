package y0;

import java.util.HashMap;
import java.util.Map;
import z0.k;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final z0.k f4523a;

    /* renamed from: b, reason: collision with root package name */
    private b f4524b;

    /* renamed from: c, reason: collision with root package name */
    public final k.c f4525c;

    class a implements k.c {

        /* renamed from: a, reason: collision with root package name */
        Map<Long, Long> f4526a = new HashMap();

        a() {
        }

        @Override // z0.k.c
        public void m(z0.j jVar, k.d dVar) {
            if (e.this.f4524b != null) {
                String str = jVar.f4754a;
                str.hashCode();
                if (!str.equals("getKeyboardState")) {
                    dVar.b();
                    return;
                } else {
                    try {
                        this.f4526a = e.this.f4524b.a();
                    } catch (IllegalStateException e3) {
                        dVar.c("error", e3.getMessage(), null);
                    }
                }
            }
            dVar.a(this.f4526a);
        }
    }

    public interface b {
        Map<Long, Long> a();
    }

    public e(z0.c cVar) {
        a aVar = new a();
        this.f4525c = aVar;
        z0.k kVar = new z0.k(cVar, "flutter/keyboard", z0.r.f4769b);
        this.f4523a = kVar;
        kVar.e(aVar);
    }

    public void b(b bVar) {
        this.f4524b = bVar;
    }
}
