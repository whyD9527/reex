package androidx.core.app;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.app.Person;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    CharSequence f1291a;

    /* renamed from: b, reason: collision with root package name */
    IconCompat f1292b;

    /* renamed from: c, reason: collision with root package name */
    String f1293c;

    /* renamed from: d, reason: collision with root package name */
    String f1294d;

    /* renamed from: e, reason: collision with root package name */
    boolean f1295e;

    /* renamed from: f, reason: collision with root package name */
    boolean f1296f;

    static class a {
        static i0 a(Person person) {
            return new b().f(person.getName()).c(person.getIcon() != null ? IconCompat.a(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        static Person b(i0 i0Var) {
            return new Object() { // from class: android.app.Person.Builder
                static {
                    throw new NoClassDefFoundError();
                }

                @NonNull
                public native /* synthetic */ Person build();

                @NonNull
                public native /* synthetic */ Builder setBot(boolean z2);

                @NonNull
                public native /* synthetic */ Builder setIcon(@Nullable Icon icon);

                @NonNull
                public native /* synthetic */ Builder setImportant(boolean z2);

                @NonNull
                public native /* synthetic */ Builder setKey(@Nullable String str);

                @NonNull
                public native /* synthetic */ Builder setName(@Nullable CharSequence charSequence);

                @NonNull
                public native /* synthetic */ Builder setUri(@Nullable String str);
            }.setName(i0Var.c()).setIcon(i0Var.a() != null ? i0Var.a().o() : null).setUri(i0Var.d()).setKey(i0Var.b()).setBot(i0Var.e()).setImportant(i0Var.f()).build();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        CharSequence f1297a;

        /* renamed from: b, reason: collision with root package name */
        IconCompat f1298b;

        /* renamed from: c, reason: collision with root package name */
        String f1299c;

        /* renamed from: d, reason: collision with root package name */
        String f1300d;

        /* renamed from: e, reason: collision with root package name */
        boolean f1301e;

        /* renamed from: f, reason: collision with root package name */
        boolean f1302f;

        public i0 a() {
            return new i0(this);
        }

        public b b(boolean z2) {
            this.f1301e = z2;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f1298b = iconCompat;
            return this;
        }

        public b d(boolean z2) {
            this.f1302f = z2;
            return this;
        }

        public b e(String str) {
            this.f1300d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f1297a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f1299c = str;
            return this;
        }
    }

    i0(b bVar) {
        this.f1291a = bVar.f1297a;
        this.f1292b = bVar.f1298b;
        this.f1293c = bVar.f1299c;
        this.f1294d = bVar.f1300d;
        this.f1295e = bVar.f1301e;
        this.f1296f = bVar.f1302f;
    }

    public IconCompat a() {
        return this.f1292b;
    }

    public String b() {
        return this.f1294d;
    }

    public CharSequence c() {
        return this.f1291a;
    }

    public String d() {
        return this.f1293c;
    }

    public boolean e() {
        return this.f1295e;
    }

    public boolean f() {
        return this.f1296f;
    }

    public String g() {
        String str = this.f1293c;
        if (str != null) {
            return str;
        }
        if (this.f1291a == null) {
            return "";
        }
        return "name:" + ((Object) this.f1291a);
    }

    public Person h() {
        return a.b(this);
    }
}
