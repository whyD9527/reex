package y0;

import java.util.Locale;
import z0.s;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private b f4528a;

    /* renamed from: b, reason: collision with root package name */
    private b f4529b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4530c;

    /* renamed from: d, reason: collision with root package name */
    private final z0.a<String> f4531d;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4532a;

        static {
            int[] iArr = new int[b.values().length];
            f4532a = iArr;
            try {
                iArr[b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4532a[b.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4532a[b.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4532a[b.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4532a[b.DETACHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private enum b {
        DETACHED,
        RESUMED,
        INACTIVE,
        HIDDEN,
        PAUSED
    }

    public f(o0.a aVar) {
        this((z0.a<String>) new z0.a(aVar, "flutter/lifecycle", s.f4772b));
    }

    public f(z0.a<String> aVar) {
        this.f4528a = null;
        this.f4529b = null;
        this.f4530c = true;
        this.f4531d = aVar;
    }

    private void g(b bVar, boolean z2) {
        b bVar2 = this.f4528a;
        if (bVar2 == bVar && z2 == this.f4530c) {
            return;
        }
        if (bVar == null && bVar2 == null) {
            this.f4530c = z2;
            return;
        }
        b bVar3 = null;
        int i2 = a.f4532a[bVar.ordinal()];
        if (i2 == 1) {
            bVar3 = z2 ? b.RESUMED : b.INACTIVE;
        } else if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
            bVar3 = bVar;
        }
        this.f4528a = bVar;
        this.f4530c = z2;
        if (bVar3 == this.f4529b) {
            return;
        }
        String str = "AppLifecycleState." + bVar3.name().toLowerCase(Locale.ROOT);
        n0.b.f("LifecycleChannel", "Sending " + str + " message.");
        this.f4531d.c(str);
        this.f4529b = bVar3;
    }

    public void a() {
        g(this.f4528a, true);
    }

    public void b() {
        g(b.DETACHED, this.f4530c);
    }

    public void c() {
        g(b.INACTIVE, this.f4530c);
    }

    public void d() {
        g(b.PAUSED, this.f4530c);
    }

    public void e() {
        g(b.RESUMED, this.f4530c);
    }

    public void f() {
        g(this.f4528a, false);
    }
}
