package z0;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class f implements i<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final f f4752a = new f();

    private f() {
    }

    @Override // z0.i
    public ByteBuffer a(Object obj) {
        s sVar;
        String obj2;
        if (obj == null) {
            return null;
        }
        Object a3 = h.a(obj);
        if (a3 instanceof String) {
            sVar = s.f4772b;
            obj2 = JSONObject.quote((String) a3);
        } else {
            sVar = s.f4772b;
            obj2 = a3.toString();
        }
        return sVar.a(obj2);
    }

    @Override // z0.i
    public Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(s.f4772b.b(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }
}
