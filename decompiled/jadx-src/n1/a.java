package n1;

import r1.c;

/* loaded from: classes.dex */
public class a extends m1.a {

    /* renamed from: n1.a$a, reason: collision with other inner class name */
    private static final class C0059a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0059a f3853a = new C0059a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f3854b;

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
                f3854b = num2;
            }
            num = null;
            if (num != null) {
            }
            f3854b = num2;
        }

        private C0059a() {
        }
    }

    private final boolean c(int i2) {
        Integer num = C0059a.f3854b;
        return num == null || num.intValue() >= i2;
    }

    @Override // l1.a
    public c b() {
        return c(34) ? new s1.a() : super.b();
    }
}
