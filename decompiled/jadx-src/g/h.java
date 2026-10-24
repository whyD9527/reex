package g;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.c1;
import androidx.core.view.d1;
import androidx.core.view.e1;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f2848c;

    /* renamed from: d, reason: collision with root package name */
    d1 f2849d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2850e;

    /* renamed from: b, reason: collision with root package name */
    private long f2847b = -1;

    /* renamed from: f, reason: collision with root package name */
    private final e1 f2851f = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<c1> f2846a = new ArrayList<>();

    class a extends e1 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f2852a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f2853b = 0;

        a() {
        }

        @Override // androidx.core.view.d1
        public void b(View view) {
            int i2 = this.f2853b + 1;
            this.f2853b = i2;
            if (i2 == h.this.f2846a.size()) {
                d1 d1Var = h.this.f2849d;
                if (d1Var != null) {
                    d1Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.e1, androidx.core.view.d1
        public void c(View view) {
            if (this.f2852a) {
                return;
            }
            this.f2852a = true;
            d1 d1Var = h.this.f2849d;
            if (d1Var != null) {
                d1Var.c(null);
            }
        }

        void d() {
            this.f2853b = 0;
            this.f2852a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f2850e) {
            Iterator<c1> it = this.f2846a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f2850e = false;
        }
    }

    void b() {
        this.f2850e = false;
    }

    public h c(c1 c1Var) {
        if (!this.f2850e) {
            this.f2846a.add(c1Var);
        }
        return this;
    }

    public h d(c1 c1Var, c1 c1Var2) {
        this.f2846a.add(c1Var);
        c1Var2.j(c1Var.d());
        this.f2846a.add(c1Var2);
        return this;
    }

    public h e(long j2) {
        if (!this.f2850e) {
            this.f2847b = j2;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f2850e) {
            this.f2848c = interpolator;
        }
        return this;
    }

    public h g(d1 d1Var) {
        if (!this.f2850e) {
            this.f2849d = d1Var;
        }
        return this;
    }

    public void h() {
        if (this.f2850e) {
            return;
        }
        Iterator<c1> it = this.f2846a.iterator();
        while (it.hasNext()) {
            c1 next = it.next();
            long j2 = this.f2847b;
            if (j2 >= 0) {
                next.f(j2);
            }
            Interpolator interpolator = this.f2848c;
            if (interpolator != null) {
                next.g(interpolator);
            }
            if (this.f2849d != null) {
                next.h(this.f2851f);
            }
            next.l();
        }
        this.f2850e = true;
    }
}
