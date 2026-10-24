package c2;

import g1.k;
import g1.l;
import j1.d;
import j1.g;
import kotlin.coroutines.jvm.internal.h;
import kotlinx.coroutines.internal.b0;
import q1.p;

/* loaded from: classes.dex */
public final class b {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r2, d<? super T> dVar) {
        Object a3;
        Object c3;
        d a4 = h.a(dVar);
        try {
            g context = dVar.getContext();
            Object c4 = b0.c(context, null);
            try {
            } finally {
                b0.a(context, c4);
            }
        } catch (Throwable th) {
            k.a aVar = k.f2859e;
            a3 = l.a(th);
        }
        if (pVar == null) {
            throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        }
        a3 = ((p) kotlin.jvm.internal.p.a(pVar, 2)).invoke(r2, a4);
        c3 = k1.d.c();
        if (a3 == c3) {
            return;
        }
        a4.resumeWith(k.a(a3));
    }
}
