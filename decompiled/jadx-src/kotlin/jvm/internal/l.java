package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class l<R> implements h<R>, Serializable {
    private final int arity;

    public l(int i2) {
        this.arity = i2;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String e3 = n.e(this);
        k.d(e3, "renderLambdaToString(this)");
        return e3;
    }
}
