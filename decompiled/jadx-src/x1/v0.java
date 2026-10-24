package x1;

/* loaded from: classes.dex */
public abstract class v0 extends f0 {

    /* renamed from: f, reason: collision with root package name */
    private long f4462f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4463g;

    /* renamed from: h, reason: collision with root package name */
    private kotlinx.coroutines.internal.a<p0<?>> f4464h;

    private final long q(boolean z2) {
        return z2 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void u(v0 v0Var, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        v0Var.t(z2);
    }

    public final void p(boolean z2) {
        long q2 = this.f4462f - q(z2);
        this.f4462f = q2;
        if (q2 <= 0 && this.f4463g) {
            shutdown();
        }
    }

    public final void r(p0<?> p0Var) {
        kotlinx.coroutines.internal.a<p0<?>> aVar = this.f4464h;
        if (aVar == null) {
            aVar = new kotlinx.coroutines.internal.a<>();
            this.f4464h = aVar;
        }
        aVar.a(p0Var);
    }

    protected long s() {
        kotlinx.coroutines.internal.a<p0<?>> aVar = this.f4464h;
        return (aVar == null || aVar.c()) ? Long.MAX_VALUE : 0L;
    }

    protected void shutdown() {
    }

    public final void t(boolean z2) {
        this.f4462f += q(z2);
        if (z2) {
            return;
        }
        this.f4463g = true;
    }

    public final boolean v() {
        return this.f4462f >= q(true);
    }

    public final boolean w() {
        kotlinx.coroutines.internal.a<p0<?>> aVar = this.f4464h;
        if (aVar == null) {
            return true;
        }
        return aVar.c();
    }

    public final boolean x() {
        p0<?> d3;
        kotlinx.coroutines.internal.a<p0<?>> aVar = this.f4464h;
        if (aVar == null || (d3 = aVar.d()) == null) {
            return false;
        }
        d3.run();
        return true;
    }
}
