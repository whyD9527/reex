package x1;

import g1.k;

/* loaded from: classes.dex */
public final class q0 {
    public static final <T> void a(p0<? super T> p0Var, int i2) {
        j1.d<? super T> c3 = p0Var.c();
        boolean z2 = i2 == 4;
        if (z2 || !(c3 instanceof kotlinx.coroutines.internal.f) || b(i2) != b(p0Var.f4434g)) {
            d(p0Var, c3, z2);
            return;
        }
        f0 f0Var = ((kotlinx.coroutines.internal.f) c3).f3671h;
        j1.g context = c3.getContext();
        if (f0Var.o(context)) {
            f0Var.i(context, p0Var);
        } else {
            e(p0Var);
        }
    }

    public static final boolean b(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static final boolean c(int i2) {
        return i2 == 2;
    }

    public static final <T> void d(p0<? super T> p0Var, j1.d<? super T> dVar, boolean z2) {
        Object e3;
        Object g2 = p0Var.g();
        Throwable d3 = p0Var.d(g2);
        if (d3 != null) {
            k.a aVar = g1.k.f2859e;
            e3 = g1.l.a(d3);
        } else {
            k.a aVar2 = g1.k.f2859e;
            e3 = p0Var.e(g2);
        }
        Object a3 = g1.k.a(e3);
        if (!z2) {
            dVar.resumeWith(a3);
            return;
        }
        kotlinx.coroutines.internal.f fVar = (kotlinx.coroutines.internal.f) dVar;
        j1.d<T> dVar2 = fVar.f3672i;
        Object obj = fVar.f3674k;
        j1.g context = dVar2.getContext();
        Object c3 = kotlinx.coroutines.internal.b0.c(context, obj);
        d2<?> e4 = c3 != kotlinx.coroutines.internal.b0.f3655a ? e0.e(dVar2, context, c3) : null;
        try {
            fVar.f3672i.resumeWith(a3);
            g1.q qVar = g1.q.f2865a;
        } finally {
            if (e4 == null || e4.x0()) {
                kotlinx.coroutines.internal.b0.a(context, c3);
            }
        }
    }

    private static final void e(p0<?> p0Var) {
        v0 a3 = b2.f4393a.a();
        if (a3.v()) {
            a3.r(p0Var);
            return;
        }
        a3.t(true);
        try {
            d(p0Var, p0Var.c(), true);
            do {
            } while (a3.x());
        } finally {
            try {
            } finally {
            }
        }
    }
}
