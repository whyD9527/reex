package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
class g0 {

    /* renamed from: l, reason: collision with root package name */
    private static final RectF f710l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f711m = new ConcurrentHashMap<>();

    /* renamed from: n, reason: collision with root package name */
    private static ConcurrentHashMap<String, Field> f712n = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private int f713a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f714b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f715c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f716d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f717e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    private int[] f718f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private boolean f719g = false;

    /* renamed from: h, reason: collision with root package name */
    private TextPaint f720h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f721i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f722j;

    /* renamed from: k, reason: collision with root package name */
    private final c f723k;

    private static class a extends c {
        a() {
        }

        @Override // androidx.appcompat.widget.g0.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) g0.n(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class b extends a {
        b() {
        }

        @Override // androidx.appcompat.widget.g0.a, androidx.appcompat.widget.g0.c
        void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.g0.c
        boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    private static class c {
        c() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        boolean b(TextView textView) {
            return ((Boolean) g0.n(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    g0(TextView textView) {
        this.f721i = textView;
        this.f722j = textView.getContext();
        this.f723k = Build.VERSION.SDK_INT >= 29 ? new b() : new a();
    }

    private void A(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f713a = 1;
        this.f716d = f2;
        this.f717e = f3;
        this.f715c = f4;
        this.f719g = false;
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f713a = 0;
        this.f716d = -1.0f;
        this.f717e = -1.0f;
        this.f715c = -1.0f;
        this.f718f = new int[0];
        this.f714b = false;
    }

    private StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f720h, i2);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f721i.getLineSpacingExtra(), this.f721i.getLineSpacingMultiplier()).setIncludePad(this.f721i.getIncludeFontPadding()).setBreakStrategy(this.f721i.getBreakStrategy()).setHyphenationFrequency(this.f721i.getHyphenationFrequency());
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i3);
        try {
            this.f723k.a(obtain, this.f721i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    private int f(RectF rectF) {
        int i2;
        int length = this.f718f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i3 = 0;
        int i4 = 1;
        int i5 = length - 1;
        while (true) {
            int i6 = i4;
            int i7 = i3;
            i3 = i6;
            while (i3 <= i5) {
                i2 = (i3 + i5) / 2;
                if (y(this.f718f[i2], rectF)) {
                    break;
                }
                i7 = i2 - 1;
                i5 = i7;
            }
            return this.f718f[i7];
            i4 = i2 + 1;
        }
    }

    private static Method l(String str) {
        try {
            Method method = f711m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f711m.put(str, method);
            }
            return method;
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e3);
            return null;
        }
    }

    static <T> T n(Object obj, String str, T t2) {
        try {
            return (T) l(str).invoke(obj, new Object[0]);
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e3);
            return t2;
        }
    }

