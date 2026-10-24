package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import io.flutter.view.TextureRegistry;
import java.util.concurrent.atomic.AtomicLong;

@TargetApi(26)
/* loaded from: classes.dex */
public class x implements m {

    /* renamed from: b, reason: collision with root package name */
    private final TextureRegistry.SurfaceTextureEntry f3403b;

    /* renamed from: c, reason: collision with root package name */
    private SurfaceTexture f3404c;

    /* renamed from: d, reason: collision with root package name */
    private Surface f3405d;

    /* renamed from: g, reason: collision with root package name */
    private final TextureRegistry.a f3408g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3409h;

    /* renamed from: i, reason: collision with root package name */
    private final TextureRegistry.b f3410i;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f3402a = new AtomicLong(0);

    /* renamed from: e, reason: collision with root package name */
    private int f3406e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f3407f = 0;

    class a implements TextureRegistry.a {
        a() {
        }

        @Override // io.flutter.view.TextureRegistry.a
        public void a() {
            if (Build.VERSION.SDK_INT == 29) {
                x.this.f3402a.decrementAndGet();
            }
        }
    }

    class b implements TextureRegistry.b {
        b() {
        }

        @Override // io.flutter.view.TextureRegistry.b
        public void onTrimMemory(int i2) {
            if (i2 != 80 || Build.VERSION.SDK_INT < 29) {
                return;
            }
            x.this.f3409h = true;
        }
    }

    public x(TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
        a aVar = new a();
        this.f3408g = aVar;
        this.f3409h = false;
        b bVar = new b();
        this.f3410i = bVar;
        this.f3403b = surfaceTextureEntry;
        this.f3404c = surfaceTextureEntry.surfaceTexture();
        surfaceTextureEntry.setOnFrameConsumedListener(aVar);
        surfaceTextureEntry.setOnTrimMemoryListener(bVar);
        e();
    }

    private void e() {
        int i2;
        int i3 = this.f3406e;
        if (i3 > 0 && (i2 = this.f3407f) > 0) {
            this.f3404c.setDefaultBufferSize(i3, i2);
        }
        Surface surface = this.f3405d;
        if (surface != null) {
            surface.release();
            this.f3405d = null;
        }
        this.f3405d = d();
        Canvas lockHardwareCanvas = lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        } finally {
            unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    private void f() {
        if (Build.VERSION.SDK_INT == 29) {
            this.f3402a.incrementAndGet();
        }
    }

    private void g() {
        if (this.f3409h) {
            Surface surface = this.f3405d;
            if (surface != null) {
                surface.release();
                this.f3405d = null;
            }
            this.f3405d = d();
            this.f3409h = false;
        }
    }

    @Override // io.flutter.plugin.platform.m
    public void a(int i2, int i3) {
        this.f3406e = i2;
        this.f3407f = i3;
        SurfaceTexture surfaceTexture = this.f3404c;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i2, i3);
        }
    }

    protected Surface d() {
        return new Surface(this.f3404c);
    }

    @Override // io.flutter.plugin.platform.m
    public int getHeight() {
        return this.f3407f;
    }

    @Override // io.flutter.plugin.platform.m
    public long getId() {
        return this.f3403b.id();
    }

    @Override // io.flutter.plugin.platform.m
    public Surface getSurface() {
        g();
        return this.f3405d;
    }

    @Override // io.flutter.plugin.platform.m
    public int getWidth() {
        return this.f3406e;
    }

    @Override // io.flutter.plugin.platform.m
    public Canvas lockHardwareCanvas() {
        boolean isReleased;
        g();
        if (Build.VERSION.SDK_INT == 29 && this.f3402a.get() > 0) {
            return null;
        }
        SurfaceTexture surfaceTexture = this.f3404c;
        if (surfaceTexture != null) {
            isReleased = surfaceTexture.isReleased();
            if (!isReleased) {
                f();
                return this.f3405d.lockHardwareCanvas();
            }
        }
        n0.b.b("SurfaceTexturePlatformViewRenderTarget", "Invalid RenderTarget: null or already released SurfaceTexture");
        return null;
    }

    @Override // io.flutter.plugin.platform.m
    public void release() {
        this.f3404c = null;
        Surface surface = this.f3405d;
        if (surface != null) {
            surface.release();
            this.f3405d = null;
        }
    }

    @Override // io.flutter.plugin.platform.m
    public void unlockCanvasAndPost(Canvas canvas) {
        this.f3405d.unlockCanvasAndPost(canvas);
    }
}
