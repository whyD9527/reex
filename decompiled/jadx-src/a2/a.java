package a2;

import g1.l;
import g1.q;

/* loaded from: classes.dex */
public abstract class a<T> implements b<T> {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {212}, m = "collect")
    /* renamed from: a2.a$a, reason: collision with other inner class name */
    static final class C0003a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: e, reason: collision with root package name */
        Object f13e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f14f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a<T> f15g;

        /* renamed from: h, reason: collision with root package name */
        int f16h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0003a(a<T> aVar, j1.d<? super C0003a> dVar) {
            super(dVar);
            this.f15g = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f14f = obj;
            this.f16h |= Integer.MIN_VALUE;
            return this.f15g.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // a2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c<? super T> cVar, j1.d<? super q> dVar) {
        C0003a c0003a;
        Object c3;
        int i2;
        Throwable th;
        b2.c cVar2;
        if (dVar instanceof C0003a) {
            c0003a = (C0003a) dVar;
            int i3 = c0003a.f16h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0003a.f16h = i3 - Integer.MIN_VALUE;
                Object obj = c0003a.f14f;
                c3 = k1.d.c();
                i2 = c0003a.f16h;
                if (i2 != 0) {
                    l.b(obj);
                    b2.c cVar3 = new b2.c(cVar, c0003a.getContext());
                    try {
                        c0003a.f13e = cVar3;
                        c0003a.f16h = 1;
                        if (b(cVar3, c0003a) == c3) {
                            return c3;
                        }
                        cVar2 = cVar3;
                    } catch (Throwable th2) {
                        th = th2;
                        cVar2 = cVar3;
                        cVar2.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar2 = (b2.c) c0003a.f13e;
                    try {
                        l.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        cVar2.releaseIntercepted();
                        throw th;
                    }
                }
                cVar2.releaseIntercepted();
                return q.f2865a;
            }
        }
        c0003a = new C0003a(this, dVar);
        Object obj2 = c0003a.f14f;
        c3 = k1.d.c();
        i2 = c0003a.f16h;
        if (i2 != 0) {
        }
        cVar2.releaseIntercepted();
        return q.f2865a;
    }

    public abstract Object b(c<? super T> cVar, j1.d<? super q> dVar);
}
