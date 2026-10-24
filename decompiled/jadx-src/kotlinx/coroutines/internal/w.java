package kotlinx.coroutines.internal;

import g1.k;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3707a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f3708b;

    static {
        Object a3;
        Object a4;
        try {
            k.a aVar = g1.k.f2859e;
            a3 = g1.k.a(Class.forName("kotlin.coroutines.jvm.internal.a").getCanonicalName());
        } catch (Throwable th) {
            k.a aVar2 = g1.k.f2859e;
            a3 = g1.k.a(g1.l.a(th));
        }
        if (g1.k.b(a3) != null) {
            a3 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f3707a = (String) a3;
        try {
            a4 = g1.k.a(w.class.getCanonicalName());
        } catch (Throwable th2) {
            k.a aVar3 = g1.k.f2859e;
            a4 = g1.k.a(g1.l.a(th2));
        }
        if (g1.k.b(a4) != null) {
            a4 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f3708b = (String) a4;
    }

    public static final <E extends Throwable> E a(E e3) {
        return e3;
    }
}
