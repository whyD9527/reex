package io.flutter.embedding.engine;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.TypedValue;
import android.view.Surface;
import androidx.annotation.Keep;
import io.flutter.embedding.engine.a;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.plugin.platform.u;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry;
import io.flutter.view.f;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import y0.o;
import z0.q;

@Keep
/* loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static b asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private a accessibilityDelegate;
    private p0.a deferredComponentManager;
    private a1.b localizationPlugin;
    private Long nativeShellHolderId;
    private o0.f platformMessageHandler;
    private u platformViewsController;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<a.b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<io.flutter.embedding.engine.renderer.a> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    public interface a {
        void b(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr);

        void c(ByteBuffer byteBuffer, String[] strArr);
    }

    public interface b {
        void a(long j2);
    }

    public static class c {
        public FlutterJNI a() {
            return new FlutterJNI();
        }
    }

    private static void asyncWaitForVsync(long j2) {
        b bVar = asyncWaitForVsyncDelegate;
        if (bVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        bVar.a(j2);
    }

    public static Bitmap decodeImage(ByteBuffer byteBuffer, final long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new ImageDecoder.OnHeaderDecodedListener() { // from class: io.flutter.embedding.engine.f
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        FlutterJNI.lambda$decodeImage$0(j2, imageDecoder, imageInfo, source);
                    }
                });
            } catch (IOException e3) {
                n0.b.c(TAG, "Failed to decode image", e3);
            }
        }
        return null;
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    @Deprecated
    public static String getObservatoryUri() {
        return vmServiceUri;
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i2, ByteBuffer byteBuffer) {
        o0.f fVar = this.platformMessageHandler;
        if (fVar != null) {
            fVar.g(i2, byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$0(long j2, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        Size size = imageInfo.getSize();
        nativeImageHeaderCallback(j2, size.getWidth(), size.getHeight());
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j2);

    private native void nativeDeferredComponentInstallFailure(int i2, String str, boolean z2);

    private native void nativeDestroy(long j2);

    private native void nativeDispatchEmptyPlatformMessage(long j2, String str, int i2);

    private native void nativeDispatchPlatformMessage(long j2, String str, ByteBuffer byteBuffer, int i2, int i3);

    private native void nativeDispatchPointerDataPacket(long j2, ByteBuffer byteBuffer, int i2);

    private native void nativeDispatchSemanticsAction(long j2, int i2, int i3, ByteBuffer byteBuffer, int i4);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i2);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i2);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i2);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i2);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i2);

    private native Bitmap nativeGetBitmap(long j2);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j2, int i2, int i3);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j2);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j2, int i2);

    private native void nativeInvokePlatformMessageResponseCallback(long j2, int i2, ByteBuffer byteBuffer, int i3);

    private native void nativeLoadDartDeferredLibrary(long j2, int i2, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j2);

    private native void nativeMarkTextureFrameAvailable(long j2, long j3);

    private native void nativeNotifyLowMemoryWarning(long j2);

    private native void nativeOnVsync(long j2, long j3, long j4);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j2, long j3, WeakReference<TextureRegistry.ImageConsumer> weakReference);

    private native void nativeRegisterTexture(long j2, long j3, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j2, String str, String str2, String str3, AssetManager assetManager, List<String> list);

    private native void nativeSetAccessibilityFeatures(long j2, int i2);

    private native void nativeSetIsRenderingToImageView(long j2, boolean z2);

    private native void nativeSetSemanticsEnabled(long j2, boolean z2);

    private native void nativeSetViewportMetrics(long j2, float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j2, String str, String str2, String str3, List<String> list);

    private native void nativeSurfaceChanged(long j2, int i2, int i3);

    private native void nativeSurfaceCreated(long j2, Surface surface);

    private native void nativeSurfaceDestroyed(long j2);

    private native void nativeSurfaceWindowChanged(long j2, Surface surface);

    private native void nativeUnregisterTexture(long j2, long j3);

    private native void nativeUpdateDisplayMetrics(long j2);

    private native void nativeUpdateJavaAssetManager(long j2, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f2);

    private void onPreEngineRestart() {
        Iterator<a.b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        a aVar = this.accessibilityDelegate;
        if (aVar != null) {
            aVar.c(byteBuffer, strArr);
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        a aVar = this.accessibilityDelegate;
        if (aVar != null) {
            aVar.b(byteBuffer, strArr, byteBufferArr);
        }
    }

    public void SetIsRenderingToImageView(boolean z2) {
        nativeSetIsRenderingToImageView(this.nativeShellHolderId.longValue(), z2);
    }

    public void addEngineLifecycleListener(a.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.a aVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(aVar);
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j2) {
        nativeCleanupMessageData(j2);
    }

    public String[] computePlatformResolvedLocale(String[] strArr) {
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2 += 3) {
            String str = strArr[i2 + 0];
            String str2 = strArr[i2 + 1];
            String str3 = strArr[i2 + 2];
            Locale.Builder builder = new Locale.Builder();
            if (!str.isEmpty()) {
                builder.setLanguage(str);
            }
            if (!str2.isEmpty()) {
                builder.setRegion(str2);
            }
            if (!str3.isEmpty()) {
                builder.setScript(str3);
            }
            arrayList.add(builder.build());
        }
        Locale c3 = this.localizationPlugin.c(arrayList);
        return c3 == null ? new String[0] : new String[]{c3.getLanguage(), c3.getCountry(), c3.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        u uVar = this.platformViewsController;
        if (uVar != null) {
            return uVar.K();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public void deferredComponentInstallFailure(int i2, String str, boolean z2) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i2, str, z2);
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        uVar.N();
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i2);
            return;
        }
        n0.b.g(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i2);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i2, int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i2, i3);
            return;
        }
        n0.b.g(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i3);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i2);
    }

    public void dispatchSemanticsAction(int i2, int i3, ByteBuffer byteBuffer, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i2, i3, byteBuffer, i4);
    }

    public void dispatchSemanticsAction(int i2, f.g gVar) {
        dispatchSemanticsAction(i2, gVar, null);
    }

    public void dispatchSemanticsAction(int i2, f.g gVar, Object obj) {
        ByteBuffer byteBuffer;
        int i3;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = q.f4766a.a(obj);
            i3 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i3 = 0;
        }
        dispatchSemanticsAction(i2, gVar.f3507e, byteBuffer, i3);
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    public float getScaledFontSize(float f2, int i2) {
        DisplayMetrics b3 = o.b(i2);
        if (b3 != null) {
            return TypedValue.applyDimension(2, f2, b3) / b3.density;
        }
        n0.b.b(TAG, "getScaledFontSize called with configurationId " + String.valueOf(i2) + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i2, long j2) {
        o0.f fVar = this.platformMessageHandler;
        if (fVar != null) {
            fVar.h(str, byteBuffer, i2, j2);
        } else {
            nativeCleanupMessageData(j2);
        }
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j2) {
        if (initCalled) {
            n0.b.g(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j2);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i2) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i2);
            } else {
                n0.b.g(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i2);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    public void invokePlatformMessageResponseCallback(int i2, ByteBuffer byteBuffer, int i3) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i2, byteBuffer, i3);
            } else {
                n0.b.g(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i2);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i2) {
        return nativeFlutterTextUtilsIsEmoji(i2);
    }

    public boolean isCodePointEmojiModifier(int i2) {
        return nativeFlutterTextUtilsIsEmojiModifier(i2);
    }

    public boolean isCodePointEmojiModifierBase(int i2) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i2);
    }

    public boolean isCodePointRegionalIndicator(int i2) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i2);
    }

    public boolean isCodePointVariantSelector(int i2) {
        return nativeFlutterTextUtilsIsVariationSelector(i2);
    }

    public void loadDartDeferredLibrary(int i2, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i2, strArr);
    }

    public void loadLibrary() {
        if (loadLibraryCalled) {
            n0.b.g(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        System.loadLibrary("flutter");
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j2);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        uVar.h0();
    }

    public void onDisplayOverlaySurface(int i2, int i3, int i4, int i5, int i6) {
        ensureRunningOnMainThread();
        u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        uVar.j0(i2, i3, i4, i5, i6);
    }

    public void onDisplayPlatformView(int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        uVar.k0(i2, i3, i4, i5, i6, i7, i8, flutterMutatorsStack);
    }

    public void onEndFrame() {
        ensureRunningOnMainThread();
        u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        uVar.l0();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<io.flutter.embedding.engine.renderer.a> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<io.flutter.embedding.engine.renderer.a> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public void onSurfaceChanged(int i2, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i2, i3);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j2, long j3, long j4) {
        nativeOnVsync(j2, j3, j4);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            n0.b.g(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j2, TextureRegistry.ImageConsumer imageConsumer) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j2, new WeakReference<>(imageConsumer));
    }

    public void registerTexture(long j2, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j2, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(a.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.a aVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(aVar);
    }

    public void requestDartDeferredLibrary(int i2) {
        p0.a aVar = this.deferredComponentManager;
        if (aVar != null) {
            aVar.e(i2, null);
        } else {
            n0.b.b(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
        }
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list);
    }

    public void setAccessibilityDelegate(a aVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = aVar;
    }

    public void setAccessibilityFeatures(int i2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i2);
    }

    public void setAsyncWaitForVsyncDelegate(b bVar) {
        asyncWaitForVsyncDelegate = bVar;
    }

    public void setDeferredComponentManager(p0.a aVar) {
        ensureRunningOnMainThread();
        this.deferredComponentManager = aVar;
        if (aVar != null) {
            aVar.c(this);
        }
    }

    public void setLocalizationPlugin(a1.b bVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = bVar;
    }

    public void setPlatformMessageHandler(o0.f fVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = fVar;
    }

    public void setPlatformViewsController(u uVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = uVar;
    }

    public void setRefreshRateFPS(float f2) {
        refreshRateFPS = f2;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z2);
    }

    public void setViewportMetrics(float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f2, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, iArr, iArr2, iArr3);
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list);
        Long l2 = nativeSpawn.nativeShellHolderId;
        f1.d.a((l2 == null || l2.longValue() == 0) ? false : true, "Failed to spawn new JNI connected shell from existing shell.");
        return nativeSpawn;
    }

    public void unregisterTexture(long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j2);
    }

    public void updateDisplayMetrics(int i2, float f2, float f3, float f4) {
        displayWidth = f2;
        displayHeight = f3;
        displayDensity = f4;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }
}
