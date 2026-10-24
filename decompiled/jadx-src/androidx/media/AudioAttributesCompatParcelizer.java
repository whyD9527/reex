package androidx.media;

import androidx.versionedparcelable.a;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f2014a = (AudioAttributesImpl) aVar.v(audioAttributesCompat.f2014a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(audioAttributesCompat.f2014a, 1);
    }
}
