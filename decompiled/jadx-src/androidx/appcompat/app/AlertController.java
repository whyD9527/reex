package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.q0;
import androidx.core.view.f0;
import androidx.core.widget.NestedScrollView;
import b.f;
import b.j;
import c.h;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* renamed from: a, reason: collision with root package name */
    private final Context f164a;

    /* renamed from: b, reason: collision with root package name */
    final h f165b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f166c;

    /* renamed from: d, reason: collision with root package name */
    private final int f167d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f168e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f169f;

    /* renamed from: g, reason: collision with root package name */
    ListView f170g;

    /* renamed from: h, reason: collision with root package name */
    private View f171h;

    /* renamed from: i, reason: collision with root package name */
    private int f172i;

    /* renamed from: j, reason: collision with root package name */
    private int f173j;

    /* renamed from: k, reason: collision with root package name */
    private int f174k;

    /* renamed from: l, reason: collision with root package name */
    private int f175l;

    /* renamed from: m, reason: collision with root package name */
    private int f176m;

    /* renamed from: o, reason: collision with root package name */
    Button f178o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f179p;

    /* renamed from: q, reason: collision with root package name */
    Message f180q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f181r;

    /* renamed from: s, reason: collision with root package name */
    Button f182s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f183t;

    /* renamed from: u, reason: collision with root package name */
    Message f184u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f185v;

    /* renamed from: w, reason: collision with root package name */
    Button f186w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f187x;

    /* renamed from: y, reason: collision with root package name */
    Message f188y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f189z;

    /* renamed from: n, reason: collision with root package name */
    private boolean f177n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: e, reason: collision with root package name */
        private final int f190e;

        /* renamed from: f, reason: collision with root package name */
        private final int f191f;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f2);
            this.f191f = obtainStyledAttributes.getDimensionPixelOffset(j.g2, -1);
            this.f190e = obtainStyledAttributes.getDimensionPixelOffset(j.h2, -1);
        }

        public void a(boolean z2, boolean z3) {
            if (z3 && z2) {
                return;
            }
            setPadding(getPaddingLeft(), z2 ? getPaddingTop() : this.f190e, getPaddingRight(), z3 ? getPaddingBottom() : this.f191f);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.f178o || (message2 = alertController.f180q) == null) && (view != alertController.f182s || (message2 = alertController.f184u) == null)) ? (view != alertController.f186w || (message = alertController.f188y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f165b).sendToTarget();
        }
    }

    public static class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;

        /* renamed from: a, reason: collision with root package name */
        public final Context f193a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f194b;

        /* renamed from: d, reason: collision with root package name */
        public Drawable f196d;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f198f;

        /* renamed from: g, reason: collision with root package name */
        public View f199g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f200h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f201i;

        /* renamed from: j, reason: collision with root package name */
        public Drawable f202j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f203k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f204l;

        /* renamed from: m, reason: collision with root package name */
        public Drawable f205m;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f206n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f207o;

        /* renamed from: p, reason: collision with root package name */
        public Drawable f208p;

        /* renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f209q;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f211s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f212t;

        /* renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f213u;

        /* renamed from: v, reason: collision with root package name */
        public CharSequence[] f214v;

        /* renamed from: w, reason: collision with root package name */
        public ListAdapter f215w;

        /* renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f216x;

        /* renamed from: y, reason: collision with root package name */
        public int f217y;

        /* renamed from: z, reason: collision with root package name */
        public View f218z;

        /* renamed from: c, reason: collision with root package name */
        public int f195c = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f197e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean P = true;

        /* renamed from: r, reason: collision with root package name */
        public boolean f210r = true;

        class a extends ArrayAdapter<CharSequence> {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ RecycleListView f219e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i2, int i3, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i2, i3, charSequenceArr);
                this.f219e = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i2, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i2, view, viewGroup);
                boolean[] zArr = b.this.F;
                if (zArr != null && zArr[i2]) {
                    this.f219e.setItemChecked(i2, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        class C0009b extends CursorAdapter {

            /* renamed from: e, reason: collision with root package name */
            private final int f221e;

            /* renamed from: f, reason: collision with root package name */
            private final int f222f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ RecycleListView f223g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ AlertController f224h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0009b(Context context, Cursor cursor, boolean z2, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z2);
                this.f223g = recycleListView;
                this.f224h = alertController;
                Cursor cursor2 = getCursor();
                this.f221e = cursor2.getColumnIndexOrThrow(b.this.L);
                this.f222f = cursor2.getColumnIndexOrThrow(b.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f221e));
                this.f223g.setItemChecked(cursor.getPosition(), cursor.getInt(this.f222f) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f194b.inflate(this.f224h.M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ AlertController f226e;

            c(AlertController alertController) {
                this.f226e = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                b.this.f216x.onClick(this.f226e.f165b, i2);
                if (b.this.H) {
                    return;
                }
                this.f226e.f165b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ RecycleListView f228e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AlertController f229f;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f228e = recycleListView;
                this.f229f = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                boolean[] zArr = b.this.F;
                if (zArr != null) {
                    zArr[i2] = this.f228e.isItemChecked(i2);
                }
                b.this.J.onClick(this.f229f.f165b, i2, this.f228e.isItemChecked(i2));
            }
        }

        public interface e {
            void a(ListView listView);
        }

        public b(Context context) {
            this.f193a = context;
            this.f194b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void b(AlertController alertController) {
            ListAdapter listAdapter;
            AdapterView.OnItemClickListener dVar;
            AdapterView.OnItemSelectedListener onItemSelectedListener;
            RecycleListView recycleListView = (RecycleListView) this.f194b.inflate(alertController.L, (ViewGroup) null);
            if (this.G) {
                listAdapter = this.K == null ? new a(this.f193a, alertController.M, R.id.text1, this.f214v, recycleListView) : new C0009b(this.f193a, this.K, false, recycleListView, alertController);
            } else {
                int i2 = this.H ? alertController.N : alertController.O;
                if (this.K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f193a, i2, this.K, new String[]{this.L}, new int[]{R.id.text1});
                } else {
                    listAdapter = this.f215w;
                    if (listAdapter == null) {
                        listAdapter = new d(this.f193a, i2, R.id.text1, this.f214v);
                    }
                }
            }
            e eVar = this.O;
            if (eVar != null) {
                eVar.a(recycleListView);
            }
            alertController.H = listAdapter;
            alertController.I = this.I;
            if (this.f216x == null) {
                if (this.J != null) {
                    dVar = new d(recycleListView, alertController);
                }
                onItemSelectedListener = this.N;
                if (onItemSelectedListener != null) {
                    recycleListView.setOnItemSelectedListener(onItemSelectedListener);
                }
                if (!this.H) {
                    recycleListView.setChoiceMode(1);
                } else if (this.G) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.f170g = recycleListView;
            }
            dVar = new c(alertController);
            recycleListView.setOnItemClickListener(dVar);
            onItemSelectedListener = this.N;
            if (onItemSelectedListener != null) {
            }
            if (!this.H) {
            }
            alertController.f170g = recycleListView;
        }

        public void a(AlertController alertController) {
            View view = this.f199g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f198f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f196d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i2 = this.f195c;
                if (i2 != 0) {
                    alertController.l(i2);
                }
                int i3 = this.f197e;
                if (i3 != 0) {
                    alertController.l(alertController.c(i3));
                }
            }
            CharSequence charSequence2 = this.f200h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f201i;
            if (charSequence3 != null || this.f202j != null) {
                alertController.j(-1, charSequence3, this.f203k, null, this.f202j);
            }
            CharSequence charSequence4 = this.f204l;
            if (charSequence4 != null || this.f205m != null) {
                alertController.j(-2, charSequence4, this.f206n, null, this.f205m);
            }
            CharSequence charSequence5 = this.f207o;
            if (charSequence5 != null || this.f208p != null) {
                alertController.j(-3, charSequence5, this.f209q, null, this.f208p);
            }
            if (this.f214v != null || this.K != null || this.f215w != null) {
                b(alertController);
            }
            View view2 = this.f218z;
            if (view2 != null) {
                if (this.E) {
                    alertController.s(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.r(view2);
                    return;
                }
            }
            int i4 = this.f217y;
            if (i4 != 0) {
                alertController.q(i4);
            }
        }
    }

    private static final class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<DialogInterface> f231a;

        public c(DialogInterface dialogInterface) {
            this.f231a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == -3 || i2 == -2 || i2 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f231a.get(), message.what);
            } else {
                if (i2 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i2, int i3, CharSequence[] charSequenceArr) {
            super(context, i2, i3, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, h hVar, Window window) {
        this.f164a = context;
        this.f165b = hVar;
        this.f166c = window;
        this.R = new c(hVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, j.F, b.a.f2163n, 0);
        this.J = obtainStyledAttributes.getResourceId(j.G, 0);
        this.K = obtainStyledAttributes.getResourceId(j.I, 0);
        this.L = obtainStyledAttributes.getResourceId(j.K, 0);
        this.M = obtainStyledAttributes.getResourceId(j.L, 0);
        this.N = obtainStyledAttributes.getResourceId(j.N, 0);
        this.O = obtainStyledAttributes.getResourceId(j.J, 0);
        this.P = obtainStyledAttributes.getBoolean(j.M, true);
        this.f167d = obtainStyledAttributes.getDimensionPixelSize(j.H, 0);
        obtainStyledAttributes.recycle();
        hVar.f(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int i() {
        int i2 = this.K;
        return (i2 != 0 && this.Q == 1) ? i2 : this.J;
    }

    private void o(ViewGroup viewGroup, View view, int i2, int i3) {
        View findViewById = this.f166c.findViewById(f.f2244v);
        View findViewById2 = this.f166c.findViewById(f.f2243u);
        f0.O(view, i2, i3);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    private void t(ViewGroup viewGroup) {
        int i2;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(R.id.button1);
        this.f178o = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f179p) && this.f181r == null) {
            this.f178o.setVisibility(8);
            i2 = 0;
        } else {
            this.f178o.setText(this.f179p);
            Drawable drawable = this.f181r;
            if (drawable != null) {
                int i3 = this.f167d;
                drawable.setBounds(0, 0, i3, i3);
                this.f178o.setCompoundDrawables(this.f181r, null, null, null);
            }
            this.f178o.setVisibility(0);
            i2 = 1;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button2);
        this.f182s = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f183t) && this.f185v == null) {
            this.f182s.setVisibility(8);
        } else {
            this.f182s.setText(this.f183t);
            Drawable drawable2 = this.f185v;
            if (drawable2 != null) {
                int i4 = this.f167d;
                drawable2.setBounds(0, 0, i4, i4);
                this.f182s.setCompoundDrawables(this.f185v, null, null, null);
            }
            this.f182s.setVisibility(0);
            i2 |= 2;
        }
        Button button4 = (Button) viewGroup.findViewById(R.id.button3);
        this.f186w = button4;
        button4.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f187x) && this.f189z == null) {
            this.f186w.setVisibility(8);
        } else {
            this.f186w.setText(this.f187x);
            Drawable drawable3 = this.f189z;
            if (drawable3 != null) {
                int i5 = this.f167d;
                drawable3.setBounds(0, 0, i5, i5);
                this.f186w.setCompoundDrawables(this.f189z, null, null, null);
            }
            this.f186w.setVisibility(0);
            i2 |= 4;
        }
        if (y(this.f164a)) {
            if (i2 == 1) {
                button = this.f178o;
            } else if (i2 == 2) {
                button = this.f182s;
            } else if (i2 == 4) {
                button = this.f186w;
            }
            b(button);
        }
        if (i2 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f166c.findViewById(f.f2245w);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f169f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f170g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f170g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void v(ViewGroup viewGroup) {
        View view = this.f171h;
        if (view == null) {
            view = this.f172i != 0 ? LayoutInflater.from(this.f164a).inflate(this.f172i, viewGroup, false) : null;
        }
        boolean z2 = view != null;
        if (!z2 || !a(view)) {
            this.f166c.setFlags(131072, 131072);
        }
        if (!z2) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f166c.findViewById(f.f2236n);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f177n) {
            frameLayout.setPadding(this.f173j, this.f174k, this.f175l, this.f176m);
        }
        if (this.f170g != null) {
            ((q0.a) viewGroup.getLayoutParams()).f857a = 0.0f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [android.view.View] */
    private void w(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            viewGroup2 = this.f166c.findViewById(f.O);
        } else {
            this.D = (ImageView) this.f166c.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(this.f168e)) && this.P) {
                TextView textView = (TextView) this.f166c.findViewById(f.f2232j);
                this.E = textView;
                textView.setText(this.f168e);
                int i2 = this.B;
                if (i2 != 0) {
                    this.D.setImageResource(i2);
                    return;
                }
                Drawable drawable = this.C;
                if (drawable != null) {
                    this.D.setImageDrawable(drawable);
                    return;
                } else {
                    this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
                    this.D.setVisibility(8);
                    return;
                }
            }
            this.f166c.findViewById(f.O).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup2 = viewGroup;
        }
        viewGroup2.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f166c.findViewById(f.f2242t);
        int i2 = f.P;
        View findViewById4 = findViewById3.findViewById(i2);
        int i3 = f.f2235m;
        View findViewById5 = findViewById3.findViewById(i3);
        int i4 = f.f2233k;
        View findViewById6 = findViewById3.findViewById(i4);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(f.f2237o);
        v(viewGroup);
        View findViewById7 = viewGroup.findViewById(i2);
        View findViewById8 = viewGroup.findViewById(i3);
        View findViewById9 = viewGroup.findViewById(i4);
        ViewGroup h2 = h(findViewById7, findViewById4);
        ViewGroup h3 = h(findViewById8, findViewById5);
        ViewGroup h4 = h(findViewById9, findViewById6);
        u(h3);
        t(h4);
        w(h2);
        boolean z2 = viewGroup.getVisibility() != 8;
        boolean z3 = (h2 == null || h2.getVisibility() == 8) ? 0 : 1;
        boolean z4 = (h4 == null || h4.getVisibility() == 8) ? false : true;
        if (!z4 && h3 != null && (findViewById2 = h3.findViewById(f.K)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z3 != 0) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View findViewById10 = (this.f169f == null && this.f170g == null) ? null : h2.findViewById(f.N);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (h3 != null && (findViewById = h3.findViewById(f.L)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f170g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z3, z4);
        }
        if (!z2) {
            View view = this.f170g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                o(h3, view, z3 | (z4 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f170g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i5 = this.I;
        if (i5 > -1) {
            listView2.setItemChecked(i5, true);
            listView2.setSelection(i5);
        }
    }

    private static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(b.a.f2162m, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i2) {
        TypedValue typedValue = new TypedValue();
        this.f164a.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f170g;
    }

    public void e() {
        this.f165b.setContentView(i());
        x();
    }

    public boolean f(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public boolean g(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public void j(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i2, onClickListener);
        }
        if (i2 == -3) {
            this.f187x = charSequence;
            this.f188y = message;
            this.f189z = drawable;
        } else if (i2 == -2) {
            this.f183t = charSequence;
            this.f184u = message;
            this.f185v = drawable;
        } else {
            if (i2 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f179p = charSequence;
            this.f180q = message;
            this.f181r = drawable;
        }
    }

    public void k(View view) {
        this.G = view;
    }

    public void l(int i2) {
        this.C = null;
        this.B = i2;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i2 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void m(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void n(CharSequence charSequence) {
        this.f169f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(CharSequence charSequence) {
        this.f168e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i2) {
        this.f171h = null;
        this.f172i = i2;
        this.f177n = false;
    }

    public void r(View view) {
        this.f171h = view;
        this.f172i = 0;
        this.f177n = false;
    }

    public void s(View view, int i2, int i3, int i4, int i5) {
        this.f171h = view;
        this.f172i = 0;
        this.f177n = true;
        this.f173j = i2;
        this.f174k = i3;
        this.f175l = i4;
        this.f176m = i5;
    }
}
