package androidx.fragment.app;

import androidx.lifecycle.d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: b, reason: collision with root package name */
    int f1853b;

    /* renamed from: c, reason: collision with root package name */
    int f1854c;

    /* renamed from: d, reason: collision with root package name */
    int f1855d;

    /* renamed from: e, reason: collision with root package name */
    int f1856e;

    /* renamed from: f, reason: collision with root package name */
    int f1857f;

    /* renamed from: g, reason: collision with root package name */
    int f1858g;

    /* renamed from: h, reason: collision with root package name */
    boolean f1859h;

    /* renamed from: j, reason: collision with root package name */
    String f1861j;

    /* renamed from: k, reason: collision with root package name */
    int f1862k;

    /* renamed from: l, reason: collision with root package name */
    CharSequence f1863l;

    /* renamed from: m, reason: collision with root package name */
    int f1864m;

    /* renamed from: n, reason: collision with root package name */
    CharSequence f1865n;

    /* renamed from: o, reason: collision with root package name */
    ArrayList<String> f1866o;

    /* renamed from: p, reason: collision with root package name */
    ArrayList<String> f1867p;

    /* renamed from: r, reason: collision with root package name */
    ArrayList<Runnable> f1869r;

    /* renamed from: a, reason: collision with root package name */
    ArrayList<a> f1852a = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    boolean f1860i = true;

    /* renamed from: q, reason: collision with root package name */
    boolean f1868q = false;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f1870a;

        /* renamed from: b, reason: collision with root package name */
        Fragment f1871b;

        /* renamed from: c, reason: collision with root package name */
        int f1872c;

        /* renamed from: d, reason: collision with root package name */
        int f1873d;

        /* renamed from: e, reason: collision with root package name */
        int f1874e;

        /* renamed from: f, reason: collision with root package name */
        int f1875f;

        /* renamed from: g, reason: collision with root package name */
        d.c f1876g;

        /* renamed from: h, reason: collision with root package name */
        d.c f1877h;

        a() {
        }

        a(int i2, Fragment fragment) {
            this.f1870a = i2;
            this.f1871b = fragment;
            d.c cVar = d.c.RESUMED;
            this.f1876g = cVar;
            this.f1877h = cVar;
        }
    }

    void b(a aVar) {
        this.f1852a.add(aVar);
        aVar.f1872c = this.f1853b;
        aVar.f1873d = this.f1854c;
        aVar.f1874e = this.f1855d;
        aVar.f1875f = this.f1856e;
    }
}
