package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a implements j {

    /* renamed from: e, reason: collision with root package name */
    protected Context f267e;

    /* renamed from: f, reason: collision with root package name */
    protected Context f268f;

    /* renamed from: g, reason: collision with root package name */
    protected e f269g;

    /* renamed from: h, reason: collision with root package name */
    protected LayoutInflater f270h;

    /* renamed from: i, reason: collision with root package name */
    protected LayoutInflater f271i;

    /* renamed from: j, reason: collision with root package name */
    private j.a f272j;

    /* renamed from: k, reason: collision with root package name */
    private int f273k;

    /* renamed from: l, reason: collision with root package name */
    private int f274l;

    /* renamed from: m, reason: collision with root package name */
    protected k f275m;

    /* renamed from: n, reason: collision with root package name */
    private int f276n;

    public a(Context context, int i2, int i3) {
        this.f267e = context;
        this.f270h = LayoutInflater.from(context);
        this.f273k = i2;
        this.f274l = i3;
    }

    protected void a(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f275m).addView(view, i2);
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z2) {
        j.a aVar = this.f272j;
        if (aVar != null) {
            aVar.b(eVar, z2);
        }
    }

    public abstract void c(g gVar, k.a aVar);

    @Override // androidx.appcompat.view.menu.j
    public void d(Context context, e eVar) {
        this.f268f = context;
        this.f271i = LayoutInflater.from(context);
        this.f269g = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        j.a aVar = this.f272j;
        m mVar2 = mVar;
        if (aVar == null) {
            return false;
        }
        if (mVar == null) {
            mVar2 = this.f269g;
        }
        return aVar.c(mVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z2) {
        ViewGroup viewGroup = (ViewGroup) this.f275m;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f269g;
        int i2 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList<g> E = this.f269g.E();
            int size = E.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                g gVar = E.get(i4);
                if (q(i3, gVar)) {
                    View childAt = viewGroup.getChildAt(i3);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View n2 = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        n2.setPressed(false);
                        n2.jumpDrawablesToCurrentState();
                    }
                    if (n2 != childAt) {
                        a(n2, i3);
                    }
                    i3++;
                }
            }
            i2 = i3;
        }
        while (i2 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i2)) {
                i2++;
            }
        }
    }

    public k.a g(ViewGroup viewGroup) {
        return (k.a) this.f270h.inflate(this.f274l, viewGroup, false);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean i(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(j.a aVar) {
        this.f272j = aVar;
    }

    protected boolean l(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    public j.a m() {
        return this.f272j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a g2 = view instanceof k.a ? (k.a) view : g(viewGroup);
        c(gVar, g2);
        return (View) g2;
    }

    public k o(ViewGroup viewGroup) {
        if (this.f275m == null) {
            k kVar = (k) this.f270h.inflate(this.f273k, viewGroup, false);
            this.f275m = kVar;
            kVar.b(this.f269g);
            f(true);
        }
        return this.f275m;
    }

    public void p(int i2) {
        this.f276n = i2;
    }

    public abstract boolean q(int i2, g gVar);
}
