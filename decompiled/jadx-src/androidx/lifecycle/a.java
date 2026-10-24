package androidx.lifecycle;

import androidx.lifecycle.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class a {

    /* renamed from: c, reason: collision with root package name */
    static a f1967c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, C0029a> f1968a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Boolean> f1969b = new HashMap();

    /* renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    static class C0029a {

        /* renamed from: a, reason: collision with root package name */
        final Map<d.b, List<b>> f1970a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map<b, d.b> f1971b;

        C0029a(Map<b, d.b> map) {
            this.f1971b = map;
            for (Map.Entry<b, d.b> entry : map.entrySet()) {
                d.b value = entry.getValue();
                List<b> list = this.f1970a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f1970a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void b(List<b> list, g gVar, d.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(gVar, bVar, obj);
                }
            }
        }

        void a(g gVar, d.b bVar, Object obj) {
            b(this.f1970a.get(bVar), gVar, bVar, obj);
            b(this.f1970a.get(d.b.ON_ANY), gVar, bVar, obj);
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f1972a;

        /* renamed from: b, reason: collision with root package name */
        final Method f1973b;

        b(int i2, Method method) {
            this.f1972a = i2;
            this.f1973b = method;
            method.setAccessible(true);
        }

        void a(g gVar, d.b bVar, Object obj) {
            try {
                int i2 = this.f1972a;
                if (i2 == 0) {
                    this.f1973b.invoke(obj, new Object[0]);
                } else if (i2 == 1) {
                    this.f1973b.invoke(obj, gVar);
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    this.f1973b.invoke(obj, gVar, bVar);
                }
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Failed to call observer method", e4.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1972a == bVar.f1972a && this.f1973b.getName().equals(bVar.f1973b.getName());
        }

        public int hashCode() {
            return (this.f1972a * 31) + this.f1973b.getName().hashCode();
        }
    }

    a() {
    }

    private C0029a a(Class<?> cls, Method[] methodArr) {
        int i2;
        C0029a c3;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c3 = c(superclass)) != null) {
            hashMap.putAll(c3.f1971b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, d.b> entry : c(cls2).f1971b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            n nVar = (n) method.getAnnotation(n.class);
            if (nVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(g.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                d.b value = nVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(d.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != d.b.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new b(i2, method), value, cls);
                z2 = true;
            }
        }
        C0029a c0029a = new C0029a(hashMap);
        this.f1968a.put(cls, c0029a);
        this.f1969b.put(cls, Boolean.valueOf(z2));
        return c0029a;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e3) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
        }
    }

    private void e(Map<b, d.b> map, b bVar, d.b bVar2, Class<?> cls) {
        d.b bVar3 = map.get(bVar);
        if (bVar3 == null || bVar2 == bVar3) {
            if (bVar3 == null) {
                map.put(bVar, bVar2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f1973b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
    }

    C0029a c(Class<?> cls) {
        C0029a c0029a = this.f1968a.get(cls);
        return c0029a != null ? c0029a : a(cls, null);
    }

    boolean d(Class<?> cls) {
        Boolean bool = this.f1969b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b3 = b(cls);
        for (Method method : b3) {
            if (((n) method.getAnnotation(n.class)) != null) {
                a(cls, b3);
                return true;
            }
        }
        this.f1969b.put(cls, Boolean.FALSE);
        return false;
    }
}
