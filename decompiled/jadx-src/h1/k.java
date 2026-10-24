package h1;

import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k extends j {
    public static <T> int i(Iterable<? extends T> iterable, int i2) {
        kotlin.jvm.internal.k.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }
}
