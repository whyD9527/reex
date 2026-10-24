package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.view.Surface;
import io.flutter.view.TextureRegistry;

@TargetApi(29)
/* loaded from: classes.dex */
public class v implements m {

    /* renamed from: a, reason: collision with root package name */
    private TextureRegistry.SurfaceProducer f3401a;

    public v(TextureRegistry.SurfaceProducer surfaceProducer) {
        this.f3401a = surfaceProducer;
    }

    @Override // io.flutter.plugin.platform.m
    public void a(int i2, int i3) {
        this.f3401a.setSize(i2, i3);
    }

    @Override // io.flutter.plugin.platform.m
    public int getHeight() {
        return this.f3401a.getHeight();
    }

    @Override // io.flutter.plugin.platform.m
    public long getId() {
        return this.f3401a.id();
    }

    @Override // io.flutter.plugin.platform.m
    public Surface getSurface() {
        return this.f3401a.getSurface();
    }

    @Override // io.flutter.plugin.platform.m
    public int getWidth() {
        return this.f3401a.getWidth();
    }

    @Override // io.flutter.plugin.platform.m
    public Canvas lockHardwareCanvas() {
        return this.f3401a.getSurface().lockHardwareCanvas();
    }

    @Override // io.flutter.plugin.platform.m
    public void release() {
        this.f3401a.release();
        this.f3401a = null;
    }

    @Override // io.flutter.plugin.platform.m
    public void unlockCanvasAndPost(Canvas canvas) {
        this.f3401a.getSurface().unlockCanvasAndPost(canvas);
    }
}
