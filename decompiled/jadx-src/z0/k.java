package z0;

import java.nio.ByteBuffer;
import z0.c;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final z0.c f4756a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4757b;

    /* renamed from: c, reason: collision with root package name */
    private final l f4758c;

    /* renamed from: d, reason: collision with root package name */
    private final c.InterfaceC0078c f4759d;

    private final class a implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private final c f4760a;

        /* renamed from: z0.k$a$a, reason: collision with other inner class name */
        class C0080a implements d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c.b f4762a;

            C0080a(c.b bVar) {
                this.f4762a = bVar;
            }

            @Override // z0.k.d
            public void a(Object obj) {
                this.f4762a.a(k.this.f4758c.a(obj));
            }

            @Override // z0.k.d
            public void b() {
                this.f4762a.a(null);
            }

            @Override // z0.k.d
            public void c(String str, String str2, Object obj) {
                this.f4762a.a(k.this.f4758c.c(str, str2, obj));
            }
        }

        a(c cVar) {
            this.f4760a = cVar;
        }

        @Override // z0.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            try {
                this.f4760a.m(k.this.f4758c.e(byteBuffer), new C0080a(bVar));
            } catch (RuntimeException e3) {
                n0.b.c("MethodChannel#" + k.this.f4757b, "Failed to handle method call", e3);
                bVar.a(k.this.f4758c.b("error", e3.getMessage(), null, n0.b.d(e3)));
            }
        }
    }

    private final class b implements c.b {

        /* renamed from: a, reason: collision with root package name */
        private final d f4764a;

        b(d dVar) {
            this.f4764a = dVar;
        }

        @Override // z0.c.b
        public void a(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.f4764a.b();
                } else {
                    try {
                        this.f4764a.a(k.this.f4758c.f(byteBuffer));
                    } catch (e e3) {
                        this.f4764a.c(e3.f4750e, e3.getMessage(), e3.f4751f);
                    }
                }
            } catch (RuntimeException e4) {
                n0.b.c("MethodChannel#" + k.this.f4757b, "Failed to handle method call result", e4);
            }
        }
    }

    public interface c {
        void m(j jVar, d dVar);
    }

    public interface d {
        void a(Object obj);

        void b();

        void c(String str, String str2, Object obj);
    }

    public k(z0.c cVar, String str) {
        this(cVar, str, r.f4769b);
    }

    public k(z0.c cVar, String str, l lVar) {
        this(cVar, str, lVar, null);
    }

    public k(z0.c cVar, String str, l lVar, c.InterfaceC0078c interfaceC0078c) {
        this.f4756a = cVar;
        this.f4757b = str;
        this.f4758c = lVar;
        this.f4759d = interfaceC0078c;
    }

    public void c(String str, Object obj) {
        d(str, obj, null);
    }

    public void d(String str, Object obj, d dVar) {
        this.f4756a.d(this.f4757b, this.f4758c.d(new j(str, obj)), dVar == null ? null : new b(dVar));
    }

    public void e(c cVar) {
        if (this.f4759d != null) {
            this.f4756a.e(this.f4757b, cVar != null ? new a(cVar) : null, this.f4759d);
        } else {
            this.f4756a.c(this.f4757b, cVar != null ? new a(cVar) : null);
        }
    }
}
