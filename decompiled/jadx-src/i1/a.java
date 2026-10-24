package i1;

import g1.q;
import kotlin.jvm.internal.k;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: i1.a$a, reason: collision with other inner class name */
    public static final class C0044a extends Thread {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ q1.a<q> f2962e;

        C0044a(q1.a<q> aVar) {
            this.f2962e = aVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f2962e.invoke();
        }
    }

    public static final Thread a(boolean z2, boolean z3, ClassLoader classLoader, String str, int i2, q1.a<q> block) {
        k.e(block, "block");
        C0044a c0044a = new C0044a(block);
        if (z3) {
            c0044a.setDaemon(true);
        }
        if (i2 > 0) {
            c0044a.setPriority(i2);
        }
        if (str != null) {
            c0044a.setName(str);
        }
        if (classLoader != null) {
            c0044a.setContextClassLoader(classLoader);
        }
        if (z2) {
            c0044a.start();
        }
        return c0044a;
    }

    public static /* synthetic */ Thread b(boolean z2, boolean z3, ClassLoader classLoader, String str, int i2, q1.a aVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        if ((i3 & 2) != 0) {
            z3 = false;
        }
        boolean z5 = z3;
        ClassLoader classLoader2 = (i3 & 4) != 0 ? null : classLoader;
        String str2 = (i3 & 8) != 0 ? null : str;
        if ((i3 & 16) != 0) {
            i2 = -1;
        }
        return a(z4, z5, classLoader2, str2, i2, aVar);
    }
}
