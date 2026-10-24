package i0;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import g1.q;
import h1.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Semaphore;
import kotlin.jvm.internal.l;
import s0.a;
import z0.j;
import z0.k;

/* loaded from: classes.dex */
public final class d implements s0.a, k.c {

    /* renamed from: a, reason: collision with root package name */
    private NsdManager f2941a;

    /* renamed from: b, reason: collision with root package name */
    private WifiManager f2942b;

    /* renamed from: c, reason: collision with root package name */
    private k f2943c;

    /* renamed from: d, reason: collision with root package name */
    private WifiManager.MulticastLock f2944d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, NsdManager.DiscoveryListener> f2945e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<String, NsdManager.ResolveListener> f2946f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, NsdManager.RegistrationListener> f2947g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final Semaphore f2948h = new Semaphore(1);

    public static final class a implements NsdManager.DiscoveryListener {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList<NsdServiceInfo> f2949a = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f2951c;

        a(String str) {
            this.f2951c = str;
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStarted(String serviceType) {
            kotlin.jvm.internal.k.e(serviceType, "serviceType");
            d.this.o("onDiscoveryStartSuccessful", g.o(this.f2951c));
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStopped(String serviceType) {
            kotlin.jvm.internal.k.e(serviceType, "serviceType");
            d.this.f2945e.remove(this.f2951c);
            d.this.o("onDiscoveryStopSuccessful", g.o(this.f2951c));
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceFound(NsdServiceInfo serviceInfo) {
            Map h2;
            kotlin.jvm.internal.k.e(serviceInfo, "serviceInfo");
            ArrayList<NsdServiceInfo> arrayList = this.f2949a;
            d dVar = d.this;
            boolean z2 = true;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (dVar.q((NsdServiceInfo) it.next(), serviceInfo)) {
                        z2 = false;
                        break;
                    }
                }
            }
            if (z2) {
                this.f2949a.add(serviceInfo);
                h2 = a0.h(g.o(this.f2951c), g.p(serviceInfo));
                d.this.o("onServiceDiscovered", h2);
            }
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceLost(NsdServiceInfo serviceInfo) {
            Object obj;
            Map h2;
            kotlin.jvm.internal.k.e(serviceInfo, "serviceInfo");
            ArrayList<NsdServiceInfo> arrayList = this.f2949a;
            d dVar = d.this;
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (dVar.q((NsdServiceInfo) obj, serviceInfo)) {
                        break;
                    }
                }
            }
            NsdServiceInfo nsdServiceInfo = (NsdServiceInfo) obj;
            if (nsdServiceInfo != null) {
                this.f2949a.remove(nsdServiceInfo);
                h2 = a0.h(g.o(this.f2951c), g.p(nsdServiceInfo));
                d.this.o("onServiceLost", h2);
            }
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStartDiscoveryFailed(String serviceType, int i2) {
            Map h2;
            Map h3;
            kotlin.jvm.internal.k.e(serviceType, "serviceType");
            d.this.f2945e.remove(this.f2951c);
            h2 = a0.h(g.o(this.f2951c), g.m(f.a(i2)));
            h3 = a0.h(h2, g.n(f.b(i2)));
            d.this.o("onDiscoveryStartFailed", h3);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStopDiscoveryFailed(String serviceType, int i2) {
            Map h2;
            Map h3;
            kotlin.jvm.internal.k.e(serviceType, "serviceType");
            d.this.f2945e.remove(this.f2951c);
            h2 = a0.h(g.o(this.f2951c), g.m(f.a(i2)));
            h3 = a0.h(h2, g.n(f.b(i2)));
            d.this.o("onDiscoveryStopFailed", h3);
        }
    }

    public static final class b implements NsdManager.RegistrationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2952a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f2953b;

        b(String str, d dVar) {
            this.f2952a = str;
            this.f2953b = dVar;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo serviceInfo, int i2) {
            Map h2;
            Map h3;
            kotlin.jvm.internal.k.e(serviceInfo, "serviceInfo");
            this.f2953b.f2947g.remove(this.f2952a);
            h2 = a0.h(g.o(this.f2952a), g.m(f.a(i2)));
            h3 = a0.h(h2, g.n(f.b(i2)));
            this.f2953b.o("onRegistrationFailed", h3);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo registeredServiceInfo) {
            Map h2;
            kotlin.jvm.internal.k.e(registeredServiceInfo, "registeredServiceInfo");
            h2 = a0.h(g.o(this.f2952a), g.q(registeredServiceInfo.getServiceName()));
            this.f2953b.o("onRegistrationSuccessful", h2);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo serviceInfo) {
            kotlin.jvm.internal.k.e(serviceInfo, "serviceInfo");
            this.f2953b.f2947g.remove(this.f2952a);
            this.f2953b.o("onUnregistrationSuccessful", g.o(this.f2952a));
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo serviceInfo, int i2) {
            Map h2;
            Map h3;
            kotlin.jvm.internal.k.e(serviceInfo, "serviceInfo");
            this.f2953b.f2947g.remove(this.f2952a);
            h2 = a0.h(g.o(this.f2952a), g.m(f.a(i2)));
            h3 = a0.h(h2, g.n(f.b(i2)));
            this.f2953b.o("onUnregistratioFailed", h3);
        }
    }

