package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class e {

    static class a {
        static int a(TypedArray typedArray, int i2) {
            return typedArray.getType(i2);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final d[] f1382a;

        public c(d[] dVarArr) {
            this.f1382a = dVarArr;
        }

        public d[] a() {
            return this.f1382a;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f1383a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1384b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f1385c;

        /* renamed from: d, reason: collision with root package name */
        private final String f1386d;

        /* renamed from: e, reason: collision with root package name */
        private final int f1387e;

        /* renamed from: f, reason: collision with root package name */
        private final int f1388f;

        public d(String str, int i2, boolean z2, String str2, int i3, int i4) {
            this.f1383a = str;
            this.f1384b = i2;
            this.f1385c = z2;
            this.f1386d = str2;
            this.f1387e = i3;
            this.f1388f = i4;
        }

        public String a() {
            return this.f1383a;
        }

        public int b() {
            return this.f1388f;
        }

        public int c() {
            return this.f1387e;
        }

        public String d() {
            return this.f1386d;
        }

        public int e() {
            return this.f1384b;
        }

        public boolean f() {
            return this.f1385c;
        }
    }

    /* renamed from: androidx.core.content.res.e$e, reason: collision with other inner class name */
    public static final class C0021e implements b {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.core.provider.e f1389a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1390b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1391c;

        /* renamed from: d, reason: collision with root package name */
        private final String f1392d;

        public C0021e(androidx.core.provider.e eVar, int i2, int i3, String str) {
            this.f1389a = eVar;
            this.f1391c = i2;
            this.f1390b = i3;
            this.f1392d = str;
        }

        public int a() {
            return this.f1391c;
        }

        public androidx.core.provider.e b() {
            return this.f1389a;
        }

        public String c() {
            return this.f1392d;
        }

        public int d() {
            return this.f1390b;
        }
    }

    private static int a(TypedArray typedArray, int i2) {
        return a.a(typedArray, i2);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i2)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r.d.f4264h);
        String string = obtainAttributes.getString(r.d.f4265i);
        String string2 = obtainAttributes.getString(r.d.f4269m);
        String string3 = obtainAttributes.getString(r.d.f4270n);
        int resourceId = obtainAttributes.getResourceId(r.d.f4266j, 0);
        int integer = obtainAttributes.getInteger(r.d.f4267k, 1);
        int integer2 = obtainAttributes.getInteger(r.d.f4268l, 500);
        String string4 = obtainAttributes.getString(r.d.f4271o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new C0021e(new androidx.core.provider.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r.d.f4272p);
        int i2 = r.d.f4281y;
        if (!obtainAttributes.hasValue(i2)) {
            i2 = r.d.f4274r;
        }
        int i3 = obtainAttributes.getInt(i2, 400);
        int i4 = r.d.f4279w;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = r.d.f4275s;
        }
        boolean z2 = 1 == obtainAttributes.getInt(i4, 0);
        int i5 = r.d.f4282z;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = r.d.f4276t;
        }
        int i6 = r.d.f4280x;
        if (!obtainAttributes.hasValue(i6)) {
            i6 = r.d.f4277u;
        }
        String string = obtainAttributes.getString(i6);
        int i7 = obtainAttributes.getInt(i5, 0);
        int i8 = r.d.f4278v;
        if (!obtainAttributes.hasValue(i8)) {
            i8 = r.d.f4273q;
        }
        int resourceId = obtainAttributes.getResourceId(i8, 0);
        String string2 = obtainAttributes.getString(i8);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i3, z2, string, i7, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
