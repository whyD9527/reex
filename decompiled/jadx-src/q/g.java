package q;

import q.f;

/* loaded from: classes.dex */
class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f4155m;

    public g(p pVar) {
        super(pVar);
        this.f4138e = pVar instanceof l ? f.a.HORIZONTAL_DIMENSION : f.a.VERTICAL_DIMENSION;
    }

    @Override // q.f
    public void d(int i2) {
        if (this.f4143j) {
            return;
        }
        this.f4143j = true;
        this.f4140g = i2;
        for (d dVar : this.f4144k) {
            dVar.a(dVar);
        }
    }
}
