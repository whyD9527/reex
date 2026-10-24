package h1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class r extends q {
    public static final <T, A extends Appendable> A k(Iterable<? extends T> iterable, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence truncated, q1.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.k.e(iterable, "<this>");
        kotlin.jvm.internal.k.e(buffer, "buffer");
        kotlin.jvm.internal.k.e(separator, "separator");
        kotlin.jvm.internal.k.e(prefix, "prefix");
        kotlin.jvm.internal.k.e(postfix, "postfix");
        kotlin.jvm.internal.k.e(truncated, "truncated");
        buffer.append(prefix);
        int i3 = 0;
        for (T t2 : iterable) {
            i3++;
            if (i3 > 1) {
                buffer.append(separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            w1.f.a(buffer, t2, lVar);
        }
        if (i2 >= 0 && i3 > i2) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> String m(Iterable<? extends T> iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence truncated, q1.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.k.e(iterable, "<this>");
        kotlin.jvm.internal.k.e(separator, "separator");
        kotlin.jvm.internal.k.e(prefix, "prefix");
        kotlin.jvm.internal.k.e(postfix, "postfix");
        kotlin.jvm.internal.k.e(truncated, "truncated");
        String sb = ((StringBuilder) k(iterable, new StringBuilder(), separator, prefix, postfix, i2, truncated, lVar)).toString();
        kotlin.jvm.internal.k.d(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String n(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, q1.l lVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            lVar = null;
        }
        return m(iterable, charSequence, charSequence5, charSequence6, i4, charSequence7, lVar);
    }

    public static <T extends Comparable<? super T>> T o(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.k.e(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T> T p(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.k.e(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) q((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final <T> T q(List<? extends T> list) {
        kotlin.jvm.internal.k.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static final <T, C extends Collection<? super T>> C r(Iterable<? extends T> iterable, C destination) {
        kotlin.jvm.internal.k.e(iterable, "<this>");
        kotlin.jvm.internal.k.e(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static <T> List<T> s(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.k.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return j.g(t(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return j.c();
        }
        if (size != 1) {
            return u(collection);
        }
        return i.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> List<T> t(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.k.e(iterable, "<this>");
        return iterable instanceof Collection ? u((Collection) iterable) : (List) r(iterable, new ArrayList());
    }

    public static final <T> List<T> u(Collection<? extends T> collection) {
        kotlin.jvm.internal.k.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> v(Iterable<? extends T> iterable) {
        Set<T> b3;
        int a3;
        kotlin.jvm.internal.k.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return f0.c((Set) r(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            b3 = f0.b();
            return b3;
        }
        if (size == 1) {
            return e0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        a3 = z.a(collection.size());
        return (Set) r(iterable, new LinkedHashSet(a3));
    }
}
