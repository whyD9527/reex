package android.support.v4.media;

import a.b;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends b {
    @Override // a.b
    protected void a(int i2, Bundle bundle) {
        if (bundle != null) {
            bundle = MediaSessionCompat.k(bundle);
        }
        if (i2 != 0) {
            throw null;
        }
        if (bundle == null) {
            throw null;
        }
        if (!bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
