package io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import s0.a;
import t0.c;
import z0.m;
import z0.n;
import z0.o;
import z0.p;

/* loaded from: classes.dex */
class c implements s0.b, t0.b {

    /* renamed from: b, reason: collision with root package name */
    private final io.flutter.embedding.engine.a f3145b;

    /* renamed from: c, reason: collision with root package name */
    private final a.b f3146c;

    /* renamed from: e, reason: collision with root package name */
    private io.flutter.embedding.android.d<Activity> f3148e;

    /* renamed from: f, reason: collision with root package name */
    private C0046c f3149f;

    /* renamed from: i, reason: collision with root package name */
    private Service f3152i;

    /* renamed from: k, reason: collision with root package name */
    private BroadcastReceiver f3154k;

    /* renamed from: m, reason: collision with root package name */
    private ContentProvider f3156m;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends s0.a>, s0.a> f3144a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<? extends s0.a>, t0.a> f3147d = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private boolean f3150g = false;

    /* renamed from: h, reason: collision with root package name */
    private final Map<Class<? extends s0.a>, w0.a> f3151h = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final Map<Class<? extends s0.a>, u0.a> f3153j = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    private final Map<Class<? extends s0.a>, v0.a> f3155l = new HashMap();

    private static class b implements a.InterfaceC0064a {

        /* renamed from: a, reason: collision with root package name */
        final q0.d f3157a;

        private b(q0.d dVar) {
            this.f3157a = dVar;
        }
    }

    /* renamed from: io.flutter.embedding.engine.c$c, reason: collision with other inner class name */
    private static class C0046c implements t0.c {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f3158a;

        /* renamed from: b, reason: collision with root package name */
        private final HiddenLifecycleReference f3159b;

        /* renamed from: c, reason: collision with root package name */
        private final Set<o> f3160c = new HashSet();

        /* renamed from: d, reason: collision with root package name */
        private final Set<m> f3161d = new HashSet();

        /* renamed from: e, reason: collision with root package name */
        private final Set<n> f3162e = new HashSet();

        /* renamed from: f, reason: collision with root package name */
        private final Set<p> f3163f = new HashSet();

        /* renamed from: g, reason: collision with root package name */
        private final Set<Object> f3164g = new HashSet();

        /* renamed from: h, reason: collision with root package name */
        private final Set<c.a> f3165h = new HashSet();

        public C0046c(Activity activity, androidx.lifecycle.d dVar) {
            this.f3158a = activity;
            this.f3159b = new HiddenLifecycleReference(dVar);
        }

        @Override // t0.c
        public void a(m mVar) {
            this.f3161d.remove(mVar);
        }

        @Override // t0.c
        public void b(n nVar) {
            this.f3162e.remove(nVar);
        }

        @Override // t0.c
        public void c(o oVar) {
            this.f3160c.remove(oVar);
        }

        @Override // t0.c
        public Activity d() {
            return this.f3158a;
        }

        @Override // t0.c
        public void e(m mVar) {
            this.f3161d.add(mVar);
        }

        @Override // t0.c
        public void f(o oVar) {
            this.f3160c.add(oVar);
        }

        @Override // t0.c
        public void g(n nVar) {
            this.f3162e.add(nVar);
        }

        boolean h(int i2, int i3, Intent intent) {
            Iterator it = new HashSet(this.f3161d).iterator();
            while (true) {
                boolean z2 = false;
                while (it.hasNext()) {
                    if (((m) it.next()).a(i2, i3, intent) || z2) {
                        z2 = true;
                    }
                }
                return z2;
            }
        }

        void i(Intent intent) {
            Iterator<n> it = this.f3162e.iterator();
            while (it.hasNext()) {
                it.next().c(intent);
            }
        }

        boolean j(int i2, String[] strArr, int[] iArr) {
            Iterator<o> it = this.f3160c.iterator();
            while (true) {
                boolean z2 = false;
                while (it.hasNext()) {
                    if (it.next().b(i2, strArr, iArr) || z2) {
                        z2 = true;
                    }
                }
                return z2;
            }
        }

        void k(Bundle bundle) {
            Iterator<c.a> it = this.f3165h.iterator();
            while (it.hasNext()) {
                it.next().d(bundle);
            }
        }

        void l(Bundle bundle) {
            Iterator<c.a> it = this.f3165h.iterator();
            while (it.hasNext()) {
                it.next().e(bundle);
            }
        }

        void m() {
            Iterator<p> it = this.f3163f.iterator();
            while (it.hasNext()) {
                it.next().f();
            }
        }
    }

