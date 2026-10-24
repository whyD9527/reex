package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f1417e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1418a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1419b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1420c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1421d;

    static class a {
        static Insets a(int i2, int i3, int i4, int i5) {
            return Insets.of(i2, i3, i4, i5);
        }
    }

    private b(int i2, int i3, int i4, int i5) {
        this.f1418a = i2;
        this.f1419b = i3;
        this.f1420c = i4;
        this.f1421d = i5;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f1418a, bVar2.f1418a), Math.max(bVar.f1419b, bVar2.f1419b), Math.max(bVar.f1420c, bVar2.f1420c), Math.max(bVar.f1421d, bVar2.f1421d));
    }

    public static b b(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f1417e : new b(i2, i3, i4, i5);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f1418a, this.f1419b, this.f1420c, this.f1421d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1421d == bVar.f1421d && this.f1418a == bVar.f1418a && this.f1420c == bVar.f1420c && this.f1419b == bVar.f1419b;
    }

    public int hashCode() {
        return (((((this.f1418a * 31) + this.f1419b) * 31) + this.f1420c) * 31) + this.f1421d;
    }

    public String toString() {
        return "Insets{left=" + this.f1418a + ", top=" + this.f1419b + ", right=" + this.f1420c + ", bottom=" + this.f1421d + '}';
    }
}
