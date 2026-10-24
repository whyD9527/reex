package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.k;
import w1.n;
import w1.o;

@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class MatcherUtils {
    public static final MatcherUtils INSTANCE = new MatcherUtils();
    public static final boolean sDebugMatchers = false;
    public static final String sMatchersTag = "SplitRuleResolution";

    private MatcherUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean wildcardMatch(String str, String str2) {
        boolean r2;
        boolean z2;
        boolean o2;
        boolean k2;
        r2 = o.r(str2, "*", false, 2, null);
        if (!r2) {
            return false;
        }
        if (k.a(str2, "*")) {
            return true;
        }
        if (o.A(str2, "*", 0, false, 6, null) == o.F(str2, "*", 0, false, 6, null)) {
            k2 = n.k(str2, "*", false, 2, null);
            if (k2) {
                z2 = true;
                if (z2) {
                    throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
                }
                String substring = str2.substring(0, str2.length() - 1);
                k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                o2 = n.o(str, substring, false, 2, null);
                return o2;
            }
        }
        z2 = false;
        if (z2) {
        }
    }

    public final boolean areActivityOrIntentComponentsMatching$window_release(Activity activity, ComponentName ruleComponent) {
        ComponentName component;
        k.e(activity, "activity");
        k.e(ruleComponent, "ruleComponent");
        if (areComponentsMatching$window_release(activity.getComponentName(), ruleComponent)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return INSTANCE.areComponentsMatching$window_release(component, ruleComponent);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean areComponentsMatching$window_release(ComponentName componentName, ComponentName ruleComponent) {
        boolean r2;
        boolean z2;
        boolean z3;
        k.e(ruleComponent, "ruleComponent");
        if (componentName == null) {
            return k.a(ruleComponent.getPackageName(), "*") && k.a(ruleComponent.getClassName(), "*");
        }
        String componentName2 = componentName.toString();
        k.d(componentName2, "activityComponent.toString()");
        r2 = o.r(componentName2, "*", false, 2, null);
        if (!(!r2)) {
            throw new IllegalArgumentException("Wildcard can only be part of the rule.".toString());
        }
        if (!k.a(componentName.getPackageName(), ruleComponent.getPackageName())) {
            String packageName = componentName.getPackageName();
            k.d(packageName, "activityComponent.packageName");
            String packageName2 = ruleComponent.getPackageName();
            k.d(packageName2, "ruleComponent.packageName");
            if (!wildcardMatch(packageName, packageName2)) {
                z2 = false;
                if (!k.a(componentName.getClassName(), ruleComponent.getClassName())) {
                    String className = componentName.getClassName();
                    k.d(className, "activityComponent.className");
                    String className2 = ruleComponent.getClassName();
                    k.d(className2, "ruleComponent.className");
                    if (!wildcardMatch(className, className2)) {
                        z3 = false;
                        return !z2 && z3;
                    }
                }
                z3 = true;
                if (z2) {
                }
            }
        }
        z2 = true;
        if (!k.a(componentName.getClassName(), ruleComponent.getClassName())) {
        }
        z3 = true;
        if (z2) {
        }
    }
}
