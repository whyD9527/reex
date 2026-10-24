package q;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o {

    /* renamed from: g, reason: collision with root package name */
    static int f4170g;

    /* renamed from: b, reason: collision with root package name */
    int f4172b;

    /* renamed from: d, reason: collision with root package name */
    int f4174d;

    /* renamed from: a, reason: collision with root package name */
    ArrayList<p.e> f4171a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    boolean f4173c = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<a> f4175e = null;

    /* renamed from: f, reason: collision with root package name */
    private int f4176f = -1;

    class a {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<p.e> f4177a;

        /* renamed from: b, reason: collision with root package name */
        int f4178b;

        /* renamed from: c, reason: collision with root package name */
        int f4179c;

        /* renamed from: d, reason: collision with root package name */
        int f4180d;

        /* renamed from: e, reason: collision with root package name */
        int f4181e;

        /* renamed from: f, reason: collision with root package name */
        int f4182f;

        /* renamed from: g, reason: collision with root package name */
        int f4183g;

        public a(p.e eVar, o.d dVar, int i2) {
            this.f4177a = new WeakReference<>(eVar);
            this.f4178b = dVar.x(eVar.H);
            this.f4179c = dVar.x(eVar.I);
            this.f4180d = dVar.x(eVar.J);
            this.f4181e = dVar.x(eVar.K);
            this.f4182f = dVar.x(eVar.L);
            this.f4183g = i2;
        }
    }

    public o(int i2) {
        int i3 = f4170g;
        f4170g = i3 + 1;
        this.f4172b = i3;
        this.f4174d = i2;
    }

    private String e() {
        int i2 = this.f4174d;
        return i2 == 0 ? "Horizontal" : i2 == 1 ? "Vertical" : i2 == 2 ? "Both" : "Unknown";
    }

    private int j(o.d dVar, ArrayList<p.e> arrayList, int i2) {
        int x2;
        p.d dVar2;
        p.f fVar = (p.f) arrayList.get(0).I();
        dVar.D();
        fVar.g(dVar, false);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList.get(i3).g(dVar, false);
        }
        if (i2 == 0 && fVar.N0 > 0) {
            p.b.b(fVar, dVar, arrayList, 0);
        }
        if (i2 == 1 && fVar.O0 > 0) {
            p.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        this.f4175e = new ArrayList<>();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            this.f4175e.add(new a(arrayList.get(i4), dVar, i2));
        }
        if (i2 == 0) {
            x2 = dVar.x(fVar.H);
            dVar2 = fVar.J;
        } else {
            x2 = dVar.x(fVar.I);
            dVar2 = fVar.K;
        }
        int x3 = dVar.x(dVar2);
        dVar.D();
        return x3 - x2;
    }

    public boolean a(p.e eVar) {
        if (this.f4171a.contains(eVar)) {
            return false;
        }
        this.f4171a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f4171a.size();
        if (this.f4176f != -1 && size > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                o oVar = arrayList.get(i2);
                if (this.f4176f == oVar.f4172b) {
                    g(this.f4174d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f4172b;
    }

    public int d() {
        return this.f4174d;
    }

    public int f(o.d dVar, int i2) {
        if (this.f4171a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f4171a, i2);
    }

    public void g(int i2, o oVar) {
        Iterator<p.e> it = this.f4171a.iterator();
        while (it.hasNext()) {
            p.e next = it.next();
            oVar.a(next);
            int c3 = oVar.c();
            if (i2 == 0) {
                next.A0 = c3;
            } else {
                next.B0 = c3;
            }
        }
        this.f4176f = oVar.f4172b;
    }

    public void h(boolean z2) {
        this.f4173c = z2;
    }

    public void i(int i2) {
        this.f4174d = i2;
    }

    public String toString() {
        String str = e() + " [" + this.f4172b + "] <";
        Iterator<p.e> it = this.f4171a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().r();
        }
        return str + " >";
    }
}
