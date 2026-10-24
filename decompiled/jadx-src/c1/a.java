package c1;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import s0.a;
import t0.c;
import y0.m;
import z0.k;
import z0.m;

/* loaded from: classes.dex */
public class a implements s0.a, t0.a, m, m.b {

    /* renamed from: a, reason: collision with root package name */
    private final y0.m f2535a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageManager f2536b;

    /* renamed from: c, reason: collision with root package name */
    private c f2537c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, ResolveInfo> f2538d;

    /* renamed from: e, reason: collision with root package name */
    private Map<Integer, k.d> f2539e = new HashMap();

    public a(y0.m mVar) {
        this.f2535a = mVar;
        this.f2536b = mVar.f4640b;
        mVar.b(this);
    }

    private void d() {
        this.f2538d = new HashMap();
        int i2 = Build.VERSION.SDK_INT;
        Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        for (ResolveInfo resolveInfo : i2 >= 33 ? this.f2536b.queryIntentActivities(type, PackageManager.ResolveInfoFlags.of(0L)) : this.f2536b.queryIntentActivities(type, 0)) {
            String str = resolveInfo.activityInfo.name;
            resolveInfo.loadLabel(this.f2536b).toString();
            this.f2538d.put(str, resolveInfo);
        }
    }

    @Override // z0.m
    @TargetApi(23)
    public boolean a(int i2, int i3, Intent intent) {
        if (!this.f2539e.containsKey(Integer.valueOf(i2))) {
            return false;
        }
        this.f2539e.remove(Integer.valueOf(i2)).a(i3 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // y0.m.b
    public void b(String str, String str2, boolean z2, k.d dVar) {
        if (this.f2537c == null) {
            dVar.c("error", "Plugin not bound to an Activity", null);
            return;
        }
        Map<String, ResolveInfo> map = this.f2538d;
        if (map == null) {
            dVar.c("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = map.get(str);
        if (resolveInfo == null) {
            dVar.c("error", "Text processing activity not found", null);
            return;
        }
        Integer valueOf = Integer.valueOf(dVar.hashCode());
        this.f2539e.put(valueOf, dVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z2);
        this.f2537c.d().startActivityForResult(intent, valueOf.intValue());
    }

    @Override // y0.m.b
    public Map<String, String> c() {
        if (this.f2538d == null) {
            d();
        }
        HashMap hashMap = new HashMap();
        for (String str : this.f2538d.keySet()) {
            hashMap.put(str, this.f2538d.get(str).loadLabel(this.f2536b).toString());
        }
        return hashMap;
    }

    @Override // t0.a
    public void e() {
        this.f2537c.a(this);
        this.f2537c = null;
    }

    @Override // s0.a
    public void h(a.b bVar) {
    }

    @Override // t0.a
    public void i(c cVar) {
        this.f2537c = cVar;
        cVar.e(this);
    }

    @Override // t0.a
    public void j(c cVar) {
        this.f2537c = cVar;
        cVar.e(this);
    }

    @Override // s0.a
    public void l(a.b bVar) {
    }

    @Override // t0.a
    public void n() {
        this.f2537c.a(this);
        this.f2537c = null;
    }
}
