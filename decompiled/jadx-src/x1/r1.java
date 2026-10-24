package x1;

import j1.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.m;
import x1.k1;

/* loaded from: classes.dex */
public class r1 implements k1, t, y1 {

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4438e = AtomicReferenceFieldUpdater.newUpdater(r1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    private static final class a extends q1 {

        /* renamed from: i, reason: collision with root package name */
        private final r1 f4439i;

        /* renamed from: j, reason: collision with root package name */
        private final b f4440j;

        /* renamed from: k, reason: collision with root package name */
        private final s f4441k;

        /* renamed from: l, reason: collision with root package name */
        private final Object f4442l;

        public a(r1 r1Var, b bVar, s sVar, Object obj) {
            this.f4439i = r1Var;
            this.f4440j = bVar;
            this.f4441k = sVar;
            this.f4442l = obj;
        }

        @Override // q1.l
        public /* bridge */ /* synthetic */ g1.q invoke(Throwable th) {
            y(th);
            return g1.q.f2865a;
        }

        @Override // x1.b0
        public void y(Throwable th) {
            this.f4439i.E(this.f4440j, this.f4441k, this.f4442l);
        }
    }

    private static final class b implements f1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: e, reason: collision with root package name */
        private final v1 f4443e;

        public b(v1 v1Var, boolean z2, Throwable th) {
            this.f4443e = v1Var;
            this._isCompleting = z2 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object d() {
            return this._exceptionsHolder;
        }

        private final void l(Object obj) {
            this._exceptionsHolder = obj;
        }

        public final void a(Throwable th) {
            Throwable e3 = e();
            if (e3 == null) {
                m(th);
                return;
            }
            if (th == e3) {
                return;
            }
            Object d3 = d();
            if (d3 == null) {
                l(th);
                return;
            }
            if (!(d3 instanceof Throwable)) {
                if (!(d3 instanceof ArrayList)) {
                    throw new IllegalStateException(kotlin.jvm.internal.k.j("State is ", d3).toString());
                }
                ((ArrayList) d3).add(th);
            } else {
                if (th == d3) {
                    return;
                }
                ArrayList<Throwable> c3 = c();
                c3.add(d3);
                c3.add(th);
                g1.q qVar = g1.q.f2865a;
                l(c3);
            }
        }

        @Override // x1.f1
        public boolean b() {
            return e() == null;
        }

        public final Throwable e() {
            return (Throwable) this._rootCause;
        }

        public final boolean f() {
            return e() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean g() {
            return this._isCompleting;
        }

        @Override // x1.f1
        public v1 h() {
            return this.f4443e;
        }

        public final boolean i() {
            kotlinx.coroutines.internal.x xVar;
            Object d3 = d();
            xVar = s1.f4456e;
            return d3 == xVar;
        }

        public final List<Throwable> j(Throwable th) {
            ArrayList<Throwable> arrayList;
            kotlinx.coroutines.internal.x xVar;
            Object d3 = d();
            if (d3 == null) {
                arrayList = c();
            } else if (d3 instanceof Throwable) {
                ArrayList<Throwable> c3 = c();
                c3.add(d3);
                arrayList = c3;
            } else {
                if (!(d3 instanceof ArrayList)) {
                    throw new IllegalStateException(kotlin.jvm.internal.k.j("State is ", d3).toString());
                }
                arrayList = (ArrayList) d3;
            }
            Throwable e3 = e();
            if (e3 != null) {
                arrayList.add(0, e3);
            }
            if (th != null && !kotlin.jvm.internal.k.a(th, e3)) {
                arrayList.add(th);
            }
            xVar = s1.f4456e;
            l(xVar);
            return arrayList;
        }

        public final void k(boolean z2) {
            this._isCompleting = z2 ? 1 : 0;
        }

        public final void m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + h() + ']';
        }
    }

    public static final class c extends m.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.internal.m f4444d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ r1 f4445e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f4446f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlinx.coroutines.internal.m mVar, r1 r1Var, Object obj) {
            super(mVar);
            this.f4444d = mVar;
            this.f4445e = r1Var;
            this.f4446f = obj;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object g(kotlinx.coroutines.internal.m mVar) {
            if (this.f4445e.O() == this.f4446f) {
                return null;
            }
            return kotlinx.coroutines.internal.l.a();
        }
    }

