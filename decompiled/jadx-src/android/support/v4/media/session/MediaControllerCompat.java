package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.util.Log;
import android.view.KeyEvent;
import androidx.core.app.f;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class MediaControllerCompat {

    /* renamed from: a, reason: collision with root package name */
    private final b f47a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaSessionCompat.Token f48b;

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private final ConcurrentHashMap<a, Boolean> f49c = new ConcurrentHashMap<>();

    static class MediaControllerImplApi21 implements b {

        /* renamed from: a, reason: collision with root package name */
        protected final MediaController f50a;

        /* renamed from: b, reason: collision with root package name */
        final Object f51b = new Object();

        /* renamed from: c, reason: collision with root package name */
        private final List<a> f52c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private HashMap<a, a> f53d = new HashMap<>();

        /* renamed from: e, reason: collision with root package name */
        final MediaSessionCompat.Token f54e;

        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: e, reason: collision with root package name */
            private WeakReference<MediaControllerImplApi21> f55e;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f55e = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i2, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f55e.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.f51b) {
                    mediaControllerImplApi21.f54e.d(b.a.j0(f.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerImplApi21.f54e.e(f0.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerImplApi21.b();
                }
            }
        }

        private static class a extends a.b {
            a(a aVar) {
                super(aVar);
            }

            @Override // android.support.v4.media.session.a
            public void E(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void I(List<MediaSessionCompat.QueueItem> list) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void d(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void h0(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void i() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void k(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }
        }

        MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f54e = token;
            this.f50a = new MediaController(context, (MediaSession.Token) token.c());
            if (token.a() == null) {
                c();
            }
        }

        private void c() {
            d("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean a(KeyEvent keyEvent) {
            return this.f50a.dispatchMediaButtonEvent(keyEvent);
        }

        void b() {
            if (this.f54e.a() == null) {
                return;
            }
            for (a aVar : this.f52c) {
                a aVar2 = new a(aVar);
                this.f53d.put(aVar, aVar2);
                aVar.f57b = aVar2;
                try {
                    this.f54e.a().g(aVar2);
                    aVar.i(13, null, null);
                } catch (RemoteException e3) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e3);
                }
            }
            this.f52c.clear();
        }

        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f50a.sendCommand(str, bundle, resultReceiver);
        }
    }

    public static abstract class a implements IBinder.DeathRecipient {

        /* renamed from: a, reason: collision with root package name */
        final MediaController.Callback f56a = new C0004a(this);

        /* renamed from: b, reason: collision with root package name */
        android.support.v4.media.session.a f57b;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a, reason: collision with other inner class name */
        private static class C0004a extends MediaController.Callback {

            /* renamed from: a, reason: collision with root package name */
            private final WeakReference<a> f58a;

            C0004a(a aVar) {
                this.f58a = new WeakReference<>(aVar);
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                a aVar = this.f58a.get();
                if (aVar != null) {
                    aVar.a(new c(playbackInfo.getPlaybackType(), AudioAttributesCompat.c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.b(bundle);
                a aVar = this.f58a.get();
                if (aVar != null) {
                    aVar.b(bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                a aVar = this.f58a.get();
                if (aVar != null) {
                    aVar.c(MediaMetadataCompat.b(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                a aVar = this.f58a.get();
                if (aVar == null || aVar.f57b != null) {
                    return;
                }
                aVar.d(PlaybackStateCompat.a(playbackState));
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                a aVar = this.f58a.get();
                if (aVar != null) {
                    aVar.e(MediaSessionCompat.QueueItem.b(list));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
                a aVar = this.f58a.get();
                if (aVar != null) {
                    aVar.f(charSequence);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                a aVar = this.f58a.get();
                if (aVar != null) {
                    aVar.g();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                a aVar = this.f58a.get();
                if (aVar != null) {
                    android.support.v4.media.session.a aVar2 = aVar.f57b;
                    aVar.h(str, bundle);
                }
            }
        }

        private static class b extends a.AbstractBinderC0006a {

            /* renamed from: b, reason: collision with root package name */
            private final WeakReference<a> f59b;

            b(a aVar) {
                this.f59b = new WeakReference<>(aVar);
            }

            @Override // android.support.v4.media.session.a
            public void C(int i2) {
                a aVar = this.f59b.get();
                if (aVar != null) {
                    aVar.i(12, Integer.valueOf(i2), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void D() {
                a aVar = this.f59b.get();
                if (aVar != null) {
                    aVar.i(13, null, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void b0(boolean z2) {
                a aVar = this.f59b.get();
                if (aVar != null) {
                    aVar.i(11, Boolean.valueOf(z2), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void c(boolean z2) {
            }

            @Override // android.support.v4.media.session.a
            public void d0(PlaybackStateCompat playbackStateCompat) {
                a aVar = this.f59b.get();
                if (aVar != null) {
                    aVar.i(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void e0(String str, Bundle bundle) {
                a aVar = this.f59b.get();
                if (aVar != null) {
                    aVar.i(1, str, bundle);
                }
            }

            @Override // android.support.v4.media.session.a
            public void r(int i2) {
                a aVar = this.f59b.get();
                if (aVar != null) {
                    aVar.i(9, Integer.valueOf(i2), null);
                }
            }
        }

        public void a(c cVar) {
        }

        public void b(Bundle bundle) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            i(8, null, null);
        }

        public void c(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void d(PlaybackStateCompat playbackStateCompat) {
        }

        public void e(List<MediaSessionCompat.QueueItem> list) {
        }

        public void f(CharSequence charSequence) {
        }

        public void g() {
        }

        public void h(String str, Bundle bundle) {
        }

        void i(int i2, Object obj, Bundle bundle) {
        }
    }

    interface b {
        boolean a(KeyEvent keyEvent);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f60a;

        /* renamed from: b, reason: collision with root package name */
        private final AudioAttributesCompat f61b;

        /* renamed from: c, reason: collision with root package name */
        private final int f62c;

        /* renamed from: d, reason: collision with root package name */
        private final int f63d;

        /* renamed from: e, reason: collision with root package name */
        private final int f64e;

        c(int i2, AudioAttributesCompat audioAttributesCompat, int i3, int i4, int i5) {
            this.f60a = i2;
            this.f61b = audioAttributesCompat;
            this.f62c = i3;
            this.f63d = i4;
            this.f64e = i5;
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        if (mediaSessionCompat == null) {
            throw new IllegalArgumentException("session must not be null");
        }
        MediaSessionCompat.Token d3 = mediaSessionCompat.d();
        this.f48b = d3;
        this.f47a = new MediaControllerImplApi21(context, d3);
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f47a.a(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }
}
