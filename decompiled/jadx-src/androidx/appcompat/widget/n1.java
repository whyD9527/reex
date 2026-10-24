package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* loaded from: classes.dex */
class n1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f814a;

    /* renamed from: b, reason: collision with root package name */
    private final View f815b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f816c;

    /* renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f817d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f818e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f819f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f820g;

    n1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f817d = layoutParams;
        this.f818e = new Rect();
        this.f819f = new int[2];
        this.f820g = new int[2];
        this.f814a = context;
        View inflate = LayoutInflater.from(context).inflate(b.g.f2267s, (ViewGroup) null);
        this.f815b = inflate;
        this.f816c = (TextView) inflate.findViewById(b.f.f2241s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = b.i.f2281a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i2, int i3, boolean z2, WindowManager.LayoutParams layoutParams) {
        int height;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f814a.getResources().getDimensionPixelOffset(b.d.f2194j);
        if (view.getWidth() < dimensionPixelOffset) {
            i2 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f814a.getResources().getDimensionPixelOffset(b.d.f2193i);
            height = i3 + dimensionPixelOffset2;
            i4 = i3 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i4 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f814a.getResources().getDimensionPixelOffset(z2 ? b.d.f2196l : b.d.f2195k);
        View b3 = b(view);
        if (b3 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b3.getWindowVisibleDisplayFrame(this.f818e);
        Rect rect = this.f818e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f814a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f818e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b3.getLocationOnScreen(this.f820g);
        view.getLocationOnScreen(this.f819f);
        int[] iArr = this.f819f;
        int i5 = iArr[0];
        int[] iArr2 = this.f820g;
        int i6 = i5 - iArr2[0];
        iArr[0] = i6;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i6 + i2) - (b3.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f815b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f815b.getMeasuredHeight();
        int i7 = this.f819f[1];
        int i8 = ((i4 + i7) - dimensionPixelOffset3) - measuredHeight;
        int i9 = i7 + height + dimensionPixelOffset3;
        if (!z2 ? measuredHeight + i9 <= this.f818e.height() : i8 < 0) {
            layoutParams.y = i8;
        } else {
            layoutParams.y = i9;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f814a.getSystemService("window")).removeView(this.f815b);
        }
    }

    boolean d() {
        return this.f815b.getParent() != null;
    }

    void e(View view, int i2, int i3, boolean z2, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f816c.setText(charSequence);
        a(view, i2, i3, z2, this.f817d);
        ((WindowManager) this.f814a.getSystemService("window")).addView(this.f815b, this.f817d);
    }
}
