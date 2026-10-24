package androidx.appcompat.widget;

/* loaded from: classes.dex */
class a1 {

    /* renamed from: a, reason: collision with root package name */
    private int f595a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f596b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f597c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f598d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f599e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f600f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f601g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f602h = false;

    a1() {
    }

    public int a() {
        return this.f601g ? this.f595a : this.f596b;
    }

    public int b() {
        return this.f595a;
    }

    public int c() {
        return this.f596b;
    }

    public int d() {
        return this.f601g ? this.f596b : this.f595a;
    }

    public void e(int i2, int i3) {
        this.f602h = false;
        if (i2 != Integer.MIN_VALUE) {
            this.f599e = i2;
            this.f595a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f600f = i3;
            this.f596b = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        if (r2 != Integer.MIN_VALUE) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        if (r2 != Integer.MIN_VALUE) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(boolean z2) {
        int i2;
        if (z2 == this.f601g) {
            return;
        }
        this.f601g = z2;
        if (!this.f602h) {
            this.f595a = this.f599e;
        } else if (z2) {
            int i3 = this.f598d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = this.f599e;
            }
            this.f595a = i3;
            i2 = this.f597c;
        } else {
            int i4 = this.f597c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = this.f599e;
            }
            this.f595a = i4;
            i2 = this.f598d;
        }
        i2 = this.f600f;
        this.f596b = i2;
    }

    public void g(int i2, int i3) {
        this.f597c = i2;
        this.f598d = i3;
        this.f602h = true;
        if (this.f601g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f595a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f596b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f595a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f596b = i3;
        }
    }
}
