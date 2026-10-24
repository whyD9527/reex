package androidx.core.view.accessibility;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.constraintlayout.widget.k;
import androidx.core.view.accessibility.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    private static int f1516d;

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f1517a;

    /* renamed from: b, reason: collision with root package name */
    public int f1518b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f1519c = -1;

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;

        /* renamed from: e, reason: collision with root package name */
        public static final a f1520e = new a(1, null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f1521f = new a(2, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f1522g = new a(4, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f1523h = new a(8, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f1524i = new a(16, null);

        /* renamed from: j, reason: collision with root package name */
        public static final a f1525j = new a(32, null);

        /* renamed from: k, reason: collision with root package name */
        public static final a f1526k = new a(64, null);

        /* renamed from: l, reason: collision with root package name */
        public static final a f1527l = new a(128, null);

        /* renamed from: m, reason: collision with root package name */
        public static final a f1528m = new a(256, null, i.b.class);

        /* renamed from: n, reason: collision with root package name */
        public static final a f1529n = new a(512, null, i.b.class);

        /* renamed from: o, reason: collision with root package name */
        public static final a f1530o = new a(1024, null, i.c.class);

        /* renamed from: p, reason: collision with root package name */
        public static final a f1531p = new a(2048, null, i.c.class);

        /* renamed from: q, reason: collision with root package name */
        public static final a f1532q = new a(4096, null);

        /* renamed from: r, reason: collision with root package name */
        public static final a f1533r = new a(8192, null);

        /* renamed from: s, reason: collision with root package name */
        public static final a f1534s = new a(16384, null);

        /* renamed from: t, reason: collision with root package name */
        public static final a f1535t = new a(32768, null);

        /* renamed from: u, reason: collision with root package name */
        public static final a f1536u = new a(65536, null);

        /* renamed from: v, reason: collision with root package name */
        public static final a f1537v = new a(131072, null, i.g.class);

        /* renamed from: w, reason: collision with root package name */
        public static final a f1538w = new a(262144, null);

        /* renamed from: x, reason: collision with root package name */
        public static final a f1539x = new a(524288, null);

        /* renamed from: y, reason: collision with root package name */
        public static final a f1540y = new a(1048576, null);

        /* renamed from: z, reason: collision with root package name */
        public static final a f1541z = new a(2097152, null, i.h.class);

        /* renamed from: a, reason: collision with root package name */
        final Object f1542a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1543b;

        /* renamed from: c, reason: collision with root package name */
        private final Class<? extends i.a> f1544c;

        /* renamed from: d, reason: collision with root package name */
        protected final i f1545d;

        static {
            int i2 = Build.VERSION.SDK_INT;
            A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, i.e.class);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            G = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            H = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            I = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            J = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            L = new a(i2 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, i.f.class);
            M = new a(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, i.d.class);
            N = new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            O = new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            P = new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            Q = new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            R = new a(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            S = new a(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            T = new a(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            U = new a(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        private a(int i2, CharSequence charSequence, Class<? extends i.a> cls) {
            this(null, i2, charSequence, null, cls);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        a(Object obj, int i2, CharSequence charSequence, i iVar, Class<? extends i.a> cls) {
            this.f1543b = i2;
            this.f1545d = iVar;
            this.f1542a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence) : obj;
            this.f1544c = cls;
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f1542a).getId();
        }

        public CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f1542a).getLabel();
        }

        public boolean c(View view, Bundle bundle) {
            i.a newInstance;
            if (this.f1545d == null) {
                return false;
            }
            i.a aVar = null;
            Class<? extends i.a> cls = this.f1544c;
            if (cls != null) {
                try {
                    newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e3) {
                    e = e3;
                }
                try {
                    newInstance.a(bundle);
                    aVar = newInstance;
                } catch (Exception e4) {
                    e = e4;
                    aVar = newInstance;
                    Class<? extends i.a> cls2 = this.f1544c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                    return this.f1545d.a(view, aVar);
                }
            }
            return this.f1545d.a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f1542a;
            Object obj3 = ((a) obj).f1542a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f1542a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String g2 = f.g(this.f1543b);
            if (g2.equals("ACTION_UNKNOWN") && b() != null) {
                g2 = b().toString();
            }
            sb.append(g2);
            return sb.toString();
        }
    }

    private static class b {
        public static Bundle a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    private f(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1517a = accessibilityNodeInfo;
    }

    private void G(View view) {
        SparseArray<WeakReference<ClickableSpan>> p2 = p(view);
        if (p2 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < p2.size(); i2++) {
                if (p2.valueAt(i2).get() == null) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                p2.remove(((Integer) arrayList.get(i3)).intValue());
            }
        }
    }

    private void H(int i2, boolean z2) {
        Bundle m2 = m();
        if (m2 != null) {
            int i3 = m2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i2);
            if (!z2) {
                i2 = 0;
            }
            m2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i3);
        }
    }

    public static f P(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new f(accessibilityNodeInfo);
    }

    private void b(ClickableSpan clickableSpan, Spanned spanned, int i2) {
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i2));
    }

    private void d() {
        b.a(this.f1517a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        b.a(this.f1517a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        b.a(this.f1517a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        b.a(this.f1517a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List<Integer> e(String str) {
        ArrayList<Integer> integerArrayList = b.a(this.f1517a).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        b.a(this.f1517a).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String g(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case k.U /* 32 */:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i2) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i2) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i2) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] k(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> n(View view) {
        SparseArray<WeakReference<ClickableSpan>> p2 = p(view);
        if (p2 != null) {
            return p2;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(r.c.I, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> p(View view) {
        return (SparseArray) view.getTag(r.c.I);
    }

    private boolean t() {
        return !e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int u(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                if (clickableSpan.equals(sparseArray.valueAt(i2).get())) {
                    return sparseArray.keyAt(i2);
                }
            }
        }
        int i3 = f1516d;
        f1516d = i3 + 1;
        return i3;
    }

    public boolean A() {
        return this.f1517a.isFocused();
    }

    public boolean B() {
        return this.f1517a.isLongClickable();
    }

    public boolean C() {
        return this.f1517a.isPassword();
    }

    public boolean D() {
        return this.f1517a.isScrollable();
    }

    public boolean E() {
        return this.f1517a.isSelected();
    }

    public boolean F(int i2, Bundle bundle) {
        return this.f1517a.performAction(i2, bundle);
    }

    public void I(CharSequence charSequence) {
        this.f1517a.setClassName(charSequence);
    }

    public void J(boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1517a.setHeading(z2);
        } else {
            H(2, z2);
        }
    }

    public void K(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1517a.setPaneTitle(charSequence);
        } else {
            b.a(this.f1517a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void L(boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1517a.setScreenReaderFocusable(z2);
        } else {
            H(1, z2);
        }
    }

    public void M(boolean z2) {
        this.f1517a.setScrollable(z2);
    }

    public void N(CharSequence charSequence) {
        if (u.a.b()) {
            this.f1517a.setStateDescription(charSequence);
        } else {
            b.a(this.f1517a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public AccessibilityNodeInfo O() {
        return this.f1517a;
    }

    public void a(a aVar) {
        this.f1517a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f1542a);
    }

    public void c(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            d();
            G(view);
            ClickableSpan[] k2 = k(charSequence);
            if (k2 == null || k2.length <= 0) {
                return;
            }
            m().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", r.c.f4231a);
            SparseArray<WeakReference<ClickableSpan>> n2 = n(view);
            for (int i2 = 0; i2 < k2.length; i2++) {
                int u2 = u(k2[i2], n2);
                n2.put(u2, new WeakReference<>(k2[i2]));
                b(k2[i2], (Spanned) charSequence, u2);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1517a;
        if (accessibilityNodeInfo == null) {
            if (fVar.f1517a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(fVar.f1517a)) {
            return false;
        }
        return this.f1519c == fVar.f1519c && this.f1518b == fVar.f1518b;
    }

    public List<a> f() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f1517a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new a(actionList.get(i2)));
        }
        return arrayList;
    }

    @Deprecated
    public void h(Rect rect) {
        this.f1517a.getBoundsInParent(rect);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1517a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i(Rect rect) {
        this.f1517a.getBoundsInScreen(rect);
    }

    public CharSequence j() {
        return this.f1517a.getClassName();
    }

    public CharSequence l() {
        return this.f1517a.getContentDescription();
    }

    public Bundle m() {
        return b.a(this.f1517a);
    }

    public CharSequence o() {
        return this.f1517a.getPackageName();
    }

    public CharSequence q() {
        if (!t()) {
            return this.f1517a.getText();
        }
        List<Integer> e3 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> e4 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> e5 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> e6 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f1517a.getText(), 0, this.f1517a.getText().length()));
        for (int i2 = 0; i2 < e3.size(); i2++) {
            spannableString.setSpan(new androidx.core.view.accessibility.a(e6.get(i2).intValue(), this, m().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), e3.get(i2).intValue(), e4.get(i2).intValue(), e5.get(i2).intValue());
        }
        return spannableString;
    }

    public String r() {
        return u.a.c() ? this.f1517a.getUniqueId() : b.a(this.f1517a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public String s() {
        return this.f1517a.getViewIdResourceName();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        h(rect);
        sb.append("; boundsInParent: " + rect);
        i(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(o());
        sb.append("; className: ");
        sb.append(j());
        sb.append("; text: ");
        sb.append(q());
        sb.append("; contentDescription: ");
        sb.append(l());
        sb.append("; viewId: ");
        sb.append(s());
        sb.append("; uniqueId: ");
        sb.append(r());
        sb.append("; checkable: ");
        sb.append(v());
        sb.append("; checked: ");
        sb.append(w());
        sb.append("; focusable: ");
        sb.append(z());
        sb.append("; focused: ");
        sb.append(A());
        sb.append("; selected: ");
        sb.append(E());
        sb.append("; clickable: ");
        sb.append(x());
        sb.append("; longClickable: ");
        sb.append(B());
        sb.append("; enabled: ");
        sb.append(y());
        sb.append("; password: ");
        sb.append(C());
        sb.append("; scrollable: " + D());
        sb.append("; [");
        List<a> f2 = f();
        for (int i2 = 0; i2 < f2.size(); i2++) {
            a aVar = f2.get(i2);
            String g2 = g(aVar.a());
            if (g2.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                g2 = aVar.b().toString();
            }
            sb.append(g2);
            if (i2 != f2.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean v() {
        return this.f1517a.isCheckable();
    }

    public boolean w() {
        return this.f1517a.isChecked();
    }

    public boolean x() {
        return this.f1517a.isClickable();
    }

    public boolean y() {
        return this.f1517a.isEnabled();
    }

    public boolean z() {
        return this.f1517a.isFocusable();
    }
}
