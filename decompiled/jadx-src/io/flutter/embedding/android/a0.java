package io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import io.flutter.plugin.editing.d;
import java.util.HashSet;
import java.util.Map;
import y0.e;

/* loaded from: classes.dex */
public class a0 implements d.a, e.b {

    /* renamed from: a, reason: collision with root package name */
    protected final d[] f2963a;

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<KeyEvent> f2964b = new HashSet<>();

    /* renamed from: c, reason: collision with root package name */
    private final e f2965c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f2966a = 0;

        Character a(int i2) {
            char c3 = (char) i2;
            if ((Integer.MIN_VALUE & i2) != 0) {
                int i3 = i2 & Integer.MAX_VALUE;
                int i4 = this.f2966a;
                if (i4 != 0) {
                    i3 = KeyCharacterMap.getDeadChar(i4, i3);
                }
                this.f2966a = i3;
            } else {
                int i5 = this.f2966a;
                if (i5 != 0) {
                    int deadChar = KeyCharacterMap.getDeadChar(i5, i2);
                    if (deadChar > 0) {
                        c3 = (char) deadChar;
                    }
                    this.f2966a = 0;
                }
            }
            return Character.valueOf(c3);
        }
    }

    private class c {

        /* renamed from: a, reason: collision with root package name */
        final KeyEvent f2967a;

        /* renamed from: b, reason: collision with root package name */
        int f2968b;

        /* renamed from: c, reason: collision with root package name */
        boolean f2969c = false;

        private class a implements d.a {

            /* renamed from: a, reason: collision with root package name */
            boolean f2971a;

            private a() {
                this.f2971a = false;
            }

            @Override // io.flutter.embedding.android.a0.d.a
            public void a(boolean z2) {
                if (this.f2971a) {
                    throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
                }
                this.f2971a = true;
                c cVar = c.this;
                int i2 = cVar.f2968b - 1;
                cVar.f2968b = i2;
                boolean z3 = z2 | cVar.f2969c;
                cVar.f2969c = z3;
                if (i2 != 0 || z3) {
                    return;
                }
                a0.this.e(cVar.f2967a);
            }
        }

        c(KeyEvent keyEvent) {
            this.f2968b = a0.this.f2963a.length;
            this.f2967a = keyEvent;
        }

        public d.a a() {
            return new a();
        }
    }

    public interface d {

        public interface a {
            void a(boolean z2);
        }

        void a(KeyEvent keyEvent, a aVar);
    }

    public interface e {
        void a(KeyEvent keyEvent);

        boolean c(KeyEvent keyEvent);

        z0.c getBinaryMessenger();
    }

    public a0(e eVar) {
        this.f2965c = eVar;
        this.f2963a = new d[]{new z(eVar.getBinaryMessenger()), new u(new y0.d(eVar.getBinaryMessenger()))};
        new y0.e(eVar.getBinaryMessenger()).b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(KeyEvent keyEvent) {
        e eVar = this.f2965c;
        if (eVar == null || eVar.c(keyEvent)) {
            return;
        }
        this.f2964b.add(keyEvent);
        this.f2965c.a(keyEvent);
        if (this.f2964b.remove(keyEvent)) {
            n0.b.g("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
        }
    }

    @Override // y0.e.b
    public Map<Long, Long> a() {
        return ((z) this.f2963a[0]).h();
    }

    @Override // io.flutter.plugin.editing.d.a
    public boolean b(KeyEvent keyEvent) {
        if (this.f2964b.remove(keyEvent)) {
            return false;
        }
        if (this.f2963a.length <= 0) {
            e(keyEvent);
            return true;
        }
        c cVar = new c(keyEvent);
        for (d dVar : this.f2963a) {
            dVar.a(keyEvent, cVar.a());
        }
        return true;
    }

    public void d() {
        int size = this.f2964b.size();
        if (size > 0) {
            n0.b.g("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }
}
