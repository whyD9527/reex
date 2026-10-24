package t1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f extends e {
    public static int a(int i2, int i3) {
        return i2 < i3 ? i3 : i2;
    }

    public static long b(long j2, long j3) {
        return j2 < j3 ? j3 : j2;
    }

    public static double c(double d3, double d4) {
        return d3 > d4 ? d4 : d3;
    }

    public static int d(int i2, int i3) {
        return i2 > i3 ? i3 : i2;
    }

    public static long e(long j2, long j3) {
        return j2 > j3 ? j3 : j2;
    }

    public static int f(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    public static a g(int i2, int i3) {
        return a.f4304h.a(i2, i3, -1);
    }

    public static c h(int i2, int i3) {
        return i3 <= Integer.MIN_VALUE ? c.f4312i.a() : new c(i2, i3 - 1);
    }
}
