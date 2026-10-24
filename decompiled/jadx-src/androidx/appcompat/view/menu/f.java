package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.j;

/* loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: e, reason: collision with root package name */
    private e f351e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.appcompat.app.a f352f;

    /* renamed from: g, reason: collision with root package name */
    c f353g;

    /* renamed from: h, reason: collision with root package name */
    private j.a f354h;

    public f(e eVar) {
        this.f351e = eVar;
    }

    public void a() {
        androidx.appcompat.app.a aVar = this.f352f;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void b(e eVar, boolean z2) {
        if (z2 || eVar == this.f351e) {
            a();
        }
        j.a aVar = this.f354h;
        if (aVar != null) {
            aVar.b(eVar, z2);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean c(e eVar) {
        j.a aVar = this.f354h;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.f351e;
        a.C0010a c0010a = new a.C0010a(eVar.u());
        c cVar = new c(c0010a.b(), b.g.f2258j);
        this.f353g = cVar;
        cVar.k(this);
        this.f351e.b(this.f353g);
        c0010a.c(this.f353g.a(), this);
        View y2 = eVar.y();
        if (y2 != null) {
            c0010a.d(y2);
        } else {
            c0010a.e(eVar.w()).h(eVar.x());
        }
        c0010a.f(this);
        androidx.appcompat.app.a a3 = c0010a.a();
        this.f352f = a3;
        a3.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f352f.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f352f.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f351e.L((g) this.f353g.a().getItem(i2), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f353g.b(this.f351e, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f352f.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f352f.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f351e.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f351e.performShortcut(i2, keyEvent, 0);
    }
}
