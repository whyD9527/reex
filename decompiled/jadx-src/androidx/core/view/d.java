package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final a f1561a;

    interface a {
        boolean a(MotionEvent motionEvent);
    }

    static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final GestureDetector f1562a;

        b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f1562a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // androidx.core.view.d.a
        public boolean a(MotionEvent motionEvent) {
            return this.f1562a.onTouchEvent(motionEvent);
        }
    }

    public d(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public d(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f1561a = new b(context, onGestureListener, handler);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.f1561a.a(motionEvent);
    }
}
