package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.internal.y;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final long f3757a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f3758b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f3759c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f3760d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f3761e;

    /* renamed from: f, reason: collision with root package name */
    public static h f3762f;

    static {
        long e3;
        int d3;
        int a3;
        int d4;
        int f2;
        int d5;
        long e4;
        e3 = a0.e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f3757a = e3;
        d3 = a0.d("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, null);
        f3758b = d3;
        a3 = t1.f.a(y.a(), 2);
        d4 = a0.d("kotlinx.coroutines.scheduler.core.pool.size", a3, 1, 0, 8, null);
        f3759c = d4;
        f2 = t1.f.f(y.a() * 128, d4, 2097150);
        d5 = a0.d("kotlinx.coroutines.scheduler.max.pool.size", f2, 0, 2097150, 4, null);
        f3760d = d5;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        e4 = a0.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f3761e = timeUnit.toNanos(e4);
        f3762f = f.f3751a;
    }
}
