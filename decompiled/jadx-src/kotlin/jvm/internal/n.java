package kotlin.jvm.internal;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private static final o f3646a;

    /* renamed from: b, reason: collision with root package name */
    private static final u1.c[] f3647b;

    static {
        o oVar = null;
        try {
            oVar = (o) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (oVar == null) {
            oVar = new o();
        }
        f3646a = oVar;
        f3647b = new u1.c[0];
    }

    public static u1.e a(i iVar) {
        return f3646a.a(iVar);
    }

    public static u1.c b(Class cls) {
        return f3646a.b(cls);
    }

    public static u1.d c(Class cls) {
        return f3646a.c(cls, "");
    }

    public static String d(h hVar) {
        return f3646a.d(hVar);
    }

    public static String e(l lVar) {
        return f3646a.e(lVar);
    }
}
