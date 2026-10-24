package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class c implements u1.b, Serializable {
    public static final Object NO_RECEIVER = a.f3635e;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient u1.b reflected;
    private final String signature;

    private static class a implements Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final a f3635e = new a();

        private a() {
        }
    }

    public c() {
        this(NO_RECEIVER);
    }

    protected c(Object obj) {
        this(obj, null, null, null, false);
    }

    protected c(Object obj, Class cls, String str, String str2, boolean z2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z2;
    }

    @Override // u1.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // u1.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public u1.b compute() {
        u1.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        u1.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    protected abstract u1.b computeReflected();

    @Override // u1.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public u1.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? n.c(cls) : n.b(cls);
    }

    @Override // u1.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    protected u1.b getReflected() {
        u1.b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new p1.b();
    }

    @Override // u1.b
    public u1.f getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // u1.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // u1.b
    public u1.g getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // u1.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // u1.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // u1.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // u1.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
