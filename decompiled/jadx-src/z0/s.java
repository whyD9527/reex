package z0;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class s implements i<String> {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f4771a = Charset.forName("UTF8");

    /* renamed from: b, reason: collision with root package name */
    public static final s f4772b = new s();

    private s() {
    }

    @Override // z0.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String b(ByteBuffer byteBuffer) {
        byte[] bArr;
        int i2;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i2 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i2 = 0;
        }
        return new String(bArr, i2, remaining, f4771a);
    }

    @Override // z0.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f4771a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
