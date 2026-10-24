package g0;

import android.app.Activity;
import android.os.Build;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import s0.a;
import t0.c;
import z0.j;
import z0.k;

/* loaded from: classes.dex */
public class b implements s0.a, k.c, t0.a {

    /* renamed from: a, reason: collision with root package name */
    private Activity f2856a;

    private void a(k.d dVar) {
        Display.Mode mode = b().getMode();
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(mode.getModeId()));
        hashMap.put("width", Integer.valueOf(mode.getPhysicalWidth()));
        hashMap.put("height", Integer.valueOf(mode.getPhysicalHeight()));
        hashMap.put("refreshRate", Float.valueOf(mode.getRefreshRate()));
        dVar.a(hashMap);
    }

    private void c(k.d dVar) {
        HashMap hashMap;
        Object valueOf;
        WindowManager.LayoutParams attributes = this.f2856a.getWindow().getAttributes();
        Display.Mode[] supportedModes = b().getSupportedModes();
        int length = supportedModes.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                hashMap = new HashMap();
                hashMap.put("id", 0);
                hashMap.put("width", 0);
                hashMap.put("height", 0);
                valueOf = Double.valueOf(0.0d);
                break;
            }
            Display.Mode mode = supportedModes[i2];
            if (attributes.preferredDisplayModeId == mode.getModeId()) {
                hashMap = new HashMap();
                hashMap.put("id", Integer.valueOf(mode.getModeId()));
                hashMap.put("width", Integer.valueOf(mode.getPhysicalWidth()));
                hashMap.put("height", Integer.valueOf(mode.getPhysicalHeight()));
                valueOf = Float.valueOf(mode.getRefreshRate());
                break;
            }
            i2++;
        }
        hashMap.put("refreshRate", valueOf);
        dVar.a(hashMap);
    }

    private ArrayList<HashMap<String, Object>> d() {
        ArrayList<HashMap<String, Object>> arrayList = new ArrayList<>();
        for (Display.Mode mode : b().getSupportedModes()) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("id", Integer.valueOf(mode.getModeId()));
            hashMap.put("width", Integer.valueOf(mode.getPhysicalWidth()));
            hashMap.put("height", Integer.valueOf(mode.getPhysicalHeight()));
            hashMap.put("refreshRate", Float.valueOf(mode.getRefreshRate()));
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    private void f(k.d dVar) {
        dVar.a(d());
    }

    private void g(j jVar, k.d dVar) {
        int intValue = ((Integer) jVar.a("mode")).intValue();
        Window window = this.f2856a.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.preferredDisplayModeId = intValue;
        window.setAttributes(attributes);
        dVar.a(null);
    }

    Display b() {
        Display display;
        if (Build.VERSION.SDK_INT < 30) {
            return ((WindowManager) this.f2856a.getSystemService("window")).getDefaultDisplay();
        }
        display = this.f2856a.getDisplay();
        return display;
    }

    @Override // t0.a
    public void e() {
        this.f2856a = null;
    }

    @Override // s0.a
    public void h(a.b bVar) {
        new k(bVar.b(), "flutter_display_mode").e(this);
    }

    @Override // t0.a
    public void i(c cVar) {
        j(cVar);
    }

    @Override // t0.a
    public void j(c cVar) {
        this.f2856a = cVar.d();
    }

    @Override // s0.a
    public void l(a.b bVar) {
    }

    @Override // z0.k.c
    public void m(j jVar, k.d dVar) {
        if (this.f2856a == null) {
            dVar.c("noActivity", "Activity not attached to plugin. App is probably in background.", null);
        }
        String str = jVar.f4754a;
        str.hashCode();
        switch (str) {
            case "getPreferredMode":
                c(dVar);
                break;
            case "setPreferredMode":
                g(jVar, dVar);
                break;
            case "getActiveMode":
                a(dVar);
                break;
            case "getSupportedModes":
                f(dVar);
                break;
            default:
                dVar.b();
                break;
        }
    }

    @Override // t0.a
    public void n() {
        e();
    }
}
