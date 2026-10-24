package j;

import j.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: i, reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f3585i = new HashMap<>();

    @Override // j.b
    protected b.c<K, V> b(K k2) {
        return this.f3585i.get(k2);
    }

    public boolean contains(K k2) {
        return this.f3585i.containsKey(k2);
    }

    @Override // j.b
    public V f(K k2) {
        V v2 = (V) super.f(k2);
        this.f3585i.remove(k2);
        return v2;
    }

    public Map.Entry<K, V> g(K k2) {
        if (contains(k2)) {
            return this.f3585i.get(k2).f3593h;
        }
        return null;
    }

    public V h(K k2, V v2) {
        b.c<K, V> b3 = b(k2);
        if (b3 != null) {
            return b3.f3591f;
        }
        this.f3585i.put(k2, e(k2, v2));
        return null;
    }
}
