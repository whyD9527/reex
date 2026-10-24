package e2;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import androidx.core.app.j;
import xyz.re.player.ex.MainActivity;
import xyz.re.player.ex.R;
import xyz.re.player.ex.ReexPlaybackService;
import z0.k;

/* loaded from: classes.dex */
final class n {

    /* renamed from: k, reason: collision with root package name */
    public static final a f2683k = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f2684a;

    /* renamed from: b, reason: collision with root package name */
    private final q1.p<String, Object, g1.q> f2685b;

    /* renamed from: c, reason: collision with root package name */
    private final g1.e f2686c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f2687d;

    /* renamed from: e, reason: collision with root package name */
    private final d f2688e;

    /* renamed from: f, reason: collision with root package name */
    private final b f2689f;

    /* renamed from: g, reason: collision with root package name */
    private final MediaSessionCompat f2690g;

    /* renamed from: h, reason: collision with root package name */
    private MediaMetadataCompat.b f2691h;

    /* renamed from: i, reason: collision with root package name */
    private PlaybackStateCompat.b f2692i;

    /* renamed from: j, reason: collision with root package name */
    private final j.c f2693j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final PendingIntent c(Context context, long j2) {
            int h2 = PlaybackStateCompat.h(j2);
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, h2));
            PendingIntent broadcast = PendingIntent.getBroadcast(context, h2, intent, 67108864);
            kotlin.jvm.internal.k.d(broadcast, "getBroadcast(\n          …G_IMMUTABLE\n            )");
            return broadcast;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bitmap d(Context context, byte[] bArr) {
            int a3;
            int a4;
            double c3;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            if (decodeByteArray == null) {
                return null;
            }
            Resources resources = context.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (decodeByteArray.getWidth() <= dimensionPixelSize && decodeByteArray.getHeight() <= dimensionPixelSize2) {
                return decodeByteArray;
            }
            a3 = t1.f.a(1, decodeByteArray.getWidth());
            double d3 = dimensionPixelSize2;
            a4 = t1.f.a(1, decodeByteArray.getHeight());
            c3 = t1.f.c(dimensionPixelSize / a3, d3 / a4);
            return Bitmap.createScaledBitmap(decodeByteArray, (int) Math.ceil(decodeByteArray.getWidth() * c3), (int) Math.ceil(decodeByteArray.getHeight() * c3), true);
        }
    }

    public static final class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.k.e(context, "context");
            kotlin.jvm.internal.k.e(intent, "intent");
            d0.a.b(n.this.f(), intent);
        }
    }

    static final class c extends kotlin.jvm.internal.l implements q1.a<NotificationManager> {
        c() {
            super(0);
        }

        @Override // q1.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NotificationManager invoke() {
            Object systemService = n.this.c().getSystemService("notification");
            kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            return (NotificationManager) systemService;
        }
    }

    public static final class d extends MediaSessionCompat.b {
        d() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void A() {
            n.this.e().invoke("onSkipToPrevious", null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void h() {
            n.this.e().invoke("onPause", null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void i() {
            n.this.e().invoke("onPlay", null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void s(long j2) {
            n.this.e().invoke("onSeekTo", Long.valueOf(j2));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void u(float f2) {
            n.this.e().invoke("onSetPlaybackSpeed", Float.valueOf(f2));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void z() {
            n.this.e().invoke("onSkipToNext", null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.app.NotificationChannel] */
    public n(Context context, q1.p<? super String, Object, g1.q> onEvent) {
        g1.e a3;
        kotlin.jvm.internal.k.e(context, "context");
        kotlin.jvm.internal.k.e(onEvent, "onEvent");
        this.f2684a = context;
        this.f2685b = onEvent;
        a3 = g1.g.a(new c());
        this.f2686c = a3;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f2687d = handler;
        this.f2688e = new d();
        b bVar = new b();
        this.f2689f = bVar;
        final MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, "Reex");
        handler.post(new Runnable() { // from class: e2.m
            @Override // java.lang.Runnable
            public final void run() {
                n.h(MediaSessionCompat.this, this);
            }
        });
        this.f2690g = mediaSessionCompat;
        this.f2691h = new MediaMetadataCompat.b();
        this.f2692i = new PlaybackStateCompat.b();
        final String str = "ReexPlaybackService";
        j.c cVar = new j.c(context, "ReexPlaybackService");
        cVar.m(R.drawable.reex_icon);
        cVar.h(PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) MainActivity.class), 67108864));
        cVar.l(-1);
        cVar.g(true);
        c0.a aVar = new c0.a();
        aVar.i(mediaSessionCompat.d());
        cVar.n(aVar);
        this.f2693j = cVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_BUTTON");
        context.registerReceiver(bVar, intentFilter);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            final int i3 = 2;
            d().createNotificationChannel(new Parcelable(str, str, i3) { // from class: android.app.NotificationChannel
                static {
                    throw new NoClassDefFoundError();
                }
            });
        }
        ReexPlaybackService.f4493e.a(cVar.b());
        Intent intent = new Intent(context, (Class<?>) ReexPlaybackService.class);
        if (i2 >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    private final NotificationManager d() {
        return (NotificationManager) this.f2686c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(MediaSessionCompat this_apply, n this$0) {
        kotlin.jvm.internal.k.e(this_apply, "$this_apply");
        kotlin.jvm.internal.k.e(this$0, "this$0");
        this_apply.g(this$0.f2688e);
    }

    public final void b() {
        this.f2684a.unregisterReceiver(this.f2689f);
        this.f2684a.stopService(new Intent(this.f2684a, (Class<?>) ReexPlaybackService.class));
        if (Build.VERSION.SDK_INT >= 26) {
            d().deleteNotificationChannel("ReexPlaybackService");
        }
    }

    public final Context c() {
        return this.f2684a;
    }

    public final q1.p<String, Object, g1.q> e() {
        return this.f2685b;
    }

    public final MediaSessionCompat f() {
        return this.f2690g;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void g(z0.j call, k.d result) {
        int i2;
        Object obj;
        Object obj2;
        kotlin.jvm.internal.k.e(call, "call");
        kotlin.jvm.internal.k.e(result, "result");
        String str = call.f4754a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1623317040:
                    if (str.equals("setNotificationActions")) {
                        j.c cVar = this.f2693j;
                        Object a3 = call.a("isPlaying");
                        kotlin.jvm.internal.k.b(a3);
                        boolean booleanValue = ((Boolean) a3).booleanValue();
                        Object a4 = call.a("canSkipToPrevious");
                        kotlin.jvm.internal.k.b(a4);
                        boolean booleanValue2 = ((Boolean) a4).booleanValue();
                        Object a5 = call.a("canSkipToNext");
                        kotlin.jvm.internal.k.b(a5);
                        boolean booleanValue3 = ((Boolean) a5).booleanValue();
                        cVar.c();
                        if (booleanValue2) {
                            cVar.a(new j.a(R.drawable.previous_round, "previous", f2683k.c(this.f2684a, 16L)));
                            i2 = 2;
                        } else {
                            i2 = 1;
                        }
                        cVar.a(booleanValue ? new j.a(R.drawable.pause_round, "pause", f2683k.c(this.f2684a, 2L)) : new j.a(R.drawable.play_round, "play", f2683k.c(this.f2684a, 4L)));
                        if (booleanValue3) {
                            i2++;
                            cVar.a(new j.a(R.drawable.next_round, "next", f2683k.c(this.f2684a, 32L)));
                        }
                        c0.a aVar = new c0.a();
                        aVar.i(this.f2690g.d());
                        if (i2 == 1) {
                            aVar.j(0);
                        } else if (i2 == 2) {
                            aVar.j(0, 1);
                        } else if (i2 == 3) {
                            aVar.j(0, 1, 2);
                        }
                        cVar.n(aVar);
                        result.a(null);
                        break;
                    }
                    break;
                case -1411528570:
                    if (str.equals("setNotificationIcon")) {
                        byte[] bArr = (byte[]) call.b();
                        if (bArr != null) {
                            this.f2693j.k(f2683k.d(this.f2684a, bArr));
                            obj = null;
                        } else {
                            obj = null;
                            this.f2693j.k(null);
                        }
                        result.a(obj);
                        break;
                    }
                    break;
                case -1411198662:
                    obj2 = null;
                    if (str.equals("setNotificationText")) {
                        this.f2693j.i((CharSequence) call.b());
                        result.a(obj2);
                        break;
                    }
                    break;
                case -797370389:
                    obj2 = null;
                    if (str.equals("setNotificationTitle")) {
                        this.f2693j.j((CharSequence) call.b());
                        result.a(obj2);
                        break;
                    }
                    break;
                case -376295340:
                    obj2 = null;
                    if (str.equals("updateNotification")) {
                        d().notify(741852963, this.f2693j.b());
                        result.a(obj2);
                        break;
                    }
                    break;
                case 58447368:
                    if (str.equals("setActive")) {
                        MediaSessionCompat mediaSessionCompat = this.f2690g;
                        Object b3 = call.b();
                        kotlin.jvm.internal.k.b(b3);
                        mediaSessionCompat.f(((Boolean) b3).booleanValue());
                        obj2 = null;
                        result.a(obj2);
                        break;
                    }
                    break;
                case 415545844:
                    if (str.equals("setPlaybackState")) {
                        MediaSessionCompat mediaSessionCompat2 = this.f2690g;
                        PlaybackStateCompat.b bVar = this.f2692i;
                        Object a6 = call.a("isPlaying");
                        kotlin.jvm.internal.k.b(a6);
                        boolean booleanValue4 = ((Boolean) a6).booleanValue();
                        Object a7 = call.a("canSkipToPrevious");
                        kotlin.jvm.internal.k.b(a7);
                        boolean booleanValue5 = ((Boolean) a7).booleanValue();
                        Object a8 = call.a("canSkipToNext");
                        kotlin.jvm.internal.k.b(a8);
                        boolean booleanValue6 = ((Boolean) a8).booleanValue();
                        int i3 = booleanValue4 ? 3 : 2;
                        Object a9 = call.a("position");
                        kotlin.jvm.internal.k.b(a9);
                        long longValue = ((Number) a9).longValue();
                        Object a10 = call.a("playbackSpeed");
                        kotlin.jvm.internal.k.b(a10);
                        bVar.c(i3, longValue, ((Number) a10).floatValue());
                        long j2 = (booleanValue4 ? 2L : 4L) | 256 | 4194304;
                        if (booleanValue5) {
                            j2 |= 16;
                        }
                        if (booleanValue6) {
                            j2 |= 32;
                        }
                        bVar.b(j2);
                        mediaSessionCompat2.j(bVar.a());
                        result.a(null);
                        break;
                    }
                    break;
                case 1501646321:
                    if (str.equals("setMediaMetadata")) {
                        MediaSessionCompat mediaSessionCompat3 = this.f2690g;
                        MediaMetadataCompat.b bVar2 = this.f2691h;
                        Object a11 = call.a("duration");
                        kotlin.jvm.internal.k.b(a11);
                        bVar2.b("android.media.metadata.DURATION", ((Number) a11).longValue());
                        bVar2.c("android.media.metadata.TITLE", (String) call.a("title"));
                        bVar2.c("android.media.metadata.ALBUM", (String) call.a("album"));
                        bVar2.c("android.media.metadata.ARTIST", (String) call.a("artist"));
                        bVar2.c("android.media.metadata.ALBUM_ARTIST", (String) call.a("albumArtist"));
                        bVar2.c("android.media.metadata.DISPLAY_ICON_URI", (String) call.a("displayIconUri"));
                        mediaSessionCompat3.i(bVar2.a());
                        result.a(null);
                        break;
                    }
                    break;
            }
        }
        result.b();
    }
}
