package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
final class Recreator implements e {

    /* renamed from: a, reason: collision with root package name */
    private final b f2021a;

    Recreator(b bVar) {
        this.f2021a = bVar;
    }

    private void e(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.a.class);
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.a) declaredConstructor.newInstance(new Object[0])).a(this.f2021a);
                } catch (Exception e3) {
                    throw new RuntimeException("Failed to instantiate " + str, e3);
                }
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException("Class" + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("Class " + str + " wasn't found", e5);
        }
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.b bVar) {
        if (bVar != d.b.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        gVar.a().c(this);
        Bundle a3 = this.f2021a.k().a("androidx.savedstate.Restarter");
        if (a3 == null) {
            return;
        }
        ArrayList<String> stringArrayList = a3.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            e(it.next());
        }
    }
}
