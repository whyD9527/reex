package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private ViewParent f1630a;

    /* renamed from: b, reason: collision with root package name */
    private ViewParent f1631b;

    /* renamed from: c, reason: collision with root package name */
    private final View f1632c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1633d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f1634e;

    public x(View view) {
        this.f1632c = view;
    }

    private boolean f(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent g2;
        int i7;
        int i8;
        int[] iArr3;
        if (!j() || (g2 = g(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f1632c.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr2 == null) {
            int[] h2 = h();
            h2[0] = 0;
            h2[1] = 0;
            iArr3 = h2;
        } else {
            iArr3 = iArr2;
        }
        a1.d(g2, this.f1632c, i2, i3, i4, i5, i6, iArr3);
        if (iArr != null) {
            this.f1632c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
        }
        return true;
    }

    private ViewParent g(int i2) {
        if (i2 == 0) {
            return this.f1630a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f1631b;
    }

    private int[] h() {
        if (this.f1634e == null) {
            this.f1634e = new int[2];
        }
        return this.f1634e;
    }

    private void l(int i2, ViewParent viewParent) {
        if (i2 == 0) {
            this.f1630a = viewParent;
        } else {
            if (i2 != 1) {
                return;
            }
            this.f1631b = viewParent;
        }
    }

    public boolean a(float f2, float f3, boolean z2) {
        ViewParent g2;
        if (!j() || (g2 = g(0)) == null) {
            return false;
        }
        return a1.a(g2, this.f1632c, f2, f3, z2);
    }

    public boolean b(float f2, float f3) {
        ViewParent g2;
        if (!j() || (g2 = g(0)) == null) {
            return false;
        }
        return a1.b(g2, this.f1632c, f2, f3);
    }

    public boolean c(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent g2;
        int i5;
        int i6;
        if (!j() || (g2 = g(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f1632c.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            iArr = h();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        a1.c(g2, this.f1632c, i2, i3, iArr, i4);
        if (iArr2 != null) {
            this.f1632c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void d(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        f(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public boolean e(int i2, int i3, int i4, int i5, int[] iArr) {
        return f(i2, i3, i4, i5, iArr, 0, null);
    }

    public boolean i(int i2) {
        return g(i2) != null;
    }

    public boolean j() {
        return this.f1633d;
    }

    public void k(boolean z2) {
        if (this.f1633d) {
            f0.S(this.f1632c);
        }
        this.f1633d = z2;
    }

    public boolean m(int i2, int i3) {
        if (i(i3)) {
            return true;
        }
        if (!j()) {
            return false;
        }
        View view = this.f1632c;
        for (ViewParent parent = this.f1632c.getParent(); parent != null; parent = parent.getParent()) {
            if (a1.f(parent, view, this.f1632c, i2, i3)) {
                l(i3, parent);
                a1.e(parent, view, this.f1632c, i2, i3);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void n(int i2) {
        ViewParent g2 = g(i2);
        if (g2 != null) {
            a1.g(g2, this.f1632c, i2);
            l(i2, null);
        }
    }
}
