package b0;

import android.media.session.MediaSessionManager$RemoteUserInfo;

/* loaded from: classes.dex */
final class c extends d {

    /* renamed from: d, reason: collision with root package name */
    final MediaSessionManager$RemoteUserInfo f2369d;

    c(MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
        super(mediaSessionManager$RemoteUserInfo.getPackageName(), mediaSessionManager$RemoteUserInfo.getPid(), mediaSessionManager$RemoteUserInfo.getUid());
        this.f2369d = mediaSessionManager$RemoteUserInfo;
    }

    c(String str, int i2, int i3) {
        super(str, i2, i3);
        this.f2369d = new MediaSessionManager$RemoteUserInfo(str, i2, i3);
    }

    static String a(MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
        return mediaSessionManager$RemoteUserInfo.getPackageName();
    }
}
