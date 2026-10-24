package d1;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d1.a$a, reason: collision with other inner class name */
    public static class C0037a extends RuntimeException {

        /* renamed from: e, reason: collision with root package name */
        public final String f2543e;

        /* renamed from: f, reason: collision with root package name */
        public final Object f2544f;
    }

    public interface b {
        String a();

        String b();

        String c();

        List<String> d();

        String e();

        List<String> f(c cVar);

        String g();
    }

    public enum c {
        ROOT(0),
        MUSIC(1),
        PODCASTS(2),
        RINGTONES(3),
        ALARMS(4),
        NOTIFICATIONS(5),
        PICTURES(6),
        MOVIES(7),
        DOWNLOADS(8),
        DCIM(9),
        DOCUMENTS(10);


        /* renamed from: e, reason: collision with root package name */
        final int f2557e;

        c(int i2) {
            this.f2557e = i2;
        }
    }

    protected static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof C0037a) {
            C0037a c0037a = (C0037a) th;
            arrayList.add(c0037a.f2543e);
            arrayList.add(c0037a.getMessage());
            obj = c0037a.f2544f;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
