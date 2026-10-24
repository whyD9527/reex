package x1;

/* loaded from: classes.dex */
public interface k<T> extends j1.d<T> {

    public static final class a {
        public static /* synthetic */ Object a(k kVar, Object obj, Object obj2, int i2, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
            }
            if ((i2 & 2) != 0) {
                obj2 = null;
            }
            return kVar.a(obj, obj2);
        }
    }

    Object a(T t2, Object obj);

    void i(q1.l<? super Throwable, g1.q> lVar);

    Object o(Throwable th);

    Object p(T t2, Object obj, q1.l<? super Throwable, g1.q> lVar);

    void q(Object obj);

    void r(T t2, q1.l<? super Throwable, g1.q> lVar);
}
