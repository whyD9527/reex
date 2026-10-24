package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected final l.a<String, Method> f2127a;

    /* renamed from: b, reason: collision with root package name */
    protected final l.a<String, Method> f2128b;

    /* renamed from: c, reason: collision with root package name */
    protected final l.a<String, Class> f2129c;

    public a(l.a<String, Method> aVar, l.a<String, Method> aVar2, l.a<String, Class> aVar3) {
        this.f2127a = aVar;
        this.f2128b = aVar2;
        this.f2129c = aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void N(f0.b bVar) {
        try {
            I(c(bVar.getClass()).getName());
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException(bVar.getClass().getSimpleName() + " does not have a Parcelizer", e3);
        }
    }

    private Class c(Class<? extends f0.b> cls) {
        Class cls2 = this.f2129c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f2129c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) {
        Method method = this.f2127a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.f2127a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Method e(Class cls) {
        Method method = this.f2128b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c3 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c3.getDeclaredMethod("write", cls, a.class);
        this.f2128b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    protected abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i2) {
        w(i2);
        A(bArr);
    }

    protected abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i2) {
        w(i2);
        C(charSequence);
    }

    protected abstract void E(int i2);

    public void F(int i2, int i3) {
        w(i3);
        E(i2);
    }

    protected abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i2) {
        w(i2);
        G(parcelable);
    }

    protected abstract void I(String str);

    public void J(String str, int i2) {
        w(i2);
        I(str);
    }

    protected <T extends f0.b> void K(T t2, a aVar) {
        try {
            e(t2.getClass()).invoke(null, t2, aVar);
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e5);
        } catch (InvocationTargetException e6) {
            if (!(e6.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e6);
            }
            throw ((RuntimeException) e6.getCause());
        }
    }

    protected void L(f0.b bVar) {
        if (bVar == null) {
            I(null);
            return;
        }
        N(bVar);
        a b3 = b();
        K(bVar, b3);
        b3.a();
    }

    public void M(f0.b bVar, int i2) {
        w(i2);
        L(bVar);
    }

    protected abstract void a();

    protected abstract a b();

    public boolean f() {
        return false;
    }

    protected abstract boolean g();

    public boolean h(boolean z2, int i2) {
        return !m(i2) ? z2 : g();
    }

    protected abstract byte[] i();

    public byte[] j(byte[] bArr, int i2) {
        return !m(i2) ? bArr : i();
    }

    protected abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i2) {
        return !m(i2) ? charSequence : k();
    }

    protected abstract boolean m(int i2);

    protected <T extends f0.b> T n(String str, a aVar) {
        try {
            return (T) d(str).invoke(null, aVar);
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e5);
        } catch (InvocationTargetException e6) {
            if (e6.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e6.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e6);
        }
    }

    protected abstract int o();

    public int p(int i2, int i3) {
        return !m(i3) ? i2 : o();
    }

    protected abstract <T extends Parcelable> T q();

    public <T extends Parcelable> T r(T t2, int i2) {
        return !m(i2) ? t2 : (T) q();
    }

    protected abstract String s();

    public String t(String str, int i2) {
        return !m(i2) ? str : s();
    }

    protected <T extends f0.b> T u() {
        String s2 = s();
        if (s2 == null) {
            return null;
        }
        return (T) n(s2, b());
    }

    public <T extends f0.b> T v(T t2, int i2) {
        return !m(i2) ? t2 : (T) u();
    }

    protected abstract void w(int i2);

    public void x(boolean z2, boolean z3) {
    }

    protected abstract void y(boolean z2);

    public void z(boolean z2, int i2) {
        w(i2);
        y(z2);
    }
}
