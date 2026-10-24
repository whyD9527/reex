package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends q0 implements g.c {

    /* renamed from: u0, reason: collision with root package name */
    static final n f495u0;
    final ImageView A;
    private final View B;
    private p C;
    private Rect D;
    private Rect E;
    private int[] F;
    private int[] G;
    private final ImageView H;
    private final Drawable I;
    private final int J;
    private final int K;
    private final Intent L;
    private final Intent M;
    private final CharSequence N;
    private l O;
    private k P;
    View.OnFocusChangeListener Q;
    private m R;
    private View.OnClickListener S;
    private boolean T;
    private boolean U;
    y.a V;
    private boolean W;

    /* renamed from: a0, reason: collision with root package name */
    private CharSequence f496a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f497b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f498c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f499d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f500e0;

    /* renamed from: f0, reason: collision with root package name */
    private CharSequence f501f0;

    /* renamed from: g0, reason: collision with root package name */
    private CharSequence f502g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f503h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f504i0;

    /* renamed from: j0, reason: collision with root package name */
    SearchableInfo f505j0;

    /* renamed from: k0, reason: collision with root package name */
    private Bundle f506k0;

    /* renamed from: l0, reason: collision with root package name */
    private final Runnable f507l0;

    /* renamed from: m0, reason: collision with root package name */
    private Runnable f508m0;

    /* renamed from: n0, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f509n0;

    /* renamed from: o0, reason: collision with root package name */
    private final View.OnClickListener f510o0;

    /* renamed from: p0, reason: collision with root package name */
    View.OnKeyListener f511p0;

    /* renamed from: q0, reason: collision with root package name */
    private final TextView.OnEditorActionListener f512q0;

    /* renamed from: r0, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f513r0;

    /* renamed from: s0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f514s0;

    /* renamed from: t, reason: collision with root package name */
    final SearchAutoComplete f515t;

    /* renamed from: t0, reason: collision with root package name */
    private TextWatcher f516t0;

    /* renamed from: u, reason: collision with root package name */
    private final View f517u;

    /* renamed from: v, reason: collision with root package name */
    private final View f518v;

    /* renamed from: w, reason: collision with root package name */
    private final View f519w;

    /* renamed from: x, reason: collision with root package name */
    final ImageView f520x;

    /* renamed from: y, reason: collision with root package name */
    final ImageView f521y;

    /* renamed from: z, reason: collision with root package name */
    final ImageView f522z;

    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* renamed from: h, reason: collision with root package name */
        private int f523h;

        /* renamed from: i, reason: collision with root package name */
        private SearchView f524i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f525j;

        /* renamed from: k, reason: collision with root package name */
        final Runnable f526k;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, b.a.f2165p);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.f526k = new a();
            this.f523h = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        void a() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f495u0.c(this);
                return;
            }
            setInputMethodMode(1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void c() {
            if (this.f525j) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f525j = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f523h <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f525j) {
                removeCallbacks(this.f526k);
                post(this.f526k);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z2, int i2, Rect rect) {
            super.onFocusChanged(z2, i2, rect);
            this.f524i.V();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f524i.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z2) {
            super.onWindowFocusChanged(z2);
            if (z2 && this.f524i.hasFocus() && getVisibility() == 0) {
                this.f525j = true;
                if (SearchView.I(getContext())) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z2) {
                this.f525j = false;
                removeCallbacks(this.f526k);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f525j = true;
                    return;
                }
                this.f525j = false;
                removeCallbacks(this.f526k);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f524i = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f523h = i2;
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            SearchView.this.U(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.b0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.a aVar = SearchView.this.V;
            if (aVar instanceof c1) {
                aVar.a(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z2) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.Q;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z2);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            SearchView.this.x();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f520x) {
                searchView.R();
                return;
            }
            if (view == searchView.f522z) {
                searchView.N();
                return;
            }
            if (view == searchView.f521y) {
                searchView.S();
            } else if (view == searchView.A) {
                searchView.W();
            } else if (view == searchView.f515t) {
                searchView.D();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f505j0 == null) {
                return false;
            }
            if (searchView.f515t.isPopupShowing() && SearchView.this.f515t.getListSelection() != -1) {
                return SearchView.this.T(view, i2, keyEvent);
            }
            if (SearchView.this.f515t.b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.L(0, null, searchView2.f515t.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            SearchView.this.S();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.O(i2, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.P(i2);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
        boolean a();
    }

    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    public interface m {
        boolean a(int i2);

        boolean b(int i2);
    }

    private static class n {

        /* renamed from: a, reason: collision with root package name */
        private Method f538a;

        /* renamed from: b, reason: collision with root package name */
        private Method f539b;

        /* renamed from: c, reason: collision with root package name */
        private Method f540c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        n() {
            this.f538a = null;
            this.f539b = null;
            this.f540c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f538a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f539b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f540c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f539b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f538a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f540c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class o extends z.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        boolean f541g;

        class a implements Parcelable.ClassLoaderCreator<o> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public o[] newArray(int i2) {
                return new o[i2];
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f541g = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f541g + "}";
        }

        @Override // z.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeValue(Boolean.valueOf(this.f541g));
        }
    }

    private static class p extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        private final View f542a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f543b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f544c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f545d;

        /* renamed from: e, reason: collision with root package name */
        private final int f546e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f547f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f546e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f543b = new Rect();
            this.f545d = new Rect();
            this.f544c = new Rect();
            a(rect, rect2);
            this.f542a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f543b.set(rect);
            this.f545d.set(rect);
            Rect rect3 = this.f545d;
            int i2 = this.f546e;
            rect3.inset(-i2, -i2);
            this.f544c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z2;
            float f2;
            int i2;
            boolean z3;
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z4 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z3 = this.f547f;
                    if (z3 && !this.f545d.contains(x2, y2)) {
                        z4 = z3;
                        z2 = false;
                    }
                } else {
                    if (action == 3) {
                        z3 = this.f547f;
                        this.f547f = false;
                    }
                    z2 = true;
                    z4 = false;
                }
                z4 = z3;
                z2 = true;
            } else {
                if (this.f543b.contains(x2, y2)) {
                    this.f547f = true;
                    z2 = true;
                }
                z2 = true;
                z4 = false;
            }
            if (!z4) {
                return false;
            }
            if (!z2 || this.f544c.contains(x2, y2)) {
                Rect rect = this.f544c;
                f2 = x2 - rect.left;
                i2 = y2 - rect.top;
            } else {
                f2 = this.f542a.getWidth() / 2;
                i2 = this.f542a.getHeight() / 2;
            }
            motionEvent.setLocation(f2, i2);
            return this.f542a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f495u0 = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.G);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.D = new Rect();
        this.E = new Rect();
        this.F = new int[2];
        this.G = new int[2];
        this.f507l0 = new b();
        this.f508m0 = new c();
        this.f509n0 = new WeakHashMap<>();
        f fVar = new f();
        this.f510o0 = fVar;
        this.f511p0 = new g();
        h hVar = new h();
        this.f512q0 = hVar;
        i iVar = new i();
        this.f513r0 = iVar;
        j jVar = new j();
        this.f514s0 = jVar;
        this.f516t0 = new a();
        i1 u2 = i1.u(context, attributeSet, b.j.i2, i2, 0);
        LayoutInflater.from(context).inflate(u2.m(b.j.s2, b.g.f2266r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(b.f.D);
        this.f515t = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f517u = findViewById(b.f.f2248z);
        View findViewById = findViewById(b.f.C);
        this.f518v = findViewById;
        View findViewById2 = findViewById(b.f.J);
        this.f519w = findViewById2;
        ImageView imageView = (ImageView) findViewById(b.f.f2246x);
        this.f520x = imageView;
        ImageView imageView2 = (ImageView) findViewById(b.f.A);
        this.f521y = imageView2;
        ImageView imageView3 = (ImageView) findViewById(b.f.f2247y);
        this.f522z = imageView3;
        ImageView imageView4 = (ImageView) findViewById(b.f.E);
        this.A = imageView4;
        ImageView imageView5 = (ImageView) findViewById(b.f.B);
        this.H = imageView5;
        androidx.core.view.f0.I(findViewById, u2.f(b.j.t2));
        androidx.core.view.f0.I(findViewById2, u2.f(b.j.x2));
        int i3 = b.j.w2;
        imageView.setImageDrawable(u2.f(i3));
        imageView2.setImageDrawable(u2.f(b.j.q2));
        imageView3.setImageDrawable(u2.f(b.j.n2));
        imageView4.setImageDrawable(u2.f(b.j.z2));
        imageView5.setImageDrawable(u2.f(i3));
        this.I = u2.f(b.j.v2);
        l1.a(imageView, getResources().getString(b.h.f2280l));
        this.J = u2.m(b.j.y2, b.g.f2265q);
        this.K = u2.m(b.j.o2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f516t0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f511p0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(u2.a(b.j.r2, true));
        int e3 = u2.e(b.j.k2, -1);
        if (e3 != -1) {
            setMaxWidth(e3);
        }
        this.N = u2.o(b.j.p2);
        this.f496a0 = u2.o(b.j.u2);
        int j2 = u2.j(b.j.m2, -1);
        if (j2 != -1) {
            setImeOptions(j2);
        }
        int j3 = u2.j(b.j.l2, -1);
        if (j3 != -1) {
            setInputType(j3);
        }
        setFocusable(u2.a(b.j.j2, true));
        u2.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.L = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.M = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.B = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        g0(this.T);
        c0();
    }

    private Intent A(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f506k0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent B(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void C() {
        this.f515t.dismissDropDown();
    }

    private void E(View view, Rect rect) {
        view.getLocationInWindow(this.F);
        getLocationInWindow(this.G);
        int[] iArr = this.F;
        int i2 = iArr[1];
        int[] iArr2 = this.G;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    private CharSequence F(CharSequence charSequence) {
        if (!this.T || this.I == null) {
            return charSequence;
        }
        int textSize = (int) (this.f515t.getTextSize() * 1.25d);
        this.I.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.I), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean G() {
        SearchableInfo searchableInfo = this.f505j0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f505j0.getVoiceSearchLaunchWebSearch()) {
            intent = this.L;
        } else if (this.f505j0.getVoiceSearchLaunchRecognizer()) {
            intent = this.M;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean I(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean J() {
        return (this.W || this.f500e0) && !H();
    }

    private void K(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e3) {
            Log.e("SearchView", "Failed launch activity: " + intent, e3);
        }
    }

    private boolean M(int i2, int i3, String str) {
        Cursor b3 = this.V.b();
        if (b3 == null || !b3.moveToPosition(i2)) {
            return false;
        }
        K(z(b3, i3, str));
        return true;
    }

    private void X() {
        post(this.f507l0);
    }

    private void Y(int i2) {
        CharSequence convertToString;
        Editable text = this.f515t.getText();
        Cursor b3 = this.V.b();
        if (b3 == null) {
            return;
        }
        if (!b3.moveToPosition(i2) || (convertToString = this.V.convertToString(b3)) == null) {
            setQuery(text);
        } else {
            setQuery(convertToString);
        }
    }

    private void a0() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f515t.getText());
        if (!z3 && (!this.T || this.f503h0)) {
            z2 = false;
        }
        this.f522z.setVisibility(z2 ? 0 : 8);
        Drawable drawable = this.f522z.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void c0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f515t;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(F(queryHint));
    }

    private void d0() {
        this.f515t.setThreshold(this.f505j0.getSuggestThreshold());
        this.f515t.setImeOptions(this.f505j0.getImeOptions());
        int inputType = this.f505j0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f505j0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f515t.setInputType(inputType);
        y.a aVar = this.V;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f505j0.getSuggestAuthority() != null) {
            c1 c1Var = new c1(getContext(), this, this.f505j0, this.f509n0);
            this.V = c1Var;
            this.f515t.setAdapter(c1Var);
            ((c1) this.V).w(this.f497b0 ? 2 : 1);
        }
    }

    private void e0() {
        this.f519w.setVisibility((J() && (this.f521y.getVisibility() == 0 || this.A.getVisibility() == 0)) ? 0 : 8);
    }

    private void f0(boolean z2) {
        this.f521y.setVisibility((this.W && J() && hasFocus() && (z2 || !this.f500e0)) ? 0 : 8);
    }

    private void g0(boolean z2) {
        this.U = z2;
        int i2 = z2 ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.f515t.getText());
        this.f520x.setVisibility(i2);
        f0(z3);
        this.f517u.setVisibility(z2 ? 8 : 0);
        this.H.setVisibility((this.H.getDrawable() == null || this.T) ? 8 : 0);
        a0();
        h0(!z3);
        e0();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(b.d.f2191g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(b.d.f2192h);
    }

    private void h0(boolean z2) {
        int i2 = 8;
        if (this.f500e0 && !H() && z2) {
            this.f521y.setVisibility(8);
            i2 = 0;
        }
        this.A.setVisibility(i2);
    }

    private void setQuery(CharSequence charSequence) {
        this.f515t.setText(charSequence);
        this.f515t.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private Intent y(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f502g0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f506k0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f505j0.getSearchActivity());
        return intent;
    }

    private Intent z(Cursor cursor, int i2, String str) {
        int i3;
        String n2;
        try {
            String n3 = c1.n(cursor, "suggest_intent_action");
            if (n3 == null) {
                n3 = this.f505j0.getSuggestIntentAction();
            }
            if (n3 == null) {
                n3 = "android.intent.action.SEARCH";
            }
            String str2 = n3;
            String n4 = c1.n(cursor, "suggest_intent_data");
            if (n4 == null) {
                n4 = this.f505j0.getSuggestIntentData();
            }
            if (n4 != null && (n2 = c1.n(cursor, "suggest_intent_data_id")) != null) {
                n4 = n4 + "/" + Uri.encode(n2);
            }
            return y(str2, n4 == null ? null : Uri.parse(n4), c1.n(cursor, "suggest_intent_extra_data"), c1.n(cursor, "suggest_intent_query"), i2, str);
        } catch (RuntimeException e3) {
            try {
                i3 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i3 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e3);
            return null;
        }
    }

    void D() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f515t.refreshAutoCompleteResults();
            return;
        }
        n nVar = f495u0;
        nVar.b(this.f515t);
        nVar.a(this.f515t);
    }

    public boolean H() {
        return this.U;
    }

    void L(int i2, String str, String str2) {
        getContext().startActivity(y("android.intent.action.SEARCH", null, null, str2, i2, str));
    }

    void N() {
        if (!TextUtils.isEmpty(this.f515t.getText())) {
            this.f515t.setText("");
            this.f515t.requestFocus();
            this.f515t.setImeVisibility(true);
        } else if (this.T) {
            k kVar = this.P;
            if (kVar == null || !kVar.a()) {
                clearFocus();
                g0(true);
            }
        }
    }

    boolean O(int i2, int i3, String str) {
        m mVar = this.R;
        if (mVar != null && mVar.b(i2)) {
            return false;
        }
        M(i2, 0, null);
        this.f515t.setImeVisibility(false);
        C();
        return true;
    }

    boolean P(int i2) {
        m mVar = this.R;
        if (mVar != null && mVar.a(i2)) {
            return false;
        }
        Y(i2);
        return true;
    }

    void Q(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void R() {
        g0(false);
        this.f515t.requestFocus();
        this.f515t.setImeVisibility(true);
        View.OnClickListener onClickListener = this.S;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void S() {
        Editable text = this.f515t.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        l lVar = this.O;
        if (lVar == null || !lVar.b(text.toString())) {
            if (this.f505j0 != null) {
                L(0, null, text.toString());
            }
            this.f515t.setImeVisibility(false);
            C();
        }
    }

    boolean T(View view, int i2, KeyEvent keyEvent) {
        if (this.f505j0 != null && this.V != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return O(this.f515t.getListSelection(), 0, null);
            }
            if (i2 == 21 || i2 == 22) {
                this.f515t.setSelection(i2 == 21 ? 0 : this.f515t.length());
                this.f515t.setListSelection(0);
                this.f515t.clearListSelection();
                this.f515t.a();
                return true;
            }
            if (i2 == 19) {
                this.f515t.getListSelection();
                return false;
            }
        }
        return false;
    }

    void U(CharSequence charSequence) {
        Editable text = this.f515t.getText();
        this.f502g0 = text;
        boolean z2 = !TextUtils.isEmpty(text);
        f0(z2);
        h0(!z2);
        a0();
        e0();
        if (this.O != null && !TextUtils.equals(charSequence, this.f501f0)) {
            this.O.a(charSequence.toString());
        }
        this.f501f0 = charSequence.toString();
    }

    void V() {
        g0(H());
        X();
        if (this.f515t.hasFocus()) {
            D();
        }
    }

    void W() {
        Intent A;
        SearchableInfo searchableInfo = this.f505j0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                A = B(this.L, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                A = A(this.M, searchableInfo);
            }
            getContext().startActivity(A);
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public void Z(CharSequence charSequence, boolean z2) {
        this.f515t.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f515t;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f502g0 = charSequence;
        }
        if (!z2 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        S();
    }

    void b0() {
        int[] iArr = this.f515t.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f518v.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f519w.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f498c0 = true;
        super.clearFocus();
        this.f515t.clearFocus();
        this.f515t.setImeVisibility(false);
        this.f498c0 = false;
    }

    public int getImeOptions() {
        return this.f515t.getImeOptions();
    }

    public int getInputType() {
        return this.f515t.getInputType();
    }

    public int getMaxWidth() {
        return this.f499d0;
    }

    public CharSequence getQuery() {
        return this.f515t.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f496a0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f505j0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.N : getContext().getText(this.f505j0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.K;
    }

    int getSuggestionRowLayout() {
        return this.J;
    }

    public y.a getSuggestionsAdapter() {
        return this.V;
    }

    @Override // g.c
    public void onActionViewCollapsed() {
        Z("", false);
        clearFocus();
        g0(true);
        this.f515t.setImeOptions(this.f504i0);
        this.f503h0 = false;
    }

    @Override // g.c
    public void onActionViewExpanded() {
        if (this.f503h0) {
            return;
        }
        this.f503h0 = true;
        int imeOptions = this.f515t.getImeOptions();
        this.f504i0 = imeOptions;
        this.f515t.setImeOptions(imeOptions | 33554432);
        this.f515t.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f507l0);
        post(this.f508m0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.q0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            E(this.f515t, this.D);
            Rect rect = this.E;
            Rect rect2 = this.D;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            p pVar = this.C;
            if (pVar != null) {
                pVar.a(this.E, this.D);
                return;
            }
            p pVar2 = new p(this.E, this.D, this.f515t);
            this.C = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r0 <= 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    @Override // androidx.appcompat.widget.q0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i2, int i3) {
        int i4;
        int mode;
        if (H()) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size = this.f499d0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            } else if (mode2 == 1073741824) {
                i4 = this.f499d0;
            }
            mode = View.MeasureSpec.getMode(i3);
            int size2 = View.MeasureSpec.getSize(i3);
            if (mode != Integer.MIN_VALUE) {
                size2 = Math.min(getPreferredHeight(), size2);
            } else if (mode == 0) {
                size2 = getPreferredHeight();
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        i4 = this.f499d0;
        if (i4 <= 0) {
            i4 = getPreferredWidth();
        }
        size = Math.min(i4, size);
        mode = View.MeasureSpec.getMode(i3);
        int size22 = View.MeasureSpec.getSize(i3);
        if (mode != Integer.MIN_VALUE) {
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size22, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        g0(oVar.f541g);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f541g = H();
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        X();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (this.f498c0 || !isFocusable()) {
            return false;
        }
        if (H()) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.f515t.requestFocus(i2, rect);
        if (requestFocus) {
            g0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f506k0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            N();
        } else {
            R();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.T == z2) {
            return;
        }
        this.T = z2;
        g0(z2);
        c0();
    }

    public void setImeOptions(int i2) {
        this.f515t.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f515t.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.f499d0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.P = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.Q = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.O = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.S = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.R = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f496a0 = charSequence;
        c0();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.f497b0 = z2;
        y.a aVar = this.V;
        if (aVar instanceof c1) {
            ((c1) aVar).w(z2 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f505j0 = searchableInfo;
        if (searchableInfo != null) {
            d0();
            c0();
        }
        boolean G = G();
        this.f500e0 = G;
        if (G) {
            this.f515t.setPrivateImeOptions("nm");
        }
        g0(H());
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.W = z2;
        g0(H());
    }

    public void setSuggestionsAdapter(y.a aVar) {
        this.V = aVar;
        this.f515t.setAdapter(aVar);
    }

    void x() {
        if (this.B.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f518v.getPaddingLeft();
            Rect rect = new Rect();
            boolean b3 = p1.b(this);
            int dimensionPixelSize = this.T ? resources.getDimensionPixelSize(b.d.f2189e) + resources.getDimensionPixelSize(b.d.f2190f) : 0;
            this.f515t.getDropDownBackground().getPadding(rect);
            int i2 = rect.left;
            this.f515t.setDropDownHorizontalOffset(b3 ? -i2 : paddingLeft - (i2 + dimensionPixelSize));
            this.f515t.setDropDownWidth((((this.B.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
