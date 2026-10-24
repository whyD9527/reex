package androidx.window.java.layout;

import a2.b;
import a2.c;
import androidx.constraintlayout.widget.k;
import androidx.core.util.a;
import g1.l;
import g1.q;
import j1.d;
import kotlin.coroutines.jvm.internal.f;
import q1.p;
import x1.i0;

@f(c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", f = "WindowInfoTrackerCallbackAdapter.kt", l = {k.N0}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WindowInfoTrackerCallbackAdapter$addListener$1$1 extends kotlin.coroutines.jvm.internal.k implements p<i0, d<? super q>, Object> {
    final /* synthetic */ a<T> $consumer;
    final /* synthetic */ b<T> $flow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WindowInfoTrackerCallbackAdapter$addListener$1$1(b<? extends T> bVar, a<T> aVar, d<? super WindowInfoTrackerCallbackAdapter$addListener$1$1> dVar) {
        super(2, dVar);
        this.$flow = bVar;
        this.$consumer = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new WindowInfoTrackerCallbackAdapter$addListener$1$1(this.$flow, this.$consumer, dVar);
    }

    @Override // q1.p
    public final Object invoke(i0 i0Var, d<? super q> dVar) {
        return ((WindowInfoTrackerCallbackAdapter$addListener$1$1) create(i0Var, dVar)).invokeSuspend(q.f2865a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c3;
        c3 = k1.d.c();
        int i2 = this.label;
        if (i2 == 0) {
            l.b(obj);
            b<T> bVar = this.$flow;
            final a<T> aVar = this.$consumer;
            Object obj2 = new c<T>() { // from class: androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1
                @Override // a2.c
                public Object emit(T t2, d<? super q> dVar) {
                    a.this.accept(t2);
                    return q.f2865a;
                }
            };
            this.label = 1;
            if (bVar.a(obj2, this) == c3) {
                return c3;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.b(obj);
        }
        return q.f2865a;
    }
}
