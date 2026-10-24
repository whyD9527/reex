package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.e;
import androidx.core.content.res.h;
import androidx.core.provider.g;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final j f1426a;

    /* renamed from: b, reason: collision with root package name */
    private static final l.e<String, Typeface> f1427b;

    public static class a extends g.c {

        /* renamed from: a, reason: collision with root package name */
        private h.b f1428a;

        public a(h.b bVar) {
            this.f1428a = bVar;
        }

        @Override // androidx.core.provider.g.c
        public void a(int i2) {
            h.b bVar = this.f1428a;
            if (bVar != null) {
                bVar.f(i2);
            }
        }

        @Override // androidx.core.provider.g.c
        public void b(Typeface typeface) {
            h.b bVar = this.f1428a;
            if (bVar != null) {
                bVar.g(typeface);
            }
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f1426a = i2 >= 29 ? new i() : i2 >= 28 ? new h() : i2 >= 26 ? new g() : (i2 < 24 || !f.j()) ? new e() : new f();
        f1427b = new l.e<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i2) {
        if (context != null) {
            return Typeface.create(typeface, i2);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i2) {
        return f1426a.b(context, cancellationSignal, bVarArr, i2);
    }

    public static Typeface c(Context context, e.b bVar, Resources resources, int i2, String str, int i3, int i4, h.b bVar2, Handler handler, boolean z2) {
        Typeface a3;
        if (bVar instanceof e.C0021e) {
            e.C0021e c0021e = (e.C0021e) bVar;
            Typeface g2 = g(c0021e.c());
            if (g2 != null) {
                if (bVar2 != null) {
                    bVar2.d(g2, handler);
                }
                return g2;
            }
            boolean z3 = !z2 ? bVar2 != null : c0021e.a() != 0;
            int d3 = z2 ? c0021e.d() : -1;
            a3 = androidx.core.provider.g.a(context, c0021e.b(), i4, z3, d3, h.b.e(handler), new a(bVar2));
        } else {
            a3 = f1426a.a(context, (e.c) bVar, resources, i4);
            if (bVar2 != null) {
                if (a3 != null) {
                    bVar2.d(a3, handler);
                } else {
                    bVar2.c(-3, handler);
                }
            }
        }
        if (a3 != null) {
            f1427b.d(e(resources, i2, str, i3, i4), a3);
        }
        return a3;
    }

    public static Typeface d(Context context, Resources resources, int i2, String str, int i3, int i4) {
        Typeface d3 = f1426a.d(context, resources, i2, str, i4);
        if (d3 != null) {
            f1427b.d(e(resources, i2, str, i3, i4), d3);
        }
        return d3;
    }

    private static String e(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }

    public static Typeface f(Resources resources, int i2, String str, int i3, int i4) {
        return f1427b.c(e(resources, i2, str, i3, i4));
    }

    private static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
