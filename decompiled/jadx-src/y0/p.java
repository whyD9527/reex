package y0;

import java.util.ArrayList;
import z0.k;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final z0.k f4671a;

    /* renamed from: b, reason: collision with root package name */
    private b f4672b;

    /* renamed from: c, reason: collision with root package name */
    public final k.c f4673c;

    class a implements k.c {
        a() {
        }

        @Override // z0.k.c
        public void m(z0.j jVar, k.d dVar) {
            if (p.this.f4672b == null) {
                n0.b.f("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                return;
            }
            String str = jVar.f4754a;
            Object obj = jVar.f4755b;
            n0.b.f("SpellCheckChannel", "Received '" + str + "' message.");
            str.hashCode();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                dVar.b();
                return;
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                p.this.f4672b.a((String) arrayList.get(0), (String) arrayList.get(1), dVar);
            } catch (IllegalStateException e3) {
                dVar.c("error", e3.getMessage(), null);
            }
        }
    }

    public interface b {
        void a(String str, String str2, k.d dVar);
    }

    public p(o0.a aVar) {
        a aVar2 = new a();
        this.f4673c = aVar2;
        z0.k kVar = new z0.k(aVar, "flutter/spellcheck", z0.r.f4769b);
        this.f4671a = kVar;
        kVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f4672b = bVar;
    }
}
