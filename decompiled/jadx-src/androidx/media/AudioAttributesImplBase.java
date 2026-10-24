package androidx.media;

import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f2017a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f2018b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2019c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f2020d = -1;

    public int a() {
        return this.f2018b;
    }

    public int b() {
        int i2 = this.f2019c;
        int c3 = c();
        if (c3 == 6) {
            i2 |= 4;
        } else if (c3 == 7) {
            i2 |= 1;
        }
        return i2 & 273;
    }

    public int c() {
        int i2 = this.f2020d;
        return i2 != -1 ? i2 : AudioAttributesCompat.a(false, this.f2019c, this.f2017a);
    }

    public int d() {
        return this.f2017a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f2018b == audioAttributesImplBase.a() && this.f2019c == audioAttributesImplBase.b() && this.f2017a == audioAttributesImplBase.d() && this.f2020d == audioAttributesImplBase.f2020d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2018b), Integer.valueOf(this.f2019c), Integer.valueOf(this.f2017a), Integer.valueOf(this.f2020d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f2020d != -1) {
            sb.append(" stream=");
            sb.append(this.f2020d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.b(this.f2017a));
        sb.append(" content=");
        sb.append(this.f2018b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f2019c).toUpperCase());
        return sb.toString();
    }
}
