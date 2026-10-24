package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import y0.r;

/* loaded from: classes.dex */
class e extends SpannableStringBuilder {

    /* renamed from: e, reason: collision with root package name */
    private int f3263e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f3264f = 0;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<b> f3265g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<b> f3266h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<g> f3267i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    private String f3268j;

    /* renamed from: k, reason: collision with root package name */
    private String f3269k;

    /* renamed from: l, reason: collision with root package name */
    private int f3270l;

    /* renamed from: m, reason: collision with root package name */
    private int f3271m;

    /* renamed from: n, reason: collision with root package name */
    private int f3272n;

    /* renamed from: o, reason: collision with root package name */
    private int f3273o;

    /* renamed from: p, reason: collision with root package name */
    private BaseInputConnection f3274p;

    class a extends BaseInputConnection {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Editable f3275a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, boolean z2, Editable editable) {
            super(view, z2);
            this.f3275a = editable;
        }

        @Override // android.view.inputmethod.BaseInputConnection
        public Editable getEditable() {
            return this.f3275a;
        }
    }

    interface b {
        void a(boolean z2, boolean z3, boolean z4);
    }

    public e(r.e eVar, View view) {
        this.f3274p = new a(view, true, this);
        if (eVar != null) {
            n(eVar);
        }
    }

    private void j(b bVar, boolean z2, boolean z3, boolean z4) {
        this.f3264f++;
        bVar.a(z2, z3, z4);
        this.f3264f--;
    }

    private void k(boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            Iterator<b> it = this.f3265g.iterator();
            while (it.hasNext()) {
                j(it.next(), z2, z3, z4);
            }
        }
    }

    public void a(b bVar) {
        ArrayList<b> arrayList;
        if (this.f3264f > 0) {
            n0.b.b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.f3263e > 0) {
            n0.b.g("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            arrayList = this.f3266h;
        } else {
            arrayList = this.f3265g;
        }
        arrayList.add(bVar);
    }

    public void b() {
        this.f3263e++;
        if (this.f3264f > 0) {
            n0.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f3263e != 1 || this.f3265g.isEmpty()) {
            return;
        }
        this.f3269k = toString();
        this.f3270l = i();
        this.f3271m = h();
        this.f3272n = g();
        this.f3273o = f();
    }

    public void c() {
        this.f3267i.clear();
    }

    public void d() {
        int i2 = this.f3263e;
        if (i2 == 0) {
            n0.b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i2 == 1) {
            Iterator<b> it = this.f3266h.iterator();
            while (it.hasNext()) {
                j(it.next(), true, true, true);
            }
            if (!this.f3265g.isEmpty()) {
                n0.b.f("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f3265g.size()) + " listener(s)");
                k(!toString().equals(this.f3269k), (this.f3270l == i() && this.f3271m == h()) ? false : true, (this.f3272n == g() && this.f3273o == f()) ? false : true);
            }
        }
        this.f3265g.addAll(this.f3266h);
        this.f3266h.clear();
        this.f3263e--;
    }

    public ArrayList<g> e() {
        ArrayList<g> arrayList = new ArrayList<>(this.f3267i);
        this.f3267i.clear();
        return arrayList;
    }

    public final int f() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int g() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int h() {
        return Selection.getSelectionEnd(this);
    }

    public final int i() {
        return Selection.getSelectionStart(this);
    }

    public void l(b bVar) {
        if (this.f3264f > 0) {
            n0.b.b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.f3265g.remove(bVar);
        if (this.f3263e > 0) {
            this.f3266h.remove(bVar);
        }
    }

    public void m(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f3274p.setComposingRegion(i2, i3);
        }
    }

    public void n(r.e eVar) {
        b();
        replace(0, length(), (CharSequence) eVar.f4705a);
        if (eVar.c()) {
            Selection.setSelection(this, eVar.f4706b, eVar.f4707c);
        } else {
            Selection.removeSelection(this);
        }
        m(eVar.f4708d, eVar.f4709e);
        c();
        d();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        boolean z2;
        boolean z3;
        if (this.f3264f > 0) {
            n0.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String eVar = toString();
        int i6 = i3 - i2;
        boolean z4 = i6 != i5 - i4;
        for (int i7 = 0; i7 < i6 && !z4; i7++) {
            z4 |= charAt(i2 + i7) != charSequence.charAt(i4 + i7);
        }
        if (z4) {
            this.f3268j = null;
        }
        int i8 = i();
        int h2 = h();
        int g2 = g();
        int f2 = f();
        SpannableStringBuilder replace = super.replace(i2, i3, charSequence, i4, i5);
        boolean z5 = z4;
        this.f3267i.add(new g(eVar, i2, i3, charSequence, i(), h(), g(), f()));
        if (this.f3263e > 0) {
            return replace;
        }
        boolean z6 = (i() == i8 && h() == h2) ? false : true;
        if (g() == g2 && f() == f2) {
            z2 = z5;
            z3 = false;
        } else {
            z2 = z5;
            z3 = true;
        }
        k(z2, z6, z3);
        return replace;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i2, int i3, int i4) {
        super.setSpan(obj, i2, i3, i4);
        this.f3267i.add(new g(toString(), i(), h(), g(), f()));
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.f3268j;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f3268j = spannableStringBuilder;
        return spannableStringBuilder;
    }
}
