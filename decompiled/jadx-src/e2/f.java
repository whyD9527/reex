package e2;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap<String, Object> b(String str, String str2, boolean z2, boolean z3, boolean z4, String str3) {
        HashMap<String, Object> e3;
        e3 = h1.a0.e(g1.n.a("path", str), g1.n.a("description", str2), g1.n.a("isEmulated", Boolean.valueOf(z2)), g1.n.a("isPrimary", Boolean.valueOf(z3)), g1.n.a("isRemovable", Boolean.valueOf(z4)), g1.n.a("state", str3));
        return e3;
    }
}