    public r1(boolean z2) {
        this._state = z2 ? s1.f4458g : s1.f4457f;
        this._parentHandle = null;
    }

    private final boolean A(Throwable th) {
        if (T()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        r N = N();
        return (N == null || N == w1.f4474e) ? z2 : N.f(th) || z2;
    }

    private final void D(f1 f1Var, Object obj) {
        r N = N();
        if (N != null) {
            N.a();
            h0(w1.f4474e);
        }
        z zVar = obj instanceof z ? (z) obj : null;
        Throwable th = zVar != null ? zVar.f4481a : null;
        if (!(f1Var instanceof q1)) {
            v1 h2 = f1Var.h();
            if (h2 == null) {
                return;
            }
            a0(h2, th);
            return;
        }
        try {
            ((q1) f1Var).y(th);
        } catch (Throwable th2) {
            Q(new c0("Exception in completion handler " + f1Var + " for " + this, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(b bVar, s sVar, Object obj) {
        s Y = Y(sVar);
        if (Y == null || !r0(bVar, Y, obj)) {
            w(G(bVar, obj));
        }
    }

    private final Throwable F(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new l1(B(), null, this) : th;
        }
        if (obj != null) {
            return ((y1) obj).h();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    private final Object G(b bVar, Object obj) {
        boolean f2;
        Throwable J;
        z zVar = obj instanceof z ? (z) obj : null;
        Throwable th = zVar == null ? null : zVar.f4481a;
        synchronized (bVar) {
            f2 = bVar.f();
            List<Throwable> j2 = bVar.j(th);
            J = J(bVar, j2);
            if (J != null) {
                v(J, j2);
            }
        }
        if (J != null && J != th) {
            obj = new z(J, false, 2, null);
        }
        if (J != null) {
            if (A(J) || P(J)) {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
                ((z) obj).b();
            }
        }
        if (!f2) {
            b0(J);
        }
        c0(obj);
        l.a(f4438e, this, bVar, s1.g(obj));
        D(bVar, obj);
        return obj;
    }

    private final s H(f1 f1Var) {
        s sVar = f1Var instanceof s ? (s) f1Var : null;
        if (sVar != null) {
            return sVar;
        }
        v1 h2 = f1Var.h();
        if (h2 == null) {
            return null;
        }
        return Y(h2);
    }

    private final Throwable I(Object obj) {
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar == null) {
            return null;
        }
        return zVar.f4481a;
    }

    private final Throwable J(b bVar, List<? extends Throwable> list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (bVar.f()) {
                return new l1(B(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : list.get(0);
    }

    private final v1 M(f1 f1Var) {
        v1 h2 = f1Var.h();
        if (h2 != null) {
            return h2;
        }
        if (f1Var instanceof u0) {
            return new v1();
        }
        if (!(f1Var instanceof q1)) {
            throw new IllegalStateException(kotlin.jvm.internal.k.j("State should have list: ", f1Var).toString());
        }
        f0((q1) f1Var);
        return null;
    }

    private final Object U(Object obj) {
        kotlinx.coroutines.internal.x xVar;
        kotlinx.coroutines.internal.x xVar2;
        kotlinx.coroutines.internal.x xVar3;
        kotlinx.coroutines.internal.x xVar4;
        kotlinx.coroutines.internal.x xVar5;
        kotlinx.coroutines.internal.x xVar6;
        Throwable th = null;
        while (true) {
            Object O = O();
            if (O instanceof b) {
                synchronized (O) {
                    if (((b) O).i()) {
                        xVar2 = s1.f4455d;
                        return xVar2;
                    }
                    boolean f2 = ((b) O).f();
                    if (obj != null || !f2) {
                        if (th == null) {
                            th = F(obj);
                        }
                        ((b) O).a(th);
                    }
                    Throwable e3 = f2 ^ true ? ((b) O).e() : null;
                    if (e3 != null) {
                        Z(((b) O).h(), e3);
                    }
                    xVar = s1.f4452a;
                    return xVar;
                }
            }
            if (!(O instanceof f1)) {
                xVar3 = s1.f4455d;
                return xVar3;
            }
            if (th == null) {
                th = F(obj);
            }
            f1 f1Var = (f1) O;
            if (!f1Var.b()) {
                Object p02 = p0(O, new z(th, false, 2, null));
                xVar5 = s1.f4452a;
                if (p02 == xVar5) {
                    throw new IllegalStateException(kotlin.jvm.internal.k.j("Cannot happen in ", O).toString());
                }
                xVar6 = s1.f4454c;
                if (p02 != xVar6) {
                    return p02;
                }
            } else if (o0(f1Var, th)) {
                xVar4 = s1.f4452a;
                return xVar4;
            }
        }
    }

    private final q1 W(q1.l<? super Throwable, g1.q> lVar, boolean z2) {
        q1 q1Var;
        if (z2) {
            q1Var = lVar instanceof m1 ? (m1) lVar : null;
            if (q1Var == null) {
                q1Var = new i1(lVar);
            }
        } else {
            q1 q1Var2 = lVar instanceof q1 ? (q1) lVar : null;
            q1Var = q1Var2 != null ? q1Var2 : null;
            if (q1Var == null) {
                q1Var = new j1(lVar);
            }
        }
        q1Var.A(this);
        return q1Var;
    }

    private final s Y(kotlinx.coroutines.internal.m mVar) {
        while (mVar.t()) {
            mVar = mVar.q();
        }
        while (true) {
            mVar = mVar.p();
            if (!mVar.t()) {
                if (mVar instanceof s) {
                    return (s) mVar;
                }
                if (mVar instanceof v1) {
                    return null;
                }
            }
        }
    }

    private final void Z(v1 v1Var, Throwable th) {
        c0 c0Var;
        b0(th);
        c0 c0Var2 = null;
        for (kotlinx.coroutines.internal.m mVar = (kotlinx.coroutines.internal.m) v1Var.o(); !kotlin.jvm.internal.k.a(mVar, v1Var); mVar = mVar.p()) {
            if (mVar instanceof m1) {
                q1 q1Var = (q1) mVar;
                try {
                    q1Var.y(th);
                } catch (Throwable th2) {
                    if (c0Var2 == null) {
                        c0Var = null;
                    } else {
                        g1.b.a(c0Var2, th2);
                        c0Var = c0Var2;
                    }
                    if (c0Var == null) {
                        c0Var2 = new c0("Exception in completion handler " + q1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (c0Var2 != null) {
            Q(c0Var2);
        }
        A(th);
    }

    private final void a0(v1 v1Var, Throwable th) {
        c0 c0Var;
        c0 c0Var2 = null;
        for (kotlinx.coroutines.internal.m mVar = (kotlinx.coroutines.internal.m) v1Var.o(); !kotlin.jvm.internal.k.a(mVar, v1Var); mVar = mVar.p()) {
            if (mVar instanceof q1) {
                q1 q1Var = (q1) mVar;
                try {
                    q1Var.y(th);
                } catch (Throwable th2) {
                    if (c0Var2 == null) {
                        c0Var = null;
                    } else {
                        g1.b.a(c0Var2, th2);
                        c0Var = c0Var2;
                    }
                    if (c0Var == null) {
                        c0Var2 = new c0("Exception in completion handler " + q1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (c0Var2 == null) {
            return;
        }
        Q(c0Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [x1.e1] */
    private final void e0(u0 u0Var) {
        v1 v1Var = new v1();
        if (!u0Var.b()) {
            v1Var = new e1(v1Var);
        }
        l.a(f4438e, this, u0Var, v1Var);
    }

    private final void f0(q1 q1Var) {
        q1Var.k(new v1());
        l.a(f4438e, this, q1Var, q1Var.p());
    }

    private final int i0(Object obj) {
        u0 u0Var;
        if (!(obj instanceof u0)) {
            if (!(obj instanceof e1)) {
                return 0;
            }
            if (!l.a(f4438e, this, obj, ((e1) obj).h())) {
                return -1;
            }
            d0();
            return 1;
        }
        if (((u0) obj).b()) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4438e;
        u0Var = s1.f4458g;
        if (!l.a(atomicReferenceFieldUpdater, this, obj, u0Var)) {
            return -1;
        }
        d0();
        return 1;
    }

    private final String j0(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof f1 ? ((f1) obj).b() ? "Active" : "New" : obj instanceof z ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.f() ? "Cancelling" : bVar.g() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException l0(r1 r1Var, Throwable th, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i2 & 1) != 0) {
            str = null;
        }
        return r1Var.k0(th, str);
    }

    private final boolean n0(f1 f1Var, Object obj) {
        if (!l.a(f4438e, this, f1Var, s1.g(obj))) {
            return false;
        }
        b0(null);
        c0(obj);
        D(f1Var, obj);
        return true;
    }

    private final boolean o0(f1 f1Var, Throwable th) {
        v1 M = M(f1Var);
        if (M == null) {
            return false;
        }
        if (!l.a(f4438e, this, f1Var, new b(M, false, th))) {
            return false;
        }
        Z(M, th);
        return true;
    }

    private final Object p0(Object obj, Object obj2) {
        kotlinx.coroutines.internal.x xVar;
        kotlinx.coroutines.internal.x xVar2;
        if (!(obj instanceof f1)) {
            xVar2 = s1.f4452a;
            return xVar2;
        }
        if ((!(obj instanceof u0) && !(obj instanceof q1)) || (obj instanceof s) || (obj2 instanceof z)) {
            return q0((f1) obj, obj2);
        }
        if (n0((f1) obj, obj2)) {
            return obj2;
        }
        xVar = s1.f4454c;
        return xVar;
    }

    private final Object q0(f1 f1Var, Object obj) {
        kotlinx.coroutines.internal.x xVar;
        kotlinx.coroutines.internal.x xVar2;
        kotlinx.coroutines.internal.x xVar3;
        v1 M = M(f1Var);
        if (M == null) {
            xVar3 = s1.f4454c;
            return xVar3;
        }
        b bVar = f1Var instanceof b ? (b) f1Var : null;
        if (bVar == null) {
            bVar = new b(M, false, null);
        }
        synchronized (bVar) {
            if (bVar.g()) {
                xVar2 = s1.f4452a;
                return xVar2;
            }
            bVar.k(true);
            if (bVar != f1Var && !l.a(f4438e, this, f1Var, bVar)) {
                xVar = s1.f4454c;
                return xVar;
            }
            boolean f2 = bVar.f();
            z zVar = obj instanceof z ? (z) obj : null;
            if (zVar != null) {
                bVar.a(zVar.f4481a);
            }
            Throwable e3 = true ^ f2 ? bVar.e() : null;
            g1.q qVar = g1.q.f2865a;
            if (e3 != null) {
                Z(M, e3);
            }
            s H = H(f1Var);
            return (H == null || !r0(bVar, H, obj)) ? G(bVar, obj) : s1.f4453b;
        }
    }

    private final boolean r0(b bVar, s sVar, Object obj) {
        while (k1.a.d(sVar.f4447i, false, false, new a(this, bVar, sVar, obj), 1, null) == w1.f4474e) {
            sVar = Y(sVar);
            if (sVar == null) {
                return false;
            }
        }
        return true;
    }

    private final boolean u(Object obj, v1 v1Var, q1 q1Var) {
        int x2;
        c cVar = new c(q1Var, this, obj);
        do {
            x2 = v1Var.q().x(q1Var, v1Var, cVar);
            if (x2 == 1) {
                return true;
            }
        } while (x2 != 2);
        return false;
    }

    private final void v(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                g1.b.a(th, th2);
            }
        }
    }

    private final Object z(Object obj) {
        kotlinx.coroutines.internal.x xVar;
        Object p02;
        kotlinx.coroutines.internal.x xVar2;
        do {
            Object O = O();
            if (!(O instanceof f1) || ((O instanceof b) && ((b) O).g())) {
                xVar = s1.f4452a;
                return xVar;
            }
            p02 = p0(O, new z(F(obj), false, 2, null));
            xVar2 = s1.f4454c;
        } while (p02 == xVar2);
        return p02;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String B() {
        return "Job was cancelled";
    }

    public boolean C(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return x(th) && K();
    }

    public boolean K() {
        return true;
    }

    public boolean L() {
        return false;
    }

    public final r N() {
        return (r) this._parentHandle;
    }

    public final Object O() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.t)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.t) obj).c(this);
        }
    }

    protected boolean P(Throwable th) {
        return false;
    }

    public void Q(Throwable th) {
        throw th;
    }

    protected final void R(k1 k1Var) {
        if (k1Var == null) {
            h0(w1.f4474e);
            return;
        }
        k1Var.start();
        r g2 = k1Var.g(this);
        h0(g2);
        if (S()) {
            g2.a();
            h0(w1.f4474e);
        }
    }

    public final boolean S() {
        return !(O() instanceof f1);
    }

    protected boolean T() {
        return false;
    }

    public final Object V(Object obj) {
        Object p02;
        kotlinx.coroutines.internal.x xVar;
        kotlinx.coroutines.internal.x xVar2;
        do {
            p02 = p0(O(), obj);
            xVar = s1.f4452a;
            if (p02 == xVar) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, I(obj));
            }
            xVar2 = s1.f4454c;
        } while (p02 == xVar2);
        return p02;
    }

    public String X() {
        return m0.a(this);
    }

    @Override // x1.k1
    public boolean b() {
        Object O = O();
        return (O instanceof f1) && ((f1) O).b();
    }

    protected void b0(Throwable th) {
    }

    protected void c0(Object obj) {
    }

    protected void d0() {
    }

    @Override // x1.t
    public final void f(y1 y1Var) {
        x(y1Var);
    }

    @Override // j1.g
    public <R> R fold(R r2, q1.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) k1.a.b(this, r2, pVar);
    }

    @Override // x1.k1
    public final r g(t tVar) {
        return (r) k1.a.d(this, true, false, new s(tVar), 2, null);
    }

    public final void g0(q1 q1Var) {
        Object O;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        u0 u0Var;
        do {
            O = O();
            if (!(O instanceof q1)) {
                if (!(O instanceof f1) || ((f1) O).h() == null) {
                    return;
                }
                q1Var.u();
                return;
            }
            if (O != q1Var) {
                return;
            }
            atomicReferenceFieldUpdater = f4438e;
            u0Var = s1.f4458g;
        } while (!l.a(atomicReferenceFieldUpdater, this, O, u0Var));
    }

    @Override // j1.g.b, j1.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) k1.a.c(this, cVar);
    }

    @Override // j1.g.b
    public final g.c<?> getKey() {
        return k1.f4420d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Throwable] */
    @Override // x1.y1
    public CancellationException h() {
        CancellationException cancellationException;
        Object O = O();
        if (O instanceof b) {
            cancellationException = ((b) O).e();
        } else if (O instanceof z) {
            cancellationException = ((z) O).f4481a;
        } else {
            if (O instanceof f1) {
                throw new IllegalStateException(kotlin.jvm.internal.k.j("Cannot be cancelling child in this state: ", O).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new l1(kotlin.jvm.internal.k.j("Parent job is ", j0(O)), cancellationException, this) : cancellationException2;
    }

    public final void h0(r rVar) {
        this._parentHandle = rVar;
    }

    @Override // x1.k1
    public final CancellationException j() {
        Object O = O();
        if (!(O instanceof b)) {
            if (O instanceof f1) {
                throw new IllegalStateException(kotlin.jvm.internal.k.j("Job is still new or active: ", this).toString());
            }
            return O instanceof z ? l0(this, ((z) O).f4481a, null, 1, null) : new l1(kotlin.jvm.internal.k.j(m0.a(this), " has completed normally"), null, this);
        }
        Throwable e3 = ((b) O).e();
        if (e3 != null) {
            return k0(e3, kotlin.jvm.internal.k.j(m0.a(this), " is cancelling"));
        }
        throw new IllegalStateException(kotlin.jvm.internal.k.j("Job is still new or active: ", this).toString());
    }

    @Override // x1.k1
    public final t0 k(boolean z2, boolean z3, q1.l<? super Throwable, g1.q> lVar) {
        q1 W = W(lVar, z2);
        while (true) {
            Object O = O();
            if (O instanceof u0) {
                u0 u0Var = (u0) O;
                if (!u0Var.b()) {
                    e0(u0Var);
                } else if (l.a(f4438e, this, O, W)) {
                    return W;
                }
            } else {
                if (!(O instanceof f1)) {
                    if (z3) {
                        z zVar = O instanceof z ? (z) O : null;
                        lVar.invoke(zVar != null ? zVar.f4481a : null);
                    }
                    return w1.f4474e;
                }
                v1 h2 = ((f1) O).h();
                if (h2 != null) {
                    t0 t0Var = w1.f4474e;
                    if (z2 && (O instanceof b)) {
                        synchronized (O) {
                            r3 = ((b) O).e();
                            if (r3 == null || ((lVar instanceof s) && !((b) O).g())) {
                                if (u(O, h2, W)) {
                                    if (r3 == null) {
                                        return W;
                                    }
                                    t0Var = W;
                                }
                            }
                            g1.q qVar = g1.q.f2865a;
                        }
                    }
                    if (r3 != null) {
                        if (z3) {
                            lVar.invoke(r3);
                        }
                        return t0Var;
                    }
                    if (u(O, h2, W)) {
                        return W;
                    }
                } else {
                    if (O == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                    f0((q1) O);
                }
            }
        }
    }

    protected final CancellationException k0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = B();
            }
            cancellationException = new l1(str, th, this);
        }
        return cancellationException;
    }

    public final String m0() {
        return X() + '{' + j0(O()) + '}';
    }

    @Override // j1.g
    public j1.g minusKey(g.c<?> cVar) {
        return k1.a.e(this, cVar);
    }

    @Override // x1.k1
    public void n(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new l1(B(), null, this);
        }
        y(cancellationException);
    }

    @Override // j1.g
    public j1.g plus(j1.g gVar) {
        return k1.a.f(this, gVar);
    }

    @Override // x1.k1
    public final boolean start() {
        int i02;
        do {
            i02 = i0(O());
            if (i02 == 0) {
                return false;
            }
        } while (i02 != 1);
        return true;
    }

    public String toString() {
        return m0() + '@' + m0.b(this);
    }

    protected void w(Object obj) {
    }

    public final boolean x(Object obj) {
        Object obj2;
        kotlinx.coroutines.internal.x xVar;
        kotlinx.coroutines.internal.x xVar2;
        kotlinx.coroutines.internal.x xVar3;
        obj2 = s1.f4452a;
        if (L() && (obj2 = z(obj)) == s1.f4453b) {
            return true;
        }
        xVar = s1.f4452a;
        if (obj2 == xVar) {
            obj2 = U(obj);
        }
        xVar2 = s1.f4452a;
        if (obj2 == xVar2 || obj2 == s1.f4453b) {
            return true;
        }
        xVar3 = s1.f4455d;
        if (obj2 == xVar3) {
            return false;
        }
        w(obj2);
        return true;
    }

    public void y(Throwable th) {
        x(th);
    }
}
