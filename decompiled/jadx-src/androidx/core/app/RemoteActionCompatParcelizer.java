package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1255a = (IconCompat) aVar.v(remoteActionCompat.f1255a, 1);
        remoteActionCompat.f1256b = aVar.l(remoteActionCompat.f1256b, 2);
        remoteActionCompat.f1257c = aVar.l(remoteActionCompat.f1257c, 3);
        remoteActionCompat.f1258d = (PendingIntent) aVar.r(remoteActionCompat.f1258d, 4);
        remoteActionCompat.f1259e = aVar.h(remoteActionCompat.f1259e, 5);
        remoteActionCompat.f1260f = aVar.h(remoteActionCompat.f1260f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f1255a, 1);
        aVar.D(remoteActionCompat.f1256b, 2);
        aVar.D(remoteActionCompat.f1257c, 3);
        aVar.H(remoteActionCompat.f1258d, 4);
        aVar.z(remoteActionCompat.f1259e, 5);
        aVar.z(remoteActionCompat.f1260f, 6);
    }
}
