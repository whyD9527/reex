package androidx.appcompat.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class p1 {

    /* renamed from: a, reason: collision with root package name */
    private static Method f839a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f839a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f839a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f839a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e3) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e3);
            }
        }
    }

    public static boolean b(View view) {
        return androidx.core.view.f0.n(view) == 1;
    }

    public static void c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException e3) {
            e = e3;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e4) {
            e = e4;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        }
    }
}
