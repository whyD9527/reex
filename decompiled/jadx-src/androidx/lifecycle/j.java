package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static Map<Class<?>, Integer> f1993a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static Map<Class<?>, List<Constructor<? extends c>>> f1994b = new HashMap();

    private static c a(Constructor<? extends c> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    private static Constructor<? extends c> b(Class<?> cls) {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c3 = c(canonicalName);
            if (!name.isEmpty()) {
                c3 = name + "." + c3;
            }
            Constructor declaredConstructor = Class.forName(c3).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static String c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    private static int d(Class<?> cls) {
        Integer num = f1993a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g2 = g(cls);
        f1993a.put(cls, Integer.valueOf(g2));
        return g2;
    }

    private static boolean e(Class<?> cls) {
        return cls != null && f.class.isAssignableFrom(cls);
    }

    static e f(Object obj) {
        boolean z2 = obj instanceof e;
        boolean z3 = obj instanceof b;
        if (z2 && z3) {
            return new FullLifecycleObserverAdapter((b) obj, (e) obj);
        }
        if (z3) {
            return new FullLifecycleObserverAdapter((b) obj, null);
        }
        if (z2) {
            return (e) obj;
        }
        Class<?> cls = obj.getClass();
        if (d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends c>> list = f1994b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(a(list.get(0), obj));
        }
        c[] cVarArr = new c[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            cVarArr[i2] = a(list.get(i2), obj);
        }
        return new CompositeGeneratedAdaptersObserver(cVarArr);
    }

    private static int g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends c> b3 = b(cls);
        if (b3 != null) {
            f1994b.put(cls, Collections.singletonList(b3));
            return 2;
        }
        if (a.f1967c.d(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        ArrayList arrayList = null;
        if (e(superclass)) {
            if (d(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList(f1994b.get(superclass));
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (e(cls2)) {
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(f1994b.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f1994b.put(cls, arrayList);
        return 2;
    }
}
