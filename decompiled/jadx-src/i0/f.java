package i0;

/* loaded from: classes.dex */
public final class f {
    public static final String a(int i2) {
        return (i2 != 3 ? i2 != 4 ? a.INTERNAL_ERROR : a.MAX_LIMIT : a.ALREADY_ACTIVE).b();
    }

    public static final String b(int i2) {
        return i2 != 3 ? i2 != 4 ? "Internal error" : "Maximum outstanding requests reached" : "Operation already active";
    }
}
