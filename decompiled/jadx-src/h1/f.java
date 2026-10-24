package h1;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f extends e {
    public static boolean f(int[] iArr, int i2) {
        kotlin.jvm.internal.k.e(iArr, "<this>");
        return i(iArr, i2) >= 0;
    }

    public static final <T> boolean g(T[] tArr, T t2) {
        kotlin.jvm.internal.k.e(tArr, "<this>");
        return j(tArr, t2) >= 0;
    }

    public static <T> T h(T[] tArr) {
        kotlin.jvm.internal.k.e(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    public static final int i(int[] iArr, int i2) {
        kotlin.jvm.internal.k.e(iArr, "<this>");
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (i2 == iArr[i3]) {
                return i3;
            }
        }
        return -1;
    }

    public static final <T> int j(T[] tArr, T t2) {
        kotlin.jvm.internal.k.e(tArr, "<this>");
        int i2 = 0;
        if (t2 == null) {
            int length = tArr.length;
            while (i2 < length) {
                if (tArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i2 < length2) {
            if (kotlin.jvm.internal.k.a(t2, tArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static char k(char[] cArr) {
        kotlin.jvm.internal.k.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static <T> T l(T[] tArr) {
        kotlin.jvm.internal.k.e(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }
}
