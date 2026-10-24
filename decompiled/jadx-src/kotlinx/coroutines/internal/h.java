package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f3677a = new h();

    private h() {
    }

    private final <S> S a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        List<S> s2;
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            s2 = h1.r.s(ServiceLoader.load(cls, classLoader));
            return s2;
        }
    }

    private final List<String> e(URL url) {
        boolean o2;
        BufferedReader bufferedReader;
        String T;
        String Y;
        String T2;
        String url2 = url.toString();
        o2 = w1.n.o(url2, "jar", false, 2, null);
        if (!o2) {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> f2 = f3677a.f(bufferedReader);
                o1.b.a(bufferedReader, null);
                return f2;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
        T = w1.o.T(url2, "jar:file:", null, 2, null);
        Y = w1.o.Y(T, '!', null, 2, null);
        T2 = w1.o.T(url2, "!/", null, 2, null);
        JarFile jarFile = new JarFile(Y, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(T2)), "UTF-8"));
            try {
                List<String> f3 = f3677a.f(bufferedReader);
                o1.b.a(bufferedReader, null);
                jarFile.close();
                return f3;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    jarFile.close();
                    throw th3;
                } catch (Throwable th4) {
                    g1.b.a(th2, th4);
                    throw th2;
                }
            }
        }
    }

    private final List<String> f(BufferedReader bufferedReader) {
        List<String> s2;
        String Z;
        CharSequence a02;
        boolean z2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                s2 = h1.r.s(linkedHashSet);
                return s2;
            }
            Z = w1.o.Z(readLine, "#", null, 2, null);
            if (Z == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            a02 = w1.o.a0(Z);
            String obj = a02.toString();
            int i2 = 0;
            while (true) {
                if (i2 >= obj.length()) {
                    z2 = true;
                    break;
                }
                char charAt = obj.charAt(i2);
                if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                    z2 = false;
                    break;
                }
                i2++;
            }
            if (!z2) {
                throw new IllegalArgumentException(kotlin.jvm.internal.k.j("Illegal service provider class name: ", obj).toString());
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }

    public final List<MainDispatcherFactory> c() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!i.a()) {
            return b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 == null) {
                return arrayList;
            }
            arrayList.add(mainDispatcherFactory2);
            return arrayList;
        } catch (Throwable unused3) {
            return b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    public final <S> List<S> d(Class<S> cls, ClassLoader classLoader) {
        Set v2;
        int i2;
        ArrayList list = Collections.list(classLoader.getResources(kotlin.jvm.internal.k.j("META-INF/services/", cls.getName())));
        kotlin.jvm.internal.k.d(list, "java.util.Collections.list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h1.o.j(arrayList, f3677a.e((URL) it.next()));
        }
        v2 = h1.r.v(arrayList);
        if (!(!v2.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        i2 = h1.k.i(v2, 10);
        ArrayList arrayList2 = new ArrayList(i2);
        Iterator it2 = v2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f3677a.a((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }
}
