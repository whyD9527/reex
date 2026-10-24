package q;

import p.d;
import p.e;

/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f4185a;

    /* renamed from: b, reason: collision with root package name */
    p.e f4186b;

    /* renamed from: c, reason: collision with root package name */
    m f4187c;

    /* renamed from: d, reason: collision with root package name */
    protected e.b f4188d;

    /* renamed from: e, reason: collision with root package name */
    g f4189e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f4190f = 0;

    /* renamed from: g, reason: collision with root package name */
    boolean f4191g = false;

    /* renamed from: h, reason: collision with root package name */
    public f f4192h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public f f4193i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    protected b f4194j = b.NONE;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4195a;

        static {
            int[] iArr = new int[d.b.values().length];
            f4195a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4195a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4195a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4195a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4195a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(p.e eVar) {
        this.f4186b = eVar;
    }

    private void l(int i2, int i3) {
        g gVar;
        int g2;
        int i4 = this.f4185a;
        if (i4 != 0) {
            if (i4 == 1) {
                int g3 = g(this.f4189e.f4155m, i2);
                gVar = this.f4189e;
                g2 = Math.min(g3, i3);
                gVar.d(g2);
            }
            if (i4 != 2) {
                if (i4 != 3) {
                    return;
                }
                p.e eVar = this.f4186b;
                p pVar = eVar.f4048e;
                e.b bVar = pVar.f4188d;
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && pVar.f4185a == 3) {
                    n nVar = eVar.f4050f;
                    if (nVar.f4188d == bVar2 && nVar.f4185a == 3) {
                        return;
                    }
                }
                if (i2 == 0) {
                    pVar = eVar.f4050f;
                }
                if (pVar.f4189e.f4143j) {
                    float t2 = eVar.t();
                    this.f4189e.d(i2 == 1 ? (int) ((pVar.f4189e.f4140g / t2) + 0.5f) : (int) ((t2 * pVar.f4189e.f4140g) + 0.5f));
                    return;
                }
                return;
            }
            p.e I = this.f4186b.I();
            if (I == null) {
                return;
            }
            if (!(i2 == 0 ? I.f4048e : I.f4050f).f4189e.f4143j) {
                return;
            }
            p.e eVar2 = this.f4186b;
            i3 = (int) ((r9.f4140g * (i2 == 0 ? eVar2.f4080u : eVar2.f4086x)) + 0.5f);
        }
        gVar = this.f4189e;
        g2 = g(i3, i2);
        gVar.d(g2);
    }

    @Override // q.d
    public void a(d dVar) {
    }

    protected final void b(f fVar, f fVar2, int i2) {
        fVar.f4145l.add(fVar2);
        fVar.f4139f = i2;
        fVar2.f4144k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i2, g gVar) {
        fVar.f4145l.add(fVar2);
        fVar.f4145l.add(this.f4189e);
        fVar.f4141h = i2;
        fVar.f4142i = gVar;
        fVar2.f4144k.add(fVar);
        gVar.f4144k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i2, int i3) {
        int max;
        if (i3 == 0) {
            p.e eVar = this.f4186b;
            int i4 = eVar.f4078t;
            max = Math.max(eVar.f4076s, i2);
            if (i4 > 0) {
                max = Math.min(i4, i2);
            }
            if (max == i2) {
                return i2;
            }
        } else {
            p.e eVar2 = this.f4186b;
            int i5 = eVar2.f4084w;
            max = Math.max(eVar2.f4082v, i2);
            if (i5 > 0) {
                max = Math.min(i5, i2);
            }
            if (max == i2) {
                return i2;
            }
        }
        return max;
    }

    protected final f h(p.d dVar) {
        p pVar;
        p pVar2;
        p.d dVar2 = dVar.f4025f;
        if (dVar2 == null) {
            return null;
        }
        p.e eVar = dVar2.f4023d;
        int i2 = a.f4195a[dVar2.f4024e.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                pVar2 = eVar.f4048e;
            } else if (i2 == 3) {
                pVar = eVar.f4050f;
            } else {
                if (i2 == 4) {
                    return eVar.f4050f.f4167k;
                }
                if (i2 != 5) {
                    return null;
                }
                pVar2 = eVar.f4050f;
            }
            return pVar2.f4193i;
        }
        pVar = eVar.f4048e;
        return pVar.f4192h;
    }

    protected final f i(p.d dVar, int i2) {
        p.d dVar2 = dVar.f4025f;
        if (dVar2 == null) {
            return null;
        }
        p.e eVar = dVar2.f4023d;
        p pVar = i2 == 0 ? eVar.f4048e : eVar.f4050f;
        int i3 = a.f4195a[dVar2.f4024e.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f4193i;
        }
        return pVar.f4192h;
    }

    public long j() {
        if (this.f4189e.f4143j) {
            return r0.f4140g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f4191g;
    }

    abstract boolean m();

    protected void n(d dVar, p.d dVar2, p.d dVar3, int i2) {
        f fVar;
        f h2 = h(dVar2);
        f h3 = h(dVar3);
        if (h2.f4143j && h3.f4143j) {
            int e3 = h2.f4140g + dVar2.e();
            int e4 = h3.f4140g - dVar3.e();
            int i3 = e4 - e3;
            if (!this.f4189e.f4143j && this.f4188d == e.b.MATCH_CONSTRAINT) {
                l(i2, i3);
            }
            g gVar = this.f4189e;
            if (gVar.f4143j) {
                if (gVar.f4140g == i3) {
                    this.f4192h.d(e3);
                    fVar = this.f4193i;
                } else {
                    p.e eVar = this.f4186b;
                    float w2 = i2 == 0 ? eVar.w() : eVar.M();
                    if (h2 == h3) {
                        e3 = h2.f4140g;
                        e4 = h3.f4140g;
                        w2 = 0.5f;
                    }
                    this.f4192h.d((int) (e3 + 0.5f + (((e4 - e3) - this.f4189e.f4140g) * w2)));
                    fVar = this.f4193i;
                    e4 = this.f4192h.f4140g + this.f4189e.f4140g;
                }
                fVar.d(e4);
            }
        }
    }

    protected void o(d dVar) {
    }

    protected void p(d dVar) {
    }
}
