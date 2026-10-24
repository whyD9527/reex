package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class a<T> implements Iterator<T> {

    /* renamed from: e, reason: collision with root package name */
    private final T[] f3633e;

    /* renamed from: f, reason: collision with root package name */
    private int f3634f;

    public a(T[] array) {
        k.e(array, "array");
        this.f3633e = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3634f < this.f3633e.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f3633e;
            int i2 = this.f3634f;
            this.f3634f = i2 + 1;
            return tArr[i2];
        } catch (ArrayIndexOutOfBoundsException e3) {
            this.f3634f--;
            throw new NoSuchElementException(e3.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
