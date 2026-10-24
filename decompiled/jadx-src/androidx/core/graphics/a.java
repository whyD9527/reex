package androidx.core.graphics;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<double[]> f1416a = new ThreadLocal<>();

    public static int a(double d3, double d4, double d5) {
        double d6 = (((3.2406d * d3) + ((-1.5372d) * d4)) + ((-0.4986d) * d5)) / 100.0d;
        double d7 = ((((-0.9689d) * d3) + (1.8758d * d4)) + (0.0415d * d5)) / 100.0d;
        double d8 = (((0.0557d * d3) + ((-0.204d) * d4)) + (1.057d * d5)) / 100.0d;
        return Color.rgb(e((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, 255), e((int) Math.round((d7 > 0.0031308d ? (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d) * 255.0d), 0, 255), e((int) Math.round((d8 > 0.0031308d ? (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d : d8 * 12.92d) * 255.0d), 0, 255));
    }

    private static int b(int i2, int i3) {
        return 255 - (((255 - i3) * (255 - i2)) / 255);
    }

    public static int c(int i2, int i3) {
        int alpha = Color.alpha(i3);
        int alpha2 = Color.alpha(i2);
        int b3 = b(alpha2, alpha);
        return Color.argb(b3, d(Color.red(i2), alpha2, Color.red(i3), alpha, b3), d(Color.green(i2), alpha2, Color.green(i3), alpha, b3), d(Color.blue(i2), alpha2, Color.blue(i3), alpha, b3));
    }

    private static int d(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        return (((i2 * 255) * i3) + ((i4 * i5) * (255 - i3))) / (i6 * 255);
    }

    private static int e(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : Math.min(i2, i4);
    }

    public static int f(int i2, int i3) {
        if (i3 < 0 || i3 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i2 & 16777215) | (i3 << 24);
    }
}
