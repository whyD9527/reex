package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import k.a;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    private final int f943e;

    /* renamed from: f, reason: collision with root package name */
    private final int f944f;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f943e = getResources().getDimensionPixelOffset(a.f3612b);
        this.f944f = getResources().getDimensionPixelOffset(a.f3611a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f943e * 2), this.f944f), 1073741824), i3);
    }
}
