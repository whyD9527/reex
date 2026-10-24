package io.flutter.plugin.platform;

import android.content.Context;
import android.view.MotionEvent;
import io.flutter.embedding.android.k;

/* loaded from: classes.dex */
public class c extends io.flutter.embedding.android.k {

    /* renamed from: k, reason: collision with root package name */
    private a f3338k;

    public c(Context context, int i2, int i3, a aVar) {
        super(context, i2, i3, k.b.overlay);
        this.f3338k = aVar;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        a aVar = this.f3338k;
        if (aVar == null || !aVar.a(motionEvent, true)) {
            return super.onHoverEvent(motionEvent);
        }
        return true;
    }
}
