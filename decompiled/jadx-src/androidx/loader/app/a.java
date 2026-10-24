package androidx.loader.app;

import androidx.lifecycle.g;
import androidx.lifecycle.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {
    public static <T extends g & t> a b(T t2) {
        return new b(t2, t2.f());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
