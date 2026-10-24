package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    private final CompoundButton f731a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f732b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f733c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f734d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f735e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f736f;

    i(CompoundButton compoundButton) {
        this.f731a = compoundButton;
    }

    void a() {
        Drawable a3 = androidx.core.widget.c.a(this.f731a);
        if (a3 != null) {
            if (this.f734d || this.f735e) {
                Drawable mutate = androidx.core.graphics.drawable.a.p(a3).mutate();
                if (this.f734d) {
                    androidx.core.graphics.drawable.a.n(mutate, this.f732b);
                }
                if (this.f735e) {
                    androidx.core.graphics.drawable.a.o(mutate, this.f733c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f731a.getDrawableState());
                }
                this.f731a.setButtonDrawable(mutate);
            }
        }
    }

    int b(int i2) {
        return i2;
    }

    ColorStateList c() {
        return this.f732b;
    }

    PorterDuff.Mode d() {
        return this.f733c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void e(AttributeSet attributeSet, int i2) {
        boolean z2;
        int i3;
        int i4;
        int m2;
        int m3;
        Context context = this.f731a.getContext();
        int[] iArr = b.j.R0;
        i1 u2 = i1.u(context, attributeSet, iArr, i2, 0);
        CompoundButton compoundButton = this.f731a;
        androidx.core.view.f0.F(compoundButton, compoundButton.getContext(), iArr, attributeSet, u2.q(), i2, 0);
        try {
            int i5 = b.j.T0;
            if (u2.r(i5) && (m3 = u2.m(i5, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f731a;
                    compoundButton2.setButtonDrawable(d.a.b(compoundButton2.getContext(), m3));
                    z2 = true;
                } catch (Resources.NotFoundException unused) {
                }
                if (!z2) {
                    int i6 = b.j.S0;
                    if (u2.r(i6) && (m2 = u2.m(i6, 0)) != 0) {
                        CompoundButton compoundButton3 = this.f731a;
                        compoundButton3.setButtonDrawable(d.a.b(compoundButton3.getContext(), m2));
                    }
                }
                i3 = b.j.U0;
                if (u2.r(i3)) {
                    androidx.core.widget.c.b(this.f731a, u2.c(i3));
                }
                i4 = b.j.V0;
                if (u2.r(i4)) {
                    androidx.core.widget.c.c(this.f731a, m0.c(u2.j(i4, -1), null));
                }
            }
            z2 = false;
            if (!z2) {
            }
            i3 = b.j.U0;
            if (u2.r(i3)) {
            }
            i4 = b.j.V0;
            if (u2.r(i4)) {
            }
        } finally {
            u2.v();
        }
    }

    void f() {
        if (this.f736f) {
            this.f736f = false;
        } else {
            this.f736f = true;
            a();
        }
    }

    void g(ColorStateList colorStateList) {
        this.f732b = colorStateList;
        this.f734d = true;
        a();
    }

    void h(PorterDuff.Mode mode) {
        this.f733c = mode;
        this.f735e = true;
        a();
    }
}
