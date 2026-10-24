package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
final class f {

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int[] f1393a;

        /* renamed from: b, reason: collision with root package name */
        final float[] f1394b;

        a(int i2, int i3) {
            this.f1393a = new int[]{i2, i3};
            this.f1394b = new float[]{0.0f, 1.0f};
        }

        a(int i2, int i3, int i4) {
            this.f1393a = new int[]{i2, i3, i4};
            this.f1394b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f1393a = new int[size];
            this.f1394b = new float[size];
            for (int i2 = 0; i2 < size; i2++) {
                this.f1393a[i2] = list.get(i2).intValue();
                this.f1394b[i2] = list2.get(i2).floatValue();
            }
        }
    }

    private static a a(a aVar, int i2, int i3, boolean z2, int i4) {
        return aVar != null ? aVar : z2 ? new a(i2, i4, i3) : new a(i2, i3);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray k2 = l.k(resources, theme, attributeSet, r.d.A);
        float f2 = l.f(k2, xmlPullParser, "startX", r.d.J, 0.0f);
        float f3 = l.f(k2, xmlPullParser, "startY", r.d.K, 0.0f);
        float f4 = l.f(k2, xmlPullParser, "endX", r.d.L, 0.0f);
        float f5 = l.f(k2, xmlPullParser, "endY", r.d.M, 0.0f);
        float f6 = l.f(k2, xmlPullParser, "centerX", r.d.E, 0.0f);
        float f7 = l.f(k2, xmlPullParser, "centerY", r.d.F, 0.0f);
        int g2 = l.g(k2, xmlPullParser, "type", r.d.D, 0);
        int b3 = l.b(k2, xmlPullParser, "startColor", r.d.B, 0);
        boolean j2 = l.j(xmlPullParser, "centerColor");
        int b4 = l.b(k2, xmlPullParser, "centerColor", r.d.I, 0);
        int b5 = l.b(k2, xmlPullParser, "endColor", r.d.C, 0);
        int g3 = l.g(k2, xmlPullParser, "tileMode", r.d.H, 0);
        float f8 = l.f(k2, xmlPullParser, "gradientRadius", r.d.G, 0.0f);
        k2.recycle();
        a a3 = a(c(resources, xmlPullParser, attributeSet, theme), b3, b5, j2, b4);
        if (g2 != 1) {
            return g2 != 2 ? new LinearGradient(f2, f3, f4, f5, a3.f1393a, a3.f1394b, d(g3)) : new SweepGradient(f6, f7, a3.f1393a, a3.f1394b);
        }
        if (f8 > 0.0f) {
            return new RadialGradient(f6, f7, f8, a3.f1393a, a3.f1394b, d(g3));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static a c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray k2 = l.k(resources, theme, attributeSet, r.d.N);
                int i2 = r.d.O;
                boolean hasValue = k2.hasValue(i2);
                int i3 = r.d.P;
                boolean hasValue2 = k2.hasValue(i3);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color = k2.getColor(i2, 0);
                float f2 = k2.getFloat(i3, 0.0f);
                k2.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f2));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    private static Shader.TileMode d(int i2) {
        return i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
