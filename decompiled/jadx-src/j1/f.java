package j1;

import g1.k;
import g1.q;
import kotlin.jvm.internal.k;
import q1.p;

/* loaded from: classes.dex */
public final class f {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r2, d<? super T> completion) {
        d a3;
        d b3;
        k.e(pVar, "<this>");
        k.e(completion, "completion");
        a3 = k1.c.a(pVar, r2, completion);
        b3 = k1.c.b(a3);
        k.a aVar = g1.k.f2859e;
        b3.resumeWith(g1.k.a(q.f2865a));
    }
}
