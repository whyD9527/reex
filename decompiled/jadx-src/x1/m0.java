package x1;

import g1.k;

/* loaded from: classes.dex */
public final class m0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(j1.d<?> dVar) {
        Object a3;
        if (dVar instanceof kotlinx.coroutines.internal.f) {
            return dVar.toString();
        }
        try {
            k.a aVar = g1.k.f2859e;
            a3 = g1.k.a(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            k.a aVar2 = g1.k.f2859e;
            a3 = g1.k.a(g1.l.a(th));
        }
        if (g1.k.b(a3) != null) {
            a3 = ((Object) dVar.getClass().getName()) + '@' + b(dVar);
        }
        return (String) a3;
    }
}
