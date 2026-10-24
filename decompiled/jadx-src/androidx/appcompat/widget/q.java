package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
class q extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f840b = false;

    /* renamed from: a, reason: collision with root package name */
    private boolean f841a;

    public q(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        a(context, attributeSet, i2, i3);
    }

    private void a(Context context, AttributeSet attributeSet, int i2, int i3) {
        i1 u2 = i1.u(context, attributeSet, b.j.f2292b2, i2, i3);
        int i4 = b.j.f2300d2;
        if (u2.r(i4)) {
            b(u2.a(i4, false));
        }
        setBackgroundDrawable(u2.f(b.j.f2296c2));
        u2.v();
    }

    private void b(boolean z2) {
        if (f840b) {
            this.f841a = z2;
        } else {
            androidx.core.widget.j.a(this, z2);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3) {
        if (f840b && this.f841a) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3, int i4) {
        if (f840b && this.f841a) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i2, int i3, int i4, int i5) {
        if (f840b && this.f841a) {
            i3 -= view.getHeight();
        }
        super.update(view, i2, i3, i4, i5);
    }
}
