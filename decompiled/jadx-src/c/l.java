package c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
class l {

    /* renamed from: d, reason: collision with root package name */
    private static l f2489d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f2490a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f2491b;

    /* renamed from: c, reason: collision with root package name */
    private final a f2492c = new a();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f2493a;

        /* renamed from: b, reason: collision with root package name */
        long f2494b;

        /* renamed from: c, reason: collision with root package name */
        long f2495c;

        /* renamed from: d, reason: collision with root package name */
        long f2496d;

        /* renamed from: e, reason: collision with root package name */
        long f2497e;

        /* renamed from: f, reason: collision with root package name */
        long f2498f;

        a() {
        }
    }

    l(Context context, LocationManager locationManager) {
        this.f2490a = context;
        this.f2491b = locationManager;
    }

    static l a(Context context) {
        if (f2489d == null) {
            Context applicationContext = context.getApplicationContext();
            f2489d = new l(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f2489d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location c3 = androidx.core.content.e.b(this.f2490a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c4 = androidx.core.content.e.b(this.f2490a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c4 == null || c3 == null) ? c4 != null ? c4 : c3 : c4.getTime() > c3.getTime() ? c4 : c3;
    }

    private Location c(String str) {
        try {
            if (this.f2491b.isProviderEnabled(str)) {
                return this.f2491b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e3) {
            Log.d("TwilightManager", "Failed to get last known location", e3);
            return null;
        }
    }

    private boolean e() {
        return this.f2492c.f2498f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j2;
        a aVar = this.f2492c;
        long currentTimeMillis = System.currentTimeMillis();
        k b3 = k.b();
        b3.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = b3.f2486a;
        b3.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z2 = b3.f2488c == 1;
        long j4 = b3.f2487b;
        long j5 = b3.f2486a;
        b3.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j6 = b3.f2487b;
        if (j4 == -1 || j5 == -1) {
            j2 = 43200000 + currentTimeMillis;
        } else {
            j2 = (currentTimeMillis > j5 ? 0 + j6 : currentTimeMillis > j4 ? 0 + j5 : 0 + j4) + 60000;
        }
        aVar.f2493a = z2;
        aVar.f2494b = j3;
        aVar.f2495c = j4;
        aVar.f2496d = j5;
        aVar.f2497e = j6;
        aVar.f2498f = j2;
    }

    boolean d() {
        a aVar = this.f2492c;
        if (e()) {
            return aVar.f2493a;
        }
        Location b3 = b();
        if (b3 != null) {
            f(b3);
            return aVar.f2493a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i2 = Calendar.getInstance().get(11);
        return i2 < 6 || i2 >= 22;
    }
}
