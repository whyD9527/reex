package io.flutter.embedding.android;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    long f3088a;

    /* renamed from: b, reason: collision with root package name */
    b f3089b;

    /* renamed from: c, reason: collision with root package name */
    long f3090c;

    /* renamed from: d, reason: collision with root package name */
    long f3091d;

    /* renamed from: e, reason: collision with root package name */
    boolean f3092e;

    /* renamed from: f, reason: collision with root package name */
    a f3093f;

    /* renamed from: g, reason: collision with root package name */
    String f3094g;

    public enum a {
        kKeyboard(0),
        kDirectionalPad(1),
        kGamepad(2),
        kJoystick(3),
        kHdmi(4);


        /* renamed from: e, reason: collision with root package name */
        private final long f3101e;

        a(long j2) {
            this.f3101e = j2;
        }

        public long b() {
            return this.f3101e;
        }
    }

    public enum b {
        kDown(0),
        kUp(1),
        kRepeat(2);


        /* renamed from: e, reason: collision with root package name */
        private long f3106e;

        b(long j2) {
            this.f3106e = j2;
        }

        public long b() {
            return this.f3106e;
        }
    }

    ByteBuffer a() {
        try {
            String str = this.f3094g;
            byte[] bytes = str == null ? null : str.getBytes("UTF-8");
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(this.f3088a);
            allocateDirect.putLong(this.f3089b.b());
            allocateDirect.putLong(this.f3090c);
            allocateDirect.putLong(this.f3091d);
            allocateDirect.putLong(this.f3092e ? 1L : 0L);
            allocateDirect.putLong(this.f3093f.b());
            if (bytes != null) {
                allocateDirect.put(bytes);
            }
            return allocateDirect;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }
}
