package a2;

import g1.q;
import q1.p;

/* loaded from: classes.dex */
final class f<T> extends a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final p<c<? super T>, j1.d<? super q>, Object> f17a;

    /* JADX WARN: Multi-variable type inference failed */
    public f(p<? super c<? super T>, ? super j1.d<? super q>, ? extends Object> pVar) {
        this.f17a = pVar;
    }

    @Override // a2.a
    public Object b(c<? super T> cVar, j1.d<? super q> dVar) {
        Object c3;
        Object invoke = this.f17a.invoke(cVar, dVar);
        c3 = k1.d.c();
        return invoke == c3 ? invoke : q.f2865a;
    }
}
