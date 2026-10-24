package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    private final e f1623a;

    private static class a extends e {

        /* renamed from: a, reason: collision with root package name */
        protected final Window f1624a;

        /* renamed from: b, reason: collision with root package name */
        private final View f1625b;

        a(Window window, View view) {
            this.f1624a = window;
            this.f1625b = view;
        }

        protected void c(int i2) {
            View decorView = this.f1624a.getDecorView();
            decorView.setSystemUiVisibility(i2 | decorView.getSystemUiVisibility());
        }

        protected void d(int i2) {
            this.f1624a.addFlags(i2);
        }

        protected void e(int i2) {
            View decorView = this.f1624a.getDecorView();
            decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
        }

        protected void f(int i2) {
            this.f1624a.clearFlags(i2);
        }
    }

    private static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.p1.e
        public void b(boolean z2) {
            if (!z2) {
                e(8192);
                return;
            }
            f(67108864);
            d(Integer.MIN_VALUE);
            c(8192);
        }
    }

    private static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.p1.e
        public void a(boolean z2) {
            if (!z2) {
                e(16);
                return;
            }
            f(134217728);
            d(Integer.MIN_VALUE);
            c(16);
        }
    }

    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final p1 f1626a;

        /* renamed from: b, reason: collision with root package name */
        final WindowInsetsController f1627b;

        /* renamed from: c, reason: collision with root package name */
        private final l.g<Object, WindowInsetsController.OnControllableInsetsChangedListener> f1628c;

        /* renamed from: d, reason: collision with root package name */
        protected Window f1629d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        d(Window window, p1 p1Var) {
            this(r0, p1Var);
            WindowInsetsController insetsController;
            insetsController = window.getInsetsController();
            this.f1629d = window;
        }

        d(WindowInsetsController windowInsetsController, p1 p1Var) {
            this.f1628c = new l.g<>();
            this.f1627b = windowInsetsController;
            this.f1626a = p1Var;
        }

        @Override // androidx.core.view.p1.e
        public void a(boolean z2) {
            if (z2) {
                if (this.f1629d != null) {
                    c(16);
                }
                this.f1627b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f1629d != null) {
                    d(16);
                }
                this.f1627b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.p1.e
        public void b(boolean z2) {
            if (z2) {
                if (this.f1629d != null) {
                    c(8192);
                }
                this.f1627b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f1629d != null) {
                    d(8192);
                }
                this.f1627b.setSystemBarsAppearance(0, 8);
            }
        }

        protected void c(int i2) {
            View decorView = this.f1629d.getDecorView();
            decorView.setSystemUiVisibility(i2 | decorView.getSystemUiVisibility());
        }

        protected void d(int i2) {
            View decorView = this.f1629d.getDecorView();
            decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
        }
    }

    private static class e {
        e() {
        }

        public void a(boolean z2) {
        }

        public void b(boolean z2) {
            throw null;
        }
    }

    public p1(Window window, View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f1623a = new d(window, this);
        } else {
            this.f1623a = i2 >= 26 ? new c(window, view) : new b(window, view);
        }
    }

    public void a(boolean z2) {
        this.f1623a.a(z2);
    }

    public void b(boolean z2) {
        this.f1623a.b(z2);
    }
}
