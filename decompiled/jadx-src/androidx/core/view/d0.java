package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class d0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: e, reason: collision with root package name */
    private final View f1563e;

    /* renamed from: f, reason: collision with root package name */
    private ViewTreeObserver f1564f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f1565g;

    private d0(View view, Runnable runnable) {
        this.f1563e = view;
        this.f1564f = view.getViewTreeObserver();
        this.f1565g = runnable;
    }

    public static d0 a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        d0 d0Var = new d0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(d0Var);
        view.addOnAttachStateChangeListener(d0Var);
        return d0Var;
    }

    public void b() {
        (this.f1564f.isAlive() ? this.f1564f : this.f1563e.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f1563e.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f1565g.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f1564f = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
