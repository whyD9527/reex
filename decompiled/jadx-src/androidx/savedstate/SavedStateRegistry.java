package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import java.util.Map;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: b, reason: collision with root package name */
    private Bundle f2023b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2024c;

    /* renamed from: a, reason: collision with root package name */
    private j.b<String, b> f2022a = new j.b<>();

    /* renamed from: d, reason: collision with root package name */
    boolean f2025d = true;

    public interface a {
        void a(androidx.savedstate.b bVar);
    }

    public interface b {
        Bundle a();
    }

    SavedStateRegistry() {
    }

    public Bundle a(String str) {
        if (!this.f2024c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f2023b;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        this.f2023b.remove(str);
        if (this.f2023b.isEmpty()) {
            this.f2023b = null;
        }
        return bundle2;
    }

    void b(d dVar, Bundle bundle) {
        if (this.f2024c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            this.f2023b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        dVar.a(new e() { // from class: androidx.savedstate.SavedStateRegistry.1
            @Override // androidx.lifecycle.e
            public void d(g gVar, d.b bVar) {
                SavedStateRegistry savedStateRegistry;
                boolean z2;
                if (bVar == d.b.ON_START) {
                    savedStateRegistry = SavedStateRegistry.this;
                    z2 = true;
                } else {
                    if (bVar != d.b.ON_STOP) {
                        return;
                    }
                    savedStateRegistry = SavedStateRegistry.this;
                    z2 = false;
                }
                savedStateRegistry.f2025d = z2;
            }
        });
        this.f2024c = true;
    }

    void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f2023b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        j.b<String, b>.d c3 = this.f2022a.c();
        while (c3.hasNext()) {
            Map.Entry next = c3.next();
            bundle2.putBundle((String) next.getKey(), ((b) next.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
