package v1;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.k;

/* loaded from: classes.dex */
public final class a<T> implements b<T> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<b<T>> f4346a;

    public a(b<? extends T> sequence) {
        k.e(sequence, "sequence");
        this.f4346a = new AtomicReference<>(sequence);
    }

    @Override // v1.b
    public Iterator<T> iterator() {
        b<T> andSet = this.f4346a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
