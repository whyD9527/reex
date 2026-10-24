package io.flutter.view;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes.dex */
public class p {

    /* renamed from: e, reason: collision with root package name */
    private static p f3574e;

    /* renamed from: f, reason: collision with root package name */
    private static b f3575f;

    /* renamed from: b, reason: collision with root package name */
    private FlutterJNI f3577b;

    /* renamed from: a, reason: collision with root package name */
    private long f3576a = -1;

    /* renamed from: c, reason: collision with root package name */
    private c f3578c = new c(0);

    /* renamed from: d, reason: collision with root package name */
    private final FlutterJNI.b f3579d = new a();

    class a implements FlutterJNI.b {
        a() {
        }

        private Choreographer.FrameCallback b(long j2) {
            if (p.this.f3578c == null) {
                return p.this.new c(j2);
            }
            p.this.f3578c.f3583a = j2;
            c cVar = p.this.f3578c;
            p.this.f3578c = null;
            return cVar;
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.b
        public void a(long j2) {
            Choreographer.getInstance().postFrameCallback(b(j2));
        }
    }

    @TargetApi(17)
    class b implements DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        private DisplayManager f3581a;

        b(DisplayManager displayManager) {
            this.f3581a = displayManager;
        }

        void a() {
            this.f3581a.registerDisplayListener(this, null);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i2) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i2) {
            if (i2 == 0) {
                float refreshRate = this.f3581a.getDisplay(0).getRefreshRate();
                p.this.f3576a = (long) (1.0E9d / refreshRate);
                p.this.f3577b.setRefreshRateFPS(refreshRate);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i2) {
        }
    }

    private class c implements Choreographer.FrameCallback {

        /* renamed from: a, reason: collision with root package name */
        private long f3583a;

        c(long j2) {
            this.f3583a = j2;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j2) {
            long nanoTime = System.nanoTime() - j2;
            p.this.f3577b.onVsync(nanoTime < 0 ? 0L : nanoTime, p.this.f3576a, this.f3583a);
            p.this.f3578c = this;
        }
    }

    private p(FlutterJNI flutterJNI) {
        this.f3577b = flutterJNI;
    }

    @TargetApi(17)
    public static p f(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f3574e == null) {
            f3574e = new p(flutterJNI);
        }
        if (f3575f == null) {
            p pVar = f3574e;
            Objects.requireNonNull(pVar);
            b bVar = pVar.new b(displayManager);
            f3575f = bVar;
            bVar.a();
        }
        if (f3574e.f3576a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f3574e.f3576a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f3574e;
    }

    public void g() {
        this.f3577b.setAsyncWaitForVsyncDelegate(this.f3579d);
    }
}
