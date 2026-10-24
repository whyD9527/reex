package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: e, reason: collision with root package name */
    private final int f1513e;

    /* renamed from: f, reason: collision with root package name */
    private final f f1514f;

    /* renamed from: g, reason: collision with root package name */
    private final int f1515g;

    public a(int i2, f fVar, int i3) {
        this.f1513e = i2;
        this.f1514f = fVar;
        this.f1515g = i3;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1513e);
        this.f1514f.F(this.f1515g, bundle);
    }
}
