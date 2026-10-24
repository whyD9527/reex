package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class m {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f3681e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f3682f = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_prev");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3683g = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    public static abstract class a extends c<m> {

        /* renamed from: b, reason: collision with root package name */
        public final m f3684b;

        /* renamed from: c, reason: collision with root package name */
        public m f3685c;

        public a(m mVar) {
            this.f3684b = mVar;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(m mVar, Object obj) {
            boolean z2 = obj == null;
            m mVar2 = z2 ? this.f3684b : this.f3685c;
            if (mVar2 != null && x1.l.a(m.f3681e, mVar, this, mVar2) && z2) {
                m mVar3 = this.f3684b;
                m mVar4 = this.f3685c;
                kotlin.jvm.internal.k.b(mVar4);
                mVar3.n(mVar4);
            }
        }
    }

    public static final class b extends t {
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (x1.l.a(kotlinx.coroutines.internal.m.f3681e, r3, r2, ((kotlinx.coroutines.internal.u) r4).f3705a) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final m l(t tVar) {
        while (true) {
            m mVar = (m) this._prev;
            m mVar2 = mVar;
            while (true) {
                m mVar3 = null;
                while (true) {
                    Object obj = mVar2._next;
                    if (obj == this) {
                        if (mVar == mVar2 || x1.l.a(f3682f, this, mVar, mVar2)) {
                            return mVar2;
                        }
                    } else {
                        if (t()) {
                            return null;
                        }
                        if (obj == tVar) {
                            return mVar2;
                        }
                        if (obj instanceof t) {
                            if (tVar != null && tVar.b((t) obj)) {
                                return null;
                            }
                            ((t) obj).c(mVar2);
                        } else if (!(obj instanceof u)) {
                            mVar3 = mVar2;
                            mVar2 = (m) obj;
                        } else {
                            if (mVar3 != null) {
                                break;
                            }
                            mVar2 = (m) mVar2._prev;
                        }
                    }
                }
                mVar2 = mVar3;
            }
        }
    }

    private final m m(m mVar) {
        while (mVar.t()) {
            mVar = (m) mVar._prev;
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(m mVar) {
        m mVar2;
        do {
            mVar2 = (m) mVar._prev;
            if (o() != mVar) {
                return;
            }
        } while (!x1.l.a(f3682f, mVar, mVar2, this));
        if (t()) {
            mVar.l(null);
        }
    }

    private final u w() {
        u uVar = (u) this._removedRef;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this);
        f3683g.lazySet(this, uVar2);
        return uVar2;
    }

    public final boolean j(m mVar, m mVar2) {
        f3682f.lazySet(mVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3681e;
        atomicReferenceFieldUpdater.lazySet(mVar, mVar2);
        if (!x1.l.a(atomicReferenceFieldUpdater, this, mVar2, mVar)) {
            return false;
        }
        mVar.n(mVar2);
        return true;
    }

    public final boolean k(m mVar) {
        f3682f.lazySet(mVar, this);
        f3681e.lazySet(mVar, this);
        while (o() == this) {
            if (x1.l.a(f3681e, this, this, mVar)) {
                mVar.n(this);
                return true;
            }
        }
        return false;
    }

    public final Object o() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof t)) {
                return obj;
            }
            ((t) obj).c(this);
        }
    }

    public final m p() {
        return l.b(o());
    }

    public final m q() {
        m l2 = l(null);
        return l2 == null ? m((m) this._prev) : l2;
    }

    public final void r() {
        ((u) o()).f3705a.s();
    }

    public final void s() {
        m mVar = this;
        while (true) {
            Object o2 = mVar.o();
            if (!(o2 instanceof u)) {
                mVar.l(null);
                return;
            }
            mVar = ((u) o2).f3705a;
        }
    }

    public boolean t() {
        return o() instanceof u;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append('@');
        sb.append((Object) Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    public boolean u() {
        return v() == null;
    }

    public final m v() {
        Object o2;
        m mVar;
        do {
            o2 = o();
            if (o2 instanceof u) {
                return ((u) o2).f3705a;
            }
            if (o2 == this) {
                return (m) o2;
            }
            mVar = (m) o2;
        } while (!x1.l.a(f3681e, this, o2, mVar.w()));
        mVar.l(null);
        return null;
    }

    public final int x(m mVar, m mVar2, a aVar) {
        f3682f.lazySet(mVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3681e;
        atomicReferenceFieldUpdater.lazySet(mVar, mVar2);
        aVar.f3685c = mVar2;
        if (x1.l.a(atomicReferenceFieldUpdater, this, mVar2, aVar)) {
            return aVar.c(this) == null ? 1 : 2;
        }
        return 0;
    }
}
