package io.flutter.embedding.engine.renderer;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Keep;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class FlutterRenderer implements TextureRegistry {

    /* renamed from: a, reason: collision with root package name */
    private final FlutterJNI f3191a;

    /* renamed from: c, reason: collision with root package name */
    private Surface f3193c;

    /* renamed from: h, reason: collision with root package name */
    private final io.flutter.embedding.engine.renderer.a f3198h;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f3192b = new AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    private boolean f3194d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f3195e = 0;

    /* renamed from: f, reason: collision with root package name */
    private Handler f3196f = new Handler();

    /* renamed from: g, reason: collision with root package name */
    private final Set<WeakReference<TextureRegistry.b>> f3197g = new HashSet();

    @Keep
    @TargetApi(29)
    final class ImageReaderSurfaceProducer implements TextureRegistry.SurfaceProducer, TextureRegistry.ImageConsumer {
        private static final int MAX_IMAGES = 4;
        private static final String TAG = "ImageReaderSurfaceProducer";
        private ImageReader activeReader;
        private final long id;
        private b lastConsumedImage;
        private b lastProducedImage;
        private boolean released;
        private boolean ignoringFence = false;
        private int requestedWidth = 0;
        private int requestedHeight = 0;
        private final Set<ImageReader> readersToClose = new HashSet();
        private final Handler onImageAvailableHandler = new Handler();
        private final ImageReader.OnImageAvailableListener onImageAvailableListener = new a();

        class a implements ImageReader.OnImageAvailableListener {
            a() {
            }

            @Override // android.media.ImageReader.OnImageAvailableListener
            public void onImageAvailable(ImageReader imageReader) {
                Image image;
                try {
                    image = imageReader.acquireLatestImage();
                } catch (IllegalStateException e3) {
                    n0.b.b(ImageReaderSurfaceProducer.TAG, "onImageAvailable acquireLatestImage failed: " + e3.toString());
                    image = null;
                }
                if (image == null) {
                    return;
                }
                ImageReaderSurfaceProducer imageReaderSurfaceProducer = ImageReaderSurfaceProducer.this;
                imageReaderSurfaceProducer.onImage(imageReaderSurfaceProducer.new b(imageReader, image));
            }
        }

        private class b {

            /* renamed from: a, reason: collision with root package name */
            public final ImageReader f3200a;

            /* renamed from: b, reason: collision with root package name */
            public final Image f3201b;

            public b(ImageReader imageReader, Image image) {
                this.f3200a = imageReader;
                this.f3201b = image;
            }

            public void a() {
                this.f3201b.close();
                ImageReaderSurfaceProducer.this.maybeCloseReader(this.f3200a);
            }
        }

        ImageReaderSurfaceProducer(long j2) {
            this.id = j2;
        }

        private ImageReader createImageReader() {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 33) {
                return createImageReader33();
            }
            if (i2 >= 29) {
                return createImageReader29();
            }
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }

        @TargetApi(29)
        private ImageReader createImageReader29() {
            ImageReader newInstance;
            newInstance = ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 4, 256L);
            newInstance.setOnImageAvailableListener(this.onImageAvailableListener, this.onImageAvailableHandler);
            return newInstance;
        }

        @TargetApi(33)
        private ImageReader createImageReader33() {
            ImageReader.Builder builder = new ImageReader.Builder(this.requestedWidth, this.requestedHeight);
            builder.setMaxImages(4);
            builder.setImageFormat(34);
            builder.setUsage(256L);
            ImageReader build = builder.build();
            build.setOnImageAvailableListener(this.onImageAvailableListener, this.onImageAvailableHandler);
            return build;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void maybeCloseReader(ImageReader imageReader) {
            synchronized (this) {
                if (this.readersToClose.contains(imageReader)) {
                    b bVar = this.lastConsumedImage;
                    if (bVar == null || bVar.f3200a != imageReader) {
                        b bVar2 = this.lastProducedImage;
                        if (bVar2 == null || bVar2.f3200a != imageReader) {
                            this.readersToClose.remove(imageReader);
                            imageReader.close();
                        }
                    }
                }
            }
        }

        private void maybeCreateReader() {
            synchronized (this) {
                if (this.activeReader != null) {
                    return;
                }
                this.activeReader = createImageReader();
            }
        }

        private void maybeWaitOnFence(Image image) {
            boolean z2;
            if (image == null || (z2 = this.ignoringFence)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                if (z2) {
                    return;
                }
                this.ignoringFence = true;
                n0.b.g(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onImage(b bVar) {
            if (this.released) {
                return;
            }
            synchronized (this) {
                if (this.readersToClose.contains(bVar.f3200a)) {
                    n0.b.e(TAG, "Skipped frame because resize is in flight.");
                    bVar.a();
                    return;
                }
                b bVar2 = this.lastProducedImage;
                this.lastProducedImage = bVar;
                if (bVar2 != null) {
                    n0.b.e(TAG, "Dropping rendered frame that was not acquired in time.");
                    bVar2.a();
                }
                FlutterRenderer.this.p(this.id);
            }
        }

        private void releaseInternal() {
            this.released = true;
            b bVar = this.lastProducedImage;
            if (bVar != null) {
                bVar.a();
                this.lastProducedImage = null;
            }
            b bVar2 = this.lastConsumedImage;
            if (bVar2 != null) {
                bVar2.a();
                this.lastConsumedImage = null;
            }
            Iterator<ImageReader> it = this.readersToClose.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.readersToClose.clear();
            ImageReader imageReader = this.activeReader;
            if (imageReader != null) {
                imageReader.close();
                this.activeReader = null;
            }
        }

        @TargetApi(33)
        private void waitOnFence(Image image) {
            try {
                if (image.getFence().awaitForever()) {
                    return;
                }
                n0.b.b(TAG, "acquireLatestImage image's fence was never signalled.");
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        @TargetApi(29)
        public Image acquireLatestImage() {
            b bVar;
            b bVar2;
            synchronized (this) {
                bVar = this.lastProducedImage;
                this.lastProducedImage = null;
                bVar2 = this.lastConsumedImage;
                this.lastConsumedImage = bVar;
            }
            if (bVar2 != null) {
                bVar2.a();
            }
            if (bVar == null) {
                return null;
            }
            maybeWaitOnFence(bVar.f3201b);
            return bVar.f3201b;
        }

        public void disableFenceForTest() {
            this.ignoringFence = true;
        }

        protected void finalize() {
            try {
                if (this.released) {
                    return;
                }
                releaseInternal();
                FlutterRenderer.this.f3196f.post(new f(this.id, FlutterRenderer.this.f3191a));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getHeight() {
            return this.requestedHeight;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public Surface getSurface() {
            maybeCreateReader();
            return this.activeReader.getSurface();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getWidth() {
            return this.requestedWidth;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer, io.flutter.view.TextureRegistry.ImageConsumer
        public long id() {
            return this.id;
        }

        public int readersToCloseSize() {
            return this.readersToClose.size();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer, io.flutter.view.TextureRegistry.ImageConsumer
        public void release() {
            if (this.released) {
                return;
            }
            releaseInternal();
            FlutterRenderer.this.C(this.id);
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setSize(int i2, int i3) {
            if (this.requestedWidth == i2 && this.requestedHeight == i3) {
                return;
            }
            this.requestedHeight = i3;
            this.requestedWidth = i2;
            synchronized (this) {
                ImageReader imageReader = this.activeReader;
                if (imageReader != null) {
                    this.readersToClose.add(imageReader);
                    this.activeReader = null;
                }
            }
        }
    }

    @Keep
    final class ImageTextureRegistryEntry implements TextureRegistry.ImageTextureEntry, TextureRegistry.ImageConsumer {
        private static final String TAG = "ImageTextureRegistryEntry";
        private final long id;
        private boolean ignoringFence = false;
        private Image image;
        private boolean released;

        ImageTextureRegistryEntry(long j2) {
            this.id = j2;
        }

        @TargetApi(29)
        private void maybeWaitOnFence(Image image) {
            boolean z2;
            if (image == null || (z2 = this.ignoringFence)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                if (z2) {
                    return;
                }
                this.ignoringFence = true;
                n0.b.g(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        @TargetApi(33)
        private void waitOnFence(Image image) {
            try {
                if (image.getFence().awaitForever()) {
                    return;
                }
                n0.b.b(TAG, "acquireLatestImage image's fence was never signalled.");
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        @TargetApi(29)
        public Image acquireLatestImage() {
            Image image;
            synchronized (this) {
                image = this.image;
                this.image = null;
            }
            maybeWaitOnFence(image);
            return image;
        }

        @TargetApi(19)
        protected void finalize() {
            try {
                if (this.released) {
                    return;
                }
                Image image = this.image;
                if (image != null) {
                    image.close();
                    this.image = null;
                }
                this.released = true;
                FlutterRenderer.this.f3196f.post(new f(this.id, FlutterRenderer.this.f3191a));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry, io.flutter.view.TextureRegistry.ImageConsumer
        public long id() {
            return this.id;
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        @TargetApi(19)
        public void pushImage(Image image) {
            Image image2;
            if (this.released) {
                return;
            }
            synchronized (this) {
                image2 = this.image;
                this.image = image;
            }
            if (image2 != null) {
                n0.b.b(TAG, "Dropping PlatformView Frame");
                image2.close();
            }
            if (image != null) {
                FlutterRenderer.this.p(this.id);
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry, io.flutter.view.TextureRegistry.ImageConsumer
        @TargetApi(19)
        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            Image image = this.image;
            if (image != null) {
                image.close();
                this.image = null;
            }
            FlutterRenderer.this.C(this.id);
        }
    }

    class a implements io.flutter.embedding.engine.renderer.a {
        a() {
        }

        @Override // io.flutter.embedding.engine.renderer.a
        public void c() {
            FlutterRenderer.this.f3194d = false;
        }

        @Override // io.flutter.embedding.engine.renderer.a
        public void f() {
            FlutterRenderer.this.f3194d = true;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f3204a;

        /* renamed from: b, reason: collision with root package name */
        public final d f3205b;

        /* renamed from: c, reason: collision with root package name */
        public final c f3206c;

        public b(Rect rect, d dVar) {
            this.f3204a = rect;
            this.f3205b = dVar;
            this.f3206c = c.UNKNOWN;
        }

        public b(Rect rect, d dVar, c cVar) {
            this.f3204a = rect;
            this.f3205b = dVar;
            this.f3206c = cVar;
        }
    }

    public enum c {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);


        /* renamed from: e, reason: collision with root package name */
        public final int f3211e;

        c(int i2) {
            this.f3211e = i2;
        }
    }

    public enum d {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);


        /* renamed from: e, reason: collision with root package name */
        public final int f3217e;

        d(int i2) {
            this.f3217e = i2;
        }
    }

    final class e implements TextureRegistry.SurfaceTextureEntry, TextureRegistry.b {

        /* renamed from: a, reason: collision with root package name */
        private final long f3218a;

        /* renamed from: b, reason: collision with root package name */
        private final SurfaceTextureWrapper f3219b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f3220c;

        /* renamed from: d, reason: collision with root package name */
        private TextureRegistry.b f3221d;

        /* renamed from: e, reason: collision with root package name */
        private TextureRegistry.a f3222e;

        /* renamed from: f, reason: collision with root package name */
        private final Runnable f3223f;

        /* renamed from: g, reason: collision with root package name */
        private SurfaceTexture.OnFrameAvailableListener f3224g;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (e.this.f3222e != null) {
                    e.this.f3222e.a();
                }
            }
        }

        class b implements SurfaceTexture.OnFrameAvailableListener {
            b() {
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (e.this.f3220c || !FlutterRenderer.this.f3191a.isAttached()) {
                    return;
                }
                e eVar = e.this;
                FlutterRenderer.this.p(eVar.f3218a);
            }
        }

        e(long j2, SurfaceTexture surfaceTexture) {
            a aVar = new a();
            this.f3223f = aVar;
            this.f3224g = new b();
            this.f3218a = j2;
            this.f3219b = new SurfaceTextureWrapper(surfaceTexture, aVar);
            surfaceTexture().setOnFrameAvailableListener(this.f3224g, new Handler());
        }

        private void d() {
            FlutterRenderer.this.v(this);
        }

        public SurfaceTextureWrapper e() {
            return this.f3219b;
        }

        protected void finalize() {
            try {
                if (this.f3220c) {
                    return;
                }
                FlutterRenderer.this.f3196f.post(new f(this.f3218a, FlutterRenderer.this.f3191a));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public long id() {
            return this.f3218a;
        }

        @Override // io.flutter.view.TextureRegistry.b
        public void onTrimMemory(int i2) {
            TextureRegistry.b bVar = this.f3221d;
            if (bVar != null) {
                bVar.onTrimMemory(i2);
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void release() {
            if (this.f3220c) {
                return;
            }
            n0.b.f("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f3218a + ").");
            this.f3219b.release();
            FlutterRenderer.this.C(this.f3218a);
            d();
            this.f3220c = true;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void setOnFrameConsumedListener(TextureRegistry.a aVar) {
            this.f3222e = aVar;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void setOnTrimMemoryListener(TextureRegistry.b bVar) {
            this.f3221d = bVar;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public SurfaceTexture surfaceTexture() {
            return this.f3219b.surfaceTexture();
        }
    }

    static final class f implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private final long f3228e;

        /* renamed from: f, reason: collision with root package name */
        private final FlutterJNI f3229f;

        f(long j2, FlutterJNI flutterJNI) {
            this.f3228e = j2;
            this.f3229f = flutterJNI;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3229f.isAttached()) {
                n0.b.f("FlutterRenderer", "Releasing a Texture (" + this.f3228e + ").");
                this.f3229f.unregisterTexture(this.f3228e);
            }
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public float f3230a = 1.0f;

        /* renamed from: b, reason: collision with root package name */
        public int f3231b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f3232c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f3233d = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f3234e = 0;

        /* renamed from: f, reason: collision with root package name */
        public int f3235f = 0;

        /* renamed from: g, reason: collision with root package name */
        public int f3236g = 0;

        /* renamed from: h, reason: collision with root package name */
        public int f3237h = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f3238i = 0;

        /* renamed from: j, reason: collision with root package name */
        public int f3239j = 0;

        /* renamed from: k, reason: collision with root package name */
        public int f3240k = 0;

        /* renamed from: l, reason: collision with root package name */
        public int f3241l = 0;

        /* renamed from: m, reason: collision with root package name */
        public int f3242m = 0;

        /* renamed from: n, reason: collision with root package name */
        public int f3243n = 0;

        /* renamed from: o, reason: collision with root package name */
        public int f3244o = 0;

        /* renamed from: p, reason: collision with root package name */
        public int f3245p = -1;

        /* renamed from: q, reason: collision with root package name */
        public List<b> f3246q = new ArrayList();

        boolean a() {
            return this.f3231b > 0 && this.f3232c > 0 && this.f3230a > 0.0f;
        }
    }

    public FlutterRenderer(FlutterJNI flutterJNI) {
        a aVar = new a();
        this.f3198h = aVar;
        this.f3191a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(long j2) {
        this.f3191a.unregisterTexture(j2);
    }

    private void l() {
        Iterator<WeakReference<TextureRegistry.b>> it = this.f3197g.iterator();
        while (it.hasNext()) {
            if (it.next().get() == null) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(long j2) {
        this.f3191a.markTextureFrameAvailable(j2);
    }

    private void r(long j2, TextureRegistry.ImageConsumer imageConsumer) {
        this.f3191a.registerImageTexture(j2, imageConsumer);
    }

    private void t(long j2, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f3191a.registerTexture(j2, surfaceTextureWrapper);
    }

    public void A(int i2, int i3) {
        this.f3191a.onSurfaceChanged(i2, i3);
    }

    public void B(Surface surface) {
        this.f3193c = surface;
        this.f3191a.onSurfaceWindowChanged(surface);
    }

    @Override // io.flutter.view.TextureRegistry
    public TextureRegistry.ImageTextureEntry a() {
        ImageTextureRegistryEntry imageTextureRegistryEntry = new ImageTextureRegistryEntry(this.f3192b.getAndIncrement());
        n0.b.f("FlutterRenderer", "New ImageTextureEntry ID: " + imageTextureRegistryEntry.id());
        r(imageTextureRegistryEntry.id(), imageTextureRegistryEntry);
        return imageTextureRegistryEntry;
    }

    @Override // io.flutter.view.TextureRegistry
    public TextureRegistry.SurfaceProducer b() {
        ImageReaderSurfaceProducer imageReaderSurfaceProducer = new ImageReaderSurfaceProducer(this.f3192b.getAndIncrement());
        n0.b.f("FlutterRenderer", "New SurfaceProducer ID: " + imageReaderSurfaceProducer.id());
        r(imageReaderSurfaceProducer.id(), imageReaderSurfaceProducer);
        return imageReaderSurfaceProducer;
    }

    @Override // io.flutter.view.TextureRegistry
    public TextureRegistry.SurfaceTextureEntry c() {
        n0.b.f("FlutterRenderer", "Creating a SurfaceTexture.");
        return s(new SurfaceTexture(0));
    }

    public void d(boolean z2) {
        this.f3195e = z2 ? this.f3195e + 1 : this.f3195e - 1;
        this.f3191a.SetIsRenderingToImageView(this.f3195e > 0);
    }

    public void j(io.flutter.embedding.engine.renderer.a aVar) {
        this.f3191a.addIsDisplayingFlutterUiListener(aVar);
        if (this.f3194d) {
            aVar.f();
        }
    }

    void k(TextureRegistry.b bVar) {
        l();
        this.f3197g.add(new WeakReference<>(bVar));
    }

    public void m(ByteBuffer byteBuffer, int i2) {
        this.f3191a.dispatchPointerDataPacket(byteBuffer, i2);
    }

    public boolean n() {
        return this.f3194d;
    }

    public boolean o() {
        return this.f3191a.getIsSoftwareRenderingEnabled();
    }

    public void q(int i2) {
        Iterator<WeakReference<TextureRegistry.b>> it = this.f3197g.iterator();
        while (it.hasNext()) {
            TextureRegistry.b bVar = it.next().get();
            if (bVar != null) {
                bVar.onTrimMemory(i2);
            } else {
                it.remove();
            }
        }
    }

    public TextureRegistry.SurfaceTextureEntry s(SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        e eVar = new e(this.f3192b.getAndIncrement(), surfaceTexture);
        n0.b.f("FlutterRenderer", "New SurfaceTexture ID: " + eVar.id());
        t(eVar.id(), eVar.e());
        k(eVar);
        return eVar;
    }

    public void u(io.flutter.embedding.engine.renderer.a aVar) {
        this.f3191a.removeIsDisplayingFlutterUiListener(aVar);
    }

    void v(TextureRegistry.b bVar) {
        for (WeakReference<TextureRegistry.b> weakReference : this.f3197g) {
            if (weakReference.get() == bVar) {
                this.f3197g.remove(weakReference);
                return;
            }
        }
    }

    public void w(boolean z2) {
        this.f3191a.setSemanticsEnabled(z2);
    }

    public void x(g gVar) {
        if (gVar.a()) {
            n0.b.f("FlutterRenderer", "Setting viewport metrics\nSize: " + gVar.f3231b + " x " + gVar.f3232c + "\nPadding - L: " + gVar.f3236g + ", T: " + gVar.f3233d + ", R: " + gVar.f3234e + ", B: " + gVar.f3235f + "\nInsets - L: " + gVar.f3240k + ", T: " + gVar.f3237h + ", R: " + gVar.f3238i + ", B: " + gVar.f3239j + "\nSystem Gesture Insets - L: " + gVar.f3244o + ", T: " + gVar.f3241l + ", R: " + gVar.f3242m + ", B: " + gVar.f3242m + "\nDisplay Features: " + gVar.f3246q.size());
            int[] iArr = new int[gVar.f3246q.size() * 4];
            int[] iArr2 = new int[gVar.f3246q.size()];
            int[] iArr3 = new int[gVar.f3246q.size()];
            for (int i2 = 0; i2 < gVar.f3246q.size(); i2++) {
                b bVar = gVar.f3246q.get(i2);
                int i3 = i2 * 4;
                Rect rect = bVar.f3204a;
                iArr[i3] = rect.left;
                iArr[i3 + 1] = rect.top;
                iArr[i3 + 2] = rect.right;
                iArr[i3 + 3] = rect.bottom;
                iArr2[i2] = bVar.f3205b.f3217e;
                iArr3[i2] = bVar.f3206c.f3211e;
            }
            this.f3191a.setViewportMetrics(gVar.f3230a, gVar.f3231b, gVar.f3232c, gVar.f3233d, gVar.f3234e, gVar.f3235f, gVar.f3236g, gVar.f3237h, gVar.f3238i, gVar.f3239j, gVar.f3240k, gVar.f3241l, gVar.f3242m, gVar.f3243n, gVar.f3244o, gVar.f3245p, iArr, iArr2, iArr3);
        }
    }

    public void y(Surface surface, boolean z2) {
        if (!z2) {
            z();
        }
        this.f3193c = surface;
        if (z2) {
            this.f3191a.onSurfaceWindowChanged(surface);
        } else {
            this.f3191a.onSurfaceCreated(surface);
        }
    }

    public void z() {
        if (this.f3193c != null) {
            this.f3191a.onSurfaceDestroyed();
            if (this.f3194d) {
                this.f3198h.c();
            }
            this.f3194d = false;
            this.f3193c = null;
        }
    }
}
