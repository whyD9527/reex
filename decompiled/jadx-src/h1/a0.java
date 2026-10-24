package h1;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a0 extends z {
    public static final <K, V> Map<K, V> d() {
        u uVar = u.f2909e;
        kotlin.jvm.internal.k.c(uVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return uVar;
    }

    public static <K, V> HashMap<K, V> e(g1.j<? extends K, ? extends V>... pairs) {
        int a3;
        kotlin.jvm.internal.k.e(pairs, "pairs");
        a3 = z.a(pairs.length);
        HashMap<K, V> hashMap = new HashMap<>(a3);
        j(hashMap, pairs);
        return hashMap;
    }

    public static <K, V> Map<K, V> f(g1.j<? extends K, ? extends V>... pairs) {
        int a3;
        kotlin.jvm.internal.k.e(pairs, "pairs");
        if (pairs.length <= 0) {
            return d();
        }
        a3 = z.a(pairs.length);
        return m(pairs, new LinkedHashMap(a3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> g(Map<K, ? extends V> map) {
        kotlin.jvm.internal.k.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : z.c(map) : d();
    }

    public static <K, V> Map<K, V> h(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        kotlin.jvm.internal.k.e(map, "<this>");
        kotlin.jvm.internal.k.e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final <K, V> void i(Map<? super K, ? super V> map, Iterable<? extends g1.j<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.k.e(map, "<this>");
        kotlin.jvm.internal.k.e(pairs, "pairs");
        for (g1.j<? extends K, ? extends V> jVar : pairs) {
            map.put(jVar.a(), jVar.b());
        }
    }

    public static final <K, V> void j(Map<? super K, ? super V> map, g1.j<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.k.e(map, "<this>");
        kotlin.jvm.internal.k.e(pairs, "pairs");
        for (g1.j<? extends K, ? extends V> jVar : pairs) {
            map.put(jVar.a(), jVar.b());
        }
    }

    public static <K, V> Map<K, V> k(Iterable<? extends g1.j<? extends K, ? extends V>> iterable) {
        Map<K, V> b3;
        int a3;
        kotlin.jvm.internal.k.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return g(l(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return d();
        }
        if (size != 1) {
            a3 = z.a(collection.size());
            return l(iterable, new LinkedHashMap(a3));
        }
        b3 = z.b(iterable instanceof List ? (g1.j<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
        return b3;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M l(Iterable<? extends g1.j<? extends K, ? extends V>> iterable, M destination) {
        kotlin.jvm.internal.k.e(iterable, "<this>");
        kotlin.jvm.internal.k.e(destination, "destination");
        i(destination, iterable);
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M m(g1.j<? extends K, ? extends V>[] jVarArr, M destination) {
        kotlin.jvm.internal.k.e(jVarArr, "<this>");
        kotlin.jvm.internal.k.e(destination, "destination");
        j(destination, jVarArr);
        return destination;
    }
}