    public static final class c implements NsdManager.ResolveListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f2955b;

        c(String str) {
            this.f2955b = str;
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onResolveFailed(NsdServiceInfo serviceInfo, int i2) {
            Map h2;
            Map h3;
            kotlin.jvm.internal.k.e(serviceInfo, "serviceInfo");
            h2 = a0.h(g.o(this.f2955b), g.m(f.a(i2)));
            h3 = a0.h(h2, g.n(f.b(i2)));
            d.this.f2946f.remove(this.f2955b);
            d.this.f2948h.release();
            d.this.o("onResolveFailed", h3);
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onServiceResolved(NsdServiceInfo serviceInfo) {
            Map h2;
            kotlin.jvm.internal.k.e(serviceInfo, "serviceInfo");
            d.this.f2946f.remove(this.f2955b);
            h2 = a0.h(g.o(this.f2955b), g.p(serviceInfo));
            d.this.f2948h.release();
            d.this.o("onResolveSuccessful", h2);
        }
    }

    /* renamed from: i0.d$d, reason: collision with other inner class name */
    static final class C0043d extends l implements q1.a<q> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ NsdServiceInfo f2957f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c f2958g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0043d(NsdServiceInfo nsdServiceInfo, c cVar) {
            super(0);
            this.f2957f = nsdServiceInfo;
            this.f2958g = cVar;
        }

        public final void a() {
            d.this.f2948h.acquire();
            NsdManager nsdManager = d.this.f2941a;
            if (nsdManager == null) {
                kotlin.jvm.internal.k.o("nsdManager");
                nsdManager = null;
            }
            nsdManager.resolveService(this.f2957f, this.f2958g);
        }

        @Override // q1.a
        public /* bridge */ /* synthetic */ q invoke() {
            a();
            return q.f2865a;
        }
    }

    private final a j(String str) {
        return new a(str);
    }

    private final b k(String str) {
        return new b(str, this);
    }

