package o;

import java.util.Arrays;
import java.util.Comparator;
import o.b;

/* loaded from: classes.dex */
public class h extends o.b {

    /* renamed from: g, reason: collision with root package name */
    private int f3905g;

    /* renamed from: h, reason: collision with root package name */
    private i[] f3906h;

    /* renamed from: i, reason: collision with root package name */
    private i[] f3907i;

    /* renamed from: j, reason: collision with root package name */
    private int f3908j;

    /* renamed from: k, reason: collision with root package name */
    b f3909k;

    /* renamed from: l, reason: collision with root package name */
    c f3910l;

    class a implements Comparator<i> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f3918c - iVar2.f3918c;
        }
    }

    class b implements Comparable {

        /* renamed from: e, reason: collision with root package name */
        i f3912e;

        /* renamed from: f, reason: collision with root package name */
        h f3913f;

        public b(h hVar) {
            this.f3913f = hVar;
        }

        public boolean a(i iVar, float f2) {
            boolean z2 = true;
            if (!this.f3912e.f3916a) {
                for (int i2 = 0; i2 < 9; i2++) {
                    float f3 = iVar.f3924i[i2];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f2;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        this.f3912e.f3924i[i2] = f4;
                    } else {
                        this.f3912e.f3924i[i2] = 0.0f;
                    }
                }
                return true;
            }
            for (int i3 = 0; i3 < 9; i3++) {
                float[] fArr = this.f3912e.f3924i;
                float f5 = fArr[i3] + (iVar.f3924i[i3] * f2);
                fArr[i3] = f5;
                if (Math.abs(f5) < 1.0E-4f) {
                    this.f3912e.f3924i[i3] = 0.0f;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                h.this.G(this.f3912e);
            }
            return false;
        }

        public void b(i iVar) {
            this.f3912e = iVar;
        }

        public final boolean c() {
            for (int i2 = 8; i2 >= 0; i2--) {
                float f2 = this.f3912e.f3924i[i2];
                if (f2 > 0.0f) {
                    return false;
                }
                if (f2 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f3912e.f3918c - ((i) obj).f3918c;
        }

        public final boolean d(i iVar) {
            int i2 = 8;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                float f2 = iVar.f3924i[i2];
                float f3 = this.f3912e.f3924i[i2];
                if (f3 == f2) {
                    i2--;
                } else if (f3 < f2) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f3912e.f3924i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f3912e != null) {
                for (int i2 = 0; i2 < 9; i2++) {
                    str = str + this.f3912e.f3924i[i2] + " ";
                }
            }
            return str + "] " + this.f3912e;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f3905g = 128;
        this.f3906h = new i[128];
        this.f3907i = new i[128];
        this.f3908j = 0;
        this.f3909k = new b(this);
        this.f3910l = cVar;
    }

    private final void F(i iVar) {
        int i2;
        int i3 = this.f3908j + 1;
        i[] iVarArr = this.f3906h;
        if (i3 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f3906h = iVarArr2;
            this.f3907i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f3906h;
        int i4 = this.f3908j;
        iVarArr3[i4] = iVar;
        int i5 = i4 + 1;
        this.f3908j = i5;
        if (i5 > 1 && iVarArr3[i5 - 1].f3918c > iVar.f3918c) {
            int i6 = 0;
            while (true) {
                i2 = this.f3908j;
                if (i6 >= i2) {
                    break;
                }
                this.f3907i[i6] = this.f3906h[i6];
                i6++;
            }
            Arrays.sort(this.f3907i, 0, i2, new a());
            for (int i7 = 0; i7 < this.f3908j; i7++) {
                this.f3906h[i7] = this.f3907i[i7];
            }
        }
        iVar.f3916a = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i2 = 0;
        while (i2 < this.f3908j) {
            if (this.f3906h[i2] == iVar) {
                while (true) {
                    int i3 = this.f3908j;
                    if (i2 >= i3 - 1) {
                        this.f3908j = i3 - 1;
                        iVar.f3916a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f3906h;
                        int i4 = i2 + 1;
                        iVarArr[i2] = iVarArr[i4];
                        i2 = i4;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // o.b
    public void B(d dVar, o.b bVar, boolean z2) {
        i iVar = bVar.f3867a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f3871e;
        int d3 = aVar.d();
        for (int i2 = 0; i2 < d3; i2++) {
            i h2 = aVar.h(i2);
            float a3 = aVar.a(i2);
            this.f3909k.b(h2);
            if (this.f3909k.a(iVar, a3)) {
                F(h2);
            }
            this.f3868b += bVar.f3868b * a3;
        }
        G(iVar);
    }

    @Override // o.b, o.d.a
    public void a(i iVar) {
        this.f3909k.b(iVar);
        this.f3909k.e();
        iVar.f3924i[iVar.f3920e] = 1.0f;
        F(iVar);
    }

    @Override // o.b, o.d.a
    public i b(d dVar, boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.f3908j; i3++) {
            i iVar = this.f3906h[i3];
            if (!zArr[iVar.f3918c]) {
                this.f3909k.b(iVar);
                b bVar = this.f3909k;
                if (i2 == -1) {
                    if (!bVar.c()) {
                    }
                    i2 = i3;
                } else {
                    if (!bVar.d(this.f3906h[i2])) {
                    }
                    i2 = i3;
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.f3906h[i2];
    }

    @Override // o.b, o.d.a
    public void clear() {
        this.f3908j = 0;
        this.f3868b = 0.0f;
    }

    @Override // o.b, o.d.a
    public boolean isEmpty() {
        return this.f3908j == 0;
    }

    @Override // o.b
    public String toString() {
        String str = " goal -> (" + this.f3868b + ") : ";
        for (int i2 = 0; i2 < this.f3908j; i2++) {
            this.f3909k.b(this.f3906h[i2]);
            str = str + this.f3909k + " ";
        }
        return str;
    }
}
