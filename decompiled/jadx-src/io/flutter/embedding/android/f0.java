package io.flutter.embedding.android;

import android.app.Activity;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    final WindowInfoTrackerCallbackAdapter f3023a;

    public f0(WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter) {
        this.f3023a = windowInfoTrackerCallbackAdapter;
    }

    public void a(Activity activity, Executor executor, androidx.core.util.a<WindowLayoutInfo> aVar) {
        this.f3023a.addWindowLayoutInfoListener(activity, executor, aVar);
    }

    public void b(androidx.core.util.a<WindowLayoutInfo> aVar) {
        this.f3023a.removeWindowLayoutInfoListener(aVar);
    }
}
