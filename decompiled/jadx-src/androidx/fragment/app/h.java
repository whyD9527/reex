package androidx.fragment.app;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: f, reason: collision with root package name */
    static final f f1777f = new f();

    /* renamed from: e, reason: collision with root package name */
    private f f1778e = null;

    public interface a {
        void onBackStackChanged();
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public f b() {
        if (this.f1778e == null) {
            this.f1778e = f1777f;
        }
        return this.f1778e;
    }

    public abstract List<Fragment> c();

    public abstract boolean d();

    public void e(f fVar) {
        this.f1778e = fVar;
    }
}
