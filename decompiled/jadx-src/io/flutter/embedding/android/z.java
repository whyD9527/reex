package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.a0;
import io.flutter.embedding.android.b0;
import io.flutter.embedding.android.v;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import z0.c;

/* loaded from: classes.dex */
public class z implements a0.d {

    /* renamed from: a, reason: collision with root package name */
    private final z0.c f3115a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<Long, Long> f3116b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<Long, b0.e> f3117c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final a0.b f3118d = new a0.b();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3119a;

        static {
            int[] iArr = new int[v.b.values().length];
            f3119a = iArr;
            try {
                iArr[v.b.kDown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3119a[v.b.kUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3119a[v.b.kRepeat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public z(z0.c cVar) {
        this.f3115a = cVar;
        for (b0.e eVar : b0.a()) {
            this.f3117c.put(Long.valueOf(eVar.f2982c), eVar);
        }
    }

    private static v.b e(KeyEvent keyEvent) {
        boolean z2 = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z2 ? v.b.kRepeat : v.b.kDown;
        }
        if (action == 1) {
            return v.b.kUp;
        }
        throw new AssertionError("Unexpected event type");
    }

    private Long f(KeyEvent keyEvent) {
        Long l2 = b0.f2974b.get(Long.valueOf(keyEvent.getKeyCode()));
        return l2 != null ? l2 : Long.valueOf(j(keyEvent.getKeyCode(), 73014444032L));
    }

    private Long g(KeyEvent keyEvent) {
        int scanCode;
        long scanCode2 = keyEvent.getScanCode();
        if (scanCode2 == 0) {
            scanCode = keyEvent.getKeyCode();
        } else {
            Long l2 = b0.f2973a.get(Long.valueOf(scanCode2));
            if (l2 != null) {
                return l2;
            }
            scanCode = keyEvent.getScanCode();
        }
        return Long.valueOf(j(scanCode, 73014444032L));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0144 A[LOOP:2: B:62:0x013e->B:64:0x0144, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean i(KeyEvent keyEvent, a0.d.a aVar) {
        boolean z2;
        v.b bVar;
        String str;
        Iterator<Runnable> it;
        b0.e eVar;
        char charValue;
        if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
            return false;
        }
        Long g2 = g(keyEvent);
        Long f2 = f(keyEvent);
        ArrayList<Runnable> arrayList = new ArrayList<>();
        for (b0.d dVar : b0.f2975c) {
            o(dVar, (keyEvent.getMetaState() & dVar.f2978a) != 0, f2.longValue(), g2.longValue(), keyEvent, arrayList);
        }
        for (b0.e eVar2 : this.f3117c.values()) {
            p(eVar2, (keyEvent.getMetaState() & eVar2.f2980a) != 0, f2.longValue(), keyEvent);
        }
        int action = keyEvent.getAction();
        if (action == 0) {
            z2 = true;
        } else {
            if (action != 1) {
                return false;
            }
            z2 = false;
        }
        Long l2 = this.f3116b.get(g2);
        if (z2) {
            if (l2 != null) {
                if (keyEvent.getRepeatCount() > 0) {
                    bVar = v.b.kRepeat;
                    charValue = this.f3118d.a(keyEvent.getUnicodeChar()).charValue();
                    if (charValue != 0) {
                        str = "" + charValue;
                        if (bVar != v.b.kRepeat) {
                            r(g2, z2 ? f2 : null);
                        }
                        if (bVar == v.b.kDown && (eVar = this.f3117c.get(f2)) != null) {
                            eVar.f2983d = !eVar.f2983d;
                        }
                        v vVar = new v();
                        int source = keyEvent.getSource();
                        vVar.f3093f = source == 513 ? source != 1025 ? source != 16777232 ? source != 33554433 ? v.a.kKeyboard : v.a.kHdmi : v.a.kJoystick : v.a.kGamepad : v.a.kDirectionalPad;
                        vVar.f3088a = keyEvent.getEventTime();
                        vVar.f3089b = bVar;
                        vVar.f3091d = f2.longValue();
                        vVar.f3090c = g2.longValue();
                        vVar.f3094g = str;
                        vVar.f3092e = false;
                        vVar.f3093f = v.a.kKeyboard;
                        n(vVar, aVar);
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next().run();
                        }
                        return true;
                    }
                } else {
                    q(false, l2, g2, keyEvent.getEventTime());
                }
            }
            bVar = v.b.kDown;
            charValue = this.f3118d.a(keyEvent.getUnicodeChar()).charValue();
            if (charValue != 0) {
            }
        } else {
            if (l2 == null) {
                return false;
            }
            bVar = v.b.kUp;
        }
        str = null;
        if (bVar != v.b.kRepeat) {
        }
        if (bVar == v.b.kDown) {
            eVar.f2983d = !eVar.f2983d;
        }
        v vVar2 = new v();
        int source2 = keyEvent.getSource();
        vVar2.f3093f = source2 == 513 ? source2 != 1025 ? source2 != 16777232 ? source2 != 33554433 ? v.a.kKeyboard : v.a.kHdmi : v.a.kJoystick : v.a.kGamepad : v.a.kDirectionalPad;
        vVar2.f3088a = keyEvent.getEventTime();
        vVar2.f3089b = bVar;
        vVar2.f3091d = f2.longValue();
        vVar2.f3090c = g2.longValue();
        vVar2.f3094g = str;
        vVar2.f3092e = false;
        vVar2.f3093f = v.a.kKeyboard;
        n(vVar2, aVar);
        it = arrayList.iterator();
        while (it.hasNext()) {
        }
        return true;
    }

    private static long j(long j2, long j3) {
        return (j2 & 4294967295L) | j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(a0.d.a aVar, ByteBuffer byteBuffer) {
        Boolean bool = Boolean.FALSE;
        byteBuffer.rewind();
        if (byteBuffer.capacity() != 0) {
            bool = Boolean.valueOf(byteBuffer.get() != 0);
        }
        aVar.a(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(b0.c cVar, long j2, KeyEvent keyEvent) {
        q(false, Long.valueOf(cVar.f2977b), Long.valueOf(j2), keyEvent.getEventTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(b0.c cVar, KeyEvent keyEvent) {
        q(false, Long.valueOf(cVar.f2977b), Long.valueOf(cVar.f2976a), keyEvent.getEventTime());
    }

    private void n(v vVar, final a0.d.a aVar) {
        this.f3115a.d("flutter/keydata", vVar.a(), aVar == null ? null : new c.b() { // from class: io.flutter.embedding.android.w
            @Override // z0.c.b
            public final void a(ByteBuffer byteBuffer) {
                z.k(a0.d.a.this, byteBuffer);
            }
        });
    }

    private void q(boolean z2, Long l2, Long l3, long j2) {
        v vVar = new v();
        vVar.f3088a = j2;
        vVar.f3089b = z2 ? v.b.kDown : v.b.kUp;
        vVar.f3091d = l2.longValue();
        vVar.f3090c = l3.longValue();
        vVar.f3094g = null;
        vVar.f3092e = true;
        vVar.f3093f = v.a.kKeyboard;
        if (l3.longValue() != 0 && l2.longValue() != 0) {
            if (!z2) {
                l2 = null;
            }
            r(l3, l2);
        }
        n(vVar, null);
    }

    @Override // io.flutter.embedding.android.a0.d
    public void a(KeyEvent keyEvent, a0.d.a aVar) {
        if (i(keyEvent, aVar)) {
            return;
        }
        q(true, 0L, 0L, 0L);
        aVar.a(true);
    }

    public Map<Long, Long> h() {
        return Collections.unmodifiableMap(this.f3116b);
    }

    void o(b0.d dVar, boolean z2, long j2, final long j3, final KeyEvent keyEvent, ArrayList<Runnable> arrayList) {
        b0.c[] cVarArr = dVar.f2979b;
        boolean[] zArr = new boolean[cVarArr.length];
        Boolean[] boolArr = new Boolean[cVarArr.length];
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            b0.c[] cVarArr2 = dVar.f2979b;
            boolean z4 = true;
            if (i2 >= cVarArr2.length) {
                break;
            }
            final b0.c cVar = cVarArr2[i2];
            boolean containsKey = this.f3116b.containsKey(Long.valueOf(cVar.f2976a));
            zArr[i2] = containsKey;
            if (cVar.f2977b == j2) {
                int i3 = a.f3119a[e(keyEvent).ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        boolArr[i2] = Boolean.valueOf(zArr[i2]);
                    } else if (i3 == 3) {
                        if (!z2) {
                            arrayList.add(new Runnable() { // from class: io.flutter.embedding.android.y
                                @Override // java.lang.Runnable
                                public final void run() {
                                    z.this.m(cVar, keyEvent);
                                }
                            });
                        }
                        boolArr[i2] = Boolean.valueOf(zArr[i2]);
                    }
                    i2++;
                } else {
                    boolArr[i2] = Boolean.FALSE;
                    if (!z2) {
                        arrayList.add(new Runnable() { // from class: io.flutter.embedding.android.x
                            @Override // java.lang.Runnable
                            public final void run() {
                                z.this.l(cVar, j3, keyEvent);
                            }
                        });
                    }
                }
            } else if (!z3 && !containsKey) {
                z4 = false;
            }
            z3 = z4;
            i2++;
        }
        if (z2) {
            for (int i4 = 0; i4 < dVar.f2979b.length; i4++) {
                if (boolArr[i4] == null) {
                    if (z3) {
                        boolArr[i4] = Boolean.valueOf(zArr[i4]);
                    } else {
                        boolArr[i4] = Boolean.TRUE;
                        z3 = true;
                    }
                }
            }
            if (!z3) {
                boolArr[0] = Boolean.TRUE;
            }
        } else {
            for (int i5 = 0; i5 < dVar.f2979b.length; i5++) {
                if (boolArr[i5] == null) {
                    boolArr[i5] = Boolean.FALSE;
                }
            }
        }
        for (int i6 = 0; i6 < dVar.f2979b.length; i6++) {
            if (zArr[i6] != boolArr[i6].booleanValue()) {
                b0.c cVar2 = dVar.f2979b[i6];
                q(boolArr[i6].booleanValue(), Long.valueOf(cVar2.f2977b), Long.valueOf(cVar2.f2976a), keyEvent.getEventTime());
            }
        }
    }

    void p(b0.e eVar, boolean z2, long j2, KeyEvent keyEvent) {
        if (eVar.f2982c == j2 || eVar.f2983d == z2) {
            return;
        }
        boolean z3 = !this.f3116b.containsKey(Long.valueOf(eVar.f2981b));
        if (z3) {
            eVar.f2983d = !eVar.f2983d;
        }
        q(z3, Long.valueOf(eVar.f2982c), Long.valueOf(eVar.f2981b), keyEvent.getEventTime());
        if (!z3) {
            eVar.f2983d = !eVar.f2983d;
        }
        q(!z3, Long.valueOf(eVar.f2982c), Long.valueOf(eVar.f2981b), keyEvent.getEventTime());
    }

    void r(Long l2, Long l3) {
        if (l3 != null) {
            if (this.f3116b.put(l2, l3) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (this.f3116b.remove(l2) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
