package r0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import f1.i;
import io.flutter.embedding.android.c;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import java.util.Iterator;

@TargetApi(19)
/* loaded from: classes.dex */
public class a extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    private FlutterMutatorsStack f4283e;

    /* renamed from: f, reason: collision with root package name */
    private float f4284f;

    /* renamed from: g, reason: collision with root package name */
    private int f4285g;

    /* renamed from: h, reason: collision with root package name */
    private int f4286h;

    /* renamed from: i, reason: collision with root package name */
    private int f4287i;

    /* renamed from: j, reason: collision with root package name */
    private int f4288j;

    /* renamed from: k, reason: collision with root package name */
    private final c f4289k;

    /* renamed from: l, reason: collision with root package name */
    ViewTreeObserver.OnGlobalFocusChangeListener f4290l;

    /* renamed from: r0.a$a, reason: collision with other inner class name */
    class ViewTreeObserverOnGlobalFocusChangeListenerC0063a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f4291e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f4292f;

        ViewTreeObserverOnGlobalFocusChangeListenerC0063a(View.OnFocusChangeListener onFocusChangeListener, View view) {
            this.f4291e = onFocusChangeListener;
            this.f4292f = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f4291e;
            View view3 = this.f4292f;
            onFocusChangeListener.onFocusChange(view3, i.d(view3));
        }
    }

    public a(Context context, float f2, c cVar) {
        super(context, null);
        this.f4284f = f2;
        this.f4289k = cVar;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f4283e.getFinalMatrix());
        float f2 = this.f4284f;
        matrix.preScale(1.0f / f2, 1.0f / f2);
        matrix.postTranslate(-this.f4285g, -this.f4286h);
        return matrix;
    }

    public void a(FlutterMutatorsStack flutterMutatorsStack, int i2, int i3, int i4, int i5) {
        this.f4283e = flutterMutatorsStack;
        this.f4285g = i2;
        this.f4286h = i3;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
        layoutParams.leftMargin = i2;
        layoutParams.topMargin = i3;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    public void b() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.f4290l) == null) {
            return;
        }
        this.f4290l = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        Iterator<Path> it = this.f4283e.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f4285g, -this.f4286h);
            canvas.clipPath(path);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        float f2;
        if (this.f4289k == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i3 = this.f4285g;
            this.f4287i = i3;
            i2 = this.f4286h;
            this.f4288j = i2;
            f2 = i3;
        } else {
            if (action == 2) {
                matrix.postTranslate(this.f4287i, this.f4288j);
                this.f4287i = this.f4285g;
                this.f4288j = this.f4286h;
                return this.f4289k.l(motionEvent, matrix);
            }
            f2 = this.f4285g;
            i2 = this.f4286h;
        }
        matrix.postTranslate(f2, i2);
        return this.f4289k.l(motionEvent, matrix);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f4290l == null) {
            ViewTreeObserverOnGlobalFocusChangeListenerC0063a viewTreeObserverOnGlobalFocusChangeListenerC0063a = new ViewTreeObserverOnGlobalFocusChangeListenerC0063a(onFocusChangeListener, this);
            this.f4290l = viewTreeObserverOnGlobalFocusChangeListenerC0063a;
            viewTreeObserver.addOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC0063a);
        }
    }
}
