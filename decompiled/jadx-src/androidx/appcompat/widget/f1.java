package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f1 extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f703c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static ArrayList<WeakReference<f1>> f704d;

    /* renamed from: a, reason: collision with root package name */
    private final Resources f705a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources.Theme f706b;

    private f1(Context context) {
        super(context);
        if (!o1.b()) {
            this.f705a = new h1(this, context.getResources());
            this.f706b = null;
            return;
        }
        o1 o1Var = new o1(this, context.getResources());
        this.f705a = o1Var;
        Resources.Theme newTheme = o1Var.newTheme();
        this.f706b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return ((context instanceof f1) || (context.getResources() instanceof h1) || (context.getResources() instanceof o1) || !o1.b()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f703c) {
            ArrayList<WeakReference<f1>> arrayList = f704d;
            if (arrayList == null) {
                f704d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<f1> weakReference = f704d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f704d.remove(size);
                    }
                }
                for (int size2 = f704d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<f1> weakReference2 = f704d.get(size2);
                    f1 f1Var = weakReference2 != null ? weakReference2.get() : null;
                    if (f1Var != null && f1Var.getBaseContext() == context) {
                        return f1Var;
                    }
                }
            }
            f1 f1Var2 = new f1(context);
            f704d.add(new WeakReference<>(f1Var2));
            return f1Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f705a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f705a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f706b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        Resources.Theme theme = this.f706b;
        if (theme == null) {
            super.setTheme(i2);
        } else {
            theme.applyStyle(i2, true);
        }
    }
}
