package q;

/* loaded from: classes.dex */
class j extends p {
    public j(p.e eVar) {
        super(eVar);
        eVar.f4048e.f();
        eVar.f4050f.f();
        this.f4190f = ((p.g) eVar).b1();
    }

    private void q(f fVar) {
        this.f4192h.f4144k.add(fVar);
        fVar.f4145l.add(this.f4192h);
    }

    @Override // q.p, q.d
    public void a(d dVar) {
        f fVar = this.f4192h;
        if (fVar.f4136c && !fVar.f4143j) {
            this.f4192h.d((int) ((fVar.f4145l.get(0).f4140g * ((p.g) this.f4186b).e1()) + 0.5f));
        }
    }

    @Override // q.p
    void d() {
        f fVar;
        p pVar;
        f fVar2;
        p.g gVar = (p.g) this.f4186b;
        int c12 = gVar.c1();
        int d12 = gVar.d1();
        gVar.e1();
        if (gVar.b1() == 1) {
            f fVar3 = this.f4192h;
            if (c12 != -1) {
                fVar3.f4145l.add(this.f4186b.T.f4048e.f4192h);
                this.f4186b.T.f4048e.f4192h.f4144k.add(this.f4192h);
                fVar2 = this.f4192h;
            } else if (d12 != -1) {
                fVar3.f4145l.add(this.f4186b.T.f4048e.f4193i);
                this.f4186b.T.f4048e.f4193i.f4144k.add(this.f4192h);
                fVar2 = this.f4192h;
                c12 = -d12;
            } else {
                fVar3.f4135b = true;
                fVar3.f4145l.add(this.f4186b.T.f4048e.f4193i);
                this.f4186b.T.f4048e.f4193i.f4144k.add(this.f4192h);
                q(this.f4186b.f4048e.f4192h);
                pVar = this.f4186b.f4048e;
            }
            fVar2.f4139f = c12;
            q(this.f4186b.f4048e.f4192h);
            pVar = this.f4186b.f4048e;
        } else {
            f fVar4 = this.f4192h;
            if (c12 != -1) {
                fVar4.f4145l.add(this.f4186b.T.f4050f.f4192h);
                this.f4186b.T.f4050f.f4192h.f4144k.add(this.f4192h);
                fVar = this.f4192h;
            } else if (d12 != -1) {
                fVar4.f4145l.add(this.f4186b.T.f4050f.f4193i);
                this.f4186b.T.f4050f.f4193i.f4144k.add(this.f4192h);
                fVar = this.f4192h;
                c12 = -d12;
            } else {
                fVar4.f4135b = true;
                fVar4.f4145l.add(this.f4186b.T.f4050f.f4193i);
                this.f4186b.T.f4050f.f4193i.f4144k.add(this.f4192h);
                q(this.f4186b.f4050f.f4192h);
                pVar = this.f4186b.f4050f;
            }
            fVar.f4139f = c12;
            q(this.f4186b.f4050f.f4192h);
            pVar = this.f4186b.f4050f;
        }
        q(pVar.f4193i);
    }

    @Override // q.p
    public void e() {
        if (((p.g) this.f4186b).b1() == 1) {
            this.f4186b.V0(this.f4192h.f4140g);
        } else {
            this.f4186b.W0(this.f4192h.f4140g);
        }
    }

    @Override // q.p
    void f() {
        this.f4192h.c();
    }

    @Override // q.p
    boolean m() {
        return false;
    }
}
