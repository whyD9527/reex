package c;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import g.b;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: c.a$a, reason: collision with other inner class name */
    public static class C0035a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f2392a;

        public C0035a(int i2, int i3) {
            super(i2, i3);
            this.f2392a = 8388627;
        }

        public C0035a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2392a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.j.f2347t);
            this.f2392a = obtainStyledAttributes.getInt(b.j.f2350u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0035a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2392a = 0;
        }

        public C0035a(C0035a c0035a) {
            super((ViewGroup.MarginLayoutParams) c0035a);
            this.f2392a = 0;
            this.f2392a = c0035a.f2392a;
        }
    }

    public interface b {
        void onMenuVisibilityChanged(boolean z2);
    }

    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z2);

    public abstract int i();

    public abstract Context j();

    public boolean k() {
        return false;
    }

    public abstract void l(Configuration configuration);

    void m() {
    }

    public abstract boolean n(int i2, KeyEvent keyEvent);

    public boolean o(KeyEvent keyEvent) {
        return false;
    }

    public boolean p() {
        return false;
    }

    public abstract void q(boolean z2);

    public abstract void r(boolean z2);

    public abstract void s(CharSequence charSequence);

    public abstract g.b t(b.a aVar);
}
