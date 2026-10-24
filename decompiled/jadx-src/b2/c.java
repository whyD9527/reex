package b2;

import g1.k;
import g1.q;
import j1.g;
import j1.h;
import kotlin.jvm.internal.l;
import q1.p;
import x1.o1;

/* loaded from: classes.dex */
public final class c<T> extends kotlin.coroutines.jvm.internal.d implements a2.c<T> {

    /* renamed from: e, reason: collision with root package name */
    public final a2.c<T> f2383e;

    /* renamed from: f, reason: collision with root package name */
    public final g f2384f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2385g;

    /* renamed from: h, reason: collision with root package name */
    private g f2386h;

    /* renamed from: i, reason: collision with root package name */
    private j1.d<? super q> f2387i;

    static final class a extends l implements p<Integer, g.b, Integer> {

        /* renamed from: e, reason: collision with root package name */
        public static final a f2388e = new a();

        a() {
            super(2);
        }

        public final Integer a(int i2, g.b bVar) {
            return Integer.valueOf(i2 + 1);
        }

        @Override // q1.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(a2.c<? super T> cVar, g gVar) {
        super(b.f2381e, h.f3610e);
        this.f2383e = cVar;
        this.f2384f = gVar;
        this.f2385g = ((Number) gVar.fold(0, a.f2388e)).intValue();
    }

    private final void b(g gVar, g gVar2, T t2) {
        if (gVar2 instanceof b2.a) {
            e((b2.a) gVar2, t2);
        }
        e.a(this, gVar);
        this.f2386h = gVar;
    }

    private final Object c(j1.d<? super q> dVar, T t2) {
        q1.q qVar;
        g context = dVar.getContext();
        o1.d(context);
        g gVar = this.f2386h;
        if (gVar != context) {
            b(context, gVar, t2);
        }
        this.f2387i = dVar;
        qVar = d.f2389a;
        return qVar.d(this.f2383e, t2, this);
    }

    private final void e(b2.a aVar, Object obj) {
        String e3;
        e3 = w1.g.e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + aVar.f2379e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(e3.toString());
    }

    @Override // a2.c
    public Object emit(T t2, j1.d<? super q> dVar) {
        Object c3;
        Object c4;
        try {
            Object c5 = c(dVar, t2);
            c3 = k1.d.c();
            if (c5 == c3) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            c4 = k1.d.c();
            return c5 == c4 ? c5 : q.f2865a;
        } catch (Throwable th) {
            this.f2386h = new b2.a(th);
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        j1.d<? super q> dVar = this.f2387i;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, j1.d
    public g getContext() {
        j1.d<? super q> dVar = this.f2387i;
        g context = dVar == null ? null : dVar.getContext();
        return context == null ? h.f3610e : context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public Object invokeSuspend(Object obj) {
        Object c3;
        Throwable b3 = k.b(obj);
        if (b3 != null) {
            this.f2386h = new b2.a(b3);
        }
        j1.d<? super q> dVar = this.f2387i;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        c3 = k1.d.c();
        return c3;
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
