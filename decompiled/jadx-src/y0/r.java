package y0;

import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z0.k;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final z0.k f4676a;

    /* renamed from: b, reason: collision with root package name */
    private f f4677b;

    /* renamed from: c, reason: collision with root package name */
    final k.c f4678c;

    class a implements k.c {
        a() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // z0.k.c
        public void m(z0.j jVar, k.d dVar) {
            Bundle bundle;
            if (r.this.f4677b == null) {
            }
            String str = jVar.f4754a;
            Object obj = jVar.f4755b;
            n0.b.f("TextInputChannel", "Received '" + str + "' message.");
            str.hashCode();
            char c3 = 65535;
            switch (str.hashCode()) {
                case -1779068172:
                    if (str.equals("TextInput.setPlatformViewClient")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -1015421462:
                    if (str.equals("TextInput.setEditingState")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case -37561188:
                    if (str.equals("TextInput.setClient")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 270476819:
                    if (str.equals("TextInput.hide")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case 270803918:
                    if (str.equals("TextInput.show")) {
                        c3 = 4;
                        break;
                    }
                    break;
                case 649192816:
                    if (str.equals("TextInput.sendAppPrivateCommand")) {
                        c3 = 5;
                        break;
                    }
                    break;
                case 1204752139:
                    if (str.equals("TextInput.setEditableSizeAndTransform")) {
                        c3 = 6;
                        break;
                    }
                    break;
                case 1727570905:
                    if (str.equals("TextInput.finishAutofillContext")) {
                        c3 = 7;
                        break;
                    }
                    break;
                case 1904427655:
                    if (str.equals("TextInput.clearClient")) {
                        c3 = '\b';
                        break;
                    }
                    break;
                case 2113369584:
                    if (str.equals("TextInput.requestAutofill")) {
                        c3 = '\t';
                        break;
                    }
                    break;
            }
            try {
                switch (c3) {
                    case 0:
                        JSONObject jSONObject = (JSONObject) obj;
                        r.this.f4677b.f(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                        dVar.a(null);
                        break;
                    case 1:
                        r.this.f4677b.c(e.a((JSONObject) obj));
                        dVar.a(null);
                        break;
                    case 2:
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            r.this.f4677b.d(jSONArray.getInt(0), b.a(jSONArray.getJSONObject(1)));
                            dVar.a(null);
                            break;
                        } catch (NoSuchFieldException e3) {
                            e = e3;
                            dVar.c("error", e.getMessage(), null);
                            return;
                        }
                    case 3:
                        r.this.f4677b.j();
                        dVar.a(null);
                        break;
                    case 4:
                        r.this.f4677b.a();
                        dVar.a(null);
                        break;
                    case 5:
                        JSONObject jSONObject2 = (JSONObject) obj;
                        String string = jSONObject2.getString("action");
                        String string2 = jSONObject2.getString("data");
                        if (string2 == null || string2.isEmpty()) {
                            bundle = null;
                        } else {
                            bundle = new Bundle();
                            bundle.putString("data", string2);
                        }
                        r.this.f4677b.e(string, bundle);
                        dVar.a(null);
                        break;
                    case 6:
                        JSONObject jSONObject3 = (JSONObject) obj;
                        double d3 = jSONObject3.getDouble("width");
                        double d4 = jSONObject3.getDouble("height");
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                        double[] dArr = new double[16];
                        for (int i2 = 0; i2 < 16; i2++) {
                            dArr[i2] = jSONArray2.getDouble(i2);
                        }
                        r.this.f4677b.g(d3, d4, dArr);
                        dVar.a(null);
                        break;
                    case 7:
                        r.this.f4677b.i(((Boolean) obj).booleanValue());
                        dVar.a(null);
                        break;
                    case '\b':
                        r.this.f4677b.b();
                        dVar.a(null);
                        break;
                    case '\t':
                        r.this.f4677b.h();
                        dVar.a(null);
                        break;
                    default:
                        dVar.b();
                        break;
                }
            } catch (JSONException e4) {
                e = e4;
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4680a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f4681b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f4682c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f4683d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f4684e;

        /* renamed from: f, reason: collision with root package name */
        public final d f4685f;

        /* renamed from: g, reason: collision with root package name */
        public final c f4686g;

        /* renamed from: h, reason: collision with root package name */
        public final Integer f4687h;

        /* renamed from: i, reason: collision with root package name */
        public final String f4688i;

        /* renamed from: j, reason: collision with root package name */
        public final a f4689j;

        /* renamed from: k, reason: collision with root package name */
        public final String[] f4690k;

        /* renamed from: l, reason: collision with root package name */
        public final b[] f4691l;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final String f4692a;

            /* renamed from: b, reason: collision with root package name */
            public final String[] f4693b;

            /* renamed from: c, reason: collision with root package name */
            public final e f4694c;

            /* renamed from: d, reason: collision with root package name */
            public final String f4695d;

            public a(String str, String[] strArr, String str2, e eVar) {
                this.f4692a = str;
                this.f4693b = strArr;
                this.f4695d = str2;
                this.f4694c = eVar;
            }

            public static a a(JSONObject jSONObject) {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    strArr[i2] = b(jSONArray.getString(i2));
                }
                return new a(string, strArr, string2, e.a(jSONObject2));
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x00a3, code lost:
            
                if (r16.equals("familyName") == false) goto L7;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String b(String str) {
                char c3 = 26;
                if (Build.VERSION.SDK_INT < 26) {
                    return str;
                }
                str.hashCode();
                switch (str.hashCode()) {
                    case -2058889126:
                        if (str.equals("birthdayYear")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1917283616:
                        if (str.equals("oneTimeCode")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1844815832:
                        if (str.equals("creditCardExpirationMonth")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1825589953:
                        if (str.equals("telephoneNumberNational")) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1821235109:
                        if (str.equals("newPassword")) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1757573738:
                        if (str.equals("creditCardSecurityCode")) {
                            c3 = 5;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1682373820:
                        if (str.equals("creditCardExpirationDay")) {
                            c3 = 6;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1658955742:
                        if (str.equals("fullStreetAddress")) {
                            c3 = 7;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1567118045:
                        if (str.equals("telephoneNumberDevice")) {
                            c3 = '\b';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1476752575:
                        if (str.equals("countryName")) {
                            c3 = '\t';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1413737489:
                        if (str.equals("middleInitial")) {
                            c3 = '\n';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1377792129:
                        if (str.equals("addressCity")) {
                            c3 = 11;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1249512767:
                        if (str.equals("gender")) {
                            c3 = '\f';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1186060294:
                        if (str.equals("postalAddressExtendedPostalCode")) {
                            c3 = '\r';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1151034798:
                        if (str.equals("creditCardNumber")) {
                            c3 = 14;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -835992323:
                        if (str.equals("namePrefix")) {
                            c3 = 15;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -818219584:
                        if (str.equals("middleName")) {
                            c3 = 16;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -747304516:
                        if (str.equals("nameSuffix")) {
                            c3 = 17;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -613980922:
                        if (str.equals("creditCardExpirationDate")) {
                            c3 = 18;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -613352043:
                        if (str.equals("creditCardExpirationYear")) {
                            c3 = 19;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -549230602:
                        if (str.equals("telephoneNumberCountryCode")) {
                            c3 = 20;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -265713450:
                        if (str.equals("username")) {
                            c3 = 21;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 3373707:
                        if (str.equals("name")) {
                            c3 = 22;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 96619420:
                        if (str.equals("email")) {
                            c3 = 23;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 253202685:
                        if (str.equals("addressState")) {
                            c3 = 24;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 588174851:
                        if (str.equals("birthdayMonth")) {
                            c3 = 25;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 798554127:
                        break;
                    case 892233837:
                        if (str.equals("telephoneNumber")) {
                            c3 = 27;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 991032982:
                        if (str.equals("newUsername")) {
                            c3 = 28;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1069376125:
                        if (str.equals("birthday")) {
                            c3 = 29;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1216985755:
                        if (str.equals("password")) {
                            c3 = 30;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1469046696:
                        if (str.equals("givenName")) {
                            c3 = 31;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1662667945:
                        if (str.equals("postalAddress")) {
                            c3 = ' ';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1921869058:
                        if (str.equals("postalAddressExtended")) {
                            c3 = '!';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 2011152728:
                        if (str.equals("postalCode")) {
                            c3 = '\"';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 2011773919:
                        if (str.equals("birthdayDay")) {
                            c3 = '#';
                            break;
                        }
                        c3 = 65535;
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                switch (c3) {
                }
                return str;
            }
        }

        public b(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, d dVar, c cVar, Integer num, String str, a aVar, String[] strArr, b[] bVarArr) {
            this.f4680a = z2;
            this.f4681b = z3;
            this.f4682c = z4;
            this.f4683d = z5;
            this.f4684e = z6;
            this.f4685f = dVar;
            this.f4686g = cVar;
            this.f4687h = num;
            this.f4688i = str;
            this.f4689j = aVar;
            this.f4690k = strArr;
            this.f4691l = bVarArr;
        }

        public static b a(JSONObject jSONObject) {
            b[] bVarArr;
            String string = jSONObject.getString("inputAction");
            if (string == null) {
                throw new JSONException("Configuration JSON missing 'inputAction' property.");
            }
            if (jSONObject.isNull("fields")) {
                bVarArr = null;
            } else {
                JSONArray jSONArray = jSONObject.getJSONArray("fields");
                int length = jSONArray.length();
                b[] bVarArr2 = new b[length];
                for (int i2 = 0; i2 < length; i2++) {
                    bVarArr2[i2] = a(jSONArray.getJSONObject(i2));
                }
                bVarArr = bVarArr2;
            }
            Integer b3 = b(string);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
            if (jSONArray2 != null) {
                for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                    arrayList.add(jSONArray2.optString(i3));
                }
            }
            return new b(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), jSONObject.optBoolean("enableDeltaModel"), d.b(jSONObject.getString("textCapitalization")), c.a(jSONObject.getJSONObject("inputType")), b3, jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : a.a(jSONObject.getJSONObject("autofill")), (String[]) arrayList.toArray(new String[arrayList.size()]), bVarArr);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
        
            if (r12.equals("TextInputAction.done") == false) goto L4;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static Integer b(String str) {
            str.hashCode();
            char c3 = 1;
            switch (str.hashCode()) {
                case -810971940:
                    if (str.equals("TextInputAction.unspecified")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -737377923:
                    break;
                case -737089298:
                    if (str.equals("TextInputAction.next")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -737080013:
                    if (str.equals("TextInputAction.none")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -736940669:
                    if (str.equals("TextInputAction.send")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 469250275:
                    if (str.equals("TextInputAction.search")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1241689507:
                    if (str.equals("TextInputAction.go")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1539450297:
                    if (str.equals("TextInputAction.newline")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2110497650:
                    if (str.equals("TextInputAction.previous")) {
                        c3 = '\b';
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    return 0;
                case 1:
                    return 6;
                case 2:
                    return 5;
                case 3:
                    return 1;
                case 4:
                    return 4;
                case 5:
                    return 3;
                case 6:
                    return 2;
                case 7:
                    return 1;
                case '\b':
                    return 7;
                default:
                    return 0;
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final g f4696a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f4697b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f4698c;

        public c(g gVar, boolean z2, boolean z3) {
            this.f4696a = gVar;
            this.f4697b = z2;
            this.f4698c = z3;
        }

        public static c a(JSONObject jSONObject) {
            return new c(g.b(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    public enum d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");


        /* renamed from: e, reason: collision with root package name */
        private final String f4704e;

        d(String str) {
            this.f4704e = str;
        }

        static d b(String str) {
            for (d dVar : values()) {
                if (dVar.f4704e.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final String f4705a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4706b;

        /* renamed from: c, reason: collision with root package name */
        public final int f4707c;

        /* renamed from: d, reason: collision with root package name */
        public final int f4708d;

        /* renamed from: e, reason: collision with root package name */
        public final int f4709e;

        public e(String str, int i2, int i3, int i4, int i5) {
            if (!(i2 == -1 && i3 == -1) && (i2 < 0 || i3 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i2) + ", " + String.valueOf(i3) + ")");
            }
            if (!(i4 == -1 && i5 == -1) && (i4 < 0 || i4 > i5)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i4) + ", " + String.valueOf(i5) + ")");
            }
            if (i5 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i4));
            }
            if (i2 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i2));
            }
            if (i3 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i3));
            }
            this.f4705a = str;
            this.f4706b = i2;
            this.f4707c = i3;
            this.f4708d = i4;
            this.f4709e = i5;
        }

        public static e a(JSONObject jSONObject) {
            return new e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean b() {
            int i2 = this.f4708d;
            return i2 >= 0 && this.f4709e > i2;
        }

        public boolean c() {
            return this.f4706b >= 0;
        }
    }

    public interface f {
        void a();

        void b();

        void c(e eVar);

        void d(int i2, b bVar);

        void e(String str, Bundle bundle);

        void f(int i2, boolean z2);

        void g(double d3, double d4, double[] dArr);

        void h();

        void i(boolean z2);

        void j();
    }

    public enum g {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");


        /* renamed from: e, reason: collision with root package name */
        private final String f4722e;

        g(String str) {
            this.f4722e = str;
        }

        static g b(String str) {
            for (g gVar : values()) {
                if (gVar.f4722e.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public r(o0.a aVar) {
        a aVar2 = new a();
        this.f4678c = aVar2;
        z0.k kVar = new z0.k(aVar, "flutter/textinput", z0.g.f4753a);
        this.f4676a = kVar;
        kVar.e(aVar2);
    }

    private static HashMap<Object, Object> c(ArrayList<io.flutter.plugin.editing.g> arrayList) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        Iterator<io.flutter.plugin.editing.g> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().b());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    private static HashMap<Object, Object> d(String str, int i2, int i3, int i4, int i5) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i2));
        hashMap.put("selectionExtent", Integer.valueOf(i3));
        hashMap.put("composingBase", Integer.valueOf(i4));
        hashMap.put("composingExtent", Integer.valueOf(i5));
        return hashMap;
    }

    public void b(int i2, Map<String, Object> map) {
        n0.b.f("TextInputChannel", "Sending 'commitContent' message.");
        this.f4676a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.commitContent", map));
    }

    public void e(int i2) {
        n0.b.f("TextInputChannel", "Sending 'done' message.");
        this.f4676a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.done"));
    }

    public void f(int i2) {
        n0.b.f("TextInputChannel", "Sending 'go' message.");
        this.f4676a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.go"));
    }

    public void g(int i2) {
        n0.b.f("TextInputChannel", "Sending 'newline' message.");
        this.f4676a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.newline"));
    }

    public void h(int i2) {
        n0.b.f("TextInputChannel", "Sending 'next' message.");
        this.f4676a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.next"));
    }

    public void i(int i2) {
        n0.b.f("TextInputChannel", "Sending 'onConnectionClosed' message.");
        this.f4676a.c("TextInputClient.onConnectionClosed", Arrays.asList(Integer.valueOf(i2), "TextInputClient.onConnectionClosed"));
    }

    public void j(int i2, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        this.f4676a.c("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i2), hashMap));
    }

    public void k(int i2) {
        n0.b.f("TextInputChannel", "Sending 'previous' message.");
        this.f4676a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.previous"));
    }

    public void l() {
        this.f4676a.c("TextInputClient.requestExistingInputState", null);
    }

    public void m(int i2) {
        n0.b.f("TextInputChannel", "Sending 'search' message.");
        this.f4676a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.search"));
    }

    public void n(int i2) {
        n0.b.f("TextInputChannel", "Sending 'send' message.");
        this.f4676a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.send"));
    }

    public void o(f fVar) {
        this.f4677b = fVar;
    }

    public void p(int i2) {
        n0.b.f("TextInputChannel", "Sending 'unspecified' message.");
        this.f4676a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.unspecified"));
    }

    public void q(int i2, String str, int i3, int i4, int i5, int i6) {
        n0.b.f("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i3 + "\nSelection end: " + i4 + "\nComposing start: " + i5 + "\nComposing end: " + i6);
        this.f4676a.c("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i2), d(str, i3, i4, i5, i6)));
    }

    public void r(int i2, ArrayList<io.flutter.plugin.editing.g> arrayList) {
        n0.b.f("TextInputChannel", "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        this.f4676a.c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i2), c(arrayList)));
    }

    public void s(int i2, HashMap<String, e> hashMap) {
        n0.b.f("TextInputChannel", "Sending message to update editing state for " + String.valueOf(hashMap.size()) + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, e> entry : hashMap.entrySet()) {
            e value = entry.getValue();
            hashMap2.put(entry.getKey(), d(value.f4705a, value.f4706b, value.f4707c, -1, -1));
        }
        this.f4676a.c("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i2), hashMap2));
    }
}
