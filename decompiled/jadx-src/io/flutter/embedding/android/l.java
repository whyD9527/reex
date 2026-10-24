package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

/* loaded from: classes.dex */
public class l extends SurfaceView implements io.flutter.embedding.engine.renderer.b {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f3037e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3038f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3039g;

    /* renamed from: h, reason: collision with root package name */
    private FlutterRenderer f3040h;

    /* renamed from: i, reason: collision with root package name */
    private final SurfaceHolder.Callback f3041i;

    /* renamed from: j, reason: collision with root package name */
    private final io.flutter.embedding.engine.renderer.a f3042j;

    class a implements SurfaceHolder.Callback {
        a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            n0.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (l.this.o()) {
                l.this.k(i3, i4);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            n0.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            l.this.f3038f = true;
            if (l.this.o()) {
                l.this.l();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            n0.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            l.this.f3038f = false;
            if (l.this.o()) {
                l.this.m();
            }
        }
    }

    class b implements io.flutter.embedding.engine.renderer.a {
        b() {
        }

        @Override // io.flutter.embedding.engine.renderer.a
        public void c() {
        }

        @Override // io.flutter.embedding.engine.renderer.a
        public void f() {
            n0.b.f("FlutterSurfaceView", "onFlutterUiDisplayed()");
            l.this.setAlpha(1.0f);
            if (l.this.f3040h != null) {
                l.this.f3040h.u(this);
            }
        }
    }

    private l(Context context, AttributeSet attributeSet, boolean z2) {
        super(context, attributeSet);
        this.f3038f = false;
        this.f3039g = false;
        this.f3041i = new a();
        this.f3042j = new b();
        this.f3037e = z2;
        n();
    }

    public l(Context context, boolean z2) {
        this(context, null, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i2, int i3) {
        if (this.f3040h == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        n0.b.f("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i2 + " x " + i3);
        this.f3040h.A(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f3040h == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f3040h.y(getHolder().getSurface(), this.f3039g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        FlutterRenderer flutterRenderer = this.f3040h;
        if (flutterRenderer == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        flutterRenderer.z();
    }

    private void n() {
        if (this.f3037e) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f3041i);
        setAlpha(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        return (this.f3040h == null || this.f3039g) ? false : true;
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public void a() {
        if (this.f3040h == null) {
            n0.b.g("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            n0.b.f("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
            m();
        }
        b();
        setAlpha(0.0f);
        this.f3040h.u(this.f3042j);
        this.f3040h = null;
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public void b() {
        if (this.f3040h == null) {
            n0.b.g("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f3039g = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public void c() {
        FlutterRenderer flutterRenderer = this.f3040h;
        if (flutterRenderer == null) {
            n0.b.g("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        flutterRenderer.j(this.f3042j);
        if (this.f3038f) {
            n0.b.f("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            l();
        }
        this.f3039g = false;
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public void d(FlutterRenderer flutterRenderer) {
        n0.b.f("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f3040h != null) {
            n0.b.f("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f3040h.z();
            this.f3040h.u(this.f3042j);
        }
        this.f3040h = flutterRenderer;
        c();
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i2 = iArr[0];
        region.op(i2, iArr[1], (getRight() + i2) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public FlutterRenderer getAttachedRenderer() {
        return this.f3040h;
    }
}