    private final c n(String str) {
        return new c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(final String str, final Object obj) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: i0.c
            @Override // java.lang.Runnable
            public final void run() {
                d.p(d.this, str, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(d this$0, String method, Object obj) {
        kotlin.jvm.internal.k.e(this$0, "this$0");
        kotlin.jvm.internal.k.e(method, "$method");
        k kVar = this$0.f2943c;
        if (kVar == null) {
            kotlin.jvm.internal.k.o("methodChannel");
            kVar = null;
        }
        kVar.c(method, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q(NsdServiceInfo nsdServiceInfo, NsdServiceInfo nsdServiceInfo2) {
        return kotlin.jvm.internal.k.a(nsdServiceInfo.getServiceName(), nsdServiceInfo2.getServiceName()) && kotlin.jvm.internal.k.a(nsdServiceInfo.getServiceType(), nsdServiceInfo2.getServiceType());
    }

    private final boolean r(Context context) {
        return androidx.core.content.a.a(context, "android.permission.CHANGE_WIFI_MULTICAST_STATE") == 0;
    }

    private final void s(j jVar, k.d dVar) {
        NsdServiceInfo e3 = g.e((Map) jVar.b());
        if (e3 == null || e3.getServiceName() == null || e3.getServiceType() == null || e3.getPort() == 0) {
            throw new e(i0.a.ILLEGAL_ARGUMENT, "Cannot register service: expected service info with service name, type and port");
        }
        String c3 = g.c((Map) jVar.b());
        if (c3 == null) {
            throw new e(i0.a.ILLEGAL_ARGUMENT, "Cannot register service: expected handle");
        }
        b k2 = k(c3);
        this.f2947g.put(c3, k2);
        NsdManager nsdManager = this.f2941a;
        if (nsdManager == null) {
            kotlin.jvm.internal.k.o("nsdManager");
            nsdManager = null;
        }
        nsdManager.registerService(e3, 1, k2);
        dVar.a(null);
    }

    private final void t(j jVar, k.d dVar) {
        NsdServiceInfo e3 = g.e((Map) jVar.b());
        if (e3 == null || e3.getServiceName() == null || e3.getServiceType() == null) {
            throw new e(i0.a.ILLEGAL_ARGUMENT, "Cannot resolve service: expected service info with service name, type");
        }
        String c3 = g.c((Map) jVar.b());
        if (c3 == null) {
            throw new e(i0.a.ILLEGAL_ARGUMENT, "Cannot resolve service: expected handle");
        }
        c n2 = n(c3);
        this.f2946f.put(c3, n2);
        dVar.a(null);
        i1.a.b(false, false, null, null, 0, new C0043d(e3, n2), 31, null);
    }

    private final void u(j jVar, k.d dVar) {
        String i2 = g.i((Map) jVar.b());
        if (i2 == null) {
            throw new e(i0.a.ILLEGAL_ARGUMENT, "Cannot start discovery: expected service type");
        }
        String c3 = g.c((Map) jVar.b());
        if (c3 == null) {
            throw new e(i0.a.ILLEGAL_ARGUMENT, "Cannot start discovery: expected handle");
        }
        WifiManager.MulticastLock multicastLock = this.f2944d;
        if (multicastLock == null) {
            throw new e(i0.a.SECURITY_ISSUE, "Missing required permission CHANGE_WIFI_MULTICAST_STATE");
        }
        if (multicastLock != null) {
            multicastLock.acquire();
        }
        try {
            a j2 = j(c3);
            this.f2945e.put(c3, j2);
            NsdManager nsdManager = this.f2941a;
            if (nsdManager == null) {
                kotlin.jvm.internal.k.o("nsdManager");
                nsdManager = null;
            }
            nsdManager.discoverServices(i2, 1, j2);
            dVar.a(null);
        } catch (Throwable th) {
            WifiManager.MulticastLock multicastLock2 = this.f2944d;
            if (multicastLock2 != null) {
                multicastLock2.release();
            }
            throw th;
        }
    }

    private final void v(j jVar, k.d dVar) {
        String c3 = g.c((Map) jVar.b());
        if (c3 == null) {
            throw new e(i0.a.ILLEGAL_ARGUMENT, "Cannot stop discovery: expected handle");
        }
        WifiManager.MulticastLock multicastLock = this.f2944d;
        if (multicastLock == null) {
            throw new e(i0.a.SECURITY_ISSUE, "Missing required permission CHANGE_WIFI_MULTICAST_STATE");
        }
        if (multicastLock != null) {
            multicastLock.release();
        }
        NsdManager nsdManager = this.f2941a;
        if (nsdManager == null) {
            kotlin.jvm.internal.k.o("nsdManager");
            nsdManager = null;
        }
        nsdManager.stopServiceDiscovery(this.f2945e.get(c3));
        dVar.a(null);
    }

    private final void w(j jVar, k.d dVar) {
        String c3 = g.c((Map) jVar.b());
        if (c3 == null) {
            throw new e(i0.a.ILLEGAL_ARGUMENT, "Cannot unregister service: handle expected");
        }
        NsdManager.RegistrationListener registrationListener = this.f2947g.get(c3);
        NsdManager nsdManager = this.f2941a;
        if (nsdManager == null) {
            kotlin.jvm.internal.k.o("nsdManager");
            nsdManager = null;
        }
        nsdManager.unregisterService(registrationListener);
        dVar.a(null);
    }

    @Override // s0.a
    public void h(a.b flutterPluginBinding) {
        kotlin.jvm.internal.k.e(flutterPluginBinding, "flutterPluginBinding");
        Context a3 = flutterPluginBinding.a();
        kotlin.jvm.internal.k.d(a3, "flutterPluginBinding.applicationContext");
        Object g2 = androidx.core.content.a.g(a3, NsdManager.class);
        kotlin.jvm.internal.k.b(g2);
        this.f2941a = (NsdManager) g2;
        Object g3 = androidx.core.content.a.g(a3, WifiManager.class);
        kotlin.jvm.internal.k.b(g3);
        this.f2942b = (WifiManager) g3;
        if (r(a3)) {
            WifiManager wifiManager = this.f2942b;
            if (wifiManager == null) {
                kotlin.jvm.internal.k.o("wifiManager");
                wifiManager = null;
            }
            WifiManager.MulticastLock createMulticastLock = wifiManager.createMulticastLock("nsdMulticastLock");
            this.f2944d = createMulticastLock;
            if (createMulticastLock != null) {
                createMulticastLock.setReferenceCounted(true);
            }
        }
        k kVar = new k(flutterPluginBinding.b(), "com.haberey/nsd");
        this.f2943c = kVar;
        kVar.e(this);
    }

    @Override // s0.a
    public void l(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        k kVar = this.f2943c;
        if (kVar == null) {
            kotlin.jvm.internal.k.o("methodChannel");
            kVar = null;
        }
        kVar.e(null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // z0.k.c
    public void m(j methodCall, k.d result) {
        kotlin.jvm.internal.k.e(methodCall, "methodCall");
        kotlin.jvm.internal.k.e(result, "result");
        String str = methodCall.f4754a;
        if (str != null) {
            try {
                switch (str.hashCode()) {
                    case -2132901938:
                        if (!str.equals("stopDiscovery")) {
                            break;
                        } else {
                            v(methodCall, result);
                            break;
                        }
                    case -690213213:
                        if (!str.equals("register")) {
                            break;
                        } else {
                            s(methodCall, result);
                            break;
                        }
                    case -475549842:
                        if (!str.equals("startDiscovery")) {
                            break;
                        } else {
                            u(methodCall, result);
                            break;
                        }
                    case 836015164:
                        if (!str.equals("unregister")) {
                            break;
                        } else {
                            w(methodCall, result);
                            break;
                        }
                    case 1097368044:
                        if (!str.equals("resolve")) {
                            break;
                        } else {
                            t(methodCall, result);
                            break;
                        }
                }
            } catch (e e3) {
                result.c(e3.a().b(), e3.b(), null);
                return;
            } catch (Exception e4) {
                result.c(i0.a.INTERNAL_ERROR.b(), str + ": " + e4.getMessage(), null);
                return;
            }
        }
        result.b();
    }
}
