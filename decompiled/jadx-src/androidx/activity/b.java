package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f162a;

    /* renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<a> f163b = new CopyOnWriteArrayList<>();

    public b(boolean z2) {
        this.f162a = z2;
    }

    void a(a aVar) {
        this.f163b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f162a;
    }

    public final void d() {
        Iterator<a> it = this.f163b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    void e(a aVar) {
        this.f163b.remove(aVar);
    }

    public final void f(boolean z2) {
        this.f162a = z2;
    }
}
