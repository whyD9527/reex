package q;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    p f4137d;

    /* renamed from: f, reason: collision with root package name */
    int f4139f;

    /* renamed from: g, reason: collision with root package name */
    public int f4140g;

    /* renamed from: a, reason: collision with root package name */
    public d f4134a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4135b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4136c = false;

    /* renamed from: e, reason: collision with root package name */
    a f4138e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    int f4141h = 1;

    /* renamed from: i, reason: collision with root package name */
    g f4142i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4143j = false;

    /* renamed from: k, reason: collision with root package name */
    List<d> f4144k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    List<f> f4145l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f4137d = pVar;
    }

    @Override // q.d
    public void a(d dVar) {
        Iterator<f> it = this.f4145l.iterator();
        while (it.hasNext()) {
            if (!it.next().f4143j) {
                return;
            }
        }
        this.f4136c = true;
        d dVar2 = this.f4134a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f4135b) {
            this.f4137d.a(this);
            return;
        }
        f fVar = null;
        int i2 = 0;
        for (f fVar2 : this.f4145l) {
            if (!(fVar2 instanceof g)) {
                i2++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i2 == 1 && fVar.f4143j) {
            g gVar = this.f4142i;
            if (gVar != null) {
                if (!gVar.f4143j) {
                    return;
                } else {
                    this.f4139f = this.f4141h * gVar.f4140g;
                }
            }
            d(fVar.f4140g + this.f4139f);
        }
        d dVar3 = this.f4134a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f4144k.add(dVar);
        if (this.f4143j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f4145l.clear();
        this.f4144k.clear();
        this.f4143j = false;
        this.f4140g = 0;
        this.f4136c = false;
        this.f4135b = false;
    }

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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4137d.f4186b.r());
        sb.append(":");
        sb.append(this.f4138e);
        sb.append("(");
        sb.append(this.f4143j ? Integer.valueOf(this.f4140g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f4145l.size());
        sb.append(":d=");
        sb.append(this.f4144k.size());
        sb.append(">");
        return sb.toString();
    }
}
