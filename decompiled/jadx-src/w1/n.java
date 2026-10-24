package w1;

import h1.w;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n extends m {
    public static final boolean j(String str, String suffix, boolean z2) {
        kotlin.jvm.internal.k.e(str, "<this>");
        kotlin.jvm.internal.k.e(suffix, "suffix");
        return !z2 ? str.endsWith(suffix) : m(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean k(String str, String str2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return j(str, str2, z2);
    }

    public static boolean l(CharSequence charSequence) {
        boolean z2;
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            Iterable t2 = o.t(charSequence);
            if (!(t2 instanceof Collection) || !((Collection) t2).isEmpty()) {
                Iterator it = t2.iterator();
                while (it.hasNext()) {
                    if (!a.c(charSequence.charAt(((w) it).nextInt()))) {
                        z2 = false;
                        break;
                    }
                }
            }
            z2 = true;
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    public static final boolean m(String str, int i2, String other, int i3, int i4, boolean z2) {
        kotlin.jvm.internal.k.e(str, "<this>");
        kotlin.jvm.internal.k.e(other, "other");
        return !z2 ? str.regionMatches(i2, other, i3, i4) : str.regionMatches(z2, i2, other, i3, i4);
    }

    public static final boolean n(String str, String prefix, boolean z2) {
        kotlin.jvm.internal.k.e(str, "<this>");
        kotlin.jvm.internal.k.e(prefix, "prefix");
        return !z2 ? str.startsWith(prefix) : m(str, 0, prefix, 0, prefix.length(), z2);
    }

    public static /* synthetic */ boolean o(String str, String str2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return n(str, str2, z2);
    }
}
