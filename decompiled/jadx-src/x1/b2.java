package x1;

/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public static final b2 f4393a = new b2();

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<v0> f4394b = new ThreadLocal<>();

    private b2() {
    }

    public final v0 a() {
        ThreadLocal<v0> threadLocal = f4394b;
        v0 v0Var = threadLocal.get();
        if (v0Var != null) {
            return v0Var;
        }
        v0 a3 = y0.a();
        threadLocal.set(a3);
        return a3;
    }

    public final void b() {
        f4394b.set(null);
    }

    public final void c(v0 v0Var) {
        f4394b.set(v0Var);
    }
}
