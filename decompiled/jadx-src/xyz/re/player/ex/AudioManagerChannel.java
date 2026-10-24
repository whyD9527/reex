package xyz.re.player.ex;

import android.annotation.NonNull;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import androidx.lifecycle.f;
import s0.a;
import t0.c;
import xyz.re.player.ex.AudioManagerChannel;
import z0.j;
import z0.k;

/* loaded from: classes.dex */
public final class AudioManagerChannel implements a, k.c, t0.a, f {

    /* renamed from: a, reason: collision with root package name */
    private boolean f4485a;

    /* renamed from: b, reason: collision with root package name */
    private k f4486b;

    /* renamed from: c, reason: collision with root package name */
    private Context f4487c;

    /* renamed from: d, reason: collision with root package name */
    private AudioManager f4488d;

    /* renamed from: e, reason: collision with root package name */
    private AudioFocusRequest f4489e;

    /* renamed from: f, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f4490f = new AudioManager.OnAudioFocusChangeListener() { // from class: e2.j
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i2) {
            AudioManagerChannel.q(AudioManagerChannel.this, i2);
        }
    };

    private final void p() {
        AudioManager audioManager = null;
        if (Build.VERSION.SDK_INT < 26) {
            AudioManager audioManager2 = this.f4488d;
            if (audioManager2 == null) {
                kotlin.jvm.internal.k.o("audioManager");
            } else {
                audioManager = audioManager2;
            }
            audioManager.abandonAudioFocus(this.f4490f);
            return;
        }
        if (this.f4489e != null) {
            AudioManager audioManager3 = this.f4488d;
            if (audioManager3 == null) {
                kotlin.jvm.internal.k.o("audioManager");
            } else {
                audioManager = audioManager3;
            }
            AudioFocusRequest audioFocusRequest = this.f4489e;
            kotlin.jvm.internal.k.b(audioFocusRequest);
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(AudioManagerChannel this$0, int i2) {
        kotlin.jvm.internal.k.e(this$0, "this$0");
        if (this$0.f4485a) {
            k kVar = this$0.f4486b;
            if (kVar == null) {
                kotlin.jvm.internal.k.o("channel");
                kVar = null;
            }
            kVar.c("focusChange", Integer.valueOf(i2));
        }
    }

    @Override // t0.a
    public void e() {
    }

    @Override // s0.a
    public void h(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        Context a3 = binding.a();
        kotlin.jvm.internal.k.d(a3, "binding.applicationContext");
        this.f4487c = a3;
        if (a3 == null) {
            kotlin.jvm.internal.k.o("applicationContext");
            a3 = null;
        }
        Object systemService = a3.getSystemService("audio");
        kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f4488d = (AudioManager) systemService;
        k kVar = new k(binding.b(), "xyz.re.player.ex/AudioManagerChannel");
        this.f4486b = kVar;
        kVar.e(this);
        this.f4485a = true;
    }

    @Override // t0.a
    public void i(c binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
    }

    @Override // t0.a
    public void j(c binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
    }

    @Override // s0.a
    public void l(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        k kVar = this.f4486b;
        if (kVar == null) {
            kotlin.jvm.internal.k.o("channel");
            kVar = null;
        }
        kVar.e(null);
        this.f4485a = false;
    }

    @Override // z0.k.c
    public void m(j call, k.d result) {
        int streamMaxVolume;
        kotlin.jvm.internal.k.e(call, "call");
        kotlin.jvm.internal.k.e(result, "result");
        String str = call.f4754a;
        if (str != null) {
            AudioManager audioManager = null;
            switch (str.hashCode()) {
                case -1582239800:
                    if (str.equals("getStreamMaxVolume")) {
                        Object b3 = call.b();
                        kotlin.jvm.internal.k.b(b3);
                        int intValue = ((Number) b3).intValue();
                        AudioManager audioManager2 = this.f4488d;
                        if (audioManager2 == null) {
                            kotlin.jvm.internal.k.o("audioManager");
                        } else {
                            audioManager = audioManager2;
                        }
                        streamMaxVolume = audioManager.getStreamMaxVolume(intValue);
                        result.a(Integer.valueOf(streamMaxVolume));
                        return;
                    }
                    return;
                case -1504647535:
                    if (str.equals("requestAudioFocus")) {
                        Object a3 = call.a("contentType");
                        kotlin.jvm.internal.k.b(a3);
                        int intValue2 = ((Number) a3).intValue();
                        Object a4 = call.a("focusGain");
                        kotlin.jvm.internal.k.b(a4);
                        int intValue3 = ((Number) a4).intValue();
                        Object a5 = call.a("streamType");
                        kotlin.jvm.internal.k.b(a5);
                        int intValue4 = ((Number) a5).intValue();
                        if (Build.VERSION.SDK_INT >= 26) {
                            if (this.f4489e == null) {
                                AudioFocusRequest.Builder builder = new Object(intValue3) { // from class: android.media.AudioFocusRequest.Builder
                                    static {
                                        throw new NoClassDefFoundError();
                                    }

                                    public /* synthetic */ Builder(int intValue32) {
                                    }

