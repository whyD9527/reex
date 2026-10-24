package kotlin.jvm.internal;

import h1.a0;
import h1.z;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import q1.q;
import q1.r;
import q1.s;
import q1.t;
import q1.u;
import q1.v;
import q1.w;

/* loaded from: classes.dex */
public final class e implements u1.c<Object>, d {

    /* renamed from: f, reason: collision with root package name */
    public static final a f3636f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Map<Class<? extends g1.c<?>>, Integer> f3637g;

    /* renamed from: h, reason: collision with root package name */
    private static final HashMap<String, String> f3638h;

    /* renamed from: i, reason: collision with root package name */
    private static final HashMap<String, String> f3639i;

    /* renamed from: j, reason: collision with root package name */
    private static final HashMap<String, String> f3640j;

    /* renamed from: k, reason: collision with root package name */
    private static final Map<String, String> f3641k;

    /* renamed from: e, reason: collision with root package name */
    private final Class<?> f3642e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final String a(Class<?> jClass) {
            String str;
            String S;
            String T;
            String T2;
            k.e(jClass, "jClass");
            String str2 = null;
            if (!jClass.isAnonymousClass()) {
                if (jClass.isLocalClass()) {
                    String name = jClass.getSimpleName();
                    Method enclosingMethod = jClass.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        k.d(name, "name");
                        T2 = w1.o.T(name, enclosingMethod.getName() + '$', null, 2, null);
                        if (T2 != null) {
                            return T2;
                        }
                    }
                    Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
                    k.d(name, "name");
                    if (enclosingConstructor == null) {
                        S = w1.o.S(name, '$', null, 2, null);
                        return S;
                    }
                    T = w1.o.T(name, enclosingConstructor.getName() + '$', null, 2, null);
                    return T;
                }
                if (!jClass.isArray()) {
                    String str3 = (String) e.f3641k.get(jClass.getName());
                    return str3 == null ? jClass.getSimpleName() : str3;
                }
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) e.f3641k.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 == null) {
                    return "Array";
                }
            }
            return str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List e3;
        int i2;
        Map<Class<? extends g1.c<?>>, Integer> k2;
        int a3;
        String V;
        String V2;
        int i3 = 0;
        e3 = h1.j.e(q1.a.class, q1.l.class, q1.p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, q1.b.class, q1.c.class, q1.d.class, q1.e.class, q1.f.class, q1.g.class, q1.h.class, q1.i.class, q1.j.class, q1.k.class, q1.m.class, q1.n.class, q1.o.class);
        i2 = h1.k.i(e3, 10);
        ArrayList arrayList = new ArrayList(i2);
        for (Object obj : e3) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                h1.j.h();
            }
            arrayList.add(g1.n.a((Class) obj, Integer.valueOf(i3)));
            i3 = i4;
        }
        k2 = a0.k(arrayList);
        f3637g = k2;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f3638h = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f3639i = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        k.d(values, "primitiveFqNames.values");
        for (String kotlinName : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            k.d(kotlinName, "kotlinName");
            V2 = w1.o.V(kotlinName, '.', null, 2, null);
            sb.append(V2);
            sb.append("CompanionObject");
            g1.j a4 = g1.n.a(sb.toString(), kotlinName + ".Companion");
            hashMap3.put(a4.c(), a4.d());
        }
        for (Map.Entry<Class<? extends g1.c<?>>, Integer> entry : f3637g.entrySet()) {
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f3640j = hashMap3;
        a3 = z.a(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(a3);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            V = w1.o.V((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, V);
        }
        f3641k = linkedHashMap;
    }

    public e(Class<?> jClass) {
        k.e(jClass, "jClass");
        this.f3642e = jClass;
    }

    @Override // u1.c
    public String a() {
        return f3636f.a(b());
    }

    @Override // kotlin.jvm.internal.d
    public Class<?> b() {
        return this.f3642e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && k.a(p1.a.a(this), p1.a.a((u1.c) obj));
    }

    public int hashCode() {
        return p1.a.a(this).hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
