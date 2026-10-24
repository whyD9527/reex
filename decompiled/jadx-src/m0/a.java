package m0;

import s0.a;
import z0.j;
import z0.k;

/* loaded from: classes.dex */
public class a implements s0.a {

    /* renamed from: a, reason: collision with root package name */
    private k f3837a;

    /* renamed from: m0.a$a, reason: collision with other inner class name */
    class C0055a implements k.c {
        C0055a() {
        }

        @Override // z0.k.c
        public void m(j jVar, k.d dVar) {
            try {
                System.loadLibrary("sqlite3");
                dVar.a(null);
            } catch (Throwable th) {
                dVar.c(th.toString(), null, null);
            }
        }
    }

    @Override // s0.a
    public void h(a.b bVar) {
        k kVar = new k(bVar.b(), "sqlite3_flutter_libs");
        this.f3837a = kVar;
        kVar.e(new C0055a());
    }

    @Override // s0.a
    public void l(a.b bVar) {
        k kVar = this.f3837a;
        if (kVar != null) {
            kVar.e(null);
            this.f3837a = null;
        }
    }
}
