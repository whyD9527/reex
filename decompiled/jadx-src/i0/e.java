package i0;

import kotlin.jvm.internal.k;

/* loaded from: classes.dex */
public final class e extends Error {

    /* renamed from: e, reason: collision with root package name */
    private final a f2959e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2960f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a errorCause, String errorMessage) {
        super(errorMessage + " (" + errorCause.b() + ')');
        k.e(errorCause, "errorCause");
        k.e(errorMessage, "errorMessage");
        this.f2959e = errorCause;
        this.f2960f = errorMessage;
    }

    public final a a() {
        return this.f2959e;
    }

    public final String b() {
        return this.f2960f;
    }
}
