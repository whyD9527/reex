package l;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class e<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<K, V> f3789a;

    /* renamed from: b, reason: collision with root package name */
    private int f3790b;

    /* renamed from: c, reason: collision with root package name */
    private int f3791c;

    /* renamed from: d, reason: collision with root package name */
    private int f3792d;

    /* renamed from: e, reason: collision with root package name */
    private int f3793e;

    /* renamed from: f, reason: collision with root package name */
    private int f3794f;

    /* renamed from: g, reason: collision with root package name */
    private int f3795g;

    /* renamed from: h, reason: collision with root package name */
    private int f3796h;

    public e(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f3791c = i2;
        this.f3789a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int e(K k2, V v2) {
        int f2 = f(k2, v2);
        if (f2 >= 0) {
            return f2;
        }
        throw new IllegalStateException("Negative size: " + k2 + "=" + v2);
    }

    protected V a(K k2) {
        return null;
    }

    protected void b(boolean z2, K k2, V v2, V v3) {
    }

    public final V c(K k2) {
        V v2;
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v3 = this.f3789a.get(k2);
            if (v3 != null) {
                this.f3795g++;
                return v3;
            }
            this.f3796h++;
            V a3 = a(k2);
            if (a3 == null) {
                return null;
            }
            synchronized (this) {
                this.f3793e++;
                v2 = (V) this.f3789a.put(k2, a3);
                if (v2 != null) {
                    this.f3789a.put(k2, v2);
                } else {
                    this.f3790b += e(k2, a3);
                }
            }
            if (v2 != null) {
                b(false, k2, a3, v2);
                return v2;
            }
            g(this.f3791c);
            return a3;
        }
    }

    public final V d(K k2, V v2) {
        V put;
        if (k2 == null || v2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f3792d++;
            this.f3790b += e(k2, v2);
            put = this.f3789a.put(k2, v2);
            if (put != null) {
                this.f3790b -= e(k2, put);
            }
        }
        if (put != null) {
            b(false, k2, put, v2);
        }
        g(this.f3791c);
        return put;
    }

    protected int f(K k2, V v2) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(int i2) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                if (this.f3790b >= 0 && (!this.f3789a.isEmpty() || this.f3790b == 0)) {
                    if (this.f3790b <= i2 || this.f3789a.isEmpty()) {
                        break;
                    }
                    Map.Entry<K, V> next = this.f3789a.entrySet().iterator().next();
                    key = next.getKey();
                    value = next.getValue();
                    this.f3789a.remove(key);
                    this.f3790b -= e(key, value);
                    this.f3794f++;
                } else {
                    break;
                }
            }
            b(true, key, value, null);
        }
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        i2 = this.f3795g;
        i3 = this.f3796h + i2;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f3791c), Integer.valueOf(this.f3795g), Integer.valueOf(this.f3796h), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0));
    }
}
