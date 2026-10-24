package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.util.Locale;

@TargetApi(19)
/* loaded from: classes.dex */
public class k extends View implements io.flutter.embedding.engine.renderer.b {

    /* renamed from: e, reason: collision with root package name */
    private ImageReader f3027e;

    /* renamed from: f, reason: collision with root package name */
    private Image f3028f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f3029g;

    /* renamed from: h, reason: collision with root package name */
    private FlutterRenderer f3030h;

    /* renamed from: i, reason: collision with root package name */
    private b f3031i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f3032j;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3033a;

        static {
            int[] iArr = new int[b.values().length];
            f3033a = iArr;
            try {
                iArr[b.background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3033a[b.overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        background,
        overlay
    }

    public k(Context context, int i2, int i3, b bVar) {
        this(context, h(i2, i3), bVar);
    }

    k(Context context, ImageReader imageReader, b bVar) {
        super(context, null);
        this.f3032j = false;
        this.f3027e = imageReader;
        this.f3031i = bVar;
        i();
    }

    private void f() {
        Image image = this.f3028f;
        if (image != null) {
            image.close();
            this.f3028f = null;
        }
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(19)
    private static ImageReader h(int i2, int i3) {
        int i4;
        int i5;
        ImageReader newInstance;
        if (i2 <= 0) {
            j("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i2));
            i4 = 1;
        } else {
            i4 = i2;
        }
        if (i3 <= 0) {
            j("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i3));
            i5 = 1;
        } else {
            i5 = i3;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return ImageReader.newInstance(i4, i5, 1, 3);
        }
        newInstance = ImageReader.newInstance(i4, i5, 1, 3, 768L);
        return newInstance;
    }

    private void i() {
        setAlpha(0.0f);
    }

    private static void j(String str, Object... objArr) {
        n0.b.g("FlutterImageView", String.format(Locale.US, str, objArr));
    }

    @TargetApi(29)
    private void l() {
        HardwareBuffer hardwareBuffer;
        Bitmap wrapHardwareBuffer;
        if (Build.VERSION.SDK_INT >= 29) {
            hardwareBuffer = this.f3028f.getHardwareBuffer();
            wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            this.f3029g = wrapHardwareBuffer;
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f3028f.getPlanes();
        if (planes.length != 1) {
            return;
        }
        Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.f3028f.getHeight();
        Bitmap bitmap = this.f3029g;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.f3029g.getHeight() != height) {
            this.f3029g = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
        }
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        this.f3029g.copyPixelsFromBuffer(buffer);
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public void a() {
        if (this.f3032j) {
            setAlpha(0.0f);
            e();
            this.f3029g = null;
            f();
            invalidate();
            this.f3032j = false;
            if (this.f3031i == b.background) {
                this.f3030h.d(false);
            }
        }
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public void c() {
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public void d(FlutterRenderer flutterRenderer) {
        if (a.f3033a[this.f3031i.ordinal()] == 1) {
            flutterRenderer.B(this.f3027e.getSurface());
            flutterRenderer.d(true);
        }
        setAlpha(1.0f);
        this.f3030h = flutterRenderer;
        this.f3032j = true;
    }

    @TargetApi(19)
    public boolean e() {
        if (!this.f3032j) {
            return false;
        }
        Image acquireLatestImage = this.f3027e.acquireLatestImage();
        if (acquireLatestImage != null) {
            f();
            this.f3028f = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public void g() {
        this.f3027e.close();
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public FlutterRenderer getAttachedRenderer() {
        return this.f3030h;
    }

    public ImageReader getImageReader() {
        return this.f3027e;
    }

    public Surface getSurface() {
        return this.f3027e.getSurface();
    }

    public void k(int i2, int i3) {
        if (this.f3030h == null) {
            return;
        }
        if (i2 == this.f3027e.getWidth() && i3 == this.f3027e.getHeight()) {
            return;
        }
        f();
        g();
        this.f3027e = h(i2, i3);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3028f != null) {
            l();
        }
        Bitmap bitmap = this.f3029g;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (!(i2 == this.f3027e.getWidth() && i3 == this.f3027e.getHeight()) && this.f3031i == b.background && this.f3032j) {
            k(i2, i3);
            this.f3030h.B(this.f3027e.getSurface());
        }
    }
}
