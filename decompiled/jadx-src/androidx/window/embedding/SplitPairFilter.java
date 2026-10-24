package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.k;
import w1.o;

@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class SplitPairFilter {
    private final ComponentName primaryActivityName;
    private final String secondaryActivityIntentAction;
    private final ComponentName secondaryActivityName;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SplitPairFilter(ComponentName primaryActivityName, ComponentName secondaryActivityName, String str) {
        boolean z2;
        boolean z3;
        boolean r2;
        boolean r3;
        Object obj;
        int i2;
        CharSequence charSequence;
        boolean z4;
        String str2;
        boolean z5;
        boolean r4;
        boolean r5;
        k.e(primaryActivityName, "primaryActivityName");
        k.e(secondaryActivityName, "secondaryActivityName");
        this.primaryActivityName = primaryActivityName;
        this.secondaryActivityName = secondaryActivityName;
        this.secondaryActivityIntentAction = str;
        String packageName = primaryActivityName.getPackageName();
        k.d(packageName, "primaryActivityName.packageName");
        String className = primaryActivityName.getClassName();
        k.d(className, "primaryActivityName.className");
        String packageName2 = secondaryActivityName.getPackageName();
        k.d(packageName2, "secondaryActivityName.packageName");
        String className2 = secondaryActivityName.getClassName();
        k.d(className2, "secondaryActivityName.className");
        boolean z6 = true;
        if (!(packageName.length() == 0)) {
            if (!(packageName2.length() == 0)) {
                z2 = true;
                if (z2) {
                    throw new IllegalArgumentException("Package name must not be empty".toString());
                }
                if (!(className.length() == 0)) {
                    if (!(className2.length() == 0)) {
                        z3 = true;
                        if (z3) {
                            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
                        }
                        r2 = o.r(packageName, "*", false, 2, null);
                        if (!(!r2 || o.A(packageName, "*", 0, false, 6, null) == packageName.length() + (-1))) {
                            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
                        }
                        r3 = o.r(className, "*", false, 2, null);
                        if (r3) {
                            obj = null;
                            i2 = 2;
                            charSequence = "*";
                            z4 = false;
                            str2 = className2;
                            if (o.A(className, "*", 0, false, 6, null) != className.length() - 1) {
                                z5 = false;
                                if (z5) {
                                    throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                                }
                                r4 = o.r(packageName2, charSequence, z4, i2, obj);
                                if (!((!r4 || o.A(packageName2, "*", 0, false, 6, null) == packageName2.length() + (-1)) ? true : z4)) {
                                    throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
                                }
                                r5 = o.r(str2, charSequence, z4, i2, obj);
                                if (r5 && o.A(str2, "*", 0, false, 6, null) != str2.length() - 1) {
                                    z6 = z4;
                                }
                                if (!z6) {
                                    throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                                }
                                return;
                            }
                        } else {
                            obj = null;
                            i2 = 2;
                            charSequence = "*";
                            z4 = false;
                            str2 = className2;
                        }
                        z5 = true;
                        if (z5) {
                        }
                    }
                }
                z3 = false;
                if (z3) {
                }
            }
        }
        z2 = false;
        if (z2) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairFilter)) {
            return false;
        }
        SplitPairFilter splitPairFilter = (SplitPairFilter) obj;
        return k.a(this.primaryActivityName, splitPairFilter.primaryActivityName) && k.a(this.secondaryActivityName, splitPairFilter.secondaryActivityName) && k.a(this.secondaryActivityIntentAction, splitPairFilter.secondaryActivityIntentAction);
    }

    public final ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }

    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    public final ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }

    public int hashCode() {
        int hashCode = ((this.primaryActivityName.hashCode() * 31) + this.secondaryActivityName.hashCode()) * 31;
        String str = this.secondaryActivityIntentAction;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean matchesActivityIntentPair(Activity primaryActivity, Intent secondaryActivityIntent) {
        k.e(primaryActivity, "primaryActivity");
        k.e(secondaryActivityIntent, "secondaryActivityIntent");
        ComponentName componentName = primaryActivity.getComponentName();
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        if (!matcherUtils.areComponentsMatching$window_release(componentName, this.primaryActivityName) || !matcherUtils.areComponentsMatching$window_release(secondaryActivityIntent.getComponent(), this.secondaryActivityName)) {
            return false;
        }
        String str = this.secondaryActivityIntentAction;
        return str == null || k.a(str, secondaryActivityIntent.getAction());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (matchesActivityIntentPair(r6, r7) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean matchesActivityPair(Activity primaryActivity, Activity secondaryActivity) {
        k.e(primaryActivity, "primaryActivity");
        k.e(secondaryActivity, "secondaryActivity");
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        boolean z2 = true;
        boolean z3 = matcherUtils.areComponentsMatching$window_release(primaryActivity.getComponentName(), this.primaryActivityName) && matcherUtils.areComponentsMatching$window_release(secondaryActivity.getComponentName(), this.secondaryActivityName);
        if (secondaryActivity.getIntent() == null) {
            return z3;
        }
        if (z3) {
            Intent intent = secondaryActivity.getIntent();
            k.d(intent, "secondaryActivity.intent");
        }
        z2 = false;
        return z2;
    }

    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.primaryActivityName + ", secondaryActivityName=" + this.secondaryActivityName + ", secondaryActivityAction=" + ((Object) this.secondaryActivityIntentAction) + '}';
    }
}
