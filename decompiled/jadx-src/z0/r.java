package z0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import z0.q;

/* loaded from: classes.dex */
public final class r implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final r f4769b = new r(q.f4766a);

    /* renamed from: a, reason: collision with root package name */
    private final q f4770a;

    public r(q qVar) {
        this.f4770a = qVar;
    }

    @Override // z0.l
    public ByteBuffer a(Object obj) {
        q.a aVar = new q.a();
        aVar.write(0);
        this.f4770a.p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // z0.l
    public ByteBuffer b(String str, String str2, Object obj, String str3) {
        q.a aVar = new q.a();
        aVar.write(1);
        this.f4770a.p(aVar, str);
        this.f4770a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f4770a.p(aVar, n0.b.d((Throwable) obj));
        } else {
            this.f4770a.p(aVar, obj);
        }
        this.f4770a.p(aVar, str3);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // z0.l
    public ByteBuffer c(String str, String str2, Object obj) {
        q.a aVar = new q.a();
        aVar.write(1);
        this.f4770a.p(aVar, str);
        this.f4770a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f4770a.p(aVar, n0.b.d((Throwable) obj));
        } else {
            this.f4770a.p(aVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // z0.l
    public ByteBuffer d(j jVar) {
        q.a aVar = new q.a();
        this.f4770a.p(aVar, jVar.f4754a);
        this.f4770a.p(aVar, jVar.f4755b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // z0.l
    public j e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f2 = this.f4770a.f(byteBuffer);
        Object f3 = this.f4770a.f(byteBuffer);
        if (!(f2 instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new j((String) f2, f3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // z0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b3 = byteBuffer.get();
        if (b3 == 0) {
            Object f2 = this.f4770a.f(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return f2;
            }
        }
        Object f3 = this.f4770a.f(byteBuffer);
        Object f4 = this.f4770a.f(byteBuffer);
        Object f5 = this.f4770a.f(byteBuffer);
        if ((f3 instanceof String) && ((f4 == null || (f4 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new e((String) f3, (String) f4, f5);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }
}
