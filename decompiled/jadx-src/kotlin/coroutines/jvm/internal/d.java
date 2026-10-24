package kotlin.coroutines.jvm.internal;

import j1.g;

/* loaded from: classes.dex */
public abstract class d extends a {
    private final j1.g _context;
    private transient j1.d<Object> intercepted;

    public d(j1.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }

    public d(j1.d<Object> dVar, j1.g gVar) {
        super(dVar);
        this._context = gVar;
    }

    @Override // j1.d
    public j1.g getContext() {
        j1.g gVar = this._context;
        kotlin.jvm.internal.k.b(gVar);
        return gVar;
    }

    public final j1.d<Object> intercepted() {
        j1.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            j1.e eVar = (j1.e) getContext().get(j1.e.f3607b);
            if (eVar == null || (dVar = eVar.l(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        j1.d<?> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            g.b bVar = getContext().get(j1.e.f3607b);
            kotlin.jvm.internal.k.b(bVar);
            ((j1.e) bVar).d(dVar);
        }
        this.intercepted = c.f3626e;
    }
}
