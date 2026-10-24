package u;

import android.os.Handler;
import androidx.core.util.e;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class b {

    private static class a implements Executor {

        /* renamed from: e, reason: collision with root package name */
        private final Handler f4322e;

        a(Handler handler) {
            this.f4322e = (Handler) e.b(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f4322e.post((Runnable) e.b(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f4322e + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
