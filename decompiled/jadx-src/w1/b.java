package w1;

/* loaded from: classes.dex */
class b extends a {
    public static final boolean d(char c3, char c4, boolean z2) {
        if (c3 == c4) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c3);
        char upperCase2 = Character.toUpperCase(c4);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
