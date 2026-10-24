package x1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x1.k1;

/* loaded from: classes.dex */
public class m<T> extends p0<T> implements k<T>, kotlin.coroutines.jvm.internal.e {

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4423k = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decision");

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4424l = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: h, reason: collision with root package name */
    private final j1.d<T> f4425h;

    /* renamed from: i, reason: collision with root package name */
    private final j1.g f4426i;

    /* renamed from: j, reason: collision with root package name */
    private t0 f4427j;

    /* JADX WARN: Multi-variable type inference failed */
    public m(j1.d<? super T> dVar, int i2) {
        super(i2);
        this.f4425h = dVar;
        this.f4426i = dVar.getContext();
        this._decision = 0;
        this._state = d.f4397e;
    }

    private final boolean A() {
        return q0.c(this.f4434g) && ((kotlinx.coroutines.internal.f) this.f4425h).l();
    }

    private final i B(q1.l<? super Throwable, g1.q> lVar) {
        return lVar instanceof i ? (i) lVar : new h1(lVar);
    }

    private final void C(q1.l<? super Throwable, g1.q> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    private final void F() {
        j1.d<T> dVar = this.f4425h;
        kotlinx.coroutines.internal.f fVar = dVar instanceof kotlinx.coroutines.internal.f ? (kotlinx.coroutines.internal.f) dVar : null;
        Throwable s2 = fVar != null ? fVar.s(this) : null;
        if (s2 == null) {
            return;
        }
        s();
        m(s2);
    }

    private final void H(Object obj, int i2, q1.l<? super Throwable, g1.q> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof x1)) {
                if (obj2 instanceof p) {
                    p pVar = (p) obj2;
                    if (pVar.c()) {
                        if (lVar == null) {
                            return;
                        }
                        l(lVar, pVar.f4481a);
                        return;
                    }
                }
                h(obj);
                throw new g1.d();
            }
        } while (!l.a(f4424l, this, obj2, J((x1) obj2, obj, i2, lVar, null)));
        t();
        u(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void I(m mVar, Object obj, int i2, q1.l lVar, int i3, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        mVar.H(obj, i2, lVar);
    }

    private final Object J(x1 x1Var, Object obj, int i2, q1.l<? super Throwable, g1.q> lVar, Object obj2) {
        if (obj instanceof z) {
            return obj;
        }
        if (!q0.b(i2) && obj2 == null) {
            return obj;
        }
        if (lVar != null || (((x1Var instanceof i) && !(x1Var instanceof e)) || obj2 != null)) {
            return new y(obj, x1Var instanceof i ? (i) x1Var : null, lVar, obj2, null, 16, null);
        }
        return obj;
    }

    private final boolean K() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f4423k.compareAndSet(this, 0, 2));
        return true;
    }

    private final kotlinx.coroutines.internal.x L(Object obj, Object obj2, q1.l<? super Throwable, g1.q> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (!(obj3 instanceof x1)) {
                if ((obj3 instanceof y) && obj2 != null && ((y) obj3).f4478d == obj2) {
                    return n.f4428a;
                }
                return null;
            }
        } while (!l.a(f4424l, this, obj3, J((x1) obj3, obj, this.f4434g, lVar, obj2)));
        t();
        return n.f4428a;
    }

    private final boolean M() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f4423k.compareAndSet(this, 0, 1));
        return true;
    }

    private final Void h(Object obj) {
        throw new IllegalStateException(kotlin.jvm.internal.k.j("Already resumed, but proposed with update ", obj).toString());
    }

    private final void j(q1.l<? super Throwable, g1.q> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            h0.a(getContext(), new c0(kotlin.jvm.internal.k.j("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    private final boolean n(Throwable th) {
        if (A()) {
            return ((kotlinx.coroutines.internal.f) this.f4425h).m(th);
        }
        return false;
    }

    private final void t() {
        if (A()) {
            return;
        }
        s();
    }

    private final void u(int i2) {
        if (K()) {
            return;
        }
        q0.a(this, i2);
    }

    private final String y() {
        Object x2 = x();
        return x2 instanceof x1 ? "Active" : x2 instanceof p ? "Cancelled" : "Completed";
    }

    private final t0 z() {
        k1 k1Var = (k1) getContext().get(k1.f4420d);
        if (k1Var == null) {
            return null;
        }
        t0 d3 = k1.a.d(k1Var, true, false, new q(this), 2, null);
        this.f4427j = d3;
        return d3;
    }

    protected String D() {
        return "CancellableContinuation";
    }

    public final void E(Throwable th) {
        if (n(th)) {
            return;
        }
        m(th);
        t();
    }

    public final boolean G() {
        Object obj = this._state;
        if ((obj instanceof y) && ((y) obj).f4478d != null) {
            s();
            return false;
        }
        this._decision = 0;
        this._state = d.f4397e;
        return true;
    }

    @Override // x1.k
    public Object a(T t2, Object obj) {
        return L(t2, obj, null);
    }

    @Override // x1.p0
    public void b(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof x1) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof z) {
                return;
            }
            if (obj2 instanceof y) {
                y yVar = (y) obj2;
                if (!(!yVar.c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (l.a(f4424l, this, obj2, y.b(yVar, null, null, null, null, th, 15, null))) {
                    yVar.d(this, th);
                    return;
                }
            } else if (l.a(f4424l, this, obj2, new y(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // x1.p0
    public final j1.d<T> c() {
        return this.f4425h;
    }

    @Override // x1.p0
    public Throwable d(Object obj) {
        Throwable d3 = super.d(obj);
        if (d3 == null) {
            return null;
        }
        c();
        return d3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x1.p0
    public <T> T e(Object obj) {
        return obj instanceof y ? (T) ((y) obj).f4475a : obj;
    }

    @Override // x1.p0
    public Object g() {
        return x();
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        j1.d<T> dVar = this.f4425h;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // j1.d
    public j1.g getContext() {
        return this.f4426i;
    }

    @Override // x1.k
    public void i(q1.l<? super Throwable, g1.q> lVar) {
        i B = B(lVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof d) {
                if (l.a(f4424l, this, obj, B)) {
                    return;
                }
            } else if (obj instanceof i) {
                C(lVar, obj);
            } else {
                boolean z2 = obj instanceof z;
                if (z2) {
                    z zVar = (z) obj;
                    if (!zVar.b()) {
                        C(lVar, obj);
                    }
                    if (obj instanceof p) {
                        if (!z2) {
                            zVar = null;
                        }
                        j(lVar, zVar != null ? zVar.f4481a : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof y) {
                    y yVar = (y) obj;
                    if (yVar.f4476b != null) {
                        C(lVar, obj);
                    }
                    if (B instanceof e) {
                        return;
                    }
                    if (yVar.c()) {
                        j(lVar, yVar.f4479e);
                        return;
                    } else {
                        if (l.a(f4424l, this, obj, y.b(yVar, null, B, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (B instanceof e) {
                        return;
                    }
                    if (l.a(f4424l, this, obj, new y(obj, B, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    public final void k(i iVar, Throwable th) {
        try {
            iVar.a(th);
        } catch (Throwable th2) {
            h0.a(getContext(), new c0(kotlin.jvm.internal.k.j("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public final void l(q1.l<? super Throwable, g1.q> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            h0.a(getContext(), new c0(kotlin.jvm.internal.k.j("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    public boolean m(Throwable th) {
        Object obj;
        boolean z2;
        do {
            obj = this._state;
            if (!(obj instanceof x1)) {
                return false;
            }
            z2 = obj instanceof i;
        } while (!l.a(f4424l, this, obj, new p(this, th, z2)));
        i iVar = z2 ? (i) obj : null;
        if (iVar != null) {
            k(iVar, th);
        }
        t();
        u(this.f4434g);
        return true;
    }

    @Override // x1.k
    public Object o(Throwable th) {
        return L(new z(th, false, 2, null), null, null);
    }

    @Override // x1.k
    public Object p(T t2, Object obj, q1.l<? super Throwable, g1.q> lVar) {
        return L(t2, obj, lVar);
    }

    @Override // x1.k
    public void q(Object obj) {
        u(this.f4434g);
    }

    @Override // x1.k
    public void r(T t2, q1.l<? super Throwable, g1.q> lVar) {
        H(t2, this.f4434g, lVar);
    }

    @Override // j1.d
    public void resumeWith(Object obj) {
        I(this, d0.c(obj, this), this.f4434g, null, 4, null);
    }

    public final void s() {
        t0 t0Var = this.f4427j;
        if (t0Var == null) {
            return;
        }
        t0Var.a();
        this.f4427j = w1.f4474e;
    }

    public String toString() {
        return D() + '(' + m0.c(this.f4425h) + "){" + y() + "}@" + m0.b(this);
    }

    public Throwable v(k1 k1Var) {
        return k1Var.j();
    }

    public final Object w() {
        k1 k1Var;
        Object c3;
        boolean A = A();
        if (M()) {
            if (this.f4427j == null) {
                z();
            }
            if (A) {
                F();
            }
            c3 = k1.d.c();
            return c3;
        }
        if (A) {
            F();
        }
        Object x2 = x();
        if (x2 instanceof z) {
            throw ((z) x2).f4481a;
        }
        if (!q0.b(this.f4434g) || (k1Var = (k1) getContext().get(k1.f4420d)) == null || k1Var.b()) {
            return e(x2);
        }
        CancellationException j2 = k1Var.j();
        b(x2, j2);
        throw j2;
    }

    public final Object x() {
        return this._state;
    }
}
