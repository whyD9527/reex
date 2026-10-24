package v1;

import java.util.Iterator;
import kotlin.jvm.internal.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f extends e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f4347a;

        public a(Iterator it) {
            this.f4347a = it;
        }

        @Override // v1.b
        public Iterator<T> iterator() {
            return this.f4347a;
        }
    }

    public static <T> b<T> a(Iterator<? extends T> it) {
        k.e(it, "<this>");
        return b(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> b<T> b(b<? extends T> bVar) {
        k.e(bVar, "<this>");
        return bVar instanceof v1.a ? bVar : new v1.a(bVar);
    }
}
