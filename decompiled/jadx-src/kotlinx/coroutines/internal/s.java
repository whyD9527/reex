package kotlinx.coroutines.internal;

import x1.h0;

/* loaded from: classes.dex */
public final class s {

    static final class a extends kotlin.jvm.internal.l implements q1.l<Throwable, g1.q> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ q1.l<E, g1.q> f3702e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ E f3703f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ j1.g f3704g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(q1.l<? super E, g1.q> lVar, E e3, j1.g gVar) {
            super(1);
            this.f3702e = lVar;
            this.f3703f = e3;
            this.f3704g = gVar;
        }

        public final void a(Throwable th) {
            s.b(this.f3702e, this.f3703f, this.f3704g);
        }

        @Override // q1.l
        public /* bridge */ /* synthetic */ g1.q invoke(Throwable th) {
            a(th);
            return g1.q.f2865a;
        }
    }

    public static final <E> q1.l<Throwable, g1.q> a(q1.l<? super E, g1.q> lVar, E e3, j1.g gVar) {
        return new a(lVar, e3, gVar);
    }

    public static final <E> void b(q1.l<? super E, g1.q> lVar, E e3, j1.g gVar) {
        f0 c3 = c(lVar, e3, null);
        if (c3 == null) {
            return;
        }
        h0.a(gVar, c3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> f0 c(q1.l<? super E, g1.q> lVar, E e3, f0 f0Var) {
        try {
            lVar.invoke(e3);
        } catch (Throwable th) {
            if (f0Var == null || f0Var.getCause() == th) {
                return new f0(kotlin.jvm.internal.k.j("Exception in undelivered element handler for ", e3), th);
            }
            g1.b.a(f0Var, th);
        }
        return f0Var;
    }

    public static /* synthetic */ f0 d(q1.l lVar, Object obj, f0 f0Var, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            f0Var = null;
        }
        return c(lVar, obj, f0Var);
    }
}
