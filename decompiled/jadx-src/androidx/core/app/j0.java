package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class j0 {

    static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(j0 j0Var) {
            throw null;
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    static RemoteInput a(j0 j0Var) {
        return a.b(j0Var);
    }

    static RemoteInput[] b(j0[] j0VarArr) {
        if (j0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[j0VarArr.length];
        for (int i2 = 0; i2 < j0VarArr.length; i2++) {
            j0 j0Var = j0VarArr[i2];
            remoteInputArr[i2] = a(null);
        }
        return remoteInputArr;
    }
}
