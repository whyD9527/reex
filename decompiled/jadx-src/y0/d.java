package y0;

import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import y0.d;
import z0.a;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final z0.a<Object> f4520a;

    public interface a {
        void a(boolean z2);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final KeyEvent f4521a;

        /* renamed from: b, reason: collision with root package name */
        public final Character f4522b;

        public b(KeyEvent keyEvent, Character ch) {
            this.f4521a = keyEvent;
            this.f4522b = ch;
        }
    }

    public d(z0.c cVar) {
        this.f4520a = new z0.a<>(cVar, "flutter/keyevent", z0.f.f4752a);
    }

    private static a.e<Object> b(final a aVar) {
        return new a.e() { // from class: y0.c
            @Override // z0.a.e
            public final void a(Object obj) {
                d.d(d.a.this, obj);
            }
        };
    }

    private Map<String, Object> c(b bVar, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", z2 ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(bVar.f4521a.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(bVar.f4521a.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(bVar.f4521a.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(bVar.f4521a.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(bVar.f4521a.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(bVar.f4521a.getMetaState()));
        Character ch = bVar.f4522b;
        if (ch != null) {
            hashMap.put("character", ch.toString());
        }
        hashMap.put("source", Integer.valueOf(bVar.f4521a.getSource()));
        hashMap.put("deviceId", Integer.valueOf(bVar.f4521a.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(bVar.f4521a.getRepeatCount()));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(a aVar, Object obj) {
        boolean z2 = false;
        if (obj != null) {
            try {
                z2 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e3) {
                n0.b.b("KeyEventChannel", "Unable to unpack JSON message: " + e3);
            }
        }
        aVar.a(z2);
    }

    public void e(b bVar, boolean z2, a aVar) {
        this.f4520a.d(c(bVar, z2), b(aVar));
    }
}
