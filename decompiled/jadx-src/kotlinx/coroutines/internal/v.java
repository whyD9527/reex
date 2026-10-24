package kotlinx.coroutines.internal;

import x1.k1;

/* loaded from: classes.dex */
public class v<T> extends x1.a<T> implements kotlin.coroutines.jvm.internal.e {

    /* renamed from: g, reason: collision with root package name */
    public final j1.d<T> f3706g;

    @Override // x1.r1
    protected final boolean T() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        j1.d<T> dVar = this.f3706g;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // x1.a
    protected void s0(Object obj) {
        j1.d<T> dVar = this.f3706g;
        dVar.resumeWith(x1.d0.a(obj, dVar));
    }

    @Override // x1.r1
    protected void w(Object obj) {
        j1.d b3;
        b3 = k1.c.b(this.f3706g);
        g.c(b3, x1.d0.a(obj, this.f3706g), null, 2, null);
    }

    public final k1 w0() {
        x1.r N = N();
        if (N == null) {
            return null;
        }
        return N.getParent();
    }
}
