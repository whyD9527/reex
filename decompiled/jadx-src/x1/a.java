package x1;

/* loaded from: classes.dex */
public abstract class a<T> extends r1 implements j1.d<T>, i0 {

    /* renamed from: f, reason: collision with root package name */
    private final j1.g f4388f;

    public a(j1.g gVar, boolean z2, boolean z3) {
        super(z3);
        if (z2) {
            R((k1) gVar.get(k1.f4420d));
        }
        this.f4388f = gVar.plus(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x1.r1
    public String B() {
        return kotlin.jvm.internal.k.j(m0.a(this), " was cancelled");
    }

    @Override // x1.r1
    public final void Q(Throwable th) {
        h0.a(this.f4388f, th);
    }

    @Override // x1.r1
    public String X() {
        String b3 = e0.b(this.f4388f);
        if (b3 == null) {
            return super.X();
        }
        return '\"' + b3 + "\":" + super.X();
    }

    @Override // x1.r1, x1.k1
    public boolean b() {
        return super.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x1.r1
    protected final void c0(Object obj) {
        if (!(obj instanceof z)) {
            u0(obj);
        } else {
            z zVar = (z) obj;
            t0(zVar.f4481a, zVar.a());
        }
    }

    @Override // x1.i0
    public j1.g e() {
        return this.f4388f;
    }

    @Override // j1.d
    public final j1.g getContext() {
        return this.f4388f;
    }

    @Override // j1.d
    public final void resumeWith(Object obj) {
        Object V = V(d0.d(obj, null, 1, null));
        if (V == s1.f4453b) {
            return;
        }
        s0(V);
    }

    protected void s0(Object obj) {
        w(obj);
    }

    protected void t0(Throwable th, boolean z2) {
    }

    protected void u0(T t2) {
    }

    public final <R> void v0(k0 k0Var, R r2, q1.p<? super R, ? super j1.d<? super T>, ? extends Object> pVar) {
        k0Var.b(pVar, r2, this);
    }
}
