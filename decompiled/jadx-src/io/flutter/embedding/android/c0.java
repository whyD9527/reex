package io.flutter.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: c, reason: collision with root package name */
    private static c0 f2990c;

    /* renamed from: a, reason: collision with root package name */
    private final LongSparseArray<MotionEvent> f2991a = new LongSparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Long> f2992b = new PriorityQueue<>();

    public static class a {

        /* renamed from: b, reason: collision with root package name */
        private static final AtomicLong f2993b = new AtomicLong(0);

        /* renamed from: a, reason: collision with root package name */
        private final long f2994a;

        private a(long j2) {
            this.f2994a = j2;
        }

        public static a b() {
            return c(f2993b.incrementAndGet());
        }

        public static a c(long j2) {
            return new a(j2);
        }

        public long d() {
            return this.f2994a;
        }
    }

    private c0() {
    }

    public static c0 a() {
        if (f2990c == null) {
            f2990c = new c0();
        }
        return f2990c;
    }

    public MotionEvent b(a aVar) {
        while (!this.f2992b.isEmpty() && this.f2992b.peek().longValue() < aVar.f2994a) {
            this.f2991a.remove(this.f2992b.poll().longValue());
        }
        if (!this.f2992b.isEmpty() && this.f2992b.peek().longValue() == aVar.f2994a) {
            this.f2992b.poll();
        }
        MotionEvent motionEvent = this.f2991a.get(aVar.f2994a);
        this.f2991a.remove(aVar.f2994a);
        return motionEvent;
    }

    public a c(MotionEvent motionEvent) {
        a b3 = a.b();
        this.f2991a.put(b3.f2994a, MotionEvent.obtain(motionEvent));
        this.f2992b.add(Long.valueOf(b3.f2994a));
        return b3;
    }
}
