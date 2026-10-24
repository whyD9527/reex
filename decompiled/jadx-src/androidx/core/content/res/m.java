package androidx.core.content.res;

/* loaded from: classes.dex */
final class m {

    /* renamed from: k, reason: collision with root package name */
    static final m f1405k = k(b.f1376c, (float) ((b.h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a, reason: collision with root package name */
    private final float f1406a;

    /* renamed from: b, reason: collision with root package name */
    private final float f1407b;

    /* renamed from: c, reason: collision with root package name */
    private final float f1408c;

    /* renamed from: d, reason: collision with root package name */
    private final float f1409d;

    /* renamed from: e, reason: collision with root package name */
    private final float f1410e;

    /* renamed from: f, reason: collision with root package name */
    private final float f1411f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f1412g;

    /* renamed from: h, reason: collision with root package name */
    private final float f1413h;

    /* renamed from: i, reason: collision with root package name */
    private final float f1414i;

    /* renamed from: j, reason: collision with root package name */
    private final float f1415j;

    private m(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.f1411f = f2;
        this.f1406a = f3;
        this.f1407b = f4;
        this.f1408c = f5;
        this.f1409d = f6;
        this.f1410e = f7;
        this.f1412g = fArr;
        this.f1413h = f8;
        this.f1414i = f9;
        this.f1415j = f10;
    }

    static m k(float[] fArr, float f2, float f3, float f4, boolean z2) {
        float[][] fArr2 = b.f1374a;
        float f5 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f6 = fArr3[0] * f5;
        float f7 = fArr[1];
        float f8 = f6 + (fArr3[1] * f7);
        float f9 = fArr[2];
        float f10 = f8 + (fArr3[2] * f9);
        float[] fArr4 = fArr2[1];
        float f11 = (fArr4[0] * f5) + (fArr4[1] * f7) + (fArr4[2] * f9);
        float[] fArr5 = fArr2[2];
        float f12 = (f5 * fArr5[0]) + (f7 * fArr5[1]) + (f9 * fArr5[2]);
        float f13 = (f4 / 10.0f) + 0.8f;
        float d3 = ((double) f13) >= 0.9d ? b.d(0.59f, 0.69f, (f13 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f13 - 0.8f) * 10.0f);
        float exp = z2 ? 1.0f : (1.0f - (((float) Math.exp(((-f2) - 42.0f) / 92.0f)) * 0.2777778f)) * f13;
        double d4 = exp;
        if (d4 > 1.0d) {
            exp = 1.0f;
        } else if (d4 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f10) * exp) + 1.0f) - exp, (((100.0f / f11) * exp) + 1.0f) - exp, (((100.0f / f12) * exp) + 1.0f) - exp};
        float f14 = 1.0f / ((5.0f * f2) + 1.0f);
        float f15 = f14 * f14 * f14 * f14;
        float f16 = 1.0f - f15;
        float cbrt = (f15 * f2) + (0.1f * f16 * f16 * ((float) Math.cbrt(f2 * 5.0d)));
        float h2 = b.h(f3) / fArr[1];
        double d5 = h2;
        float sqrt = ((float) Math.sqrt(d5)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d5, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f12) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f10) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f11) / 100.0d, 0.42d), pow2};
        float f17 = fArr7[0];
        float f18 = (f17 * 400.0f) / (f17 + 27.13f);
        float f19 = fArr7[1];
        return new m(h2, ((f18 * 2.0f) + ((f19 * 400.0f) / (f19 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, d3, f13, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    float a() {
        return this.f1406a;
    }

    float b() {
        return this.f1409d;
    }

    float c() {
        return this.f1413h;
    }

    float d() {
        return this.f1414i;
    }

    float e() {
        return this.f1411f;
    }

    float f() {
        return this.f1407b;
    }

    float g() {
        return this.f1410e;
    }

    float h() {
        return this.f1408c;
    }

    float[] i() {
        return this.f1412g;
    }

    float j() {
        return this.f1415j;
    }
}
