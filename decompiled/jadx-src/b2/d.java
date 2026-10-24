package b2;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.p;
import q1.q;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final q<a2.c<Object>, Object, j1.d<? super g1.q>, Object> f2389a = (q) p.a(a.f2390e, 3);

    /* synthetic */ class a extends j implements q {

        /* renamed from: e, reason: collision with root package name */
        public static final a f2390e = new a();

        a() {
            super(3, a2.c.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // q1.q
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object d(a2.c<Object> cVar, Object obj, j1.d<? super g1.q> dVar) {
            return cVar.emit(obj, dVar);
        }
    }
}
