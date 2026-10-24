package androidx.lifecycle;

import androidx.lifecycle.d;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements e {

    /* renamed from: a, reason: collision with root package name */
    private final b f1943a;

    /* renamed from: b, reason: collision with root package name */
    private final e f1944b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1945a;

        static {
            int[] iArr = new int[d.b.values().length];
            f1945a = iArr;
            try {
                iArr[d.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1945a[d.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1945a[d.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1945a[d.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1945a[d.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1945a[d.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1945a[d.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    FullLifecycleObserverAdapter(b bVar, e eVar) {
        this.f1943a = bVar;
        this.f1944b = eVar;
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.b bVar) {
        switch (a.f1945a[bVar.ordinal()]) {
            case 1:
                this.f1943a.c(gVar);
                break;
            case 2:
                this.f1943a.g(gVar);
                break;
            case 3:
                this.f1943a.a(gVar);
                break;
            case 4:
                this.f1943a.f(gVar);
                break;
            case 5:
                this.f1943a.k(gVar);
                break;
            case 6:
                this.f1943a.b(gVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        e eVar = this.f1944b;
        if (eVar != null) {
            eVar.d(gVar, bVar);
        }
    }
}
