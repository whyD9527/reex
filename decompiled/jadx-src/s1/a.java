package s1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.k;

/* loaded from: classes.dex */
public final class a extends r1.a {
    @Override // r1.a
    public Random c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        k.d(current, "current()");
        return current;
    }
}
