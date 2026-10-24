package androidx.window.java.layout;

import a2.b;
import android.app.Activity;
import androidx.core.util.a;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import g1.q;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.k;
import x1.d1;
import x1.h;
import x1.i0;
import x1.j0;
import x1.k1;

/* loaded from: classes.dex */
public final class WindowInfoTrackerCallbackAdapter implements WindowInfoTracker {
    private final Map<a<?>, k1> consumerToJobMap;
    private final ReentrantLock lock;
    private final WindowInfoTracker tracker;

    public WindowInfoTrackerCallbackAdapter(WindowInfoTracker tracker) {
        k.e(tracker, "tracker");
        this.tracker = tracker;
        this.lock = new ReentrantLock();
        this.consumerToJobMap = new LinkedHashMap();
    }

    private final <T> void addListener(Executor executor, a<T> aVar, b<? extends T> bVar) {
        k1 b3;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(aVar) == null) {
                i0 a3 = j0.a(d1.a(executor));
                Map<a<?>, k1> map = this.consumerToJobMap;
                b3 = h.b(a3, null, null, new WindowInfoTrackerCallbackAdapter$addListener$1$1(bVar, aVar, null), 3, null);
                map.put(aVar, b3);
            }
            q qVar = q.f2865a;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void removeListener(a<?> aVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            k1 k1Var = this.consumerToJobMap.get(aVar);
            if (k1Var != null) {
                k1.a.a(k1Var, null, 1, null);
            }
            this.consumerToJobMap.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addWindowLayoutInfoListener(Activity activity, Executor executor, a<WindowLayoutInfo> consumer) {
        k.e(activity, "activity");
        k.e(executor, "executor");
        k.e(consumer, "consumer");
        addListener(executor, consumer, this.tracker.windowLayoutInfo(activity));
    }

    public final void removeWindowLayoutInfoListener(a<WindowLayoutInfo> consumer) {
        k.e(consumer, "consumer");
        removeListener(consumer);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public b<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        k.e(activity, "activity");
        return this.tracker.windowLayoutInfo(activity);
    }
}
