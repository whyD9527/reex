package a1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import y0.g;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final g f9a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f10b;

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"AppBundleLocaleChanges", "DiscouragedApi"})
    final g.b f11c;

    class a implements g.b {
        a() {
        }

        @Override // y0.g.b
        public String a(String str, String str2) {
            Context context = b.this.f10b;
            if (str2 != null) {
                Locale b3 = b.b(str2);
                Configuration configuration = new Configuration(b.this.f10b.getResources().getConfiguration());
                configuration.setLocale(b3);
                context = b.this.f10b.createConfigurationContext(configuration);
            }
            int identifier = context.getResources().getIdentifier(str, "string", b.this.f10b.getPackageName());
            if (identifier != 0) {
                return context.getResources().getString(identifier);
            }
            return null;
        }
    }

    public b(Context context, g gVar) {
        a aVar = new a();
        this.f11c = aVar;
        this.f10b = context;
        this.f9a = gVar;
        gVar.c(aVar);
    }

    public static Locale b(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        String str4 = "";
        int i2 = 1;
        if (split.length <= 1 || split[1].length() != 4) {
            str2 = "";
        } else {
            str2 = split[1];
            i2 = 2;
        }
        if (split.length > i2 && split[i2].length() >= 2 && split[i2].length() <= 3) {
            str4 = split[i2];
        }
        return new Locale(str3, str4, str2);
    }

    public Locale c(List<Locale> list) {
        LocaleList locales;
        LocaleList locales2;
        Locale lookup;
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            ArrayList arrayList = new ArrayList();
            locales2 = this.f10b.getResources().getConfiguration().getLocales();
            int size = locales2.size();
            for (int i3 = 0; i3 < size; i3++) {
                Locale locale = locales2.get(i3);
                String language = locale.getLanguage();
                if (!locale.getScript().isEmpty()) {
                    language = language + "-" + locale.getScript();
                }
                if (!locale.getCountry().isEmpty()) {
                    language = language + "-" + locale.getCountry();
                }
                arrayList.add(new Locale.LanguageRange(language));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage()));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage() + "-*"));
            }
            lookup = Locale.lookup(arrayList, list);
            if (lookup != null) {
                return lookup;
            }
        } else if (i2 >= 24) {
            locales = this.f10b.getResources().getConfiguration().getLocales();
            for (int i4 = 0; i4 < locales.size(); i4++) {
                Locale locale2 = locales.get(i4);
                for (Locale locale3 : list) {
                    if (locale2.equals(locale3)) {
                        return locale3;
                    }
                }
                for (Locale locale4 : list) {
                    if (locale2.getLanguage().equals(locale4.toLanguageTag())) {
                        return locale4;
                    }
                }
                for (Locale locale5 : list) {
                    if (locale2.getLanguage().equals(locale5.getLanguage())) {
                        return locale5;
                    }
                }
            }
        } else {
            Locale locale6 = this.f10b.getResources().getConfiguration().locale;
            if (locale6 != null) {
                for (Locale locale7 : list) {
                    if (locale6.equals(locale7)) {
                        return locale7;
                    }
                }
                for (Locale locale8 : list) {
                    if (locale6.getLanguage().equals(locale8.toString())) {
                        return locale8;
                    }
                }
            }
        }
        return list.get(0);
    }

    public void d(Configuration configuration) {
        LocaleList locales;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            locales = configuration.getLocales();
            int size = locales.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(locales.get(i2));
            }
        } else {
            arrayList.add(configuration.locale);
        }
        this.f9a.b(arrayList);
    }
}
