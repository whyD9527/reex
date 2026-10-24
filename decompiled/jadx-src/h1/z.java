package h1;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
class z extends y {
    public static int a(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> Map<K, V> b(g1.j<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.k.e(pair, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(pair.c(), pair.d());
        kotlin.jvm.internal.k.d(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final <K, V> Map<K, V> c(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.k.e(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.k.d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
