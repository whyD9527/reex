package io.flutter.plugin.platform;

import android.graphics.Canvas;
import android.view.Surface;

/* loaded from: classes.dex */
public interface m {
    void a(int i2, int i3);

    int getHeight();

    long getId();

    Surface getSurface();

    int getWidth();

    Canvas lockHardwareCanvas();

    void release();

    void unlockCanvasAndPost(Canvas canvas);
}
