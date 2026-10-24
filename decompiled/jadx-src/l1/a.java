package l1;

import h1.f;
import java.lang.reflect.Method;
import kotlin.jvm.internal.k;

/* loaded from: classes.dex */
public class a {

    /* renamed from: l1.a$a, reason: collision with other inner class name */
    private static final class C0054a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0054a f3830a = new C0054a();

        /* renamed from: b, reason: collision with root package name */
        public static final Method f3831b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f3832c;

        /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[LOOP:0: B:2:0x0015->B:10:0x003f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[EDGE_INSN: B:11:0x0043->B:12:0x0043 BREAK  A[LOOP:0: B:2:0x0015->B:10:0x003f], SYNTHETIC] */
        static {
            Method method;
            Method method2;
            boolean z2;
            Object l2;
            Method[] throwableMethods = Throwable.class.getMethods();
            k.d(throwableMethods, "throwableMethods");
            int length = throwableMethods.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                method = null;
                if (i3 >= length) {
                    method2 = null;
                    break;
                }
                method2 = throwableMethods[i3];
                if (k.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    k.d(parameterTypes, "it.parameterTypes");
                    l2 = f.l(parameterTypes);
                    if (k.a(l2, Throwable.class)) {
                        z2 = true;
                        if (!z2) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                z2 = false;
                if (!z2) {
                }
            }
            f3831b = method2;
            int length2 = throwableMethods.length;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                Method method3 = throwableMethods[i2];
                if (k.a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i2++;
            }
            f3832c = method;
        }

        private C0054a() {
        }
    }

    public void a(Throwable cause, Throwable exception) {
        k.e(cause, "cause");
        k.e(exception, "exception");
        Method method = C0054a.f3831b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public r1.c b() {
        return new r1.b();
    }
}
