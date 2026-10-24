package io.flutter.view;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.view.Surface;
import androidx.annotation.Keep;

/* loaded from: classes.dex */
public interface TextureRegistry {

    @Keep
    public interface ImageConsumer {
        Image acquireLatestImage();

        /* synthetic */ long id();

        /* synthetic */ void release();
    }

    @Keep
    public interface ImageTextureEntry {
        long id();

        void pushImage(Image image);

        void release();
    }

    @Keep
    public interface SurfaceProducer {
        int getHeight();

        Surface getSurface();

        int getWidth();

        long id();

        void release();

        void setSize(int i2, int i3);
    }

    @Keep
    public interface SurfaceTextureEntry {
        long id();

        void release();

        void setOnFrameConsumedListener(a aVar);

        void setOnTrimMemoryListener(b bVar);

        SurfaceTexture surfaceTexture();
    }

    public interface a {
        void a();
    }

    public interface b {
        void onTrimMemory(int i2);
    }

    ImageTextureEntry a();

    SurfaceProducer b();

    SurfaceTextureEntry c();
}
