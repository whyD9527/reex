package z1;

import kotlinx.coroutines.internal.x;

/* loaded from: classes.dex */
public class n<E> extends a<E> {
    public n(q1.l<? super E, g1.q> lVar) {
        super(lVar);
    }

    @Override // z1.c
    protected Object i(E e3) {
        q<?> k2;
        do {
            Object i2 = super.i(e3);
            x xVar = b.f4782b;
            if (i2 == xVar) {
                return xVar;
            }
            if (i2 != b.f4783c) {
                if (i2 instanceof j) {
                    return i2;
                }
                throw new IllegalStateException(kotlin.jvm.internal.k.j("Invalid offerInternal result ", i2).toString());
            }
            k2 = k(e3);
            if (k2 == null) {
                return xVar;
            }
        } while (!(k2 instanceof j));
        return k2;
    }

    @Override // z1.a
    protected final boolean r() {
        return true;
    }

    @Override // z1.a
    protected final boolean s() {
        return true;
    }
}
