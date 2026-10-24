package y0;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import z0.k;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final z0.k f4539a;

    /* renamed from: b, reason: collision with root package name */
    private b f4540b;

    /* renamed from: c, reason: collision with root package name */
    public final k.c f4541c;

    class a implements k.c {
        a() {
        }

        @Override // z0.k.c
        public void m(z0.j jVar, k.d dVar) {
            if (g.this.f4540b == null) {
                return;
            }
            String str = jVar.f4754a;
            str.hashCode();
            if (!str.equals("Localization.getStringResource")) {
                dVar.b();
                return;
            }
            JSONObject jSONObject = (JSONObject) jVar.b();
            try {
                dVar.a(g.this.f4540b.a(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
            } catch (JSONException e3) {
                dVar.c("error", e3.getMessage(), null);
            }
        }
    }

    public interface b {
        String a(String str, String str2);
    }

    public g(o0.a aVar) {
        a aVar2 = new a();
        this.f4541c = aVar2;
        z0.k kVar = new z0.k(aVar, "flutter/localization", z0.g.f4753a);
        this.f4539a = kVar;
        kVar.e(aVar2);
    }

    public void b(List<Locale> list) {
        n0.b.f("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale locale : list) {
            n0.b.f("LocalizationChannel", "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(locale.getScript());
            arrayList.add(locale.getVariant());
        }
        this.f4539a.c("setLocale", arrayList);
    }

    public void c(b bVar) {
        this.f4540b = bVar;
    }
}
