package kotlinx.coroutines;

import j1.g;

/* loaded from: classes.dex */
public interface CoroutineExceptionHandler extends g.b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3648c = a.f3649e;

    public static final class a implements g.c<CoroutineExceptionHandler> {

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ a f3649e = new a();

        private a() {
        }
    }

    void handleException(g gVar, Throwable th);
}
