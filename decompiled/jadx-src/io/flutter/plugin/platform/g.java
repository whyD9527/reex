package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.p1;
import io.flutter.plugin.platform.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import y0.j;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f3339a;

    /* renamed from: b, reason: collision with root package name */
    private final y0.j f3340b;

    /* renamed from: c, reason: collision with root package name */
    private final d f3341c;

    /* renamed from: d, reason: collision with root package name */
    private j.C0073j f3342d;

    /* renamed from: e, reason: collision with root package name */
    private int f3343e;

    /* renamed from: f, reason: collision with root package name */
    final j.h f3344f;

    class a implements j.h {
        a() {
        }

        @Override // y0.j.h
        public CharSequence a(j.e eVar) {
            return g.this.r(eVar);
        }

        @Override // y0.j.h
        public void b() {
            g.this.t();
        }

        @Override // y0.j.h
        public void c(List<j.l> list) {
            g.this.A(list);
        }

        @Override // y0.j.h
        public void d() {
            g.this.y();
        }

        @Override // y0.j.h
        public void e(j.c cVar) {
            g.this.x(cVar);
        }

        @Override // y0.j.h
        public void f(j.C0073j c0073j) {
            g.this.C(c0073j);
        }

        @Override // y0.j.h
        public void g(boolean z2) {
            g.this.w(z2);
        }

        @Override // y0.j.h
        public void h() {
            g.this.u();
        }

        @Override // y0.j.h
        public void i(String str) {
            g.this.v(str);
        }

        @Override // y0.j.h
        public void j(j.g gVar) {
            g.this.F(gVar);
        }

        @Override // y0.j.h
        public void k(j.k kVar) {
            g.this.z(kVar);
        }

        @Override // y0.j.h
        public void l(int i2) {
            g.this.B(i2);
        }

        @Override // y0.j.h
        public void m(String str) {
            g.this.D(str);
        }

        @Override // y0.j.h
        public boolean n() {
            return g.this.p();
        }

        @Override // y0.j.h
        public void o(j.i iVar) {
            g.this.s(iVar);
        }
    }

    class b implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f3346a;

        b(View view) {
            this.f3346a = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i2) {
            y0.j jVar;
            boolean z2;
            if ((i2 & 4) == 0) {
                jVar = g.this.f3340b;
                z2 = true;
            } else {
                jVar = g.this.f3340b;
                z2 = false;
            }
            jVar.m(z2);
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(final int i2) {
            this.f3346a.post(new Runnable() { // from class: io.flutter.plugin.platform.h
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.this.b(i2);
                }
            });
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3348a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f3349b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f3350c;

        static {
            int[] iArr = new int[j.d.values().length];
            f3350c = iArr;
            try {
                iArr[j.d.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3350c[j.d.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[j.l.values().length];
            f3349b = iArr2;
            try {
                iArr2[j.l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3349b[j.l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[j.g.values().length];
            f3348a = iArr3;
            try {
                iArr3[j.g.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3348a[j.g.LIGHT_IMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3348a[j.g.MEDIUM_IMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3348a[j.g.HEAVY_IMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3348a[j.g.SELECTION_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public interface d {
        boolean b();

        void g(boolean z2);
    }

    public g(Activity activity, y0.j jVar, d dVar) {
        a aVar = new a();
        this.f3344f = aVar;
        this.f3339a = activity;
        this.f3340b = jVar;
        jVar.l(aVar);
        this.f3341c = dVar;
        this.f3343e = 1280;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(List<j.l> list) {
        int i2 = list.size() == 0 ? 5894 : 1798;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int i4 = c.f3349b[list.get(i3).ordinal()];
            if (i4 == 1) {
                i2 &= -5;
            } else if (i4 == 2) {
                i2 = i2 & (-513) & (-3);
            }
        }
        this.f3343e = i2;
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(int i2) {
        this.f3339a.setRequestedOrientation(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(21)
    public void C(j.C0073j c0073j) {
        Window window = this.f3339a.getWindow();
        p1 p1Var = new p1(window, window.getDecorView());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        j.d dVar = c0073j.f4584b;
        if (dVar != null) {
            int i3 = c.f3350c[dVar.ordinal()];
            if (i3 == 1) {
                p1Var.b(true);
            } else if (i3 == 2) {
                p1Var.b(false);
            }
        }
        Integer num = c0073j.f4583a;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = c0073j.f4585c;
        if (bool != null && i2 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i2 >= 26) {
            j.d dVar2 = c0073j.f4587e;
            if (dVar2 != null) {
                int i4 = c.f3350c[dVar2.ordinal()];
                if (i4 == 1) {
                    p1Var.a(true);
                } else if (i4 == 2) {
                    p1Var.a(false);
                }
            }
            Integer num2 = c0073j.f4586d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = c0073j.f4588f;
        if (num3 != null && i2 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = c0073j.f4589g;
        if (bool2 != null && i2 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f3342d = c0073j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        this.f3339a.startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.f3339a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence r(j.e eVar) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f3339a.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (eVar != null && eVar != j.e.PLAIN_TEXT) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text == null) {
                    try {
                        Uri uri = itemAt.getUri();
                        if (uri == null) {
                            n0.b.g("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                            return null;
                        }
                        String scheme = uri.getScheme();
                        if (!scheme.equals("content")) {
                            n0.b.g("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                            return null;
                        }
                        AssetFileDescriptor openTypedAssetFileDescriptor = this.f3339a.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                        text = itemAt.coerceToText(this.f3339a);
                        if (openTypedAssetFileDescriptor != null) {
                            openTypedAssetFileDescriptor.close();
                        }
                    } catch (IOException e3) {
                        e = e3;
                        charSequence = text;
                        n0.b.h("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                        return charSequence;
                    }
                }
                return text;
            } catch (IOException e4) {
                e = e4;
            }
        } catch (FileNotFoundException unused) {
            n0.b.g("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (SecurityException e5) {
            n0.b.h("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e5);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(j.i iVar) {
        if (iVar == j.i.CLICK) {
            this.f3339a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void t() {
        d dVar = this.f3341c;
        if (dVar == null || !dVar.b()) {
            Activity activity = this.f3339a;
            if (activity instanceof androidx.activity.c) {
                ((androidx.activity.c) activity).j().c();
            } else {
                activity.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str) {
        ((ClipboardManager) this.f3339a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(boolean z2) {
        d dVar = this.f3341c;
        if (dVar != null) {
            dVar.g(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(j.c cVar) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            this.f3339a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f4558b, (Bitmap) null, cVar.f4557a));
        }
        if (i2 >= 28) {
            this.f3339a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f4558b, 0, cVar.f4557a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        View decorView = this.f3339a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new b(decorView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(j.k kVar) {
        int i2;
        if (kVar == j.k.LEAN_BACK) {
            i2 = 1798;
        } else if (kVar == j.k.IMMERSIVE) {
            i2 = 3846;
        } else if (kVar == j.k.IMMERSIVE_STICKY) {
            i2 = 5894;
        } else if (kVar != j.k.EDGE_TO_EDGE || Build.VERSION.SDK_INT < 29) {
            return;
        } else {
            i2 = 1792;
        }
        this.f3343e = i2;
        E();
    }

    public void E() {
        this.f3339a.getWindow().getDecorView().setSystemUiVisibility(this.f3343e);
        j.C0073j c0073j = this.f3342d;
        if (c0073j != null) {
            C(c0073j);
        }
    }

    void F(j.g gVar) {
        int i2;
        View decorView = this.f3339a.getWindow().getDecorView();
        int i3 = c.f3348a[gVar.ordinal()];
        int i4 = 1;
        if (i3 != 1) {
            if (i3 != 2) {
                i4 = 3;
                if (i3 != 3) {
                    i4 = 4;
                    if (i3 == 4) {
                        i2 = 6;
                    } else if (i3 != 5) {
                        return;
                    }
                }
            }
            decorView.performHapticFeedback(i4);
            return;
        }
        i2 = 0;
        decorView.performHapticFeedback(i2);
    }

    public void q() {
        this.f3340b.l(null);
    }
}
