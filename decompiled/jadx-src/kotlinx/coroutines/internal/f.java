package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x1.b2;
import x1.m0;
import x1.p0;
import x1.v0;

/* loaded from: classes.dex */
public final class f<T> extends p0<T> implements kotlin.coroutines.jvm.internal.e, j1.d<T> {

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3670l = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: h, reason: collision with root package name */
    public final x1.f0 f3671h;

    /* renamed from: i, reason: collision with root package name */
    public final j1.d<T> f3672i;

    /* renamed from: j, reason: collision with root package name */
    public Object f3673j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f3674k;

    /* JADX WARN: Multi-variable type inference failed */
    public f(x1.f0 f0Var, j1.d<? super T> dVar) {
        super(-1);
        x xVar;
        this.f3671h = f0Var;
        this.f3672i = dVar;
        xVar = g.f3675a;
        this.f3673j = xVar;
        this.f3674k = b0.b(getContext());
        this._reusableCancellableContinuation = null;
    }

    private final x1.m<?> k() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof x1.m) {
            return (x1.m) obj;
        }
        return null;
    }

    @Override // x1.p0
    public void b(Object obj, Throwable th) {
        if (obj instanceof x1.a0) {
            ((x1.a0) obj).f4390b.invoke(th);
        }
    }

    @Override // x1.p0
    public j1.d<T> c() {
        return this;
    }

    @Override // x1.p0
    public Object g() {
        x xVar;
        Object obj = this.f3673j;
        xVar = g.f3675a;
        this.f3673j = xVar;
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        j1.d<T> dVar = this.f3672i;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // j1.d
    public j1.g getContext() {
        return this.f3672i.getContext();
    }

    public final void h() {
        while (this._reusableCancellableContinuation == g.f3676b) {
        }
    }

    public final x1.m<T> j() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = g.f3676b;
                return null;
            }
            if (obj instanceof x1.m) {
                if (x1.l.a(f3670l, this, obj, g.f3676b)) {
                    return (x1.m) obj;
                }
            } else if (obj != g.f3676b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(kotlin.jvm.internal.k.j("Inconsistent state ", obj).toString());
            }
        }
    }

    public final boolean l() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean m(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            x xVar = g.f3676b;
            if (kotlin.jvm.internal.k.a(obj, xVar)) {
                if (x1.l.a(f3670l, this, xVar, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (x1.l.a(f3670l, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void n() {
        h();
        x1.m<?> k2 = k();
        if (k2 == null) {
            return;
        }
        k2.s();
    }

    @Override // j1.d
    public void resumeWith(Object obj) {
        j1.g context = this.f3672i.getContext();
        Object d3 = x1.d0.d(obj, null, 1, null);
        if (this.f3671h.o(context)) {
            this.f3673j = d3;
            this.f4434g = 0;
            this.f3671h.i(context, this);
            return;
        }
        v0 a3 = b2.f4393a.a();
        if (a3.v()) {
            this.f3673j = d3;
            this.f4434g = 0;
            a3.r(this);
            return;
        }
        a3.t(true);
        try {
            j1.g context2 = getContext();
            Object c3 = b0.c(context2, this.f3674k);
            try {
                this.f3672i.resumeWith(obj);
                g1.q qVar = g1.q.f2865a;
                while (a3.x()) {
                }
            } finally {
                b0.a(context2, c3);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final Throwable s(x1.k<?> kVar) {
        x xVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            xVar = g.f3676b;
            if (obj != xVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(kotlin.jvm.internal.k.j("Inconsistent state ", obj).toString());
                }
                if (x1.l.a(f3670l, this, obj, null)) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } while (!x1.l.a(f3670l, this, xVar, kVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f3671h + ", " + m0.c(this.f3672i) + ']';
    }
}
