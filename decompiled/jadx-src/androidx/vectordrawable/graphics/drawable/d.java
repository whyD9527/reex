package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.core.content.res.l;
import androidx.core.graphics.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class d {

    private static class a implements TypeEvaluator<c.b[]> {

        /* renamed from: a, reason: collision with root package name */
        private c.b[] f2054a;

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c.b[] evaluate(float f2, c.b[] bVarArr, c.b[] bVarArr2) {
            if (!androidx.core.graphics.c.b(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!androidx.core.graphics.c.b(this.f2054a, bVarArr)) {
                this.f2054a = androidx.core.graphics.c.f(bVarArr);
            }
            for (int i2 = 0; i2 < bVarArr.length; i2++) {
                this.f2054a[i2].d(bVarArr[i2], bVarArr2[i2], f2);
            }
            return this.f2054a;
        }
    }

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f2) {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Animator b(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i2, float f2) {
        int i3;
        int depth = xmlPullParser.getDepth();
        ValueAnimator valueAnimator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            i3 = 0;
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("objectAnimator")) {
                        valueAnimator = n(context, resources, theme, attributeSet, f2, xmlPullParser);
                    } else if (name.equals("animator")) {
                        valueAnimator = l(context, resources, theme, attributeSet, null, f2, xmlPullParser);
                    } else {
                        if (name.equals("set")) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            TypedArray k2 = l.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2036h);
                            b(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, l.g(k2, xmlPullParser, "ordering", 0, 0), f2);
                            k2.recycle();
                            valueAnimator = animatorSet2;
                        } else {
                            if (!name.equals("propertyValuesHolder")) {
                                throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                            }
                            PropertyValuesHolder[] p2 = p(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                            if (p2 != null && (valueAnimator instanceof ValueAnimator)) {
                                valueAnimator.setValues(p2);
                            }
                            i3 = 1;
                        }
                        if (animatorSet != null && i3 == 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(valueAnimator);
                        }
                    }
                    if (animatorSet != null) {
                        if (arrayList == null) {
                        }
                        arrayList.add(valueAnimator);
                    }
                }
            }
        }
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorArr[i3] = (Animator) it.next();
                i3++;
            }
            if (i2 == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return valueAnimator;
    }

    private static Keyframe c(Keyframe keyframe, float f2) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f2) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f2) : Keyframe.ofObject(f2);
    }

    private static void d(Keyframe[] keyframeArr, float f2, int i2, int i3) {
        float f3 = f2 / ((i3 - i2) + 2);
        while (i2 <= i3) {
            keyframeArr[i2].setFraction(keyframeArr[i2 - 1].getFraction() + f3);
            i2++;
        }
    }

    private static PropertyValuesHolder e(TypedArray typedArray, int i2, int i3, int i4, String str) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i3);
        boolean z2 = peekValue != null;
        int i5 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i4);
        boolean z3 = peekValue2 != null;
        int i6 = z3 ? peekValue2.type : 0;
        if (i2 == 4) {
            i2 = ((z2 && h(i5)) || (z3 && h(i6))) ? 3 : 0;
        }
        boolean z4 = i2 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i2 != 2) {
            e a3 = i2 == 3 ? e.a() : null;
            if (z4) {
                if (z2) {
                    float dimension = i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f);
                    if (z3) {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                }
                propertyValuesHolder = ofFloat;
            } else if (z2) {
                int dimension2 = i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : h(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                if (z3) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : h(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z3) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : h(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
            }
            if (propertyValuesHolder == null || a3 == null) {
                return propertyValuesHolder;
            }
            propertyValuesHolder.setEvaluator(a3);
            return propertyValuesHolder;
        }
        String string = typedArray.getString(i3);
        String string2 = typedArray.getString(i4);
        c.b[] d3 = androidx.core.graphics.c.d(string);
        c.b[] d4 = androidx.core.graphics.c.d(string2);
        if (d3 == null && d4 == null) {
            return null;
        }
        if (d3 == null) {
            if (d4 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), d4);
            }
            return null;
        }
        a aVar = new a();
        if (d4 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, aVar, d3);
        } else {
            if (!androidx.core.graphics.c.b(d3, d4)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            ofObject = PropertyValuesHolder.ofObject(str, aVar, d3, d4);
        }
        return ofObject;
    }

    private static int f(TypedArray typedArray, int i2, int i3) {
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z2 = peekValue != null;
        int i4 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z3 = peekValue2 != null;
        return ((z2 && h(i4)) || (z3 && h(z3 ? peekValue2.type : 0))) ? 3 : 0;
    }

    private static int g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray k2 = l.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2038j);
        int i2 = 0;
        TypedValue l2 = l.l(k2, xmlPullParser, "value", 0);
        if ((l2 != null) && h(l2.type)) {
            i2 = 3;
        }
        k2.recycle();
        return i2;
    }

    private static boolean h(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    public static Animator i(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i2) : j(context, context.getResources(), context.getTheme(), i2);
    }

    public static Animator j(Context context, Resources resources, Resources.Theme theme, int i2) {
        return k(context, resources, theme, i2, 1.0f);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, int i2, float f2) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i2);
                    return a(context, resources, theme, xmlResourceParser, f2);
                } catch (XmlPullParserException e3) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
                    notFoundException.initCause(e3);
                    throw notFoundException;
                }
            } catch (IOException e4) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
                notFoundException2.initCause(e4);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private static ValueAnimator l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f2, XmlPullParser xmlPullParser) {
        TypedArray k2 = l.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2035g);
        TypedArray k3 = l.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2039k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        q(valueAnimator, k2, k3, f2, xmlPullParser);
        int h2 = l.h(k2, xmlPullParser, "interpolator", 0, 0);
        if (h2 > 0) {
            valueAnimator.setInterpolator(c.a(context, h2));
        }
        k2.recycle();
        if (k3 != null) {
            k3.recycle();
        }
        return valueAnimator;
    }

    private static Keyframe m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i2, XmlPullParser xmlPullParser) {
        TypedArray k2 = l.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2038j);
        float f2 = l.f(k2, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue l2 = l.l(k2, xmlPullParser, "value", 0);
        boolean z2 = l2 != null;
        if (i2 == 4) {
            i2 = (z2 && h(l2.type)) ? 3 : 0;
        }
        Keyframe ofInt = z2 ? i2 != 0 ? (i2 == 1 || i2 == 3) ? Keyframe.ofInt(f2, l.g(k2, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(f2, l.f(k2, xmlPullParser, "value", 0, 0.0f)) : i2 == 0 ? Keyframe.ofFloat(f2) : Keyframe.ofInt(f2);
        int h2 = l.h(k2, xmlPullParser, "interpolator", 1, 0);
        if (h2 > 0) {
            ofInt.setInterpolator(c.a(context, h2));
        }
        k2.recycle();
        return ofInt;
    }

    private static ObjectAnimator n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f2, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        l(context, resources, theme, attributeSet, objectAnimator, f2, xmlPullParser);
        return objectAnimator;
    }

    private static PropertyValuesHolder o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i2) {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i2 == 4) {
                    i2 = g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m2 = m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i2, xmlPullParser);
                if (m2 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m2);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i3 = 0; i3 < size; i3++) {
                Keyframe keyframe3 = keyframeArr[i3];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i3 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i4 = size - 1;
                        if (i3 == i4) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i5 = i3;
                            for (int i6 = i3 + 1; i6 < i4 && keyframeArr[i6].getFraction() < 0.0f; i6++) {
                                i5 = i6;
                            }
                            d(keyframeArr, keyframeArr[i5 + 1].getFraction() - keyframeArr[i3 - 1].getFraction(), i3, i5);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i2 == 3) {
                propertyValuesHolder.setEvaluator(e.a());
            }
        }
        return propertyValuesHolder;
    }

    private static PropertyValuesHolder[] p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i2;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("propertyValuesHolder")) {
                TypedArray k2 = l.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2037i);
                String i3 = l.i(k2, xmlPullParser, "propertyName", 3);
                int g2 = l.g(k2, xmlPullParser, "valueType", 2, 4);
                PropertyValuesHolder o2 = o(context, resources, theme, xmlPullParser, i3, g2);
                if (o2 == null) {
                    o2 = e(k2, g2, 0, 1, i3);
                }
                if (o2 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(o2);
                }
                k2.recycle();
            }
            xmlPullParser.next();
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i2 = 0; i2 < size; i2++) {
                propertyValuesHolderArr[i2] = (PropertyValuesHolder) arrayList.get(i2);
            }
        }
        return propertyValuesHolderArr;
    }

    private static void q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f2, XmlPullParser xmlPullParser) {
        long g2 = l.g(typedArray, xmlPullParser, "duration", 1, 300);
        long g3 = l.g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int g4 = l.g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (l.j(xmlPullParser, "valueFrom") && l.j(xmlPullParser, "valueTo")) {
            if (g4 == 4) {
                g4 = f(typedArray, 5, 6);
            }
            PropertyValuesHolder e3 = e(typedArray, g4, 5, 6, "");
            if (e3 != null) {
                valueAnimator.setValues(e3);
            }
        }
        valueAnimator.setDuration(g2);
        valueAnimator.setStartDelay(g3);
        valueAnimator.setRepeatCount(l.g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(l.g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            r(valueAnimator, typedArray2, g4, f2, xmlPullParser);
        }
    }

    private static void r(ValueAnimator valueAnimator, TypedArray typedArray, int i2, float f2, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String i3 = l.i(typedArray, xmlPullParser, "pathData", 1);
        if (i3 == null) {
            objectAnimator.setPropertyName(l.i(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String i4 = l.i(typedArray, xmlPullParser, "propertyXName", 2);
        String i5 = l.i(typedArray, xmlPullParser, "propertyYName", 3);
        if (i2 != 2) {
        }
        if (i4 != null || i5 != null) {
            s(androidx.core.graphics.c.e(i3), objectAnimator, f2 * 0.5f, i4, i5);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    private static void s(Path path, ObjectAnimator objectAnimator, float f2, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f3 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f4 = 0.0f;
        do {
            f4 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f4));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f4 / f2)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f5 = f4 / (min - 1);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i3)).floatValue(), fArr3, null);
            fArr[i2] = fArr3[0];
            fArr2[i2] = fArr3[1];
            f3 += f5;
            int i4 = i3 + 1;
            if (i4 < arrayList.size() && f3 > ((Float) arrayList.get(i4)).floatValue()) {
                pathMeasure2.nextContour();
                i3 = i4;
            }
            i2++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }
}
