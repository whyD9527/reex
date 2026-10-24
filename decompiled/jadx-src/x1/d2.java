package x1;

/* loaded from: classes.dex */
public final class d2<T> extends kotlinx.coroutines.internal.v<T> {

    /* renamed from: h, reason: collision with root package name */
    private j1.g f4398h;

    /* renamed from: i, reason: collision with root package name */
    private Object f4399i;

    @Override // kotlinx.coroutines.internal.v, x1.a
    protected void s0(Object obj) {
        j1.g gVar = this.f4398h;
        if (gVar != null) {
            kotlinx.coroutines.internal.b0.a(gVar, this.f4399i);
            this.f4398h = null;
            this.f4399i = null;
        }
        Object a3 = d0.a(obj, this.f3706g);
        j1.d<T> dVar = this.f3706g;
        j1.g context = dVar.getContext();
        Object c3 = kotlinx.coroutines.internal.b0.c(context, null);
        d2<?> e3 = c3 != kotlinx.coroutines.internal.b0.f3655a ? e0.e(dVar, context, c3) : null;
        try {
            this.f3706g.resumeWith(a3);
            g1.q qVar = g1.q.f2865a;
        } finally {
            if (e3 == null || e3.x0()) {
                kotlinx.coroutines.internal.b0.a(context, c3);
            }
        }
    }

    public final boolean x0() {
        if (this.f4398h == null) {
            return false;
        }
        this.f4398h = null;
        this.f4399i = null;
        return true;
    }

    public final void y0(j1.g gVar, Object obj) {
        this.f4398h = gVar;
        this.f4399i = obj;
    }
}
