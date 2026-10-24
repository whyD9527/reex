package kotlinx.coroutines.internal;

import j1.g;
import x1.a2;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x f3655a = new x("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    private static final q1.p<Object, g.b, Object> f3656b = a.f3659e;

    /* renamed from: c, reason: collision with root package name */
    private static final q1.p<a2<?>, g.b, a2<?>> f3657c = b.f3660e;

    /* renamed from: d, reason: collision with root package name */
    private static final q1.p<e0, g.b, e0> f3658d = c.f3661e;

    static final class a extends kotlin.jvm.internal.l implements q1.p<Object, g.b, Object> {

        /* renamed from: e, reason: collision with root package name */
        public static final a f3659e = new a();

        a() {
            super(2);
        }

        @Override // q1.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, g.b bVar) {
            if (!(bVar instanceof a2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    static final class b extends kotlin.jvm.internal.l implements q1.p<a2<?>, g.b, a2<?>> {

        /* renamed from: e, reason: collision with root package name */
        public static final b f3660e = new b();

        b() {
            super(2);
        }

        @Override // q1.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a2<?> invoke(a2<?> a2Var, g.b bVar) {
            if (a2Var != null) {
                return a2Var;
            }
            if (bVar instanceof a2) {
                return (a2) bVar;
            }
            return null;
        }
    }

    static final class c extends kotlin.jvm.internal.l implements q1.p<e0, g.b, e0> {

        /* renamed from: e, reason: collision with root package name */
        public static final c f3661e = new c();

        c() {
            super(2);
        }

        @Override // q1.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0 invoke(e0 e0Var, g.b bVar) {
            if (bVar instanceof a2) {
                a2<?> a2Var = (a2) bVar;
                e0Var.a(a2Var, a2Var.c(e0Var.f3666a));
            }
            return e0Var;
        }
    }

    public static final void a(j1.g gVar, Object obj) {
        if (obj == f3655a) {
            return;
        }
        if (obj instanceof e0) {
            ((e0) obj).b(gVar);
            return;
        }
        Object fold = gVar.fold(null, f3657c);
        if (fold == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
        ((a2) fold).m(gVar, obj);
    }

    public static final Object b(j1.g gVar) {
        Object fold = gVar.fold(0, f3656b);
        kotlin.jvm.internal.k.b(fold);
        return fold;
    }

    public static final Object c(j1.g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        return obj == 0 ? f3655a : obj instanceof Integer ? gVar.fold(new e0(gVar, ((Number) obj).intValue()), f3658d) : ((a2) obj).c(gVar);
    }
}
