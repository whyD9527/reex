package kotlinx.coroutines.internal;

import x1.m0;

/* loaded from: classes.dex */
public abstract class t {
    public abstract c<?> a();

    public final boolean b(t tVar) {
        c<?> a3;
        c<?> a4 = a();
        return (a4 == null || (a3 = tVar.a()) == null || a4.f() >= a3.f()) ? false : true;
    }

    public abstract Object c(Object obj);

    public String toString() {
        return m0.a(this) + '@' + m0.b(this);
    }
}
