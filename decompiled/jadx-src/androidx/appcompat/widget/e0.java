package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.content.res.h;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* loaded from: classes.dex */
class e0 {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f680a;

    /* renamed from: b, reason: collision with root package name */
    private g1 f681b;

    /* renamed from: c, reason: collision with root package name */
    private g1 f682c;

    /* renamed from: d, reason: collision with root package name */
    private g1 f683d;

    /* renamed from: e, reason: collision with root package name */
    private g1 f684e;

    /* renamed from: f, reason: collision with root package name */
    private g1 f685f;

    /* renamed from: g, reason: collision with root package name */
    private g1 f686g;

    /* renamed from: h, reason: collision with root package name */
    private g1 f687h;

    /* renamed from: i, reason: collision with root package name */
    private final g0 f688i;

    /* renamed from: j, reason: collision with root package name */
    private int f689j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f690k = -1;

    /* renamed from: l, reason: collision with root package name */
    private Typeface f691l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f692m;

    class a extends h.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f693a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f694b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f695c;

        a(int i2, int i3, WeakReference weakReference) {
            this.f693a = i2;
            this.f694b = i3;
            this.f695c = weakReference;
        }

        @Override // androidx.core.content.res.h.b
        /* renamed from: h */
        public void f(int i2) {
        }

