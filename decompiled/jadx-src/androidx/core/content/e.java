package androidx.core.content;

import android.content.Context;
import android.os.Process;

/* loaded from: classes.dex */
public final class e {
    public static int a(Context context, String str, int i2, int i3, String str2) {
        if (context.checkPermission(str, i2, i3) == -1) {
            return -1;
        }
        String c3 = androidx.core.app.d.c(str);
        if (c3 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i3);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return (Process.myUid() == i3 && androidx.core.util.d.a(context.getPackageName(), str2) ? androidx.core.app.d.a(context, i3, c3, str2) : androidx.core.app.d.b(context, c3, str2)) == 0 ? 0 : -2;
    }

    public static int b(Context context, String str) {
        return a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
