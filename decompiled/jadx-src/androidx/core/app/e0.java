package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.j;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
class e0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f1282a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f1283b = new Object();

    static Bundle a(j.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat d3 = aVar.d();
        bundle.putInt("icon", d3 != null ? d3.h() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(j0 j0Var) {
        new Bundle();
        throw null;
    }

    private static Bundle[] c(j0[] j0VarArr) {
        if (j0VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[j0VarArr.length];
        for (int i2 = 0; i2 < j0VarArr.length; i2++) {
            j0 j0Var = j0VarArr[i2];
            bundleArr[i2] = b(null);
        }
        return bundleArr;
    }
}
