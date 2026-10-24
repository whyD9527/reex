package androidx.fragment.app;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.d0;
import androidx.core.view.f0;
import androidx.fragment.app.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
class n {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f1878a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b, reason: collision with root package name */
    private static final p f1879b = new o();

    /* renamed from: c, reason: collision with root package name */
    private static final p f1880c = w();

    static class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f1881e;

        a(ArrayList arrayList) {
            this.f1881e = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.A(this.f1881e, 4);
        }
    }

    static class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f1882e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ p f1883f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ View f1884g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Fragment f1885h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ArrayList f1886i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ArrayList f1887j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ArrayList f1888k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Object f1889l;

        b(Object obj, p pVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f1882e = obj;
            this.f1883f = pVar;
            this.f1884g = view;
            this.f1885h = fragment;
            this.f1886i = arrayList;
            this.f1887j = arrayList2;
            this.f1888k = arrayList3;
            this.f1889l = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f1882e;
            if (obj != null) {
                this.f1883f.p(obj, this.f1884g);
                this.f1887j.addAll(n.k(this.f1883f, this.f1882e, this.f1885h, this.f1886i, this.f1884g));
            }
            if (this.f1888k != null) {
                if (this.f1889l != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f1884g);
                    this.f1883f.q(this.f1889l, this.f1888k, arrayList);
                }
                this.f1888k.clear();
                this.f1888k.add(this.f1884g);
            }
        }
    }

    static class c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Fragment f1890e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Fragment f1891f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f1892g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ l.a f1893h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ View f1894i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ p f1895j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Rect f1896k;

        c(Fragment fragment, Fragment fragment2, boolean z2, l.a aVar, View view, p pVar, Rect rect) {
            this.f1890e = fragment;
            this.f1891f = fragment2;
            this.f1892g = z2;
            this.f1893h = aVar;
            this.f1894i = view;
            this.f1895j = pVar;
            this.f1896k = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.f(this.f1890e, this.f1891f, this.f1892g, this.f1893h, false);
            View view = this.f1894i;
            if (view != null) {
                this.f1895j.k(view, this.f1896k);
            }
        }
    }

    static class d implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ p f1897e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ l.a f1898f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f1899g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ e f1900h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ArrayList f1901i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ View f1902j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Fragment f1903k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Fragment f1904l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f1905m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ArrayList f1906n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Object f1907o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Rect f1908p;

        d(p pVar, l.a aVar, Object obj, e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z2, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f1897e = pVar;
            this.f1898f = aVar;
            this.f1899g = obj;
            this.f1900h = eVar;
            this.f1901i = arrayList;
            this.f1902j = view;
            this.f1903k = fragment;
            this.f1904l = fragment2;
            this.f1905m = z2;
            this.f1906n = arrayList2;
            this.f1907o = obj2;
            this.f1908p = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            l.a<String, View> h2 = n.h(this.f1897e, this.f1898f, this.f1899g, this.f1900h);
            if (h2 != null) {
                this.f1901i.addAll(h2.values());
                this.f1901i.add(this.f1902j);
            }
            n.f(this.f1903k, this.f1904l, this.f1905m, h2, false);
            Object obj = this.f1899g;
            if (obj != null) {
                this.f1897e.z(obj, this.f1906n, this.f1901i);
                View s2 = n.s(h2, this.f1900h, this.f1907o, this.f1905m);
                if (s2 != null) {
                    this.f1897e.k(s2, this.f1908p);
                }
            }
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        public Fragment f1909a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1910b;

        /* renamed from: c, reason: collision with root package name */
        public androidx.fragment.app.a f1911c;

        /* renamed from: d, reason: collision with root package name */
        public Fragment f1912d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f1913e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.fragment.app.a f1914f;

        e() {
        }
    }

    static void A(ArrayList<View> arrayList, int i2) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i2);
        }
    }

    static void B(i iVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, boolean z2) {
        if (iVar.f1792t < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i4 = i2; i4 < i3; i4++) {
            androidx.fragment.app.a aVar = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue()) {
                e(aVar, sparseArray, z2);
            } else {
                c(aVar, sparseArray, z2);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(iVar.f1793u.g());
            int size = sparseArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                int keyAt = sparseArray.keyAt(i5);
                l.a<String, String> d3 = d(keyAt, arrayList, arrayList2, i2, i3);
                e eVar = (e) sparseArray.valueAt(i5);
                if (z2) {
                    o(iVar, keyAt, eVar, view, d3);
                } else {
                    n(iVar, keyAt, eVar, view, d3);
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, l.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View l2 = aVar.l(size);
            if (collection.contains(f0.r(l2))) {
                arrayList.add(l2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0041, code lost:
    
        if (r10.f1709o != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0092, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0076, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0090, code lost:
    
        if (r10.C == false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(androidx.fragment.app.a aVar, m.a aVar2, SparseArray<e> sparseArray, boolean z2, boolean z3) {
        int i2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        e eVar;
        i iVar;
        Fragment fragment = aVar2.f1871b;
        if (fragment == null || (i2 = fragment.A) == 0) {
            return;
        }
        int i3 = z2 ? f1878a[aVar2.f1870a] : aVar2.f1870a;
        boolean z8 = false;
        if (i3 != 1) {
            if (i3 != 3) {
                if (i3 == 4) {
                    boolean z9 = !z3 ? false : false;
                    z6 = z9;
                    z7 = false;
                    z5 = true;
                    e eVar2 = sparseArray.get(i2);
                    if (z8) {
                    }
                    eVar = eVar2;
                    if (!z3) {
                    }
                    if (z6) {
                    }
                    if (z3) {
                    }
                } else if (i3 != 5) {
                    if (i3 != 6) {
                        if (i3 != 7) {
                            z7 = false;
                            z5 = false;
                            z6 = false;
                            e eVar22 = sparseArray.get(i2);
                            if (z8) {
                                eVar22 = p(eVar22, sparseArray, i2);
                                eVar22.f1909a = fragment;
                                eVar22.f1910b = z2;
                                eVar22.f1911c = aVar;
                            }
                            eVar = eVar22;
                            if (!z3 && z7) {
                                if (eVar != null && eVar.f1912d == fragment) {
                                    eVar.f1912d = null;
                                }
                                iVar = aVar.f1742s;
                                if (fragment.f1699e < 1 && iVar.f1792t >= 1 && !aVar.f1868q) {
                                    iVar.E0(fragment);
                                    iVar.M0(fragment, 1, 0, 0, false);
                                }
                            }
                            if (z6 && (eVar == null || eVar.f1912d == null)) {
                                eVar = p(eVar, sparseArray, i2);
                                eVar.f1912d = fragment;
                                eVar.f1913e = z2;
                                eVar.f1914f = aVar;
                            }
                            if (z3 || !z5 || eVar == null || eVar.f1909a != fragment) {
                                return;
                            }
                            eVar.f1909a = null;
                            return;
                        }
                    }
                } else {
                    if (z3) {
                        if (fragment.R) {
                            if (!fragment.C) {
                            }
                        }
                        z4 = false;
                        z5 = false;
                        z6 = false;
                        z8 = z4;
                        z7 = true;
                        e eVar222 = sparseArray.get(i2);
                        if (z8) {
                        }
                        eVar = eVar222;
                        if (!z3) {
                            if (eVar != null) {
                                eVar.f1912d = null;
                            }
                            iVar = aVar.f1742s;
                            if (fragment.f1699e < 1) {
                                iVar.E0(fragment);
                                iVar.M0(fragment, 1, 0, 0, false);
                            }
                        }
                        if (z6) {
                            eVar = p(eVar, sparseArray, i2);
                            eVar.f1912d = fragment;
                            eVar.f1913e = z2;
                            eVar.f1914f = aVar;
                        }
                        if (z3) {
                            return;
                        } else {
                            return;
                        }
                    }
                    z4 = fragment.C;
                    z5 = false;
                    z6 = false;
                    z8 = z4;
                    z7 = true;
                    e eVar2222 = sparseArray.get(i2);
                    if (z8) {
                    }
                    eVar = eVar2222;
                    if (!z3) {
                    }
                    if (z6) {
                    }
                    if (z3) {
                    }
                }
            }
            boolean z10 = fragment.f1709o;
            if (!z3) {
            }
            z6 = z9;
            z7 = false;
            z5 = true;
            e eVar22222 = sparseArray.get(i2);
            if (z8) {
            }
            eVar = eVar22222;
            if (!z3) {
            }
            if (z6) {
            }
            if (z3) {
            }
        }
        if (z3) {
            z4 = fragment.Q;
            z5 = false;
            z6 = false;
            z8 = z4;
            z7 = true;
            e eVar222222 = sparseArray.get(i2);
            if (z8) {
            }
            eVar = eVar222222;
            if (!z3) {
            }
            if (z6) {
            }
            if (z3) {
            }
        } else {
            if (!fragment.f1709o) {
            }
            z4 = false;
            z5 = false;
            z6 = false;
            z8 = z4;
            z7 = true;
            e eVar2222222 = sparseArray.get(i2);
            if (z8) {
            }
            eVar = eVar2222222;
            if (!z3) {
            }
            if (z6) {
            }
            if (z3) {
            }
        }
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z2) {
        int size = aVar.f1852a.size();
        for (int i2 = 0; i2 < size; i2++) {
            b(aVar, aVar.f1852a.get(i2), sparseArray, false, z2);
        }
    }

    private static l.a<String, String> d(int i2, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i3, int i4) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        l.a<String, String> aVar = new l.a<>();
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i5);
            if (aVar2.j(i2)) {
                boolean booleanValue = arrayList2.get(i5).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f1866o;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f1866o;
                        arrayList4 = aVar2.f1867p;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f1866o;
                        arrayList3 = aVar2.f1867p;
                        arrayList4 = arrayList6;
                    }
                    for (int i6 = 0; i6 < size; i6++) {
                        String str = arrayList4.get(i6);
                        String str2 = arrayList3.get(i6);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z2) {
        if (aVar.f1742s.f1794v.d()) {
            for (int size = aVar.f1852a.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f1852a.get(size), sparseArray, true, z2);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z2, l.a<String, View> aVar, boolean z3) {
        if (z2) {
            fragment2.q();
        } else {
            fragment.q();
        }
    }

    private static boolean g(p pVar, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!pVar.e(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    static l.a<String, View> h(p pVar, l.a<String, String> aVar, Object obj, e eVar) {
        ArrayList<String> arrayList;
        Fragment fragment = eVar.f1909a;
        View I = fragment.I();
        if (aVar.isEmpty() || obj == null || I == null) {
            aVar.clear();
            return null;
        }
        l.a<String, View> aVar2 = new l.a<>();
        pVar.j(aVar2, I);
        androidx.fragment.app.a aVar3 = eVar.f1911c;
        if (eVar.f1910b) {
            fragment.s();
            arrayList = aVar3.f1866o;
        } else {
            fragment.q();
            arrayList = aVar3.f1867p;
        }
        if (arrayList != null) {
            aVar2.n(arrayList);
            aVar2.n(aVar.values());
        }
        x(aVar, aVar2);
        return aVar2;
    }

    private static l.a<String, View> i(p pVar, l.a<String, String> aVar, Object obj, e eVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = eVar.f1912d;
        l.a<String, View> aVar2 = new l.a<>();
        pVar.j(aVar2, fragment.X0());
        androidx.fragment.app.a aVar3 = eVar.f1914f;
        if (eVar.f1913e) {
            fragment.q();
            arrayList = aVar3.f1867p;
        } else {
            fragment.s();
            arrayList = aVar3.f1866o;
        }
        aVar2.n(arrayList);
        aVar.n(aVar2.keySet());
        return aVar2;
    }

    private static p j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object r2 = fragment.r();
            if (r2 != null) {
                arrayList.add(r2);
            }
            Object D = fragment.D();
            if (D != null) {
                arrayList.add(D);
            }
            Object F = fragment.F();
            if (F != null) {
                arrayList.add(F);
            }
        }
        if (fragment2 != null) {
            Object p2 = fragment2.p();
            if (p2 != null) {
                arrayList.add(p2);
            }
            Object A = fragment2.A();
            if (A != null) {
                arrayList.add(A);
            }
            Object E = fragment2.E();
            if (E != null) {
                arrayList.add(E);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        p pVar = f1879b;
        if (pVar != null && g(pVar, arrayList)) {
            return pVar;
        }
        p pVar2 = f1880c;
        if (pVar2 != null && g(pVar2, arrayList)) {
            return pVar2;
        }
        if (pVar == null && pVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(p pVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View I = fragment.I();
        if (I != null) {
            pVar.f(arrayList2, I);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        pVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(p pVar, ViewGroup viewGroup, View view, l.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object t2;
        l.a<String, String> aVar2;
        Object obj3;
        Rect rect;
        Fragment fragment = eVar.f1909a;
        Fragment fragment2 = eVar.f1912d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z2 = eVar.f1910b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            t2 = null;
        } else {
            t2 = t(pVar, fragment, fragment2, z2);
            aVar2 = aVar;
        }
        l.a<String, View> i2 = i(pVar, aVar2, t2, eVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(i2.values());
            obj3 = t2;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z2, i2, true);
        if (obj3 != null) {
            rect = new Rect();
            pVar.y(obj3, view, arrayList);
            z(pVar, obj3, obj2, i2, eVar.f1913e, eVar.f1914f);
            if (obj != null) {
                pVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        d0.a(viewGroup, new d(pVar, aVar, obj3, eVar, arrayList2, view, fragment, fragment2, z2, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(p pVar, ViewGroup viewGroup, View view, l.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = eVar.f1909a;
        Fragment fragment2 = eVar.f1912d;
        if (fragment != null) {
            fragment.X0().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z2 = eVar.f1910b;
        Object t2 = aVar.isEmpty() ? null : t(pVar, fragment, fragment2, z2);
        l.a<String, View> i2 = i(pVar, aVar, t2, eVar);
        l.a<String, View> h2 = h(pVar, aVar, t2, eVar);
        if (aVar.isEmpty()) {
            if (i2 != null) {
                i2.clear();
            }
            if (h2 != null) {
                h2.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, i2, aVar.keySet());
            a(arrayList2, h2, aVar.values());
            obj3 = t2;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z2, i2, true);
        if (obj3 != null) {
            arrayList2.add(view);
            pVar.y(obj3, view, arrayList);
            z(pVar, obj3, obj2, i2, eVar.f1913e, eVar.f1914f);
            Rect rect2 = new Rect();
            View s2 = s(h2, eVar, obj, z2);
            if (s2 != null) {
                pVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = s2;
        } else {
            view2 = null;
            rect = null;
        }
        d0.a(viewGroup, new c(fragment, fragment2, z2, h2, view2, pVar, rect));
        return obj3;
    }

    private static void n(i iVar, int i2, e eVar, View view, l.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        p j2;
        Object obj;
        ViewGroup viewGroup = iVar.f1794v.d() ? (ViewGroup) iVar.f1794v.c(i2) : null;
        if (viewGroup == null || (j2 = j((fragment2 = eVar.f1912d), (fragment = eVar.f1909a))) == null) {
            return;
        }
        boolean z2 = eVar.f1910b;
        boolean z3 = eVar.f1913e;
        Object q2 = q(j2, fragment, z2);
        Object r2 = r(j2, fragment2, z3);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object l2 = l(j2, viewGroup, view, aVar, eVar, arrayList, arrayList2, q2, r2);
        if (q2 == null && l2 == null) {
            obj = r2;
            if (obj == null) {
                return;
            }
        } else {
            obj = r2;
        }
        ArrayList<View> k2 = k(j2, obj, fragment2, arrayList, view);
        Object obj2 = (k2 == null || k2.isEmpty()) ? null : obj;
        j2.a(q2, view);
        Object u2 = u(j2, q2, obj2, l2, fragment, eVar.f1910b);
        if (u2 != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            j2.t(u2, q2, arrayList3, obj2, k2, l2, arrayList2);
            y(j2, viewGroup, fragment, view, arrayList2, q2, arrayList3, obj2, k2);
            j2.w(viewGroup, arrayList2, aVar);
            j2.c(viewGroup, u2);
            j2.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(i iVar, int i2, e eVar, View view, l.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        p j2;
        Object obj;
        ViewGroup viewGroup = iVar.f1794v.d() ? (ViewGroup) iVar.f1794v.c(i2) : null;
        if (viewGroup == null || (j2 = j((fragment2 = eVar.f1912d), (fragment = eVar.f1909a))) == null) {
            return;
        }
        boolean z2 = eVar.f1910b;
        boolean z3 = eVar.f1913e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object q2 = q(j2, fragment, z2);
        Object r2 = r(j2, fragment2, z3);
        Object m2 = m(j2, viewGroup, view, aVar, eVar, arrayList2, arrayList, q2, r2);
        if (q2 == null && m2 == null) {
            obj = r2;
            if (obj == null) {
                return;
            }
        } else {
            obj = r2;
        }
        ArrayList<View> k2 = k(j2, obj, fragment2, arrayList2, view);
        ArrayList<View> k3 = k(j2, q2, fragment, arrayList, view);
        A(k3, 4);
        Object u2 = u(j2, q2, obj, m2, fragment, z2);
        if (u2 != null) {
            v(j2, obj, fragment2, k2);
            ArrayList<String> o2 = j2.o(arrayList);
            j2.t(u2, q2, k3, obj, k2, m2, arrayList);
            j2.c(viewGroup, u2);
            j2.x(viewGroup, arrayList2, arrayList, o2, aVar);
            A(k3, 0);
            j2.z(m2, arrayList2, arrayList);
        }
    }

    private static e p(e eVar, SparseArray<e> sparseArray, int i2) {
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        sparseArray.put(i2, eVar2);
        return eVar2;
    }

    private static Object q(p pVar, Fragment fragment, boolean z2) {
        if (fragment == null) {
            return null;
        }
        return pVar.g(z2 ? fragment.A() : fragment.p());
    }

    private static Object r(p pVar, Fragment fragment, boolean z2) {
        if (fragment == null) {
            return null;
        }
        return pVar.g(z2 ? fragment.D() : fragment.r());
    }

    static View s(l.a<String, View> aVar, e eVar, Object obj, boolean z2) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = eVar.f1911c;
        if (obj == null || aVar == null || (arrayList = aVar2.f1866o) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z2 ? aVar2.f1866o : aVar2.f1867p).get(0));
    }

    private static Object t(p pVar, Fragment fragment, Fragment fragment2, boolean z2) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return pVar.A(pVar.g(z2 ? fragment2.F() : fragment.E()));
    }

    private static Object u(p pVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z2) {
        return (obj == null || obj2 == null || fragment == null) ? true : z2 ? fragment.i() : fragment.h() ? pVar.n(obj2, obj, obj3) : pVar.m(obj2, obj, obj3);
    }

    private static void v(p pVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f1709o && fragment.C && fragment.R) {
            fragment.d1(true);
            pVar.r(obj, fragment.I(), arrayList);
            d0.a(fragment.J, new a(arrayList));
        }
    }

    private static p w() {
        try {
            return (p) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void x(l.a<String, String> aVar, l.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.l(size))) {
                aVar.j(size);
            }
        }
    }

    private static void y(p pVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        d0.a(viewGroup, new b(obj, pVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(p pVar, Object obj, Object obj2, l.a<String, View> aVar, boolean z2, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.f1866o;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z2 ? aVar2.f1867p : aVar2.f1866o).get(0));
        pVar.v(obj, view);
        if (obj2 != null) {
            pVar.v(obj2, view);
        }
    }
}
