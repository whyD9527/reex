package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import x1.u1;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f3696a;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f3697b;

    /* renamed from: c, reason: collision with root package name */
    public static final u1 f3698c;

    static {
        p pVar = new p();
        f3696a = pVar;
        f3697b = y.e("kotlinx.coroutines.fast.service.loader", true);
        f3698c = pVar.a();
    }

    private p() {
    }

    private final u1 a() {
        v1.b a3;
        List<MainDispatcherFactory> e3;
        Object next;
        try {
            if (f3697b) {
                e3 = h.f3677a.c();
            } else {
                a3 = v1.f.a(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator());
                e3 = v1.h.e(a3);
            }
            Iterator<T> it = e3.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            return mainDispatcherFactory == null ? q.b(null, null, 3, null) : q.d(mainDispatcherFactory, e3);
        } catch (Throwable th) {
            return q.b(th, null, 2, null);
        }
    }
}
