package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

/* loaded from: classes.dex */
public class m extends TextureView implements io.flutter.embedding.engine.renderer.b {

    /* renamed from: e, reason: collision with root package name */
    private boolean f3045e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3046f;

    /* renamed from: g, reason: collision with root package name */
    private FlutterRenderer f3047g;

    /* renamed from: h, reason: collision with root package name */
    private Surface f3048h;

    /* renamed from: i, reason: collision with root package name */
    private final TextureView.SurfaceTextureListener f3049i;

    class a implements TextureView.SurfaceTextureListener {
        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            n0.b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            m.this.f3045e = true;
            if (m.this.p()) {
                m.this.m();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            n0.b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            m.this.f3045e = false;
            if (m.this.p()) {
                m.this.n();
            }
            if (m.this.f3048h == null) {
                return true;
            }
            m.this.f3048h.release();
            m.this.f3048h = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            n0.b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (m.this.p()) {
                m.this.l(i2, i3);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public m(Context context) {
        this(context, null);
    }

    public m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3045e = false;
        this.f3046f = false;
        this.f3049i = new a();
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(int i2, int i3) {
        if (this.f3047g == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        n0.b.f("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i2 + " x " + i3);
        this.f3047g.A(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.f3047g == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f3048h;
        if (surface != null) {
            surface.release();
            this.f3048h = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f3048h = surface2;
        this.f3047g.y(surface2, this.f3046f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        FlutterRenderer flutterRenderer = this.f3047g;
        if (flutterRenderer == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        flutterRenderer.z();
        Surface surface = this.f3048h;
        if (surface != null) {
            surface.release();
            this.f3048h = null;
        }
    }

    private void o() {
        setSurfaceTextureListener(this.f3049i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        return (this.f3047g == null || this.f3046f) ? false : true;
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public void a() {
        if (this.f3047g == null) {
            n0.b.g("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            n0.b.f("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
            n();
        }
        b();
        this.f3047g = null;
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public void b() {
        if (this.f3047g == null) {
            n0.b.g("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f3046f = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public void c() {
        if (this.f3047g == null) {
            n0.b.g("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f3045e) {
            n0.b.f("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            m();
        }
        this.f3046f = false;
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public void d(FlutterRenderer flutterRenderer) {
        n0.b.f("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f3047g != null) {
            n0.b.f("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f3047g.z();
        }
        this.f3047g = flutterRenderer;
        c();
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public FlutterRenderer getAttachedRenderer() {
        return this.f3047g;
    }

    public void setRenderSurface(Surface surface) {
        this.f3048h = surface;
    }
}