                                    public native /* synthetic */ AudioFocusRequest build();

                                    @NonNull
                                    public native /* synthetic */ Builder setAudioAttributes(@NonNull AudioAttributes audioAttributes);

                                    @NonNull
                                    public native /* synthetic */ Builder setOnAudioFocusChangeListener(@NonNull AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener);
                                };
                                builder.setOnAudioFocusChangeListener(this.f4490f);
                                AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
                                builder2.setContentType(intValue2);
                                builder.setAudioAttributes(builder2.build());
                                this.f4489e = builder.build();
                            }
                            AudioManager audioManager3 = this.f4488d;
                            if (audioManager3 == null) {
                                kotlin.jvm.internal.k.o("audioManager");
                            } else {
                                audioManager = audioManager3;
                            }
                            AudioFocusRequest audioFocusRequest = this.f4489e;
                            kotlin.jvm.internal.k.b(audioFocusRequest);
                            streamMaxVolume = audioManager.requestAudioFocus(audioFocusRequest);
                        } else {
                            AudioManager audioManager4 = this.f4488d;
                            if (audioManager4 == null) {
                                kotlin.jvm.internal.k.o("audioManager");
                            } else {
                                audioManager = audioManager4;
                            }
                            streamMaxVolume = audioManager.requestAudioFocus(this.f4490f, intValue4, intValue32);
                        }
                        result.a(Integer.valueOf(streamMaxVolume));
                        return;
                    }
                    return;
                case -1197068311:
                    if (str.equals("adjustStreamVolume")) {
                        Object a6 = call.a("streamType");
                        kotlin.jvm.internal.k.b(a6);
                        int intValue5 = ((Number) a6).intValue();
                        Object a7 = call.a("direction");
                        kotlin.jvm.internal.k.b(a7);
                        int intValue6 = ((Number) a7).intValue();
                        Object a8 = call.a("flags");
                        kotlin.jvm.internal.k.b(a8);
                        int intValue7 = ((Number) a8).intValue();
                        AudioManager audioManager5 = this.f4488d;
                        if (audioManager5 == null) {
                            kotlin.jvm.internal.k.o("audioManager");
                            audioManager5 = null;
                        }
                        audioManager5.adjustStreamVolume(intValue5, intValue6, intValue7);
                        break;
                    } else {
                        return;
                    }
                case -809761226:
                    if (str.equals("getStreamMinVolume")) {
                        Object b4 = call.b();
                        kotlin.jvm.internal.k.b(b4);
                        int intValue8 = ((Number) b4).intValue();
                        if (Build.VERSION.SDK_INT >= 28) {
                            AudioManager audioManager6 = this.f4488d;
                            if (audioManager6 == null) {
                                kotlin.jvm.internal.k.o("audioManager");
                            } else {
                                audioManager = audioManager6;
                            }
                            streamMaxVolume = audioManager.getStreamMinVolume(intValue8);
                        } else {
                            streamMaxVolume = 0;
                        }
                        result.a(Integer.valueOf(streamMaxVolume));
                        return;
                    }
                    return;
                case 276698416:
                    if (str.equals("getStreamVolume")) {
                        Object b5 = call.b();
                        kotlin.jvm.internal.k.b(b5);
                        int intValue9 = ((Number) b5).intValue();
                        AudioManager audioManager7 = this.f4488d;
                        if (audioManager7 == null) {
                            kotlin.jvm.internal.k.o("audioManager");
                        } else {
                            audioManager = audioManager7;
                        }
                        streamMaxVolume = audioManager.getStreamVolume(intValue9);
                        result.a(Integer.valueOf(streamMaxVolume));
                        return;
                    }
                    return;
                case 1187450940:
                    if (str.equals("setStreamVolume")) {
                        Object a9 = call.a("streamType");
                        kotlin.jvm.internal.k.b(a9);
                        int intValue10 = ((Number) a9).intValue();
                        Object a10 = call.a("index");
                        kotlin.jvm.internal.k.b(a10);
                        int intValue11 = ((Number) a10).intValue();
                        Object a11 = call.a("flags");
                        kotlin.jvm.internal.k.b(a11);
                        int intValue12 = ((Number) a11).intValue();
                        AudioManager audioManager8 = this.f4488d;
                        if (audioManager8 == null) {
                            kotlin.jvm.internal.k.o("audioManager");
                            audioManager8 = null;
                        }
                        audioManager8.setStreamVolume(intValue10, intValue11, intValue12);
                        break;
                    } else {
                        return;
                    }
                case 1357290231:
                    if (str.equals("abandonAudioFocus")) {
                        p();
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
            result.a(null);
        }
    }

    @Override // t0.a
    public void n() {
    }
}
