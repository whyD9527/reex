package kotlin.jvm.internal;

/* loaded from: classes.dex */
public class o {
    public u1.e a(i iVar) {
        return iVar;
    }

    public u1.c b(Class cls) {
        return new e(cls);
    }

    public u1.d c(Class cls, String str) {
        return new m(cls, str);
    }

    public String d(h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String e(l lVar) {
        return d(lVar);
    }
}
