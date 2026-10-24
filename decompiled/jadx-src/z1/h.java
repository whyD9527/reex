package z1;

/* loaded from: classes.dex */
public final class h {
    public static final <E> f<E> a(int i2, e eVar, q1.l<? super E, g1.q> lVar) {
        if (i2 == -2) {
            return new d(eVar == e.SUSPEND ? f.f4801a.a() : 1, eVar, lVar);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? (i2 == 1 && eVar == e.DROP_OLDEST) ? new m(lVar) : new d(i2, eVar, lVar) : new n(lVar) : eVar == e.SUSPEND ? new r(lVar) : new d(1, eVar, lVar);
        }
        if ((eVar != e.SUSPEND ? 0 : 1) != 0) {
            return new m(lVar);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
    }

    public static /* synthetic */ f b(int i2, e eVar, q1.l lVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            eVar = e.SUSPEND;
        }
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        return a(i2, eVar, lVar);
    }
}
