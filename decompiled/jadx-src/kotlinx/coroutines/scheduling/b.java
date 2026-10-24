package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.internal.y;
import x1.f0;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: l, reason: collision with root package name */
    public static final b f3738l;

    /* renamed from: m, reason: collision with root package name */
    private static final f0 f3739m;

    static {
        int a3;
        int d3;
        b bVar = new b();
        f3738l = bVar;
        a3 = t1.f.a(64, y.a());
        d3 = a0.d("kotlinx.coroutines.io.parallelism", a3, 0, 0, 12, null);
        f3739m = new e(bVar, d3, "Dispatchers.IO", 1);
    }

    private b() {
        super(0, 0, null, 7, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public final f0 r() {
        return f3739m;
    }

    @Override // x1.f0
    public String toString() {
        return "Dispatchers.Default";
    }
}
