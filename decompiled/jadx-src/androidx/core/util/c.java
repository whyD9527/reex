package androidx.core.util;

import android.util.Log;
import java.io.Writer;

@Deprecated
/* loaded from: classes.dex */
public class c extends Writer {

    /* renamed from: e, reason: collision with root package name */
    private final String f1505e;

    /* renamed from: f, reason: collision with root package name */
    private StringBuilder f1506f = new StringBuilder(128);

    public c(String str) {
        this.f1505e = str;
    }

    private void a() {
        if (this.f1506f.length() > 0) {
            Log.d(this.f1505e, this.f1506f.toString());
            StringBuilder sb = this.f1506f;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c3 = cArr[i2 + i4];
            if (c3 == '\n') {
                a();
            } else {
                this.f1506f.append(c3);
            }
        }
    }
}
