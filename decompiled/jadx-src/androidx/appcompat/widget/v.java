package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
class v extends r {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f896d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f897e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f898f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f899g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f900h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f901i;

    v(SeekBar seekBar) {
        super(seekBar);
        this.f898f = null;
        this.f899g = null;
        this.f900h = false;
        this.f901i = false;
        this.f896d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f897e;
        if (drawable != null) {
            if (this.f900h || this.f901i) {
                Drawable p2 = androidx.core.graphics.drawable.a.p(drawable.mutate());
                this.f897e = p2;
                if (this.f900h) {
                    androidx.core.graphics.drawable.a.n(p2, this.f898f);
                }
                if (this.f901i) {
                    androidx.core.graphics.drawable.a.o(this.f897e, this.f899g);
                }
                if (this.f897e.isStateful()) {
                    this.f897e.setState(this.f896d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.r
    void c(AttributeSet attributeSet, int i2) {
        super.c(attributeSet, i2);
        Context context = this.f896d.getContext();
        int[] iArr = b.j.V;
        i1 u2 = i1.u(context, attributeSet, iArr, i2, 0);
        SeekBar seekBar = this.f896d;
        androidx.core.view.f0.F(seekBar, seekBar.getContext(), iArr, attributeSet, u2.q(), i2, 0);
        Drawable g2 = u2.g(b.j.W);
        if (g2 != null) {
            this.f896d.setThumb(g2);
        }
        j(u2.f(b.j.X));
        int i3 = b.j.Z;
        if (u2.r(i3)) {
            this.f899g = m0.c(u2.j(i3, -1), this.f899g);
            this.f901i = true;
        }
        int i4 = b.j.Y;
        if (u2.r(i4)) {
            this.f898f = u2.c(i4);
            this.f900h = true;
        }
        u2.v();
        f();
    }

    void g(Canvas canvas) {
        if (this.f897e != null) {
            int max = this.f896d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f897e.getIntrinsicWidth();
                int intrinsicHeight = this.f897e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f897e.setBounds(-i2, -i3, i2, i3);
                float width = ((this.f896d.getWidth() - this.f896d.getPaddingLeft()) - this.f896d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f896d.getPaddingLeft(), this.f896d.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f897e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    void h() {
        Drawable drawable = this.f897e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f896d.getDrawableState())) {
            this.f896d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f897e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f897e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f897e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f896d);
            androidx.core.graphics.drawable.a.l(drawable, androidx.core.view.f0.n(this.f896d));
            if (drawable.isStateful()) {
                drawable.setState(this.f896d.getDrawableState());
            }
            f();
        }
        this.f896d.invalidate();
    }
}
