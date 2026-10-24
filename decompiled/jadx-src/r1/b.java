package r1;

import java.util.Random;
import kotlin.jvm.internal.k;

/* loaded from: classes.dex */
public final class b extends r1.a {

    /* renamed from: g, reason: collision with root package name */
    private final a f4294g = new a();

    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // r1.a
    public Random c() {
        Random random = this.f4294g.get();
        k.d(random, "implStorage.get()");
        return random;
    }
}
