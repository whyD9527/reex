package xyz.re.player.ex;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import kotlin.jvm.internal.g;

/* loaded from: classes.dex */
public final class ReexPlaybackService extends Service {

    /* renamed from: e, reason: collision with root package name */
    public static final a f4493e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static Notification f4494f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(Notification notification) {
            ReexPlaybackService.f4494f = notification;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Notification notification = f4494f;
        if (notification != null) {
            startForeground(741852963, notification);
            f4494f = null;
        }
        Log.v("ReexPlaybackService", "ReexPlaybackService create");
    }

    @Override // android.app.Service
    public void onDestroy() {
        stopForeground(1);
        Log.v("ReexPlaybackService", "ReexPlaybackService destroy");
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        return 2;
    }
}
