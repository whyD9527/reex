package h1;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class o extends n {
    public static <T> boolean j(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.k.e(collection, "<this>");
        kotlin.jvm.internal.k.e(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        boolean z2 = false;
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z2 = true;
            }
        }
        return z2;
    }
}
