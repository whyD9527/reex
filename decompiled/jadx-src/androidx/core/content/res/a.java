package androidx.core.content.res;

/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private final float f1365a;

    /* renamed from: b, reason: collision with root package name */
    private final float f1366b;

    /* renamed from: c, reason: collision with root package name */
    private final float f1367c;

    /* renamed from: d, reason: collision with root package name */
    private final float f1368d;

    /* renamed from: e, reason: collision with root package name */
    private final float f1369e;

    /* renamed from: f, reason: collision with root package name */
    private final float f1370f;

    /* renamed from: g, reason: collision with root package name */
    private final float f1371g;

    /* renamed from: h, reason: collision with root package name */
    private final float f1372h;

    /* renamed from: i, reason: collision with root package name */
    private final float f1373i;

    a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.f1365a = f2;
        this.f1366b = f3;
        this.f1367c = f4;
        this.f1368d = f5;
        this.f1369e = f6;
        this.f1370f = f7;
        this.f1371g = f8;
        this.f1372h = f9;
        this.f1373i = f10;
    }

    private static a b(float f2, float f3, float f4) {
        float f5 = 1000.0f;
        float f6 = 0.0f;
        a aVar = null;
        float f7 = 100.0f;
        float f8 = 1000.0f;
        while (Math.abs(f6 - f7) > 0.01f) {
            float f9 = ((f7 - f6) / 2.0f) + f6;
            int p2 = e(f9, f3, f2).p();
            float b3 = b.b(p2);
            float abs = Math.abs(f4 - b3);
            if (abs < 0.2f) {
                a c3 = c(p2);
                float a3 = c3.a(e(c3.k(), c3.i(), f2));
                if (a3 <= 1.0f) {
                    aVar = c3;
                    f5 = abs;
                    f8 = a3;
                }
            }
            if (f5 == 0.0f && f8 == 0.0f) {
                break;
            }
            if (b3 < f4) {
                f6 = f9;
            } else {
                f7 = f9;
            }
        }
        return aVar;
    }

    static a c(int i2) {
        return d(i2, m.f1405k);
    }

    static a d(int i2, m mVar) {
        float[] f2 = b.f(i2);
        float[][] fArr = b.f1374a;
        float f3 = f2[0];
        float[] fArr2 = fArr[0];
        float f4 = fArr2[0] * f3;
        float f5 = f2[1];
        float f6 = f4 + (fArr2[1] * f5);
        float f7 = f2[2];
        float f8 = f6 + (fArr2[2] * f7);
        float[] fArr3 = fArr[1];
        float f9 = (fArr3[0] * f3) + (fArr3[1] * f5) + (fArr3[2] * f7);
        float[] fArr4 = fArr[2];
        float f10 = (f3 * fArr4[0]) + (f5 * fArr4[1]) + (f7 * fArr4[2]);
        float f11 = mVar.i()[0] * f8;
        float f12 = mVar.i()[1] * f9;
        float f13 = mVar.i()[2] * f10;
        float pow = (float) Math.pow((mVar.c() * Math.abs(f11)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((mVar.c() * Math.abs(f12)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((mVar.c() * Math.abs(f13)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f11) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f12) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f13) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d3 = signum3;
        float f14 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d3)) / 11.0f;
        float f15 = ((float) ((signum + signum2) - (d3 * 2.0d))) / 9.0f;
        float f16 = signum2 * 20.0f;
        float f17 = (((signum * 20.0f) + f16) + (21.0f * signum3)) / 20.0f;
        float f18 = (((signum * 40.0f) + f16) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f19 = atan2;
        float f20 = (3.1415927f * f19) / 180.0f;
        float pow4 = ((float) Math.pow((f18 * mVar.f()) / mVar.a(), mVar.b() * mVar.j())) * 100.0f;
        float d4 = mVar.d() * (4.0f / mVar.b()) * ((float) Math.sqrt(pow4 / 100.0f)) * (mVar.a() + 4.0f);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, mVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f19) < 20.14d ? 360.0f + f19 : f19) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * mVar.g()) * mVar.h()) * ((float) Math.sqrt((f14 * f14) + (f15 * f15)))) / (f17 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float d5 = pow5 * mVar.d();
        float sqrt = ((float) Math.sqrt((r2 * mVar.b()) / (mVar.a() + 4.0f))) * 50.0f;
        float f21 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * d5) + 1.0f)) * 43.85965f;
        double d6 = f20;
        return new a(f19, pow5, pow4, d4, d5, sqrt, f21, log * ((float) Math.cos(d6)), log * ((float) Math.sin(d6)));
    }

    private static a e(float f2, float f3, float f4) {
        return f(f2, f3, f4, m.f1405k);
    }

    private static a f(float f2, float f3, float f4, m mVar) {
        float b3 = (4.0f / mVar.b()) * ((float) Math.sqrt(f2 / 100.0d)) * (mVar.a() + 4.0f) * mVar.d();
        float d3 = f3 * mVar.d();
        float sqrt = ((float) Math.sqrt(((f3 / ((float) Math.sqrt(r4))) * mVar.b()) / (mVar.a() + 4.0f))) * 50.0f;
        float f5 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float log = ((float) Math.log((d3 * 0.0228d) + 1.0d)) * 43.85965f;
        double d4 = (3.1415927f * f4) / 180.0f;
        return new a(f4, f3, f2, b3, d3, sqrt, f5, log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    static int m(float f2, float f3, float f4) {
        return n(f2, f3, f4, m.f1405k);
    }

    static int n(float f2, float f3, float f4, m mVar) {
        if (f3 < 1.0d || Math.round(f4) <= 0.0d || Math.round(f4) >= 100.0d) {
            return b.a(f4);
        }
        float min = f2 < 0.0f ? 0.0f : Math.min(360.0f, f2);
        a aVar = null;
        boolean z2 = true;
        float f5 = 0.0f;
        float f6 = f3;
        while (Math.abs(f5 - f3) >= 0.4f) {
            a b3 = b(min, f6, f4);
            if (z2) {
                if (b3 != null) {
                    return b3.o(mVar);
                }
                z2 = false;
            } else if (b3 == null) {
                f3 = f6;
            } else {
                f5 = f6;
                aVar = b3;
            }
            f6 = ((f3 - f5) / 2.0f) + f5;
        }
        return aVar == null ? b.a(f4) : aVar.o(mVar);
    }

    float a(a aVar) {
        float l2 = l() - aVar.l();
        float g2 = g() - aVar.g();
        float h2 = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((l2 * l2) + (g2 * g2) + (h2 * h2)), 0.63d) * 1.41d);
    }

    float g() {
        return this.f1372h;
    }

    float h() {
        return this.f1373i;
    }

    float i() {
        return this.f1366b;
    }

    float j() {
        return this.f1365a;
    }

    float k() {
        return this.f1367c;
    }

    float l() {
        return this.f1371g;
    }

    int o(m mVar) {
        float pow = (float) Math.pow(((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, mVar.e()), 0.73d), 1.1111111111111112d);
        double j2 = (j() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + j2) + 3.8d)) * 0.25f;
        float a3 = mVar.a() * ((float) Math.pow(k() / 100.0d, (1.0d / mVar.b()) / mVar.j()));
        float g2 = cos * 3846.1538f * mVar.g() * mVar.h();
        float f2 = a3 / mVar.f();
        float sin = (float) Math.sin(j2);
        float cos2 = (float) Math.cos(j2);
        float f3 = (((0.305f + f2) * 23.0f) * pow) / (((g2 * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f4 = cos2 * f3;
        float f5 = f3 * sin;
        float f6 = f2 * 460.0f;
        float f7 = (((451.0f * f4) + f6) + (288.0f * f5)) / 1403.0f;
        float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
        float signum = Math.signum(f7) * (100.0f / mVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f7) * 27.13d) / (400.0d - Math.abs(f7))), 2.380952380952381d));
        float signum2 = Math.signum(f8) * (100.0f / mVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f8) * 27.13d) / (400.0d - Math.abs(f8))), 2.380952380952381d));
        float signum3 = Math.signum(((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f) * (100.0f / mVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r6) * 27.13d) / (400.0d - Math.abs(r6))), 2.380952380952381d));
        float f9 = signum / mVar.i()[0];
        float f10 = signum2 / mVar.i()[1];
        float f11 = signum3 / mVar.i()[2];
        float[][] fArr = b.f1375b;
        float[] fArr2 = fArr[0];
        float f12 = (fArr2[0] * f9) + (fArr2[1] * f10) + (fArr2[2] * f11);
        float[] fArr3 = fArr[1];
        float f13 = (fArr3[0] * f9) + (fArr3[1] * f10) + (fArr3[2] * f11);
        float[] fArr4 = fArr[2];
        return androidx.core.graphics.a.a(f12, f13, (f9 * fArr4[0]) + (f10 * fArr4[1]) + (f11 * fArr4[2]));
    }

    int p() {
        return o(m.f1405k);
    }
}
