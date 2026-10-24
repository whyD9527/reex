package io.flutter.plugin.platform;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;

@TargetApi(23)
/* loaded from: classes.dex */
public class n extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    private int f3355e;

    /* renamed from: f, reason: collision with root package name */
    private int f3356f;

    /* renamed from: g, reason: collision with root package name */
    private int f3357g;

    /* renamed from: h, reason: collision with root package name */
    private int f3358h;

    /* renamed from: i, reason: collision with root package name */
    private io.flutter.embedding.android.c f3359i;

    /* renamed from: j, reason: collision with root package name */
    private m f3360j;

    /* renamed from: k, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalFocusChangeListener f3361k;

    class a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f3362e;

        a(View.OnFocusChangeListener onFocusChangeListener) {
            this.f3362e = onFocusChangeListener;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f3362e;
            n nVar = n.this;
            onFocusChangeListener.onFocusChange(nVar, f1.i.d(nVar));
        }
    }

    public n(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    public n(Context context, m mVar) {
        this(context);
        this.f3360j = mVar;
    }

    public void a() {
        m mVar = this.f3360j;
        if (mVar != null) {
            mVar.release();
            this.f3360j = null;
        }
    }

    public void b(int i2, int i3) {
        m mVar = this.f3360j;
        if (mVar != null) {
            mVar.a(i2, i3);
        }
    }

    public void c() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.f3361k) == null) {
            return;
        }
        this.f3361k = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void draw(Canvas canvas) {
        m mVar = this.f3360j;
        if (mVar == null) {
            super.draw(canvas);
            n0.b.b("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Canvas lockHardwareCanvas = mVar.lockHardwareCanvas();
        if (lockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(lockHardwareCanvas);
        } finally {
            this.f3360j.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f3361k;
    }

    public int getRenderTargetHeight() {
        m mVar = this.f3360j;
        if (mVar != null) {
            return mVar.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        m mVar = this.f3360j;
        if (mVar != null) {
            return mVar.getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"NewApi"})
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
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
        if (this.f3359i == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i3 = this.f3357g;
            this.f3355e = i3;
            i2 = this.f3358h;
            this.f3356f = i2;
            f2 = i3;
        } else {
            if (action == 2) {
                matrix.postTranslate(this.f3355e, this.f3356f);
                this.f3355e = this.f3357g;
                this.f3356f = this.f3358h;
                return this.f3359i.l(motionEvent, matrix);
            }
            f2 = this.f3357g;
            i2 = this.f3358h;
        }
        matrix.postTranslate(f2, i2);
        return this.f3359i.l(motionEvent, matrix);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams((ViewGroup.LayoutParams) layoutParams);
        this.f3357g = layoutParams.leftMargin;
        this.f3358h = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        c();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f3361k == null) {
            a aVar = new a(onFocusChangeListener);
            this.f3361k = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }

    public void setTouchProcessor(io.flutter.embedding.android.c cVar) {
        this.f3359i = cVar;
    }
}
