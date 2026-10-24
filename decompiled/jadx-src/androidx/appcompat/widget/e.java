package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final View f674a;

    /* renamed from: d, reason: collision with root package name */
    private g1 f677d;

    /* renamed from: e, reason: collision with root package name */
    private g1 f678e;

    /* renamed from: f, reason: collision with root package name */
    private g1 f679f;

    /* renamed from: c, reason: collision with root package name */
    private int f676c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final j f675b = j.b();

    e(View view) {
        this.f674a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f679f == null) {
            this.f679f = new g1();
        }
        g1 g1Var = this.f679f;
        g1Var.a();
        ColorStateList k2 = androidx.core.view.f0.k(this.f674a);
        if (k2 != null) {
            g1Var.f727d = true;
            g1Var.f724a = k2;
        }
        PorterDuff.Mode l2 = androidx.core.view.f0.l(this.f674a);
        if (l2 != null) {
            g1Var.f726c = true;
            g1Var.f725b = l2;
        }
        if (!g1Var.f727d && !g1Var.f726c) {
            return false;
        }
        j.i(drawable, g1Var, this.f674a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f677d != null;
    }

    void b() {
        Drawable background = this.f674a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            g1 g1Var = this.f678e;
            if (g1Var != null) {
                j.i(background, g1Var, this.f674a.getDrawableState());
                return;
            }
            g1 g1Var2 = this.f677d;
            if (g1Var2 != null) {
                j.i(background, g1Var2, this.f674a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        g1 g1Var = this.f678e;
        if (g1Var != null) {
            return g1Var.f724a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        g1 g1Var = this.f678e;
        if (g1Var != null) {
            return g1Var.f725b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i2) {
        Context context = this.f674a.getContext();
        int[] iArr = b.j.A3;
        i1 u2 = i1.u(context, attributeSet, iArr, i2, 0);
        View view = this.f674a;
        androidx.core.view.f0.F(view, view.getContext(), iArr, attributeSet, u2.q(), i2, 0);
        try {
            int i3 = b.j.B3;
            if (u2.r(i3)) {
                this.f676c = u2.m(i3, -1);
                ColorStateList f2 = this.f675b.f(this.f674a.getContext(), this.f676c);
                if (f2 != null) {
                    h(f2);
                }
            }
            int i4 = b.j.C3;
            if (u2.r(i4)) {
                androidx.core.view.f0.J(this.f674a, u2.c(i4));
            }
            int i5 = b.j.D3;
            if (u2.r(i5)) {
                androidx.core.view.f0.K(this.f674a, m0.c(u2.j(i5, -1), null));
            }
        } finally {
            u2.v();
        }
    }

    void f(Drawable drawable) {
        this.f676c = -1;
        h(null);
        b();
    }

    void g(int i2) {
        this.f676c = i2;
        j jVar = this.f675b;
        h(jVar != null ? jVar.f(this.f674a.getContext(), i2) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f677d == null) {
                this.f677d = new g1();
            }
            g1 g1Var = this.f677d;
            g1Var.f724a = colorStateList;
            g1Var.f727d = true;
        } else {
            this.f677d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f678e == null) {
            this.f678e = new g1();
        }
        g1 g1Var = this.f678e;
        g1Var.f724a = colorStateList;
        g1Var.f727d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f678e == null) {
            this.f678e = new g1();
        }
        g1 g1Var = this.f678e;
        g1Var.f725b = mode;
        g1Var.f726c = true;
        b();
    }
}
