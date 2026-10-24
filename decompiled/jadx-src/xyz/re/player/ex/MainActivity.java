package xyz.re.player.ex;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import e2.f0;
import e2.i0;
import e2.j0;
import e2.o;
import e2.o0;
import e2.p;
import e2.q;
import e2.s;
import e2.s0;
import io.flutter.embedding.android.e;
import io.flutter.embedding.engine.a;
import kotlin.jvm.internal.k;
import v.c;
import xyz.re.player.ex.MainActivity;

/* loaded from: classes.dex */
public final class MainActivity extends e {

    /* renamed from: j, reason: collision with root package name */
    private final o0 f4491j = new o0();

    /* renamed from: k, reason: collision with root package name */
    private a f4492k;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(a engine) {
        k.e(engine, "$engine");
        engine.g();
    }

    @Override // io.flutter.embedding.android.e, io.flutter.embedding.android.f.c
    public a B(Context context) {
        k.e(context, "context");
        a aVar = this.f4492k;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(context, y().b(), true, q());
        aVar2.q().i(new e2.e());
        aVar2.q().i(new s0());
        aVar2.q().i(this.f4491j);
        aVar2.q().i(new AudioManagerChannel());
        aVar2.q().i(new f0());
        aVar2.q().i(new s());
        aVar2.q().i(new p());
        aVar2.q().i(new q());
        aVar2.q().i(new i0());
        aVar2.q().i(new o());
        aVar2.q().i(new j0());
        this.f4492k = aVar2;
        return aVar2;
    }

    @Override // io.flutter.embedding.android.e, io.flutter.embedding.android.f.c
    public boolean n() {
        return false;
    }

    @Override // io.flutter.embedding.android.e, android.app.Activity
    protected void onCreate(Bundle bundle) {
        c.f4333b.a(this);
        super.onCreate(bundle);
    }

    @Override // io.flutter.embedding.android.e, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        final a aVar = this.f4492k;
        if (aVar != null) {
            k.b(aVar);
            this.f4492k = null;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: e2.t
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.S(io.flutter.embedding.engine.a.this);
                }
            }, 300L);
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z2, Configuration newConfig) {
        k.e(newConfig, "newConfig");
        super.onPictureInPictureModeChanged(z2, newConfig);
        this.f4491j.c(z2);
    }
}
