package w1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m extends l {
    public static Integer f(String str) {
        kotlin.jvm.internal.k.e(str, "<this>");
        return g(str, 10);
    }

    public static final Integer g(String str, int i2) {
        boolean z2;
        int i3;
        kotlin.jvm.internal.k.e(str, "<this>");
        a.a(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        int i5 = -2147483647;
        int i6 = 1;
        if (kotlin.jvm.internal.k.f(charAt, 48) >= 0) {
            z2 = false;
            i6 = 0;
        } else {
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i5 = Integer.MIN_VALUE;
                z2 = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z2 = false;
            }
        }
        int i7 = -59652323;
        while (i6 < length) {
            int b3 = a.b(str.charAt(i6), i2);
            if (b3 < 0) {
                return null;
            }
            if ((i4 < i7 && (i7 != -59652323 || i4 < (i7 = i5 / i2))) || (i3 = i4 * i2) < i5 + b3) {
                return null;
            }
            i4 = i3 - b3;
            i6++;
        }
        return z2 ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    public static Long h(String str) {
        kotlin.jvm.internal.k.e(str, "<this>");
        return i(str, 10);
    }

    public static final Long i(String str, int i2) {
        kotlin.jvm.internal.k.e(str, "<this>");
        a.a(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        long j2 = -9223372036854775807L;
        boolean z2 = true;
        if (kotlin.jvm.internal.k.f(charAt, 48) >= 0) {
            z2 = false;
        } else {
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j2 = Long.MIN_VALUE;
                i3 = 1;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z2 = false;
                i3 = 1;
            }
        }
        long j3 = -256204778801521550L;
        long j4 = 0;
        long j5 = -256204778801521550L;
        while (i3 < length) {
            int b3 = a.b(str.charAt(i3), i2);
            if (b3 < 0) {
                return null;
            }
            if (j4 < j5) {
                if (j5 == j3) {
                    j5 = j2 / i2;
                    if (j4 < j5) {
                    }
                }
                return null;
            }
            long j6 = j4 * i2;
            long j7 = b3;
            if (j6 < j2 + j7) {
                return null;
            }
            j4 = j6 - j7;
            i3++;
            j3 = -256204778801521550L;
        }
        return z2 ? Long.valueOf(j4) : Long.valueOf(-j4);
    }
}
