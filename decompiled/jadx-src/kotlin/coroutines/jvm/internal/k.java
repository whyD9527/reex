package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public abstract class k extends d implements kotlin.jvm.internal.h<Object> {
    private final int arity;

    public k(int i2) {
        this(i2, null);
    }

    public k(int i2, j1.d<Object> dVar) {
        super(dVar);
        this.arity = i2;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String d3 = n.d(this);
        kotlin.jvm.internal.k.d(d3, "renderLambdaToString(this)");
        return d3;
    }
}
