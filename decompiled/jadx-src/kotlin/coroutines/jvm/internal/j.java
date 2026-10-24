package kotlin.coroutines.jvm.internal;

/* loaded from: classes.dex */
public abstract class j extends a {
    public j(j1.d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == j1.h.f3610e)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // j1.d
    public j1.g getContext() {
        return j1.h.f3610e;
    }
}
