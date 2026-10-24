package x1;

/* loaded from: classes.dex */
public final class c2 extends f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final c2 f4396f = new c2();

    private c2() {
    }

    @Override // x1.f0
    public void i(j1.g gVar, Runnable runnable) {
        f2 f2Var = (f2) gVar.get(f2.f4406f);
        if (f2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        f2Var.f4407e = true;
    }

    @Override // x1.f0
    public boolean o(j1.g gVar) {
        return false;
    }

    @Override // x1.f0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
