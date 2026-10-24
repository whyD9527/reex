package e2;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class r {
    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap<String, Object> b(String str, String str2, String str3, boolean z2, boolean z3, long j2) {
        HashMap<String, Object> e3;
        e3 = h1.a0.e(g1.n.a("documentUri", str), g1.n.a("mimeType", str3), g1.n.a("displayName", str2), g1.n.a("isDirectory", Boolean.valueOf(z2)), g1.n.a("isVirtual", Boolean.valueOf(z3)), g1.n.a("lengthInBytes", Long.valueOf(j2)));
        return e3;
    }
}
