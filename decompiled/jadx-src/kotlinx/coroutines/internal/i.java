package kotlinx.coroutines.internal;

import g1.k;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f3678a;

    static {
        Object a3;
        try {
            k.a aVar = g1.k.f2859e;
            a3 = g1.k.a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            k.a aVar2 = g1.k.f2859e;
            a3 = g1.k.a(g1.l.a(th));
        }
        f3678a = g1.k.d(a3);
    }

    public static final boolean a() {
        return f3678a;
    }
}
