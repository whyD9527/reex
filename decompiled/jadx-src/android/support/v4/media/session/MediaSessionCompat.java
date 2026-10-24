package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager$RemoteUserInfo;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MediaSessionCompat {

    /* renamed from: d, reason: collision with root package name */
    public static final int f65d;

    /* renamed from: e, reason: collision with root package name */
    static int f66e;

    /* renamed from: a, reason: collision with root package name */
    private final c f67a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaControllerCompat f68b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<g> f69c;

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        private final MediaDescriptionCompat f70e;

        /* renamed from: f, reason: collision with root package name */
        private final long f71f;

        /* renamed from: g, reason: collision with root package name */
        private MediaSession.QueueItem f72g;

        class a implements Parcelable.Creator<QueueItem> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public QueueItem[] newArray(int i2) {
                return new QueueItem[i2];
            }
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j2) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j2 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f70e = mediaDescriptionCompat;
            this.f71f = j2;
            this.f72g = queueItem;
        }

        QueueItem(Parcel parcel) {
            this.f70e = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f71f = parcel.readLong();
        }

        public static QueueItem a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.a(queueItem.getDescription()), queueItem.getQueueId());
        }

        public static List<QueueItem> b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return arrayList;
        }

        public MediaDescriptionCompat c() {
            return this.f70e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f70e + ", Id=" + this.f71f + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            this.f70e.writeToParcel(parcel, i2);
            parcel.writeLong(this.f71f);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        ResultReceiver f73e;

        class a implements Parcelable.Creator<ResultReceiverWrapper> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper[] newArray(int i2) {
                return new ResultReceiverWrapper[i2];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f73e = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            this.f73e.writeToParcel(parcel, i2);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        private final Object f74e;

        /* renamed from: f, reason: collision with root package name */
        private final Object f75f;

        /* renamed from: g, reason: collision with root package name */
        private android.support.v4.media.session.b f76g;

        /* renamed from: h, reason: collision with root package name */
        private f0.b f77h;

        class a implements Parcelable.Creator<Token> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Token[] newArray(int i2) {
                return new Token[i2];
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        Token(Object obj, android.support.v4.media.session.b bVar, f0.b bVar2) {
            this.f74e = new Object();
            this.f75f = obj;
            this.f76g = bVar;
            this.f77h = bVar2;
        }

        public android.support.v4.media.session.b a() {
            android.support.v4.media.session.b bVar;
            synchronized (this.f74e) {
                bVar = this.f76g;
            }
            return bVar;
        }

        public f0.b b() {
            f0.b bVar;
            synchronized (this.f74e) {
                bVar = this.f77h;
            }
            return bVar;
        }

        public Object c() {
            return this.f75f;
        }

        public void d(android.support.v4.media.session.b bVar) {
            synchronized (this.f74e) {
                this.f76g = bVar;
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void e(f0.b bVar) {
            synchronized (this.f74e) {
                this.f77h = bVar;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.f75f;
            Object obj3 = ((Token) obj).f75f;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f75f;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable((Parcelable) this.f75f, i2);
        }
    }

    class a extends b {
        a() {
        }
    }

    public static abstract class b {

        /* renamed from: c, reason: collision with root package name */
        private boolean f81c;

        /* renamed from: e, reason: collision with root package name */
        a f83e;

        /* renamed from: a, reason: collision with root package name */
        final Object f79a = new Object();

        /* renamed from: b, reason: collision with root package name */
        final MediaSession.Callback f80b = new C0005b();

        /* renamed from: d, reason: collision with root package name */
        WeakReference<c> f82d = new WeakReference<>(null);

        private class a extends Handler {
            a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                c cVar;
                b bVar;
                a aVar;
                if (message.what == 1) {
                    synchronized (b.this.f79a) {
                        cVar = b.this.f82d.get();
                        bVar = b.this;
                        aVar = bVar.f83e;
                    }
                    if (cVar == null || bVar != cVar.h() || aVar == null) {
                        return;
                    }
                    cVar.b((b0.a) message.obj);
                    b.this.a(cVar, aVar);
                    cVar.b(null);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$b$b, reason: collision with other inner class name */
        private class C0005b extends MediaSession.Callback {
            C0005b() {
            }

            private void a(c cVar) {
                cVar.b(null);
            }

            private d b() {
                d dVar;
                synchronized (b.this.f79a) {
                    dVar = (d) b.this.f82d.get();
                }
                if (dVar == null || b.this != dVar.h()) {
                    return null;
                }
                return dVar;
            }

            private void c(c cVar) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String e3 = cVar.e();
                if (TextUtils.isEmpty(e3)) {
                    e3 = "android.media.session.MediaController";
                }
                cVar.b(new b0.a(e3, -1, -1));
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                b bVar;
                MediaDescriptionCompat c3;
                d b3 = b();
                if (b3 == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                c(b3);
                try {
                    QueueItem queueItem = null;
                    IBinder asBinder = null;
                    queueItem = null;
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle2 = new Bundle();
                        Token d3 = b3.d();
                        android.support.v4.media.session.b a3 = d3.a();
                        if (a3 != null) {
                            asBinder = a3.asBinder();
                        }
                        androidx.core.app.f.b(bundle2, "android.support.v4.media.session.EXTRA_BINDER", asBinder);
                        f0.a.c(bundle2, "android.support.v4.media.session.SESSION_TOKEN2", d3.b());
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        b.this.b((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        b.this.c((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                    } else {
                        if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                            bVar = b.this;
                            c3 = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                            b.this.d(str, bundle, resultReceiver);
                        } else if (b3.f93h != null) {
                            int i2 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                            if (i2 >= 0 && i2 < b3.f93h.size()) {
                                queueItem = b3.f93h.get(i2);
                            }
                            if (queueItem != null) {
                                bVar = b.this;
                                c3 = queueItem.c();
                            }
                        }
                        bVar.q(c3);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                a(b3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String str, Bundle bundle) {
                d b3 = b();
                if (b3 == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                c(b3);
                try {
                    if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.b(bundle2);
                        b.this.l(uri, bundle2);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        b.this.m();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.b(bundle3);
                        b.this.n(string, bundle3);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.b(bundle4);
                        b.this.o(string2, bundle4);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.b(bundle5);
                        b.this.p(uri2, bundle5);
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        b.this.t(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        b.this.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        b.this.y(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                        Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.b(bundle6);
                        b.this.w(ratingCompat, bundle6);
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        b.this.u(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                    } else {
                        b.this.e(str, bundle);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                a(b3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                d b3 = b();
                if (b3 == null) {
                    return;
                }
                c(b3);
                b.this.f();
                a(b3);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent intent) {
                d b3 = b();
                if (b3 == null) {
                    return false;
                }
                c(b3);
                boolean g2 = b.this.g(intent);
                a(b3);
                return g2 || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                d b3 = b();
                if (b3 == null) {
                    return;
                }
                c(b3);
                b.this.h();
                a(b3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                d b3 = b();
                if (b3 == null) {
                    return;
                }
                c(b3);
                b.this.i();
                a(b3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String str, Bundle bundle) {
                d b3 = b();
                if (b3 == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                c(b3);
                b.this.j(str, bundle);
                a(b3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String str, Bundle bundle) {
                d b3 = b();
                if (b3 == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                c(b3);
                b.this.k(str, bundle);
                a(b3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                d b3 = b();
                if (b3 == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                c(b3);
                b.this.l(uri, bundle);
                a(b3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepare() {
                d b3 = b();
                if (b3 == null) {
                    return;
                }
                c(b3);
                b.this.m();
                a(b3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                d b3 = b();
                if (b3 == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                c(b3);
                b.this.n(str, bundle);
                a(b3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromSearch(String str, Bundle bundle) {
                d b3 = b();
                if (b3 == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                c(b3);
                b.this.o(str, bundle);
                a(b3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                d b3 = b();
                if (b3 == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                c(b3);
                b.this.p(uri, bundle);
                a(b3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                d b3 = b();
                if (b3 == null) {
                    return;
                }
                c(b3);
                b.this.r();
                a(b3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j2) {
                d b3 = b();
                if (b3 == null) {
                    return;
                }
                c(b3);
                b.this.s(j2);
                a(b3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetPlaybackSpeed(float f2) {
                d b3 = b();
                if (b3 == null) {
                    return;
                }
                c(b3);
                b.this.u(f2);
                a(b3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating rating) {
                d b3 = b();
                if (b3 == null) {
                    return;
                }
                c(b3);
                b.this.v(RatingCompat.a(rating));
                a(b3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                d b3 = b();
                if (b3 == null) {
                    return;
                }
                c(b3);
                b.this.z();
                a(b3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                d b3 = b();
                if (b3 == null) {
                    return;
                }
                c(b3);
                b.this.A();
                a(b3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j2) {
                d b3 = b();
                if (b3 == null) {
                    return;
                }
                c(b3);
                b.this.B(j2);
                a(b3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                d b3 = b();
                if (b3 == null) {
                    return;
                }
                c(b3);
                b.this.C();
                a(b3);
            }
        }

        public void A() {
        }

        public void B(long j2) {
        }

        public void C() {
        }

        void D(c cVar, Handler handler) {
            synchronized (this.f79a) {
                this.f82d = new WeakReference<>(cVar);
                a aVar = this.f83e;
                a aVar2 = null;
                if (aVar != null) {
                    aVar.removeCallbacksAndMessages(null);
                }
                if (cVar != null && handler != null) {
                    aVar2 = new a(handler.getLooper());
                }
                this.f83e = aVar2;
            }
        }

        void a(c cVar, Handler handler) {
            if (this.f81c) {
                this.f81c = false;
                handler.removeMessages(1);
                PlaybackStateCompat a3 = cVar.a();
                long b3 = a3 == null ? 0L : a3.b();
                boolean z2 = a3 != null && a3.g() == 3;
                boolean z3 = (516 & b3) != 0;
                boolean z4 = (b3 & 514) != 0;
                if (z2 && z4) {
                    h();
                } else {
                    if (z2 || !z3) {
                        return;
                    }
                    i();
                }
            }
        }

        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat, int i2) {
        }

        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void e(String str, Bundle bundle) {
        }

        public void f() {
        }

        public boolean g(Intent intent) {
            c cVar;
            a aVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.f79a) {
                cVar = this.f82d.get();
                aVar = this.f83e;
            }
            if (cVar == null || aVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            b0.a k2 = cVar.k();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                a(cVar, aVar);
                return false;
            }
            if (keyEvent.getRepeatCount() != 0) {
                a(cVar, aVar);
            } else if (this.f81c) {
                aVar.removeMessages(1);
                this.f81c = false;
                PlaybackStateCompat a3 = cVar.a();
                if (((a3 == null ? 0L : a3.b()) & 32) != 0) {
                    z();
                }
            } else {
                this.f81c = true;
                aVar.sendMessageDelayed(aVar.obtainMessage(1, k2), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        public void h() {
        }

        public void i() {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k(String str, Bundle bundle) {
        }

        public void l(Uri uri, Bundle bundle) {
        }

        public void m() {
        }

        public void n(String str, Bundle bundle) {
        }

        public void o(String str, Bundle bundle) {
        }

        public void p(Uri uri, Bundle bundle) {
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void r() {
        }

        public void s(long j2) {
        }

        public void t(boolean z2) {
        }

        public void u(float f2) {
        }

        public void v(RatingCompat ratingCompat) {
        }

        public void w(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void x(int i2) {
        }

        public void y(int i2) {
        }

        public void z() {
        }
    }

    interface c {
        PlaybackStateCompat a();

        void b(b0.a aVar);

        void c(boolean z2);

        Token d();

        String e();

        void f(PlaybackStateCompat playbackStateCompat);

        void g(b bVar, Handler handler);

        b h();

        void i(MediaMetadataCompat mediaMetadataCompat);

        void j(PendingIntent pendingIntent);

        b0.a k();
    }

    static class d implements c {

        /* renamed from: a, reason: collision with root package name */
        final MediaSession f86a;

        /* renamed from: b, reason: collision with root package name */
        final Token f87b;

        /* renamed from: d, reason: collision with root package name */
        Bundle f89d;

        /* renamed from: g, reason: collision with root package name */
        PlaybackStateCompat f92g;

        /* renamed from: h, reason: collision with root package name */
        List<QueueItem> f93h;

        /* renamed from: i, reason: collision with root package name */
        MediaMetadataCompat f94i;

        /* renamed from: j, reason: collision with root package name */
        int f95j;

        /* renamed from: k, reason: collision with root package name */
        boolean f96k;

        /* renamed from: l, reason: collision with root package name */
        int f97l;

        /* renamed from: m, reason: collision with root package name */
        int f98m;

        /* renamed from: n, reason: collision with root package name */
        b f99n;

        /* renamed from: o, reason: collision with root package name */
        b0.a f100o;

        /* renamed from: c, reason: collision with root package name */
        final Object f88c = new Object();

        /* renamed from: e, reason: collision with root package name */
        boolean f90e = false;

        /* renamed from: f, reason: collision with root package name */
        final RemoteCallbackList<android.support.v4.media.session.a> f91f = new RemoteCallbackList<>();

        class a extends b.a {
            a() {
            }

            @Override // android.support.v4.media.session.b
            public boolean A() {
                return d.this.f96k;
            }

            @Override // android.support.v4.media.session.b
            public void B() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void F() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void G(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public List<QueueItem> H() {
                return null;
            }

            @Override // android.support.v4.media.session.b
            public void J(int i2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void K() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public CharSequence L() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat M() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void N(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public Bundle O() {
                if (d.this.f89d == null) {
                    return null;
                }
                return new Bundle(d.this.f89d);
            }

            @Override // android.support.v4.media.session.b
            public void P(android.support.v4.media.session.a aVar) {
                d.this.f91f.unregister(aVar);
            }

            @Override // android.support.v4.media.session.b
            public void Q(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public long R() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int S() {
                return d.this.f97l;
            }

            @Override // android.support.v4.media.session.b
            public void T(long j2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void U(boolean z2) {
            }

            @Override // android.support.v4.media.session.b
            public void V(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo W() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void X() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void Y(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void Z(long j2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat a() {
                d dVar = d.this;
                return MediaSessionCompat.e(dVar.f92g, dVar.f94i);
            }

            @Override // android.support.v4.media.session.b
            public void a0(int i2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void b() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String c0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void e(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void f(int i2, int i3, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void f0(float f2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void g(android.support.v4.media.session.a aVar) {
                if (d.this.f90e) {
                    return;
                }
                d.this.f91f.register(aVar, new b0.a("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
            }

            @Override // android.support.v4.media.session.b
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void h(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean i0(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void j(MediaDescriptionCompat mediaDescriptionCompat, int i2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String l() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean m() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void n(boolean z2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void next() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void o(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void p(int i2, int i3, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void previous() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void q(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void s(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void stop() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean t() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void u(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent v() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int w() {
                return d.this.f98m;
            }

            @Override // android.support.v4.media.session.b
            public void x(int i2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int y() {
                return d.this.f95j;
            }

            @Override // android.support.v4.media.session.b
            public void z(String str, Bundle bundle) {
                throw new AssertionError();
            }
        }

        d(MediaSession mediaSession, f0.b bVar, Bundle bundle) {
            this.f86a = mediaSession;
            this.f87b = new Token(mediaSession.getSessionToken(), new a(), bVar);
            this.f89d = bundle;
            l(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public PlaybackStateCompat a() {
            return this.f92g;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void b(b0.a aVar) {
            synchronized (this.f88c) {
                this.f100o = aVar;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void c(boolean z2) {
            this.f86a.setActive(z2);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Token d() {
            return this.f87b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public String e() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.f86a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.f86a, new Object[0]);
            } catch (Exception e3) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e3);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void f(PlaybackStateCompat playbackStateCompat) {
            this.f92g = playbackStateCompat;
            for (int beginBroadcast = this.f91f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f91f.getBroadcastItem(beginBroadcast).d0(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f91f.finishBroadcast();
            this.f86a.setPlaybackState(playbackStateCompat == null ? null : (PlaybackState) playbackStateCompat.e());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void g(b bVar, Handler handler) {
            synchronized (this.f88c) {
                this.f99n = bVar;
                this.f86a.setCallback(bVar == null ? null : bVar.f80b, handler);
                if (bVar != null) {
                    bVar.D(this, handler);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public b h() {
            b bVar;
            synchronized (this.f88c) {
                bVar = this.f99n;
            }
            return bVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void i(MediaMetadataCompat mediaMetadataCompat) {
            this.f94i = mediaMetadataCompat;
            this.f86a.setMetadata(mediaMetadataCompat == null ? null : (MediaMetadata) mediaMetadataCompat.d());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void j(PendingIntent pendingIntent) {
            this.f86a.setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public b0.a k() {
            b0.a aVar;
            synchronized (this.f88c) {
                aVar = this.f100o;
            }
            return aVar;
        }

        @SuppressLint({"WrongConstant"})
        public void l(int i2) {
            this.f86a.setFlags(i2 | 1 | 2);
        }
    }

    static class e extends d {
        e(MediaSession mediaSession, f0.b bVar, Bundle bundle) {
            super(mediaSession, bVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d, android.support.v4.media.session.MediaSessionCompat.c
        public void b(b0.a aVar) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d, android.support.v4.media.session.MediaSessionCompat.c
        public final b0.a k() {
            MediaSessionManager$RemoteUserInfo currentControllerInfo;
            currentControllerInfo = this.f86a.getCurrentControllerInfo();
            return new b0.a(currentControllerInfo);
        }
    }

    static class f extends e {
        f(MediaSession mediaSession, f0.b bVar, Bundle bundle) {
            super(mediaSession, bVar, bundle);
        }
    }

    public interface g {
        void a();
    }

    static {
        f65d = Build.VERSION.CODENAME.equals("S") ? 33554432 : 0;
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, null);
    }

    @SuppressLint({"WrongConstant"})
    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, f0.b bVar) {
        this.f69c = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        if (componentName == null && (componentName = d0.a.a(context)) == null) {
            Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent, f65d);
        }
        int i2 = Build.VERSION.SDK_INT;
        MediaSession a3 = a(context, str, bundle);
        this.f67a = i2 >= 29 ? new f(a3, bVar, bundle) : i2 >= 28 ? new e(a3, bVar, bundle) : new d(a3, bVar, bundle);
        h(new a(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        this.f67a.j(pendingIntent);
        this.f68b = new MediaControllerCompat(context, this);
        if (f66e == 0) {
            f66e = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    private MediaSession a(Context context, String str, Bundle bundle) {
        return Build.VERSION.SDK_INT >= 29 ? new MediaSession(context, str, bundle) : new MediaSession(context, str);
    }

    public static void b(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    static PlaybackStateCompat e(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j2 = -1;
        if (playbackStateCompat.f() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.g() != 3 && playbackStateCompat.g() != 4 && playbackStateCompat.g() != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.c() <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long d3 = ((long) (playbackStateCompat.d() * (elapsedRealtime - r0))) + playbackStateCompat.f();
        if (mediaMetadataCompat != null && mediaMetadataCompat.a("android.media.metadata.DURATION")) {
            j2 = mediaMetadataCompat.c("android.media.metadata.DURATION");
        }
        return new PlaybackStateCompat.b(playbackStateCompat).d(playbackStateCompat.g(), (j2 < 0 || d3 <= j2) ? d3 < 0 ? 0L : d3 : j2, playbackStateCompat.d(), elapsedRealtime).a();
    }

    public static Bundle k(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        b(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public MediaControllerCompat c() {
        return this.f68b;
    }

    public Token d() {
        return this.f67a.d();
    }

    public void f(boolean z2) {
        this.f67a.c(z2);
        Iterator<g> it = this.f69c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void g(b bVar) {
        h(bVar, null);
    }

    public void h(b bVar, Handler handler) {
        if (bVar == null) {
            this.f67a.g(null, null);
            return;
        }
        c cVar = this.f67a;
        if (handler == null) {
            handler = new Handler();
        }
        cVar.g(bVar, handler);
    }

    public void i(MediaMetadataCompat mediaMetadataCompat) {
        this.f67a.i(mediaMetadataCompat);
    }

    public void j(PlaybackStateCompat playbackStateCompat) {
        this.f67a.f(playbackStateCompat);
    }
}
