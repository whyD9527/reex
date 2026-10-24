package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityRecord;

/* loaded from: classes.dex */
public class h {

    static class a {
        static int a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        static int b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        static void c(AccessibilityRecord accessibilityRecord, int i2) {
            accessibilityRecord.setMaxScrollX(i2);
        }

        static void d(AccessibilityRecord accessibilityRecord, int i2) {
            accessibilityRecord.setMaxScrollY(i2);
        }
    }

    public static void a(AccessibilityRecord accessibilityRecord, int i2) {
        a.c(accessibilityRecord, i2);
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i2) {
        a.d(accessibilityRecord, i2);
    }
}
