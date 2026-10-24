package io.flutter.plugin.editing;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.android.a0;
import io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback;
import io.flutter.plugin.editing.e;
import io.flutter.plugin.platform.u;
import java.util.ArrayList;
import java.util.HashMap;
import y0.r;

/* loaded from: classes.dex */
public class m implements e.b {

    /* renamed from: a, reason: collision with root package name */
    private final View f3289a;

    /* renamed from: b, reason: collision with root package name */
    private final InputMethodManager f3290b;

    /* renamed from: c, reason: collision with root package name */
    private final AutofillManager f3291c;

    /* renamed from: d, reason: collision with root package name */
    private final r f3292d;

    /* renamed from: e, reason: collision with root package name */
    private d f3293e = new d(d.a.NO_TARGET, 0);

    /* renamed from: f, reason: collision with root package name */
    private r.b f3294f;

    /* renamed from: g, reason: collision with root package name */
    private SparseArray<r.b> f3295g;

    /* renamed from: h, reason: collision with root package name */
    private io.flutter.plugin.editing.e f3296h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f3297i;

    /* renamed from: j, reason: collision with root package name */
    private InputConnection f3298j;

    /* renamed from: k, reason: collision with root package name */
    private u f3299k;

    /* renamed from: l, reason: collision with root package name */
    private Rect f3300l;

    /* renamed from: m, reason: collision with root package name */
    private ImeSyncDeferringInsetsCallback f3301m;

    /* renamed from: n, reason: collision with root package name */
    private r.e f3302n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f3303o;

    class a implements ImeSyncDeferringInsetsCallback.b {
        a() {
        }

        @Override // io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.b
        public void a(boolean z2) {
            if (z2) {
                return;
            }
            m.this.z();
        }
    }

    class b implements r.f {
        b() {
        }

        @Override // y0.r.f
        public void a() {
            m mVar = m.this;
            mVar.G(mVar.f3289a);
        }

        @Override // y0.r.f
        public void b() {
            m.this.m();
        }

        @Override // y0.r.f
        public void c(r.e eVar) {
            m mVar = m.this;
            mVar.F(mVar.f3289a, eVar);
        }

        @Override // y0.r.f
        public void d(int i2, r.b bVar) {
            m.this.E(i2, bVar);
        }

        @Override // y0.r.f
        public void e(String str, Bundle bundle) {
            m.this.C(str, bundle);
        }

        @Override // y0.r.f
        public void f(int i2, boolean z2) {
            m.this.D(i2, z2);
        }

        @Override // y0.r.f
        public void g(double d3, double d4, double[] dArr) {
            m.this.B(d3, d4, dArr);
        }

        @Override // y0.r.f
        public void h() {
            m.this.x();
        }

        @Override // y0.r.f
        public void i(boolean z2) {
            if (Build.VERSION.SDK_INT < 26 || m.this.f3291c == null) {
                return;
            }
            if (z2) {
                m.this.f3291c.commit();
            } else {
                m.this.f3291c.cancel();
            }
        }

        @Override // y0.r.f
        public void j() {
            if (m.this.f3293e.f3310a == d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                m.this.y();
            } else {
                m mVar = m.this;
                mVar.s(mVar.f3289a);
            }
        }
    }

    class c implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f3306a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ double[] f3307b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ double[] f3308c;

        c(boolean z2, double[] dArr, double[] dArr2) {
            this.f3306a = z2;
            this.f3307b = dArr;
            this.f3308c = dArr2;
        }

        @Override // io.flutter.plugin.editing.m.e
        public void a(double d3, double d4) {
            double d5 = 1.0d;
            if (!this.f3306a) {
                double[] dArr = this.f3307b;
                d5 = 1.0d / (((dArr[3] * d3) + (dArr[7] * d4)) + dArr[15]);
            }
            double[] dArr2 = this.f3307b;
            double d6 = ((dArr2[0] * d3) + (dArr2[4] * d4) + dArr2[12]) * d5;
            double d7 = ((dArr2[1] * d3) + (dArr2[5] * d4) + dArr2[13]) * d5;
            double[] dArr3 = this.f3308c;
            if (d6 < dArr3[0]) {
                dArr3[0] = d6;
            } else if (d6 > dArr3[1]) {
                dArr3[1] = d6;
            }
            if (d7 < dArr3[2]) {
                dArr3[2] = d7;
            } else if (d7 > dArr3[3]) {
                dArr3[3] = d7;
            }
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        a f3310a;

        /* renamed from: b, reason: collision with root package name */
        int f3311b;

        enum a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public d(a aVar, int i2) {
            this.f3310a = aVar;
            this.f3311b = i2;
        }
    }

