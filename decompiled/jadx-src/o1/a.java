package o1;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.k;

/* loaded from: classes.dex */
public final class a {
    public static final long a(InputStream inputStream, OutputStream out, int i2) {
        k.e(inputStream, "<this>");
        k.e(out, "out");
        byte[] bArr = new byte[i2];
        int read = inputStream.read(bArr);
        long j2 = 0;
        while (read >= 0) {
            out.write(bArr, 0, read);
            j2 += read;
            read = inputStream.read(bArr);
        }
        return j2;
    }

    public static /* synthetic */ long b(InputStream inputStream, OutputStream outputStream, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 8192;
        }
        return a(inputStream, outputStream, i2);
    }

    public static final byte[] c(InputStream inputStream) {
        k.e(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        b(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        k.d(byteArray, "buffer.toByteArray()");
        return byteArray;
    }
}
