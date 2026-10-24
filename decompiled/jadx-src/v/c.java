package v;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import android.window.SplashScreenView;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.k;

@SuppressLint({"CustomSplashScreen"})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f4333b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C0067c f4334a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final c a(Activity activity) {
            k.e(activity, "<this>");
            c cVar = new c(activity, null);
            cVar.b();
            return cVar;
        }
    }

    private static final class b extends C0067c {

        /* renamed from: h, reason: collision with root package name */
        private boolean f4335h;

        /* renamed from: i, reason: collision with root package name */
        private final ViewGroup.OnHierarchyChangeListener f4336i;

        public static final class a implements ViewGroup.OnHierarchyChangeListener {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Activity f4338f;

            a(Activity activity) {
                this.f4338f = activity;
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                if (view2 instanceof SplashScreenView) {
                    b bVar = b.this;
                    bVar.e(bVar.d((SplashScreenView) view2));
                    ((ViewGroup) this.f4338f.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity) {
            super(activity);
            k.e(activity, "activity");
            this.f4335h = true;
            this.f4336i = new a(activity);
        }

        @Override // v.c.C0067c
        public void b() {
            Resources.Theme theme = a().getTheme();
            k.d(theme, "activity.theme");
            c(theme, new TypedValue());
            ((ViewGroup) a().getWindow().getDecorView()).setOnHierarchyChangeListener(this.f4336i);
        }

        public final boolean d(SplashScreenView child) {
            k.e(child, "child");
            WindowInsets build = new WindowInsets$Builder().build();
            k.d(build, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            return (build == child.getRootView().computeSystemWindowInsets(build, rect) && rect.isEmpty()) ? false : true;
        }

        public final void e(boolean z2) {
            this.f4335h = z2;
        }
    }

    /* renamed from: v.c$c, reason: collision with other inner class name */
    private static class C0067c {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f4339a;

        /* renamed from: b, reason: collision with root package name */
        private int f4340b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f4341c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f4342d;

        /* renamed from: e, reason: collision with root package name */
        private Drawable f4343e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f4344f;

        /* renamed from: g, reason: collision with root package name */
        private d f4345g;

        public C0067c(Activity activity) {
            k.e(activity, "activity");
            this.f4339a = activity;
            this.f4345g = new d() { // from class: v.d
            };
        }

        public final Activity a() {
            return this.f4339a;
        }

        public void b() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme currentTheme = this.f4339a.getTheme();
            if (currentTheme.resolveAttribute(v.a.f4331d, typedValue, true)) {
                this.f4341c = Integer.valueOf(typedValue.resourceId);
                this.f4342d = Integer.valueOf(typedValue.data);
            }
            if (currentTheme.resolveAttribute(v.a.f4330c, typedValue, true)) {
                this.f4343e = currentTheme.getDrawable(typedValue.resourceId);
            }
            if (currentTheme.resolveAttribute(v.a.f4329b, typedValue, true)) {
                this.f4344f = typedValue.resourceId == v.b.f4332a;
            }
            k.d(currentTheme, "currentTheme");
            c(currentTheme, typedValue);
        }

        protected final void c(Resources.Theme currentTheme, TypedValue typedValue) {
            k.e(currentTheme, "currentTheme");
            k.e(typedValue, "typedValue");
            if (currentTheme.resolveAttribute(v.a.f4328a, typedValue, true)) {
                int i2 = typedValue.resourceId;
                this.f4340b = i2;
                if (i2 != 0) {
                    this.f4339a.setTheme(i2);
                }
            }
        }
    }

    public interface d {
    }

    private c(Activity activity) {
        this.f4334a = Build.VERSION.SDK_INT >= 31 ? new b(activity) : new C0067c(activity);
    }

    public /* synthetic */ c(Activity activity, g gVar) {
        this(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        this.f4334a.b();
    }
}
