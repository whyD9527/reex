package l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
abstract class f<K, V> {

    /* renamed from: a, reason: collision with root package name */
    f<K, V>.b f3797a;

    /* renamed from: b, reason: collision with root package name */
    f<K, V>.c f3798b;

    /* renamed from: c, reason: collision with root package name */
    f<K, V>.e f3799c;

    final class a<T> implements Iterator<T> {

        /* renamed from: e, reason: collision with root package name */
        final int f3800e;

        /* renamed from: f, reason: collision with root package name */
        int f3801f;

        /* renamed from: g, reason: collision with root package name */
        int f3802g;

        /* renamed from: h, reason: collision with root package name */
        boolean f3803h = false;

        a(int i2) {
            this.f3800e = i2;
            this.f3801f = f.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3802g < this.f3801f;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t2 = (T) f.this.b(this.f3802g, this.f3800e);
            this.f3802g++;
            this.f3803h = true;
            return t2;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f3803h) {
                throw new IllegalStateException();
            }
            int i2 = this.f3802g - 1;
            this.f3802g = i2;
            this.f3801f--;
            this.f3803h = false;
            f.this.h(i2);
        }
    }

    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d3 = f.this.d();
            for (Map.Entry<K, V> entry : collection) {
                f.this.g(entry.getKey(), entry.getValue());
            }
            return d3 != f.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            f.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e3 = f.this.e(entry.getKey());
            if (e3 < 0) {
                return false;
            }
            return l.c.c(f.this.b(e3, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i2 = 0;
            for (int d3 = f.this.d() - 1; d3 >= 0; d3--) {
                Object b3 = f.this.b(d3, 0);
                Object b4 = f.this.b(d3, 1);
                i2 += (b3 == null ? 0 : b3.hashCode()) ^ (b4 == null ? 0 : b4.hashCode());
            }
            return i2;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return f.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            f.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return f.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return f.j(f.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i2 = 0;
            for (int d3 = f.this.d() - 1; d3 >= 0; d3--) {
                Object b3 = f.this.b(d3, 0);
                i2 += b3 == null ? 0 : b3.hashCode();
            }
            return i2;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int e3 = f.this.e(obj);
            if (e3 < 0) {
                return false;
            }
            f.this.h(e3);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return f.o(f.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return f.p(f.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return f.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return f.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) f.this.r(tArr, 0);
        }
    }

    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: e, reason: collision with root package name */
        int f3807e;

        /* renamed from: g, reason: collision with root package name */
        boolean f3809g = false;

        /* renamed from: f, reason: collision with root package name */
        int f3808f = -1;

        d() {
            this.f3807e = f.this.d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f3808f++;
            this.f3809g = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f3809g) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return l.c.c(entry.getKey(), f.this.b(this.f3808f, 0)) && l.c.c(entry.getValue(), f.this.b(this.f3808f, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f3809g) {
                return (K) f.this.b(this.f3808f, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f3809g) {
                return (V) f.this.b(this.f3808f, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3808f < this.f3807e;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f3809g) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object b3 = f.this.b(this.f3808f, 0);
            Object b4 = f.this.b(this.f3808f, 1);
            return (b3 == null ? 0 : b3.hashCode()) ^ (b4 != null ? b4.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f3809g) {
                throw new IllegalStateException();
            }
            f.this.h(this.f3808f);
            this.f3808f--;
            this.f3807e--;
            this.f3809g = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            if (this.f3809g) {
                return (V) f.this.i(this.f3808f, v2);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            f.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return f.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int f2 = f.this.f(obj);
            if (f2 < 0) {
                return false;
            }
            f.this.h(f2);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int d3 = f.this.d();
            int i2 = 0;
            boolean z2 = false;
            while (i2 < d3) {
                if (collection.contains(f.this.b(i2, 1))) {
                    f.this.h(i2);
                    i2--;
                    d3--;
                    z2 = true;
                }
                i2++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int d3 = f.this.d();
            int i2 = 0;
            boolean z2 = false;
            while (i2 < d3) {
                if (!collection.contains(f.this.b(i2, 1))) {
                    f.this.h(i2);
                    i2--;
                    d3--;
                    z2 = true;
                }
                i2++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public int size() {
            return f.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return f.this.q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) f.this.r(tArr, 1);
        }
    }

    f() {
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    protected abstract void a();

    protected abstract Object b(int i2, int i3);

    protected abstract Map<K, V> c();

    protected abstract int d();

    protected abstract int e(Object obj);

    protected abstract int f(Object obj);

    protected abstract void g(K k2, V v2);

    protected abstract void h(int i2);

    protected abstract V i(int i2, V v2);

    public Set<Map.Entry<K, V>> l() {
        if (this.f3797a == null) {
            this.f3797a = new b();
        }
        return this.f3797a;
    }

    public Set<K> m() {
        if (this.f3798b == null) {
            this.f3798b = new c();
        }
        return this.f3798b;
    }

    public Collection<V> n() {
        if (this.f3799c == null) {
            this.f3799c = new e();
        }
        return this.f3799c;
    }

    public Object[] q(int i2) {
        int d3 = d();
        Object[] objArr = new Object[d3];
        for (int i3 = 0; i3 < d3; i3++) {
            objArr[i3] = b(i3, i2);
        }
        return objArr;
    }

    public <T> T[] r(T[] tArr, int i2) {
        int d3 = d();
        if (tArr.length < d3) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), d3));
        }
        for (int i3 = 0; i3 < d3; i3++) {
            tArr[i3] = b(i3, i2);
        }
        if (tArr.length > d3) {
            tArr[d3] = null;
        }
        return tArr;
    }
}
