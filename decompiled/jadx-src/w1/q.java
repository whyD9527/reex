package w1;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q extends p {
    public static String b0(String str, int i2) {
        int d3;
        kotlin.jvm.internal.k.e(str, "<this>");
        if (i2 >= 0) {
            d3 = t1.f.d(i2, str.length());
            String substring = str.substring(d3);
            kotlin.jvm.internal.k.d(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    public static String c0(String str, int i2) {
        int a3;
        kotlin.jvm.internal.k.e(str, "<this>");
        if (i2 >= 0) {
            a3 = t1.f.a(str.length() - i2, 0);
            return f0(str, a3);
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    public static char d0(CharSequence charSequence) {
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(0);
    }

    public static char e0(CharSequence charSequence) {
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(o.u(charSequence));
    }

    public static final String f0(String str, int i2) {
        int d3;
        kotlin.jvm.internal.k.e(str, "<this>");
        if (i2 >= 0) {
            d3 = t1.f.d(i2, str.length());
            String substring = str.substring(0, d3);
            kotlin.jvm.internal.k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }
}
