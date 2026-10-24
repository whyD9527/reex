package p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o.i;
import q.o;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private int f4021b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4022c;

    /* renamed from: d, reason: collision with root package name */
    public final e f4023d;

    /* renamed from: e, reason: collision with root package name */
    public final b f4024e;

    /* renamed from: f, reason: collision with root package name */
    public d f4025f;

    /* renamed from: i, reason: collision with root package name */
    o.i f4028i;

    /* renamed from: a, reason: collision with root package name */
    private HashSet<d> f4020a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f4026g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f4027h = -1;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4029a;

        static {
            int[] iArr = new int[b.values().length];
            f4029a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4029a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4029a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4029a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4029a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4029a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4029a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4029a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4029a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f4023d = eVar;
        this.f4024e = bVar;
    }

    public boolean a(d dVar, int i2, int i3, boolean z2) {
        if (dVar == null) {
            p();
            return true;
        }
        if (!z2 && !o(dVar)) {
            return false;
        }
        this.f4025f = dVar;
        if (dVar.f4020a == null) {
            dVar.f4020a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f4025f.f4020a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i2 > 0) {
            this.f4026g = i2;
        } else {
            this.f4026g = 0;
        }
        this.f4027h = i3;
        return true;
    }

    public void b(int i2, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f4020a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                q.i.a(it.next().f4023d, i2, arrayList, oVar);
            }
        }
    }

    public HashSet<d> c() {
        return this.f4020a;
    }

    public int d() {
        if (this.f4022c) {
            return this.f4021b;
        }
        return 0;
    }

    public int e() {
        d dVar;
        if (this.f4023d.Q() == 8) {
            return 0;
        }
        return (this.f4027h <= -1 || (dVar = this.f4025f) == null || dVar.f4023d.Q() != 8) ? this.f4026g : this.f4027h;
    }

    public final d f() {
        switch (a.f4029a[this.f4024e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f4023d.J;
            case 3:
                return this.f4023d.H;
            case 4:
                return this.f4023d.K;
            case 5:
                return this.f4023d.I;
            default:
                throw new AssertionError(this.f4024e.name());
        }
    }

    public e g() {
        return this.f4023d;
    }

    public o.i h() {
        return this.f4028i;
    }

    public d i() {
        return this.f4025f;
    }

    public b j() {
        return this.f4024e;
    }

    public boolean k() {
        HashSet<d> hashSet = this.f4020a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().n()) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        HashSet<d> hashSet = this.f4020a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean m() {
        return this.f4022c;
    }

    public boolean n() {
        return this.f4025f != null;
    }

    public boolean o(d dVar) {
        if (dVar == null) {
            return false;
        }
        b j2 = dVar.j();
        b bVar = this.f4024e;
        if (j2 == bVar) {
            return bVar != b.BASELINE || (dVar.g().U() && g().U());
        }
        switch (a.f4029a[bVar.ordinal()]) {
            case 1:
                return (j2 == b.BASELINE || j2 == b.CENTER_X || j2 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = j2 == b.LEFT || j2 == b.RIGHT;
                if (dVar.g() instanceof g) {
                    return z2 || j2 == b.CENTER_X;
                }
                return z2;
            case 4:
            case 5:
                boolean z3 = j2 == b.TOP || j2 == b.BOTTOM;
                if (dVar.g() instanceof g) {
                    return z3 || j2 == b.CENTER_Y;
                }
                return z3;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f4024e.name());
        }
    }

    public void p() {
        HashSet<d> hashSet;
        d dVar = this.f4025f;
        if (dVar != null && (hashSet = dVar.f4020a) != null) {
            hashSet.remove(this);
            if (this.f4025f.f4020a.size() == 0) {
                this.f4025f.f4020a = null;
            }
        }
        this.f4020a = null;
        this.f4025f = null;
        this.f4026g = 0;
        this.f4027h = -1;
        this.f4022c = false;
        this.f4021b = 0;
    }

    public void q() {
        this.f4022c = false;
        this.f4021b = 0;
    }

    public void r(o.c cVar) {
        o.i iVar = this.f4028i;
        if (iVar == null) {
            this.f4028i = new o.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public void s(int i2) {
        this.f4021b = i2;
        this.f4022c = true;
    }

    public String toString() {
        return this.f4023d.r() + ":" + this.f4024e.toString();
    }
}
