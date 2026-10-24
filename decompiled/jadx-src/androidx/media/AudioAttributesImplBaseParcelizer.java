package androidx.media;

import androidx.versionedparcelable.a;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2017a = aVar.p(audioAttributesImplBase.f2017a, 1);
        audioAttributesImplBase.f2018b = aVar.p(audioAttributesImplBase.f2018b, 2);
        audioAttributesImplBase.f2019c = aVar.p(audioAttributesImplBase.f2019c, 3);
        audioAttributesImplBase.f2020d = aVar.p(audioAttributesImplBase.f2020d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f2017a, 1);
        aVar.F(audioAttributesImplBase.f2018b, 2);
        aVar.F(audioAttributesImplBase.f2019c, 3);
        aVar.F(audioAttributesImplBase.f2020d, 4);
    }
}
