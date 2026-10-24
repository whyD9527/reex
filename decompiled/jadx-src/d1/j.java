package d1;

import android.content.Context;
import android.util.Log;
import d1.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import s0.a;

/* loaded from: classes.dex */
public class j implements s0.a, a.b {

    /* renamed from: a, reason: collision with root package name */
    private Context f2565a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2566a;

        static {
            int[] iArr = new int[a.c.values().length];
            f2566a = iArr;
            try {
                iArr[a.c.ROOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2566a[a.c.MUSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2566a[a.c.PODCASTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2566a[a.c.RINGTONES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2566a[a.c.ALARMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2566a[a.c.NOTIFICATIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2566a[a.c.PICTURES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2566a[a.c.MOVIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2566a[a.c.DOWNLOADS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2566a[a.c.DCIM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2566a[a.c.DOCUMENTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private String i() {
        return f1.c.d(this.f2565a);
    }

    private String j() {
        return f1.c.c(this.f2565a);
    }

    private List<String> k() {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f2565a.getExternalCacheDirs()) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private List<String> m(a.c cVar) {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f2565a.getExternalFilesDirs(p(cVar))) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private String n() {
        File externalFilesDir = this.f2565a.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    private String o() {
        return this.f2565a.getCacheDir().getPath();
    }

    private String p(a.c cVar) {
        switch (a.f2566a[cVar.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "music";
            case 3:
                return "podcasts";
            case 4:
                return "ringtones";
            case 5:
                return "alarms";
            case 6:
                return "notifications";
            case 7:
                return "pictures";
            case 8:
                return "movies";
            case 9:
                return "downloads";
            case 10:
                return "dcim";
            case 11:
                return "documents";
            default:
                throw new RuntimeException("Unrecognized directory: " + cVar);
        }
    }

    private void q(z0.c cVar, Context context) {
        try {
            i.i(cVar, this);
        } catch (Exception e3) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e3);
        }
        this.f2565a = context;
    }

    @Override // d1.a.b
    public String a() {
        return o();
    }

    @Override // d1.a.b
    public String b() {
        return this.f2565a.getCacheDir().getPath();
    }

    @Override // d1.a.b
    public String c() {
        return j();
    }

    @Override // d1.a.b
    public List<String> d() {
        return k();
    }

    @Override // d1.a.b
    public String e() {
        return i();
    }

    @Override // d1.a.b
    public List<String> f(a.c cVar) {
        return m(cVar);
    }

    @Override // d1.a.b
    public String g() {
        return n();
    }

    @Override // s0.a
    public void h(a.b bVar) {
        q(bVar.b(), bVar.a());
    }

    @Override // s0.a
    public void l(a.b bVar) {
        i.i(bVar.b(), null);
    }
}
