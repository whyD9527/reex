package kotlin.coroutines.jvm.internal;

import g1.k;
import g1.l;
import g1.q;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class a implements j1.d<Object>, e, Serializable {
    private final j1.d<Object> completion;

    public a(j1.d<Object> dVar) {
        this.completion = dVar;
    }

    public j1.d<q> create(j1.d<?> completion) {
        kotlin.jvm.internal.k.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public j1.d<q> create(Object obj, j1.d<?> completion) {
        kotlin.jvm.internal.k.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public e getCallerFrame() {
        j1.d<Object> dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final j1.d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j1.d
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        Object c3;
        j1.d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            j1.d dVar2 = aVar.completion;
            kotlin.jvm.internal.k.b(dVar2);
            try {
                invokeSuspend = aVar.invokeSuspend(obj);
                c3 = k1.d.c();
            } catch (Throwable th) {
                k.a aVar2 = g1.k.f2859e;
                obj = g1.k.a(l.a(th));
            }
            if (invokeSuspend == c3) {
                return;
            }
            obj = g1.k.a(invokeSuspend);
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }
}
