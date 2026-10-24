package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.a;

/* loaded from: classes.dex */
public class w extends Spinner {

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f902m = {R.attr.spinnerMode};

    /* renamed from: e, reason: collision with root package name */
    private final androidx.appcompat.widget.e f903e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f904f;

    /* renamed from: g, reason: collision with root package name */
    private p0 f905g;

    /* renamed from: h, reason: collision with root package name */
    private SpinnerAdapter f906h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f907i;

    /* renamed from: j, reason: collision with root package name */
    private g f908j;

    /* renamed from: k, reason: collision with root package name */
    int f909k;

    /* renamed from: l, reason: collision with root package name */
    final Rect f910l;

    class a extends p0 {

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ e f911n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.f911n = eVar;
        }

        @Override // androidx.appcompat.widget.p0
        public h.e b() {
            return this.f911n;
        }

        @Override // androidx.appcompat.widget.p0
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (w.this.getInternalPopup().c()) {
                return true;
            }
            w.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!w.this.getInternalPopup().c()) {
                w.this.b();
            }
            ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    class c implements g, DialogInterface.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        androidx.appcompat.app.a f914e;

        /* renamed from: f, reason: collision with root package name */
        private ListAdapter f915f;

        /* renamed from: g, reason: collision with root package name */
        private CharSequence f916g;

        c() {
        }

        @Override // androidx.appcompat.widget.w.g
        public boolean c() {
            androidx.appcompat.app.a aVar = this.f914e;
            if (aVar != null) {
                return aVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.w.g
        public int d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.w.g
        public void dismiss() {
            androidx.appcompat.app.a aVar = this.f914e;
            if (aVar != null) {
                aVar.dismiss();
                this.f914e = null;
            }
        }

        @Override // androidx.appcompat.widget.w.g
        public Drawable f() {
            return null;
        }

        @Override // androidx.appcompat.widget.w.g
        public void h(CharSequence charSequence) {
            this.f916g = charSequence;
        }

        @Override // androidx.appcompat.widget.w.g
        public void i(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.g
        public void j(int i2) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.g
        public void k(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.g
        public void l(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.g
        public void m(int i2, int i3) {
            if (this.f915f == null) {
                return;
            }
            a.C0010a c0010a = new a.C0010a(w.this.getPopupContext());
            CharSequence charSequence = this.f916g;
            if (charSequence != null) {
                c0010a.h(charSequence);
            }
            androidx.appcompat.app.a a3 = c0010a.g(this.f915f, w.this.getSelectedItemPosition(), this).a();
            this.f914e = a3;
            ListView h2 = a3.h();
            h2.setTextDirection(i2);
            h2.setTextAlignment(i3);
            this.f914e.show();
        }

        @Override // androidx.appcompat.widget.w.g
        public int n() {
            return 0;
        }

        @Override // androidx.appcompat.widget.w.g
        public CharSequence o() {
            return this.f916g;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            w.this.setSelection(i2);
            if (w.this.getOnItemClickListener() != null) {
                w.this.performItemClick(null, i2, this.f915f.getItemId(i2));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.w.g
        public void p(ListAdapter listAdapter) {
            this.f915f = listAdapter;
        }
    }

    private static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: e, reason: collision with root package name */
        private SpinnerAdapter f918e;

        /* renamed from: f, reason: collision with root package name */
        private ListAdapter f919f;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f918e = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f919f = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof e1) {
                    e1 e1Var = (e1) spinnerAdapter;
                    if (e1Var.getDropDownViewTheme() == null) {
                        e1Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f919f;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f918e;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f918e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.f918e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.f918e;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i2);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i2) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            return getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f918e;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f919f;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f918e;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f918e;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class e extends u0 implements g {
        private CharSequence N;
        ListAdapter O;
        private final Rect P;
        private int Q;

        class a implements AdapterView.OnItemClickListener {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ w f920e;

            a(w wVar) {
                this.f920e = wVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                w.this.setSelection(i2);
                if (w.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    w.this.performItemClick(view, i2, eVar.O.getItemId(i2));
                }
                e.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.Q(w.this)) {
                    e.this.dismiss();
                } else {
                    e.this.O();
                    e.super.a();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f923e;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f923e = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f923e);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.P = new Rect();
            z(w.this);
            F(true);
            K(0);
            H(new a(w.this));
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void O() {
            int i2;
            Drawable f2 = f();
            int i3 = 0;
            if (f2 != null) {
                f2.getPadding(w.this.f910l);
                i3 = p1.b(w.this) ? w.this.f910l.right : -w.this.f910l.left;
            } else {
                Rect rect = w.this.f910l;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = w.this.getPaddingLeft();
            int paddingRight = w.this.getPaddingRight();
            int width = w.this.getWidth();
            w wVar = w.this;
            int i4 = wVar.f909k;
            if (i4 == -2) {
                int a3 = wVar.a((SpinnerAdapter) this.O, f());
                int i5 = w.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = w.this.f910l;
                int i6 = (i5 - rect2.left) - rect2.right;
                if (a3 > i6) {
                    a3 = i6;
                }
                i2 = Math.max(a3, (width - paddingLeft) - paddingRight);
            } else {
                if (i4 != -1) {
                    B(i4);
                    l(!p1.b(w.this) ? i3 + (((width - paddingRight) - v()) - P()) : i3 + paddingLeft + P());
                }
                i2 = (width - paddingLeft) - paddingRight;
            }
            B(i2);
            l(!p1.b(w.this) ? i3 + (((width - paddingRight) - v()) - P()) : i3 + paddingLeft + P());
        }

        public int P() {
            return this.Q;
        }

        boolean Q(View view) {
            return androidx.core.view.f0.v(view) && view.getGlobalVisibleRect(this.P);
        }

        @Override // androidx.appcompat.widget.w.g
        public void h(CharSequence charSequence) {
            this.N = charSequence;
        }

        @Override // androidx.appcompat.widget.w.g
        public void k(int i2) {
            this.Q = i2;
        }

        @Override // androidx.appcompat.widget.w.g
        public void m(int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            boolean c3 = c();
            O();
            E(2);
            super.a();
            ListView g2 = g();
            g2.setChoiceMode(1);
            g2.setTextDirection(i2);
            g2.setTextAlignment(i3);
            L(w.this.getSelectedItemPosition());
            if (c3 || (viewTreeObserver = w.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            G(new c(bVar));
        }

        @Override // androidx.appcompat.widget.w.g
        public CharSequence o() {
            return this.N;
        }

        @Override // androidx.appcompat.widget.u0, androidx.appcompat.widget.w.g
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.O = listAdapter;
        }
    }

    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        boolean f925e;

        class a implements Parcelable.Creator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i2) {
                return new f[i2];
            }
        }

        f(Parcel parcel) {
            super(parcel);
            this.f925e = parcel.readByte() != 0;
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f925e ? (byte) 1 : (byte) 0);
        }
    }

    interface g {
        boolean c();

        int d();

        void dismiss();

        Drawable f();

        void h(CharSequence charSequence);

        void i(Drawable drawable);

        void j(int i2);

        void k(int i2);

        void l(int i2);

        void m(int i2, int i3);

        int n();

        CharSequence o();

        void p(ListAdapter listAdapter);
    }

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.I);
    }

    public w(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public w(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        if (r11 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w(Context context, AttributeSet attributeSet, int i2, int i3, Resources.Theme theme) {
        super(context, attributeSet, i2);
        g.d dVar;
        ?? r11;
        TypedArray typedArray;
        TypedArray typedArray2;
        CharSequence[] p2;
        SpinnerAdapter spinnerAdapter;
        this.f910l = new Rect();
        d1.a(this, getContext());
        i1 u2 = i1.u(context, attributeSet, b.j.A2, i2, 0);
        this.f903e = new androidx.appcompat.widget.e(this);
        try {
            if (theme != null) {
                dVar = new g.d(context, theme);
            } else {
                int m2 = u2.m(b.j.F2, 0);
                if (m2 == 0) {
                    this.f904f = context;
                    r11 = -1;
                    typedArray = null;
                    if (i3 == -1) {
                        try {
                            typedArray2 = context.obtainStyledAttributes(attributeSet, f902m, i2, 0);
                            try {
                                boolean hasValue = typedArray2.hasValue(0);
                                r11 = typedArray2;
                                if (hasValue) {
                                    i3 = typedArray2.getInt(0, 0);
                                    r11 = typedArray2;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                                r11 = typedArray2;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            typedArray2 = null;
                        } catch (Throwable th) {
                            th = th;
                            if (typedArray != null) {
                                typedArray.recycle();
                            }
                            throw th;
                        }
                        r11.recycle();
                    }
                    if (i3 != 0) {
                        c cVar = new c();
                        this.f908j = cVar;
                        cVar.h(u2.n(b.j.D2));
                    } else if (i3 == 1) {
                        e eVar = new e(this.f904f, attributeSet, i2);
                        i1 u3 = i1.u(this.f904f, attributeSet, b.j.A2, i2, 0);
                        this.f909k = u3.l(b.j.E2, -2);
                        eVar.i(u3.f(b.j.C2));
                        eVar.h(u2.n(b.j.D2));
                        u3.v();
                        this.f908j = eVar;
                        this.f905g = new a(this, eVar);
                    }
                    p2 = u2.p(b.j.B2);
                    if (p2 != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, p2);
                        arrayAdapter.setDropDownViewResource(b.g.f2268t);
                        setAdapter(arrayAdapter);
                    }
                    u2.v();
                    this.f907i = true;
                    spinnerAdapter = this.f906h;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f906h = null;
                    }
                    this.f903e.e(attributeSet, i2);
                    return;
                }
                dVar = new g.d(context, m2);
            }
            if (i3 == -1) {
            }
            if (i3 != 0) {
            }
            p2 = u2.p(b.j.B2);
            if (p2 != null) {
            }
            u2.v();
            this.f907i = true;
            spinnerAdapter = this.f906h;
            if (spinnerAdapter != null) {
            }
            this.f903e.e(attributeSet, i2);
            return;
        } catch (Throwable th2) {
            th = th2;
            typedArray = r11;
        }
        this.f904f = dVar;
        r11 = -1;
        typedArray = null;
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        drawable.getPadding(this.f910l);
        Rect rect = this.f910l;
        return i3 + rect.left + rect.right;
    }

    void b() {
        this.f908j.m(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f903e;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f908j;
        return gVar != null ? gVar.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f908j;
        return gVar != null ? gVar.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f908j != null ? this.f909k : super.getDropDownWidth();
    }

    final g getInternalPopup() {
        return this.f908j;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f908j;
        return gVar != null ? gVar.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f904f;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f908j;
        return gVar != null ? gVar.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f903e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f903e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f908j;
        if (gVar == null || !gVar.c()) {
            return;
        }
        this.f908j.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f908j == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.f925e || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f908j;
        fVar.f925e = gVar != null && gVar.c();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        p0 p0Var = this.f905g;
        if (p0Var == null || !p0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.f908j;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.c()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f907i) {
            this.f906h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f908j != null) {
            Context context = this.f904f;
            if (context == null) {
                context = getContext();
            }
            this.f908j.p(new d(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f903e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        androidx.appcompat.widget.e eVar = this.f903e;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        g gVar = this.f908j;
        if (gVar == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            gVar.k(i2);
            this.f908j.l(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        g gVar = this.f908j;
        if (gVar != null) {
            gVar.j(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f908j != null) {
            this.f909k = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f908j;
        if (gVar != null) {
            gVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(d.a.b(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f908j;
        if (gVar != null) {
            gVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f903e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f903e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }
}
