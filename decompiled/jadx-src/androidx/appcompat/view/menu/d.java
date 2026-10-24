package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    e f319e;

    /* renamed from: f, reason: collision with root package name */
    private int f320f = -1;

    /* renamed from: g, reason: collision with root package name */
    private boolean f321g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f322h;

    /* renamed from: i, reason: collision with root package name */
    private final LayoutInflater f323i;

    /* renamed from: j, reason: collision with root package name */
    private final int f324j;

    public d(e eVar, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.f322h = z2;
        this.f323i = layoutInflater;
        this.f319e = eVar;
        this.f324j = i2;
        a();
    }

    void a() {
        g v2 = this.f319e.v();
        if (v2 != null) {
            ArrayList<g> z2 = this.f319e.z();
            int size = z2.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (z2.get(i2) == v2) {
                    this.f320f = i2;
                    return;
                }
            }
        }
        this.f320f = -1;
    }

    public e b() {
        return this.f319e;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i2) {
        ArrayList<g> z2 = this.f322h ? this.f319e.z() : this.f319e.E();
        int i3 = this.f320f;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return z2.get(i2);
    }

    public void d(boolean z2) {
        this.f321g = z2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> z2 = this.f322h ? this.f319e.z() : this.f319e.E();
        int i2 = this.f320f;
        int size = z2.size();
        return i2 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f323i.inflate(this.f324j, viewGroup, false);
        }
        int groupId = getItem(i2).getGroupId();
        int i3 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f319e.F() && groupId != (i3 >= 0 ? getItem(i3).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f321g) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i2), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
