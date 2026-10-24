package k1;

import g1.l;
import g1.q;
import j1.g;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.k;
import q1.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c {

    public static final class a extends j {

        /* renamed from: e, reason: collision with root package name */
        private int f3620e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ p f3621f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f3622g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j1.d dVar, p pVar, Object obj) {
            super(dVar);
            this.f3621f = pVar;
            this.f3622g = obj;
            k.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i2 = this.f3620e;
            if (i2 == 0) {
                this.f3620e = 1;
                l.b(obj);
                k.c(this.f3621f, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) kotlin.jvm.internal.p.a(this.f3621f, 2)).invoke(this.f3622g, this);
            }
            if (i2 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f3620e = 2;
            l.b(obj);
            return obj;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: e, reason: collision with root package name */
        private int f3623e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ p f3624f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f3625g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j1.d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f3624f = pVar;
            this.f3625g = obj;
            k.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i2 = this.f3623e;
            if (i2 == 0) {
                this.f3623e = 1;
                l.b(obj);
                k.c(this.f3624f, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) kotlin.jvm.internal.p.a(this.f3624f, 2)).invoke(this.f3625g, this);
            }
            if (i2 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f3623e = 2;
            l.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> j1.d<q> a(p<? super R, ? super j1.d<? super T>, ? extends Object> pVar, R r2, j1.d<? super T> completion) {
        k.e(pVar, "<this>");
        k.e(completion, "completion");
        j1.d<?> a3 = h.a(completion);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(r2, a3);
        }
        g context = a3.getContext();
        return context == j1.h.f3610e ? new a(a3, pVar, r2) : new b(a3, context, pVar, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> j1.d<T> b(j1.d<? super T> dVar) {
        j1.d<T> dVar2;
        k.e(dVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar3 = dVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) dVar : null;
        return (dVar3 == null || (dVar2 = (j1.d<T>) dVar3.intercepted()) == null) ? dVar : dVar2;
    }
}
