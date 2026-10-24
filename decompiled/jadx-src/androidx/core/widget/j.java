package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class j {

    static class a {
        static void a(PopupWindow popupWindow, View view, int i2, int i3, int i4) {
            popupWindow.showAsDropDown(view, i2, i3, i4);
        }
    }

    static class b {
        static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        static void c(PopupWindow popupWindow, boolean z2) {
            popupWindow.setOverlapAnchor(z2);
        }

        static void d(PopupWindow popupWindow, int i2) {
            popupWindow.setWindowLayoutType(i2);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z2) {
        b.c(popupWindow, z2);
    }

    public static void b(PopupWindow popupWindow, int i2) {
        b.d(popupWindow, i2);
    }

    public static void c(PopupWindow popupWindow, View view, int i2, int i3, int i4) {
        a.a(popupWindow, view, i2, i3, i4);
    }
}
