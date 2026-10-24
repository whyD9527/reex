package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
class k extends androidx.lifecycle.q {

    /* renamed from: i, reason: collision with root package name */
    private static final r.a f1831i = new a();

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1835f;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet<Fragment> f1832c = new HashSet<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, k> f1833d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, s> f1834e = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private boolean f1836g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1837h = false;

    static class a implements r.a {
        a() {
        }

        @Override // androidx.lifecycle.r.a
        public <T extends androidx.lifecycle.q> T a(Class<T> cls) {
            return new k(true);
        }
    }

    k(boolean z2) {
        this.f1835f = z2;
    }

    static k g(s sVar) {
        return (k) new androidx.lifecycle.r(sVar, f1831i).a(k.class);
    }

    @Override // androidx.lifecycle.q
    protected void c() {
        if (i.L) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1836g = true;
    }

    boolean d(Fragment fragment) {
        return this.f1832c.add(fragment);
    }

    void e(Fragment fragment) {
        if (i.L) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        k kVar = this.f1833d.get(fragment.f1703i);
        if (kVar != null) {
            kVar.c();
            this.f1833d.remove(fragment.f1703i);
        }
        s sVar = this.f1834e.get(fragment.f1703i);
        if (sVar != null) {
            sVar.a();
            this.f1834e.remove(fragment.f1703i);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f1832c.equals(kVar.f1832c) && this.f1833d.equals(kVar.f1833d) && this.f1834e.equals(kVar.f1834e);
    }

    k f(Fragment fragment) {
        k kVar = this.f1833d.get(fragment.f1703i);
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this.f1835f);
        this.f1833d.put(fragment.f1703i, kVar2);
        return kVar2;
    }

    Collection<Fragment> h() {
        return this.f1832c;
    }

    public int hashCode() {
        return (((this.f1832c.hashCode() * 31) + this.f1833d.hashCode()) * 31) + this.f1834e.hashCode();
    }

    s i(Fragment fragment) {
        s sVar = this.f1834e.get(fragment.f1703i);
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s();
        this.f1834e.put(fragment.f1703i, sVar2);
        return sVar2;
    }

    boolean j() {
        return this.f1836g;
    }

    boolean k(Fragment fragment) {
        return this.f1832c.remove(fragment);
    }

    boolean l(Fragment fragment) {
        if (this.f1832c.contains(fragment)) {
            return this.f1835f ? this.f1836g : !this.f1837h;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f1832c.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1833d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1834e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
