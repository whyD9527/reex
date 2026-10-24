package g1;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b {
    public static void a(Throwable th, Throwable exception) {
        kotlin.jvm.internal.k.e(th, "<this>");
        kotlin.jvm.internal.k.e(exception, "exception");
        if (th != exception) {
            l1.b.f3833a.a(th, exception);
        }
    }

    public static String b(Throwable th) {
        kotlin.jvm.internal.k.e(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.k.d(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
