package x1;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class l1 extends CancellationException {

    /* renamed from: e, reason: collision with root package name */
    public final k1 f4422e;

    public l1(String str, Throwable th, k1 k1Var) {
        super(str);
        this.f4422e = k1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof l1) {
                l1 l1Var = (l1) obj;
                if (!kotlin.jvm.internal.k.a(l1Var.getMessage(), getMessage()) || !kotlin.jvm.internal.k.a(l1Var.f4422e, this.f4422e) || !kotlin.jvm.internal.k.a(l1Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.k.b(message);
        int hashCode = ((message.hashCode() * 31) + this.f4422e.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f4422e;
    }
}
