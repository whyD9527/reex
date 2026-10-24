package io.flutter.view;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.view.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import y0.a;

/* loaded from: classes.dex */
public class f extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    private final View f3446a;

    /* renamed from: b, reason: collision with root package name */
    private final y0.a f3447b;

    /* renamed from: c, reason: collision with root package name */
    private final AccessibilityManager f3448c;

    /* renamed from: d, reason: collision with root package name */
    private final AccessibilityViewEmbedder f3449d;

    /* renamed from: e, reason: collision with root package name */
    private final io.flutter.plugin.platform.o f3450e;

    /* renamed from: f, reason: collision with root package name */
    private final ContentResolver f3451f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<Integer, l> f3452g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<Integer, h> f3453h;

    /* renamed from: i, reason: collision with root package name */
    private l f3454i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f3455j;

    /* renamed from: k, reason: collision with root package name */
    private Integer f3456k;

    /* renamed from: l, reason: collision with root package name */
    private int f3457l;

    /* renamed from: m, reason: collision with root package name */
    private l f3458m;

    /* renamed from: n, reason: collision with root package name */
    private l f3459n;

    /* renamed from: o, reason: collision with root package name */
    private l f3460o;

    /* renamed from: p, reason: collision with root package name */
    private final List<Integer> f3461p;

    /* renamed from: q, reason: collision with root package name */
    private int f3462q;

    /* renamed from: r, reason: collision with root package name */
    private Integer f3463r;

    /* renamed from: s, reason: collision with root package name */
    private k f3464s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f3465t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f3466u;

    /* renamed from: v, reason: collision with root package name */
    private final a.b f3467v;

    /* renamed from: w, reason: collision with root package name */
    private final AccessibilityManager.AccessibilityStateChangeListener f3468w;

    /* renamed from: x, reason: collision with root package name */
    @TargetApi(19)
    private final AccessibilityManager.TouchExplorationStateChangeListener f3469x;

    /* renamed from: y, reason: collision with root package name */
    private final ContentObserver f3470y;

    /* renamed from: z, reason: collision with root package name */
    private static final int f3445z = ((g.SCROLL_RIGHT.f3507e | g.SCROLL_LEFT.f3507e) | g.SCROLL_UP.f3507e) | g.SCROLL_DOWN.f3507e;
    private static final int A = ((((((((((i.HAS_CHECKED_STATE.f3534e | i.IS_CHECKED.f3534e) | i.IS_SELECTED.f3534e) | i.IS_TEXT_FIELD.f3534e) | i.IS_FOCUSED.f3534e) | i.HAS_ENABLED_STATE.f3534e) | i.IS_ENABLED.f3534e) | i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.f3534e) | i.HAS_TOGGLED_STATE.f3534e) | i.IS_TOGGLED.f3534e) | i.IS_FOCUSABLE.f3534e) | i.IS_SLIDER.f3534e;
    private static int B = 267386881;
    static int C = (g.DID_GAIN_ACCESSIBILITY_FOCUS.f3507e & g.DID_LOSE_ACCESSIBILITY_FOCUS.f3507e) & g.SHOW_ON_SCREEN.f3507e;

    class a implements a.b {
        a() {
        }

        @Override // y0.a.b
        public void a(String str) {
            f.this.f3446a.announceForAccessibility(str);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void b(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer byteBuffer2 : byteBufferArr) {
                byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
            }
            f.this.d0(byteBuffer, strArr, byteBufferArr);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void c(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            f.this.c0(byteBuffer, strArr);
        }

        @Override // y0.a.b
        public void d(String str) {
            if (Build.VERSION.SDK_INT >= 28) {
                return;
            }
            AccessibilityEvent I = f.this.I(0, 32);
            I.getText().add(str);
            f.this.U(I);
        }

        @Override // y0.a.b
        public void e(int i2) {
            f.this.T(i2, 8);
        }

        @Override // y0.a.b
        public void f(int i2) {
            f.this.T(i2, 2);
        }

        @Override // y0.a.b
        public void g(int i2) {
            f.this.T(i2, 1);
        }
    }

    class b implements AccessibilityManager.AccessibilityStateChangeListener {
        b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z2) {
            if (f.this.f3466u) {
                return;
            }
            f fVar = f.this;
            if (z2) {
                fVar.f3447b.g(f.this.f3467v);
                f.this.f3447b.e();
            } else {
                fVar.Y(false);
                f.this.f3447b.g(null);
                f.this.f3447b.d();
            }
            if (f.this.f3464s != null) {
                f.this.f3464s.a(z2, f.this.f3448c.isTouchExplorationEnabled());
            }
        }
    }

    class c extends ContentObserver {
        c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            onChange(z2, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2, Uri uri) {
            if (f.this.f3466u) {
                return;
            }
            String string = Settings.Global.getString(f.this.f3451f, "transition_animation_scale");
            if (string != null && string.equals("0")) {
                f.f(f.this, EnumC0048f.DISABLE_ANIMATIONS.f3485e);
            } else {
                f.e(f.this, ~EnumC0048f.DISABLE_ANIMATIONS.f3485e);
            }
            f.this.V();
        }
    }

    class d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AccessibilityManager f3474a;

        d(AccessibilityManager accessibilityManager) {
            this.f3474a = accessibilityManager;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z2) {
            if (f.this.f3466u) {
                return;
            }
            if (!z2) {
                f.this.Y(false);
                f.this.N();
            }
            if (f.this.f3464s != null) {
                f.this.f3464s.a(this.f3474a.isEnabled(), z2);
            }
        }
    }

    static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3476a;

        static {
            int[] iArr = new int[o.values().length];
            f3476a = iArr;
            try {
                iArr[o.SPELLOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3476a[o.LOCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: io.flutter.view.f$f, reason: collision with other inner class name */
    private enum EnumC0048f {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);


        /* renamed from: e, reason: collision with root package name */
        final int f3485e;

        EnumC0048f(int i2) {
            this.f3485e = i2;
        }
    }

    public enum g {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);


        /* renamed from: e, reason: collision with root package name */
        public final int f3507e;

        g(int i2) {
            this.f3507e = i2;
        }
    }

    private static class h {

        /* renamed from: a, reason: collision with root package name */
        private int f3508a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f3509b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f3510c = -1;

        /* renamed from: d, reason: collision with root package name */
        private String f3511d;

        /* renamed from: e, reason: collision with root package name */
        private String f3512e;

        h() {
        }
    }

    enum i {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432),
        HAS_EXPANDED_STATE(67108864),
        IS_EXPANDED(134217728);


        /* renamed from: e, reason: collision with root package name */
        final int f3534e;

        i(int i2) {
            this.f3534e = i2;
        }
    }

    private static class j extends n {

        /* renamed from: d, reason: collision with root package name */
        String f3535d;

        private j() {
            super(null);
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    public interface k {
        void a(boolean z2, boolean z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class l {
        private p B;
        private int D;
        private int E;
        private int F;
        private int G;
        private float H;
        private float I;
        private float J;
        private String K;
        private String L;
        private float M;
        private float N;
        private float O;
        private float P;
        private float[] Q;
        private l R;
        private List<h> U;
        private h V;
        private h W;
        private float[] Y;

        /* renamed from: a, reason: collision with root package name */
        final f f3536a;

        /* renamed from: a0, reason: collision with root package name */
        private float[] f3537a0;

        /* renamed from: b0, reason: collision with root package name */
        private Rect f3539b0;

        /* renamed from: c, reason: collision with root package name */
        private int f3540c;

        /* renamed from: d, reason: collision with root package name */
        private int f3541d;

        /* renamed from: e, reason: collision with root package name */
        private int f3542e;

        /* renamed from: f, reason: collision with root package name */
        private int f3543f;

        /* renamed from: g, reason: collision with root package name */
        private int f3544g;

        /* renamed from: h, reason: collision with root package name */
        private int f3545h;

        /* renamed from: i, reason: collision with root package name */
        private int f3546i;

        /* renamed from: j, reason: collision with root package name */
        private int f3547j;

        /* renamed from: k, reason: collision with root package name */
        private int f3548k;

        /* renamed from: l, reason: collision with root package name */
        private float f3549l;

        /* renamed from: m, reason: collision with root package name */
        private float f3550m;

        /* renamed from: n, reason: collision with root package name */
        private float f3551n;

        /* renamed from: o, reason: collision with root package name */
        private String f3552o;

        /* renamed from: p, reason: collision with root package name */
        private String f3553p;

        /* renamed from: q, reason: collision with root package name */
        private List<n> f3554q;

        /* renamed from: r, reason: collision with root package name */
        private String f3555r;

        /* renamed from: s, reason: collision with root package name */
        private List<n> f3556s;

        /* renamed from: t, reason: collision with root package name */
        private String f3557t;

        /* renamed from: u, reason: collision with root package name */
        private List<n> f3558u;

        /* renamed from: v, reason: collision with root package name */
        private String f3559v;

        /* renamed from: w, reason: collision with root package name */
        private List<n> f3560w;

        /* renamed from: x, reason: collision with root package name */
        private String f3561x;

        /* renamed from: y, reason: collision with root package name */
        private List<n> f3562y;

        /* renamed from: z, reason: collision with root package name */
        private String f3563z;

        /* renamed from: b, reason: collision with root package name */
        private int f3538b = -1;
        private int A = -1;
        private boolean C = false;
        private List<l> S = new ArrayList();
        private List<l> T = new ArrayList();
        private boolean X = true;
        private boolean Z = true;

        l(f fVar) {
            this.f3536a = fVar;
        }

        private float A0(float f2, float f3, float f4, float f5) {
            return Math.max(f2, Math.max(f3, Math.max(f4, f5)));
        }

        private float B0(float f2, float f3, float f4, float f5) {
            return Math.min(f2, Math.min(f3, Math.min(f4, f5)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean C0(l lVar, f1.e<l> eVar) {
            return (lVar == null || lVar.l0(eVar) == null) ? false : true;
        }

        private void D0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f2 = fArr[3];
            fArr[0] = fArr[0] / f2;
            fArr[1] = fArr[1] / f2;
            fArr[2] = fArr[2] / f2;
            fArr[3] = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E0(float[] fArr, Set<l> set, boolean z2) {
            set.add(this);
            if (this.Z) {
                z2 = true;
            }
            if (z2) {
                if (this.f3537a0 == null) {
                    this.f3537a0 = new float[16];
                }
                if (this.Q == null) {
                    this.Q = new float[16];
                }
                Matrix.multiplyMM(this.f3537a0, 0, fArr, 0, this.Q, 0);
                float[] fArr2 = {this.M, this.N, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                D0(fArr3, this.f3537a0, fArr2);
                fArr2[0] = this.O;
                fArr2[1] = this.N;
                D0(fArr4, this.f3537a0, fArr2);
                fArr2[0] = this.O;
                fArr2[1] = this.P;
                D0(fArr5, this.f3537a0, fArr2);
                fArr2[0] = this.M;
                fArr2[1] = this.P;
                D0(fArr6, this.f3537a0, fArr2);
                if (this.f3539b0 == null) {
                    this.f3539b0 = new Rect();
                }
                this.f3539b0.set(Math.round(B0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(B0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(A0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(A0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.Z = false;
            }
            int i2 = -1;
            for (l lVar : this.S) {
                lVar.A = i2;
                i2 = lVar.f3538b;
                lVar.E0(this.f3537a0, set, z2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.C = true;
            this.K = this.f3555r;
            this.L = this.f3553p;
            this.D = this.f3540c;
            this.E = this.f3541d;
            this.F = this.f3544g;
            this.G = this.f3545h;
            this.H = this.f3549l;
            this.I = this.f3550m;
            this.J = this.f3551n;
            this.f3540c = byteBuffer.getInt();
            this.f3541d = byteBuffer.getInt();
            this.f3542e = byteBuffer.getInt();
            this.f3543f = byteBuffer.getInt();
            this.f3544g = byteBuffer.getInt();
            this.f3545h = byteBuffer.getInt();
            this.f3546i = byteBuffer.getInt();
            this.f3547j = byteBuffer.getInt();
            this.f3548k = byteBuffer.getInt();
            this.f3549l = byteBuffer.getFloat();
            this.f3550m = byteBuffer.getFloat();
            this.f3551n = byteBuffer.getFloat();
            int i2 = byteBuffer.getInt();
            this.f3552o = i2 == -1 ? null : strArr[i2];
            int i3 = byteBuffer.getInt();
            this.f3553p = i3 == -1 ? null : strArr[i3];
            this.f3554q = q0(byteBuffer, byteBufferArr);
            int i4 = byteBuffer.getInt();
            this.f3555r = i4 == -1 ? null : strArr[i4];
            this.f3556s = q0(byteBuffer, byteBufferArr);
            int i5 = byteBuffer.getInt();
            this.f3557t = i5 == -1 ? null : strArr[i5];
            this.f3558u = q0(byteBuffer, byteBufferArr);
            int i6 = byteBuffer.getInt();
            this.f3559v = i6 == -1 ? null : strArr[i6];
            this.f3560w = q0(byteBuffer, byteBufferArr);
            int i7 = byteBuffer.getInt();
            this.f3561x = i7 == -1 ? null : strArr[i7];
            this.f3562y = q0(byteBuffer, byteBufferArr);
            int i8 = byteBuffer.getInt();
            this.f3563z = i8 == -1 ? null : strArr[i8];
            this.B = p.b(byteBuffer.getInt());
            this.M = byteBuffer.getFloat();
            this.N = byteBuffer.getFloat();
            this.O = byteBuffer.getFloat();
            this.P = byteBuffer.getFloat();
            if (this.Q == null) {
                this.Q = new float[16];
            }
            for (int i9 = 0; i9 < 16; i9++) {
                this.Q[i9] = byteBuffer.getFloat();
            }
            this.X = true;
            this.Z = true;
            int i10 = byteBuffer.getInt();
            this.S.clear();
            this.T.clear();
            for (int i11 = 0; i11 < i10; i11++) {
                l z2 = this.f3536a.z(byteBuffer.getInt());
                z2.R = this;
                this.S.add(z2);
            }
            for (int i12 = 0; i12 < i10; i12++) {
                l z3 = this.f3536a.z(byteBuffer.getInt());
                z3.R = this;
                this.T.add(z3);
            }
            int i13 = byteBuffer.getInt();
            if (i13 == 0) {
                this.U = null;
                return;
            }
            List<h> list = this.U;
            if (list == null) {
                this.U = new ArrayList(i13);
            } else {
                list.clear();
            }
            for (int i14 = 0; i14 < i13; i14++) {
                h y2 = this.f3536a.y(byteBuffer.getInt());
                if (y2.f3510c == g.TAP.f3507e) {
                    this.V = y2;
                } else if (y2.f3510c == g.LONG_PRESS.f3507e) {
                    this.W = y2;
                } else {
                    this.U.add(y2);
                }
                this.U.add(y2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g0(List<l> list) {
            if (x0(i.SCOPES_ROUTE)) {
                list.add(this);
            }
            Iterator<l> it = this.S.iterator();
            while (it.hasNext()) {
                it.next().g0(list);
            }
        }

        @TargetApi(21)
        private SpannableString h0(String str, List<n> list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                for (n nVar : list) {
                    int i2 = e.f3476a[nVar.f3566c.ordinal()];
                    if (i2 == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), nVar.f3564a, nVar.f3565b, 0);
                    } else if (i2 == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((j) nVar).f3535d)), nVar.f3564a, nVar.f3565b, 0);
                    }
                }
            }
            return spannableString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean i0() {
            String str;
            String str2 = this.f3553p;
            if (str2 == null && this.L == null) {
                return false;
            }
            return str2 == null || (str = this.L) == null || !str2.equals(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean j0() {
            return (Float.isNaN(this.f3549l) || Float.isNaN(this.H) || this.H == this.f3549l) ? false : true;
        }

        private void k0() {
            if (this.X) {
                this.X = false;
                if (this.Y == null) {
                    this.Y = new float[16];
                }
                if (Matrix.invertM(this.Y, 0, this.Q, 0)) {
                    return;
                }
                Arrays.fill(this.Y, 0.0f);
            }
        }

        private l l0(f1.e<l> eVar) {
            for (l lVar = this.R; lVar != null; lVar = lVar.R) {
                if (eVar.test(lVar)) {
                    return lVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Rect m0() {
            return this.f3539b0;
        }

        static /* synthetic */ int n(l lVar, int i2) {
            int i3 = lVar.f3545h + i2;
            lVar.f3545h = i3;
            return i3;
        }

        private CharSequence n0() {
            return h0(this.f3561x, this.f3562y);
        }

        static /* synthetic */ int o(l lVar, int i2) {
            int i3 = lVar.f3545h - i2;
            lVar.f3545h = i3;
            return i3;
        }

        private CharSequence o0() {
            return h0(this.f3553p, this.f3554q);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String p0() {
            String str;
            if (x0(i.NAMES_ROUTE) && (str = this.f3553p) != null && !str.isEmpty()) {
                return this.f3553p;
            }
            Iterator<l> it = this.S.iterator();
            while (it.hasNext()) {
                String p02 = it.next().p0();
                if (p02 != null && !p02.isEmpty()) {
                    return p02;
                }
            }
            return null;
        }

        private List<n> q0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i2 = byteBuffer.getInt();
            a aVar = null;
            if (i2 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = byteBuffer.getInt();
                int i5 = byteBuffer.getInt();
                o oVar = o.values()[byteBuffer.getInt()];
                int i6 = e.f3476a[oVar.ordinal()];
                if (i6 == 1) {
                    byteBuffer.getInt();
                    m mVar = new m(aVar);
                    mVar.f3564a = i4;
                    mVar.f3565b = i5;
                    mVar.f3566c = oVar;
                    arrayList.add(mVar);
                } else if (i6 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    j jVar = new j(aVar);
                    jVar.f3564a = i4;
                    jVar.f3565b = i5;
                    jVar.f3566c = oVar;
                    jVar.f3535d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(jVar);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence r0() {
            CharSequence[] charSequenceArr = {o0(), n0()};
            CharSequence charSequence = null;
            for (int i2 = 0; i2 < 2; i2++) {
                CharSequence charSequence2 = charSequenceArr[i2];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence s0() {
            return h0(this.f3555r, this.f3556s);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence t0() {
            CharSequence[] charSequenceArr = {s0(), o0(), n0()};
            CharSequence charSequence = null;
            for (int i2 = 0; i2 < 3; i2++) {
                CharSequence charSequence2 = charSequenceArr[i2];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean u0(g gVar) {
            return (gVar.f3507e & this.E) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean v0(i iVar) {
            return (iVar.f3534e & this.D) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean w0(g gVar) {
            return (gVar.f3507e & this.f3541d) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean x0(i iVar) {
            return (iVar.f3534e & this.f3540c) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public l y0(float[] fArr, boolean z2) {
            float f2 = fArr[3];
            boolean z3 = false;
            float f3 = fArr[0] / f2;
            float f4 = fArr[1] / f2;
            if (f3 < this.M || f3 >= this.O || f4 < this.N || f4 >= this.P) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (l lVar : this.T) {
                if (!lVar.x0(i.IS_HIDDEN)) {
                    lVar.k0();
                    Matrix.multiplyMV(fArr2, 0, lVar.Y, 0, fArr, 0);
                    l y02 = lVar.y0(fArr2, z2);
                    if (y02 != null) {
                        return y02;
                    }
                }
            }
            if (z2 && this.f3546i != -1) {
                z3 = true;
            }
            if (z0() || z3) {
                return this;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean z0() {
            String str;
            String str2;
            String str3;
            if (x0(i.SCOPES_ROUTE)) {
                return false;
            }
            if (x0(i.IS_FOCUSABLE)) {
                return true;
            }
            return ((this.f3541d & (~f.f3445z)) == 0 && (this.f3540c & f.A) == 0 && ((str = this.f3553p) == null || str.isEmpty()) && (((str2 = this.f3555r) == null || str2.isEmpty()) && ((str3 = this.f3561x) == null || str3.isEmpty()))) ? false : true;
        }
    }

    private static class m extends n {
        private m() {
            super(null);
        }

        /* synthetic */ m(a aVar) {
            this();
        }
    }

    private static class n {

        /* renamed from: a, reason: collision with root package name */
        int f3564a;

        /* renamed from: b, reason: collision with root package name */
        int f3565b;

        /* renamed from: c, reason: collision with root package name */
        o f3566c;

        private n() {
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    private enum o {
        SPELLOUT,
        LOCALE
    }

    private enum p {
        UNKNOWN,
        LTR,
        RTL;

        public static p b(int i2) {
            return i2 != 1 ? i2 != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public f(View view, y0.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.o oVar) {
        this(view, aVar, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), oVar);
    }

    public f(View view, y0.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, io.flutter.plugin.platform.o oVar) {
        this.f3452g = new HashMap();
        this.f3453h = new HashMap();
        this.f3457l = 0;
        this.f3461p = new ArrayList();
        this.f3462q = 0;
        this.f3463r = 0;
        this.f3465t = false;
        this.f3466u = false;
        this.f3467v = new a();
        b bVar = new b();
        this.f3468w = bVar;
        c cVar = new c(new Handler());
        this.f3470y = cVar;
        this.f3446a = view;
        this.f3447b = aVar;
        this.f3448c = accessibilityManager;
        this.f3451f = contentResolver;
        this.f3449d = accessibilityViewEmbedder;
        this.f3450e = oVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        int i2 = Build.VERSION.SDK_INT;
        d dVar = new d(accessibilityManager);
        this.f3469x = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        cVar.onChange(false);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        if (i2 >= 31) {
            Z();
        }
        oVar.a(this);
    }

    private l A() {
        return this.f3452g.get(0);
    }

    private void B(float f2, float f3, boolean z2) {
        l y02;
        if (this.f3452g.isEmpty() || (y02 = A().y0(new float[]{f2, f3, 0.0f, 1.0f}, z2)) == this.f3460o) {
            return;
        }
        if (y02 != null) {
            T(y02.f3538b, 128);
        }
        l lVar = this.f3460o;
        if (lVar != null) {
            T(lVar.f3538b, 256);
        }
        this.f3460o = y02;
    }

    private boolean D(l lVar) {
        if (lVar.x0(i.SCOPES_ROUTE)) {
            return false;
        }
        return (lVar.t0() == null && (lVar.f3541d & (~C)) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean F(l lVar, l lVar2) {
        return lVar2 == lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean G(l lVar) {
        return lVar.x0(i.HAS_IMPLICIT_SCROLLING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccessibilityEvent I(int i2, int i3) {
        AccessibilityEvent H = H(i3);
        H.setPackageName(this.f3446a.getContext().getPackageName());
        H.setSource(this.f3446a, i2);
        return H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        l lVar = this.f3460o;
        if (lVar != null) {
            T(lVar.f3538b, 256);
            this.f3460o = null;
        }
    }

    private void O(l lVar) {
        String p02 = lVar.p0();
        if (p02 == null) {
            p02 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            X(p02);
            return;
        }
        AccessibilityEvent I = I(lVar.f3538b, 32);
        I.getText().add(p02);
        U(I);
    }

    @TargetApi(18)
    private boolean P(l lVar, int i2, Bundle bundle, boolean z2) {
        int i3 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z3 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i4 = lVar.f3544g;
        int i5 = lVar.f3545h;
        R(lVar, i3, z2, z3);
        if (i4 != lVar.f3544g || i5 != lVar.f3545h) {
            String str = lVar.f3555r != null ? lVar.f3555r : "";
            AccessibilityEvent I = I(lVar.f3538b, 8192);
            I.getText().add(str);
            I.setFromIndex(lVar.f3544g);
            I.setToIndex(lVar.f3545h);
            I.setItemCount(str.length());
            U(I);
        }
        if (i3 == 1) {
            if (z2) {
                g gVar = g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (lVar.w0(gVar)) {
                    this.f3447b.c(i2, gVar, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (z2) {
                return false;
            }
            g gVar2 = g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!lVar.w0(gVar2)) {
                return false;
            }
            this.f3447b.c(i2, gVar2, Boolean.valueOf(z3));
            return true;
        }
        if (i3 != 2) {
            return i3 == 4 || i3 == 8 || i3 == 16;
        }
        if (z2) {
            g gVar3 = g.MOVE_CURSOR_FORWARD_BY_WORD;
            if (lVar.w0(gVar3)) {
                this.f3447b.c(i2, gVar3, Boolean.valueOf(z3));
                return true;
            }
        }
        if (z2) {
            return false;
        }
        g gVar4 = g.MOVE_CURSOR_BACKWARD_BY_WORD;
        if (!lVar.w0(gVar4)) {
            return false;
        }
        this.f3447b.c(i2, gVar4, Boolean.valueOf(z3));
        return true;
    }

    @TargetApi(21)
    private boolean Q(l lVar, int i2, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.f3447b.c(i2, g.SET_TEXT, string);
        lVar.f3555r = string;
        lVar.f3556s = null;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0022, code lost:
    
        if (r6 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
    
        r5 = r4.f3555r.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002c, code lost:
    
        r4.f3545h = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        r4.f3545h = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r5.find() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        io.flutter.view.f.l.n(r4, r5.start(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        if (r5.find() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        r5 = r5.start(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c1, code lost:
    
        if (r5.find() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
    
        if (r5.find() != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void R(l lVar, int i2, boolean z2, boolean z3) {
        Matcher matcher;
        Matcher matcher2;
        if (lVar.f3545h < 0 || lVar.f3544g < 0) {
            return;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 == 8 || i2 == 16) {
                    }
                } else if (z2 && lVar.f3545h < lVar.f3555r.length()) {
                    matcher2 = Pattern.compile("(?!^)(\\n)").matcher(lVar.f3555r.substring(lVar.f3545h));
                } else if (!z2 && lVar.f3545h > 0) {
                    matcher = Pattern.compile("(?s:.*)(\\n)").matcher(lVar.f3555r.substring(0, lVar.f3545h));
                }
            } else if (z2 && lVar.f3545h < lVar.f3555r.length()) {
                matcher2 = Pattern.compile("\\p{L}(\\b)").matcher(lVar.f3555r.substring(lVar.f3545h));
                matcher2.find();
            } else if (!z2 && lVar.f3545h > 0) {
                matcher = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(lVar.f3555r.substring(0, lVar.f3545h));
            }
        } else if (z2 && lVar.f3545h < lVar.f3555r.length()) {
            l.n(lVar, 1);
        } else if (!z2 && lVar.f3545h > 0) {
            l.o(lVar, 1);
        }
        if (z3) {
            return;
        }
        lVar.f3544g = lVar.f3545h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(AccessibilityEvent accessibilityEvent) {
        if (this.f3448c.isEnabled()) {
            this.f3446a.getParent().requestSendAccessibilityEvent(this.f3446a, accessibilityEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        this.f3447b.f(this.f3457l);
    }

    private void W(int i2) {
        AccessibilityEvent I = I(i2, 2048);
        I.setContentChangeTypes(1);
        U(I);
    }

    @TargetApi(28)
    private void X(String str) {
        this.f3446a.setAccessibilityPaneTitle(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(boolean z2) {
        if (this.f3465t == z2) {
            return;
        }
        this.f3465t = z2;
        this.f3457l = z2 ? this.f3457l | EnumC0048f.ACCESSIBLE_NAVIGATION.f3485e : this.f3457l & (~EnumC0048f.ACCESSIBLE_NAVIGATION.f3485e);
        V();
    }

    @TargetApi(androidx.constraintlayout.widget.k.T)
    private void Z() {
        View view = this.f3446a;
        if (view == null || view.getResources() == null) {
            return;
        }
        int i2 = this.f3446a.getResources().getConfiguration().fontWeightAdjustment;
        this.f3457l = i2 != Integer.MAX_VALUE && i2 >= 300 ? this.f3457l | EnumC0048f.BOLD_TEXT.f3485e : this.f3457l & EnumC0048f.BOLD_TEXT.f3485e;
        V();
    }

    private boolean b0(final l lVar) {
        return lVar.f3547j > 0 && (l.C0(this.f3454i, new f1.e() { // from class: io.flutter.view.d
            @Override // f1.e
            public final boolean test(Object obj) {
                boolean F;
                F = f.F(f.l.this, (f.l) obj);
                return F;
            }
        }) || !l.C0(this.f3454i, new f1.e() { // from class: io.flutter.view.e
            @Override // f1.e
            public final boolean test(Object obj) {
                boolean G;
                G = f.G((f.l) obj);
                return G;
            }
        }));
    }

    static /* synthetic */ int e(f fVar, int i2) {
        int i3 = i2 & fVar.f3457l;
        fVar.f3457l = i3;
        return i3;
    }

    @TargetApi(19)
    private void e0(l lVar) {
        View c3;
        Integer num;
        lVar.R = null;
        if (lVar.f3546i != -1 && (num = this.f3455j) != null && this.f3449d.platformViewOfNode(num.intValue()) == this.f3450e.c(lVar.f3546i)) {
            T(this.f3455j.intValue(), 65536);
            this.f3455j = null;
        }
        if (lVar.f3546i != -1 && (c3 = this.f3450e.c(lVar.f3546i)) != null) {
            c3.setImportantForAccessibility(4);
        }
        l lVar2 = this.f3454i;
        if (lVar2 == lVar) {
            T(lVar2.f3538b, 65536);
            this.f3454i = null;
        }
        if (this.f3458m == lVar) {
            this.f3458m = null;
        }
        if (this.f3460o == lVar) {
            this.f3460o = null;
        }
    }

    static /* synthetic */ int f(f fVar, int i2) {
        int i3 = i2 | fVar.f3457l;
        fVar.f3457l = i3;
        return i3;
    }

    private AccessibilityEvent u(int i2, String str, String str2) {
        AccessibilityEvent I = I(i2, 16);
        I.setBeforeText(str);
        I.getText().add(str2);
        int i3 = 0;
        while (i3 < str.length() && i3 < str2.length() && str.charAt(i3) == str2.charAt(i3)) {
            i3++;
        }
        if (i3 >= str.length() && i3 >= str2.length()) {
            return null;
        }
        I.setFromIndex(i3);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i3 && length2 >= i3 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        I.setRemovedCount((length - i3) + 1);
        I.setAddedCount((length2 - i3) + 1);
        return I;
    }

    @TargetApi(28)
    private boolean v() {
        Activity f2 = f1.i.f(this.f3446a.getContext());
        if (f2 == null || f2.getWindow() == null) {
            return false;
        }
        int i2 = f2.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i2 == 2 || i2 == 0;
    }

    private Rect x(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.f3446a.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h y(int i2) {
        h hVar = this.f3453h.get(Integer.valueOf(i2));
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        hVar2.f3509b = i2;
        hVar2.f3508a = B + i2;
        this.f3453h.put(Integer.valueOf(i2), hVar2);
        return hVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l z(int i2) {
        l lVar = this.f3452g.get(Integer.valueOf(i2));
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        lVar2.f3538b = i2;
        this.f3452g.put(Integer.valueOf(i2), lVar2);
        return lVar2;
    }

    public boolean C() {
        return this.f3448c.isEnabled();
    }

    public boolean E() {
        return this.f3448c.isTouchExplorationEnabled();
    }

    public AccessibilityEvent H(int i2) {
        return AccessibilityEvent.obtain(i2);
    }

    public AccessibilityNodeInfo J(View view) {
        return AccessibilityNodeInfo.obtain(view);
    }

    public AccessibilityNodeInfo K(View view, int i2) {
        return AccessibilityNodeInfo.obtain(view, i2);
    }

    public boolean L(MotionEvent motionEvent) {
        return M(motionEvent, false);
    }

    public boolean M(MotionEvent motionEvent, boolean z2) {
        if (!this.f3448c.isTouchExplorationEnabled() || this.f3452g.isEmpty()) {
            return false;
        }
        l y02 = A().y0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z2);
        if (y02 != null && y02.f3546i != -1) {
            if (z2) {
                return false;
            }
            return this.f3449d.onAccessibilityHoverEvent(y02.f3538b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            B(motionEvent.getX(), motionEvent.getY(), z2);
        } else {
            if (motionEvent.getAction() != 10) {
                n0.b.a("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            N();
        }
        return true;
    }

    public void S() {
        this.f3466u = true;
        this.f3450e.d();
        a0(null);
        this.f3448c.removeAccessibilityStateChangeListener(this.f3468w);
        this.f3448c.removeTouchExplorationStateChangeListener(this.f3469x);
        this.f3451f.unregisterContentObserver(this.f3470y);
        this.f3447b.g(null);
    }

    public void T(int i2, int i3) {
        if (this.f3448c.isEnabled()) {
            U(I(i2, i3));
        }
    }

    public void a0(k kVar) {
        this.f3464s = kVar;
    }

    void c0(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            h y2 = y(byteBuffer.getInt());
            y2.f3510c = byteBuffer.getInt();
            int i2 = byteBuffer.getInt();
            String str = null;
            y2.f3511d = i2 == -1 ? null : strArr[i2];
            int i3 = byteBuffer.getInt();
            if (i3 != -1) {
                str = strArr[i3];
            }
            y2.f3512e = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x046f  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        String str;
        AccessibilityNodeInfo.CollectionInfo obtain;
        String str2;
        int i3;
        boolean z2 = true;
        Y(true);
        if (i2 >= 65536) {
            return this.f3449d.createAccessibilityNodeInfo(i2);
        }
        if (i2 == -1) {
            AccessibilityNodeInfo J = J(this.f3446a);
            this.f3446a.onInitializeAccessibilityNodeInfo(J);
            if (this.f3452g.containsKey(0)) {
                J.addChild(this.f3446a, 0);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                J.setImportantForAccessibility(false);
            }
            return J;
        }
        l lVar = this.f3452g.get(Integer.valueOf(i2));
        if (lVar == null) {
            return null;
        }
        if (lVar.f3546i != -1 && this.f3450e.b(lVar.f3546i)) {
            View c3 = this.f3450e.c(lVar.f3546i);
            if (c3 == null) {
                return null;
            }
            return this.f3449d.getRootNode(c3, lVar.f3538b, lVar.m0());
        }
        AccessibilityNodeInfo K = K(this.f3446a, i2);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 24) {
            K.setImportantForAccessibility(D(lVar));
        }
        K.setViewIdResourceName("");
        if (lVar.f3552o != null) {
            K.setViewIdResourceName(lVar.f3552o);
        }
        K.setPackageName(this.f3446a.getContext().getPackageName());
        K.setClassName("android.view.View");
        K.setSource(this.f3446a, i2);
        K.setFocusable(lVar.z0());
        l lVar2 = this.f3458m;
        if (lVar2 != null) {
            K.setFocused(lVar2.f3538b == i2);
        }
        l lVar3 = this.f3454i;
        if (lVar3 != null) {
            K.setAccessibilityFocused(lVar3.f3538b == i2);
        }
        i iVar = i.IS_TEXT_FIELD;
        if (lVar.x0(iVar)) {
            K.setPassword(lVar.x0(i.IS_OBSCURED));
            if (!lVar.x0(i.IS_READ_ONLY)) {
                K.setClassName("android.widget.EditText");
            }
            K.setEditable(!lVar.x0(r9));
            if (lVar.f3544g != -1 && lVar.f3545h != -1) {
                K.setTextSelection(lVar.f3544g, lVar.f3545h);
            }
            l lVar4 = this.f3454i;
            if (lVar4 != null && lVar4.f3538b == i2) {
                K.setLiveRegion(1);
            }
            if (lVar.w0(g.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                K.addAction(256);
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (lVar.w0(g.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                K.addAction(512);
                i3 |= 1;
            }
            if (lVar.w0(g.MOVE_CURSOR_FORWARD_BY_WORD)) {
                K.addAction(256);
                i3 |= 2;
            }
            if (lVar.w0(g.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                K.addAction(512);
                i3 |= 2;
            }
            K.setMovementGranularities(i3);
            if (lVar.f3542e >= 0) {
                int length = lVar.f3555r == null ? 0 : lVar.f3555r.length();
                int unused = lVar.f3543f;
                int unused2 = lVar.f3542e;
                K.setMaxTextLength((length - lVar.f3543f) + lVar.f3542e);
            }
        }
        if (lVar.w0(g.SET_SELECTION)) {
            K.addAction(131072);
        }
        if (lVar.w0(g.COPY)) {
            K.addAction(16384);
        }
        if (lVar.w0(g.CUT)) {
            K.addAction(65536);
        }
        if (lVar.w0(g.PASTE)) {
            K.addAction(32768);
        }
        if (lVar.w0(g.SET_TEXT)) {
            K.addAction(2097152);
        }
        if (lVar.x0(i.IS_BUTTON) || lVar.x0(i.IS_LINK)) {
            K.setClassName("android.widget.Button");
        }
        if (lVar.x0(i.IS_IMAGE)) {
            K.setClassName("android.widget.ImageView");
        }
        if (lVar.w0(g.DISMISS)) {
            K.setDismissable(true);
            K.addAction(1048576);
        }
        if (lVar.R != null) {
            K.setParent(this.f3446a, lVar.R.f3538b);
        } else {
            K.setParent(this.f3446a);
        }
        if (lVar.A != -1) {
            K.setTraversalAfter(this.f3446a, lVar.A);
        }
        Rect m02 = lVar.m0();
        if (lVar.R != null) {
            Rect m03 = lVar.R.m0();
            Rect rect = new Rect(m02);
            rect.offset(-m03.left, -m03.top);
            K.setBoundsInParent(rect);
        } else {
            K.setBoundsInParent(m02);
        }
        K.setBoundsInScreen(x(m02));
        K.setVisibleToUser(true);
        K.setEnabled(!lVar.x0(i.HAS_ENABLED_STATE) || lVar.x0(i.IS_ENABLED));
        if (lVar.w0(g.TAP)) {
            if (lVar.V != null) {
                K.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, lVar.V.f3512e));
            } else {
                K.addAction(16);
            }
            K.setClickable(true);
        }
        if (lVar.w0(g.LONG_PRESS)) {
            if (lVar.W != null) {
                K.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, lVar.W.f3512e));
            } else {
                K.addAction(32);
            }
            K.setLongClickable(true);
        }
        g gVar = g.SCROLL_LEFT;
        if (lVar.w0(gVar) || lVar.w0(g.SCROLL_UP) || lVar.w0(g.SCROLL_RIGHT) || lVar.w0(g.SCROLL_DOWN)) {
            K.setScrollable(true);
            if (lVar.x0(i.HAS_IMPLICIT_SCROLLING)) {
                if (lVar.w0(gVar) || lVar.w0(g.SCROLL_RIGHT)) {
                    if (b0(lVar)) {
                        obtain = AccessibilityNodeInfo.CollectionInfo.obtain(0, lVar.f3547j, false);
                        K.setCollectionInfo(obtain);
                    } else {
                        str = "android.widget.HorizontalScrollView";
                        K.setClassName(str);
                    }
                } else if (b0(lVar)) {
                    obtain = AccessibilityNodeInfo.CollectionInfo.obtain(lVar.f3547j, 0, false);
                    K.setCollectionInfo(obtain);
                } else {
                    str = "android.widget.ScrollView";
                    K.setClassName(str);
                }
            }
            if (lVar.w0(gVar) || lVar.w0(g.SCROLL_UP)) {
                K.addAction(4096);
            }
            if (lVar.w0(g.SCROLL_RIGHT) || lVar.w0(g.SCROLL_DOWN)) {
                K.addAction(8192);
            }
        }
        g gVar2 = g.INCREASE;
        if (lVar.w0(gVar2) || lVar.w0(g.DECREASE)) {
            K.setClassName("android.widget.SeekBar");
            if (lVar.w0(gVar2)) {
                K.addAction(4096);
            }
            if (lVar.w0(g.DECREASE)) {
                K.addAction(8192);
            }
        }
        if (lVar.x0(i.IS_LIVE_REGION)) {
            K.setLiveRegion(1);
        }
        if (lVar.x0(iVar)) {
            K.setText(lVar.s0());
            if (i4 >= 28) {
                K.setHintText(lVar.r0());
            }
        } else if (!lVar.x0(i.SCOPES_ROUTE)) {
            CharSequence t02 = lVar.t0();
            if (i4 < 28 && lVar.f3563z != null) {
                t02 = ((Object) (t02 != null ? t02 : "")) + "\n" + lVar.f3563z;
            }
            if (t02 != null) {
                K.setContentDescription(t02);
            }
        }
        if (i4 >= 28 && lVar.f3563z != null) {
            K.setTooltipText(lVar.f3563z);
        }
        boolean x02 = lVar.x0(i.HAS_CHECKED_STATE);
        boolean x03 = lVar.x0(i.HAS_TOGGLED_STATE);
        if (!x02 && !x03) {
            z2 = false;
        }
        K.setCheckable(z2);
        if (!x02) {
            if (x03) {
                K.setChecked(lVar.x0(i.IS_TOGGLED));
                str2 = "android.widget.Switch";
            }
            K.setSelected(lVar.x0(i.IS_SELECTED));
            if (i4 >= 28) {
                K.setHeading(lVar.x0(i.IS_HEADER));
            }
            l lVar5 = this.f3454i;
            K.addAction((lVar5 == null && lVar5.f3538b == i2) ? 128 : 64);
            if (lVar.U != null) {
                for (h hVar : lVar.U) {
                    K.addAction(new AccessibilityNodeInfo.AccessibilityAction(hVar.f3508a, hVar.f3511d));
                }
            }
            for (l lVar6 : lVar.S) {
                if (!lVar6.x0(i.IS_HIDDEN)) {
                    if (lVar6.f3546i != -1) {
                        View c4 = this.f3450e.c(lVar6.f3546i);
                        if (!this.f3450e.b(lVar6.f3546i)) {
                            K.addChild(c4);
                        }
                    }
                    K.addChild(this.f3446a, lVar6.f3538b);
                }
            }
            return K;
        }
        K.setChecked(lVar.x0(i.IS_CHECKED));
        str2 = lVar.x0(i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP) ? "android.widget.RadioButton" : "android.widget.CheckBox";
        K.setClassName(str2);
        K.setSelected(lVar.x0(i.IS_SELECTED));
        if (i4 >= 28) {
        }
        l lVar52 = this.f3454i;
        K.addAction((lVar52 == null && lVar52.f3538b == i2) ? 128 : 64);
        if (lVar.U != null) {
        }
        while (r14.hasNext()) {
        }
        return K;
    }

    void d0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        l lVar;
        l lVar2;
        float f2;
        float f3;
        WindowInsets rootWindowInsets;
        View c3;
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            l z2 = z(byteBuffer.getInt());
            z2.F0(byteBuffer, strArr, byteBufferArr);
            if (!z2.x0(i.IS_HIDDEN)) {
                if (z2.x0(i.IS_FOCUSED)) {
                    this.f3458m = z2;
                }
                if (z2.C) {
                    arrayList.add(z2);
                }
                if (z2.f3546i != -1 && !this.f3450e.b(z2.f3546i) && (c3 = this.f3450e.c(z2.f3546i)) != null) {
                    c3.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        l A2 = A();
        ArrayList<l> arrayList2 = new ArrayList();
        if (A2 != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            if ((Build.VERSION.SDK_INT >= 28 ? v() : true) && (rootWindowInsets = this.f3446a.getRootWindowInsets()) != null) {
                if (!this.f3463r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                    A2.Z = true;
                    A2.X = true;
                }
                this.f3463r = Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft());
                Matrix.translateM(fArr, 0, r4.intValue(), 0.0f, 0.0f);
            }
            A2.E0(fArr, hashSet, false);
            A2.g0(arrayList2);
        }
        l lVar3 = null;
        for (l lVar4 : arrayList2) {
            if (!this.f3461p.contains(Integer.valueOf(lVar4.f3538b))) {
                lVar3 = lVar4;
            }
        }
        if (lVar3 == null && arrayList2.size() > 0) {
            lVar3 = (l) arrayList2.get(arrayList2.size() - 1);
        }
        if (lVar3 != null && (lVar3.f3538b != this.f3462q || arrayList2.size() != this.f3461p.size())) {
            this.f3462q = lVar3.f3538b;
            O(lVar3);
        }
        this.f3461p.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f3461p.add(Integer.valueOf(((l) it.next()).f3538b));
        }
        Iterator<Map.Entry<Integer, l>> it2 = this.f3452g.entrySet().iterator();
        while (it2.hasNext()) {
            l value = it2.next().getValue();
            if (!hashSet.contains(value)) {
                e0(value);
                it2.remove();
            }
        }
        W(0);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            l lVar5 = (l) it3.next();
            if (lVar5.j0()) {
                AccessibilityEvent I = I(lVar5.f3538b, 4096);
                float f4 = lVar5.f3549l;
                float f5 = lVar5.f3550m;
                if (Float.isInfinite(lVar5.f3550m)) {
                    if (f4 > 70000.0f) {
                        f4 = 70000.0f;
                    }
                    f5 = 100000.0f;
                }
                if (Float.isInfinite(lVar5.f3551n)) {
                    f2 = f5 + 100000.0f;
                    if (f4 < -70000.0f) {
                        f4 = -70000.0f;
                    }
                    f3 = f4 + 100000.0f;
                } else {
                    f2 = f5 - lVar5.f3551n;
                    f3 = f4 - lVar5.f3551n;
                }
                if (lVar5.u0(g.SCROLL_UP) || lVar5.u0(g.SCROLL_DOWN)) {
                    I.setScrollY((int) f3);
                    I.setMaxScrollY((int) f2);
                } else if (lVar5.u0(g.SCROLL_LEFT) || lVar5.u0(g.SCROLL_RIGHT)) {
                    I.setScrollX((int) f3);
                    I.setMaxScrollX((int) f2);
                }
                if (lVar5.f3547j > 0) {
                    I.setItemCount(lVar5.f3547j);
                    I.setFromIndex(lVar5.f3548k);
                    Iterator it4 = lVar5.T.iterator();
                    int i2 = 0;
                    while (it4.hasNext()) {
                        if (!((l) it4.next()).x0(i.IS_HIDDEN)) {
                            i2++;
                        }
                    }
                    I.setToIndex((lVar5.f3548k + i2) - 1);
                }
                U(I);
            }
            if (lVar5.x0(i.IS_LIVE_REGION) && lVar5.i0()) {
                W(lVar5.f3538b);
            }
            l lVar6 = this.f3454i;
            if (lVar6 != null && lVar6.f3538b == lVar5.f3538b) {
                i iVar = i.IS_SELECTED;
                if (!lVar5.v0(iVar) && lVar5.x0(iVar)) {
                    AccessibilityEvent I2 = I(lVar5.f3538b, 4);
                    I2.getText().add(lVar5.f3553p);
                    U(I2);
                }
            }
            l lVar7 = this.f3458m;
            if (lVar7 != null && lVar7.f3538b == lVar5.f3538b && ((lVar2 = this.f3459n) == null || lVar2.f3538b != this.f3458m.f3538b)) {
                this.f3459n = this.f3458m;
                U(I(lVar5.f3538b, 8));
            } else if (this.f3458m == null) {
                this.f3459n = null;
            }
            l lVar8 = this.f3458m;
            if (lVar8 != null && lVar8.f3538b == lVar5.f3538b) {
                i iVar2 = i.IS_TEXT_FIELD;
                if (lVar5.v0(iVar2) && lVar5.x0(iVar2) && ((lVar = this.f3454i) == null || lVar.f3538b == this.f3458m.f3538b)) {
                    String str = lVar5.K != null ? lVar5.K : "";
                    String str2 = lVar5.f3555r != null ? lVar5.f3555r : "";
                    AccessibilityEvent u2 = u(lVar5.f3538b, str, str2);
                    if (u2 != null) {
                        U(u2);
                    }
                    if (lVar5.F != lVar5.f3544g || lVar5.G != lVar5.f3545h) {
                        AccessibilityEvent I3 = I(lVar5.f3538b, 8192);
                        I3.getText().add(str2);
                        I3.setFromIndex(lVar5.f3544g);
                        I3.setToIndex(lVar5.f3545h);
                        I3.setItemCount(str2.length());
                        U(I3);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0016, code lost:
    
        if (r2 != null) goto L14;
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AccessibilityNodeInfo findFocus(int i2) {
        l lVar;
        Integer num;
        int i3;
        if (i2 == 1) {
            lVar = this.f3458m;
            if (lVar == null) {
                num = this.f3456k;
            }
            i3 = lVar.f3538b;
            return createAccessibilityNodeInfo(i3);
        }
        if (i2 != 2) {
            return null;
        }
        lVar = this.f3454i;
        if (lVar == null) {
            num = this.f3455j;
            if (num == null) {
                return null;
            }
            i3 = num.intValue();
            return createAccessibilityNodeInfo(i3);
        }
        i3 = lVar.f3538b;
        return createAccessibilityNodeInfo(i3);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i2, int i3, Bundle bundle) {
        int i4;
        if (i2 >= 65536) {
            boolean performAction = this.f3449d.performAction(i2, i3, bundle);
            if (performAction && i3 == 128) {
                this.f3455j = null;
            }
            return performAction;
        }
        l lVar = this.f3452g.get(Integer.valueOf(i2));
        boolean z2 = false;
        if (lVar == null) {
            return false;
        }
        switch (i3) {
            case 16:
                this.f3447b.b(i2, g.TAP);
                return true;
            case androidx.constraintlayout.widget.k.U /* 32 */:
                this.f3447b.b(i2, g.LONG_PRESS);
                return true;
            case 64:
                if (this.f3454i == null) {
                    this.f3446a.invalidate();
                }
                this.f3454i = lVar;
                this.f3447b.b(i2, g.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap hashMap = new HashMap();
                hashMap.put("type", "didGainFocus");
                hashMap.put("nodeId", Integer.valueOf(lVar.f3538b));
                this.f3447b.f4509a.c(hashMap);
                T(i2, 32768);
                if (lVar.w0(g.INCREASE) || lVar.w0(g.DECREASE)) {
                    T(i2, 4);
                }
                return true;
            case 128:
                l lVar2 = this.f3454i;
                if (lVar2 != null && lVar2.f3538b == i2) {
                    this.f3454i = null;
                }
                Integer num = this.f3455j;
                if (num != null && num.intValue() == i2) {
                    this.f3455j = null;
                }
                this.f3447b.b(i2, g.DID_LOSE_ACCESSIBILITY_FOCUS);
                T(i2, 65536);
                return true;
            case 256:
                return P(lVar, i2, bundle, true);
            case 512:
                return P(lVar, i2, bundle, false);
            case 4096:
                g gVar = g.SCROLL_UP;
                if (!lVar.w0(gVar)) {
                    gVar = g.SCROLL_LEFT;
                    if (!lVar.w0(gVar)) {
                        gVar = g.INCREASE;
                        if (!lVar.w0(gVar)) {
                            return false;
                        }
                        lVar.f3555r = lVar.f3557t;
                        lVar.f3556s = lVar.f3558u;
                        T(i2, 4);
                    }
                }
                this.f3447b.b(i2, gVar);
                return true;
            case 8192:
                g gVar2 = g.SCROLL_DOWN;
                if (!lVar.w0(gVar2)) {
                    gVar2 = g.SCROLL_RIGHT;
                    if (!lVar.w0(gVar2)) {
                        gVar2 = g.DECREASE;
                        if (!lVar.w0(gVar2)) {
                            return false;
                        }
                        lVar.f3555r = lVar.f3559v;
                        lVar.f3556s = lVar.f3560w;
                        T(i2, 4);
                    }
                }
                this.f3447b.b(i2, gVar2);
                return true;
            case 16384:
                this.f3447b.b(i2, g.COPY);
                return true;
            case 32768:
                this.f3447b.b(i2, g.PASTE);
                return true;
            case 65536:
                this.f3447b.b(i2, g.CUT);
                return true;
            case 131072:
                HashMap hashMap2 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z2 = true;
                }
                if (z2) {
                    hashMap2.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    i4 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
                } else {
                    hashMap2.put("base", Integer.valueOf(lVar.f3545h));
                    i4 = lVar.f3545h;
                }
                hashMap2.put("extent", Integer.valueOf(i4));
                this.f3447b.c(i2, g.SET_SELECTION, hashMap2);
                l lVar3 = this.f3452g.get(Integer.valueOf(i2));
                lVar3.f3544g = ((Integer) hashMap2.get("base")).intValue();
                lVar3.f3545h = ((Integer) hashMap2.get("extent")).intValue();
                return true;
            case 1048576:
                this.f3447b.b(i2, g.DISMISS);
                return true;
            case 2097152:
                return Q(lVar, i2, bundle);
            case R.id.accessibilityActionShowOnScreen:
                this.f3447b.b(i2, g.SHOW_ON_SCREEN);
                return true;
            default:
                h hVar = this.f3453h.get(Integer.valueOf(i3 - B));
                if (hVar == null) {
                    return false;
                }
                this.f3447b.c(i2, g.CUSTOM_ACTION, Integer.valueOf(hVar.f3509b));
                return true;
        }
    }

    @SuppressLint({"SwitchIntDef"})
    public boolean w(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.f3449d.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.f3449d.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f3456k = recordFlutterId;
            this.f3458m = null;
            return true;
        }
        if (eventType == 128) {
            this.f3460o = null;
            return true;
        }
        if (eventType == 32768) {
            this.f3455j = recordFlutterId;
            this.f3454i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f3456k = null;
        this.f3455j = null;
        return true;
    }
}