    c(Context context, io.flutter.embedding.engine.a aVar, q0.d dVar, d dVar2) {
        this.f3145b = aVar;
        this.f3146c = new a.b(context, aVar, aVar.j(), aVar.s(), aVar.p().W(), new b(dVar), dVar2);
    }

    private void k(Activity activity, androidx.lifecycle.d dVar) {
        this.f3149f = new C0046c(activity, dVar);
        this.f3145b.p().s0(activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false);
        this.f3145b.p().C(activity, this.f3145b.s(), this.f3145b.j());
        for (t0.a aVar : this.f3147d.values()) {
            if (this.f3150g) {
                aVar.i(this.f3149f);
            } else {
                aVar.j(this.f3149f);
            }
        }
        this.f3150g = false;
    }

    private void m() {
        this.f3145b.p().O();
        this.f3148e = null;
        this.f3149f = null;
    }

    private void n() {
        if (s()) {
            j();
            return;
        }
        if (v()) {
            q();
        } else if (t()) {
            o();
        } else if (u()) {
            p();
        }
    }

    private boolean s() {
        return this.f3148e != null;
    }

    private boolean t() {
        return this.f3154k != null;
    }

    private boolean u() {
        return this.f3156m != null;
    }

    private boolean v() {
        return this.f3152i != null;
    }

