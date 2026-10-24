package z0;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final g f4753a = new g();

    private g() {
    }

    @Override // z0.l
    public ByteBuffer a(Object obj) {
        return f.f4752a.a(new JSONArray().put(h.a(obj)));
    }

    @Override // z0.l
    public ByteBuffer b(String str, String str2, Object obj, String str3) {
        return f.f4752a.a(new JSONArray().put(str).put(h.a(str2)).put(h.a(obj)).put(h.a(str3)));
    }

    @Override // z0.l
    public ByteBuffer c(String str, String str2, Object obj) {
        return f.f4752a.a(new JSONArray().put(str).put(h.a(str2)).put(h.a(obj)));
    }

    @Override // z0.l
    public ByteBuffer d(j jVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", jVar.f4754a);
            jSONObject.put("args", h.a(jVar.f4755b));
            return f.f4752a.a(jSONObject);
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }

    @Override // z0.l
    public j e(ByteBuffer byteBuffer) {
        try {
            Object b3 = f.f4752a.b(byteBuffer);
            if (b3 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) b3;
                Object obj = jSONObject.get("method");
                Object g2 = g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new j((String) obj, g2);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + b3);
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }

    @Override // z0.l
    public Object f(ByteBuffer byteBuffer) {
        try {
            Object b3 = f.f4752a.b(byteBuffer);
            if (b3 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) b3;
                if (jSONArray.length() == 1) {
                    return g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object g2 = g(jSONArray.opt(1));
                    Object g3 = g(jSONArray.opt(2));
                    if ((obj instanceof String) && (g2 == null || (g2 instanceof String))) {
                        throw new e((String) obj, (String) g2, g3);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + b3);
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }

    Object g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
