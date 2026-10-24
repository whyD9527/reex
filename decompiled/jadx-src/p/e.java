package p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p.d;
import q.n;
import q.p;

/* loaded from: classes.dex */
public class e {
    public static float C0 = 0.5f;
    public int A0;
    public int B0;
    private boolean D;
    public d O;
    public d[] P;
    protected ArrayList<d> Q;
    private boolean[] R;
    public b[] S;
    public e T;
    int U;
    int V;
    public float W;
    protected int X;
    protected int Y;
    protected int Z;

    /* renamed from: a0, reason: collision with root package name */
    int f4041a0;

    /* renamed from: b0, reason: collision with root package name */
    int f4043b0;

    /* renamed from: c, reason: collision with root package name */
    public q.c f4044c;

    /* renamed from: c0, reason: collision with root package name */
    protected int f4045c0;

    /* renamed from: d, reason: collision with root package name */
    public q.c f4046d;

    /* renamed from: d0, reason: collision with root package name */
    protected int f4047d0;

    /* renamed from: e0, reason: collision with root package name */
    int f4049e0;

    /* renamed from: f0, reason: collision with root package name */
    protected int f4051f0;

    /* renamed from: g0, reason: collision with root package name */
    protected int f4053g0;

    /* renamed from: h0, reason: collision with root package name */
    float f4055h0;

    /* renamed from: i0, reason: collision with root package name */
    float f4057i0;

    /* renamed from: j0, reason: collision with root package name */
    private Object f4059j0;

    /* renamed from: k0, reason: collision with root package name */
    private int f4061k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f4063l0;

    /* renamed from: m0, reason: collision with root package name */
    private String f4065m0;

    /* renamed from: n0, reason: collision with root package name */
    private String f4067n0;

    /* renamed from: o0, reason: collision with root package name */
    boolean f4069o0;

    /* renamed from: p0, reason: collision with root package name */
    boolean f4071p0;

    /* renamed from: q0, reason: collision with root package name */
    boolean f4073q0;

    /* renamed from: r0, reason: collision with root package name */
    int f4075r0;

    /* renamed from: s0, reason: collision with root package name */
    int f4077s0;

    /* renamed from: t0, reason: collision with root package name */
    boolean f4079t0;

    /* renamed from: u0, reason: collision with root package name */
    boolean f4081u0;

    /* renamed from: v0, reason: collision with root package name */
    public float[] f4083v0;

    /* renamed from: w0, reason: collision with root package name */
    protected e[] f4085w0;

    /* renamed from: x0, reason: collision with root package name */
    protected e[] f4087x0;

    /* renamed from: y0, reason: collision with root package name */
    e f4089y0;

    /* renamed from: z0, reason: collision with root package name */
    e f4091z0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f4040a = false;

    /* renamed from: b, reason: collision with root package name */
    public p[] f4042b = new p[2];

    /* renamed from: e, reason: collision with root package name */
    public q.l f4048e = null;

    /* renamed from: f, reason: collision with root package name */
    public n f4050f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f4052g = {true, true};

    /* renamed from: h, reason: collision with root package name */
    boolean f4054h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4056i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f4058j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4060k = true;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4062l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f4064m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f4066n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f4068o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f4070p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f4072q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int[] f4074r = new int[2];

    /* renamed from: s, reason: collision with root package name */
    public int f4076s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f4078t = 0;

    /* renamed from: u, reason: collision with root package name */
    public float f4080u = 1.0f;

    /* renamed from: v, reason: collision with root package name */
    public int f4082v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f4084w = 0;

    /* renamed from: x, reason: collision with root package name */
    public float f4086x = 1.0f;

    /* renamed from: y, reason: collision with root package name */
    int f4088y = -1;

    /* renamed from: z, reason: collision with root package name */
    float f4090z = 1.0f;
    private int[] A = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    private float B = 0.0f;
    private boolean C = false;
    private boolean E = false;
    private int F = 0;
    private int G = 0;
    public d H = new d(this, d.b.LEFT);
    public d I = new d(this, d.b.TOP);
    public d J = new d(this, d.b.RIGHT);
    public d K = new d(this, d.b.BOTTOM);
    public d L = new d(this, d.b.BASELINE);
    d M = new d(this, d.b.CENTER_X);
    d N = new d(this, d.b.CENTER_Y);

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4092a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f4093b;

        static {
            int[] iArr = new int[b.values().length];
            f4093b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4093b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4093b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4093b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f4092a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4092a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4092a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4092a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4092a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4092a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4092a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4092a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4092a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.O = dVar;
        this.P = new d[]{this.H, this.J, this.I, this.K, this.L, dVar};
        this.Q = new ArrayList<>();
        this.R = new boolean[2];
        b bVar = b.FIXED;
        this.S = new b[]{bVar, bVar};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f4041a0 = 0;
        this.f4043b0 = 0;
        this.f4045c0 = 0;
        this.f4047d0 = 0;
        this.f4049e0 = 0;
        float f2 = C0;
        this.f4055h0 = f2;
        this.f4057i0 = f2;
        this.f4061k0 = 0;
        this.f4063l0 = 0;
        this.f4065m0 = null;
        this.f4067n0 = null;
        this.f4073q0 = false;
        this.f4075r0 = 0;
        this.f4077s0 = 0;
        this.f4083v0 = new float[]{-1.0f, -1.0f};
        this.f4085w0 = new e[]{null, null};
        this.f4087x0 = new e[]{null, null};
        this.f4089y0 = null;
        this.f4091z0 = null;
        this.A0 = -1;
        this.B0 = -1;
        d();
    }

    private boolean Y(int i2) {
        d dVar;
        d dVar2;
        int i3 = i2 * 2;
        d[] dVarArr = this.P;
        d dVar3 = dVarArr[i3];
        d dVar4 = dVar3.f4025f;
        return (dVar4 == null || dVar4.f4025f == dVar3 || (dVar2 = (dVar = dVarArr[i3 + 1]).f4025f) == null || dVar2.f4025f != dVar) ? false : true;
    }

