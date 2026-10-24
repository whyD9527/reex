package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f794a;

    /* renamed from: b, reason: collision with root package name */
    private g1 f795b;

    /* renamed from: c, reason: collision with root package name */
    private g1 f796c;

    /* renamed from: d, reason: collision with root package name */
    private g1 f797d;

    public n(ImageView imageView) {
        this.f794a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f797d == null) {
            this.f797d = new g1();
        }
        g1 g1Var = this.f797d;
        g1Var.a();
        ColorStateList a3 = androidx.core.widget.g.a(this.f794a);
        if (a3 != null) {
            g1Var.f727d = true;
            g1Var.f724a = a3;
        }
        PorterDuff.Mode b3 = androidx.core.widget.g.b(this.f794a);
        if (b3 != null) {
            g1Var.f726c = true;
            g1Var.f725b = b3;
        }
        if (!g1Var.f727d && !g1Var.f726c) {
            return false;
        }
        j.i(drawable, g1Var, this.f794a.getDrawableState());
        return true;
    }

    private boolean j() {
        return this.f795b != null;
    }

    void b() {
        Drawable drawable = this.f794a.getDrawable();
        if (drawable != null) {
            m0.b(drawable);
        }
        if (drawable != null) {
            if (j() && a(drawable)) {
                return;
            }
            g1 g1Var = this.f796c;
            if (g1Var != null) {
                j.i(drawable, g1Var, this.f794a.getDrawableState());
                return;
            }
            g1 g1Var2 = this.f795b;
            if (g1Var2 != null) {
                j.i(drawable, g1Var2, this.f794a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        g1 g1Var = this.f796c;
        if (g1Var != null) {
            return g1Var.f724a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        g1 g1Var = this.f796c;
        if (g1Var != null) {
            return g1Var.f725b;
        }
        return null;
    }

    boolean e() {
        return !(this.f794a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i2) {
        int m2;
        Context context = this.f794a.getContext();
        int[] iArr = b.j.R;
        i1 u2 = i1.u(context, attributeSet, iArr, i2, 0);
        ImageView imageView = this.f794a;
        androidx.core.view.f0.F(imageView, imageView.getContext(), iArr, attributeSet, u2.q(), i2, 0);
        try {
            Drawable drawable = this.f794a.getDrawable();
            if (drawable == null && (m2 = u2.m(b.j.S, -1)) != -1 && (drawable = d.a.b(this.f794a.getContext(), m2)) != null) {
                this.f794a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                m0.b(drawable);
            }
            int i3 = b.j.T;
            if (u2.r(i3)) {
                androidx.core.widget.g.c(this.f794a, u2.c(i3));
            }
            int i4 = b.j.U;
            if (u2.r(i4)) {
                androidx.core.widget.g.d(this.f794a, m0.c(u2.j(i4, -1), null));
            }
        } finally {
            u2.v();
        }
    }

    public void g(int i2) {
        if (i2 != 0) {
            Drawable b3 = d.a.b(this.f794a.getContext(), i2);
            if (b3 != null) {
                m0.b(b3);
            }
            this.f794a.setImageDrawable(b3);
        } else {
            this.f794a.setImageDrawable(null);
        }
        b();
    }

    void h(ColorStateList colorStateList) {
        if (this.f796c == null) {
            this.f796c = new g1();
        }
        g1 g1Var = this.f796c;
        g1Var.f724a = colorStateList;
        g1Var.f727d = true;
        b();
    }

    void i(PorterDuff.Mode mode) {
        if (this.f796c == null) {
            this.f796c = new g1();
        }
        g1 g1Var = this.f796c;
        g1Var.f725b = mode;
        g1Var.f726c = true;
        b();
    }
}
