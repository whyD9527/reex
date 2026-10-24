package e2;

import android.content.Context;
import android.content.Intent;
import android.graphics.BlendMode;
import android.graphics.ColorFilter;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.SeekBar;
import java.util.HashMap;
import xyz.lhtls.mpv_client.MPVJniUtils;
import xyz.re.player.ex.MainActivity;
import xyz.re.player.ex.R;
import z0.k;

/* loaded from: classes.dex */
final class r0 implements View.OnTouchListener {

    /* renamed from: e, reason: collision with root package name */
    private final Context f2720e;

    /* renamed from: f, reason: collision with root package name */
    private final z0.k f2721f;

    /* renamed from: g, reason: collision with root package name */
    private final g1.e f2722g;

    /* renamed from: h, reason: collision with root package name */
    private long f2723h;

    /* renamed from: i, reason: collision with root package name */
    private final d f2724i;

    /* renamed from: j, reason: collision with root package name */
    private final c f2725j;

    /* renamed from: k, reason: collision with root package name */
    private final b f2726k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f2727l;

    /* renamed from: m, reason: collision with root package name */
    private final a f2728m;

    /* renamed from: n, reason: collision with root package name */
    private final ScaleGestureDetector f2729n;

    /* renamed from: o, reason: collision with root package name */
    private final androidx.core.view.d f2730o;

    /* renamed from: p, reason: collision with root package name */
    private final WindowManager.LayoutParams f2731p;

    /* renamed from: q, reason: collision with root package name */
    private final View f2732q;

    /* renamed from: r, reason: collision with root package name */
    private final ImageButton f2733r;

    /* renamed from: s, reason: collision with root package name */
    private final ImageButton f2734s;

    /* renamed from: t, reason: collision with root package name */
    private final SeekBar f2735t;

    /* renamed from: u, reason: collision with root package name */
    private float f2736u;

    /* renamed from: v, reason: collision with root package name */
    private float f2737v;

    /* renamed from: w, reason: collision with root package name */
    private int f2738w;

    /* renamed from: x, reason: collision with root package name */
    private int f2739x;

