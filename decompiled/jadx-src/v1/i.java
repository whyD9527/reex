package v1;

import java.util.Iterator;
import kotlin.jvm.internal.k;
import q1.l;

/* loaded from: classes.dex */
public final class i<T, R> implements b<R> {

    /* renamed from: a, reason: collision with root package name */
    private final b<T> f4348a;

    /* renamed from: b, reason: collision with root package name */
    private final l<T, R> f4349b;

    public static final class a implements Iterator<R> {

        /* renamed from: e, reason: collision with root package name */
        private final Iterator<T> f4350e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ i<T, R> f4351f;

        a(i<T, R> iVar) {
            this.f4351f = iVar;
            this.f4350e = ((i) iVar).f4348a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4350e.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((i) this.f4351f).f4349b.invoke(this.f4350e.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(b<? extends T> sequence, l<? super T, ? extends R> transformer) {
        k.e(sequence, "sequence");
        k.e(transformer, "transformer");
        this.f4348a = sequence;
        this.f4349b = transformer;
    }

    @Override // v1.b
    public Iterator<R> iterator() {
        return new a(this);
    }
}
