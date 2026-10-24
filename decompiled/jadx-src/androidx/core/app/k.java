package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.j;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class k implements androidx.core.app.i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1345a;

    /* renamed from: b, reason: collision with root package name */
    private final Notification.Builder f1346b;

    /* renamed from: c, reason: collision with root package name */
    private final j.c f1347c;

    /* renamed from: d, reason: collision with root package name */
    private RemoteViews f1348d;

    /* renamed from: e, reason: collision with root package name */
    private RemoteViews f1349e;

    /* renamed from: f, reason: collision with root package name */
    private final List<Bundle> f1350f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f1351g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private int f1352h;

    /* renamed from: i, reason: collision with root package name */
    private RemoteViews f1353i;

    static class a {
        static Notification a(Notification.Builder builder) {
            return builder.build();
        }

        static Notification.Builder b(Notification.Builder builder, int i2) {
            return builder.setPriority(i2);
        }

        static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        static Notification.Builder d(Notification.Builder builder, boolean z2) {
            return builder.setUsesChronometer(z2);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, boolean z2) {
            return builder.setShowWhen(z2);
        }
    }

    static class c {
        static Notification.Builder a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    static class d {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i2, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z2) {
            return builder.setGroupSummary(z2);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z2) {
            return builder.setLocalOnly(z2);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class e {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i2) {
            return builder.setColor(i2);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i2) {
            return builder.setVisibility(i2);
        }
    }

    static class f {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class g {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z2) {
            Notification.Action.Builder allowGeneratedReplies;
            allowGeneratedReplies = builder.setAllowGeneratedReplies(z2);
            return allowGeneratedReplies;
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            Notification.Builder customBigContentView;
            customBigContentView = builder.setCustomBigContentView(remoteViews);
            return customBigContentView;
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            Notification.Builder customContentView;
            customContentView = builder.setCustomContentView(remoteViews);
            return customContentView;
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            Notification.Builder customHeadsUpContentView;
            customHeadsUpContentView = builder.setCustomHeadsUpContentView(remoteViews);
            return customHeadsUpContentView;
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            Notification.Builder remoteInputHistory;
            remoteInputHistory = builder.setRemoteInputHistory(charSequenceArr);
            return remoteInputHistory;
        }
    }

    static class h {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i2) {
            Notification.Builder badgeIconType;
            badgeIconType = builder.setBadgeIconType(i2);
            return badgeIconType;
        }

        static Notification.Builder c(Notification.Builder builder, boolean z2) {
            Notification.Builder colorized;
            colorized = builder.setColorized(z2);
            return colorized;
        }

        static Notification.Builder d(Notification.Builder builder, int i2) {
            Notification.Builder groupAlertBehavior;
            groupAlertBehavior = builder.setGroupAlertBehavior(i2);
            return groupAlertBehavior;
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            Notification.Builder settingsText;
            settingsText = builder.setSettingsText(charSequence);
            return settingsText;
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            Notification.Builder shortcutId;
            shortcutId = builder.setShortcutId(str);
            return shortcutId;
        }

        static Notification.Builder g(Notification.Builder builder, long j2) {
            Notification.Builder timeoutAfter;
            timeoutAfter = builder.setTimeoutAfter(j2);
            return timeoutAfter;
        }
    }

    static class i {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            Notification.Builder addPerson;
            addPerson = builder.addPerson(person);
            return addPerson;
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i2) {
            Notification.Action.Builder semanticAction;
            semanticAction = builder.setSemanticAction(i2);
            return semanticAction;
        }
    }

    static class j {
        static Notification.Builder a(Notification.Builder builder, boolean z2) {
            Notification.Builder allowSystemGeneratedContextualActions;
            allowSystemGeneratedContextualActions = builder.setAllowSystemGeneratedContextualActions(z2);
            return allowSystemGeneratedContextualActions;
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            Notification.Builder bubbleMetadata2;
            bubbleMetadata2 = builder.setBubbleMetadata(bubbleMetadata);
            return bubbleMetadata2;
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z2) {
            Notification.Action.Builder contextual;
            contextual = builder.setContextual(z2);
            return contextual;
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            Notification.Builder locusId;
            locusId = builder.setLocusId((LocusId) obj);
            return locusId;
        }
    }

    /* renamed from: androidx.core.app.k$k, reason: collision with other inner class name */
    static class C0019k {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z2) {
            Notification.Action.Builder authenticationRequired;
            authenticationRequired = builder.setAuthenticationRequired(z2);
            return authenticationRequired;
        }

        static Notification.Builder b(Notification.Builder builder, int i2) {
            Notification.Builder foregroundServiceBehavior;
            foregroundServiceBehavior = builder.setForegroundServiceBehavior(i2);
            return foregroundServiceBehavior;
        }
    }

    k(j.c cVar) {
        int i2;
        this.f1347c = cVar;
        Context context = cVar.f1315a;
        this.f1345a = context;
        this.f1346b = Build.VERSION.SDK_INT >= 26 ? h.a(context, cVar.K) : new Notification.Builder(cVar.f1315a);
        Notification notification = cVar.R;
        this.f1346b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, cVar.f1323i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(cVar.f1319e).setContentText(cVar.f1320f).setContentInfo(cVar.f1325k).setContentIntent(cVar.f1321g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(cVar.f1322h, (notification.flags & 128) != 0).setLargeIcon(cVar.f1324j).setNumber(cVar.f1326l).setProgress(cVar.f1334t, cVar.f1335u, cVar.f1336v);
        a.b(a.d(a.c(this.f1346b, cVar.f1331q), cVar.f1329o), cVar.f1327m);
        Iterator<j.a> it = cVar.f1316b.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        Bundle bundle = cVar.D;
        if (bundle != null) {
            this.f1351g.putAll(bundle);
        }
        int i3 = Build.VERSION.SDK_INT;
        this.f1348d = cVar.H;
        this.f1349e = cVar.I;
        b.a(this.f1346b, cVar.f1328n);
        d.i(this.f1346b, cVar.f1340z);
        d.g(this.f1346b, cVar.f1337w);
        d.j(this.f1346b, cVar.f1339y);
        d.h(this.f1346b, cVar.f1338x);
        this.f1352h = cVar.O;
        e.b(this.f1346b, cVar.C);
        e.c(this.f1346b, cVar.E);
        e.f(this.f1346b, cVar.F);
        e.d(this.f1346b, cVar.G);
        e.e(this.f1346b, notification.sound, notification.audioAttributes);
        List e3 = i3 < 28 ? e(f(cVar.f1317c), cVar.U) : cVar.U;
        if (e3 != null && !e3.isEmpty()) {
            Iterator it2 = e3.iterator();
            while (it2.hasNext()) {
                e.a(this.f1346b, (String) it2.next());
            }
        }
        this.f1353i = cVar.J;
        if (cVar.f1318d.size() > 0) {
            Bundle bundle2 = cVar.d().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i4 = 0; i4 < cVar.f1318d.size(); i4++) {
                bundle4.putBundle(Integer.toString(i4), e0.a(cVar.f1318d.get(i4)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            cVar.d().putBundle("android.car.EXTENSIONS", bundle2);
            this.f1351g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i5 = Build.VERSION.SDK_INT;
        Object obj = cVar.T;
        if (obj != null) {
            f.b(this.f1346b, obj);
        }
        if (i5 >= 24) {
            c.a(this.f1346b, cVar.D);
            g.e(this.f1346b, cVar.f1333s);
            RemoteViews remoteViews = cVar.H;
            if (remoteViews != null) {
                g.c(this.f1346b, remoteViews);
            }
            RemoteViews remoteViews2 = cVar.I;
            if (remoteViews2 != null) {
                g.b(this.f1346b, remoteViews2);
            }
            RemoteViews remoteViews3 = cVar.J;
            if (remoteViews3 != null) {
                g.d(this.f1346b, remoteViews3);
            }
        }
        if (i5 >= 26) {
            h.b(this.f1346b, cVar.L);
            h.e(this.f1346b, cVar.f1332r);
            h.f(this.f1346b, cVar.M);
            h.g(this.f1346b, cVar.N);
            h.d(this.f1346b, cVar.O);
            if (cVar.B) {
                h.c(this.f1346b, cVar.A);
            }
            if (!TextUtils.isEmpty(cVar.K)) {
                this.f1346b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i5 >= 28) {
            Iterator<i0> it3 = cVar.f1317c.iterator();
            while (it3.hasNext()) {
                i.a(this.f1346b, it3.next().h());
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            j.a(this.f1346b, cVar.Q);
            j.b(this.f1346b, j.b.a(null));
        }
        if (i6 >= 31 && (i2 = cVar.P) != 0) {
            C0019k.b(this.f1346b, i2);
        }
        if (cVar.S) {
            if (this.f1347c.f1338x) {
                this.f1352h = 2;
            } else {
                this.f1352h = 1;
            }
            this.f1346b.setVibrate(null);
            this.f1346b.setSound(null);
            int i7 = notification.defaults & (-2) & (-3);
            notification.defaults = i7;
            this.f1346b.setDefaults(i7);
            if (i6 >= 26) {
                if (TextUtils.isEmpty(this.f1347c.f1337w)) {
                    d.g(this.f1346b, "silent");
                }
                h.d(this.f1346b, this.f1352h);
            }
        }
    }

    private void b(j.a aVar) {
        IconCompat d3 = aVar.d();
        Notification.Action.Builder a3 = f.a(d3 != null ? d3.o() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : j0.b(aVar.e())) {
                d.c(a3, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            g.a(a3, aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i2 >= 28) {
            i.b(a3, aVar.f());
        }
        if (i2 >= 29) {
            j.c(a3, aVar.j());
        }
        if (i2 >= 31) {
            C0019k.a(a3, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        d.b(a3, bundle);
        d.a(this.f1346b, d.d(a3));
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        l.b bVar = new l.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> f(List<i0> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<i0> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return arrayList;
    }

    private void g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }

    @Override // androidx.core.app.i
    public Notification.Builder a() {
        return this.f1346b;
    }

    public Notification c() {
        Bundle a3;
        RemoteViews f2;
        RemoteViews d3;
        j.d dVar = this.f1347c.f1330p;
        if (dVar != null) {
            dVar.b(this);
        }
        RemoteViews e3 = dVar != null ? dVar.e(this) : null;
        Notification d4 = d();
        if (e3 != null || (e3 = this.f1347c.H) != null) {
            d4.contentView = e3;
        }
        if (dVar != null && (d3 = dVar.d(this)) != null) {
            d4.bigContentView = d3;
        }
        if (dVar != null && (f2 = this.f1347c.f1330p.f(this)) != null) {
            d4.headsUpContentView = f2;
        }
        if (dVar != null && (a3 = androidx.core.app.j.a(d4)) != null) {
            dVar.a(a3);
        }
        return d4;
    }

    protected Notification d() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            return a.a(this.f1346b);
        }
        if (i2 >= 24) {
            Notification a3 = a.a(this.f1346b);
            if (this.f1352h != 0) {
                if (d.f(a3) != null && (a3.flags & 512) != 0 && this.f1352h == 2) {
                    g(a3);
                }
                if (d.f(a3) != null && (a3.flags & 512) == 0 && this.f1352h == 1) {
                    g(a3);
                }
            }
            return a3;
        }
        c.a(this.f1346b, this.f1351g);
        Notification a4 = a.a(this.f1346b);
        RemoteViews remoteViews = this.f1348d;
        if (remoteViews != null) {
            a4.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f1349e;
        if (remoteViews2 != null) {
            a4.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f1353i;
        if (remoteViews3 != null) {
            a4.headsUpContentView = remoteViews3;
        }
        if (this.f1352h != 0) {
            if (d.f(a4) != null && (a4.flags & 512) != 0 && this.f1352h == 2) {
                g(a4);
            }
            if (d.f(a4) != null && (a4.flags & 512) == 0 && this.f1352h == 1) {
                g(a4);
            }
        }
        return a4;
    }
}
