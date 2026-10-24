package kotlinx.coroutines.internal;

import java.util.List;
import x1.u1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f3699a = true;

    private static final r a(Throwable th, String str) {
        if (f3699a) {
            return new r(th, str);
        }
        if (th != null) {
            throw th;
        }
        c();
        throw new g1.d();
    }

    static /* synthetic */ r b(Throwable th, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            th = null;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final Void c() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final u1 d(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return a(th, mainDispatcherFactory.hintOnError());
        }
    }
}
