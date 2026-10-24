package q;

import java.util.ArrayList;

/* loaded from: classes.dex */
class m {

    /* renamed from: h, reason: collision with root package name */
    public static int f4159h;

    /* renamed from: c, reason: collision with root package name */
    p f4162c;

    /* renamed from: d, reason: collision with root package name */
    p f4163d;

    /* renamed from: f, reason: collision with root package name */
    int f4165f;

    /* renamed from: g, reason: collision with root package name */
    int f4166g;

    /* renamed from: a, reason: collision with root package name */
    public int f4160a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4161b = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<p> f4164e = new ArrayList<>();

    public m(p pVar, int i2) {
        this.f4162c = null;
        this.f4163d = null;
        int i3 = f4159h;
        this.f4165f = i3;
        f4159h = i3 + 1;
        this.f4162c = pVar;
        this.f4163d = pVar;
        this.f4166g = i2;
    }

    private long c(f fVar, long j2) {
        p pVar = fVar.f4137d;
        if (pVar instanceof k) {
            return j2;
        }
        int size = fVar.f4144k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = fVar.f4144k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f4137d != pVar) {
                    j3 = Math.min(j3, c(fVar2, fVar2.f4139f + j2));
                }
            }
        }
        if (fVar != pVar.f4193i) {
            return j3;
        }
        long j4 = j2 - pVar.j();
        return Math.min(Math.min(j3, c(pVar.f4192h, j4)), j4 - pVar.f4192h.f4139f);
    }

    private long d(f fVar, long j2) {
        p pVar = fVar.f4137d;
        if (pVar instanceof k) {
            return j2;
        }
        int size = fVar.f4144k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = fVar.f4144k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f4137d != pVar) {
                    j3 = Math.max(j3, d(fVar2, fVar2.f4139f + j2));
                }
            }
        }
        if (fVar != pVar.f4192h) {
            return j3;
        }
        long j4 = j2 + pVar.j();
        return Math.max(Math.max(j3, d(pVar.f4193i, j4)), j4 - pVar.f4193i.f4139f);
    }

    public void a(p pVar) {
        this.f4164e.add(pVar);
        this.f4163d = pVar;
    }

    public long b(p.f fVar, int i2) {
        long j2;
        p pVar;
        long j3;
        long j4;
        p pVar2 = this.f4162c;
        if (pVar2 instanceof c) {
            if (((c) pVar2).f4190f != i2) {
                return 0L;
            }
        } else if (i2 == 0) {
            if (!(pVar2 instanceof l)) {
                return 0L;
            }
        } else if (!(pVar2 instanceof n)) {
            return 0L;
        }
        f fVar2 = (i2 == 0 ? fVar.f4048e : fVar.f4050f).f4192h;
        f fVar3 = (i2 == 0 ? fVar.f4048e : fVar.f4050f).f4193i;
        boolean contains = pVar2.f4192h.f4145l.contains(fVar2);
        boolean contains2 = this.f4162c.f4193i.f4145l.contains(fVar3);
        long j5 = this.f4162c.j();
        if (!contains || !contains2) {
            if (contains) {
                j4 = d(this.f4162c.f4192h, r12.f4139f);
                j3 = this.f4162c.f4192h.f4139f + j5;
            } else if (contains2) {
                j3 = (-this.f4162c.f4193i.f4139f) + j5;
                j4 = -c(this.f4162c.f4193i, r12.f4139f);
            } else {
                j2 = r12.f4192h.f4139f + this.f4162c.j();
                pVar = this.f4162c;
            }
            return Math.max(j4, j3);
        }
        long d3 = d(this.f4162c.f4192h, 0L);
        long c3 = c(this.f4162c.f4193i, 0L);
        long j6 = d3 - j5;
        p pVar3 = this.f4162c;
        int i3 = pVar3.f4193i.f4139f;
        if (j6 >= (-i3)) {
            j6 += i3;
        }
        int i4 = pVar3.f4192h.f4139f;
        long j7 = ((-c3) - j5) - i4;
        if (j7 >= i4) {
            j7 -= i4;
        }
        float o2 = pVar3.f4186b.o(i2);
        float f2 = o2 > 0.0f ? (long) ((j7 / o2) + (j6 / (1.0f - o2))) : 0L;
        long j8 = ((long) ((f2 * o2) + 0.5f)) + j5 + ((long) ((f2 * (1.0f - o2)) + 0.5f));
        pVar = this.f4162c;
        j2 = pVar.f4192h.f4139f + j8;
        return j2 - pVar.f4193i.f4139f;
    }
}
