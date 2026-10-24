package z0;

import java.nio.ByteBuffer;
import z0.c;

/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final z0.c f4730a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4731b;

    /* renamed from: c, reason: collision with root package name */
    private final i<T> f4732c;

    /* renamed from: d, reason: collision with root package name */
    private final c.InterfaceC0078c f4733d;

    private final class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private final d<T> f4734a;

        /* renamed from: z0.a$b$a, reason: collision with other inner class name */
        class C0077a implements e<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c.b f4736a;

            C0077a(c.b bVar) {
                this.f4736a = bVar;
            }

            @Override // z0.a.e
            public void a(T t2) {
                this.f4736a.a(a.this.f4732c.a(t2));
            }
        }

        private b(d<T> dVar) {
            this.f4734a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // z0.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            try {
                this.f4734a.a(a.this.f4732c.b(byteBuffer), new C0077a(bVar));
            } catch (RuntimeException e3) {
                n0.b.c("BasicMessageChannel#" + a.this.f4731b, "Failed to handle message", e3);
                bVar.a(null);
            }
        }
    }

    private final class c implements c.b {

        /* renamed from: a, reason: collision with root package name */
        private final e<T> f4738a;

        private c(e<T> eVar) {
            this.f4738a = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // z0.c.b
        public void a(ByteBuffer byteBuffer) {
            try {
                this.f4738a.a(a.this.f4732c.b(byteBuffer));
            } catch (RuntimeException e3) {
                n0.b.c("BasicMessageChannel#" + a.this.f4731b, "Failed to handle message reply", e3);
            }
        }
    }

    public interface d<T> {
        void a(T t2, e<T> eVar);
    }

    public interface e<T> {
        void a(T t2);
    }

    public a(z0.c cVar, String str, i<T> iVar) {
        this(cVar, str, iVar, null);
    }

    public a(z0.c cVar, String str, i<T> iVar, c.InterfaceC0078c interfaceC0078c) {
        this.f4730a = cVar;
        this.f4731b = str;
        this.f4732c = iVar;
        this.f4733d = interfaceC0078c;
    }

    public void c(T t2) {
        d(t2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(T t2, e<T> eVar) {
        this.f4730a.d(this.f4731b, this.f4732c.a(t2), eVar != null ? new c(eVar) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [z0.c] */
    /* JADX WARN: Type inference failed for: r1v0, types: [z0.a$a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [z0.c$a] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public void e(d<T> dVar) {
        if (this.f4733d != null) {
            this.f4730a.e(this.f4731b, dVar != null ? new b(dVar) : null, this.f4733d);
        } else {
            this.f4730a.c(this.f4731b, dVar != null ? new b(dVar) : 0);
        }
    }
}
