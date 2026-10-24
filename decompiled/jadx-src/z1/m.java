package z1;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.f0;
import kotlinx.coroutines.internal.x;

/* loaded from: classes.dex */
public class m<E> extends a<E> {

    /* renamed from: e, reason: collision with root package name */
    private final ReentrantLock f4808e;

    /* renamed from: f, reason: collision with root package name */
    private Object f4809f;

    public m(q1.l<? super E, g1.q> lVar) {
        super(lVar);
        this.f4808e = new ReentrantLock();
        this.f4809f = b.f4781a;
    }

    private final f0 x(Object obj) {
        q1.l<E, g1.q> lVar;
        Object obj2 = this.f4809f;
        f0 f0Var = null;
        if (obj2 != b.f4781a && (lVar = this.f4788b) != null) {
            f0Var = kotlinx.coroutines.internal.s.d(lVar, obj2, null, 2, null);
        }
        this.f4809f = obj;
        return f0Var;
    }

    @Override // z1.c
    protected String c() {
        return "(value=" + this.f4809f + ')';
    }

    @Override // z1.c
    protected Object i(E e3) {
        q<E> l2;
        ReentrantLock reentrantLock = this.f4808e;
        reentrantLock.lock();
        try {
            j<?> d3 = d();
            if (d3 != null) {
                return d3;
            }
            if (this.f4809f == b.f4781a) {
                do {
                    l2 = l();
                    if (l2 != null) {
                        if (l2 instanceof j) {
                            return l2;
                        }
                    }
                } while (l2.g(e3, null) == null);
                g1.q qVar = g1.q.f2865a;
                reentrantLock.unlock();
                l2.c(e3);
                return l2.e();
            }
            f0 x2 = x(e3);
            if (x2 == null) {
                return b.f4782b;
            }
            throw x2;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // z1.a
    protected boolean q(o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f4808e;
        reentrantLock.lock();
        try {
            return super.q(oVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // z1.a
    protected final boolean r() {
        return false;
    }

    @Override // z1.a
    protected final boolean s() {
        return this.f4809f == b.f4781a;
    }

    @Override // z1.a
    protected Object v() {
        ReentrantLock reentrantLock = this.f4808e;
        reentrantLock.lock();
        try {
            Object obj = this.f4809f;
            x xVar = b.f4781a;
            if (obj != xVar) {
                this.f4809f = xVar;
                g1.q qVar = g1.q.f2865a;
                return obj;
            }
            Object d3 = d();
            if (d3 == null) {
                d3 = b.f4784d;
            }
            return d3;
        } finally {
            reentrantLock.unlock();
        }
    }
}
