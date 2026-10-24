package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.f;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final View.AccessibilityDelegate f1507c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    private final View.AccessibilityDelegate f1508a;

    /* renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f1509b;

    /* renamed from: androidx.core.view.a$a, reason: collision with other inner class name */
    static final class C0025a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        final a f1510a;

        C0025a(a aVar) {
            this.f1510a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f1510a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            androidx.core.view.accessibility.g b3 = this.f1510a.b(view);
            if (b3 != null) {
                return (AccessibilityNodeProvider) b3.a();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1510a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            androidx.core.view.accessibility.f P = androidx.core.view.accessibility.f.P(accessibilityNodeInfo);
            P.L(f0.x(view));
            P.J(f0.u(view));
            P.K(f0.j(view));
            P.N(f0.q(view));
            this.f1510a.g(view, P);
            P.c(accessibilityNodeInfo.getText(), view);
            List<f.a> c3 = a.c(view);
            for (int i2 = 0; i2 < c3.size(); i2++) {
                P.a(c3.get(i2));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1510a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f1510a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.f1510a.j(view, i2, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i2) {
            this.f1510a.l(view, i2);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f1510a.m(view, accessibilityEvent);
        }
    }

    static class b {
        static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i2, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i2, bundle);
        }
    }

    public a() {
        this(f1507c);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1508a = accessibilityDelegate;
        this.f1509b = new C0025a(this);
    }

    static List<f.a> c(View view) {
        List<f.a> list = (List) view.getTag(r.c.H);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] k2 = androidx.core.view.accessibility.f.k(view.createAccessibilityNodeInfo().getText());
            for (int i2 = 0; k2 != null && i2 < k2.length; i2++) {
                if (clickableSpan.equals(k2[i2])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i2, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(r.c.I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i2)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1508a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public androidx.core.view.accessibility.g b(View view) {
        AccessibilityNodeProvider a3 = b.a(this.f1508a, view);
        if (a3 != null) {
            return new androidx.core.view.accessibility.g(a3);
        }
        return null;
    }

    View.AccessibilityDelegate d() {
        return this.f1509b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f1508a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, androidx.core.view.accessibility.f fVar) {
        this.f1508a.onInitializeAccessibilityNodeInfo(view, fVar.O());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f1508a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1508a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i2, Bundle bundle) {
        List<f.a> c3 = c(view);
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= c3.size()) {
                break;
            }
            f.a aVar = c3.get(i3);
            if (aVar.a() == i2) {
                z2 = aVar.c(view, bundle);
                break;
            }
            i3++;
        }
        if (!z2) {
            z2 = b.b(this.f1508a, view, i2, bundle);
        }
        return (z2 || i2 != r.c.f4231a || bundle == null) ? z2 : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i2) {
        this.f1508a.sendAccessibilityEvent(view, i2);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f1508a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
