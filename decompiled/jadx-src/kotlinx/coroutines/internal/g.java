package kotlinx.coroutines.internal;

import g1.k;
import java.util.concurrent.CancellationException;
import x1.b2;
import x1.d2;
import x1.k1;
import x1.v0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final x f3675a = new x("UNDEFINED");

    /* renamed from: b, reason: collision with root package name */
    public static final x f3676b = new x("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    public static final <T> void b(j1.d<? super T> dVar, Object obj, q1.l<? super Throwable, g1.q> lVar) {
        boolean z2;
        if (!(dVar instanceof f)) {
            dVar.resumeWith(obj);
            return;
        }
        f fVar = (f) dVar;
        Object b3 = x1.d0.b(obj, lVar);
        if (fVar.f3671h.o(fVar.getContext())) {
            fVar.f3673j = b3;
            fVar.f4434g = 1;
            fVar.f3671h.i(fVar.getContext(), fVar);
            return;
        }
        v0 a3 = b2.f4393a.a();
        if (a3.v()) {
            fVar.f3673j = b3;
            fVar.f4434g = 1;
            a3.r(fVar);
            return;
        }
        a3.t(true);
        try {
            k1 k1Var = (k1) fVar.getContext().get(k1.f4420d);
            if (k1Var == null || k1Var.b()) {
                z2 = false;
            } else {
                CancellationException j2 = k1Var.j();
                fVar.b(b3, j2);
                k.a aVar = g1.k.f2859e;
                fVar.resumeWith(g1.k.a(g1.l.a(j2)));
                z2 = true;
            }
            if (!z2) {
                j1.d<T> dVar2 = fVar.f3672i;
                Object obj2 = fVar.f3674k;
                j1.g context = dVar2.getContext();
                Object c3 = b0.c(context, obj2);
                d2<?> e3 = c3 != b0.f3655a ? x1.e0.e(dVar2, context, c3) : null;
                try {
                    fVar.f3672i.resumeWith(obj);
                    g1.q qVar = g1.q.f2865a;
                    if (e3 == null || e3.x0()) {
                        b0.a(context, c3);
                    }
                } catch (Throwable th) {
                    if (e3 == null || e3.x0()) {
                        b0.a(context, c3);
                    }
                    throw th;
                }
            }
            while (a3.x()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void c(j1.d dVar, Object obj, q1.l lVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        b(dVar, obj, lVar);
    }
}
