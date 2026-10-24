package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.view.TextureRegistry;

@TargetApi(29)
/* loaded from: classes.dex */
public class b implements m {

    /* renamed from: a, reason: collision with root package name */
    private TextureRegistry.ImageTextureEntry f3331a;

    /* renamed from: b, reason: collision with root package name */
    private ImageReader f3332b;

    /* renamed from: c, reason: collision with root package name */
    private int f3333c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f3334d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f3335e = new Handler();

    /* renamed from: f, reason: collision with root package name */
    private final ImageReader.OnImageAvailableListener f3336f = new a();

    class a implements ImageReader.OnImageAvailableListener {
        a() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image image;
            try {
                image = imageReader.acquireLatestImage();
            } catch (IllegalStateException e3) {
                n0.b.b("ImageReaderPlatformViewRenderTarget", "onImageAvailable acquireLatestImage failed: " + e3.toString());
                image = null;
            }
            if (image == null) {
                return;
            }
            b.this.f3331a.pushImage(image);
        }
    }

    public b(TextureRegistry.ImageTextureEntry imageTextureEntry) {
        if (Build.VERSION.SDK_INT < 29) {
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        this.f3331a = imageTextureEntry;
    }

    private void c() {
        if (this.f3332b != null) {
            this.f3331a.pushImage(null);
            this.f3332b.close();
            this.f3332b = null;
        }
    }

    @Override // io.flutter.plugin.platform.m
    public void a(int i2, int i3) {
        if (this.f3332b != null && this.f3333c == i2 && this.f3334d == i3) {
            return;
        }
        c();
        this.f3333c = i2;
        this.f3334d = i3;
        this.f3332b = d();
    }

    protected ImageReader d() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            return f();
        }
        if (i2 >= 29) {
            return e();
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    @TargetApi(29)
    protected ImageReader e() {
        ImageReader newInstance;
        newInstance = ImageReader.newInstance(this.f3333c, this.f3334d, 34, 4, 256L);
        newInstance.setOnImageAvailableListener(this.f3336f, this.f3335e);
        return newInstance;
    }

    @TargetApi(33)
    protected ImageReader f() {
        ImageReader.Builder builder = new ImageReader.Builder(this.f3333c, this.f3334d);
        builder.setMaxImages(4);
        builder.setImageFormat(34);
        builder.setUsage(256L);
        ImageReader build = builder.build();
        build.setOnImageAvailableListener(this.f3336f, this.f3335e);
        return build;
    }

    @Override // io.flutter.plugin.platform.m
    public int getHeight() {
        return this.f3334d;
    }

    @Override // io.flutter.plugin.platform.m
    public long getId() {
        return this.f3331a.id();
    }

    @Override // io.flutter.plugin.platform.m
    public Surface getSurface() {
        return this.f3332b.getSurface();
    }

    @Override // io.flutter.plugin.platform.m
    public int getWidth() {
        return this.f3333c;
    }

    @Override // io.flutter.plugin.platform.m
    public Canvas lockHardwareCanvas() {
        return getSurface().lockHardwareCanvas();
    }

    @Override // io.flutter.plugin.platform.m
    public void release() {
        c();
        this.f3331a = null;
    }

    @Override // io.flutter.plugin.platform.m
    public void unlockCanvasAndPost(Canvas canvas) {
        getSurface().unlockCanvasAndPost(canvas);
    }
}
