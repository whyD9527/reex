package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f1065a;

    /* renamed from: b, reason: collision with root package name */
    int f1066b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f1067c = -1;

    /* renamed from: d, reason: collision with root package name */
    private SparseArray<a> f1068d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    private SparseArray<e> f1069e = new SparseArray<>();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f1070a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<b> f1071b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        int f1072c;

        /* renamed from: d, reason: collision with root package name */
        e f1073d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f1072c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.F4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == k.G4) {
                    this.f1070a = obtainStyledAttributes.getResourceId(index, this.f1070a);
                } else if (index == k.H4) {
                    this.f1072c = obtainStyledAttributes.getResourceId(index, this.f1072c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1072c);
                    context.getResources().getResourceName(this.f1072c);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f1073d = eVar;
                        eVar.d(context, this.f1072c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f1071b.add(bVar);
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        float f1074a;

        /* renamed from: b, reason: collision with root package name */
        float f1075b;

        /* renamed from: c, reason: collision with root package name */
        float f1076c;

        /* renamed from: d, reason: collision with root package name */
        float f1077d;

        /* renamed from: e, reason: collision with root package name */
        int f1078e;

        /* renamed from: f, reason: collision with root package name */
        e f1079f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f1074a = Float.NaN;
            this.f1075b = Float.NaN;
            this.f1076c = Float.NaN;
            this.f1077d = Float.NaN;
            this.f1078e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.b5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == k.c5) {
                    this.f1078e = obtainStyledAttributes.getResourceId(index, this.f1078e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1078e);
                    context.getResources().getResourceName(this.f1078e);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f1079f = eVar;
                        eVar.d(context, this.f1078e);
                    }
                } else if (index == k.d5) {
                    this.f1077d = obtainStyledAttributes.getDimension(index, this.f1077d);
                } else if (index == k.e5) {
                    this.f1075b = obtainStyledAttributes.getDimension(index, this.f1075b);
                } else if (index == k.f5) {
                    this.f1076c = obtainStyledAttributes.getDimension(index, this.f1076c);
                } else if (index == k.g5) {
                    this.f1074a = obtainStyledAttributes.getDimension(index, this.f1074a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    d(Context context, ConstraintLayout constraintLayout, int i2) {
        this.f1065a = constraintLayout;
        a(context, i2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void a(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    char c3 = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c3 = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c3 = 3;
                                break;
                            }
                            break;
                    }
                    if (c3 != 0 && c3 != 1) {
                        if (c3 == 2) {
                            aVar = new a(context, xml);
                            this.f1068d.put(aVar.f1070a, aVar);
                        } else if (c3 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.a(bVar);
                            }
                        } else if (c3 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            b(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        e eVar = new e();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if ("id".equals(xmlPullParser.getAttributeName(i2))) {
                String attributeValue = xmlPullParser.getAttributeValue(i2);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                eVar.j(context, xmlPullParser);
                this.f1069e.put(identifier, eVar);
                return;
            }
        }
    }

    public void c(g gVar) {
    }
}
