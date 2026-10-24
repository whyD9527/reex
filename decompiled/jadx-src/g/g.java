package g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.m0;
import androidx.core.view.v;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    static final Class<?>[] f2811e;

    /* renamed from: f, reason: collision with root package name */
    static final Class<?>[] f2812f;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f2813a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f2814b;

    /* renamed from: c, reason: collision with root package name */
    Context f2815c;

    /* renamed from: d, reason: collision with root package name */
    private Object f2816d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        private static final Class<?>[] f2817c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        private Object f2818a;

        /* renamed from: b, reason: collision with root package name */
        private Method f2819b;

        public a(Object obj, String str) {
            this.f2818a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f2819b = cls.getMethod(str, f2817c);
            } catch (Exception e3) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e3);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f2819b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f2819b.invoke(this.f2818a, menuItem)).booleanValue();
                }
                this.f2819b.invoke(this.f2818a, menuItem);
                return true;
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    private class b {
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a, reason: collision with root package name */
        private Menu f2820a;

        /* renamed from: b, reason: collision with root package name */
        private int f2821b;

        /* renamed from: c, reason: collision with root package name */
        private int f2822c;

        /* renamed from: d, reason: collision with root package name */
        private int f2823d;

        /* renamed from: e, reason: collision with root package name */
        private int f2824e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f2825f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f2826g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f2827h;

        /* renamed from: i, reason: collision with root package name */
        private int f2828i;

        /* renamed from: j, reason: collision with root package name */
        private int f2829j;

        /* renamed from: k, reason: collision with root package name */
        private CharSequence f2830k;

        /* renamed from: l, reason: collision with root package name */
        private CharSequence f2831l;

        /* renamed from: m, reason: collision with root package name */
        private int f2832m;

        /* renamed from: n, reason: collision with root package name */
        private char f2833n;

        /* renamed from: o, reason: collision with root package name */
        private int f2834o;

        /* renamed from: p, reason: collision with root package name */
        private char f2835p;

        /* renamed from: q, reason: collision with root package name */
        private int f2836q;

        /* renamed from: r, reason: collision with root package name */
        private int f2837r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f2838s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f2839t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f2840u;

        /* renamed from: v, reason: collision with root package name */
        private int f2841v;

        /* renamed from: w, reason: collision with root package name */
        private int f2842w;

        /* renamed from: x, reason: collision with root package name */
        private String f2843x;

        /* renamed from: y, reason: collision with root package name */
        private String f2844y;

        /* renamed from: z, reason: collision with root package name */
        private String f2845z;

        public b(Menu menu) {
            this.f2820a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f2815c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e3) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e3);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.f2838s).setVisible(this.f2839t).setEnabled(this.f2840u).setCheckable(this.f2837r >= 1).setTitleCondensed(this.f2831l).setIcon(this.f2832m);
            int i2 = this.f2841v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.f2845z != null) {
                if (g.this.f2815c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f2845z));
            }
            if (this.f2837r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof h.c) {
                    ((h.c) menuItem).h(true);
                }
            }
            String str = this.f2843x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f2811e, g.this.f2813a));
                z2 = true;
            }
            int i3 = this.f2842w;
            if (i3 > 0) {
                if (z2) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i3);
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                v.a(menuItem, bVar);
            }
            v.c(menuItem, this.B);
            v.g(menuItem, this.C);
            v.b(menuItem, this.f2833n, this.f2834o);
            v.f(menuItem, this.f2835p, this.f2836q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                v.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                v.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f2827h = true;
            i(this.f2820a.add(this.f2821b, this.f2828i, this.f2829j, this.f2830k));
        }

        public SubMenu b() {
            this.f2827h = true;
            SubMenu addSubMenu = this.f2820a.addSubMenu(this.f2821b, this.f2828i, this.f2829j, this.f2830k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f2827h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f2815c.obtainStyledAttributes(attributeSet, b.j.f2343r1);
            this.f2821b = obtainStyledAttributes.getResourceId(b.j.f2349t1, 0);
            this.f2822c = obtainStyledAttributes.getInt(b.j.f2355v1, 0);
            this.f2823d = obtainStyledAttributes.getInt(b.j.f2358w1, 0);
            this.f2824e = obtainStyledAttributes.getInt(b.j.f2361x1, 0);
            this.f2825f = obtainStyledAttributes.getBoolean(b.j.f2352u1, true);
            this.f2826g = obtainStyledAttributes.getBoolean(b.j.f2346s1, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            i1 t2 = i1.t(g.this.f2815c, attributeSet, b.j.f2364y1);
            this.f2828i = t2.m(b.j.B1, 0);
            this.f2829j = (t2.j(b.j.E1, this.f2822c) & (-65536)) | (t2.j(b.j.F1, this.f2823d) & 65535);
            this.f2830k = t2.o(b.j.G1);
            this.f2831l = t2.o(b.j.H1);
            this.f2832m = t2.m(b.j.f2367z1, 0);
            this.f2833n = c(t2.n(b.j.I1));
            this.f2834o = t2.j(b.j.P1, 4096);
            this.f2835p = c(t2.n(b.j.J1));
            this.f2836q = t2.j(b.j.T1, 4096);
            int i2 = b.j.K1;
            this.f2837r = t2.r(i2) ? t2.a(i2, false) : this.f2824e;
            this.f2838s = t2.a(b.j.C1, false);
            this.f2839t = t2.a(b.j.D1, this.f2825f);
            this.f2840u = t2.a(b.j.A1, this.f2826g);
            this.f2841v = t2.j(b.j.U1, -1);
            this.f2845z = t2.n(b.j.L1);
            this.f2842w = t2.m(b.j.M1, 0);
            this.f2843x = t2.n(b.j.O1);
            String n2 = t2.n(b.j.N1);
            this.f2844y = n2;
            boolean z2 = n2 != null;
            if (z2 && this.f2842w == 0 && this.f2843x == null) {
                this.A = (androidx.core.view.b) e(n2, g.f2812f, g.this.f2814b);
            } else {
                if (z2) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = t2.o(b.j.Q1);
            this.C = t2.o(b.j.V1);
            int i3 = b.j.S1;
            if (t2.r(i3)) {
                this.E = m0.c(t2.j(i3, -1), this.E);
            } else {
                this.E = null;
            }
            int i4 = b.j.R1;
            if (t2.r(i4)) {
                this.D = t2.c(i4);
            } else {
                this.D = null;
            }
            t2.v();
            this.f2827h = false;
        }

        public void h() {
            this.f2821b = 0;
            this.f2822c = 0;
            this.f2823d = 0;
            this.f2824e = 0;
            this.f2825f = true;
            this.f2826g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f2811e = clsArr;
        f2812f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f2815c = context;
        Object[] objArr = {context};
        this.f2813a = objArr;
        this.f2814b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r15 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r15 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r15.equals("group") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0.d() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r15 = r0.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r15 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r15.a() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r15.equals("menu") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r7 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r15.equals("group") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r15.equals("item") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        if (r15.equals("menu") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
    
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b7, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r15 == 1) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
    }

    Object b() {
        if (this.f2816d == null) {
            this.f2816d = a(this.f2815c);
        }
        return this.f2816d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof s.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f2815c.getResources().getLayout(i2);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e3) {
                    throw new InflateException("Error inflating menu XML", e3);
                }
            } catch (IOException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
