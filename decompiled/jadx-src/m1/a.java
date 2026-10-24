package m1;

import kotlin.jvm.internal.k;

/* loaded from: classes.dex */
public class a extends l1.a {

    /* renamed from: m1.a$a, reason: collision with other inner class name */
    private static final class C0056a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0056a f3839a = new C0056a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f3840b;

        /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null) {
                    if (num.intValue() > 0) {
                        num2 = num;
                    }
                }
                f3840b = num2;
            }
            num = null;
            if (num != null) {
            }
            f3840b = num2;
        }

        private C0056a() {
        }
    }

    private final boolean c(int i2) {
        Integer num = C0056a.f3840b;
        return num == null || num.intValue() >= i2;
    }

    @Override // l1.a
    public void a(Throwable cause, Throwable exception) {
        k.e(cause, "cause");
        k.e(exception, "exception");
        if (c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
