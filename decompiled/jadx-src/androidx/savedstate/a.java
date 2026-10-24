package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f2027a;

    /* renamed from: b, reason: collision with root package name */
    private final SavedStateRegistry f2028b = new SavedStateRegistry();

    private a(b bVar) {
        this.f2027a = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public SavedStateRegistry b() {
        return this.f2028b;
    }

    public void c(Bundle bundle) {
        d a3 = this.f2027a.a();
        if (a3.b() != d.c.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        a3.a(new Recreator(this.f2027a));
        this.f2028b.b(a3, bundle);
    }

    public void d(Bundle bundle) {
        this.f2028b.c(bundle);
    }
}
