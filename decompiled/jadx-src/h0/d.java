package h0;

import android.os.Build;
import java.util.List;
import z0.j;
import z0.k;

/* loaded from: classes.dex */
class d implements k.c {

    /* renamed from: a, reason: collision with root package name */
    private final c f2903a;

    d(c cVar) {
        this.f2903a = cVar;
    }

    @Override // z0.k.c
    public void m(j jVar, k.d dVar) {
        Boolean bool;
        boolean hasAmplitudeControl;
        String str = jVar.f4754a;
        str.hashCode();
        switch (str) {
            case "cancel":
                this.f2903a.a().cancel();
                dVar.a(null);
                return;
            case "hasAmplitudeControl":
                if (Build.VERSION.SDK_INT < 26) {
                    bool = Boolean.FALSE;
                    break;
                } else {
                    hasAmplitudeControl = this.f2903a.a().hasAmplitudeControl();
                    bool = Boolean.valueOf(hasAmplitudeControl);
                    break;
                }
            case "vibrate":
                int intValue = ((Integer) jVar.a("duration")).intValue();
                List<Integer> list = (List) jVar.a("pattern");
                int intValue2 = ((Integer) jVar.a("repeat")).intValue();
                List<Integer> list2 = (List) jVar.a("intensities");
                int intValue3 = ((Integer) jVar.a("amplitude")).intValue();
                if (list.size() > 0 && list2.size() > 0) {
                    this.f2903a.d(list, intValue2, list2);
                } else if (list.size() > 0) {
                    this.f2903a.c(list, intValue2);
                } else {
                    this.f2903a.b(intValue, intValue3);
                }
                dVar.a(null);
                return;
            case "hasCustomVibrationsSupport":
                bool = Boolean.TRUE;
                break;
            default:
                dVar.b();
                return;
        }
        dVar.a(bool);
    }
}
