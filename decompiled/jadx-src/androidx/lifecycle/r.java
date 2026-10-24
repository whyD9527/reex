package androidx.lifecycle;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final a f1999a;

    /* renamed from: b, reason: collision with root package name */
    private final s f2000b;

    public interface a {
        <T extends q> T a(Class<T> cls);
    }

    static abstract class b implements a {
        b() {
        }

        @Override // androidx.lifecycle.r.a
        public <T extends q> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends q> T b(String str, Class<T> cls);
    }

    public r(s sVar, a aVar) {
        this.f1999a = aVar;
        this.f2000b = sVar;
    }

    public <T extends q> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public <T extends q> T b(String str, Class<T> cls) {
        T t2 = (T) this.f2000b.b(str);
        if (cls.isInstance(t2)) {
            return t2;
        }
        a aVar = this.f1999a;
        T t3 = aVar instanceof b ? (T) ((b) aVar).b(str, cls) : (T) aVar.a(cls);
        this.f2000b.c(str, t3);
        return t3;
    }
}
