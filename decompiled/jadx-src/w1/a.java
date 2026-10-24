package w1;

/* loaded from: classes.dex */
class a {
    public static final int a(int i2) {
        if (new t1.c(2, 36).f(i2)) {
            return i2;
        }
        throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new t1.c(2, 36));
    }

    public static final int b(char c3, int i2) {
        return Character.digit((int) c3, i2);
    }

    public static final boolean c(char c3) {
        return Character.isWhitespace(c3) || Character.isSpaceChar(c3);
    }
}
