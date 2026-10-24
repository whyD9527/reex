package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    private int f2793a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f2794b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f2795c;

    /* renamed from: d, reason: collision with root package name */
    private Configuration f2796d;

    /* renamed from: e, reason: collision with root package name */
    private Resources f2797e;

    public d() {
        super(null);
    }

    public d(Context context, int i2) {
        super(context);
        this.f2793a = i2;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f2794b = theme;
    }

    private Resources b() {
        if (this.f2797e == null) {
            Configuration configuration = this.f2796d;
            this.f2797e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.f2797e;
    }

    private void d() {
        boolean z2 = this.f2794b == null;
        if (z2) {
            this.f2794b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2794b.setTo(theme);
            }
        }
        e(this.f2794b, this.f2793a, z2);
    }

    public void a(Configuration configuration) {
        if (this.f2797e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f2796d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f2796d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f2793a;
    }

    protected void e(Resources.Theme theme, int i2, boolean z2) {
        theme.applyStyle(i2, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2795c == null) {
            this.f2795c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2795c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2794b;
        if (theme != null) {
            return theme;
        }
        if (this.f2793a == 0) {
            this.f2793a = b.i.f2284d;
        }
        d();
        return this.f2794b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        if (this.f2793a != i2) {
            this.f2793a = i2;
            d();
        }
    }
}
