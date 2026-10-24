package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f481e = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i1 t2 = i1.t(context, attributeSet, f481e);
        setBackgroundDrawable(t2.f(0));
        t2.v();
    }
}