    private void t(float f2) {
        if (f2 != this.f721i.getPaint().getTextSize()) {
            this.f721i.getPaint().setTextSize(f2);
            boolean isInLayout = this.f721i.isInLayout();
            if (this.f721i.getLayout() != null) {
                this.f714b = false;
                try {
                    Method l2 = l("nullLayouts");
                    if (l2 != null) {
                        l2.invoke(this.f721i, new Object[0]);
                    }
                } catch (Exception e3) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e3);
                }
                if (isInLayout) {
                    this.f721i.forceLayout();
                } else {
                    this.f721i.requestLayout();
                }
                this.f721i.invalidate();
            }
        }
    }

    private boolean v() {
        if (z() && this.f713a == 1) {
            if (!this.f719g || this.f718f.length == 0) {
                int floor = ((int) Math.floor((this.f717e - this.f716d) / this.f715c)) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round(this.f716d + (i2 * this.f715c));
                }
                this.f718f = b(iArr);
            }
            this.f714b = true;
        } else {
            this.f714b = false;
        }
        return this.f714b;
    }

    private void w(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = typedArray.getDimensionPixelSize(i2, -1);
            }
            this.f718f = b(iArr);
            x();
        }
    }

    private boolean x() {
        boolean z2 = this.f718f.length > 0;
        this.f719g = z2;
        if (z2) {
            this.f713a = 1;
            this.f716d = r0[0];
            this.f717e = r0[r1 - 1];
            this.f715c = -1.0f;
        }
        return z2;
    }

    private boolean y(int i2, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f721i.getText();
        TransformationMethod transformationMethod = this.f721i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f721i)) != null) {
            text = transformation;
        }
        int maxLines = this.f721i.getMaxLines();
        m(i2);
        StaticLayout d3 = d(text, (Layout.Alignment) n(this.f721i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (d3.getLineCount() <= maxLines && d3.getLineEnd(d3.getLineCount() - 1) == text.length())) && ((float) d3.getHeight()) <= rectF.bottom;
    }

    private boolean z() {
        return !(this.f721i instanceof k);
    }

    void a() {
        if (o()) {
            if (this.f714b) {
                if (this.f721i.getMeasuredHeight() <= 0 || this.f721i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f723k.b(this.f721i) ? 1048576 : (this.f721i.getMeasuredWidth() - this.f721i.getTotalPaddingLeft()) - this.f721i.getTotalPaddingRight();
                int height = (this.f721i.getHeight() - this.f721i.getCompoundPaddingBottom()) - this.f721i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f710l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float f2 = f(rectF);
                    if (f2 != this.f721i.getTextSize()) {
                        u(0, f2);
                    }
                }
            }
            this.f714b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        return e(charSequence, alignment, i2, i3);
    }

    int g() {
        return Math.round(this.f717e);
    }

    int h() {
        return Math.round(this.f716d);
    }

    int i() {
        return Math.round(this.f715c);
    }

    int[] j() {
        return this.f718f;
    }

    int k() {
        return this.f713a;
    }

    void m(int i2) {
        TextPaint textPaint = this.f720h;
        if (textPaint == null) {
            this.f720h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f720h.set(this.f721i.getPaint());
        this.f720h.setTextSize(i2);
    }

    boolean o() {
        return z() && this.f713a != 0;
    }

    void p(AttributeSet attributeSet, int i2) {
        int resourceId;
        Context context = this.f722j;
        int[] iArr = b.j.f2315i0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        TextView textView = this.f721i;
        androidx.core.view.f0.F(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i2, 0);
        int i3 = b.j.f2330n0;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.f713a = obtainStyledAttributes.getInt(i3, 0);
        }
        int i4 = b.j.f2327m0;
        float dimension = obtainStyledAttributes.hasValue(i4) ? obtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = b.j.f2321k0;
        float dimension2 = obtainStyledAttributes.hasValue(i5) ? obtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = b.j.f2318j0;
        float dimension3 = obtainStyledAttributes.hasValue(i6) ? obtainStyledAttributes.getDimension(i6, -1.0f) : -1.0f;
        int i7 = b.j.f2324l0;
        if (obtainStyledAttributes.hasValue(i7) && (resourceId = obtainStyledAttributes.getResourceId(i7, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            w(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!z()) {
            this.f713a = 0;
            return;
        }
        if (this.f713a == 1) {
            if (!this.f719g) {
                DisplayMetrics displayMetrics = this.f722j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                A(dimension2, dimension3, dimension);
            }
            v();
        }
    }

    void q(int i2, int i3, int i4, int i5) {
        if (z()) {
            DisplayMetrics displayMetrics = this.f722j.getResources().getDisplayMetrics();
            A(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (v()) {
                a();
            }
        }
    }

    void r(int[] iArr, int i2) {
        if (z()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f722j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                this.f718f = b(iArr2);
                if (!x()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f719g = false;
            }
            if (v()) {
                a();
            }
        }
    }

    void s(int i2) {
        if (z()) {
            if (i2 == 0) {
                c();
                return;
            }
            if (i2 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
            }
            DisplayMetrics displayMetrics = this.f722j.getResources().getDisplayMetrics();
            A(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (v()) {
                a();
            }
        }
    }

    void u(int i2, float f2) {
        Context context = this.f722j;
        t(TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
