package androidx.lifecycle;

import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, q> f2001a = new HashMap<>();

    public final void a() {
        Iterator<q> it = this.f2001a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f2001a.clear();
    }

    final q b(String str) {
        return this.f2001a.get(str);
    }

    final void c(String str, q qVar) {
        q put = this.f2001a.put(str, qVar);
        if (put != null) {
            put.c();
        }
    }
}