        @Override // androidx.core.content.res.h.b
        /* renamed from: i */
        public void g(Typeface typeface) {
            int i2;
            if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f693a) != -1) {
                typeface = Typeface.create(typeface, i2, (this.f694b & 2) != 0);
            }
            e0.this.n(this.f695c, typeface);
        }
    }

    e0(TextView textView) {
        this.f680a = textView;
        this.f688i = new g0(textView);
    }

    private void A(int i2, float f2) {
        this.f688i.u(i2, f2);
    }

    private void B(Context context, i1 i1Var) {
        String n2;
        Typeface create;
        Typeface typeface;
        this.f689j = i1Var.j(b.j.M2, this.f689j);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int j2 = i1Var.j(b.j.O2, -1);
            this.f690k = j2;
            if (j2 != -1) {
                this.f689j = (this.f689j & 2) | 0;
            }
        }
        int i3 = b.j.N2;
        if (!i1Var.r(i3) && !i1Var.r(b.j.P2)) {
            int i4 = b.j.L2;
            if (i1Var.r(i4)) {
                this.f692m = false;
                int j3 = i1Var.j(i4, 1);
                if (j3 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (j3 == 2) {
                    typeface = Typeface.SERIF;
                } else if (j3 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f691l = typeface;
                return;
            }
            return;
        }
        this.f691l = null;
        int i5 = b.j.P2;
        if (i1Var.r(i5)) {
            i3 = i5;
        }
        int i6 = this.f690k;
        int i7 = this.f689j;
        if (!context.isRestricted()) {
            try {
                Typeface i8 = i1Var.i(i3, this.f689j, new a(i6, i7, new WeakReference(this.f680a)));
                if (i8 != null) {
                    if (i2 >= 28 && this.f690k != -1) {
                        i8 = Typeface.create(Typeface.create(i8, 0), this.f690k, (this.f689j & 2) != 0);
                    }
                    this.f691l = i8;
                }
                this.f692m = this.f691l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f691l != null || (n2 = i1Var.n(i3)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f690k == -1) {
            create = Typeface.create(n2, this.f689j);
        } else {
            create = Typeface.create(Typeface.create(n2, 0), this.f690k, (this.f689j & 2) != 0);
        }
        this.f691l = create;
    }

    private void a(Drawable drawable, g1 g1Var) {
        if (drawable == null || g1Var == null) {
            return;
        }
        j.i(drawable, g1Var, this.f680a.getDrawableState());
    }

    private static g1 d(Context context, j jVar, int i2) {
        ColorStateList f2 = jVar.f(context, i2);
        if (f2 == null) {
            return null;
        }
        g1 g1Var = new g1();
        g1Var.f727d = true;
        g1Var.f724a = f2;
        return g1Var;
    }

    private void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f680a.getCompoundDrawablesRelative();
            TextView textView = this.f680a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f680a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            TextView textView2 = this.f680a;
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f680a.getCompoundDrawables();
        TextView textView3 = this.f680a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void y() {
        g1 g1Var = this.f687h;
        this.f681b = g1Var;
        this.f682c = g1Var;
        this.f683d = g1Var;
        this.f684e = g1Var;
        this.f685f = g1Var;
        this.f686g = g1Var;
    }

    void b() {
        if (this.f681b != null || this.f682c != null || this.f683d != null || this.f684e != null) {
            Drawable[] compoundDrawables = this.f680a.getCompoundDrawables();
            a(compoundDrawables[0], this.f681b);
            a(compoundDrawables[1], this.f682c);
            a(compoundDrawables[2], this.f683d);
            a(compoundDrawables[3], this.f684e);
        }
        if (this.f685f == null && this.f686g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f680a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f685f);
        a(compoundDrawablesRelative[2], this.f686g);
    }

    void c() {
        this.f688i.a();
    }

    int e() {
        return this.f688i.g();
    }

    int f() {
        return this.f688i.h();
    }

    int g() {
        return this.f688i.i();
    }

    int[] h() {
        return this.f688i.j();
    }

    int i() {
        return this.f688i.k();
    }

    ColorStateList j() {
        g1 g1Var = this.f687h;
        if (g1Var != null) {
            return g1Var.f724a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        g1 g1Var = this.f687h;
        if (g1Var != null) {
            return g1Var.f725b;
        }
        return null;
    }

    boolean l() {
        return this.f688i.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0222  */
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m(AttributeSet attributeSet, int i2) {
        boolean z2;
        boolean z3;
        String str;
        String str2;
        boolean z4;
        int i3;
        Typeface typeface;
        i1 t2;
        int i4;
        int i5;
        int e3;
        int e4;
        int e5;
        int[] j2;
        int autoSizeStepGranularity;
        Context context = this.f680a.getContext();
        j b3 = j.b();
        int[] iArr = b.j.f2286a0;
        i1 u2 = i1.u(context, attributeSet, iArr, i2, 0);
        TextView textView = this.f680a;
        androidx.core.view.f0.F(textView, textView.getContext(), iArr, attributeSet, u2.q(), i2, 0);
        int m2 = u2.m(b.j.f2290b0, -1);
        int i6 = b.j.f2302e0;
        if (u2.r(i6)) {
            this.f681b = d(context, b3, u2.m(i6, 0));
        }
        int i7 = b.j.f2294c0;
        if (u2.r(i7)) {
            this.f682c = d(context, b3, u2.m(i7, 0));
        }
        int i8 = b.j.f2306f0;
        if (u2.r(i8)) {
            this.f683d = d(context, b3, u2.m(i8, 0));
        }
        int i9 = b.j.f2298d0;
        if (u2.r(i9)) {
            this.f684e = d(context, b3, u2.m(i9, 0));
        }
        int i10 = Build.VERSION.SDK_INT;
        int i11 = b.j.f2309g0;
        if (u2.r(i11)) {
            this.f685f = d(context, b3, u2.m(i11, 0));
        }
        int i12 = b.j.f2312h0;
        if (u2.r(i12)) {
            this.f686g = d(context, b3, u2.m(i12, 0));
        }
        u2.v();
        boolean z5 = this.f680a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (m2 != -1) {
            i1 s2 = i1.s(context, m2, b.j.J2);
            if (!z5) {
                int i13 = b.j.R2;
                if (s2.r(i13)) {
                    z2 = s2.a(i13, false);
                    z3 = true;
                    B(context, s2);
                    int i14 = b.j.S2;
                    str2 = !s2.r(i14) ? s2.n(i14) : null;
                    if (i10 >= 26) {
                        int i15 = b.j.Q2;
                        if (s2.r(i15)) {
                            str = s2.n(i15);
                            s2.v();
                        }
                    }
                    str = null;
                    s2.v();
                }
            }
            z2 = false;
            z3 = false;
            B(context, s2);
            int i142 = b.j.S2;
            if (!s2.r(i142)) {
            }
            if (i10 >= 26) {
            }
            str = null;
            s2.v();
        } else {
            z2 = false;
            z3 = false;
            str = null;
            str2 = null;
        }
        i1 u3 = i1.u(context, attributeSet, b.j.J2, i2, 0);
        if (!z5) {
            int i16 = b.j.R2;
            if (u3.r(i16)) {
                z2 = u3.a(i16, false);
                z4 = true;
                i3 = b.j.S2;
                if (u3.r(i3)) {
                    str2 = u3.n(i3);
                }
                if (i10 >= 26) {
                    int i17 = b.j.Q2;
                    if (u3.r(i17)) {
                        str = u3.n(i17);
                    }
                }
                if (i10 >= 28) {
                    int i18 = b.j.K2;
                    if (u3.r(i18) && u3.e(i18, -1) == 0) {
                        this.f680a.setTextSize(0, 0.0f);
                    }
                }
                B(context, u3);
                u3.v();
                if (!z5 && z4) {
                    r(z2);
                }
                typeface = this.f691l;
                if (typeface != null) {
                    if (this.f690k == -1) {
                        this.f680a.setTypeface(typeface, this.f689j);
                    } else {
                        this.f680a.setTypeface(typeface);
                    }
                }
                if (str != null) {
                    this.f680a.setFontVariationSettings(str);
                }
                if (str2 != null) {
                    if (i10 >= 24) {
                        this.f680a.setTextLocales(LocaleList.forLanguageTags(str2));
                    } else {
                        this.f680a.setTextLocale(Locale.forLanguageTag(str2.substring(0, str2.indexOf(44))));
                    }
                }
                this.f688i.p(attributeSet, i2);
                if (androidx.core.widget.b.f1689a && this.f688i.k() != 0) {
                    j2 = this.f688i.j();
                    if (j2.length > 0) {
                        autoSizeStepGranularity = this.f680a.getAutoSizeStepGranularity();
                        if (autoSizeStepGranularity != -1.0f) {
                            this.f680a.setAutoSizeTextTypeUniformWithConfiguration(this.f688i.h(), this.f688i.g(), this.f688i.i(), 0);
                        } else {
                            this.f680a.setAutoSizeTextTypeUniformWithPresetSizes(j2, 0);
                        }
                    }
                }
                t2 = i1.t(context, attributeSet, b.j.f2315i0);
                int m3 = t2.m(b.j.f2339q0, -1);
                Drawable c3 = m3 == -1 ? b3.c(context, m3) : null;
                int m4 = t2.m(b.j.f2354v0, -1);
                Drawable c4 = m4 == -1 ? b3.c(context, m4) : null;
                int m5 = t2.m(b.j.f2342r0, -1);
                Drawable c5 = m5 == -1 ? b3.c(context, m5) : null;
                int m6 = t2.m(b.j.f2333o0, -1);
                Drawable c6 = m6 == -1 ? b3.c(context, m6) : null;
                int m7 = t2.m(b.j.f2345s0, -1);
                Drawable c7 = m7 == -1 ? b3.c(context, m7) : null;
                int m8 = t2.m(b.j.f2336p0, -1);
                x(c3, c4, c5, c6, c7, m8 == -1 ? b3.c(context, m8) : null);
                i4 = b.j.f2348t0;
                if (t2.r(i4)) {
                    androidx.core.widget.k.f(this.f680a, t2.c(i4));
                }
                i5 = b.j.f2351u0;
                if (t2.r(i5)) {
                    androidx.core.widget.k.g(this.f680a, m0.c(t2.j(i5, -1), null));
                }
                e3 = t2.e(b.j.f2357w0, -1);
                e4 = t2.e(b.j.f2360x0, -1);
                e5 = t2.e(b.j.f2363y0, -1);
                t2.v();
                if (e3 != -1) {
                    androidx.core.widget.k.h(this.f680a, e3);
                }
                if (e4 != -1) {
                    androidx.core.widget.k.i(this.f680a, e4);
                }
                if (e5 == -1) {
                    androidx.core.widget.k.j(this.f680a, e5);
                    return;
                }
                return;
            }
        }
        z4 = z3;
        i3 = b.j.S2;
        if (u3.r(i3)) {
        }
        if (i10 >= 26) {
        }
        if (i10 >= 28) {
        }
        B(context, u3);
        u3.v();
        if (!z5) {
            r(z2);
        }
        typeface = this.f691l;
        if (typeface != null) {
        }
        if (str != null) {
        }
        if (str2 != null) {
        }
        this.f688i.p(attributeSet, i2);
        if (androidx.core.widget.b.f1689a) {
            j2 = this.f688i.j();
            if (j2.length > 0) {
            }
        }
        t2 = i1.t(context, attributeSet, b.j.f2315i0);
        int m32 = t2.m(b.j.f2339q0, -1);
        if (m32 == -1) {
        }
        int m42 = t2.m(b.j.f2354v0, -1);
        if (m42 == -1) {
        }
        int m52 = t2.m(b.j.f2342r0, -1);
        if (m52 == -1) {
        }
        int m62 = t2.m(b.j.f2333o0, -1);
        if (m62 == -1) {
        }
        int m72 = t2.m(b.j.f2345s0, -1);
        if (m72 == -1) {
        }
        int m82 = t2.m(b.j.f2336p0, -1);
        x(c3, c4, c5, c6, c7, m82 == -1 ? b3.c(context, m82) : null);
        i4 = b.j.f2348t0;
        if (t2.r(i4)) {
        }
        i5 = b.j.f2351u0;
        if (t2.r(i5)) {
        }
        e3 = t2.e(b.j.f2357w0, -1);
        e4 = t2.e(b.j.f2360x0, -1);
        e5 = t2.e(b.j.f2363y0, -1);
        t2.v();
        if (e3 != -1) {
        }
        if (e4 != -1) {
        }
        if (e5 == -1) {
        }
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f692m) {
            this.f691l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f689j);
            }
        }
    }

    void o(boolean z2, int i2, int i3, int i4, int i5) {
        if (androidx.core.widget.b.f1689a) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i2) {
        String n2;
        i1 s2 = i1.s(context, i2, b.j.J2);
        int i3 = b.j.R2;
        if (s2.r(i3)) {
            r(s2.a(i3, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        int i5 = b.j.K2;
        if (s2.r(i5) && s2.e(i5, -1) == 0) {
            this.f680a.setTextSize(0, 0.0f);
        }
        B(context, s2);
        if (i4 >= 26) {
            int i6 = b.j.Q2;
            if (s2.r(i6) && (n2 = s2.n(i6)) != null) {
                this.f680a.setFontVariationSettings(n2);
            }
        }
        s2.v();
        Typeface typeface = this.f691l;
        if (typeface != null) {
            this.f680a.setTypeface(typeface, this.f689j);
        }
    }

    void r(boolean z2) {
        this.f680a.setAllCaps(z2);
    }

    void s(int i2, int i3, int i4, int i5) {
        this.f688i.q(i2, i3, i4, i5);
    }

    void t(int[] iArr, int i2) {
        this.f688i.r(iArr, i2);
    }

    void u(int i2) {
        this.f688i.s(i2);
    }

    void v(ColorStateList colorStateList) {
        if (this.f687h == null) {
            this.f687h = new g1();
        }
        g1 g1Var = this.f687h;
        g1Var.f724a = colorStateList;
        g1Var.f727d = colorStateList != null;
        y();
    }

    void w(PorterDuff.Mode mode) {
        if (this.f687h == null) {
            this.f687h = new g1();
        }
        g1 g1Var = this.f687h;
        g1Var.f725b = mode;
        g1Var.f726c = mode != null;
        y();
    }

    void z(int i2, float f2) {
        if (androidx.core.widget.b.f1689a || l()) {
            return;
        }
        A(i2, f2);
    }
}
