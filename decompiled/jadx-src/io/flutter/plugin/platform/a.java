package io.flutter.plugin.platform;

import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private io.flutter.view.f f3330a;

    a() {
    }

    public boolean a(MotionEvent motionEvent, boolean z2) {
        io.flutter.view.f fVar = this.f3330a;
        if (fVar == null) {
            return false;
        }
        return fVar.M(motionEvent, z2);
    }

    public boolean b(View view, View view2, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.f fVar = this.f3330a;
        if (fVar == null) {
            return false;
        }
        return fVar.w(view, view2, accessibilityEvent);
    }

    void c(io.flutter.view.f fVar) {
        this.f3330a = fVar;
    }
}
