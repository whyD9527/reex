package e2;

import android.content.Intent;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class t0 {
    public static final HashMap<String, Object> a(Intent intent) {
        HashMap<String, Object> e3;
        kotlin.jvm.internal.k.e(intent, "<this>");
        String stringExtra = intent.getStringExtra("reex.extra.title");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("title");
        }
        e3 = h1.a0.e(g1.n.a("title", stringExtra), g1.n.a("uriString", intent.getDataString()), g1.n.a("httpHeader", intent.getStringExtra("reex.extra.http_header")), g1.n.a("subtitle", intent.getStringExtra("reex.extra.subtitle")));
        return e3;
    }
}