    private interface e {
        void a(double d3, double d4);
    }

    @SuppressLint({"NewApi"})
    public m(View view, r rVar, u uVar) {
        this.f3289a = view;
        this.f3296h = new io.flutter.plugin.editing.e(null, view);
        this.f3290b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i2 = Build.VERSION.SDK_INT;
        this.f3291c = i2 >= 26 ? (AutofillManager) view.getContext().getSystemService(AutofillManager.class) : null;
        if (i2 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f3301m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            this.f3301m.setImeVisibleListener(new a());
        }
        this.f3292d = rVar;
        rVar.o(new b());
        rVar.l();
        this.f3299k = uVar;
        uVar.D(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(double d3, double d4, double[] dArr) {
        double[] dArr2 = new double[4];
        boolean z2 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d5 = dArr[12];
        double d6 = dArr[15];
        double d7 = d5 / d6;
        dArr2[1] = d7;
        dArr2[0] = d7;
        double d8 = dArr[13] / d6;
        dArr2[3] = d8;
        dArr2[2] = d8;
        c cVar = new c(z2, dArr, dArr2);
        cVar.a(d3, 0.0d);
        cVar.a(d3, d4);
        cVar.a(0.0d, d4);
        Float valueOf = Float.valueOf(this.f3289a.getContext().getResources().getDisplayMetrics().density);
        this.f3300l = new Rect((int) (dArr2[0] * valueOf.floatValue()), (int) (dArr2[2] * valueOf.floatValue()), (int) Math.ceil(dArr2[1] * valueOf.floatValue()), (int) Math.ceil(dArr2[3] * valueOf.floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(int i2, boolean z2) {
        if (!z2) {
            this.f3293e = new d(d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW, i2);
            this.f3298j = null;
        } else {
            this.f3289a.requestFocus();
            this.f3293e = new d(d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW, i2);
            this.f3290b.restartInput(this.f3289a);
            this.f3297i = false;
        }
    }

    private void I(r.b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (bVar == null || bVar.f4689j == null) {
            this.f3295g = null;
            return;
        }
        r.b[] bVarArr = bVar.f4691l;
        SparseArray<r.b> sparseArray = new SparseArray<>();
        this.f3295g = sparseArray;
        if (bVarArr == null) {
            sparseArray.put(bVar.f4689j.f4692a.hashCode(), bVar);
            return;
        }
        for (r.b bVar2 : bVarArr) {
            r.b.a aVar = bVar2.f4689j;
            if (aVar != null) {
                this.f3295g.put(aVar.f4692a.hashCode(), bVar2);
                this.f3291c.notifyValueChanged(this.f3289a, aVar.f4692a.hashCode(), AutofillValue.forText(aVar.f4694c.f4705a));
            }
        }
    }

    private boolean k() {
        r.c cVar;
        r.b bVar = this.f3294f;
        return bVar == null || (cVar = bVar.f4686g) == null || cVar.f4696a != r.g.NONE;
    }

    private static boolean n(r.e eVar, r.e eVar2) {
        int i2 = eVar.f4709e - eVar.f4708d;
        if (i2 != eVar2.f4709e - eVar2.f4708d) {
            return true;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (eVar.f4705a.charAt(eVar.f4708d + i3) != eVar2.f4705a.charAt(eVar2.f4708d + i3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(View view) {
        y();
        this.f3290b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    private static int t(r.c cVar, boolean z2, boolean z3, boolean z4, boolean z5, r.d dVar) {
        r.g gVar = cVar.f4696a;
        if (gVar == r.g.DATETIME) {
            return 4;
        }
        if (gVar == r.g.NUMBER) {
            int i2 = cVar.f4697b ? 4098 : 2;
            return cVar.f4698c ? i2 | 8192 : i2;
        }
        if (gVar == r.g.PHONE) {
            return 3;
        }
        if (gVar == r.g.NONE) {
            return 0;
        }
        int i3 = 1;
        if (gVar == r.g.MULTILINE) {
            i3 = 131073;
        } else if (gVar == r.g.EMAIL_ADDRESS) {
            i3 = 33;
        } else if (gVar == r.g.URL) {
            i3 = 17;
        } else if (gVar == r.g.VISIBLE_PASSWORD) {
            i3 = 145;
        } else if (gVar == r.g.NAME) {
            i3 = 97;
        } else if (gVar == r.g.POSTAL_ADDRESS) {
            i3 = 113;
        }
        if (z2) {
            i3 = i3 | 524288 | 128;
        } else {
            if (z3) {
                i3 |= 32768;
            }
            if (!z4) {
                i3 = i3 | 524288 | 144;
            }
        }
        return dVar == r.d.CHARACTERS ? i3 | 4096 : dVar == r.d.WORDS ? i3 | 8192 : dVar == r.d.SENTENCES ? i3 | 16384 : i3;
    }

    private boolean v() {
        return this.f3295g != null;
    }

    private void w(String str) {
        if (Build.VERSION.SDK_INT < 26 || this.f3291c == null || !v()) {
            return;
        }
        this.f3291c.notifyValueChanged(this.f3289a, this.f3294f.f4689j.f4692a.hashCode(), AutofillValue.forText(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (Build.VERSION.SDK_INT < 26 || this.f3291c == null || !v()) {
            return;
        }
        String str = this.f3294f.f4689j.f4692a;
        int[] iArr = new int[2];
        this.f3289a.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.f3300l);
        rect.offset(iArr[0], iArr[1]);
        this.f3291c.notifyViewEntered(this.f3289a, str.hashCode(), rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        r.b bVar;
        if (Build.VERSION.SDK_INT < 26 || this.f3291c == null || (bVar = this.f3294f) == null || bVar.f4689j == null || !v()) {
            return;
        }
        this.f3291c.notifyViewExited(this.f3289a, this.f3294f.f4689j.f4692a.hashCode());
    }

    public void A(ViewStructure viewStructure, int i2) {
        AutofillId autofillId;
        Rect rect;
        if (Build.VERSION.SDK_INT < 26 || !v()) {
            return;
        }
        String str = this.f3294f.f4689j.f4692a;
        autofillId = viewStructure.getAutofillId();
        for (int i3 = 0; i3 < this.f3295g.size(); i3++) {
            int keyAt = this.f3295g.keyAt(i3);
            r.b.a aVar = this.f3295g.valueAt(i3).f4689j;
            if (aVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i3);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = aVar.f4693b;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = aVar.f4695d;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = this.f3300l) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    newChild.setAutofillValue(AutofillValue.forText(aVar.f4694c.f4705a));
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.f3300l.height());
                    newChild.setAutofillValue(AutofillValue.forText(this.f3296h));
                }
            }
        }
    }

    public void C(String str, Bundle bundle) {
        this.f3290b.sendAppPrivateCommand(this.f3289a, str, bundle);
    }

    void E(int i2, r.b bVar) {
        y();
        this.f3294f = bVar;
        this.f3293e = k() ? new d(d.a.FRAMEWORK_CLIENT, i2) : new d(d.a.NO_TARGET, i2);
        this.f3296h.l(this);
        r.b.a aVar = bVar.f4689j;
        this.f3296h = new io.flutter.plugin.editing.e(aVar != null ? aVar.f4694c : null, this.f3289a);
        I(bVar);
        this.f3297i = true;
        H();
        this.f3300l = null;
        this.f3296h.a(this);
    }

    void F(View view, r.e eVar) {
        r.e eVar2;
        if (!this.f3297i && (eVar2 = this.f3302n) != null && eVar2.b()) {
            boolean n2 = n(this.f3302n, eVar);
            this.f3297i = n2;
            if (n2) {
                n0.b.e("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.f3302n = eVar;
        this.f3296h.n(eVar);
        if (this.f3297i) {
            this.f3290b.restartInput(view);
            this.f3297i = false;
        }
    }

    void G(View view) {
        if (!k()) {
            s(view);
        } else {
            view.requestFocus();
            this.f3290b.showSoftInput(view, 0);
        }
    }

    public void H() {
        if (this.f3293e.f3310a == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f3303o = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r7 == r1.f4709e) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    @Override // io.flutter.plugin.editing.e.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(boolean z2, boolean z3, boolean z4) {
        boolean z5;
        if (z2) {
            w(this.f3296h.toString());
        }
        int i2 = this.f3296h.i();
        int h2 = this.f3296h.h();
        int g2 = this.f3296h.g();
        int f2 = this.f3296h.f();
        ArrayList<g> e3 = this.f3296h.e();
        if (this.f3302n != null) {
            if (this.f3296h.toString().equals(this.f3302n.f4705a)) {
                r.e eVar = this.f3302n;
                if (i2 == eVar.f4706b) {
                    if (h2 == eVar.f4707c) {
                        if (g2 == eVar.f4708d) {
                        }
                    }
                }
            }
            z5 = false;
            if (!z5) {
                this.f3296h.c();
                return;
            }
            n0.b.f("TextInputPlugin", "send EditingState to flutter: " + this.f3296h.toString());
            if (this.f3294f.f4684e) {
                this.f3292d.r(this.f3293e.f3311b, e3);
                this.f3296h.c();
            } else {
                this.f3292d.q(this.f3293e.f3311b, this.f3296h.toString(), i2, h2, g2, f2);
            }
            this.f3302n = new r.e(this.f3296h.toString(), i2, h2, g2, f2);
            return;
        }
        z5 = true;
        if (!z5) {
        }
    }

    public void j(SparseArray<AutofillValue> sparseArray) {
        r.b bVar;
        r.b.a aVar;
        r.b.a aVar2;
        if (Build.VERSION.SDK_INT < 26 || (bVar = this.f3294f) == null || this.f3295g == null || (aVar = bVar.f4689j) == null) {
            return;
        }
        HashMap<String, r.e> hashMap = new HashMap<>();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            r.b bVar2 = this.f3295g.get(sparseArray.keyAt(i2));
            if (bVar2 != null && (aVar2 = bVar2.f4689j) != null) {
                String charSequence = sparseArray.valueAt(i2).getTextValue().toString();
                r.e eVar = new r.e(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (aVar2.f4692a.equals(aVar.f4692a)) {
                    this.f3296h.n(eVar);
                } else {
                    hashMap.put(aVar2.f4692a, eVar);
                }
            }
        }
        this.f3292d.s(this.f3293e.f3311b, hashMap);
    }

    public void l(int i2) {
        d dVar = this.f3293e;
        d.a aVar = dVar.f3310a;
        if ((aVar == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW || aVar == d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) && dVar.f3311b == i2) {
            this.f3293e = new d(d.a.NO_TARGET, 0);
            y();
            this.f3290b.hideSoftInputFromWindow(this.f3289a.getApplicationWindowToken(), 0);
            this.f3290b.restartInput(this.f3289a);
            this.f3297i = false;
        }
    }

    void m() {
        if (this.f3293e.f3310a == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.f3296h.l(this);
        y();
        this.f3294f = null;
        I(null);
        this.f3293e = new d(d.a.NO_TARGET, 0);
        H();
        this.f3300l = null;
    }

    public InputConnection o(View view, a0 a0Var, EditorInfo editorInfo) {
        d dVar = this.f3293e;
        d.a aVar = dVar.f3310a;
        if (aVar == d.a.NO_TARGET) {
            this.f3298j = null;
            return null;
        }
        if (aVar == d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (aVar == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.f3303o) {
                return this.f3298j;
            }
            InputConnection onCreateInputConnection = this.f3299k.c(dVar.f3311b).onCreateInputConnection(editorInfo);
            this.f3298j = onCreateInputConnection;
            return onCreateInputConnection;
        }
        r.b bVar = this.f3294f;
        int t2 = t(bVar.f4686g, bVar.f4680a, bVar.f4681b, bVar.f4682c, bVar.f4683d, bVar.f4685f);
        editorInfo.inputType = t2;
        editorInfo.imeOptions = 33554432;
        if (Build.VERSION.SDK_INT >= 26 && !this.f3294f.f4683d) {
            editorInfo.imeOptions = 33554432 | 16777216;
        }
        Integer num = this.f3294f.f4687h;
        int intValue = num == null ? (t2 & 131072) != 0 ? 1 : 6 : num.intValue();
        r.b bVar2 = this.f3294f;
        String str = bVar2.f4688i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        String[] strArr = bVar2.f4690k;
        if (strArr != null) {
            x.a.a(editorInfo, strArr);
        }
        io.flutter.plugin.editing.d dVar2 = new io.flutter.plugin.editing.d(view, this.f3293e.f3311b, this.f3292d, a0Var, this.f3296h, editorInfo);
        editorInfo.initialSelStart = this.f3296h.i();
        editorInfo.initialSelEnd = this.f3296h.h();
        this.f3298j = dVar2;
        return dVar2;
    }

    @SuppressLint({"NewApi"})
    public void p() {
        this.f3299k.Q();
        this.f3292d.o(null);
        y();
        this.f3296h.l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f3301m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public InputMethodManager q() {
        return this.f3290b;
    }

    public boolean r(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!q().isAcceptingText() || (inputConnection = this.f3298j) == null) {
            return false;
        }
        return inputConnection instanceof io.flutter.plugin.editing.d ? ((io.flutter.plugin.editing.d) inputConnection).f(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public void u() {
        if (this.f3293e.f3310a == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f3303o = true;
        }
    }

    public void z() {
        this.f3292d.i(this.f3293e.f3311b);
    }
}
