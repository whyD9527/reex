package x1;

import g1.k;

/* loaded from: classes.dex */
public final class d0 {
    public static final <T> Object a(Object obj, j1.d<? super T> dVar) {
        if (obj instanceof z) {
            k.a aVar = g1.k.f2859e;
            obj = g1.l.a(((z) obj).f4481a);
        }
        return g1.k.a(obj);
    }

    public static final <T> Object b(Object obj, q1.l<? super Throwable, g1.q> lVar) {
        Throwable b3 = g1.k.b(obj);
        return b3 == null ? lVar != null ? new a0(obj, lVar) : obj : new z(b3, false, 2, null);
    }

    public static final <T> Object c(Object obj, k<?> kVar) {
        Throwable b3 = g1.k.b(obj);
        return b3 == null ? obj : new z(b3, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, q1.l lVar, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}
