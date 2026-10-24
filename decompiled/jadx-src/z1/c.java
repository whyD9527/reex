package z1;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.x;
import x1.m0;
import z1.i;

/* loaded from: classes.dex */
public abstract class c<E> implements t<E> {

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4787d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");

    /* renamed from: b, reason: collision with root package name */
    protected final q1.l<E, g1.q> f4788b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.internal.k f4789c = new kotlinx.coroutines.internal.k();
    private volatile /* synthetic */ Object onCloseHandler = null;

    public static final class a<E> extends s {

        /* renamed from: h, reason: collision with root package name */
        public final E f4790h;

        public a(E e3) {
            this.f4790h = e3;
        }

        @Override // z1.s
        public x A(m.b bVar) {
            return x1.n.f4428a;
        }

        @Override // kotlinx.coroutines.internal.m
        public String toString() {
            return "SendBuffered@" + m0.b(this) + '(' + this.f4790h + ')';
        }

        @Override // z1.s
        public void y() {
        }

        @Override // z1.s
        public Object z() {
            return this.f4790h;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(q1.l<? super E, g1.q> lVar) {
        this.f4788b = lVar;
    }

    private final int b() {
        kotlinx.coroutines.internal.k kVar = this.f4789c;
        int i2 = 0;
        for (kotlinx.coroutines.internal.m mVar = (kotlinx.coroutines.internal.m) kVar.o(); !kotlin.jvm.internal.k.a(mVar, kVar); mVar = mVar.p()) {
            if (mVar instanceof kotlinx.coroutines.internal.m) {
                i2++;
            }
        }
        return i2;
    }

    private final String f() {
        kotlinx.coroutines.internal.m p2 = this.f4789c.p();
        if (p2 == this.f4789c) {
            return "EmptyQueue";
        }
        String mVar = p2 instanceof j ? p2.toString() : p2 instanceof o ? "ReceiveQueued" : p2 instanceof s ? "SendQueued" : kotlin.jvm.internal.k.j("UNEXPECTED:", p2);
        kotlinx.coroutines.internal.m q2 = this.f4789c.q();
        if (q2 == p2) {
            return mVar;
        }
        String str = mVar + ",queueSize=" + b();
        if (!(q2 instanceof j)) {
            return str;
        }
        return str + ",closedForSend=" + q2;
    }

    private final void g(j<?> jVar) {
        Object b3 = kotlinx.coroutines.internal.j.b(null, 1, null);
        while (true) {
            kotlinx.coroutines.internal.m q2 = jVar.q();
            o oVar = q2 instanceof o ? (o) q2 : null;
            if (oVar == null) {
                break;
            } else if (oVar.u()) {
                b3 = kotlinx.coroutines.internal.j.c(b3, oVar);
            } else {
                oVar.r();
            }
        }
        if (b3 != null) {
            if (b3 instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) b3;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        ((o) arrayList.get(size)).z(jVar);
                        if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                }
            } else {
                ((o) b3).z(jVar);
            }
        }
        j(jVar);
    }

    private final Throwable h(j<?> jVar) {
        g(jVar);
        return jVar.F();
    }

    @Override // z1.t
    public final Object a(E e3) {
        i.b bVar;
        j<?> jVar;
        Object i2 = i(e3);
        if (i2 == b.f4782b) {
            return i.f4804a.c(g1.q.f2865a);
        }
        if (i2 == b.f4783c) {
            jVar = d();
            if (jVar == null) {
                return i.f4804a.b();
            }
            bVar = i.f4804a;
        } else {
            if (!(i2 instanceof j)) {
                throw new IllegalStateException(kotlin.jvm.internal.k.j("trySend returned ", i2).toString());
            }
            bVar = i.f4804a;
            jVar = (j) i2;
        }
        return bVar.a(h(jVar));
    }

    protected String c() {
        return "";
    }

    protected final j<?> d() {
        kotlinx.coroutines.internal.m q2 = this.f4789c.q();
        j<?> jVar = q2 instanceof j ? (j) q2 : null;
        if (jVar == null) {
            return null;
        }
        g(jVar);
        return jVar;
    }

    protected final kotlinx.coroutines.internal.k e() {
        return this.f4789c;
    }

    protected Object i(E e3) {
        q<E> l2;
        do {
            l2 = l();
            if (l2 == null) {
                return b.f4783c;
            }
        } while (l2.g(e3, null) == null);
        l2.c(e3);
        return l2.e();
    }

    protected void j(kotlinx.coroutines.internal.m mVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final q<?> k(E e3) {
        kotlinx.coroutines.internal.m q2;
        kotlinx.coroutines.internal.k kVar = this.f4789c;
        a aVar = new a(e3);
        do {
            q2 = kVar.q();
            if (q2 instanceof q) {
                return (q) q2;
            }
        } while (!q2.j(aVar, kVar));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.internal.m] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    protected q<E> l() {
        ?? r12;
        kotlinx.coroutines.internal.m v2;
        kotlinx.coroutines.internal.k kVar = this.f4789c;
        while (true) {
            r12 = (kotlinx.coroutines.internal.m) kVar.o();
            if (r12 != kVar && (r12 instanceof q)) {
                if (((((q) r12) instanceof j) && !r12.t()) || (v2 = r12.v()) == null) {
                    break;
                }
                v2.s();
            }
        }
        r12 = 0;
        return (q) r12;
    }

    protected final s m() {
        kotlinx.coroutines.internal.m mVar;
        kotlinx.coroutines.internal.m v2;
        kotlinx.coroutines.internal.k kVar = this.f4789c;
        while (true) {
            mVar = (kotlinx.coroutines.internal.m) kVar.o();
            if (mVar != kVar && (mVar instanceof s)) {
                if (((((s) mVar) instanceof j) && !mVar.t()) || (v2 = mVar.v()) == null) {
                    break;
                }
                v2.s();
            }
        }
        mVar = null;
        return (s) mVar;
    }

    public String toString() {
        return m0.a(this) + '@' + m0.b(this) + '{' + f() + '}' + c();
    }
}
