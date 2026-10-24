package e2;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PictureInPictureParams$Builder;
import android.app.RemoteAction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Icon;
import android.util.Rational;
import xyz.re.player.ex.R;

/* loaded from: classes.dex */
final class n0 extends BroadcastReceiver {

    /* renamed from: e, reason: collision with root package name */
    public static final a f2697e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f2698a;

    /* renamed from: b, reason: collision with root package name */
    private final Activity f2699b;

    /* renamed from: c, reason: collision with root package name */
    private final z0.k f2700c;

    /* renamed from: d, reason: collision with root package name */
    private final PictureInPictureParams$Builder f2701d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public n0(Context context, Activity activity, z0.k channel) {
        kotlin.jvm.internal.k.e(context, "context");
        kotlin.jvm.internal.k.e(activity, "activity");
        kotlin.jvm.internal.k.e(channel, "channel");
        this.f2698a = context;
        this.f2699b = activity;
        this.f2700c = channel;
        this.f2701d = new PictureInPictureParams$Builder();
    }

    private final RemoteAction c() {
        Icon createWithResource = Icon.createWithResource(this.f2698a, R.drawable.forward_round);
        kotlin.jvm.internal.k.d(createWithResource, "createWithResource(conte…R.drawable.forward_round)");
        Intent intent = new Intent("xyz.re.player.ex/SystemVideoPipMode/action");
        intent.putExtra("action", 3);
        return new RemoteAction(createWithResource, "Forward", "Forward", PendingIntent.getBroadcast(this.f2698a, 3, intent, 67108864));
    }

    private final RemoteAction d() {
        Icon createWithResource = Icon.createWithResource(this.f2698a, R.drawable.pause_round);
        kotlin.jvm.internal.k.d(createWithResource, "createWithResource(conte…, R.drawable.pause_round)");
        Intent intent = new Intent("xyz.re.player.ex/SystemVideoPipMode/action");
        intent.putExtra("action", 2);
        return new RemoteAction(createWithResource, "Pause", "Pause", PendingIntent.getBroadcast(this.f2698a, 2, intent, 67108864));
    }

    private final RemoteAction e() {
        Icon createWithResource = Icon.createWithResource(this.f2698a, R.drawable.play_round);
        kotlin.jvm.internal.k.d(createWithResource, "createWithResource(context, R.drawable.play_round)");
        Intent intent = new Intent("xyz.re.player.ex/SystemVideoPipMode/action");
        intent.putExtra("action", 1);
        return new RemoteAction(createWithResource, "Play", "Play", PendingIntent.getBroadcast(this.f2698a, 1, intent, 67108864));
    }

    private final RemoteAction f() {
        Icon createWithResource = Icon.createWithResource(this.f2698a, R.drawable.rewind_round);
        kotlin.jvm.internal.k.d(createWithResource, "createWithResource(conte… R.drawable.rewind_round)");
        Intent intent = new Intent("xyz.re.player.ex/SystemVideoPipMode/action");
        intent.putExtra("action", 4);
        return new RemoteAction(createWithResource, "Rewind", "Rewind", PendingIntent.getBroadcast(this.f2698a, 4, intent, 67108864));
    }

    public final void a() {
        this.f2698a.unregisterReceiver(this);
    }

    public final boolean b(boolean z2, int i2, int i3) {
        boolean isInPictureInPictureMode;
        boolean enterPictureInPictureMode;
        isInPictureInPictureMode = this.f2699b.isInPictureInPictureMode();
        if (isInPictureInPictureMode) {
            return true;
        }
        PictureInPictureParams$Builder pictureInPictureParams$Builder = this.f2701d;
        pictureInPictureParams$Builder.setActions(z2 ? h1.j.f(f(), d(), c()) : h1.j.f(f(), e(), c()));
        pictureInPictureParams$Builder.setAspectRatio(new Rational(i2, i3));
        enterPictureInPictureMode = this.f2699b.enterPictureInPictureMode(pictureInPictureParams$Builder.build());
        return enterPictureInPictureMode;
    }

    public final void g() {
        this.f2698a.registerReceiver(this, new IntentFilter("xyz.re.player.ex/SystemVideoPipMode/action"));
    }

    public final void h(int i2, int i3) {
        PictureInPictureParams$Builder pictureInPictureParams$Builder = this.f2701d;
        pictureInPictureParams$Builder.setAspectRatio(new Rational(i2, i3));
        this.f2699b.setPictureInPictureParams(pictureInPictureParams$Builder.build());
    }

    public final void i(boolean z2) {
        PictureInPictureParams$Builder pictureInPictureParams$Builder = this.f2701d;
        pictureInPictureParams$Builder.setActions(z2 ? h1.j.f(f(), d(), c()) : h1.j.f(f(), e(), c()));
        this.f2699b.setPictureInPictureParams(pictureInPictureParams$Builder.build());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        z0.k kVar;
        String str;
        kotlin.jvm.internal.k.e(context, "context");
        kotlin.jvm.internal.k.e(intent, "intent");
        int intExtra = intent.getIntExtra("action", -1);
        if (intExtra == 1) {
            kVar = this.f2700c;
            str = "onPlay";
        } else if (intExtra == 2) {
            kVar = this.f2700c;
            str = "onPause";
        } else if (intExtra == 3) {
            kVar = this.f2700c;
            str = "onForward";
        } else {
            if (intExtra != 4) {
                return;
            }
            kVar = this.f2700c;
            str = "onRewind";
        }
        kVar.c(str, null);
    }
}
