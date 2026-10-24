package o;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class i {

    /* renamed from: r, reason: collision with root package name */
    private static int f3915r = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3916a;

    /* renamed from: b, reason: collision with root package name */
    private String f3917b;

    /* renamed from: f, reason: collision with root package name */
    public float f3921f;

    /* renamed from: j, reason: collision with root package name */
    a f3925j;

    /* renamed from: c, reason: collision with root package name */
    public int f3918c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f3919d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f3920e = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3922g = false;

    /* renamed from: h, reason: collision with root package name */
    float[] f3923h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    float[] f3924i = new float[9];

    /* renamed from: k, reason: collision with root package name */
    b[] f3926k = new b[16];

    /* renamed from: l, reason: collision with root package name */
    int f3927l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3928m = 0;

    /* renamed from: n, reason: collision with root package name */
    boolean f3929n = false;

    /* renamed from: o, reason: collision with root package name */
    int f3930o = -1;

    /* renamed from: p, reason: collision with root package name */
    float f3931p = 0.0f;

    /* renamed from: q, reason: collision with root package name */
    HashSet<b> f3932q = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f3925j = aVar;
    }

    static void b() {
        f3915r++;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.f3927l;
            if (i2 >= i3) {
                b[] bVarArr = this.f3926k;
                if (i3 >= bVarArr.length) {
                    this.f3926k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f3926k;
                int i4 = this.f3927l;
                bVarArr2[i4] = bVar;
                this.f3927l = i4 + 1;
                return;
            }
            if (this.f3926k[i2] == bVar) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void c(b bVar) {
        int i2 = this.f3927l;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f3926k[i3] == bVar) {
                while (i3 < i2 - 1) {
                    b[] bVarArr = this.f3926k;
                    int i4 = i3 + 1;
                    bVarArr[i3] = bVarArr[i4];
                    i3 = i4;
                }
                this.f3927l--;
                return;
            }
            i3++;
        }
    }

    public void d() {
        this.f3917b = null;
        this.f3925j = a.UNKNOWN;
        this.f3920e = 0;
        this.f3918c = -1;
        this.f3919d = -1;
        this.f3921f = 0.0f;
        this.f3922g = false;
        this.f3929n = false;
        this.f3930o = -1;
        this.f3931p = 0.0f;
        int i2 = this.f3927l;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f3926k[i3] = null;
        }
        this.f3927l = 0;
        this.f3928m = 0;
        this.f3916a = false;
        Arrays.fill(this.f3924i, 0.0f);
    }

    public void e(d dVar, float f2) {
        this.f3921f = f2;
        this.f3922g = true;
        this.f3929n = false;
        this.f3930o = -1;
        this.f3931p = 0.0f;
        int i2 = this.f3927l;
        this.f3919d = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f3926k[i3].A(dVar, this, false);
        }
        this.f3927l = 0;
    }

    public void f(a aVar, String str) {
        this.f3925j = aVar;
    }

    public final void g(d dVar, b bVar) {
        int i2 = this.f3927l;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f3926k[i3].B(dVar, bVar, false);
        }
        this.f3927l = 0;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f3917b != null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f3917b);
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f3918c);
        }
        return sb.toString();
    }
}
