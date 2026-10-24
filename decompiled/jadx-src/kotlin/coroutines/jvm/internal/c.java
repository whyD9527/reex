package kotlin.coroutines.jvm.internal;

/* loaded from: classes.dex */
public final class c implements j1.d<Object> {

    /* renamed from: e, reason: collision with root package name */
    public static final c f3626e = new c();

    private c() {
    }

    @Override // j1.d
    public j1.g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // j1.d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
