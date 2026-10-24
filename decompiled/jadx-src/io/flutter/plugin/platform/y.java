package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.plugin.platform.SingleViewPresentation;

@TargetApi(20)
/* loaded from: classes.dex */
class y {

    /* renamed from: a, reason: collision with root package name */
    SingleViewPresentation f3413a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3414b;

    /* renamed from: c, reason: collision with root package name */
    private final io.flutter.plugin.platform.a f3415c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3416d;

    /* renamed from: e, reason: collision with root package name */
    private final int f3417e;

    /* renamed from: f, reason: collision with root package name */
    private final m f3418f;

    /* renamed from: g, reason: collision with root package name */
    private final View.OnFocusChangeListener f3419g;

    /* renamed from: h, reason: collision with root package name */
    private VirtualDisplay f3420h;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f3421e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Runnable f3422f;

        /* renamed from: io.flutter.plugin.platform.y$a$a, reason: collision with other inner class name */
        class RunnableC0047a implements Runnable {
            RunnableC0047a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                aVar.f3421e.postDelayed(aVar.f3422f, 128L);
            }
        }

        a(View view, Runnable runnable) {
            this.f3421e = view;
            this.f3422f = runnable;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b.a(this.f3421e, new RunnableC0047a());
            this.f3421e.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static class b implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final View f3425a;

        /* renamed from: b, reason: collision with root package name */
        Runnable f3426b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f3425a.getViewTreeObserver().removeOnDrawListener(b.this);
            }
        }

        b(View view, Runnable runnable) {
            this.f3425a = view;
            this.f3426b = runnable;
        }

        static void a(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new b(view, runnable));
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f3426b;
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.f3426b = null;
            this.f3425a.post(new a());
        }
    }

    private y(Context context, io.flutter.plugin.platform.a aVar, VirtualDisplay virtualDisplay, i iVar, m mVar, View.OnFocusChangeListener onFocusChangeListener, int i2, Object obj) {
        this.f3414b = context;
        this.f3415c = aVar;
        this.f3418f = mVar;
        this.f3419g = onFocusChangeListener;
        this.f3417e = i2;
        this.f3420h = virtualDisplay;
        this.f3416d = context.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context, this.f3420h.getDisplay(), iVar, aVar, i2, onFocusChangeListener);
        this.f3413a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public static y a(Context context, io.flutter.plugin.platform.a aVar, i iVar, m mVar, int i2, int i3, int i4, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        if (i2 == 0 || i3 == 0) {
            return null;
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        mVar.a(i2, i3);
        VirtualDisplay createVirtualDisplay = displayManager.createVirtualDisplay("flutter-vd#" + i4, i2, i3, displayMetrics.densityDpi, mVar.getSurface(), 0);
        if (createVirtualDisplay == null) {
            return null;
        }
        return new y(context, aVar, createVirtualDisplay, iVar, mVar, onFocusChangeListener, i4, obj);
    }

    @TargetApi(androidx.constraintlayout.widget.k.T)
    private void j(View view, int i2, int i3, Runnable runnable) {
        this.f3418f.a(i2, i3);
        this.f3420h.resize(i2, i3, this.f3416d);
        view.postDelayed(runnable, 0L);
    }

    public void b(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.f3413a;
        if (singleViewPresentation == null) {
            return;
        }
        singleViewPresentation.dispatchTouchEvent(motionEvent);
    }

    public void c() {
        this.f3413a.cancel();
        this.f3413a.detachState();
        this.f3420h.release();
        this.f3418f.release();
    }

    public int d() {
        m mVar = this.f3418f;
        if (mVar != null) {
            return mVar.getHeight();
        }
        return 0;
    }

    public int e() {
        m mVar = this.f3418f;
        if (mVar != null) {
            return mVar.getWidth();
        }
        return 0;
    }

    public View f() {
        SingleViewPresentation singleViewPresentation = this.f3413a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().c();
    }

    void g() {
        SingleViewPresentation singleViewPresentation = this.f3413a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f3413a.getView().f();
    }

    void h() {
        SingleViewPresentation singleViewPresentation = this.f3413a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f3413a.getView().b();
    }

    public void i(int i2, int i3, Runnable runnable) {
        if (i2 == e() && i3 == d()) {
            f().postDelayed(runnable, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            j(f(), i2, i3, runnable);
            return;
        }
        boolean isFocused = f().isFocused();
        SingleViewPresentation.e detachState = this.f3413a.detachState();
        this.f3420h.setSurface(null);
        this.f3420h.release();
        DisplayManager displayManager = (DisplayManager) this.f3414b.getSystemService("display");
        this.f3418f.a(i2, i3);
        this.f3420h = displayManager.createVirtualDisplay("flutter-vd#" + this.f3417e, i2, i3, this.f3416d, this.f3418f.getSurface(), 0);
        View f2 = f();
        f2.addOnAttachStateChangeListener(new a(f2, runnable));
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f3414b, this.f3420h.getDisplay(), this.f3415c, detachState, this.f3419g, isFocused);
        singleViewPresentation.show();
        this.f3413a.cancel();
        this.f3413a = singleViewPresentation;
    }
}
