package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l0 implements Iterable<Intent> {

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList<Intent> f1354e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private final Context f1355f;

    public interface a {
        Intent d();
    }

    private l0(Context context) {
        this.f1355f = context;
    }

    public static l0 d(Context context) {
        return new l0(context);
    }

    public l0 a(Intent intent) {
        this.f1354e.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l0 b(Activity activity) {
        Intent d3 = activity instanceof a ? ((a) activity).d() : null;
        if (d3 == null) {
            d3 = h.a(activity);
        }
        if (d3 != null) {
            ComponentName component = d3.getComponent();
            if (component == null) {
                component = d3.resolveActivity(this.f1355f.getPackageManager());
            }
            c(component);
            a(d3);
        }
        return this;
    }

    public l0 c(ComponentName componentName) {
        int size = this.f1354e.size();
        try {
            Context context = this.f1355f;
            while (true) {
                Intent b3 = h.b(context, componentName);
                if (b3 == null) {
                    return this;
                }
                this.f1354e.add(size, b3);
                context = this.f1355f;
                componentName = b3.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e3) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e3);
        }
    }

    public void e() {
        f(null);
    }

    public void f(Bundle bundle) {
        if (this.f1354e.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f1354e.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.a.k(this.f1355f, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f1355f.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1354e.iterator();
    }
}
