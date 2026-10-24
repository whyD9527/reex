package x1;

/* loaded from: classes.dex */
public abstract class q1 extends b0 implements t0, f1 {

    /* renamed from: h, reason: collision with root package name */
    public r1 f4436h;

    public final void A(r1 r1Var) {
        this.f4436h = r1Var;
    }

    @Override // x1.t0
    public void a() {
        z().g0(this);
    }

    @Override // x1.f1
    public boolean b() {
        return true;
    }

    @Override // x1.f1
    public v1 h() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.m
    public String toString() {
        return m0.a(this) + '@' + m0.b(this) + "[job@" + m0.b(z()) + ']';
    }

    public final r1 z() {
        r1 r1Var = this.f4436h;
        if (r1Var != null) {
            return r1Var;
        }
        kotlin.jvm.internal.k.o("job");
        return null;
    }
}
