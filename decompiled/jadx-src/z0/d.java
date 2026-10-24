package z0;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import z0.c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final z0.c f4741a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4742b;

    /* renamed from: c, reason: collision with root package name */
    private final l f4743c;

    /* renamed from: d, reason: collision with root package name */
    private final c.InterfaceC0078c f4744d;

    public interface b {
        void a(Object obj);
    }

    private final class c implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC0079d f4745a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicReference<b> f4746b = new AtomicReference<>(null);

        private final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            final AtomicBoolean f4748a;

            private a() {
                this.f4748a = new AtomicBoolean(false);
            }

            @Override // z0.d.b
            public void a(Object obj) {
                if (this.f4748a.get() || c.this.f4746b.get() != this) {
                    return;
                }
                d.this.f4741a.f(d.this.f4742b, d.this.f4743c.a(obj));
            }
        }

        c(InterfaceC0079d interfaceC0079d) {
            this.f4745a = interfaceC0079d;
        }

        private void c(Object obj, c.b bVar) {
            ByteBuffer c3;
            if (this.f4746b.getAndSet(null) != null) {
                try {
                    this.f4745a.b(obj);
                    bVar.a(d.this.f4743c.a(null));
                    return;
                } catch (RuntimeException e3) {
                    n0.b.c("EventChannel#" + d.this.f4742b, "Failed to close event stream", e3);
                    c3 = d.this.f4743c.c("error", e3.getMessage(), null);
                }
            } else {
                c3 = d.this.f4743c.c("error", "No active stream to cancel", null);
            }
            bVar.a(c3);
        }

        private void d(Object obj, c.b bVar) {
            a aVar = new a();
            if (this.f4746b.getAndSet(aVar) != null) {
                try {
                    this.f4745a.b(null);
                } catch (RuntimeException e3) {
                    n0.b.c("EventChannel#" + d.this.f4742b, "Failed to close existing event stream", e3);
                }
            }
            try {
                this.f4745a.a(obj, aVar);
                bVar.a(d.this.f4743c.a(null));
            } catch (RuntimeException e4) {
                this.f4746b.set(null);
                n0.b.c("EventChannel#" + d.this.f4742b, "Failed to open event stream", e4);
                bVar.a(d.this.f4743c.c("error", e4.getMessage(), null));
            }
        }

        @Override // z0.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            j e3 = d.this.f4743c.e(byteBuffer);
            if (e3.f4754a.equals("listen")) {
                d(e3.f4755b, bVar);
            } else if (e3.f4754a.equals("cancel")) {
                c(e3.f4755b, bVar);
            } else {
                bVar.a(null);
            }
        }
    }

    /* renamed from: z0.d$d, reason: collision with other inner class name */
    public interface InterfaceC0079d {
        void a(Object obj, b bVar);

        void b(Object obj);
    }

    public d(z0.c cVar, String str) {
        this(cVar, str, r.f4769b);
    }

    public d(z0.c cVar, String str, l lVar) {
        this(cVar, str, lVar, null);
    }

    public d(z0.c cVar, String str, l lVar, c.InterfaceC0078c interfaceC0078c) {
        this.f4741a = cVar;
        this.f4742b = str;
        this.f4743c = lVar;
        this.f4744d = interfaceC0078c;
    }

    public void d(InterfaceC0079d interfaceC0079d) {
        if (this.f4744d != null) {
            this.f4741a.e(this.f4742b, interfaceC0079d != null ? new c(interfaceC0079d) : null, this.f4744d);
        } else {
            this.f4741a.c(this.f4742b, interfaceC0079d != null ? new c(interfaceC0079d) : null);
        }
    }
}
