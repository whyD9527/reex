package b0;

import android.media.session.MediaSessionManager$RemoteUserInfo;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    b f2368a;

    public a(MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
        String a3 = c.a(mediaSessionManager$RemoteUserInfo);
        if (a3 == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(a3)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.f2368a = new c(mediaSessionManager$RemoteUserInfo);
    }

    public a(String str, int i2, int i3) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.f2368a = Build.VERSION.SDK_INT >= 28 ? new c(str, i2, i3) : new d(str, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f2368a.equals(((a) obj).f2368a);
        }
        return false;
    }

    public int hashCode() {
        return this.f2368a.hashCode();
    }
}
