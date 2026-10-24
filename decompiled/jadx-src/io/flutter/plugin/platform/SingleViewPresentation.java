package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Keep
@TargetApi(19)
/* loaded from: classes.dex */
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final io.flutter.plugin.platform.a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private a rootView;
    private boolean startFocused;
    private final e state;
    private int viewId;

    private static class a extends FrameLayout {

        /* renamed from: e, reason: collision with root package name */
        private final io.flutter.plugin.platform.a f3317e;

        /* renamed from: f, reason: collision with root package name */
        private final View f3318f;

        public a(Context context, io.flutter.plugin.platform.a aVar, View view) {
            super(context);
            this.f3317e = aVar;
            this.f3318f = view;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f3317e.b(this.f3318f, view, accessibilityEvent);
        }
    }

    static class b extends ViewGroup {

        /* renamed from: e, reason: collision with root package name */
        private final Rect f3319e;

        /* renamed from: f, reason: collision with root package name */
        private final Rect f3320f;

        public b(Context context) {
            super(context);
            this.f3319e = new Rect();
            this.f3320f = new Rect();
        }

        private static int a(int i2) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
                this.f3319e.set(i2, i3, i4, i5);
                Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f3319e, layoutParams.x, layoutParams.y, this.f3320f);
                Rect rect = this.f3320f;
                childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        }

        @Override // android.view.View
        protected void onMeasure(int i2, int i3) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                getChildAt(i4).measure(a(i2), a(i3));
            }
            super.onMeasure(i2, i3);
        }
    }

    private static class c extends ContextWrapper {

        /* renamed from: a, reason: collision with root package name */
        private final InputMethodManager f3321a;

        c(Context context) {
            this(context, null);
        }

        private c(Context context, InputMethodManager inputMethodManager) {
            super(context);
            this.f3321a = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Context createDisplayContext(Display display) {
            return new c(super.createDisplayContext(display), this.f3321a);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "input_method".equals(str) ? this.f3321a : super.getSystemService(str);
        }
    }

    private static class d extends ContextWrapper {

        /* renamed from: a, reason: collision with root package name */
        private final f f3322a;

        /* renamed from: b, reason: collision with root package name */
        private WindowManager f3323b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f3324c;

        d(Context context, f fVar, Context context2) {
            super(context);
            this.f3322a = fVar;
            this.f3324c = context2;
        }

        private WindowManager a() {
            if (this.f3323b == null) {
                this.f3323b = this.f3322a.b();
            }
            return this.f3323b;
        }

        private boolean b() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i2 = 0; i2 < stackTrace.length && i2 < 11; i2++) {
                if (stackTrace[i2].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i2].getMethodName().equals("<init>")) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "window".equals(str) ? b() ? this.f3324c.getSystemService(str) : a() : super.getSystemService(str);
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        private i f3325a;

        /* renamed from: b, reason: collision with root package name */
        private f f3326b;

        /* renamed from: c, reason: collision with root package name */
        private b f3327c;

        e() {
        }
    }

    static class f implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final WindowManager f3328a;

        /* renamed from: b, reason: collision with root package name */
        b f3329b;

        f(WindowManager windowManager, b bVar) {
            this.f3328a = windowManager;
            this.f3329b = bVar;
        }

        private void a(Object[] objArr) {
            b bVar = this.f3329b;
            if (bVar == null) {
                n0.b.g(SingleViewPresentation.TAG, "Embedded view called addView while detached from presentation");
            } else {
                bVar.addView((View) objArr[0], (WindowManager.LayoutParams) objArr[1]);
            }
        }

        private void c(Object[] objArr) {
            b bVar = this.f3329b;
            if (bVar == null) {
                n0.b.g(SingleViewPresentation.TAG, "Embedded view called removeView while detached from presentation");
            } else {
                bVar.removeView((View) objArr[0]);
            }
        }

        private void d(Object[] objArr) {
            if (this.f3329b == null) {
                n0.b.g(SingleViewPresentation.TAG, "Embedded view called removeViewImmediate while detached from presentation");
                return;
            }
            View view = (View) objArr[0];
            view.clearAnimation();
            this.f3329b.removeView(view);
        }

        private void e(Object[] objArr) {
            b bVar = this.f3329b;
            if (bVar == null) {
                n0.b.g(SingleViewPresentation.TAG, "Embedded view called updateViewLayout while detached from presentation");
            } else {
                bVar.updateViewLayout((View) objArr[0], (WindowManager.LayoutParams) objArr[1]);
            }
        }

        public WindowManager b() {
            return (WindowManager) Proxy.newProxyInstance(WindowManager.class.getClassLoader(), new Class[]{WindowManager.class}, this);
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            name.hashCode();
            switch (name) {
                case "addView":
                    a(objArr);
                    return null;
                case "removeViewImmediate":
                    d(objArr);
                    return null;
                case "updateViewLayout":
                    e(objArr);
                    return null;
                case "removeView":
                    c(objArr);
                    return null;
                default:
                    try {
                        return method.invoke(this.f3328a, objArr);
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
            }
        }
    }

    public SingleViewPresentation(Context context, Display display, io.flutter.plugin.platform.a aVar, e eVar, View.OnFocusChangeListener onFocusChangeListener, boolean z2) {
        super(new c(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.state = eVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z2;
    }

    public SingleViewPresentation(Context context, Display display, i iVar, io.flutter.plugin.platform.a aVar, int i2, View.OnFocusChangeListener onFocusChangeListener) {
        super(new c(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i2;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        e eVar = new e();
        this.state = eVar;
        eVar.f3325a = iVar;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public e detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        a aVar = this.rootView;
        if (aVar != null) {
            aVar.removeAllViews();
        }
        return this.state;
    }

    public i getView() {
        return this.state.f3325a;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (this.state.f3327c == null) {
            this.state.f3327c = new b(getContext());
        }
        if (this.state.f3326b == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            e eVar = this.state;
            eVar.f3326b = new f(windowManager, eVar.f3327c);
        }
        this.container = new FrameLayout(getContext());
        d dVar = new d(getContext(), this.state.f3326b, this.outerContext);
        View c3 = this.state.f3325a.c();
        if (c3.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) c3.getContext()).setBaseContext(dVar);
        } else {
            n0.b.g(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(c3);
        a aVar = new a(getContext(), this.accessibilityEventsDelegate, c3);
        this.rootView = aVar;
        aVar.addView(this.container);
        this.rootView.addView(this.state.f3327c);
        c3.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            c3.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }
}
