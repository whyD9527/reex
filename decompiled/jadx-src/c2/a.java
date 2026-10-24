package c2;

import g1.k;
import g1.l;
import g1.q;
import j1.d;
import k1.c;
import kotlinx.coroutines.internal.g;
import q1.p;

/* loaded from: classes.dex */
public final class a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(d<?> dVar, Throwable th) {
        k.a aVar = k.f2859e;
        dVar.resumeWith(k.a(l.a(th)));
        throw th;
    }

    public static final void c(d<? super q> dVar, d<?> dVar2) {
        d b3;
        try {
            b3 = c.b(dVar);
            k.a aVar = k.f2859e;
            g.c(b3, k.a(q.f2865a), null, 2, null);
        } catch (Throwable th) {
            b(dVar2, th);
        }
    }

    public static final <R, T> void d(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r2, d<? super T> dVar, q1.l<? super Throwable, q> lVar) {
        d a3;
        d b3;
        try {
            a3 = c.a(pVar, r2, dVar);
            b3 = c.b(a3);
            k.a aVar = k.f2859e;
            g.b(b3, k.a(q.f2865a), lVar);
        } catch (Throwable th) {
            b(dVar, th);
        }
    }

    public static /* synthetic */ void e(p pVar, Object obj, d dVar, q1.l lVar, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        d(pVar, obj, dVar, lVar);
    }
}
