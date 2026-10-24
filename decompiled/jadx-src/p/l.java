package p;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class l extends e {
    public ArrayList<e> D0 = new ArrayList<>();

    public ArrayList<e> a1() {
        return this.D0;
    }

    public void b1() {
        ArrayList<e> arrayList = this.D0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = this.D0.get(i2);
            if (eVar instanceof l) {
                ((l) eVar).b1();
            }
        }
    }

    public void c(e eVar) {
        this.D0.add(eVar);
        if (eVar.I() != null) {
            ((l) eVar.I()).c1(eVar);
        }
        eVar.M0(this);
    }

    public void c1(e eVar) {
        this.D0.remove(eVar);
        eVar.h0();
    }

    public void d1() {
        this.D0.clear();
    }

    @Override // p.e
    public void h0() {
        this.D0.clear();
        super.h0();
    }

    @Override // p.e
    public void j0(o.c cVar) {
        super.j0(cVar);
        int size = this.D0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.D0.get(i2).j0(cVar);
        }
    }
}
