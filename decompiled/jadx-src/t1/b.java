package t1;

import h1.w;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends w {

    /* renamed from: e, reason: collision with root package name */
    private final int f4308e;

    /* renamed from: f, reason: collision with root package name */
    private final int f4309f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4310g;

    /* renamed from: h, reason: collision with root package name */
    private int f4311h;

    public b(int i2, int i3, int i4) {
        this.f4308e = i4;
        this.f4309f = i3;
        boolean z2 = true;
        if (i4 <= 0 ? i2 < i3 : i2 > i3) {
            z2 = false;
        }
        this.f4310g = z2;
        this.f4311h = z2 ? i2 : i3;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4310g;
    }

    @Override // h1.w
    public int nextInt() {
        int i2 = this.f4311h;
        if (i2 != this.f4309f) {
            this.f4311h = this.f4308e + i2;
        } else {
            if (!this.f4310g) {
                throw new NoSuchElementException();
            }
            this.f4310g = false;
        }
        return i2;
    }
}
