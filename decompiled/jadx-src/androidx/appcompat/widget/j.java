package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.y0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f740b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private static j f741c;

    /* renamed from: a, reason: collision with root package name */
    private y0 f742a;

    class a implements y0.e {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f743a = {b.e.S, b.e.Q, b.e.f2197a};

        /* renamed from: b, reason: collision with root package name */
        private final int[] f744b = {b.e.f2211o, b.e.B, b.e.f2216t, b.e.f2212p, b.e.f2213q, b.e.f2215s, b.e.f2214r};

        /* renamed from: c, reason: collision with root package name */
        private final int[] f745c = {b.e.P, b.e.R, b.e.f2207k, b.e.I, b.e.J, b.e.L, b.e.N, b.e.K, b.e.M, b.e.O};

        /* renamed from: d, reason: collision with root package name */
        private final int[] f746d = {b.e.f2219w, b.e.f2205i, b.e.f2218v};

        /* renamed from: e, reason: collision with root package name */
        private final int[] f747e = {b.e.H, b.e.T};

        /* renamed from: f, reason: collision with root package name */
        private final int[] f748f = {b.e.f2199c, b.e.f2203g, b.e.f2200d, b.e.f2204h};

        a() {
        }

        private boolean f(int[] iArr, int i2) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i2) {
            int c3 = d1.c(context, b.a.f2171v);
            return new ColorStateList(new int[][]{d1.f665b, d1.f668e, d1.f666c, d1.f672i}, new int[]{d1.b(context, b.a.f2169t), androidx.core.graphics.a.c(c3, i2), androidx.core.graphics.a.c(c3, i2), i2});
        }

        private ColorStateList i(Context context) {
            return h(context, d1.c(context, b.a.f2168s));
        }

        private ColorStateList j(Context context) {
            return h(context, d1.c(context, b.a.f2169t));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i2 = b.a.f2173x;
            ColorStateList e3 = d1.e(context, i2);
            if (e3 == null || !e3.isStateful()) {
                iArr[0] = d1.f665b;
                iArr2[0] = d1.b(context, i2);
                iArr[1] = d1.f669f;
                iArr2[1] = d1.c(context, b.a.f2170u);
                iArr[2] = d1.f672i;
                iArr2[2] = d1.c(context, i2);
            } else {
                int[] iArr3 = d1.f665b;
                iArr[0] = iArr3;
                iArr2[0] = e3.getColorForState(iArr3, 0);
                iArr[1] = d1.f669f;
                iArr2[1] = d1.c(context, b.a.f2170u);
                iArr[2] = d1.f672i;
                iArr2[2] = e3.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private void l(Drawable drawable, int i2, PorterDuff.Mode mode) {
            if (m0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.f740b;
            }
            drawable.setColorFilter(j.e(i2, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0061 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0046  */
        @Override // androidx.appcompat.widget.y0.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean a(Context context, int i2, Drawable drawable) {
            int i3;
            boolean z2;
            PorterDuff.Mode mode = j.f740b;
            boolean f2 = f(this.f743a, i2);
            int i4 = R.attr.colorBackground;
            if (f2) {
                i4 = b.a.f2172w;
            } else if (f(this.f745c, i2)) {
                i4 = b.a.f2170u;
            } else if (f(this.f746d, i2)) {
                mode = PorterDuff.Mode.MULTIPLY;
            } else {
                if (i2 == b.e.f2217u) {
                    i4 = R.attr.colorForeground;
                    i3 = Math.round(40.8f);
                    z2 = true;
                    if (!z2) {
                        return false;
                    }
                    if (m0.a(drawable)) {
                        drawable = drawable.mutate();
                    }
                    drawable.setColorFilter(j.e(d1.c(context, i4), mode));
                    if (i3 != -1) {
                        drawable.setAlpha(i3);
                    }
                    return true;
                }
                if (i2 != b.e.f2208l) {
                    i3 = -1;
                    z2 = false;
                    i4 = 0;
                    if (!z2) {
                    }
                }
            }
            i3 = -1;
            z2 = true;
            if (!z2) {
            }
        }

        @Override // androidx.appcompat.widget.y0.e
        public PorterDuff.Mode b(int i2) {
            if (i2 == b.e.F) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.y0.e
        public Drawable c(y0 y0Var, Context context, int i2) {
            if (i2 == b.e.f2206j) {
                return new LayerDrawable(new Drawable[]{y0Var.j(context, b.e.f2205i), y0Var.j(context, b.e.f2207k)});
            }
            return null;
        }

        @Override // androidx.appcompat.widget.y0.e
        public ColorStateList d(Context context, int i2) {
            if (i2 == b.e.f2209m) {
                return d.a.a(context, b.c.f2181e);
            }
            if (i2 == b.e.G) {
                return d.a.a(context, b.c.f2184h);
            }
            if (i2 == b.e.F) {
                return k(context);
            }
            if (i2 == b.e.f2202f) {
                return j(context);
            }
            if (i2 == b.e.f2198b) {
                return g(context);
            }
            if (i2 == b.e.f2201e) {
                return i(context);
            }
            if (i2 == b.e.D || i2 == b.e.E) {
                return d.a.a(context, b.c.f2183g);
            }
            if (f(this.f744b, i2)) {
                return d1.e(context, b.a.f2172w);
            }
            if (f(this.f747e, i2)) {
                return d.a.a(context, b.c.f2180d);
            }
            if (f(this.f748f, i2)) {
                return d.a.a(context, b.c.f2179c);
            }
            if (i2 == b.e.A) {
                return d.a.a(context, b.c.f2182f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.y0.e
        public boolean e(Context context, int i2, Drawable drawable) {
            Drawable findDrawableByLayerId;
            int c3;
            if (i2 == b.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.background);
                int i3 = b.a.f2172w;
                l(findDrawableByLayerId2, d1.c(context, i3), j.f740b);
                l(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), d1.c(context, i3), j.f740b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
                c3 = d1.c(context, b.a.f2170u);
            } else {
                if (i2 != b.e.f2221y && i2 != b.e.f2220x && i2 != b.e.f2222z) {
                    return false;
                }
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                l(layerDrawable2.findDrawableByLayerId(R.id.background), d1.b(context, b.a.f2172w), j.f740b);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
                int i4 = b.a.f2170u;
                l(findDrawableByLayerId3, d1.c(context, i4), j.f740b);
                findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(R.id.progress);
                c3 = d1.c(context, i4);
            }
            l(findDrawableByLayerId, c3, j.f740b);
            return true;
        }
    }

    public static synchronized j b() {
        j jVar;
        synchronized (j.class) {
            if (f741c == null) {
                h();
            }
            jVar = f741c;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter e(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter l2;
        synchronized (j.class) {
            l2 = y0.l(i2, mode);
        }
        return l2;
    }

    public static synchronized void h() {
        synchronized (j.class) {
            if (f741c == null) {
                j jVar = new j();
                f741c = jVar;
                jVar.f742a = y0.h();
                f741c.f742a.u(new a());
            }
        }
    }

    static void i(Drawable drawable, g1 g1Var, int[] iArr) {
        y0.w(drawable, g1Var, iArr);
    }

    public synchronized Drawable c(Context context, int i2) {
        return this.f742a.j(context, i2);
    }

    synchronized Drawable d(Context context, int i2, boolean z2) {
        return this.f742a.k(context, i2, z2);
    }

    synchronized ColorStateList f(Context context, int i2) {
        return this.f742a.m(context, i2);
    }

    public synchronized void g(Context context) {
        this.f742a.s(context);
    }
}
