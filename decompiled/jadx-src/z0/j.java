package z0;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f4754a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4755b;

    public j(String str, Object obj) {
        this.f4754a = str;
        this.f4755b = obj;
    }

    public <T> T a(String str) {
        Object obj = this.f4755b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return (T) ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return (T) ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public <T> T b() {
        return (T) this.f4755b;
    }
}
