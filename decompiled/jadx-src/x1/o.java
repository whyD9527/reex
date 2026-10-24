package x1;

/* loaded from: classes.dex */
public final class o {
    public static final <T> m<T> a(j1.d<? super T> dVar) {
        if (!(dVar instanceof kotlinx.coroutines.internal.f)) {
            return new m<>(dVar, 1);
        }
        m<T> j2 = ((kotlinx.coroutines.internal.f) dVar).j();
        if (j2 == null || !j2.G()) {
            j2 = null;
        }
        return j2 == null ? new m<>(dVar, 2) : j2;
    }
}
