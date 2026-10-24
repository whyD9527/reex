package j;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: e, reason: collision with root package name */
    c<K, V> f3586e;

    /* renamed from: f, reason: collision with root package name */
    private c<K, V> f3587f;

    /* renamed from: g, reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f3588g = new WeakHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private int f3589h = 0;

    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // j.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f3593h;
        }

        @Override // j.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f3592g;
        }
    }

    /* renamed from: j.b$b, reason: collision with other inner class name */
    private static class C0049b<K, V> extends e<K, V> {
        C0049b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // j.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f3592g;
        }

        @Override // j.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f3593h;
        }
    }

    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: e, reason: collision with root package name */
        final K f3590e;

        /* renamed from: f, reason: collision with root package name */
        final V f3591f;

        /* renamed from: g, reason: collision with root package name */
        c<K, V> f3592g;

        /* renamed from: h, reason: collision with root package name */
        c<K, V> f3593h;

        c(K k2, V v2) {
            this.f3590e = k2;
            this.f3591f = v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f3590e.equals(cVar.f3590e) && this.f3591f.equals(cVar.f3591f);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f3590e;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f3591f;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f3590e.hashCode() ^ this.f3591f.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f3590e + "=" + this.f3591f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: e, reason: collision with root package name */
        private c<K, V> f3594e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f3595f = true;

        d() {
        }

        @Override // j.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f3594e;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f3593h;
                this.f3594e = cVar3;
                this.f3595f = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f3595f) {
                this.f3595f = false;
                cVar = b.this.f3586e;
            } else {
                c<K, V> cVar2 = this.f3594e;
                cVar = cVar2 != null ? cVar2.f3592g : null;
            }
            this.f3594e = cVar;
            return this.f3594e;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f3595f) {
                return b.this.f3586e != null;
            }
            c<K, V> cVar = this.f3594e;
            return (cVar == null || cVar.f3592g == null) ? false : true;
        }
    }

    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: e, reason: collision with root package name */
        c<K, V> f3597e;

        /* renamed from: f, reason: collision with root package name */
        c<K, V> f3598f;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f3597e = cVar2;
            this.f3598f = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f3598f;
            c<K, V> cVar2 = this.f3597e;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // j.b.f
        public void a(c<K, V> cVar) {
            if (this.f3597e == cVar && cVar == this.f3598f) {
                this.f3598f = null;
                this.f3597e = null;
            }
            c<K, V> cVar2 = this.f3597e;
            if (cVar2 == cVar) {
                this.f3597e = b(cVar2);
            }
            if (this.f3598f == cVar) {
                this.f3598f = e();
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f3598f;
            this.f3598f = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3598f != null;
        }
    }

    interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public Map.Entry<K, V> a() {
        return this.f3586e;
    }

    protected c<K, V> b(K k2) {
        c<K, V> cVar = this.f3586e;
        while (cVar != null && !cVar.f3590e.equals(k2)) {
            cVar = cVar.f3592g;
        }
        return cVar;
    }

    public b<K, V>.d c() {
        b<K, V>.d dVar = new d();
        this.f3588g.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> d() {
        return this.f3587f;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0049b c0049b = new C0049b(this.f3587f, this.f3586e);
        this.f3588g.put(c0049b, Boolean.FALSE);
        return c0049b;
    }

    protected c<K, V> e(K k2, V v2) {
        c<K, V> cVar = new c<>(k2, v2);
        this.f3589h++;
        c<K, V> cVar2 = this.f3587f;
        if (cVar2 == null) {
            this.f3586e = cVar;
        } else {
            cVar2.f3592g = cVar;
            cVar.f3593h = cVar2;
        }
        this.f3587f = cVar;
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public V f(K k2) {
        c<K, V> b3 = b(k2);
        if (b3 == null) {
            return null;
        }
        this.f3589h--;
        if (!this.f3588g.isEmpty()) {
            Iterator<f<K, V>> it = this.f3588g.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(b3);
            }
        }
        c<K, V> cVar = b3.f3593h;
        c<K, V> cVar2 = b3.f3592g;
        if (cVar != null) {
            cVar.f3592g = cVar2;
        } else {
            this.f3586e = cVar2;
        }
        c<K, V> cVar3 = b3.f3592g;
        if (cVar3 != null) {
            cVar3.f3593h = cVar;
        } else {
            this.f3587f = cVar;
        }
        b3.f3592g = null;
        b3.f3593h = null;
        return b3.f3591f;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += it.next().hashCode();
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f3586e, this.f3587f);
        this.f3588g.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f3589h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
