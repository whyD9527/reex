package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class l1 {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            m1.f(view, charSequence);
        }
    }
}
