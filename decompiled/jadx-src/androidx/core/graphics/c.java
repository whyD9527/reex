package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        int f1422a;

        /* renamed from: b, reason: collision with root package name */
        boolean f1423b;

        a() {
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public char f1424a;

        /* renamed from: b, reason: collision with root package name */
        public float[] f1425b;

        b(char c3, float[] fArr) {
            this.f1424a = c3;
            this.f1425b = fArr;
        }

        b(b bVar) {
            this.f1424a = bVar.f1424a;
            float[] fArr = bVar.f1425b;
            this.f1425b = c.c(fArr, 0, fArr.length);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private static void a(Path path, float[] fArr, char c3, char c4, float[] fArr2) {
            int i2;
            int i3;
            int i4;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            char c5 = c4;
            boolean z2 = false;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            switch (c5) {
                case 'A':
                case androidx.constraintlayout.widget.k.O0 /* 97 */:
                    i2 = 7;
                    i3 = i2;
                    break;
                case 'C':
                case androidx.constraintlayout.widget.k.Q0 /* 99 */:
                    i2 = 6;
                    i3 = i2;
                    break;
                case 'H':
                case 'V':
                case androidx.constraintlayout.widget.k.V0 /* 104 */:
                case b.j.H0 /* 118 */:
                    i3 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case androidx.constraintlayout.widget.k.Y0 /* 108 */:
                case androidx.constraintlayout.widget.k.Z0 /* 109 */:
                case b.j.F0 /* 116 */:
                default:
                    i3 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case b.j.E0 /* 115 */:
                    i3 = 4;
                    break;
                case 'Z':
                case b.j.L0 /* 122 */:
                    path.close();
                    path.moveTo(f14, f15);
                    f10 = f14;
                    f12 = f10;
                    f11 = f15;
                    f13 = f11;
                    i3 = 2;
                    break;
            }
            float f16 = f10;
            float f17 = f11;
            float f18 = f14;
            float f19 = f15;
            int i5 = 0;
            char c6 = c3;
            while (i5 < fArr2.length) {
                if (c5 != 'A') {
                    if (c5 == 'C') {
                        i4 = i5;
                        int i6 = i4 + 2;
                        int i7 = i4 + 3;
                        int i8 = i4 + 4;
                        int i9 = i4 + 5;
                        path.cubicTo(fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i9]);
                        f16 = fArr2[i8];
                        float f20 = fArr2[i9];
                        float f21 = fArr2[i6];
                        float f22 = fArr2[i7];
                        f17 = f20;
                        f13 = f22;
                        f12 = f21;
                    } else if (c5 == 'H') {
                        i4 = i5;
                        int i10 = i4 + 0;
                        path.lineTo(fArr2[i10], f17);
                        f16 = fArr2[i10];
                    } else if (c5 == 'Q') {
                        i4 = i5;
                        int i11 = i4 + 0;
                        int i12 = i4 + 1;
                        int i13 = i4 + 2;
                        int i14 = i4 + 3;
                        path.quadTo(fArr2[i11], fArr2[i12], fArr2[i13], fArr2[i14]);
                        float f23 = fArr2[i11];
                        float f24 = fArr2[i12];
                        f16 = fArr2[i13];
                        f17 = fArr2[i14];
                        f12 = f23;
                        f13 = f24;
                    } else if (c5 == 'V') {
                        i4 = i5;
                        int i15 = i4 + 0;
                        path.lineTo(f16, fArr2[i15]);
                        f17 = fArr2[i15];
                    } else if (c5 != 'a') {
                        if (c5 != 'c') {
                            if (c5 == 'h') {
                                int i16 = i5 + 0;
                                path.rLineTo(fArr2[i16], 0.0f);
                                f16 += fArr2[i16];
                            } else if (c5 != 'q') {
                                if (c5 == 'v') {
                                    int i17 = i5 + 0;
                                    path.rLineTo(0.0f, fArr2[i17]);
                                    f5 = fArr2[i17];
                                } else if (c5 == 'L') {
                                    int i18 = i5 + 0;
                                    int i19 = i5 + 1;
                                    path.lineTo(fArr2[i18], fArr2[i19]);
                                    f16 = fArr2[i18];
                                    f17 = fArr2[i19];
                                } else if (c5 == 'M') {
                                    f16 = fArr2[i5 + 0];
                                    f17 = fArr2[i5 + 1];
                                    if (i5 > 0) {
                                        path.lineTo(f16, f17);
                                    } else {
                                        path.moveTo(f16, f17);
                                        i4 = i5;
                                        f19 = f17;
                                        f18 = f16;
                                    }
                                } else if (c5 == 'S') {
                                    if (c6 == 'c' || c6 == 's' || c6 == 'C' || c6 == 'S') {
                                        f16 = (f16 * 2.0f) - f12;
                                        f17 = (f17 * 2.0f) - f13;
                                    }
                                    float f25 = f17;
                                    int i20 = i5 + 0;
                                    int i21 = i5 + 1;
                                    int i22 = i5 + 2;
                                    int i23 = i5 + 3;
                                    path.cubicTo(f16, f25, fArr2[i20], fArr2[i21], fArr2[i22], fArr2[i23]);
                                    f2 = fArr2[i20];
                                    f3 = fArr2[i21];
                                    f16 = fArr2[i22];
                                    f17 = fArr2[i23];
                                    f12 = f2;
                                    f13 = f3;
                                } else if (c5 == 'T') {
                                    if (c6 == 'q' || c6 == 't' || c6 == 'Q' || c6 == 'T') {
                                        f16 = (f16 * 2.0f) - f12;
                                        f17 = (f17 * 2.0f) - f13;
                                    }
                                    int i24 = i5 + 0;
                                    int i25 = i5 + 1;
                                    path.quadTo(f16, f17, fArr2[i24], fArr2[i25]);
                                    float f26 = fArr2[i24];
                                    float f27 = fArr2[i25];
                                    i4 = i5;
                                    f13 = f17;
                                    f12 = f16;
                                    f16 = f26;
                                    f17 = f27;
                                } else if (c5 == 'l') {
                                    int i26 = i5 + 0;
                                    int i27 = i5 + 1;
                                    path.rLineTo(fArr2[i26], fArr2[i27]);
                                    f16 += fArr2[i26];
                                    f5 = fArr2[i27];
                                } else if (c5 == 'm') {
                                    float f28 = fArr2[i5 + 0];
                                    f16 += f28;
                                    float f29 = fArr2[i5 + 1];
                                    f17 += f29;
                                    if (i5 > 0) {
                                        path.rLineTo(f28, f29);
                                    } else {
                                        path.rMoveTo(f28, f29);
                                        i4 = i5;
                                        f19 = f17;
                                        f18 = f16;
                                    }
                                } else if (c5 == 's') {
                                    if (c6 == 'c' || c6 == 's' || c6 == 'C' || c6 == 'S') {
                                        float f30 = f16 - f12;
                                        f6 = f17 - f13;
                                        f7 = f30;
                                    } else {
                                        f7 = 0.0f;
                                        f6 = 0.0f;
                                    }
                                    int i28 = i5 + 0;
                                    int i29 = i5 + 1;
                                    int i30 = i5 + 2;
                                    int i31 = i5 + 3;
                                    path.rCubicTo(f7, f6, fArr2[i28], fArr2[i29], fArr2[i30], fArr2[i31]);
                                    f2 = fArr2[i28] + f16;
                                    f3 = fArr2[i29] + f17;
                                    f16 += fArr2[i30];
                                    f4 = fArr2[i31];
                                } else if (c5 == 't') {
                                    if (c6 == 'q' || c6 == 't' || c6 == 'Q' || c6 == 'T') {
                                        f8 = f16 - f12;
                                        f9 = f17 - f13;
                                    } else {
                                        f9 = 0.0f;
                                        f8 = 0.0f;
                                    }
                                    int i32 = i5 + 0;
                                    int i33 = i5 + 1;
                                    path.rQuadTo(f8, f9, fArr2[i32], fArr2[i33]);
                                    float f31 = f8 + f16;
                                    float f32 = f9 + f17;
                                    f16 += fArr2[i32];
                                    f17 += fArr2[i33];
                                    f13 = f32;
                                    f12 = f31;
                                }
                                f17 += f5;
                            } else {
                                int i34 = i5 + 0;
                                int i35 = i5 + 1;
                                int i36 = i5 + 2;
                                int i37 = i5 + 3;
                                path.rQuadTo(fArr2[i34], fArr2[i35], fArr2[i36], fArr2[i37]);
                                f2 = fArr2[i34] + f16;
                                f3 = fArr2[i35] + f17;
                                f16 += fArr2[i36];
                                f4 = fArr2[i37];
                            }
                            i4 = i5;
                        } else {
                            int i38 = i5 + 2;
                            int i39 = i5 + 3;
                            int i40 = i5 + 4;
                            int i41 = i5 + 5;
                            path.rCubicTo(fArr2[i5 + 0], fArr2[i5 + 1], fArr2[i38], fArr2[i39], fArr2[i40], fArr2[i41]);
                            f2 = fArr2[i38] + f16;
                            f3 = fArr2[i39] + f17;
                            f16 += fArr2[i40];
                            f4 = fArr2[i41];
                        }
                        f17 += f4;
                        f12 = f2;
                        f13 = f3;
                        i4 = i5;
                    } else {
                        int i42 = i5 + 5;
                        int i43 = i5 + 6;
                        i4 = i5;
                        c(path, f16, f17, fArr2[i42] + f16, fArr2[i43] + f17, fArr2[i5 + 0], fArr2[i5 + 1], fArr2[i5 + 2], fArr2[i5 + 3] != 0.0f, fArr2[i5 + 4] != 0.0f);
                        f16 += fArr2[i42];
                        f17 += fArr2[i43];
                    }
                    i5 = i4 + i3;
                    c6 = c4;
                    c5 = c6;
                    z2 = false;
                } else {
                    i4 = i5;
                    int i44 = i4 + 5;
                    int i45 = i4 + 6;
                    c(path, f16, f17, fArr2[i44], fArr2[i45], fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                    f16 = fArr2[i44];
                    f17 = fArr2[i45];
                }
                f13 = f17;
                f12 = f16;
                i5 = i4 + i3;
                c6 = c4;
                c5 = c6;
                z2 = false;
            }
            fArr[z2 ? 1 : 0] = f16;
            fArr[1] = f17;
            fArr[2] = f12;
            fArr[3] = f13;
            fArr[4] = f18;
            fArr[5] = f19;
        }

        private static void b(Path path, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11) {
            double d12 = d5;
            int ceil = (int) Math.ceil(Math.abs((d11 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d9);
            double sin = Math.sin(d9);
            double cos2 = Math.cos(d10);
            double sin2 = Math.sin(d10);
            double d13 = -d12;
            double d14 = d13 * cos;
            double d15 = d6 * sin;
            double d16 = (d14 * sin2) - (d15 * cos2);
            double d17 = d13 * sin;
            double d18 = d6 * cos;
            double d19 = (sin2 * d17) + (cos2 * d18);
            double d20 = d11 / ceil;
            double d21 = d19;
            double d22 = d16;
            int i2 = 0;
            double d23 = d7;
            double d24 = d8;
            double d25 = d10;
            while (i2 < ceil) {
                double d26 = d25 + d20;
                double sin3 = Math.sin(d26);
                double cos3 = Math.cos(d26);
                double d27 = (d3 + ((d12 * cos) * cos3)) - (d15 * sin3);
                double d28 = d4 + (d12 * sin * cos3) + (d18 * sin3);
                double d29 = (d14 * sin3) - (d15 * cos3);
                double d30 = (sin3 * d17) + (cos3 * d18);
                double d31 = d26 - d25;
                double tan = Math.tan(d31 / 2.0d);
                double sin4 = (Math.sin(d31) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d32 = d23 + (d22 * sin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d32, (float) (d24 + (d21 * sin4)), (float) (d27 - (sin4 * d29)), (float) (d28 - (sin4 * d30)), (float) d27, (float) d28);
                i2++;
                d20 = d20;
                sin = sin;
                d23 = d27;
                d17 = d17;
                cos = cos;
                d25 = d26;
                d21 = d30;
                d22 = d29;
                ceil = ceil;
                d24 = d28;
                d12 = d5;
            }
        }

        private static void c(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z2, boolean z3) {
            double d3;
            double d4;
            double radians = Math.toRadians(f8);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d5 = f2;
            double d6 = d5 * cos;
            double d7 = f3;
            double d8 = f6;
            double d9 = (d6 + (d7 * sin)) / d8;
            double d10 = ((-f2) * sin) + (d7 * cos);
            double d11 = f7;
            double d12 = d10 / d11;
            double d13 = f5;
            double d14 = ((f4 * cos) + (d13 * sin)) / d8;
            double d15 = (((-f4) * sin) + (d13 * cos)) / d11;
            double d16 = d9 - d14;
            double d17 = d12 - d15;
            double d18 = (d9 + d14) / 2.0d;
            double d19 = (d12 + d15) / 2.0d;
            double d20 = (d16 * d16) + (d17 * d17);
            if (d20 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d21 = (1.0d / d20) - 0.25d;
            if (d21 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d20);
                float sqrt = (float) (Math.sqrt(d20) / 1.99999d);
                c(path, f2, f3, f4, f5, f6 * sqrt, f7 * sqrt, f8, z2, z3);
                return;
            }
            double sqrt2 = Math.sqrt(d21);
            double d22 = d16 * sqrt2;
            double d23 = sqrt2 * d17;
            if (z2 == z3) {
                d3 = d18 - d23;
                d4 = d19 + d22;
            } else {
                d3 = d18 + d23;
                d4 = d19 - d22;
            }
            double atan2 = Math.atan2(d12 - d4, d9 - d3);
            double atan22 = Math.atan2(d15 - d4, d14 - d3) - atan2;
            if (z3 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d24 = d3 * d8;
            double d25 = d4 * d11;
            b(path, (d24 * cos) - (d25 * sin), (d24 * sin) + (d25 * cos), d8, d11, d5, d7, radians, atan2, atan22);
        }

        public static void e(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c3 = 'm';
            for (int i2 = 0; i2 < bVarArr.length; i2++) {
                b bVar = bVarArr[i2];
                a(path, fArr, c3, bVar.f1424a, bVar.f1425b);
                c3 = bVarArr[i2].f1424a;
            }
        }

        public void d(b bVar, b bVar2, float f2) {
            this.f1424a = bVar.f1424a;
            int i2 = 0;
            while (true) {
                float[] fArr = bVar.f1425b;
                if (i2 >= fArr.length) {
                    return;
                }
                this.f1425b[i2] = (fArr[i2] * (1.0f - f2)) + (bVar2.f1425b[i2] * f2);
                i2++;
            }
        }
    }

    private static void a(ArrayList<b> arrayList, char c3, float[] fArr) {
        arrayList.add(new b(c3, fArr));
    }

    public static boolean b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            b bVar = bVarArr[i2];
            char c3 = bVar.f1424a;
            b bVar2 = bVarArr2[i2];
            if (c3 != bVar2.f1424a || bVar.f1425b.length != bVar2.f1425b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] c(float[] fArr, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i2 < 0 || i2 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = i3 - i2;
        int min = Math.min(i4, length - i2);
        float[] fArr2 = new float[i4];
        System.arraycopy(fArr, i2, fArr2, 0, min);
        return fArr2;
    }

    public static b[] d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 0;
        while (i2 < str.length()) {
            int i4 = i(str, i2);
            String trim = str.substring(i3, i4).trim();
            if (trim.length() > 0) {
                a(arrayList, trim.charAt(0), h(trim));
            }
            i3 = i4;
            i2 = i4 + 1;
        }
        if (i2 - i3 == 1 && i3 < str.length()) {
            a(arrayList, str.charAt(i3), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    public static Path e(String str) {
        Path path = new Path();
        b[] d3 = d(str);
        if (d3 == null) {
            return null;
        }
        try {
            b.e(d3, path);
            return path;
        } catch (RuntimeException e3) {
            throw new RuntimeException("Error in parsing " + str, e3);
        }
    }

    public static b[] f(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            bVarArr2[i2] = new b(bVarArr[i2]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[LOOP:0: B:2:0x0007->B:14:0x0038, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void g(String str, int i2, a aVar) {
        aVar.f1423b = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (int i3 = i2; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (charAt != ' ') {
                if (charAt != 'E' && charAt != 'e') {
                    switch (charAt) {
                        case ',':
                            break;
                        case '-':
                            if (i3 != i2) {
                            }
                            z2 = false;
                            break;
                        case '.':
                            if (!z3) {
                                z2 = false;
                                z3 = true;
                                break;
                            }
                            aVar.f1423b = true;
                            break;
                        default:
                            z2 = false;
                            break;
                    }
                } else {
                    z2 = true;
                }
                if (!z4) {
                    aVar.f1422a = i3;
                }
            }
            z2 = false;
            z4 = true;
            if (!z4) {
            }
        }
        aVar.f1422a = i3;
    }

    private static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i2 = 1;
            int i3 = 0;
            while (i2 < length) {
                g(str, i2, aVar);
                int i4 = aVar.f1422a;
                if (i2 < i4) {
                    fArr[i3] = Float.parseFloat(str.substring(i2, i4));
                    i3++;
                }
                i2 = aVar.f1423b ? i4 : i4 + 1;
            }
            return c(fArr, 0, i3);
        } catch (NumberFormatException e3) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e3);
        }
    }

    private static int i(String str, int i2) {
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i2;
            }
            i2++;
        }
        return i2;
    }

    public static void j(b[] bVarArr, b[] bVarArr2) {
        for (int i2 = 0; i2 < bVarArr2.length; i2++) {
            bVarArr[i2].f1424a = bVarArr2[i2].f1424a;
            int i3 = 0;
            while (true) {
                float[] fArr = bVarArr2[i2].f1425b;
                if (i3 < fArr.length) {
                    bVarArr[i2].f1425b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }
}
