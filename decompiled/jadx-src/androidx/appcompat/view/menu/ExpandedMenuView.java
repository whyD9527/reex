package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.i1;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements e.b, k, AdapterView.OnItemClickListener {

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f247g = {R.attr.background, R.attr.divider};

    /* renamed from: e, reason: collision with root package name */
    private e f248e;

    /* renamed from: f, reason: collision with root package name */
    private int f249f;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        i1 u2 = i1.u(context, attributeSet, f247g, i2, 0);
        if (u2.r(0)) {
            setBackgroundDrawable(u2.f(0));
        }
        if (u2.r(1)) {
            setDivider(u2.f(1));
        }
        u2.v();
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean a(g gVar) {
        return this.f248e.L(gVar, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(e eVar) {
        this.f248e = eVar;
    }

    public int getWindowAnimations() {
        return this.f249f;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        a((g) getAdapter().getItem(i2));
    }
}