    public static final class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e3) {
            kotlin.jvm.internal.k.e(e3, "e");
            r0.this.u();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent e3) {
            kotlin.jvm.internal.k.e(e3, "e");
            r0.this.f2727l = true;
            r0.this.B();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent e3) {
            kotlin.jvm.internal.k.e(e3, "e");
            r0 r0Var = r0.this;
            ImageButton imageButton = r0Var.f2734s;
            kotlin.jvm.internal.k.b(imageButton);
            r0Var.A(imageButton.getVisibility() == 8);
            return true;
        }
    }

    public static final class b implements ScaleGestureDetector.OnScaleGestureListener {
        b() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            kotlin.jvm.internal.k.e(detector, "detector");
            Point point = new Point();
            r0.this.p().getDefaultDisplay().getSize(point);
            int i2 = point.x;
            int i3 = point.y;
            float scaleFactor = detector.getScaleFactor();
            int width = (int) (r0.this.f2732q.getWidth() * scaleFactor);
            int height = (int) (r0.this.f2732q.getHeight() * scaleFactor);
            if (width > i2) {
                height = (height * i2) / width;
            } else {
                i2 = width;
            }
            if (height > i3) {
                i2 = (i2 * i3) / height;
            } else {
                i3 = height;
            }
            WindowManager p2 = r0.this.p();
            View view = r0.this.f2732q;
            WindowManager.LayoutParams layoutParams = r0.this.f2731p;
            layoutParams.width = i2;
            layoutParams.height = i3;
            g1.q qVar = g1.q.f2865a;
            p2.updateViewLayout(view, layoutParams);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector detector) {
            kotlin.jvm.internal.k.e(detector, "detector");
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector detector) {
            kotlin.jvm.internal.k.e(detector, "detector");
        }
    }

    public static final class c implements SeekBar.OnSeekBarChangeListener {
        c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
            kotlin.jvm.internal.k.e(seekBar, "seekBar");
            if (z2) {
                r0.this.n().c("onProgressChanged", Integer.valueOf(i2));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            kotlin.jvm.internal.k.e(seekBar, "seekBar");
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            kotlin.jvm.internal.k.e(seekBar, "seekBar");
        }
    }

    public static final class d implements SurfaceHolder.Callback {

        public static final class a implements k.d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ r0 f2744a;

            a(r0 r0Var) {
                this.f2744a = r0Var;
            }

            @Override // z0.k.d
            public void a(Object obj) {
                MPVJniUtils.f4484a.deleteGlobalNativePtr(this.f2744a.f2723h);
            }

            @Override // z0.k.d
            public void b() {
            }

            @Override // z0.k.d
            public void c(String errorCode, String str, Object obj) {
                kotlin.jvm.internal.k.e(errorCode, "errorCode");
            }
        }

        d() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder holder, int i2, int i3, int i4) {
            HashMap e3;
            kotlin.jvm.internal.k.e(holder, "holder");
            e3 = h1.a0.e(g1.n.a("width", Integer.valueOf(i3)), g1.n.a("height", Integer.valueOf(i4)));
            r0.this.n().c("onSurfaceChanged", e3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder holder) {
            kotlin.jvm.internal.k.e(holder, "holder");
            r0 r0Var = r0.this;
            MPVJniUtils mPVJniUtils = MPVJniUtils.f4484a;
            Surface surface = holder.getSurface();
            kotlin.jvm.internal.k.d(surface, "holder.surface");
            r0Var.f2723h = mPVJniUtils.newGlobalNativePtr(surface);
            r0.this.n().c("onSurfaceCreated", Long.valueOf(r0.this.f2723h));
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder holder) {
            kotlin.jvm.internal.k.e(holder, "holder");
            r0.this.n().d("onSurfaceDestroyed", null, new a(r0.this));
        }
    }

    static final class e extends kotlin.jvm.internal.l implements q1.a<WindowManager> {
        e() {
            super(0);
        }

        @Override // q1.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WindowManager invoke() {
            Object systemService = r0.this.o().getSystemService("window");
            kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            return (WindowManager) systemService;
        }
    }

    public r0(Context context, z0.k channel) {
        g1.e a3;
        kotlin.jvm.internal.k.e(context, "context");
        kotlin.jvm.internal.k.e(channel, "channel");
        this.f2720e = context;
        this.f2721f = channel;
        a3 = g1.g.a(new e());
        this.f2722g = a3;
        this.f2724i = new d();
        this.f2725j = new c();
        b bVar = new b();
        this.f2726k = bVar;
        a aVar = new a();
        this.f2728m = aVar;
        this.f2729n = new ScaleGestureDetector(context, bVar);
        this.f2730o = new androidx.core.view.d(context, aVar);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        layoutParams.flags = 8;
        layoutParams.format = -1;
        layoutParams.gravity = 8388693;
        this.f2731p = layoutParams;
        View inflate = View.inflate(context, R.layout.video_popup_view, null);
        kotlin.jvm.internal.k.d(inflate, "inflate(context, R.layout.video_popup_view, null)");
        this.f2732q = inflate;
        this.f2733r = (ImageButton) inflate.findViewById(R.id.close_button);
        this.f2734s = (ImageButton) inflate.findViewById(R.id.back_button);
        this.f2735t = (SeekBar) inflate.findViewById(R.id.video_popup_seek_bar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(boolean z2) {
        int i2 = z2 ? 0 : 8;
        this.f2733r.setVisibility(i2);
        this.f2734s.setVisibility(i2);
        this.f2735t.setVisibility(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        this.f2721f.c("onUpPlaybackSpeed", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowManager p() {
        return (WindowManager) this.f2722g.getValue();
    }

    private final void q(View view) {
        String str;
        int id = view.getId();
        if (id == R.id.back_button) {
            p().removeView(this.f2732q);
            Intent intent = new Intent(this.f2720e, (Class<?>) MainActivity.class);
            intent.addFlags(268435456);
            this.f2720e.startActivity(intent);
            str = "onViewBack";
        } else if (id != R.id.close_button) {
            str = null;
        } else {
            p().removeView(this.f2732q);
            str = "onViewClose";
        }
        if (str != null) {
            this.f2721f.c(str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(r0 this$0, View it) {
        kotlin.jvm.internal.k.e(this$0, "this$0");
        kotlin.jvm.internal.k.d(it, "it");
        this$0.q(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(r0 this$0, View it) {
        kotlin.jvm.internal.k.e(this$0, "this$0");
        kotlin.jvm.internal.k.d(it, "it");
        this$0.q(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        this.f2721f.c("onPlayPause", null);
    }

    private final void v() {
        if (this.f2732q.getWindowVisibility() != 8) {
            p().removeView(this.f2732q);
        }
    }

    private final void w() {
        this.f2721f.c("onResetPlaybackSpeed", null);
    }

    public final void m() {
        v();
    }

    public final z0.k n() {
        return this.f2721f;
    }

    public final Context o() {
        return this.f2720e;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v2, MotionEvent event) {
        kotlin.jvm.internal.k.e(v2, "v");
        kotlin.jvm.internal.k.e(event, "event");
        this.f2729n.onTouchEvent(event);
        this.f2730o.a(event);
        int action = event.getAction();
        if (action == 0) {
            WindowManager.LayoutParams layoutParams = this.f2731p;
            this.f2738w = layoutParams.x;
            this.f2739x = layoutParams.y;
            this.f2736u = event.getRawX();
            this.f2737v = event.getRawY();
        } else if (action != 1) {
            if (action != 2) {
                return false;
            }
            if (!this.f2729n.isInProgress()) {
                float rawX = event.getRawX() - this.f2736u;
                float rawY = event.getRawY() - this.f2737v;
                WindowManager p2 = p();
                View view = this.f2732q;
                WindowManager.LayoutParams layoutParams2 = this.f2731p;
                layoutParams2.x = this.f2738w - ((int) rawX);
                layoutParams2.y = this.f2739x - ((int) rawY);
                g1.q qVar = g1.q.f2865a;
                p2.updateViewLayout(view, layoutParams2);
            }
        } else if (this.f2727l) {
            this.f2727l = false;
            w();
        }
        return true;
    }

    public final void r() {
        View view = this.f2732q;
        view.setOnTouchListener(this);
        ((SurfaceView) view.findViewById(R.id.video_popup_surface)).getHolder().addCallback(this.f2724i);
        this.f2733r.setOnClickListener(new View.OnClickListener() { // from class: e2.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                r0.s(r0.this, view2);
            }
        });
        this.f2734s.setOnClickListener(new View.OnClickListener() { // from class: e2.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                r0.t(r0.this, view2);
            }
        });
        this.f2735t.setOnSeekBarChangeListener(this.f2725j);
    }

    public final void x(double d3) {
        int width = this.f2732q.getWidth();
        int height = this.f2732q.getHeight();
        double d4 = width;
        double d5 = height;
        double d6 = d4 / d5;
        if (d6 == d3) {
            return;
        }
        WindowManager p2 = p();
        View view = this.f2732q;
        WindowManager.LayoutParams layoutParams = this.f2731p;
        if (d6 > 1.0d) {
            layoutParams.width = (int) (d5 * d3);
            layoutParams.height = height;
        } else {
            layoutParams.width = width;
            layoutParams.height = (int) (d4 / d3);
        }
        g1.q qVar = g1.q.f2865a;
        p2.updateViewLayout(view, layoutParams);
    }

    public final void y(int i2, int i3) {
        this.f2735t.setProgress(i2);
        this.f2735t.setMax(i3);
    }

    public final void z(double d3, int i2, int i3, final int i4, final int i5) {
        SeekBar seekBar = this.f2735t;
        kotlin.jvm.internal.k.b(seekBar);
        seekBar.setMax(i3);
        seekBar.setProgress(i2);
        if (Build.VERSION.SDK_INT >= 30) {
            Drawable thumb = seekBar.getThumb();
            final BlendMode blendMode = BlendMode.SRC_ATOP;
            thumb.setColorFilter(new ColorFilter(i4, blendMode) { // from class: android.graphics.BlendModeColorFilter
                static {
                    throw new NoClassDefFoundError();
                }
            });
            Drawable progressDrawable = seekBar.getProgressDrawable();
            final BlendMode blendMode2 = BlendMode.SRC_ATOP;
            progressDrawable.setColorFilter(new ColorFilter(i5, blendMode2) { // from class: android.graphics.BlendModeColorFilter
                static {
                    throw new NoClassDefFoundError();
                }
            });
        } else {
            seekBar.getThumb().setColorFilter(i4, PorterDuff.Mode.SRC_ATOP);
            seekBar.getProgressDrawable().setColorFilter(i5, PorterDuff.Mode.SRC_ATOP);
        }
        Point point = new Point();
        p().getDefaultDisplay().getSize(point);
        int i6 = point.x;
        int i7 = point.y;
        WindowManager p2 = p();
        View view = this.f2732q;
        WindowManager.LayoutParams layoutParams = this.f2731p;
        if (i6 > i7) {
            int i8 = (int) (i7 * 0.465d);
            layoutParams.height = i8;
            layoutParams.width = (int) (i8 * d3);
        } else {
            int i9 = (int) (i6 * 0.465d);
            layoutParams.width = i9;
            layoutParams.height = (int) (i9 / d3);
        }
        g1.q qVar = g1.q.f2865a;
        p2.addView(view, layoutParams);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.MAIN");
        intent.addFlags(268435456);
        intent.addCategory("android.intent.category.HOME");
        this.f2720e.startActivity(intent);
    }
}