    @Override // t0.b
    public boolean a(int i2, int i3, Intent intent) {
        if (!s()) {
            n0.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
        f1.f f2 = f1.f.f("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            boolean h2 = this.f3149f.h(i2, i3, intent);
            if (f2 != null) {
                f2.close();
            }
            return h2;
        } catch (Throwable th) {
            if (f2 != null) {
                try {
                    f2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // t0.b
    public boolean b(int i2, String[] strArr, int[] iArr) {
        if (!s()) {
            n0.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
        f1.f f2 = f1.f.f("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            boolean j2 = this.f3149f.j(i2, strArr, iArr);
            if (f2 != null) {
                f2.close();
            }
            return j2;
        } catch (Throwable th) {
            if (f2 != null) {
                try {
                    f2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // t0.b
    public void c(Intent intent) {
        if (!s()) {
            n0.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            return;
        }
        f1.f f2 = f1.f.f("FlutterEngineConnectionRegistry#onNewIntent");
        try {
            this.f3149f.i(intent);
            if (f2 != null) {
                f2.close();
            }
        } catch (Throwable th) {
            if (f2 != null) {
                try {
                    f2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // t0.b
    public void d(Bundle bundle) {
        if (!s()) {
            n0.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            return;
        }
        f1.f f2 = f1.f.f("FlutterEngineConnectionRegistry#onRestoreInstanceState");
        try {
            this.f3149f.k(bundle);
            if (f2 != null) {
                f2.close();
            }
        } catch (Throwable th) {
            if (f2 != null) {
                try {
                    f2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // t0.b
    public void e(Bundle bundle) {
        if (!s()) {
            n0.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            return;
        }
        f1.f f2 = f1.f.f("FlutterEngineConnectionRegistry#onSaveInstanceState");
        try {
            this.f3149f.l(bundle);
            if (f2 != null) {
                f2.close();
            }
        } catch (Throwable th) {
            if (f2 != null) {
                try {
                    f2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // t0.b
    public void f() {
        if (!s()) {
            n0.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        f1.f f2 = f1.f.f("FlutterEngineConnectionRegistry#onUserLeaveHint");
        try {
            this.f3149f.m();
            if (f2 != null) {
                f2.close();
            }
        } catch (Throwable th) {
            if (f2 != null) {
                try {
                    f2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // t0.b
    public void g(io.flutter.embedding.android.d<Activity> dVar, androidx.lifecycle.d dVar2) {
        f1.f f2 = f1.f.f("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            io.flutter.embedding.android.d<Activity> dVar3 = this.f3148e;
            if (dVar3 != null) {
                dVar3.e();
            }
            n();
            this.f3148e = dVar;
            k(dVar.f(), dVar2);
            if (f2 != null) {
                f2.close();
            }
        } catch (Throwable th) {
            if (f2 != null) {
                try {
                    f2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // t0.b
    public void h() {
        if (!s()) {
            n0.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        f1.f f2 = f1.f.f("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
        try {
            this.f3150g = true;
            Iterator<t0.a> it = this.f3147d.values().iterator();
            while (it.hasNext()) {
                it.next().n();
            }
            m();
            if (f2 != null) {
                f2.close();
            }
        } catch (Throwable th) {
            if (f2 != null) {
                try {
                    f2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s0.b
    public void i(s0.a aVar) {
        f1.f f2 = f1.f.f("FlutterEngineConnectionRegistry#add " + aVar.getClass().getSimpleName());
        try {
            if (r(aVar.getClass())) {
                n0.b.g("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f3145b + ").");
                if (f2 != null) {
                    f2.close();
                    return;
                }
                return;
            }
            n0.b.f("FlutterEngineCxnRegstry", "Adding plugin: " + aVar);
            this.f3144a.put(aVar.getClass(), aVar);
            aVar.h(this.f3146c);
            if (aVar instanceof t0.a) {
                t0.a aVar2 = (t0.a) aVar;
                this.f3147d.put(aVar.getClass(), aVar2);
                if (s()) {
                    aVar2.j(this.f3149f);
                }
            }
            if (aVar instanceof w0.a) {
                w0.a aVar3 = (w0.a) aVar;
                this.f3151h.put(aVar.getClass(), aVar3);
                if (v()) {
                    aVar3.b(null);
                }
            }
            if (aVar instanceof u0.a) {
                u0.a aVar4 = (u0.a) aVar;
                this.f3153j.put(aVar.getClass(), aVar4);
                if (t()) {
                    aVar4.a(null);
                }
            }
            if (aVar instanceof v0.a) {
                v0.a aVar5 = (v0.a) aVar;
                this.f3155l.put(aVar.getClass(), aVar5);
                if (u()) {
                    aVar5.b(null);
                }
            }
            if (f2 != null) {
                f2.close();
            }
        } catch (Throwable th) {
            if (f2 != null) {
                try {
                    f2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // t0.b
    public void j() {
        if (!s()) {
            n0.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        f1.f f2 = f1.f.f("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator<t0.a> it = this.f3147d.values().iterator();
            while (it.hasNext()) {
                it.next().e();
            }
            m();
            if (f2 != null) {
                f2.close();
            }
        } catch (Throwable th) {
            if (f2 != null) {
                try {
                    f2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void l() {
        n0.b.f("FlutterEngineCxnRegstry", "Destroying.");
        n();
        y();
    }

    public void o() {
        if (!t()) {
            n0.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        f1.f f2 = f1.f.f("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
        try {
            Iterator<u0.a> it = this.f3153j.values().iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            if (f2 != null) {
                f2.close();
            }
        } catch (Throwable th) {
            if (f2 != null) {
                try {
                    f2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void p() {
        if (!u()) {
            n0.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        f1.f f2 = f1.f.f("FlutterEngineConnectionRegistry#detachFromContentProvider");
        try {
            Iterator<v0.a> it = this.f3155l.values().iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            if (f2 != null) {
                f2.close();
            }
        } catch (Throwable th) {
            if (f2 != null) {
                try {
                    f2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void q() {
        if (!v()) {
            n0.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        f1.f f2 = f1.f.f("FlutterEngineConnectionRegistry#detachFromService");
        try {
            Iterator<w0.a> it = this.f3151h.values().iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f3152i = null;
            if (f2 != null) {
                f2.close();
            }
        } catch (Throwable th) {
            if (f2 != null) {
                try {
                    f2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean r(Class<? extends s0.a> cls) {
        return this.f3144a.containsKey(cls);
    }

    public void w(Class<? extends s0.a> cls) {
        s0.a aVar = this.f3144a.get(cls);
        if (aVar == null) {
            return;
        }
        f1.f f2 = f1.f.f("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
        try {
            if (aVar instanceof t0.a) {
                if (s()) {
                    ((t0.a) aVar).e();
                }
                this.f3147d.remove(cls);
            }
            if (aVar instanceof w0.a) {
                if (v()) {
                    ((w0.a) aVar).a();
                }
                this.f3151h.remove(cls);
            }
            if (aVar instanceof u0.a) {
                if (t()) {
                    ((u0.a) aVar).b();
                }
                this.f3153j.remove(cls);
            }
            if (aVar instanceof v0.a) {
                if (u()) {
                    ((v0.a) aVar).a();
                }
                this.f3155l.remove(cls);
            }
            aVar.l(this.f3146c);
            this.f3144a.remove(cls);
            if (f2 != null) {
                f2.close();
            }
        } catch (Throwable th) {
            if (f2 != null) {
                try {
                    f2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void x(Set<Class<? extends s0.a>> set) {
        Iterator<Class<? extends s0.a>> it = set.iterator();
        while (it.hasNext()) {
            w(it.next());
        }
    }

    public void y() {
        x(new HashSet(this.f3144a.keySet()));
        this.f3144a.clear();
    }
}
