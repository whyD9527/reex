package x1;

/* loaded from: classes.dex */
public enum k0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4419a;

        static {
            int[] iArr = new int[k0.values().length];
            iArr[k0.DEFAULT.ordinal()] = 1;
            iArr[k0.ATOMIC.ordinal()] = 2;
            iArr[k0.UNDISPATCHED.ordinal()] = 3;
            iArr[k0.LAZY.ordinal()] = 4;
            f4419a = iArr;
        }
    }

    public final <R, T> void b(q1.p<? super R, ? super j1.d<? super T>, ? extends Object> pVar, R r2, j1.d<? super T> dVar) {
        int i2 = a.f4419a[ordinal()];
        if (i2 == 1) {
            c2.a.e(pVar, r2, dVar, null, 4, null);
            return;
        }
        if (i2 == 2) {
            j1.f.a(pVar, r2, dVar);
        } else if (i2 == 3) {
            c2.b.a(pVar, r2, dVar);
        } else if (i2 != 4) {
            throw new g1.i();
        }
    }

    public final boolean c() {
        return this == LAZY;
    }
}
