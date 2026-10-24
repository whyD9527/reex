package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import androidx.core.view.f0;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f383a;

    /* renamed from: b, reason: collision with root package name */
    private final e f384b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f385c;

    /* renamed from: d, reason: collision with root package name */
    private final int f386d;

    /* renamed from: e, reason: collision with root package name */
    private final int f387e;

    /* renamed from: f, reason: collision with root package name */
    private View f388f;

    /* renamed from: g, reason: collision with root package name */
    private int f389g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f390h;

    /* renamed from: i, reason: collision with root package name */
    private j.a f391i;

    /* renamed from: j, reason: collision with root package name */
    private h f392j;

    /* renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f393k;

    /* renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f394l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z2, int i2) {
        this(context, eVar, view, z2, i2, 0);
    }

    public i(Context context, e eVar, View view, boolean z2, int i2, int i3) {
        this.f389g = 8388611;
        this.f394l = new a();
        this.f383a = context;
        this.f384b = eVar;
        this.f388f = view;
        this.f385c = z2;
        this.f386d = i2;
        this.f387e = i3;
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f383a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.f383a.getResources().getDimensionPixelSize(b.d.f2187c) ? new b(this.f383a, this.f388f, this.f386d, this.f387e, this.f385c) : new l(this.f383a, this.f384b, this.f388f, this.f386d, this.f387e, this.f385c);
        bVar.l(this.f384b);
        bVar.u(this.f394l);
        bVar.p(this.f388f);
        bVar.k(this.f391i);
        bVar.r(this.f390h);
        bVar.s(this.f389g);
        return bVar;
    }

    private void l(int i2, int i3, boolean z2, boolean z3) {
        h c3 = c();
        c3.v(z3);
        if (z2) {
            if ((androidx.core.view.e.a(this.f389g, f0.n(this.f388f)) & 7) == 5) {
                i2 -= this.f388f.getWidth();
            }
            c3.t(i2);
            c3.w(i3);
            int i4 = (int) ((this.f383a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c3.q(new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4));
        }
        c3.a();
    }

    public void b() {
        if (d()) {
            this.f392j.dismiss();
        }
    }

    public h c() {
        if (this.f392j == null) {
            this.f392j = a();
        }
        return this.f392j;
    }

    public boolean d() {
        h hVar = this.f392j;
        return hVar != null && hVar.c();
    }

    protected void e() {
        this.f392j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f393k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f388f = view;
    }

    public void g(boolean z2) {
        this.f390h = z2;
        h hVar = this.f392j;
        if (hVar != null) {
            hVar.r(z2);
        }
    }

    public void h(int i2) {
        this.f389g = i2;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f393k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f391i = aVar;
        h hVar = this.f392j;
        if (hVar != null) {
            hVar.k(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f388f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i2, int i3) {
        if (d()) {
            return true;
        }
        if (this.f388f == null) {
            return false;
        }
        l(i2, i3, true, true);
        return true;
    }
}
