package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.y0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class e implements s.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    private final Context f325a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f326b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f327c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f328d;

    /* renamed from: e, reason: collision with root package name */
    private a f329e;

    /* renamed from: m, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f337m;

    /* renamed from: n, reason: collision with root package name */
    CharSequence f338n;

    /* renamed from: o, reason: collision with root package name */
    Drawable f339o;

    /* renamed from: p, reason: collision with root package name */
    View f340p;

    /* renamed from: x, reason: collision with root package name */
    private g f348x;

    /* renamed from: z, reason: collision with root package name */
    private boolean f350z;

    /* renamed from: l, reason: collision with root package name */
    private int f336l = 0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f341q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f342r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f343s = false;

    /* renamed from: t, reason: collision with root package name */
    private boolean f344t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f345u = false;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList<g> f346v = new ArrayList<>();

    /* renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<j>> f347w = new CopyOnWriteArrayList<>();

    /* renamed from: y, reason: collision with root package name */
    private boolean f349y = false;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<g> f330f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<g> f331g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private boolean f332h = true;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<g> f333i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<g> f334j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private boolean f335k = true;

    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        this.f325a = context;
        this.f326b = context.getResources();
        b0(true);
    }

    private static int B(int i2) {
        int i3 = ((-65536) & i2) >> 16;
        if (i3 >= 0) {
            int[] iArr = A;
            if (i3 < iArr.length) {
                return (i2 & 65535) | (iArr[i3] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i2, boolean z2) {
        if (i2 < 0 || i2 >= this.f330f.size()) {
            return;
        }
        this.f330f.remove(i2);
        if (z2) {
            K(true);
        }
    }

    private void W(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources C = C();
        if (view != null) {
            this.f340p = view;
            this.f338n = null;
            this.f339o = null;
        } else {
            if (i2 > 0) {
                this.f338n = C.getText(i2);
            } else if (charSequence != null) {
                this.f338n = charSequence;
            }
            if (i3 > 0) {
                this.f339o = androidx.core.content.a.c(u(), i3);
            } else if (drawable != null) {
                this.f339o = drawable;
            }
            this.f340p = null;
        }
        K(false);
    }

    private void b0(boolean z2) {
        this.f328d = z2 && this.f326b.getConfiguration().keyboard != 1 && y0.b(ViewConfiguration.get(this.f325a), this.f325a);
    }

    private g g(int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        return new g(this, i2, i3, i4, i5, charSequence, i6);
    }

    private void i(boolean z2) {
        if (this.f347w.isEmpty()) {
            return;
        }
        d0();
        Iterator<WeakReference<j>> it = this.f347w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f347w.remove(next);
            } else {
                jVar.f(z2);
            }
        }
        c0();
    }

    private boolean j(m mVar, j jVar) {
        if (this.f347w.isEmpty()) {
            return false;
        }
        boolean e3 = jVar != null ? jVar.e(mVar) : false;
        Iterator<WeakReference<j>> it = this.f347w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null) {
                this.f347w.remove(next);
            } else if (!e3) {
                e3 = jVar2.e(mVar);
            }
        }
        return e3;
    }

    private static int n(ArrayList<g> arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    boolean A() {
        return this.f344t;
    }

    Resources C() {
        return this.f326b;
    }

    public e D() {
        return this;
    }

    public ArrayList<g> E() {
        if (!this.f332h) {
            return this.f331g;
        }
        this.f331g.clear();
        int size = this.f330f.size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.f330f.get(i2);
            if (gVar.isVisible()) {
                this.f331g.add(gVar);
            }
        }
        this.f332h = false;
        this.f335k = true;
        return this.f331g;
    }

    public boolean F() {
        return this.f349y;
    }

    boolean G() {
        return this.f327c;
    }

    public boolean H() {
        return this.f328d;
    }

    void I(g gVar) {
        this.f335k = true;
        K(true);
    }

    void J(g gVar) {
        this.f332h = true;
        K(true);
    }

    public void K(boolean z2) {
        if (this.f341q) {
            this.f342r = true;
            if (z2) {
                this.f343s = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f332h = true;
            this.f335k = true;
        }
        i(z2);
    }

    public boolean L(MenuItem menuItem, int i2) {
        return M(menuItem, null, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r1 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        e(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if ((r9 & 1) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (r1 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean M(MenuItem menuItem, j jVar, int i2) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean k2 = gVar.k();
        androidx.core.view.b b3 = gVar.b();
        boolean z2 = b3 != null && b3.a();
        if (gVar.j()) {
            k2 |= gVar.expandActionView();
        } else if (gVar.hasSubMenu() || z2) {
            if ((i2 & 4) == 0) {
                e(false);
            }
            if (!gVar.hasSubMenu()) {
                gVar.x(new m(u(), this, gVar));
            }
            m mVar = (m) gVar.getSubMenu();
            if (z2) {
                b3.f(mVar);
            }
            k2 |= j(mVar, jVar);
        }
    }

    public void O(j jVar) {
        Iterator<WeakReference<j>> it = this.f347w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f347w.remove(next);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).P(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 <= 0 || (findItem = findItem(i3)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f329e = aVar;
    }

    public e S(int i2) {
        this.f336l = i2;
        return this;
    }

    void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f330f.size();
        d0();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.f330f.get(i2);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        c0();
    }

    protected e U(int i2) {
        W(0, null, i2, null, null);
        return this;
    }

    protected e V(Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    protected e X(int i2) {
        W(i2, null, 0, null, null);
        return this;
    }

    protected e Y(CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    protected e Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    protected MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int B = B(i4);
        g g2 = g(i2, i3, i4, B, charSequence, this.f336l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f337m;
        if (contextMenuInfo != null) {
            g2.v(contextMenuInfo);
        }
        ArrayList<g> arrayList = this.f330f;
        arrayList.add(n(arrayList, B), g2);
        K(true);
        return g2;
    }

    public void a0(boolean z2) {
        this.f350z = z2;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return a(0, 0, 0, this.f326b.getString(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f326b.getString(i5));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f325a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f326b.getString(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f326b.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        g gVar = (g) a(i2, i3, i4, charSequence);
        m mVar = new m(this.f325a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f325a);
    }

    public void c(j jVar, Context context) {
        this.f347w.add(new WeakReference<>(jVar));
        jVar.d(context, this);
        this.f335k = true;
    }

    public void c0() {
        this.f341q = false;
        if (this.f342r) {
            this.f342r = false;
            K(this.f343s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f348x;
        if (gVar != null) {
            f(gVar);
        }
        this.f330f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f339o = null;
        this.f338n = null;
        this.f340p = null;
        K(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f329e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (this.f341q) {
            return;
        }
        this.f341q = true;
        this.f342r = false;
        this.f343s = false;
    }

    public final void e(boolean z2) {
        if (this.f345u) {
            return;
        }
        this.f345u = true;
        Iterator<WeakReference<j>> it = this.f347w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f347w.remove(next);
            } else {
                jVar.b(this, z2);
            }
        }
        this.f345u = false;
    }

    public boolean f(g gVar) {
        boolean z2 = false;
        if (!this.f347w.isEmpty() && this.f348x == gVar) {
            d0();
            Iterator<WeakReference<j>> it = this.f347w.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.f347w.remove(next);
                } else {
                    z2 = jVar.i(this, gVar);
                    if (z2) {
                        break;
                    }
                }
            }
            c0();
            if (z2) {
                this.f348x = null;
            }
        }
        return z2;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = this.f330f.get(i3);
            if (gVar.getItemId() == i2) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return this.f330f.get(i2);
    }

    boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f329e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f350z) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f330f.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return p(i2, keyEvent) != null;
    }

    public boolean k(g gVar) {
        boolean z2 = false;
        if (this.f347w.isEmpty()) {
            return false;
        }
        d0();
        Iterator<WeakReference<j>> it = this.f347w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f347w.remove(next);
            } else {
                z2 = jVar.j(this, gVar);
                if (z2) {
                    break;
                }
            }
        }
        c0();
        if (z2) {
            this.f348x = gVar;
        }
        return z2;
    }

    public int l(int i2) {
        return m(i2, 0);
    }

    public int m(int i2, int i3) {
        int size = size();
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < size) {
            if (this.f330f.get(i3).getGroupId() == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public int o(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f330f.get(i3).getItemId() == i2) {
                return i3;
            }
        }
        return -1;
    }

    g p(int i2, KeyEvent keyEvent) {
        ArrayList<g> arrayList = this.f346v;
        arrayList.clear();
        q(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean G = G();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = arrayList.get(i3);
            char alphabeticShortcut = G ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (G && alphabeticShortcut == '\b' && i2 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return L(findItem(i2), i3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        g p2 = p(i2, keyEvent);
        boolean L = p2 != null ? L(p2, i3) : false;
        if ((i3 & 2) != 0) {
            e(true);
        }
        return L;
    }

    void q(List<g> list, int i2, KeyEvent keyEvent) {
        boolean G = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f330f.size();
            for (int i3 = 0; i3 < size; i3++) {
                g gVar = this.f330f.get(i3);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i2, keyEvent);
                }
                char alphabeticShortcut = G ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if (((modifiers & 69647) == ((G ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G && alphabeticShortcut == '\b' && i2 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<g> E = E();
        if (this.f335k) {
            Iterator<WeakReference<j>> it = this.f347w.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.f347w.remove(next);
                } else {
                    z2 |= jVar.h();
                }
            }
            if (z2) {
                this.f333i.clear();
                this.f334j.clear();
                int size = E.size();
                for (int i2 = 0; i2 < size; i2++) {
                    g gVar = E.get(i2);
                    (gVar.l() ? this.f333i : this.f334j).add(gVar);
                }
            } else {
                this.f333i.clear();
                this.f334j.clear();
                this.f334j.addAll(E());
            }
            this.f335k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        int l2 = l(i2);
        if (l2 >= 0) {
            int size = this.f330f.size() - l2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size || this.f330f.get(l2).getGroupId() != i2) {
                    break;
                }
                N(l2, false);
                i3 = i4;
            }
            K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        N(o(i2), true);
    }

    public ArrayList<g> s() {
        r();
        return this.f333i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        int size = this.f330f.size();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = this.f330f.get(i3);
            if (gVar.getGroupId() == i2) {
                gVar.t(z3);
                gVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f349y = z2;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z2) {
        int size = this.f330f.size();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = this.f330f.get(i3);
            if (gVar.getGroupId() == i2) {
                gVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z2) {
        int size = this.f330f.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = this.f330f.get(i3);
            if (gVar.getGroupId() == i2 && gVar.y(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f327c = z2;
        K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f330f.size();
    }

    protected String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f325a;
    }

    public g v() {
        return this.f348x;
    }

    public Drawable w() {
        return this.f339o;
    }

    public CharSequence x() {
        return this.f338n;
    }

    public View y() {
        return this.f340p;
    }

    public ArrayList<g> z() {
        r();
        return this.f334j;
    }
}
