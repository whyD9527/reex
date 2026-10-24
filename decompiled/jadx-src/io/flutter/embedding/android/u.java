package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.a0;
import y0.d;

/* loaded from: classes.dex */
public class u implements a0.d {

    /* renamed from: a, reason: collision with root package name */
    private final y0.d f3086a;

    /* renamed from: b, reason: collision with root package name */
    private final a0.b f3087b = new a0.b();

    public u(y0.d dVar) {
        this.f3086a = dVar;
    }

    @Override // io.flutter.embedding.android.a0.d
    public void a(KeyEvent keyEvent, final a0.d.a aVar) {
        int action = keyEvent.getAction();
        if (action == 0 || action == 1) {
            this.f3086a.e(new d.b(keyEvent, this.f3087b.a(keyEvent.getUnicodeChar())), action != 0, new d.a() { // from class: io.flutter.embedding.android.t
                @Override // y0.d.a
                public final void a(boolean z2) {
                    a0.d.a.this.a(z2);
                }
            });
        } else {
            aVar.a(false);
        }
    }
}
