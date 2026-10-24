package e0;

import android.os.Trace;

/* loaded from: classes.dex */
final class e {
    public static void a(String str, int i2) {
        Trace.beginAsyncSection(str, i2);
    }

    public static void b(String str, int i2) {
        Trace.endAsyncSection(str, i2);
    }
}
