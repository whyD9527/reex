package h0;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final Vibrator f2902a;

    c(Vibrator vibrator) {
        this.f2902a = vibrator;
    }

    Vibrator a() {
        return this.f2902a;
    }

    void b(long j2, int i2) {
        boolean hasAmplitudeControl;
        if (this.f2902a.hasVibrator()) {
            if (Build.VERSION.SDK_INT < 26) {
                this.f2902a.vibrate(j2);
                return;
            }
            hasAmplitudeControl = this.f2902a.hasAmplitudeControl();
            if (hasAmplitudeControl) {
                this.f2902a.vibrate(VibrationEffect.createOneShot(j2, i2), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
            } else {
                this.f2902a.vibrate(VibrationEffect.createOneShot(j2, -1), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
            }
        }
    }

    void c(List<Integer> list, int i2) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i3 = 0; i3 < size; i3++) {
            jArr[i3] = list.get(i3).intValue();
        }
        if (this.f2902a.hasVibrator()) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f2902a.vibrate(VibrationEffect.createWaveform(jArr, i2), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
            } else {
                this.f2902a.vibrate(jArr, i2);
            }
        }
    }

    void d(List<Integer> list, int i2, List<Integer> list2) {
        boolean hasAmplitudeControl;
        int size = list.size();
        long[] jArr = new long[size];
        int size2 = list2.size();
        int[] iArr = new int[size2];
        for (int i3 = 0; i3 < size; i3++) {
            jArr[i3] = list.get(i3).intValue();
        }
        for (int i4 = 0; i4 < size2; i4++) {
            iArr[i4] = list2.get(i4).intValue();
        }
        if (this.f2902a.hasVibrator()) {
            if (Build.VERSION.SDK_INT < 26) {
                this.f2902a.vibrate(jArr, i2);
                return;
            }
            hasAmplitudeControl = this.f2902a.hasAmplitudeControl();
            if (hasAmplitudeControl) {
                this.f2902a.vibrate(VibrationEffect.createWaveform(jArr, iArr, i2), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
            } else {
                this.f2902a.vibrate(VibrationEffect.createWaveform(jArr, i2), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
            }
        }
    }
}
