package androidx.window.layout;

import android.app.Activity;
import g1.l;
import g1.q;
import java.util.concurrent.Executor;
import kotlin.coroutines.jvm.internal.k;
import q1.p;

@kotlin.coroutines.jvm.internal.f(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {54, 55}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends k implements p<a2.c<? super WindowLayoutInfo>, j1.d<? super q>, Object> {
    final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WindowInfoTrackerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowInfoTrackerImpl$windowLayoutInfo$1(WindowInfoTrackerImpl windowInfoTrackerImpl, Activity activity, j1.d<? super WindowInfoTrackerImpl$windowLayoutInfo$1> dVar) {
        super(2, dVar);
        this.this$0 = windowInfoTrackerImpl;
        this.$activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0, reason: not valid java name */
    public static final void m7invokeSuspend$lambda0(z1.f fVar, WindowLayoutInfo info) {
        kotlin.jvm.internal.k.d(info, "info");
        fVar.a(info);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final j1.d<q> create(Object obj, j1.d<?> dVar) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.this$0, this.$activity, dVar);
        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    @Override // q1.p
    public final Object invoke(a2.c<? super WindowLayoutInfo> cVar, j1.d<? super q> dVar) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$1) create(cVar, dVar)).invokeSuspend(q.f2865a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #0 {all -> 0x00a1, blocks: (B:11:0x0064, B:16:0x0076, B:18:0x007e), top: B:10:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0093 -> B:10:0x0064). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c3;
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1;
        WindowBackend windowBackend;
        a2.c cVar;
        androidx.core.util.a<WindowLayoutInfo> aVar;
        WindowBackend windowBackend2;
        z1.g it;
        WindowBackend windowBackend3;
        Object a3;
        c3 = k1.d.c();
        int i2 = this.label;
        try {
            try {
                if (i2 == 0) {
                    l.b(obj);
                    cVar = (a2.c) this.L$0;
                    final z1.f b3 = z1.h.b(10, z1.e.DROP_OLDEST, null, 4, null);
                    aVar = new androidx.core.util.a() { // from class: androidx.window.layout.f
                        @Override // androidx.core.util.a
                        public final void accept(Object obj2) {
                            WindowInfoTrackerImpl$windowLayoutInfo$1.m7invokeSuspend$lambda0(z1.f.this, (WindowLayoutInfo) obj2);
                        }
                    };
                    windowBackend2 = this.this$0.windowBackend;
                    windowBackend2.registerLayoutChangeCallback(this.$activity, new Executor() { // from class: androidx.window.layout.g
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            runnable.run();
                        }
                    }, aVar);
                    it = b3.iterator();
                } else if (i2 == 1) {
                    it = (z1.g) this.L$2;
                    aVar = (androidx.core.util.a) this.L$1;
                    a2.c cVar2 = (a2.c) this.L$0;
                    l.b(obj);
                    a2.c cVar3 = cVar2;
                    windowInfoTrackerImpl$windowLayoutInfo$1 = this;
                    if (!((Boolean) obj).booleanValue()) {
                        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) it.next();
                        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = cVar3;
                        windowInfoTrackerImpl$windowLayoutInfo$1.L$1 = aVar;
                        windowInfoTrackerImpl$windowLayoutInfo$1.L$2 = it;
                        windowInfoTrackerImpl$windowLayoutInfo$1.label = 2;
                        if (cVar3.emit(windowLayoutInfo, windowInfoTrackerImpl$windowLayoutInfo$1) == c3) {
                            return c3;
                        }
                        cVar = cVar3;
                        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = cVar;
                        windowInfoTrackerImpl$windowLayoutInfo$1.L$1 = aVar;
                        windowInfoTrackerImpl$windowLayoutInfo$1.L$2 = it;
                        windowInfoTrackerImpl$windowLayoutInfo$1.label = 1;
                        a3 = it.a(windowInfoTrackerImpl$windowLayoutInfo$1);
                        if (a3 != c3) {
                            return c3;
                        }
                        cVar3 = cVar;
                        obj = a3;
                        if (!((Boolean) obj).booleanValue()) {
                            windowBackend3 = windowInfoTrackerImpl$windowLayoutInfo$1.this$0.windowBackend;
                            windowBackend3.unregisterLayoutChangeCallback(aVar);
                            return q.f2865a;
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (z1.g) this.L$2;
                    aVar = (androidx.core.util.a) this.L$1;
                    a2.c cVar4 = (a2.c) this.L$0;
                    l.b(obj);
                    cVar = cVar4;
                }
                windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = cVar;
                windowInfoTrackerImpl$windowLayoutInfo$1.L$1 = aVar;
                windowInfoTrackerImpl$windowLayoutInfo$1.L$2 = it;
                windowInfoTrackerImpl$windowLayoutInfo$1.label = 1;
                a3 = it.a(windowInfoTrackerImpl$windowLayoutInfo$1);
                if (a3 != c3) {
                }
            } catch (Throwable th) {
                th = th;
                windowBackend = windowInfoTrackerImpl$windowLayoutInfo$1.this$0.windowBackend;
                windowBackend.unregisterLayoutChangeCallback(aVar);
                throw th;
            }
            windowInfoTrackerImpl$windowLayoutInfo$1 = this;
        } catch (Throwable th2) {
            th = th2;
            windowInfoTrackerImpl$windowLayoutInfo$1 = this;
        }
    }
}
