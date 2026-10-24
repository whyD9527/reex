package q;

import java.util.Iterator;
import q.f;

/* loaded from: classes.dex */
class k extends p {
    public k(p.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f4192h.f4144k.add(fVar);
        fVar.f4145l.add(this.f4192h);
    }

    @Override // q.p, q.d
    public void a(d dVar) {
        p.a aVar = (p.a) this.f4186b;
        int e12 = aVar.e1();
        Iterator<f> it = this.f4192h.f4145l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = it.next().f4140g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (e12 == 0 || e12 == 2) {
            this.f4192h.d(i3 + aVar.f1());
        } else {
            this.f4192h.d(i2 + aVar.f1());
        }
    }

    @Override // q.p
    void d() {
        p pVar;
        p.e eVar = this.f4186b;
        if (eVar instanceof p.a) {
            this.f4192h.f4135b = true;
            p.a aVar = (p.a) eVar;
            int e12 = aVar.e1();
            boolean d12 = aVar.d1();
            int i2 = 0;
            if (e12 == 0) {
                this.f4192h.f4138e = f.a.LEFT;
                while (i2 < aVar.E0) {
                    p.e eVar2 = aVar.D0[i2];
                    if (d12 || eVar2.Q() != 8) {
                        f fVar = eVar2.f4048e.f4192h;
                        fVar.f4144k.add(this.f4192h);
                        this.f4192h.f4145l.add(fVar);
                    }
                    i2++;
                }
            } else {
                if (e12 != 1) {
                    if (e12 == 2) {
                        this.f4192h.f4138e = f.a.TOP;
                        while (i2 < aVar.E0) {
                            p.e eVar3 = aVar.D0[i2];
                            if (d12 || eVar3.Q() != 8) {
                                f fVar2 = eVar3.f4050f.f4192h;
                                fVar2.f4144k.add(this.f4192h);
                                this.f4192h.f4145l.add(fVar2);
                            }
                            i2++;
                        }
                    } else {
                        if (e12 != 3) {
                            return;
                        }
                        this.f4192h.f4138e = f.a.BOTTOM;
                        while (i2 < aVar.E0) {
                            p.e eVar4 = aVar.D0[i2];
                            if (d12 || eVar4.Q() != 8) {
                                f fVar3 = eVar4.f4050f.f4193i;
                                fVar3.f4144k.add(this.f4192h);
                                this.f4192h.f4145l.add(fVar3);
                            }
                            i2++;
                        }
                    }
                    q(this.f4186b.f4050f.f4192h);
                    pVar = this.f4186b.f4050f;
                    q(pVar.f4193i);
                }
                this.f4192h.f4138e = f.a.RIGHT;
                while (i2 < aVar.E0) {
                    p.e eVar5 = aVar.D0[i2];
                    if (d12 || eVar5.Q() != 8) {
                        f fVar4 = eVar5.f4048e.f4193i;
                        fVar4.f4144k.add(this.f4192h);
                        this.f4192h.f4145l.add(fVar4);
                    }
                    i2++;
                }
            }
            q(this.f4186b.f4048e.f4192h);
            pVar = this.f4186b.f4048e;
            q(pVar.f4193i);
        }
    }

    @Override // q.p
    public void e() {
        p.e eVar = this.f4186b;
        if (eVar instanceof p.a) {
            int e12 = ((p.a) eVar).e1();
            if (e12 == 0 || e12 == 1) {
                this.f4186b.V0(this.f4192h.f4140g);
            } else {
                this.f4186b.W0(this.f4192h.f4140g);
            }
        }
    }

    @Override // q.p
    void f() {
        this.f4187c = null;
        this.f4192h.c();
    }

    @Override // q.p
    boolean m() {
        return false;
    }
}
