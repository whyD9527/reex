package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f1997a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f1998b = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    final void a() {
        this.f1998b = true;
        Map<String, Object> map = this.f1997a;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.f1997a.values().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }
        c();
    }

    protected void c() {
    }
}
