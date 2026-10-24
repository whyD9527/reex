package f1;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.window.layout.WindowMetrics;

/* loaded from: classes.dex */
public final class i {

    public interface a {
        void a(float f2, float f3, float f4);
    }

    public interface b {
        boolean a(View view);
    }

    public static void c(Context context, a aVar) {
        Activity f2 = f(context);
        if (f2 != null) {
            WindowMetrics computeMaximumWindowMetrics = androidx.window.layout.h.a().computeMaximumWindowMetrics(f2);
            aVar.a(computeMaximumWindowMetrics.getBounds().width(), computeMaximumWindowMetrics.getBounds().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static boolean d(View view) {
        return j(view, new b() { // from class: f1.g
            @Override // f1.i.b
            public final boolean a(View view2) {
                boolean hasFocus;
                hasFocus = view2.hasFocus();
                return hasFocus;
            }
        });
    }

    public static int e(int i2) {
        return View.generateViewId();
    }

    public static Activity f(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return f(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean g(View view, final Class<? extends View>[] clsArr) {
        return j(view, new b() { // from class: f1.h
            @Override // f1.i.b
            public final boolean a(View view2) {
                boolean i2;
                i2 = i.i(clsArr, view2);
                return i2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean i(Class[] clsArr, View view) {
        for (Class cls : clsArr) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(View view, b bVar) {
        if (view == null) {
            return false;
        }
        if (bVar.a(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                if (j(viewGroup.getChildAt(i2), bVar)) {
                    return true;
                }
            }
        }
        return false;
    }
}
