package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
class m1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: n, reason: collision with root package name */
    private static m1 f781n;

    /* renamed from: o, reason: collision with root package name */
    private static m1 f782o;

    /* renamed from: e, reason: collision with root package name */
    private final View f783e;

    /* renamed from: f, reason: collision with root package name */
    private final CharSequence f784f;

    /* renamed from: g, reason: collision with root package name */
    private final int f785g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f786h = new a();

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f787i = new b();

    /* renamed from: j, reason: collision with root package name */
    private int f788j;

    /* renamed from: k, reason: collision with root package name */
    private int f789k;

    /* renamed from: l, reason: collision with root package name */
    private n1 f790l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f791m;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m1.this.g(false);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m1.this.c();
        }
    }

    private m1(View view, CharSequence charSequence) {
        this.f783e = view;
        this.f784f = charSequence;
        this.f785g = androidx.core.view.y0.a(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f783e.removeCallbacks(this.f786h);
    }

    private void b() {
        this.f788j = Integer.MAX_VALUE;
        this.f789k = Integer.MAX_VALUE;
    }

    private void d() {
        this.f783e.postDelayed(this.f786h, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(m1 m1Var) {
        m1 m1Var2 = f781n;
        if (m1Var2 != null) {
            m1Var2.a();
        }
        f781n = m1Var;
        if (m1Var != null) {
            m1Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        m1 m1Var = f781n;
        if (m1Var != null && m1Var.f783e == view) {
            e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new m1(view, charSequence);
            return;
        }
        m1 m1Var2 = f782o;
        if (m1Var2 != null && m1Var2.f783e == view) {
            m1Var2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean h(MotionEvent motionEvent) {
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        if (Math.abs(x2 - this.f788j) <= this.f785g && Math.abs(y2 - this.f789k) <= this.f785g) {
            return false;
        }
        this.f788j = x2;
        this.f789k = y2;
        return true;
    }

    void c() {
        if (f782o == this) {
            f782o = null;
            n1 n1Var = this.f790l;
            if (n1Var != null) {
                n1Var.c();
                this.f790l = null;
                b();
                this.f783e.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f781n == this) {
            e(null);
        }
        this.f783e.removeCallbacks(this.f787i);
    }

    void g(boolean z2) {
        long longPressTimeout;
        if (androidx.core.view.f0.v(this.f783e)) {
            e(null);
            m1 m1Var = f782o;
            if (m1Var != null) {
                m1Var.c();
            }
            f782o = this;
            this.f791m = z2;
            n1 n1Var = new n1(this.f783e.getContext());
            this.f790l = n1Var;
            n1Var.e(this.f783e, this.f788j, this.f789k, this.f791m, this.f784f);
            this.f783e.addOnAttachStateChangeListener(this);
            if (this.f791m) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((androidx.core.view.f0.s(this.f783e) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f783e.removeCallbacks(this.f787i);
            this.f783e.postDelayed(this.f787i, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f790l != null && this.f791m) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f783e.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f783e.isEnabled() && this.f790l == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f788j = view.getWidth() / 2;
        this.f789k = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
