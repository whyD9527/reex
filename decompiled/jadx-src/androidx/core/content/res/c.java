package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f1378a = new ThreadLocal<>();

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    private static TypedValue c() {
        ThreadLocal<TypedValue> threadLocal = f1378a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList d(Resources resources, int i2, Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i2), theme);
        } catch (Exception e3) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e3);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        if (r9.hasValue(r12) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0075, code lost:
    
        if (r9.hasValue(r12) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ColorStateList e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        int i2;
        int i3;
        int attributeCount;
        int i4;
        Resources resources2 = resources;
        int i5 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArr2 = new int[20];
        int i6 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i5 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray h2 = h(resources2, theme, attributeSet, r.d.f4258b);
                int i7 = r.d.f4259c;
                int resourceId = h2.getResourceId(i7, -1);
                if (resourceId != -1 && !f(resources2, resourceId)) {
                    try {
                        color = a(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        i7 = r.d.f4259c;
                    }
                    float f2 = 1.0f;
                    i2 = r.d.f4260d;
                    if (!h2.hasValue(i2)) {
                        i2 = r.d.f4262f;
                    }
                    f2 = h2.getFloat(i2, 1.0f);
                    if (Build.VERSION.SDK_INT >= 31) {
                        i3 = r.d.f4261e;
                    }
                    i3 = r.d.f4263g;
                    float f3 = h2.getFloat(i3, -1.0f);
                    h2.recycle();
                    attributeCount = attributeSet.getAttributeCount();
                    int[] iArr3 = new int[attributeCount];
                    int i8 = 0;
                    for (i4 = 0; i4 < attributeCount; i4++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != r.a.f4226a && attributeNameResource != r.a.f4227b) {
                            int i9 = i8 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr3[i8] = attributeNameResource;
                            i8 = i9;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr3, i8);
                    iArr2 = g.a(iArr2, i6, g(color, f2, f3));
                    iArr = (int[][]) g.b(iArr, i6, trimStateSet);
                    i6++;
                }
                color = h2.getColor(i7, -65281);
                float f22 = 1.0f;
                i2 = r.d.f4260d;
                if (!h2.hasValue(i2)) {
                }
                f22 = h2.getFloat(i2, 1.0f);
                if (Build.VERSION.SDK_INT >= 31) {
                }
                i3 = r.d.f4263g;
                float f32 = h2.getFloat(i3, -1.0f);
                h2.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr32 = new int[attributeCount];
                int i82 = 0;
                while (i4 < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr32, i82);
                iArr2 = g.a(iArr2, i6, g(color, f22, f32));
                iArr = (int[][]) g.b(iArr, i6, trimStateSet2);
                i6++;
            }
            i5 = 1;
            resources2 = resources;
        }
        int[] iArr4 = new int[i6];
        int[][] iArr5 = new int[i6][];
        System.arraycopy(iArr2, 0, iArr4, 0, i6);
        System.arraycopy(iArr, 0, iArr5, 0, i6);
        return new ColorStateList(iArr5, iArr4);
    }

    private static boolean f(Resources resources, int i2) {
        TypedValue c3 = c();
        resources.getValue(i2, c3, true);
        int i3 = c3.type;
        return i3 >= 28 && i3 <= 31;
    }

    private static int g(int i2, float f2, float f3) {
        boolean z2 = f3 >= 0.0f && f3 <= 100.0f;
        if (f2 == 1.0f && !z2) {
            return i2;
        }
        int a3 = t.a.a((int) ((Color.alpha(i2) * f2) + 0.5f), 0, 255);
        if (z2) {
            a c3 = a.c(i2);
            i2 = a.m(c3.j(), c3.i(), f3);
        }
        return (i2 & 16777215) | (a3 << 24);
    }

    private static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