    private void d() {
        this.Q.add(this.H);
        this.Q.add(this.I);
        this.Q.add(this.J);
        this.Q.add(this.K);
        this.Q.add(this.M);
        this.Q.add(this.N);
        this.Q.add(this.O);
        this.Q.add(this.L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x050d, code lost:
    
        if (r1[r30] == r6) goto L347;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0370 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0408 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0483 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x04dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void i(o.d dVar, boolean z2, boolean z3, boolean z4, boolean z5, o.i iVar, o.i iVar2, b bVar, boolean z6, d dVar2, d dVar3, int i2, int i3, int i4, int i5, float f2, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i6, int i7, int i8, int i9, float f3, boolean z12) {
        int i10;
        boolean z13;
        int i11;
        o.i iVar3;
        int i12;
        int i13;
        int i14;
        o.i iVar4;
        o.i iVar5;
        o.i iVar6;
        int i15;
        int i16;
        boolean z14;
        boolean z15;
        o.i q2;
        e eVar;
        d.b bVar2;
        o.i iVar7;
        o.i iVar8;
        o.i iVar9;
        o.i iVar10;
        int i17;
        int i18;
        int i19;
        int i20;
        d dVar4;
        int i21;
        boolean z16;
        o.i iVar11;
        char c3;
        boolean z17;
        boolean z18;
        int i22;
        boolean z19;
        o.i iVar12;
        int i23;
        int i24;
        int i25;
        boolean z20;
        o.i iVar13;
        e eVar2;
        boolean z21;
        e eVar3;
        o.i iVar14;
        int i26;
        int i27;
        e eVar4;
        boolean z22;
        boolean z23;
        o.i iVar15;
        int i28;
        int i29;
        int i30;
        int i31;
        e eVar5;
        int i32;
        boolean z24;
        int i33;
        int i34;
        boolean z25;
        boolean z26;
        boolean z27;
        int i35;
        int i36;
        e eVar6;
        e eVar7;
        o.i q3 = dVar.q(dVar2);
        o.i q4 = dVar.q(dVar3);
        o.i q5 = dVar.q(dVar2.i());
        o.i q6 = dVar.q(dVar3.i());
        o.d.w();
        boolean n2 = dVar2.n();
        boolean n3 = dVar3.n();
        boolean n4 = this.O.n();
        int i37 = n3 ? (n2 ? 1 : 0) + 1 : n2 ? 1 : 0;
        if (n4) {
            i37++;
        }
        int i38 = z7 ? 3 : i6;
        int i39 = a.f4093b[bVar.ordinal()];
        if (i39 == 1 || i39 == 2 || i39 == 3 || i39 != 4) {
            i10 = i38;
        } else {
            i10 = i38;
            if (i10 != 4) {
                z13 = true;
                if (this.f4063l0 != 8) {
                    i11 = 0;
                    z13 = false;
                } else {
                    i11 = i3;
                }
                if (z12) {
                    iVar3 = q6;
                    i12 = 8;
                } else {
                    if (!n2 && !n3 && !n4) {
                        dVar.f(q3, i2);
                    } else if (n2 && !n3) {
                        iVar3 = q6;
                        i12 = 8;
                        dVar.e(q3, q5, dVar2.e(), 8);
                    }
                    iVar3 = q6;
                    i12 = 8;
                }
                if (z13) {
                    if (z6) {
                        dVar.e(q4, q3, 0, 3);
                        if (i4 > 0) {
                            dVar.h(q4, q3, i4, 8);
                        }
                        if (i5 < Integer.MAX_VALUE) {
                            dVar.j(q4, q3, i5, 8);
                        }
                    } else {
                        dVar.e(q4, q3, i11, i12);
                    }
                    i16 = i8;
                    i13 = i9;
                    iVar4 = q5;
                    iVar5 = q4;
                } else {
                    if (i37 != 2 && !z7 && (i10 == 1 || i10 == 0)) {
                        int max = Math.max(i8, i11);
                        if (i9 > 0) {
                            max = Math.min(i9, max);
                        }
                        dVar.e(q4, q3, max, 8);
                        z15 = z5;
                        i16 = i8;
                        i13 = i9;
                        iVar4 = q5;
                        iVar5 = q4;
                        iVar6 = iVar3;
                        z14 = false;
                        i15 = i37;
                        if (z12) {
                        }
                        if (i20 >= i18) {
                            return;
                        } else {
                            return;
                        }
                    }
                    int i40 = i8 == -2 ? i11 : i8;
                    i13 = i9 == -2 ? i11 : i9;
                    if (i11 > 0 && i10 != 1) {
                        i11 = 0;
                    }
                    if (i40 > 0) {
                        dVar.h(q4, q3, i40, 8);
                        i11 = Math.max(i11, i40);
                    }
                    if (i13 > 0) {
                        if ((z3 && i10 == 1) ? false : true) {
                            i14 = 8;
                            dVar.j(q4, q3, i13, 8);
                        } else {
                            i14 = 8;
                        }
                        i11 = Math.min(i11, i13);
                    } else {
                        i14 = 8;
                    }
                    if (i10 != 1) {
                        if (i10 == 2) {
                            d.b j2 = dVar2.j();
                            d.b bVar3 = d.b.TOP;
                            if (j2 == bVar3 || dVar2.j() == d.b.BOTTOM) {
                                q2 = dVar.q(this.T.m(bVar3));
                                eVar = this.T;
                                bVar2 = d.b.BOTTOM;
                            } else {
                                q2 = dVar.q(this.T.m(d.b.LEFT));
                                eVar = this.T;
                                bVar2 = d.b.RIGHT;
                            }
                            int i41 = i40;
                            iVar6 = iVar3;
                            iVar4 = q5;
                            i15 = i37;
                            iVar5 = q4;
                            dVar.d(dVar.r().k(q4, q3, dVar.q(eVar.m(bVar2)), q2, f3));
                            z15 = z5;
                            i16 = i41;
                            z14 = false;
                        } else {
                            iVar4 = q5;
                            iVar5 = q4;
                            int i42 = i40;
                            iVar6 = iVar3;
                            i15 = i37;
                            i16 = i42;
                            z14 = z13;
                            z15 = true;
                        }
                        if (z12) {
                            iVar7 = iVar2;
                            iVar8 = iVar5;
                            iVar9 = q3;
                            iVar10 = iVar;
                            i17 = 0;
                            i18 = 2;
                            i19 = 1;
                            i20 = i15;
                        } else if (z9) {
                            iVar7 = iVar2;
                            iVar8 = iVar5;
                            iVar9 = q3;
                            iVar10 = iVar;
                            i20 = i15;
                            i17 = 0;
                            i18 = 2;
                            i19 = 1;
                        } else {
                            if ((n2 || n3 || n4) && (!n2 || n3)) {
                                if (n2 || !n3) {
                                    i21 = 0;
                                    if (n2 && n3) {
                                        e eVar8 = dVar2.f4025f.f4023d;
                                        e eVar9 = dVar3.f4025f.f4023d;
                                        e I = I();
                                        int i43 = 6;
                                        if (z14) {
                                            if (i10 == 0) {
                                                if (i13 != 0 || i16 != 0) {
                                                    z25 = false;
                                                    z26 = true;
                                                    z27 = true;
                                                    i35 = 5;
                                                    i36 = 5;
                                                } else if (iVar4.f3922g && iVar6.f3922g) {
                                                    dVar.e(q3, iVar4, dVar2.e(), 8);
                                                    dVar.e(iVar5, iVar6, -dVar3.e(), 8);
                                                    return;
                                                } else {
                                                    z26 = false;
                                                    z27 = false;
                                                    z25 = true;
                                                    i35 = 8;
                                                    i36 = 8;
                                                }
                                                if ((eVar8 instanceof p.a) || (eVar9 instanceof p.a)) {
                                                    i22 = 6;
                                                    z18 = z27;
                                                    i25 = i35;
                                                    z16 = true;
                                                    i24 = 4;
                                                    z17 = z26;
                                                    z19 = z25;
                                                    c3 = 3;
                                                    iVar11 = iVar2;
                                                    if (z18 || iVar4 != iVar6 || eVar8 == I) {
                                                        z20 = z16;
                                                    } else {
                                                        z18 = false;
                                                        z20 = false;
                                                    }
                                                    if (z17) {
                                                        if (z14 || z8 || z10 || iVar4 != iVar || iVar6 != iVar11) {
                                                            z22 = z3;
                                                        } else {
                                                            z22 = false;
                                                            i22 = 8;
                                                            i25 = 8;
                                                            z20 = false;
                                                        }
                                                        iVar13 = iVar5;
                                                        z21 = z16;
                                                        i27 = 4;
                                                        i26 = i10;
                                                        eVar4 = eVar9;
                                                        eVar3 = eVar8;
                                                        eVar2 = I;
                                                        iVar14 = q3;
                                                        dVar.c(q3, iVar4, dVar2.e(), f2, iVar6, iVar13, dVar3.e(), i22);
                                                    } else {
                                                        iVar13 = iVar5;
                                                        eVar2 = I;
                                                        z21 = z16;
                                                        eVar3 = eVar8;
                                                        iVar14 = q3;
                                                        i26 = i10;
                                                        i27 = 4;
                                                        eVar4 = eVar9;
                                                        z22 = z3;
                                                    }
                                                    z23 = z20;
                                                    if (this.f4063l0 == 8 || dVar3.l()) {
                                                        if (z18) {
                                                            int i44 = (!z22 || iVar4 == iVar6 || z14 || !((eVar3 instanceof p.a) || (eVar4 instanceof p.a))) ? i25 : 6;
                                                            dVar.h(iVar14, iVar4, dVar2.e(), i44);
                                                            iVar15 = iVar13;
                                                            dVar.j(iVar15, iVar6, -dVar3.e(), i44);
                                                            i25 = i44;
                                                        } else {
                                                            iVar15 = iVar13;
                                                        }
                                                        if (z22 || !z11 || (eVar3 instanceof p.a) || (eVar4 instanceof p.a)) {
                                                            i28 = i24;
                                                            i29 = i25;
                                                        } else {
                                                            i28 = 6;
                                                            i29 = 6;
                                                            z23 = z21;
                                                        }
                                                        if (z23) {
                                                            if (!z19 || (z10 && !z4)) {
                                                                eVar5 = eVar2;
                                                            } else {
                                                                eVar5 = eVar2;
                                                                if (eVar3 != eVar5 && eVar4 != eVar5) {
                                                                    i43 = i28;
                                                                }
                                                                if ((eVar3 instanceof g) || (eVar4 instanceof g)) {
                                                                    i43 = 5;
                                                                }
                                                                if ((eVar3 instanceof p.a) || (eVar4 instanceof p.a)) {
                                                                    i43 = 5;
                                                                }
                                                                i28 = Math.max(z10 ? 5 : i43, i28);
                                                            }
                                                            if (z22) {
                                                                i28 = Math.min(i29, i28);
                                                                if (z7 && !z10 && (eVar3 == eVar5 || eVar4 == eVar5)) {
                                                                    i32 = i27;
                                                                    dVar.e(iVar14, iVar4, dVar2.e(), i32);
                                                                    dVar.e(iVar15, iVar6, -dVar3.e(), i32);
                                                                }
                                                            }
                                                            i32 = i28;
                                                            dVar.e(iVar14, iVar4, dVar2.e(), i32);
                                                            dVar.e(iVar15, iVar6, -dVar3.e(), i32);
                                                        }
                                                        if (z22) {
                                                            int e3 = iVar == iVar4 ? dVar2.e() : 0;
                                                            if (iVar4 != iVar) {
                                                                dVar.h(iVar14, iVar, e3, 5);
                                                            }
                                                        }
                                                        if (!z22 && z14 && i4 == 0 && i16 == 0) {
                                                            if (z14 && i26 == 3) {
                                                                i31 = 8;
                                                                i30 = 0;
                                                            } else {
                                                                i30 = 0;
                                                                i31 = 5;
                                                            }
                                                            dVar.h(iVar15, iVar14, i30, i31);
                                                        } else {
                                                            i30 = 0;
                                                        }
                                                        if (z22 && z15) {
                                                            if (dVar3.f4025f != null) {
                                                                i30 = dVar3.e();
                                                            }
                                                            if (iVar6 != iVar2) {
                                                                if (!this.f4058j || !iVar15.f3922g || (eVar7 = this.T) == null) {
                                                                    dVar.h(iVar2, iVar15, i30, 5);
                                                                    return;
                                                                }
                                                                f fVar = (f) eVar7;
                                                                if (z2) {
                                                                    fVar.h1(dVar3);
                                                                    return;
                                                                } else {
                                                                    fVar.m1(dVar3);
                                                                    return;
                                                                }
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                z18 = z27;
                                                i25 = i35;
                                                i24 = i36;
                                                z16 = true;
                                                z17 = z26;
                                                z19 = z25;
                                            } else {
                                                if (i10 == 1) {
                                                    iVar11 = iVar2;
                                                    i22 = 6;
                                                    c3 = 3;
                                                    z16 = true;
                                                    z17 = true;
                                                    z19 = false;
                                                    z18 = true;
                                                    i24 = 4;
                                                } else if (i10 != 3) {
                                                    z16 = true;
                                                    c3 = 3;
                                                    i22 = 6;
                                                    z17 = false;
                                                    z19 = false;
                                                    z18 = false;
                                                    i24 = 4;
                                                    i25 = 5;
                                                    iVar11 = iVar2;
                                                    if (z18) {
                                                    }
                                                    z20 = z16;
                                                    if (z17) {
                                                    }
                                                    z23 = z20;
                                                    if (this.f4063l0 == 8) {
                                                    }
                                                    if (z18) {
                                                    }
                                                    if (z22) {
                                                    }
                                                    i28 = i24;
                                                    i29 = i25;
                                                    if (z23) {
                                                    }
                                                    if (z22) {
                                                    }
                                                    if (!z22) {
                                                    }
                                                    i30 = 0;
                                                    if (z22) {
                                                    }
                                                } else if (this.f4088y == -1) {
                                                    iVar11 = iVar2;
                                                    c3 = 3;
                                                    z16 = true;
                                                    z17 = true;
                                                    z19 = true;
                                                    z18 = true;
                                                    i22 = z10 ? z3 ? 5 : 4 : 8;
                                                    i24 = 5;
                                                } else if (z7) {
                                                    if (i7 != 2) {
                                                        z16 = true;
                                                        if (i7 != 1) {
                                                            z24 = false;
                                                            if (z24) {
                                                                i33 = 8;
                                                                i34 = 5;
                                                            } else {
                                                                i33 = 5;
                                                                i34 = 4;
                                                            }
                                                            i25 = i33;
                                                            i24 = i34;
                                                            z17 = z16;
                                                            z19 = z17;
                                                            z18 = z19;
                                                        }
                                                    } else {
                                                        z16 = true;
                                                    }
                                                    z24 = z16;
                                                    if (z24) {
                                                    }
                                                    i25 = i33;
                                                    i24 = i34;
                                                    z17 = z16;
                                                    z19 = z17;
                                                    z18 = z19;
                                                } else {
                                                    z16 = true;
                                                    if (i13 > 0) {
                                                        iVar11 = iVar2;
                                                        z17 = true;
                                                        z19 = true;
                                                        z18 = true;
                                                        i22 = 6;
                                                        c3 = 3;
                                                        i24 = 5;
                                                    } else if (i13 != 0 || i16 != 0) {
                                                        iVar11 = iVar2;
                                                        z17 = true;
                                                        z19 = true;
                                                        z18 = true;
                                                        i22 = 6;
                                                        c3 = 3;
                                                    } else {
                                                        if (z10) {
                                                            iVar11 = iVar2;
                                                            i25 = (eVar8 == I || eVar9 == I) ? 5 : 4;
                                                            z17 = true;
                                                            z19 = true;
                                                            z18 = true;
                                                            i22 = 6;
                                                            c3 = 3;
                                                            i24 = 4;
                                                            if (z18) {
                                                            }
                                                            z20 = z16;
                                                            if (z17) {
                                                            }
                                                            z23 = z20;
                                                            if (this.f4063l0 == 8) {
                                                            }
                                                            if (z18) {
                                                            }
                                                            if (z22) {
                                                            }
                                                            i28 = i24;
                                                            i29 = i25;
                                                            if (z23) {
                                                            }
                                                            if (z22) {
                                                            }
                                                            if (!z22) {
                                                            }
                                                            i30 = 0;
                                                            if (z22) {
                                                                return;
                                                            } else {
                                                                return;
                                                            }
                                                        }
                                                        iVar11 = iVar2;
                                                        z17 = true;
                                                        z19 = true;
                                                        z18 = true;
                                                        i22 = 6;
                                                        c3 = 3;
                                                        i24 = 8;
                                                    }
                                                    i25 = 5;
                                                    if (z18) {
                                                    }
                                                    z20 = z16;
                                                    if (z17) {
                                                    }
                                                    z23 = z20;
                                                    if (this.f4063l0 == 8) {
                                                    }
                                                    if (z18) {
                                                    }
                                                    if (z22) {
                                                    }
                                                    i28 = i24;
                                                    i29 = i25;
                                                    if (z23) {
                                                    }
                                                    if (z22) {
                                                    }
                                                    if (!z22) {
                                                    }
                                                    i30 = 0;
                                                    if (z22) {
                                                    }
                                                }
                                                i25 = 8;
                                                if (z18) {
                                                }
                                                z20 = z16;
                                                if (z17) {
                                                }
                                                z23 = z20;
                                                if (this.f4063l0 == 8) {
                                                }
                                                if (z18) {
                                                }
                                                if (z22) {
                                                }
                                                i28 = i24;
                                                i29 = i25;
                                                if (z23) {
                                                }
                                                if (z22) {
                                                }
                                                if (!z22) {
                                                }
                                                i30 = 0;
                                                if (z22) {
                                                }
                                            }
                                            i22 = 6;
                                            c3 = 3;
                                            iVar11 = iVar2;
                                            if (z18) {
                                            }
                                            z20 = z16;
                                            if (z17) {
                                            }
                                            z23 = z20;
                                            if (this.f4063l0 == 8) {
                                            }
                                            if (z18) {
                                            }
                                            if (z22) {
                                            }
                                            i28 = i24;
                                            i29 = i25;
                                            if (z23) {
                                            }
                                            if (z22) {
                                            }
                                            if (!z22) {
                                            }
                                            i30 = 0;
                                            if (z22) {
                                            }
                                        } else {
                                            z16 = true;
                                            if (iVar4.f3922g && iVar6.f3922g) {
                                                dVar.c(q3, iVar4, dVar2.e(), f2, iVar6, iVar5, dVar3.e(), 8);
                                                if (z3 && z15) {
                                                    if (dVar3.f4025f != null) {
                                                        i23 = dVar3.e();
                                                        iVar12 = iVar2;
                                                    } else {
                                                        iVar12 = iVar2;
                                                        i23 = 0;
                                                    }
                                                    if (iVar6 != iVar12) {
                                                        dVar.h(iVar12, iVar5, i23, 5);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            iVar11 = iVar2;
                                            c3 = 3;
                                            z17 = true;
                                            z18 = true;
                                            i22 = 6;
                                            z19 = false;
                                        }
                                        i24 = 4;
                                        i25 = 5;
                                        if (z18) {
                                        }
                                        z20 = z16;
                                        if (z17) {
                                        }
                                        z23 = z20;
                                        if (this.f4063l0 == 8) {
                                        }
                                        if (z18) {
                                        }
                                        if (z22) {
                                        }
                                        i28 = i24;
                                        i29 = i25;
                                        if (z23) {
                                        }
                                        if (z22) {
                                        }
                                        if (!z22) {
                                        }
                                        i30 = 0;
                                        if (z22) {
                                        }
                                    }
                                } else {
                                    dVar.e(iVar5, iVar6, -dVar3.e(), 8);
                                    if (z3) {
                                        if (this.f4058j && q3.f3922g && (eVar6 = this.T) != null) {
                                            f fVar2 = (f) eVar6;
                                            if (z2) {
                                                fVar2.i1(dVar2);
                                            } else {
                                                fVar2.n1(dVar2);
                                            }
                                        } else {
                                            i21 = 0;
                                            dVar.h(q3, iVar, 0, 5);
                                        }
                                    }
                                }
                                iVar15 = iVar5;
                                i30 = i21;
                                z22 = z3;
                                if (z22) {
                                }
                            }
                            iVar15 = iVar5;
                            i30 = 0;
                            z22 = z3;
                            if (z22) {
                            }
                        }
                        if (i20 >= i18 && z3 && z15) {
                            dVar.h(iVar9, iVar10, i17, 8);
                            int i45 = (z2 || this.L.f4025f == null) ? i19 : i17;
                            if (z2 || (dVar4 = this.L.f4025f) == null) {
                                i19 = i45;
                            } else {
                                e eVar10 = dVar4.f4023d;
                                if (eVar10.W != 0.0f) {
                                    b[] bVarArr = eVar10.S;
                                    b bVar4 = bVarArr[i17];
                                    b bVar5 = b.MATCH_CONSTRAINT;
                                    if (bVar4 == bVar5) {
                                    }
                                }
                                i19 = i17;
                            }
                            if (i19 != 0) {
                                dVar.h(iVar7, iVar8, i17, 8);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (z3) {
                        dVar.e(q4, q3, i11, i14);
                    } else {
                        dVar.e(q4, q3, i11, 5);
                        dVar.j(q4, q3, i11, i14);
                    }
                    iVar4 = q5;
                    iVar5 = q4;
                    i16 = i40;
                }
                z14 = z13;
                iVar6 = iVar3;
                z15 = z5;
                i15 = i37;
                if (z12) {
                }
                if (i20 >= i18) {
                }
            }
        }
        z13 = false;
        if (this.f4063l0 != 8) {
        }
        if (z12) {
        }
        if (z13) {
        }
        z14 = z13;
        iVar6 = iVar3;
        z15 = z5;
        i15 = i37;
        if (z12) {
        }
        if (i20 >= i18) {
        }
    }

    public int A() {
        return this.F;
    }

    public void A0(int i2, int i3, int i4, float f2) {
        this.f4070p = i2;
        this.f4076s = i3;
        if (i4 == Integer.MAX_VALUE) {
            i4 = 0;
        }
        this.f4078t = i4;
        this.f4080u = f2;
        if (f2 <= 0.0f || f2 >= 1.0f || i2 != 0) {
            return;
        }
        this.f4070p = 2;
    }

    public int B() {
        return this.G;
    }

    public void B0(float f2) {
        this.f4083v0[0] = f2;
    }

    public int C(int i2) {
        if (i2 == 0) {
            return R();
        }
        if (i2 == 1) {
            return v();
        }
        return 0;
    }

    protected void C0(int i2, boolean z2) {
        this.R[i2] = z2;
    }

    public int D() {
        return this.A[1];
    }

    public void D0(boolean z2) {
        this.D = z2;
    }

    public int E() {
        return this.A[0];
    }

    public void E0(boolean z2) {
        this.E = z2;
    }

    public int F() {
        return this.f4053g0;
    }

    public void F0(int i2, int i3) {
        this.F = i2;
        this.G = i3;
        I0(false);
    }

    public int G() {
        return this.f4051f0;
    }

    public void G0(int i2) {
        this.A[1] = i2;
    }

    public e H(int i2) {
        d dVar;
        d dVar2;
        if (i2 != 0) {
            if (i2 == 1 && (dVar2 = (dVar = this.K).f4025f) != null && dVar2.f4025f == dVar) {
                return dVar2.f4023d;
            }
            return null;
        }
        d dVar3 = this.J;
        d dVar4 = dVar3.f4025f;
        if (dVar4 == null || dVar4.f4025f != dVar3) {
            return null;
        }
        return dVar4.f4023d;
    }

    public void H0(int i2) {
        this.A[0] = i2;
    }

    public e I() {
        return this.T;
    }

    public void I0(boolean z2) {
        this.f4056i = z2;
    }

    public e J(int i2) {
        d dVar;
        d dVar2;
        if (i2 != 0) {
            if (i2 == 1 && (dVar2 = (dVar = this.I).f4025f) != null && dVar2.f4025f == dVar) {
                return dVar2.f4023d;
            }
            return null;
        }
        d dVar3 = this.H;
        d dVar4 = dVar3.f4025f;
        if (dVar4 == null || dVar4.f4025f != dVar3) {
            return null;
        }
        return dVar4.f4023d;
    }

    public void J0(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.f4053g0 = i2;
    }

    public int K() {
        return S() + this.U;
    }

    public void K0(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.f4051f0 = i2;
    }

    public p L(int i2) {
        if (i2 == 0) {
            return this.f4048e;
        }
        if (i2 == 1) {
            return this.f4050f;
        }
        return null;
    }

    public void L0(int i2, int i3) {
        this.Y = i2;
        this.Z = i3;
    }

    public float M() {
        return this.f4057i0;
    }

    public void M0(e eVar) {
        this.T = eVar;
    }

    public int N() {
        return this.f4077s0;
    }

    public void N0(float f2) {
        this.f4057i0 = f2;
    }

    public b O() {
        return this.S[1];
    }

    public void O0(int i2) {
        this.f4077s0 = i2;
    }

    public int P() {
        int i2 = this.H != null ? 0 + this.I.f4026g : 0;
        return this.J != null ? i2 + this.K.f4026g : i2;
    }

    public void P0(int i2, int i3) {
        this.Z = i2;
        int i4 = i3 - i2;
        this.V = i4;
        int i5 = this.f4053g0;
        if (i4 < i5) {
            this.V = i5;
        }
    }

    public int Q() {
        return this.f4063l0;
    }

    public void Q0(b bVar) {
        this.S[1] = bVar;
    }

    public int R() {
        if (this.f4063l0 == 8) {
            return 0;
        }
        return this.U;
    }

    public void R0(int i2, int i3, int i4, float f2) {
        this.f4072q = i2;
        this.f4082v = i3;
        if (i4 == Integer.MAX_VALUE) {
            i4 = 0;
        }
        this.f4084w = i4;
        this.f4086x = f2;
        if (f2 <= 0.0f || f2 >= 1.0f || i2 != 0) {
            return;
        }
        this.f4072q = 2;
    }

    public int S() {
        e eVar = this.T;
        return (eVar == null || !(eVar instanceof f)) ? this.Y : ((f) eVar).J0 + this.Y;
    }

    public void S0(float f2) {
        this.f4083v0[1] = f2;
    }

    public int T() {
        e eVar = this.T;
        return (eVar == null || !(eVar instanceof f)) ? this.Z : ((f) eVar).K0 + this.Z;
    }

    public void T0(int i2) {
        this.f4063l0 = i2;
    }

    public boolean U() {
        return this.C;
    }

    public void U0(int i2) {
        this.U = i2;
        int i3 = this.f4051f0;
        if (i2 < i3) {
            this.U = i3;
        }
    }

    public boolean V(int i2) {
        if (i2 == 0) {
            return (this.H.f4025f != null ? 1 : 0) + (this.J.f4025f != null ? 1 : 0) < 2;
        }
        return ((this.I.f4025f != null ? 1 : 0) + (this.K.f4025f != null ? 1 : 0)) + (this.L.f4025f != null ? 1 : 0) < 2;
    }

    public void V0(int i2) {
        this.Y = i2;
    }

    public boolean W() {
        int size = this.Q.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.Q.get(i2).l()) {
                return true;
            }
        }
        return false;
    }

    public void W0(int i2) {
        this.Z = i2;
    }

    public void X(d.b bVar, e eVar, d.b bVar2, int i2, int i3) {
        m(bVar).a(eVar.m(bVar2), i2, i3, true);
    }

    public void X0(boolean z2, boolean z3, boolean z4, boolean z5) {
        if (this.f4088y == -1) {
            if (z4 && !z5) {
                this.f4088y = 0;
            } else if (!z4 && z5) {
                this.f4088y = 1;
                if (this.X == -1) {
                    this.f4090z = 1.0f / this.f4090z;
                }
            }
        }
        if (this.f4088y == 0 && (!this.I.n() || !this.K.n())) {
            this.f4088y = 1;
        } else if (this.f4088y == 1 && (!this.H.n() || !this.J.n())) {
            this.f4088y = 0;
        }
        if (this.f4088y == -1 && (!this.I.n() || !this.K.n() || !this.H.n() || !this.J.n())) {
            if (this.I.n() && this.K.n()) {
                this.f4088y = 0;
            } else if (this.H.n() && this.J.n()) {
                this.f4090z = 1.0f / this.f4090z;
                this.f4088y = 1;
            }
        }
        if (this.f4088y == -1) {
            int i2 = this.f4076s;
            if (i2 > 0 && this.f4082v == 0) {
                this.f4088y = 0;
            } else {
                if (i2 != 0 || this.f4082v <= 0) {
                    return;
                }
                this.f4090z = 1.0f / this.f4090z;
                this.f4088y = 1;
            }
        }
    }

    public void Y0(boolean z2, boolean z3) {
        int i2;
        int i3;
        boolean k2 = z2 & this.f4048e.k();
        boolean k3 = z3 & this.f4050f.k();
        q.l lVar = this.f4048e;
        int i4 = lVar.f4192h.f4140g;
        n nVar = this.f4050f;
        int i5 = nVar.f4192h.f4140g;
        int i6 = lVar.f4193i.f4140g;
        int i7 = nVar.f4193i.f4140g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i4 = 0;
            i7 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (k2) {
            this.Y = i4;
        }
        if (k3) {
            this.Z = i5;
        }
        if (this.f4063l0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        if (k2) {
            if (this.S[0] == b.FIXED && i9 < (i3 = this.U)) {
                i9 = i3;
            }
            this.U = i9;
            int i11 = this.f4051f0;
            if (i9 < i11) {
                this.U = i11;
            }
        }
        if (k3) {
            if (this.S[1] == b.FIXED && i10 < (i2 = this.V)) {
                i10 = i2;
            }
            this.V = i10;
            int i12 = this.f4053g0;
            if (i10 < i12) {
                this.V = i12;
            }
        }
    }

    public boolean Z() {
        d dVar = this.H;
        d dVar2 = dVar.f4025f;
        if (dVar2 != null && dVar2.f4025f == dVar) {
            return true;
        }
        d dVar3 = this.J;
        d dVar4 = dVar3.f4025f;
        return dVar4 != null && dVar4.f4025f == dVar3;
    }

    public void Z0(o.d dVar, boolean z2) {
        n nVar;
        q.l lVar;
        int x2 = dVar.x(this.H);
        int x3 = dVar.x(this.I);
        int x4 = dVar.x(this.J);
        int x5 = dVar.x(this.K);
        if (z2 && (lVar = this.f4048e) != null) {
            q.f fVar = lVar.f4192h;
            if (fVar.f4143j) {
                q.f fVar2 = lVar.f4193i;
                if (fVar2.f4143j) {
                    x2 = fVar.f4140g;
                    x4 = fVar2.f4140g;
                }
            }
        }
        if (z2 && (nVar = this.f4050f) != null) {
            q.f fVar3 = nVar.f4192h;
            if (fVar3.f4143j) {
                q.f fVar4 = nVar.f4193i;
                if (fVar4.f4143j) {
                    x3 = fVar3.f4140g;
                    x5 = fVar4.f4140g;
                }
            }
        }
        int i2 = x5 - x3;
        if (x4 - x2 < 0 || i2 < 0 || x2 == Integer.MIN_VALUE || x2 == Integer.MAX_VALUE || x3 == Integer.MIN_VALUE || x3 == Integer.MAX_VALUE || x4 == Integer.MIN_VALUE || x4 == Integer.MAX_VALUE || x5 == Integer.MIN_VALUE || x5 == Integer.MAX_VALUE) {
            x5 = 0;
            x2 = 0;
            x3 = 0;
            x4 = 0;
        }
        t0(x2, x3, x4, x5);
    }

    public boolean a0() {
        return this.D;
    }

    public boolean b0() {
        d dVar = this.I;
        d dVar2 = dVar.f4025f;
        if (dVar2 != null && dVar2.f4025f == dVar) {
            return true;
        }
        d dVar3 = this.K;
        d dVar4 = dVar3.f4025f;
        return dVar4 != null && dVar4.f4025f == dVar3;
    }

    public boolean c0() {
        return this.E;
    }

    public boolean d0() {
        return this.f4056i && this.f4063l0 != 8;
    }

    public void e(f fVar, o.d dVar, HashSet<e> hashSet, int i2, boolean z2) {
        if (z2) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.B1(64));
        }
        if (i2 == 0) {
            HashSet<d> c3 = this.H.c();
            if (c3 != null) {
                Iterator<d> it = c3.iterator();
                while (it.hasNext()) {
                    it.next().f4023d.e(fVar, dVar, hashSet, i2, true);
                }
            }
            HashSet<d> c4 = this.J.c();
            if (c4 != null) {
                Iterator<d> it2 = c4.iterator();
                while (it2.hasNext()) {
                    it2.next().f4023d.e(fVar, dVar, hashSet, i2, true);
                }
                return;
            }
            return;
        }
        HashSet<d> c5 = this.I.c();
        if (c5 != null) {
            Iterator<d> it3 = c5.iterator();
            while (it3.hasNext()) {
                it3.next().f4023d.e(fVar, dVar, hashSet, i2, true);
            }
        }
        HashSet<d> c6 = this.K.c();
        if (c6 != null) {
            Iterator<d> it4 = c6.iterator();
            while (it4.hasNext()) {
                it4.next().f4023d.e(fVar, dVar, hashSet, i2, true);
            }
        }
        HashSet<d> c7 = this.L.c();
        if (c7 != null) {
            Iterator<d> it5 = c7.iterator();
            while (it5.hasNext()) {
                it5.next().f4023d.e(fVar, dVar, hashSet, i2, true);
            }
        }
    }

    public boolean e0() {
        return this.f4062l || (this.H.m() && this.J.m());
    }

    boolean f() {
        return (this instanceof k) || (this instanceof g);
    }

    public boolean f0() {
        return this.f4064m || (this.I.m() && this.K.m());
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(o.d dVar, boolean z2) {
        boolean z3;
        boolean z4;
        e eVar;
        e eVar2;
        boolean z5;
        boolean z6;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z7;
        int i6;
        boolean z8;
        b bVar;
        boolean z9;
        int i7;
        boolean z10;
        boolean z11;
        boolean z12;
        b bVar2;
        b bVar3;
        boolean z13;
        o.i iVar;
        o.i iVar2;
        o.i iVar3;
        o.i iVar4;
        boolean z14;
        int i8;
        int i9;
        int i10;
        e eVar3;
        o.d dVar2;
        o.i iVar5;
        o.i iVar6;
        o.i iVar7;
        int i11;
        o.i iVar8;
        o.i iVar9;
        e eVar4;
        o.d dVar3;
        o.i iVar10;
        o.i iVar11;
        o.i iVar12;
        o.i iVar13;
        boolean z15;
        q.l lVar;
        q.f fVar;
        int i12;
        boolean Z;
        boolean b02;
        q.l lVar2;
        n nVar;
        o.i q2 = dVar.q(this.H);
        o.i q3 = dVar.q(this.J);
        o.i q4 = dVar.q(this.I);
        o.i q5 = dVar.q(this.K);
        o.i q6 = dVar.q(this.L);
        e eVar5 = this.T;
        if (eVar5 != null) {
            boolean z16 = eVar5 != null && eVar5.S[0] == b.WRAP_CONTENT;
            z4 = eVar5 != null && eVar5.S[1] == b.WRAP_CONTENT;
            z3 = z16;
        } else {
            z3 = false;
            z4 = false;
        }
        if (this.f4063l0 == 8 && !W()) {
            boolean[] zArr = this.R;
            if (!zArr[0] && !zArr[1]) {
                return;
            }
        }
        boolean z17 = this.f4062l;
        if (z17 || this.f4064m) {
            if (z17) {
                dVar.f(q2, this.Y);
                dVar.f(q3, this.Y + this.U);
                if (z3 && (eVar2 = this.T) != null) {
                    if (this.f4060k) {
                        f fVar2 = (f) eVar2;
                        fVar2.n1(this.H);
                        fVar2.h1(this.J);
                    } else {
                        dVar.h(dVar.q(eVar2.J), q3, 0, 5);
                    }
                }
            }
            if (this.f4064m) {
                dVar.f(q4, this.Z);
                dVar.f(q5, this.Z + this.V);
                if (this.L.l()) {
                    dVar.f(q6, this.Z + this.f4049e0);
                }
                if (z4 && (eVar = this.T) != null) {
                    if (this.f4060k) {
                        f fVar3 = (f) eVar;
                        fVar3.n1(this.I);
                        fVar3.m1(this.K);
                    } else {
                        dVar.h(dVar.q(eVar.K), q5, 0, 5);
                    }
                }
            }
            if (this.f4062l && this.f4064m) {
                this.f4062l = false;
                this.f4064m = false;
                return;
            }
        }
        boolean z18 = o.d.f3877r;
        if (z2 && (lVar2 = this.f4048e) != null && (nVar = this.f4050f) != null) {
            q.f fVar4 = lVar2.f4192h;
            if (fVar4.f4143j && lVar2.f4193i.f4143j && nVar.f4192h.f4143j && nVar.f4193i.f4143j) {
                dVar.f(q2, fVar4.f4140g);
                dVar.f(q3, this.f4048e.f4193i.f4140g);
                dVar.f(q4, this.f4050f.f4192h.f4140g);
                dVar.f(q5, this.f4050f.f4193i.f4140g);
                dVar.f(q6, this.f4050f.f4167k.f4140g);
                if (this.T != null) {
                    if (z3 && this.f4052g[0] && !Z()) {
                        dVar.h(dVar.q(this.T.J), q3, 0, 8);
                    }
                    if (z4 && this.f4052g[1] && !b0()) {
                        dVar.h(dVar.q(this.T.K), q5, 0, 8);
                    }
                }
                this.f4062l = false;
                this.f4064m = false;
                return;
            }
        }
        if (this.T != null) {
            if (Y(0)) {
                ((f) this.T).e1(this, 0);
                Z = true;
            } else {
                Z = Z();
            }
            if (Y(1)) {
                ((f) this.T).e1(this, 1);
                b02 = true;
            } else {
                b02 = b0();
            }
            if (!Z && z3 && this.f4063l0 != 8 && this.H.f4025f == null && this.J.f4025f == null) {
                dVar.h(dVar.q(this.T.J), q3, 0, 1);
            }
            if (!b02 && z4 && this.f4063l0 != 8 && this.I.f4025f == null && this.K.f4025f == null && this.L == null) {
                dVar.h(dVar.q(this.T.K), q5, 0, 1);
            }
            z6 = Z;
            z5 = b02;
        } else {
            z5 = false;
            z6 = false;
        }
        int i13 = this.U;
        int i14 = this.f4051f0;
        if (i13 >= i14) {
            i14 = i13;
        }
        int i15 = this.V;
        int i16 = this.f4053g0;
        if (i15 >= i16) {
            i16 = i15;
        }
        b[] bVarArr = this.S;
        b bVar4 = bVarArr[0];
        b bVar5 = b.MATCH_CONSTRAINT;
        int i17 = i14;
        boolean z19 = bVar4 != bVar5;
        b bVar6 = bVarArr[1];
        int i18 = i16;
        boolean z20 = bVar6 != bVar5;
        int i19 = this.X;
        this.f4088y = i19;
        float f2 = this.W;
        this.f4090z = f2;
        int i20 = this.f4070p;
        o.i iVar14 = q3;
        int i21 = this.f4072q;
        if (f2 > 0.0f && this.f4063l0 != 8) {
            if (bVar4 == bVar5 && i20 == 0) {
                i20 = 3;
            }
            if (bVar6 == bVar5 && i21 == 0) {
                i21 = 3;
            }
            if (bVar4 == bVar5 && bVar6 == bVar5 && i20 == 3 && i21 == 3) {
                X0(z3, z4, z19, z20);
            } else if (bVar4 == bVar5 && i20 == 3) {
                this.f4088y = 0;
                i4 = (int) (f2 * i15);
                if (bVar6 == bVar5) {
                    i2 = i20;
                    i3 = i21;
                    i5 = i18;
                    z7 = true;
                    int[] iArr = this.f4074r;
                    iArr[0] = i2;
                    iArr[1] = i3;
                    this.f4054h = z7;
                    if (z7) {
                    }
                    z8 = false;
                    if (z7) {
                    }
                    b bVar7 = this.S[0];
                    bVar = b.WRAP_CONTENT;
                    if (bVar7 != bVar) {
                    }
                    if (z9) {
                    }
                    z10 = !this.O.n();
                    boolean[] zArr2 = this.R;
                    z11 = zArr2[0];
                    boolean z21 = zArr2[1];
                    if (this.f4066n != 2) {
                    }
                    z12 = z3;
                    bVar2 = bVar5;
                    bVar3 = bVar;
                    z13 = z7;
                    iVar = q6;
                    iVar2 = q5;
                    iVar3 = q4;
                    iVar4 = q2;
                    z14 = z4;
                    if (z2) {
                    }
                    i11 = i10;
                    if ((eVar3.f4068o == 2 ? i9 : i11) != 0) {
                    }
                    iVar8 = iVar6;
                    iVar9 = iVar7;
                    if (z13) {
                    }
                    if (eVar4.O.n()) {
                    }
                    eVar4.f4062l = false;
                    eVar4.f4064m = false;
                }
                i3 = i21;
                i5 = i18;
                i2 = 4;
            } else if (bVar6 == bVar5 && i21 == 3) {
                this.f4088y = 1;
                if (i19 == -1) {
                    this.f4090z = 1.0f / f2;
                }
                i5 = (int) (this.f4090z * i13);
                i2 = i20;
                if (bVar4 == bVar5) {
                    i3 = i21;
                    i4 = i17;
                    z7 = true;
                    int[] iArr2 = this.f4074r;
                    iArr2[0] = i2;
                    iArr2[1] = i3;
                    this.f4054h = z7;
                    if (z7) {
                        i6 = -1;
                    } else {
                        int i22 = this.f4088y;
                        i6 = -1;
                        if (i22 == 0 || i22 == -1) {
                            z8 = true;
                            boolean z22 = !z7 && ((i12 = this.f4088y) == 1 || i12 == i6);
                            b bVar72 = this.S[0];
                            bVar = b.WRAP_CONTENT;
                            z9 = bVar72 != bVar && (this instanceof f);
                            i7 = z9 ? 0 : i4;
                            z10 = !this.O.n();
                            boolean[] zArr22 = this.R;
                            z11 = zArr22[0];
                            boolean z212 = zArr22[1];
                            if (this.f4066n != 2 && !this.f4062l) {
                                if (z2 && (lVar = this.f4048e) != null) {
                                    fVar = lVar.f4192h;
                                    if (fVar.f4143j && lVar.f4193i.f4143j) {
                                        if (!z2) {
                                            dVar.f(q2, fVar.f4140g);
                                            dVar.f(iVar14, this.f4048e.f4193i.f4140g);
                                            if (this.T != null && z3 && this.f4052g[0] && !Z()) {
                                                dVar.h(dVar.q(this.T.J), iVar14, 0, 8);
                                            }
                                            z12 = z3;
                                            z14 = z4;
                                            bVar2 = bVar5;
                                            iVar14 = iVar14;
                                            iVar4 = q2;
                                            bVar3 = bVar;
                                            z13 = z7;
                                            iVar = q6;
                                            iVar2 = q5;
                                            iVar3 = q4;
                                            if (z2) {
                                                i8 = 8;
                                                i9 = 0;
                                                i10 = 1;
                                                eVar3 = this;
                                                dVar2 = dVar;
                                                iVar5 = iVar;
                                                iVar6 = iVar2;
                                                iVar7 = iVar3;
                                            } else {
                                                eVar3 = this;
                                                n nVar2 = eVar3.f4050f;
                                                if (nVar2 != null) {
                                                    q.f fVar5 = nVar2.f4192h;
                                                    if (fVar5.f4143j && nVar2.f4193i.f4143j) {
                                                        dVar2 = dVar;
                                                        iVar7 = iVar3;
                                                        dVar2.f(iVar7, fVar5.f4140g);
                                                        iVar6 = iVar2;
                                                        dVar2.f(iVar6, eVar3.f4050f.f4193i.f4140g);
                                                        iVar5 = iVar;
                                                        dVar2.f(iVar5, eVar3.f4050f.f4167k.f4140g);
                                                        e eVar6 = eVar3.T;
                                                        if (eVar6 == null || z5 || !z14) {
                                                            i8 = 8;
                                                            i9 = 0;
                                                            i10 = 1;
                                                        } else {
                                                            i10 = 1;
                                                            if (eVar3.f4052g[1]) {
                                                                i8 = 8;
                                                                i9 = 0;
                                                                dVar2.h(dVar2.q(eVar6.K), iVar6, 0, 8);
                                                            } else {
                                                                i8 = 8;
                                                                i9 = 0;
                                                            }
                                                        }
                                                        i11 = i9;
                                                        if ((eVar3.f4068o == 2 ? i9 : i11) != 0 || eVar3.f4064m) {
                                                            iVar8 = iVar6;
                                                            iVar9 = iVar7;
                                                        } else {
                                                            boolean z23 = (eVar3.S[i10] == bVar3 && (eVar3 instanceof f)) ? i10 : i9;
                                                            if (z23) {
                                                                i5 = i9;
                                                            }
                                                            e eVar7 = eVar3.T;
                                                            o.i q7 = eVar7 != null ? dVar2.q(eVar7.K) : null;
                                                            e eVar8 = eVar3.T;
                                                            o.i q8 = eVar8 != null ? dVar2.q(eVar8.I) : null;
                                                            if (eVar3.f4049e0 > 0 || eVar3.f4063l0 == i8) {
                                                                if (eVar3.L.f4025f != null) {
                                                                    dVar2.e(iVar5, iVar7, n(), i8);
                                                                    dVar2.e(iVar5, dVar2.q(eVar3.L.f4025f), i9, i8);
                                                                    if (z14) {
                                                                        dVar2.h(q7, dVar2.q(eVar3.K), i9, 5);
                                                                    }
                                                                    z15 = i9;
                                                                    boolean z24 = eVar3.f4052g[i10];
                                                                    b[] bVarArr2 = eVar3.S;
                                                                    iVar8 = iVar6;
                                                                    iVar9 = iVar7;
                                                                    i(dVar, false, z14, z12, z24, q8, q7, bVarArr2[i10], z23, eVar3.I, eVar3.K, eVar3.Z, i5, eVar3.f4053g0, eVar3.A[i10], eVar3.f4057i0, z22, bVarArr2[0] != bVar2, z5, z6, z212, i3, i2, eVar3.f4082v, eVar3.f4084w, eVar3.f4086x, z15);
                                                                } else if (eVar3.f4063l0 == i8) {
                                                                    dVar2.e(iVar5, iVar7, i9, i8);
                                                                } else {
                                                                    dVar2.e(iVar5, iVar7, n(), i8);
                                                                }
                                                            }
                                                            z15 = z10;
                                                            boolean z242 = eVar3.f4052g[i10];
                                                            b[] bVarArr22 = eVar3.S;
                                                            iVar8 = iVar6;
                                                            iVar9 = iVar7;
                                                            i(dVar, false, z14, z12, z242, q8, q7, bVarArr22[i10], z23, eVar3.I, eVar3.K, eVar3.Z, i5, eVar3.f4053g0, eVar3.A[i10], eVar3.f4057i0, z22, bVarArr22[0] != bVar2, z5, z6, z212, i3, i2, eVar3.f4082v, eVar3.f4084w, eVar3.f4086x, z15);
                                                        }
                                                        if (z13) {
                                                            int i23 = 8;
                                                            eVar4 = this;
                                                            int i24 = eVar4.f4088y;
                                                            float f3 = eVar4.f4090z;
                                                            if (i24 == 1) {
                                                                dVar3 = dVar;
                                                                iVar10 = iVar8;
                                                                iVar11 = iVar9;
                                                                iVar12 = iVar14;
                                                                iVar13 = iVar4;
                                                            } else {
                                                                i23 = 8;
                                                                dVar3 = dVar;
                                                                iVar10 = iVar14;
                                                                iVar11 = iVar4;
                                                                iVar12 = iVar8;
                                                                iVar13 = iVar9;
                                                            }
                                                            dVar3.k(iVar10, iVar11, iVar12, iVar13, f3, i23);
                                                        } else {
                                                            eVar4 = this;
                                                        }
                                                        if (eVar4.O.n()) {
                                                            dVar.b(eVar4, eVar4.O.i().g(), (float) Math.toRadians(eVar4.B + 90.0f), eVar4.O.e());
                                                        }
                                                        eVar4.f4062l = false;
                                                        eVar4.f4064m = false;
                                                    }
                                                }
                                                dVar2 = dVar;
                                                iVar5 = iVar;
                                                iVar6 = iVar2;
                                                iVar7 = iVar3;
                                                i8 = 8;
                                                i9 = 0;
                                                i10 = 1;
                                            }
                                            i11 = i10;
                                            if ((eVar3.f4068o == 2 ? i9 : i11) != 0) {
                                            }
                                            iVar8 = iVar6;
                                            iVar9 = iVar7;
                                            if (z13) {
                                            }
                                            if (eVar4.O.n()) {
                                            }
                                            eVar4.f4062l = false;
                                            eVar4.f4064m = false;
                                        }
                                    }
                                }
                                e eVar9 = this.T;
                                o.i q9 = eVar9 == null ? dVar.q(eVar9.J) : null;
                                e eVar10 = this.T;
                                o.i q10 = eVar10 == null ? dVar.q(eVar10.H) : null;
                                boolean z25 = this.f4052g[0];
                                b[] bVarArr3 = this.S;
                                z12 = z3;
                                z14 = z4;
                                bVar2 = bVar5;
                                iVar = q6;
                                iVar2 = q5;
                                iVar3 = q4;
                                iVar14 = iVar14;
                                bVar3 = bVar;
                                iVar4 = q2;
                                z13 = z7;
                                i(dVar, true, z3, z4, z25, q10, q9, bVarArr3[0], z9, this.H, this.J, this.Y, i7, this.f4051f0, this.A[0], this.f4055h0, z8, bVarArr3[1] != bVar5, z6, z5, z11, i2, i3, this.f4076s, this.f4078t, this.f4080u, z10);
                                if (z2) {
                                }
                                i11 = i10;
                                if ((eVar3.f4068o == 2 ? i9 : i11) != 0) {
                                }
                                iVar8 = iVar6;
                                iVar9 = iVar7;
                                if (z13) {
                                }
                                if (eVar4.O.n()) {
                                }
                                eVar4.f4062l = false;
                                eVar4.f4064m = false;
                            }
                            z12 = z3;
                            bVar2 = bVar5;
                            bVar3 = bVar;
                            z13 = z7;
                            iVar = q6;
                            iVar2 = q5;
                            iVar3 = q4;
                            iVar4 = q2;
                            z14 = z4;
                            if (z2) {
                            }
                            i11 = i10;
                            if ((eVar3.f4068o == 2 ? i9 : i11) != 0) {
                            }
                            iVar8 = iVar6;
                            iVar9 = iVar7;
                            if (z13) {
                            }
                            if (eVar4.O.n()) {
                            }
                            eVar4.f4062l = false;
                            eVar4.f4064m = false;
                        }
                    }
                    z8 = false;
                    if (z7) {
                    }
                    b bVar722 = this.S[0];
                    bVar = b.WRAP_CONTENT;
                    if (bVar722 != bVar) {
                    }
                    if (z9) {
                    }
                    z10 = !this.O.n();
                    boolean[] zArr222 = this.R;
                    z11 = zArr222[0];
                    boolean z2122 = zArr222[1];
                    if (this.f4066n != 2) {
                        if (z2) {
                            fVar = lVar.f4192h;
                            if (fVar.f4143j) {
                                if (!z2) {
                                }
                            }
                        }
                        e eVar92 = this.T;
                        if (eVar92 == null) {
                        }
                        e eVar102 = this.T;
                        if (eVar102 == null) {
                        }
                        boolean z252 = this.f4052g[0];
                        b[] bVarArr32 = this.S;
                        z12 = z3;
                        z14 = z4;
                        bVar2 = bVar5;
                        iVar = q6;
                        iVar2 = q5;
                        iVar3 = q4;
                        iVar14 = iVar14;
                        bVar3 = bVar;
                        iVar4 = q2;
                        z13 = z7;
                        i(dVar, true, z3, z4, z252, q10, q9, bVarArr32[0], z9, this.H, this.J, this.Y, i7, this.f4051f0, this.A[0], this.f4055h0, z8, bVarArr32[1] != bVar5, z6, z5, z11, i2, i3, this.f4076s, this.f4078t, this.f4080u, z10);
                        if (z2) {
                        }
                        i11 = i10;
                        if ((eVar3.f4068o == 2 ? i9 : i11) != 0) {
                        }
                        iVar8 = iVar6;
                        iVar9 = iVar7;
                        if (z13) {
                        }
                        if (eVar4.O.n()) {
                        }
                        eVar4.f4062l = false;
                        eVar4.f4064m = false;
                    }
                    z12 = z3;
                    bVar2 = bVar5;
                    bVar3 = bVar;
                    z13 = z7;
                    iVar = q6;
                    iVar2 = q5;
                    iVar3 = q4;
                    iVar4 = q2;
                    z14 = z4;
                    if (z2) {
                    }
                    i11 = i10;
                    if ((eVar3.f4068o == 2 ? i9 : i11) != 0) {
                    }
                    iVar8 = iVar6;
                    iVar9 = iVar7;
                    if (z13) {
                    }
                    if (eVar4.O.n()) {
                    }
                    eVar4.f4062l = false;
                    eVar4.f4064m = false;
                }
                i4 = i17;
                i3 = 4;
            }
            i2 = i20;
            i3 = i21;
            i4 = i17;
            i5 = i18;
            z7 = true;
            int[] iArr22 = this.f4074r;
            iArr22[0] = i2;
            iArr22[1] = i3;
            this.f4054h = z7;
            if (z7) {
            }
            z8 = false;
            if (z7) {
            }
            b bVar7222 = this.S[0];
            bVar = b.WRAP_CONTENT;
            if (bVar7222 != bVar) {
            }
            if (z9) {
            }
            z10 = !this.O.n();
            boolean[] zArr2222 = this.R;
            z11 = zArr2222[0];
            boolean z21222 = zArr2222[1];
            if (this.f4066n != 2) {
            }
            z12 = z3;
            bVar2 = bVar5;
            bVar3 = bVar;
            z13 = z7;
            iVar = q6;
            iVar2 = q5;
            iVar3 = q4;
            iVar4 = q2;
            z14 = z4;
            if (z2) {
            }
            i11 = i10;
            if ((eVar3.f4068o == 2 ? i9 : i11) != 0) {
            }
            iVar8 = iVar6;
            iVar9 = iVar7;
            if (z13) {
            }
            if (eVar4.O.n()) {
            }
            eVar4.f4062l = false;
            eVar4.f4064m = false;
        }
        i2 = i20;
        i3 = i21;
        i4 = i17;
        i5 = i18;
        z7 = false;
        int[] iArr222 = this.f4074r;
        iArr222[0] = i2;
        iArr222[1] = i3;
        this.f4054h = z7;
        if (z7) {
        }
        z8 = false;
        if (z7) {
        }
        b bVar72222 = this.S[0];
        bVar = b.WRAP_CONTENT;
        if (bVar72222 != bVar) {
        }
        if (z9) {
        }
        z10 = !this.O.n();
        boolean[] zArr22222 = this.R;
        z11 = zArr22222[0];
        boolean z212222 = zArr22222[1];
        if (this.f4066n != 2) {
        }
        z12 = z3;
        bVar2 = bVar5;
        bVar3 = bVar;
        z13 = z7;
        iVar = q6;
        iVar2 = q5;
        iVar3 = q4;
        iVar4 = q2;
        z14 = z4;
        if (z2) {
        }
        i11 = i10;
        if ((eVar3.f4068o == 2 ? i9 : i11) != 0) {
        }
        iVar8 = iVar6;
        iVar9 = iVar7;
        if (z13) {
        }
        if (eVar4.O.n()) {
        }
        eVar4.f4062l = false;
        eVar4.f4064m = false;
    }

    public boolean g0() {
        b[] bVarArr = this.S;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public boolean h() {
        return this.f4063l0 != 8;
    }

    public void h0() {
        this.H.p();
        this.I.p();
        this.J.p();
        this.K.p();
        this.L.p();
        this.M.p();
        this.N.p();
        this.O.p();
        this.T = null;
        this.B = 0.0f;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f4045c0 = 0;
        this.f4047d0 = 0;
        this.f4049e0 = 0;
        this.f4051f0 = 0;
        this.f4053g0 = 0;
        float f2 = C0;
        this.f4055h0 = f2;
        this.f4057i0 = f2;
        b[] bVarArr = this.S;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f4059j0 = null;
        this.f4061k0 = 0;
        this.f4063l0 = 0;
        this.f4067n0 = null;
        this.f4069o0 = false;
        this.f4071p0 = false;
        this.f4075r0 = 0;
        this.f4077s0 = 0;
        this.f4079t0 = false;
        this.f4081u0 = false;
        float[] fArr = this.f4083v0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f4066n = -1;
        this.f4068o = -1;
        int[] iArr = this.A;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f4070p = 0;
        this.f4072q = 0;
        this.f4080u = 1.0f;
        this.f4086x = 1.0f;
        this.f4078t = Integer.MAX_VALUE;
        this.f4084w = Integer.MAX_VALUE;
        this.f4076s = 0;
        this.f4082v = 0;
        this.f4054h = false;
        this.f4088y = -1;
        this.f4090z = 1.0f;
        this.f4073q0 = false;
        boolean[] zArr = this.f4052g;
        zArr[0] = true;
        zArr[1] = true;
        this.E = false;
        boolean[] zArr2 = this.R;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f4056i = true;
    }

    public void i0() {
        this.f4062l = false;
        this.f4064m = false;
        int size = this.Q.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.Q.get(i2).q();
        }
    }

    public void j(e eVar, float f2, int i2) {
        d.b bVar = d.b.CENTER;
        X(bVar, eVar, bVar, i2, 0);
        this.B = f2;
    }

    public void j0(o.c cVar) {
        this.H.r(cVar);
        this.I.r(cVar);
        this.J.r(cVar);
        this.K.r(cVar);
        this.L.r(cVar);
        this.O.r(cVar);
        this.M.r(cVar);
        this.N.r(cVar);
    }

    public void k(o.d dVar) {
        dVar.q(this.H);
        dVar.q(this.I);
        dVar.q(this.J);
        dVar.q(this.K);
        if (this.f4049e0 > 0) {
            dVar.q(this.L);
        }
    }

    public void k0(int i2) {
        this.f4049e0 = i2;
        this.C = i2 > 0;
    }

    public void l() {
        if (this.f4048e == null) {
            this.f4048e = new q.l(this);
        }
        if (this.f4050f == null) {
            this.f4050f = new n(this);
        }
    }

    public void l0(Object obj) {
        this.f4059j0 = obj;
    }

    public d m(d.b bVar) {
        switch (a.f4092a[bVar.ordinal()]) {
            case 1:
                return this.H;
            case 2:
                return this.I;
            case 3:
                return this.J;
            case 4:
                return this.K;
            case 5:
                return this.L;
            case 6:
                return this.O;
            case 7:
                return this.M;
            case 8:
                return this.N;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public void m0(String str) {
        this.f4065m0 = str;
    }

    public int n() {
        return this.f4049e0;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:31:0x0085). Please report as a decompilation issue!!! */
    public void n0(String str) {
        float f2;
        int i2 = 0;
        if (str == null || str.length() == 0) {
            this.W = 0.0f;
            return;
        }
        int i3 = -1;
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i4 = 0;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            if (substring.equalsIgnoreCase("W")) {
                i3 = 0;
            } else if (substring.equalsIgnoreCase("H")) {
                i3 = 1;
            }
            i4 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(i4);
            if (substring2.length() > 0) {
                f2 = Float.parseFloat(substring2);
            }
            f2 = i2;
        } else {
            String substring3 = str.substring(i4, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f2 = i3 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f2 = i2;
        }
        i2 = (f2 > i2 ? 1 : (f2 == i2 ? 0 : -1));
        if (i2 > 0) {
            this.W = f2;
            this.X = i3;
        }
    }

    public float o(int i2) {
        if (i2 == 0) {
            return this.f4055h0;
        }
        if (i2 == 1) {
            return this.f4057i0;
        }
        return -1.0f;
    }

    public void o0(int i2) {
        if (this.C) {
            int i3 = i2 - this.f4049e0;
            int i4 = this.V + i3;
            this.Z = i3;
            this.I.s(i3);
            this.K.s(i4);
            this.L.s(i2);
            this.f4064m = true;
        }
    }

    public int p() {
        return T() + this.V;
    }

    public void p0(int i2, int i3) {
        this.H.s(i2);
        this.J.s(i3);
        this.Y = i2;
        this.U = i3 - i2;
        this.f4062l = true;
    }

    public Object q() {
        return this.f4059j0;
    }

    public void q0(int i2) {
        this.H.s(i2);
        this.Y = i2;
    }

    public String r() {
        return this.f4065m0;
    }

    public void r0(int i2) {
        this.I.s(i2);
        this.Z = i2;
    }

    public b s(int i2) {
        if (i2 == 0) {
            return y();
        }
        if (i2 == 1) {
            return O();
        }
        return null;
    }

    public void s0(int i2, int i3) {
        this.I.s(i2);
        this.K.s(i3);
        this.Z = i2;
        this.V = i3 - i2;
        if (this.C) {
            this.L.s(i2 + this.f4049e0);
        }
        this.f4064m = true;
    }

    public float t() {
        return this.W;
    }

    public void t0(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        this.Y = i2;
        this.Z = i3;
        if (this.f4063l0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        b[] bVarArr = this.S;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i8 < (i7 = this.U)) {
            i8 = i7;
        }
        if (bVarArr[1] == bVar2 && i9 < (i6 = this.V)) {
            i9 = i6;
        }
        this.U = i8;
        this.V = i9;
        int i10 = this.f4053g0;
        if (i9 < i10) {
            this.V = i10;
        }
        int i11 = this.f4051f0;
        if (i8 < i11) {
            this.U = i11;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f4067n0 != null) {
            str = "type: " + this.f4067n0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f4065m0 != null) {
            str2 = "id: " + this.f4065m0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.Y);
        sb.append(", ");
        sb.append(this.Z);
        sb.append(") - (");
        sb.append(this.U);
        sb.append(" x ");
        sb.append(this.V);
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        return this.X;
    }

    public void u0(boolean z2) {
        this.C = z2;
    }

    public int v() {
        if (this.f4063l0 == 8) {
            return 0;
        }
        return this.V;
    }

    public void v0(int i2) {
        this.V = i2;
        int i3 = this.f4053g0;
        if (i2 < i3) {
            this.V = i3;
        }
    }

    public float w() {
        return this.f4055h0;
    }

    public void w0(float f2) {
        this.f4055h0 = f2;
    }

    public int x() {
        return this.f4075r0;
    }

    public void x0(int i2) {
        this.f4075r0 = i2;
    }

    public b y() {
        return this.S[0];
    }

    public void y0(int i2, int i3) {
        this.Y = i2;
        int i4 = i3 - i2;
        this.U = i4;
        int i5 = this.f4051f0;
        if (i4 < i5) {
            this.U = i5;
        }
    }

    public int z() {
        d dVar = this.H;
        int i2 = dVar != null ? 0 + dVar.f4026g : 0;
        d dVar2 = this.J;
        return dVar2 != null ? i2 + dVar2.f4026g : i2;
    }

    public void z0(b bVar) {
        this.S[0] = bVar;
    }
}
