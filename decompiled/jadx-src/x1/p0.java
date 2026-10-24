package x1;

import g1.k;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class p0<T> extends kotlinx.coroutines.scheduling.i {

    /* renamed from: g, reason: collision with root package name */
    public int f4434g;

    public p0(int i2) {
        this.f4434g = i2;
    }

    public void b(Object obj, Throwable th) {
    }

    public abstract j1.d<T> c();

    public Throwable d(Object obj) {
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar == null) {
            return null;
        }
        return zVar.f4481a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T e(Object obj) {
        return obj;
    }

    public final void f(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            g1.b.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.k.b(th);
        h0.a(c().getContext(), new l0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object g();

    @Override // java.lang.Runnable
    public final void run() {
        Object a3;
        Object a4;
        Object a5;
        kotlinx.coroutines.scheduling.j jVar = this.f3755f;
        try {
            kotlinx.coroutines.internal.f fVar = (kotlinx.coroutines.internal.f) c();
            j1.d<T> dVar = fVar.f3672i;
            Object obj = fVar.f3674k;
            j1.g context = dVar.getContext();
            Object c3 = kotlinx.coroutines.internal.b0.c(context, obj);
            d2<?> e3 = c3 != kotlinx.coroutines.internal.b0.f3655a ? e0.e(dVar, context, c3) : null;
            try {
                j1.g context2 = dVar.getContext();
                Object g2 = g();
                Throwable d3 = d(g2);
                k1 k1Var = (d3 == null && q0.b(this.f4434g)) ? (k1) context2.get(k1.f4420d) : null;
                if (k1Var != null && !k1Var.b()) {
                    CancellationException j2 = k1Var.j();
                    b(g2, j2);
                    k.a aVar = g1.k.f2859e;
                    a4 = g1.k.a(g1.l.a(j2));
                } else if (d3 != null) {
                    k.a aVar2 = g1.k.f2859e;
                    a4 = g1.k.a(g1.l.a(d3));
                } else {
                    a4 = g1.k.a(e(g2));
                }
                dVar.resumeWith(a4);
                g1.q qVar = g1.q.f2865a;
                try {
                    jVar.a();
                    a5 = g1.k.a(g1.q.f2865a);
                } catch (Throwable th) {
                    k.a aVar3 = g1.k.f2859e;
                    a5 = g1.k.a(g1.l.a(th));
                }
                f(null, g1.k.b(a5));
            } finally {
                if (e3 == null || e3.x0()) {
                    kotlinx.coroutines.internal.b0.a(context, c3);
                }
            }
        } catch (Throwable th2) {
            try {
                k.a aVar4 = g1.k.f2859e;
                jVar.a();
                a3 = g1.k.a(g1.q.f2865a);
            } catch (Throwable th3) {
                k.a aVar5 = g1.k.f2859e;
                a3 = g1.k.a(g1.l.a(th3));
            }
            f(th2, g1.k.b(a3));
        }
    }
}
