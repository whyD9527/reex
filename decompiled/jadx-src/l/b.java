package l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f3770i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    private static final Object[] f3771j = new Object[0];

    /* renamed from: k, reason: collision with root package name */
    private static Object[] f3772k;

    /* renamed from: l, reason: collision with root package name */
    private static int f3773l;

    /* renamed from: m, reason: collision with root package name */
    private static Object[] f3774m;

    /* renamed from: n, reason: collision with root package name */
    private static int f3775n;

    /* renamed from: e, reason: collision with root package name */
    private int[] f3776e;

    /* renamed from: f, reason: collision with root package name */
    Object[] f3777f;

    /* renamed from: g, reason: collision with root package name */
    int f3778g;

    /* renamed from: h, reason: collision with root package name */
    private f<E, E> f3779h;

    class a extends f<E, E> {
        a() {
        }

        @Override // l.f
        protected void a() {
            b.this.clear();
        }

        @Override // l.f
        protected Object b(int i2, int i3) {
            return b.this.f3777f[i2];
        }

        @Override // l.f
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // l.f
        protected int d() {
            return b.this.f3778g;
        }

        @Override // l.f
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // l.f
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // l.f
        protected void g(E e3, E e4) {
            b.this.add(e3);
        }

        @Override // l.f
        protected void h(int i2) {
            b.this.g(i2);
        }

        @Override // l.f
        protected E i(int i2, E e3) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public b(int i2) {
        if (i2 == 0) {
            this.f3776e = f3770i;
            this.f3777f = f3771j;
        } else {
            a(i2);
        }
        this.f3778g = 0;
    }

    private void a(int i2) {
        if (i2 == 8) {
            synchronized (b.class) {
                Object[] objArr = f3774m;
                if (objArr != null) {
                    this.f3777f = objArr;
                    f3774m = (Object[]) objArr[0];
                    this.f3776e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f3775n--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f3772k;
                if (objArr2 != null) {
                    this.f3777f = objArr2;
                    f3772k = (Object[]) objArr2[0];
                    this.f3776e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f3773l--;
                    return;
                }
            }
        }
        this.f3776e = new int[i2];
        this.f3777f = new Object[i2];
    }

    private static void c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f3775n < 10) {
                    objArr[0] = f3774m;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f3774m = objArr;
                    f3775n++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                if (f3773l < 10) {
                    objArr[0] = f3772k;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f3772k = objArr;
                    f3773l++;
                }
            }
        }
    }

    private f<E, E> d() {
        if (this.f3779h == null) {
            this.f3779h = new a();
        }
        return this.f3779h;
    }

    private int e(Object obj, int i2) {
        int i3 = this.f3778g;
        if (i3 == 0) {
            return -1;
        }
        int a3 = c.a(this.f3776e, i3, i2);
        if (a3 < 0 || obj.equals(this.f3777f[a3])) {
            return a3;
        }
        int i4 = a3 + 1;
        while (i4 < i3 && this.f3776e[i4] == i2) {
            if (obj.equals(this.f3777f[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a3 - 1; i5 >= 0 && this.f3776e[i5] == i2; i5--) {
            if (obj.equals(this.f3777f[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    private int f() {
        int i2 = this.f3778g;
        if (i2 == 0) {
            return -1;
        }
        int a3 = c.a(this.f3776e, i2, 0);
        if (a3 < 0 || this.f3777f[a3] == null) {
            return a3;
        }
        int i3 = a3 + 1;
        while (i3 < i2 && this.f3776e[i3] == 0) {
            if (this.f3777f[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a3 - 1; i4 >= 0 && this.f3776e[i4] == 0; i4--) {
            if (this.f3777f[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e3) {
        int i2;
        int e4;
        if (e3 == null) {
            e4 = f();
            i2 = 0;
        } else {
            int hashCode = e3.hashCode();
            i2 = hashCode;
            e4 = e(e3, hashCode);
        }
        if (e4 >= 0) {
            return false;
        }
        int i3 = ~e4;
        int i4 = this.f3778g;
        int[] iArr = this.f3776e;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f3777f;
            a(i5);
            int[] iArr2 = this.f3776e;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f3777f, 0, objArr.length);
            }
            c(iArr, objArr, this.f3778g);
        }
        int i6 = this.f3778g;
        if (i3 < i6) {
            int[] iArr3 = this.f3776e;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f3777f;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f3778g - i3);
        }
        this.f3776e[i3] = i2;
        this.f3777f[i3] = e3;
        this.f3778g++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        b(this.f3778g + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= add(it.next());
        }
        return z2;
    }

    public void b(int i2) {
        int[] iArr = this.f3776e;
        if (iArr.length < i2) {
            Object[] objArr = this.f3777f;
            a(i2);
            int i3 = this.f3778g;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f3776e, 0, i3);
                System.arraycopy(objArr, 0, this.f3777f, 0, this.f3778g);
            }
            c(iArr, objArr, this.f3778g);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.f3778g;
        if (i2 != 0) {
            c(this.f3776e, this.f3777f, i2);
            this.f3776e = f3770i;
            this.f3777f = f3771j;
            this.f3778g = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f3778g; i2++) {
                try {
                    if (!set.contains(h(i2))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public E g(int i2) {
        Object[] objArr = this.f3777f;
        E e3 = (E) objArr[i2];
        int i3 = this.f3778g;
        if (i3 <= 1) {
            c(this.f3776e, objArr, i3);
            this.f3776e = f3770i;
            this.f3777f = f3771j;
            this.f3778g = 0;
        } else {
            int[] iArr = this.f3776e;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i4 = i3 - 1;
                this.f3778g = i4;
                if (i2 < i4) {
                    int i5 = i2 + 1;
                    System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                    Object[] objArr2 = this.f3777f;
                    System.arraycopy(objArr2, i5, objArr2, i2, this.f3778g - i2);
                }
                this.f3777f[this.f3778g] = null;
            } else {
                a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                this.f3778g--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f3776e, 0, i2);
                    System.arraycopy(objArr, 0, this.f3777f, 0, i2);
                }
                int i6 = this.f3778g;
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    System.arraycopy(iArr, i7, this.f3776e, i2, i6 - i2);
                    System.arraycopy(objArr, i7, this.f3777f, i2, this.f3778g - i2);
                }
            }
        }
        return e3;
    }

    public E h(int i2) {
        return (E) this.f3777f[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f3776e;
        int i2 = this.f3778g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? f() : e(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f3778g <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return d().m().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        g(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= remove(it.next());
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z2 = false;
        for (int i2 = this.f3778g - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f3777f[i2])) {
                g(i2);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f3778g;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i2 = this.f3778g;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f3777f, 0, objArr, 0, i2);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f3778g) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f3778g));
        }
        System.arraycopy(this.f3777f, 0, tArr, 0, this.f3778g);
        int length = tArr.length;
        int i2 = this.f3778g;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3778g * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f3778g; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E h2 = h(i2);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
