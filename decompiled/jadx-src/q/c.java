package q;

import java.util.ArrayList;
import java.util.Iterator;
import p.e;

/* loaded from: classes.dex */
public class c extends p {

    /* renamed from: k, reason: collision with root package name */
    ArrayList<p> f4123k;

    /* renamed from: l, reason: collision with root package name */
    private int f4124l;

    public c(p.e eVar, int i2) {
        super(eVar);
        this.f4123k = new ArrayList<>();
        this.f4190f = i2;
        q();
    }

    private void q() {
        p.e eVar;
        p.e eVar2 = this.f4186b;
        do {
            eVar = eVar2;
            eVar2 = eVar2.J(this.f4190f);
        } while (eVar2 != null);
        this.f4186b = eVar;
        this.f4123k.add(eVar.L(this.f4190f));
        p.e H = eVar.H(this.f4190f);
        while (H != null) {
            this.f4123k.add(H.L(this.f4190f));
            H = H.H(this.f4190f);
        }
        Iterator<p> it = this.f4123k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i2 = this.f4190f;
            if (i2 == 0) {
                next.f4186b.f4044c = this;
            } else if (i2 == 1) {
                next.f4186b.f4046d = this;
            }
        }
        if ((this.f4190f == 0 && ((p.f) this.f4186b.I()).x1()) && this.f4123k.size() > 1) {
            ArrayList<p> arrayList = this.f4123k;
            this.f4186b = arrayList.get(arrayList.size() - 1).f4186b;
        }
        this.f4124l = this.f4190f == 0 ? this.f4186b.x() : this.f4186b.N();
    }

    private p.e r() {
        for (int i2 = 0; i2 < this.f4123k.size(); i2++) {
            p pVar = this.f4123k.get(i2);
            if (pVar.f4186b.Q() != 8) {
                return pVar.f4186b;
            }
        }
        return null;
    }

    private p.e s() {
        for (int size = this.f4123k.size() - 1; size >= 0; size--) {
            p pVar = this.f4123k.get(size);
            if (pVar.f4186b.Q() != 8) {
                return pVar.f4186b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x019f, code lost:
    
        if (r1 != r7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ca, code lost:
    
        r9.f4189e.d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c7, code lost:
    
        r13 = r13 + 1;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01c5, code lost:
    
        if (r1 != r7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x03e9, code lost:
    
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00eb  */
    @Override // q.p, q.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(d dVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        int i11;
        int i12;
        float f3;
        int i13;
        int max;
        int i14;
        int i15;
        if (this.f4192h.f4143j && this.f4193i.f4143j) {
            p.e I = this.f4186b.I();
            boolean x12 = (I == null || !(I instanceof p.f)) ? false : ((p.f) I).x1();
            int i16 = this.f4193i.f4140g - this.f4192h.f4140g;
            int size = this.f4123k.size();
            int i17 = 0;
            while (true) {
                i2 = -1;
                i3 = 8;
                if (i17 >= size) {
                    i17 = -1;
                    break;
                } else if (this.f4123k.get(i17).f4186b.Q() != 8) {
                    break;
                } else {
                    i17++;
                }
            }
            int i18 = size - 1;
            int i19 = i18;
            while (true) {
                if (i19 < 0) {
                    break;
                }
                if (this.f4123k.get(i19).f4186b.Q() != 8) {
                    i2 = i19;
                    break;
                }
                i19--;
            }
            int i20 = 0;
            while (i20 < 2) {
                int i21 = 0;
                i5 = 0;
                i6 = 0;
                int i22 = 0;
                f2 = 0.0f;
                while (i21 < size) {
                    p pVar = this.f4123k.get(i21);
                    if (pVar.f4186b.Q() != i3) {
                        i22++;
                        if (i21 > 0 && i21 >= i17) {
                            i5 += pVar.f4192h.f4139f;
                        }
                        g gVar = pVar.f4189e;
                        int i23 = gVar.f4140g;
                        boolean z4 = pVar.f4188d != e.b.MATCH_CONSTRAINT;
                        if (z4) {
                            int i24 = this.f4190f;
                            if (i24 == 0 && !pVar.f4186b.f4048e.f4189e.f4143j) {
                                return;
                            }
                            if (i24 == 1 && !pVar.f4186b.f4050f.f4189e.f4143j) {
                                return;
                            } else {
                                i14 = i23;
                            }
                        } else {
                            i14 = i23;
                            if (pVar.f4185a == 1 && i20 == 0) {
                                i15 = gVar.f4155m;
                                i6++;
                            } else if (gVar.f4143j) {
                                i15 = i14;
                            }
                            z4 = true;
                            if (z4) {
                                i6++;
                                float f4 = pVar.f4186b.f4083v0[this.f4190f];
                                if (f4 >= 0.0f) {
                                    f2 += f4;
                                }
                            } else {
                                i5 += i15;
                            }
                            if (i21 < i18 && i21 < i2) {
                                i5 += -pVar.f4193i.f4139f;
                            }
                        }
                        i15 = i14;
                        if (z4) {
                        }
                        if (i21 < i18) {
                            i5 += -pVar.f4193i.f4139f;
                        }
                    }
                    i21++;
                    i3 = 8;
                }
                if (i5 < i16 || i6 == 0) {
                    i4 = i22;
                    break;
                } else {
                    i20++;
                    i3 = 8;
                }
            }
            i4 = 0;
            i5 = 0;
            i6 = 0;
            f2 = 0.0f;
            int i25 = this.f4192h.f4140g;
            if (x12) {
                i25 = this.f4193i.f4140g;
            }
            if (i5 > i16) {
                int i26 = (int) (((i5 - i16) / 2.0f) + 0.5f);
                i25 = x12 ? i25 + i26 : i25 - i26;
            }
            if (i6 > 0) {
                float f5 = i16 - i5;
                int i27 = (int) ((f5 / i6) + 0.5f);
                int i28 = 0;
                int i29 = 0;
                while (i28 < size) {
                    p pVar2 = this.f4123k.get(i28);
                    int i30 = i27;
                    int i31 = i5;
                    if (pVar2.f4186b.Q() != 8 && pVar2.f4188d == e.b.MATCH_CONSTRAINT) {
                        g gVar2 = pVar2.f4189e;
                        if (!gVar2.f4143j) {
                            if (f2 > 0.0f) {
                                i12 = i25;
                                i13 = (int) (((pVar2.f4186b.f4083v0[this.f4190f] * f5) / f2) + 0.5f);
                            } else {
                                i12 = i25;
                                i13 = i30;
                            }
                            if (this.f4190f == 0) {
                                p.e eVar = pVar2.f4186b;
                                f3 = f5;
                                int i32 = eVar.f4078t;
                                z3 = x12;
                                i11 = i4;
                                max = Math.max(eVar.f4076s, pVar2.f4185a == 1 ? Math.min(i13, gVar2.f4155m) : i13);
                                if (i32 > 0) {
                                    max = Math.min(i32, max);
                                }
                            } else {
                                z3 = x12;
                                i11 = i4;
                                f3 = f5;
                                p.e eVar2 = pVar2.f4186b;
                                int i33 = eVar2.f4084w;
                                max = Math.max(eVar2.f4082v, pVar2.f4185a == 1 ? Math.min(i13, gVar2.f4155m) : i13);
                                if (i33 > 0) {
                                    max = Math.min(i33, max);
                                }
                            }
                        }
                    }
                    z3 = x12;
                    i11 = i4;
                    i12 = i25;
                    f3 = f5;
                    i28++;
                    i27 = i30;
                    i5 = i31;
                    i25 = i12;
                    f5 = f3;
                    x12 = z3;
                    i4 = i11;
                }
                z2 = x12;
                i7 = i4;
                i8 = i25;
                int i34 = i5;
                if (i29 > 0) {
                    i6 -= i29;
                    int i35 = 0;
                    for (int i36 = 0; i36 < size; i36++) {
                        p pVar3 = this.f4123k.get(i36);
                        if (pVar3.f4186b.Q() != 8) {
                            if (i36 > 0 && i36 >= i17) {
                                i35 += pVar3.f4192h.f4139f;
                            }
                            i35 += pVar3.f4189e.f4140g;
                            if (i36 < i18 && i36 < i2) {
                                i35 += -pVar3.f4193i.f4139f;
                            }
                        }
                    }
                    i5 = i35;
                } else {
                    i5 = i34;
                }
                i10 = 2;
                if (this.f4124l == 2 && i29 == 0) {
                    i9 = 0;
                    this.f4124l = 0;
                } else {
                    i9 = 0;
                }
            } else {
                z2 = x12;
                i7 = i4;
                i8 = i25;
                i9 = 0;
                i10 = 2;
            }
            if (i5 > i16) {
                this.f4124l = i10;
            }
            if (i7 > 0 && i6 == 0 && i17 == i2) {
                this.f4124l = i10;
            }
            int i37 = this.f4124l;
            int i38 = i7;
            if (i37 == 1) {
                int i39 = i38 > 1 ? (i16 - i5) / (i38 - 1) : i38 == 1 ? (i16 - i5) / 2 : i9;
                if (i6 > 0) {
                    i39 = i9;
                }
                int i40 = i8;
                for (int i41 = i9; i41 < size; i41++) {
                    p pVar4 = this.f4123k.get(z2 ? size - (i41 + 1) : i41);
                    if (pVar4.f4186b.Q() == 8) {
                        pVar4.f4192h.d(i40);
                        pVar4.f4193i.d(i40);
                    } else {
                        if (i41 > 0) {
                            i40 = z2 ? i40 - i39 : i40 + i39;
                        }
                        if (i41 > 0 && i41 >= i17) {
                            int i42 = pVar4.f4192h.f4139f;
                            i40 = z2 ? i40 - i42 : i40 + i42;
                        }
                        (z2 ? pVar4.f4193i : pVar4.f4192h).d(i40);
                        g gVar3 = pVar4.f4189e;
                        int i43 = gVar3.f4140g;
                        if (pVar4.f4188d == e.b.MATCH_CONSTRAINT && pVar4.f4185a == 1) {
                            i43 = gVar3.f4155m;
                        }
                        i40 = z2 ? i40 - i43 : i40 + i43;
                        (z2 ? pVar4.f4192h : pVar4.f4193i).d(i40);
                        pVar4.f4191g = true;
                        if (i41 < i18 && i41 < i2) {
                            int i44 = -pVar4.f4193i.f4139f;
                            i40 = z2 ? i40 - i44 : i40 + i44;
                        }
                    }
                }
                return;
            }
            if (i37 == 0) {
                int i45 = (i16 - i5) / (i38 + 1);
                if (i6 > 0) {
                    i45 = i9;
                }
                int i46 = i8;
                for (int i47 = i9; i47 < size; i47++) {
                    p pVar5 = this.f4123k.get(z2 ? size - (i47 + 1) : i47);
                    if (pVar5.f4186b.Q() == 8) {
                        pVar5.f4192h.d(i46);
                        pVar5.f4193i.d(i46);
                    } else {
                        int i48 = z2 ? i46 - i45 : i46 + i45;
                        if (i47 > 0 && i47 >= i17) {
                            int i49 = pVar5.f4192h.f4139f;
                            i48 = z2 ? i48 - i49 : i48 + i49;
                        }
                        (z2 ? pVar5.f4193i : pVar5.f4192h).d(i48);
                        g gVar4 = pVar5.f4189e;
                        int i50 = gVar4.f4140g;
                        if (pVar5.f4188d == e.b.MATCH_CONSTRAINT && pVar5.f4185a == 1) {
                            i50 = Math.min(i50, gVar4.f4155m);
                        }
                        i46 = z2 ? i48 - i50 : i48 + i50;
                        (z2 ? pVar5.f4192h : pVar5.f4193i).d(i46);
                        if (i47 < i18 && i47 < i2) {
                            int i51 = -pVar5.f4193i.f4139f;
                            i46 = z2 ? i46 - i51 : i46 + i51;
                        }
                    }
                }
                return;
            }
            if (i37 == 2) {
                float w2 = this.f4190f == 0 ? this.f4186b.w() : this.f4186b.M();
                if (z2) {
                    w2 = 1.0f - w2;
                }
                int i52 = (int) (((i16 - i5) * w2) + 0.5f);
                if (i52 < 0 || i6 > 0) {
                    i52 = i9;
                }
                int i53 = z2 ? i8 - i52 : i8 + i52;
                for (int i54 = i9; i54 < size; i54++) {
                    p pVar6 = this.f4123k.get(z2 ? size - (i54 + 1) : i54);
                    if (pVar6.f4186b.Q() == 8) {
                        pVar6.f4192h.d(i53);
                        pVar6.f4193i.d(i53);
                    } else {
                        if (i54 > 0 && i54 >= i17) {
                            int i55 = pVar6.f4192h.f4139f;
                            i53 = z2 ? i53 - i55 : i53 + i55;
                        }
                        (z2 ? pVar6.f4193i : pVar6.f4192h).d(i53);
                        g gVar5 = pVar6.f4189e;
                        int i56 = gVar5.f4140g;
                        if (pVar6.f4188d == e.b.MATCH_CONSTRAINT && pVar6.f4185a == 1) {
                            i56 = gVar5.f4155m;
                        }
                        i53 += i56;
                        (z2 ? pVar6.f4192h : pVar6.f4193i).d(i53);
                        if (i54 < i18 && i54 < i2) {
                            int i57 = -pVar6.f4193i.f4139f;
                            i53 = z2 ? i53 - i57 : i53 + i57;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r1 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        b(r5.f4193i, r1, -r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        if (r1 != null) goto L30;
     */
    @Override // q.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void d() {
        f i2;
        int e3;
        Iterator<p> it = this.f4123k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f4123k.size();
        if (size < 1) {
            return;
        }
        p.e eVar = this.f4123k.get(0).f4186b;
        p.e eVar2 = this.f4123k.get(size - 1).f4186b;
        if (this.f4190f == 0) {
            p.d dVar = eVar.H;
            p.d dVar2 = eVar2.J;
            f i3 = i(dVar, 0);
            int e4 = dVar.e();
            p.e r2 = r();
            if (r2 != null) {
                e4 = r2.H.e();
            }
            if (i3 != null) {
                b(this.f4192h, i3, e4);
            }
            i2 = i(dVar2, 0);
            e3 = dVar2.e();
            p.e s2 = s();
            if (s2 != null) {
                e3 = s2.J.e();
            }
        } else {
            p.d dVar3 = eVar.I;
            p.d dVar4 = eVar2.K;
            f i4 = i(dVar3, 1);
            int e5 = dVar3.e();
            p.e r3 = r();
            if (r3 != null) {
                e5 = r3.I.e();
            }
            if (i4 != null) {
                b(this.f4192h, i4, e5);
            }
            i2 = i(dVar4, 1);
            e3 = dVar4.e();
            p.e s3 = s();
            if (s3 != null) {
                e3 = s3.K.e();
            }
        }
        this.f4192h.f4134a = this;
        this.f4193i.f4134a = this;
    }

    @Override // q.p
    public void e() {
        for (int i2 = 0; i2 < this.f4123k.size(); i2++) {
            this.f4123k.get(i2).e();
        }
    }

    @Override // q.p
    void f() {
        this.f4187c = null;
        Iterator<p> it = this.f4123k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // q.p
    public long j() {
        int size = this.f4123k.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j2 = j2 + r4.f4192h.f4139f + this.f4123k.get(i2).j() + r4.f4193i.f4139f;
        }
        return j2;
    }

    @Override // q.p
    boolean m() {
        int size = this.f4123k.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.f4123k.get(i2).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f4190f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        Iterator<p> it = this.f4123k.iterator();
        while (it.hasNext()) {
            String str = sb2 + "<";
            sb2 = (str + it.next()) + "> ";
        }
        return sb2;
    }
}
