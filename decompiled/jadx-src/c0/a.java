package c0;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.i;
import androidx.core.app.j;

/* loaded from: classes.dex */
public class a extends j.d {

    /* renamed from: e, reason: collision with root package name */
    int[] f2533e = null;

    /* renamed from: f, reason: collision with root package name */
    MediaSessionCompat.Token f2534f;

    @Override // androidx.core.app.j.d
    public void b(i iVar) {
        iVar.a().setStyle(h(new Notification.MediaStyle()));
    }

    @Override // androidx.core.app.j.d
    public RemoteViews d(i iVar) {
        return null;
    }

    @Override // androidx.core.app.j.d
    public RemoteViews e(i iVar) {
        return null;
    }

    Notification.MediaStyle h(Notification.MediaStyle mediaStyle) {
        int[] iArr = this.f2533e;
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        MediaSessionCompat.Token token = this.f2534f;
        if (token != null) {
            mediaStyle.setMediaSession((MediaSession.Token) token.c());
        }
        return mediaStyle;
    }

    public a i(MediaSessionCompat.Token token) {
        this.f2534f = token;
        return this;
    }

    public a j(int... iArr) {
        this.f2533e = iArr;
        return this;
    }
}
