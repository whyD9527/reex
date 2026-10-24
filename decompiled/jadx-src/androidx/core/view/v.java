package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;

/* loaded from: classes.dex */
public final class v {

    static class a {
        static int a(MenuItem menuItem) {
            int alphabeticModifiers;
            alphabeticModifiers = menuItem.getAlphabeticModifiers();
            return alphabeticModifiers;
        }

        static CharSequence b(MenuItem menuItem) {
            CharSequence contentDescription;
            contentDescription = menuItem.getContentDescription();
            return contentDescription;
        }

        static ColorStateList c(MenuItem menuItem) {
            ColorStateList iconTintList;
            iconTintList = menuItem.getIconTintList();
            return iconTintList;
        }

        static PorterDuff.Mode d(MenuItem menuItem) {
            PorterDuff.Mode iconTintMode;
            iconTintMode = menuItem.getIconTintMode();
            return iconTintMode;
        }

        static int e(MenuItem menuItem) {
            int numericModifiers;
            numericModifiers = menuItem.getNumericModifiers();
            return numericModifiers;
        }

        static CharSequence f(MenuItem menuItem) {
            CharSequence tooltipText;
            tooltipText = menuItem.getTooltipText();
            return tooltipText;
        }

        static MenuItem g(MenuItem menuItem, char c3, int i2) {
            MenuItem alphabeticShortcut;
            alphabeticShortcut = menuItem.setAlphabeticShortcut(c3, i2);
            return alphabeticShortcut;
        }

        static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
            MenuItem contentDescription;
            contentDescription = menuItem.setContentDescription(charSequence);
            return contentDescription;
        }

        static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
            MenuItem iconTintList;
            iconTintList = menuItem.setIconTintList(colorStateList);
            return iconTintList;
        }

        static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
            MenuItem iconTintMode;
            iconTintMode = menuItem.setIconTintMode(mode);
            return iconTintMode;
        }

        static MenuItem k(MenuItem menuItem, char c3, int i2) {
            MenuItem numericShortcut;
            numericShortcut = menuItem.setNumericShortcut(c3, i2);
            return numericShortcut;
        }

        static MenuItem l(MenuItem menuItem, char c3, char c4, int i2, int i3) {
            MenuItem shortcut;
            shortcut = menuItem.setShortcut(c3, c4, i2, i3);
            return shortcut;
        }

        static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
            MenuItem tooltipText;
            tooltipText = menuItem.setTooltipText(charSequence);
            return tooltipText;
        }
    }

    public static MenuItem a(MenuItem menuItem, b bVar) {
        if (menuItem instanceof s.b) {
            return ((s.b) menuItem).a(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void b(MenuItem menuItem, char c3, int i2) {
        if (menuItem instanceof s.b) {
            ((s.b) menuItem).setAlphabeticShortcut(c3, i2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.g(menuItem, c3, i2);
        }
    }

    public static void c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof s.b) {
            ((s.b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.h(menuItem, charSequence);
        }
    }

    public static void d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof s.b) {
            ((s.b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.i(menuItem, colorStateList);
        }
    }

    public static void e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof s.b) {
            ((s.b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.j(menuItem, mode);
        }
    }

    public static void f(MenuItem menuItem, char c3, int i2) {
        if (menuItem instanceof s.b) {
            ((s.b) menuItem).setNumericShortcut(c3, i2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.k(menuItem, c3, i2);
        }
    }

    public static void g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof s.b) {
            ((s.b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m(menuItem, charSequence);
        }
    }
}
