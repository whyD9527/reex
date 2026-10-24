package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f2015a;

    /* renamed from: b, reason: collision with root package name */
    public int f2016b;

    public AudioAttributesImplApi21() {
        this.f2016b = -1;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i2) {
        this.f2015a = audioAttributes;
        this.f2016b = i2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f2015a.equals(((AudioAttributesImplApi21) obj).f2015a);
        }
        return false;
    }

    public int hashCode() {
        return this.f2015a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f2015a;
    }
}
