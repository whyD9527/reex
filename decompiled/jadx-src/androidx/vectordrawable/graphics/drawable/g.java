package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.res.l;
import androidx.core.graphics.c;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class g extends androidx.vectordrawable.graphics.drawable.f {

    /* renamed from: o, reason: collision with root package name */
    static final PorterDuff.Mode f2057o = PorterDuff.Mode.SRC_IN;

    /* renamed from: f, reason: collision with root package name */
    private h f2058f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuffColorFilter f2059g;

    /* renamed from: h, reason: collision with root package name */
    private ColorFilter f2060h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f2061i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f2062j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable.ConstantState f2063k;

    /* renamed from: l, reason: collision with root package name */
    private final float[] f2064l;

    /* renamed from: m, reason: collision with root package name */
    private final Matrix f2065m;

    /* renamed from: n, reason: collision with root package name */
    private final Rect f2066n;

    private static class b extends f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f2093b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f2092a = androidx.core.graphics.c.d(string2);
            }
            this.f2094c = l.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (l.j(xmlPullParser, "pathData")) {
                TypedArray k2 = l.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2032d);
                f(k2, xmlPullParser);
                k2.recycle();
            }
        }
    }

    private static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private int[] f2067e;

        /* renamed from: f, reason: collision with root package name */
        androidx.core.content.res.d f2068f;

        /* renamed from: g, reason: collision with root package name */
        float f2069g;

        /* renamed from: h, reason: collision with root package name */
        androidx.core.content.res.d f2070h;

        /* renamed from: i, reason: collision with root package name */
        float f2071i;

        /* renamed from: j, reason: collision with root package name */
        float f2072j;

        /* renamed from: k, reason: collision with root package name */
        float f2073k;

        /* renamed from: l, reason: collision with root package name */
        float f2074l;

        /* renamed from: m, reason: collision with root package name */
        float f2075m;

        /* renamed from: n, reason: collision with root package name */
        Paint.Cap f2076n;

        /* renamed from: o, reason: collision with root package name */
        Paint.Join f2077o;

        /* renamed from: p, reason: collision with root package name */
        float f2078p;

        c() {
            this.f2069g = 0.0f;
            this.f2071i = 1.0f;
            this.f2072j = 1.0f;
            this.f2073k = 0.0f;
            this.f2074l = 1.0f;
            this.f2075m = 0.0f;
            this.f2076n = Paint.Cap.BUTT;
            this.f2077o = Paint.Join.MITER;
            this.f2078p = 4.0f;
        }

        c(c cVar) {
            super(cVar);
            this.f2069g = 0.0f;
            this.f2071i = 1.0f;
            this.f2072j = 1.0f;
            this.f2073k = 0.0f;
            this.f2074l = 1.0f;
            this.f2075m = 0.0f;
            this.f2076n = Paint.Cap.BUTT;
            this.f2077o = Paint.Join.MITER;
            this.f2078p = 4.0f;
            this.f2067e = cVar.f2067e;
            this.f2068f = cVar.f2068f;
            this.f2069g = cVar.f2069g;
            this.f2071i = cVar.f2071i;
            this.f2070h = cVar.f2070h;
            this.f2094c = cVar.f2094c;
            this.f2072j = cVar.f2072j;
            this.f2073k = cVar.f2073k;
            this.f2074l = cVar.f2074l;
            this.f2075m = cVar.f2075m;
            this.f2076n = cVar.f2076n;
            this.f2077o = cVar.f2077o;
            this.f2078p = cVar.f2078p;
        }

        private Paint.Cap e(int i2, Paint.Cap cap) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i2, Paint.Join join) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f2067e = null;
            if (l.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f2093b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f2092a = androidx.core.graphics.c.d(string2);
                }
                this.f2070h = l.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f2072j = l.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f2072j);
                this.f2076n = e(l.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f2076n);
                this.f2077o = f(l.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f2077o);
                this.f2078p = l.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f2078p);
                this.f2068f = l.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f2071i = l.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f2071i);
                this.f2069g = l.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f2069g);
                this.f2074l = l.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f2074l);
                this.f2075m = l.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f2075m);
                this.f2073k = l.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f2073k);
                this.f2094c = l.g(typedArray, xmlPullParser, "fillType", 13, this.f2094c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean a() {
            return this.f2070h.i() || this.f2068f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean b(int[] iArr) {
            return this.f2068f.j(iArr) | this.f2070h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k2 = l.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2031c);
            h(k2, xmlPullParser, theme);
            k2.recycle();
        }

        float getFillAlpha() {
            return this.f2072j;
        }

        int getFillColor() {
            return this.f2070h.e();
        }

        float getStrokeAlpha() {
            return this.f2071i;
        }

        int getStrokeColor() {
            return this.f2068f.e();
        }

        float getStrokeWidth() {
            return this.f2069g;
        }

        float getTrimPathEnd() {
            return this.f2074l;
        }

        float getTrimPathOffset() {
            return this.f2075m;
        }

        float getTrimPathStart() {
            return this.f2073k;
        }

        void setFillAlpha(float f2) {
            this.f2072j = f2;
        }

        void setFillColor(int i2) {
            this.f2070h.k(i2);
        }

        void setStrokeAlpha(float f2) {
            this.f2071i = f2;
        }

        void setStrokeColor(int i2) {
            this.f2068f.k(i2);
        }

        void setStrokeWidth(float f2) {
            this.f2069g = f2;
        }

        void setTrimPathEnd(float f2) {
            this.f2074l = f2;
        }

        void setTrimPathOffset(float f2) {
            this.f2075m = f2;
        }

        void setTrimPathStart(float f2) {
            this.f2073k = f2;
        }
    }

    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final Matrix f2079a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<e> f2080b;

        /* renamed from: c, reason: collision with root package name */
        float f2081c;

        /* renamed from: d, reason: collision with root package name */
        private float f2082d;

        /* renamed from: e, reason: collision with root package name */
        private float f2083e;

        /* renamed from: f, reason: collision with root package name */
        private float f2084f;

        /* renamed from: g, reason: collision with root package name */
        private float f2085g;

        /* renamed from: h, reason: collision with root package name */
        private float f2086h;

        /* renamed from: i, reason: collision with root package name */
        private float f2087i;

        /* renamed from: j, reason: collision with root package name */
        final Matrix f2088j;

        /* renamed from: k, reason: collision with root package name */
        int f2089k;

        /* renamed from: l, reason: collision with root package name */
        private int[] f2090l;

        /* renamed from: m, reason: collision with root package name */
        private String f2091m;

        public d() {
            super();
            this.f2079a = new Matrix();
            this.f2080b = new ArrayList<>();
            this.f2081c = 0.0f;
            this.f2082d = 0.0f;
            this.f2083e = 0.0f;
            this.f2084f = 1.0f;
            this.f2085g = 1.0f;
            this.f2086h = 0.0f;
            this.f2087i = 0.0f;
            this.f2088j = new Matrix();
            this.f2091m = null;
        }

        public d(d dVar, l.a<String, Object> aVar) {
            super();
            f bVar;
            this.f2079a = new Matrix();
            this.f2080b = new ArrayList<>();
            this.f2081c = 0.0f;
            this.f2082d = 0.0f;
            this.f2083e = 0.0f;
            this.f2084f = 1.0f;
            this.f2085g = 1.0f;
            this.f2086h = 0.0f;
            this.f2087i = 0.0f;
            Matrix matrix = new Matrix();
            this.f2088j = matrix;
            this.f2091m = null;
            this.f2081c = dVar.f2081c;
            this.f2082d = dVar.f2082d;
            this.f2083e = dVar.f2083e;
            this.f2084f = dVar.f2084f;
            this.f2085g = dVar.f2085g;
            this.f2086h = dVar.f2086h;
            this.f2087i = dVar.f2087i;
            this.f2090l = dVar.f2090l;
            String str = dVar.f2091m;
            this.f2091m = str;
            this.f2089k = dVar.f2089k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f2088j);
            ArrayList<e> arrayList = dVar.f2080b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.f2080b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f2080b.add(bVar);
                    String str2 = bVar.f2093b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f2088j.reset();
            this.f2088j.postTranslate(-this.f2082d, -this.f2083e);
            this.f2088j.postScale(this.f2084f, this.f2085g);
            this.f2088j.postRotate(this.f2081c, 0.0f, 0.0f);
            this.f2088j.postTranslate(this.f2086h + this.f2082d, this.f2087i + this.f2083e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f2090l = null;
            this.f2081c = l.f(typedArray, xmlPullParser, "rotation", 5, this.f2081c);
            this.f2082d = typedArray.getFloat(1, this.f2082d);
            this.f2083e = typedArray.getFloat(2, this.f2083e);
            this.f2084f = l.f(typedArray, xmlPullParser, "scaleX", 3, this.f2084f);
            this.f2085g = l.f(typedArray, xmlPullParser, "scaleY", 4, this.f2085g);
            this.f2086h = l.f(typedArray, xmlPullParser, "translateX", 6, this.f2086h);
            this.f2087i = l.f(typedArray, xmlPullParser, "translateY", 7, this.f2087i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f2091m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean a() {
            for (int i2 = 0; i2 < this.f2080b.size(); i2++) {
                if (this.f2080b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean b(int[] iArr) {
            boolean z2 = false;
            for (int i2 = 0; i2 < this.f2080b.size(); i2++) {
                z2 |= this.f2080b.get(i2).b(iArr);
            }
            return z2;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k2 = l.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2030b);
            e(k2, xmlPullParser);
            k2.recycle();
        }

        public String getGroupName() {
            return this.f2091m;
        }

        public Matrix getLocalMatrix() {
            return this.f2088j;
        }

        public float getPivotX() {
            return this.f2082d;
        }

        public float getPivotY() {
            return this.f2083e;
        }

        public float getRotation() {
            return this.f2081c;
        }

        public float getScaleX() {
            return this.f2084f;
        }

        public float getScaleY() {
            return this.f2085g;
        }

        public float getTranslateX() {
            return this.f2086h;
        }

        public float getTranslateY() {
            return this.f2087i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f2082d) {
                this.f2082d = f2;
                d();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f2083e) {
                this.f2083e = f2;
                d();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f2081c) {
                this.f2081c = f2;
                d();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f2084f) {
                this.f2084f = f2;
                d();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f2085g) {
                this.f2085g = f2;
                d();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f2086h) {
                this.f2086h = f2;
                d();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f2087i) {
                this.f2087i = f2;
                d();
            }
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    private static abstract class f extends e {

        /* renamed from: a, reason: collision with root package name */
        protected c.b[] f2092a;

        /* renamed from: b, reason: collision with root package name */
        String f2093b;

        /* renamed from: c, reason: collision with root package name */
        int f2094c;

        /* renamed from: d, reason: collision with root package name */
        int f2095d;

        public f() {
            super();
            this.f2092a = null;
            this.f2094c = 0;
        }

        public f(f fVar) {
            super();
            this.f2092a = null;
            this.f2094c = 0;
            this.f2093b = fVar.f2093b;
            this.f2095d = fVar.f2095d;
            this.f2092a = androidx.core.graphics.c.f(fVar.f2092a);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            c.b[] bVarArr = this.f2092a;
            if (bVarArr != null) {
                c.b.e(bVarArr, path);
            }
        }

        public c.b[] getPathData() {
            return this.f2092a;
        }

        public String getPathName() {
            return this.f2093b;
        }

        public void setPathData(c.b[] bVarArr) {
            if (androidx.core.graphics.c.b(this.f2092a, bVarArr)) {
                androidx.core.graphics.c.j(this.f2092a, bVarArr);
            } else {
                this.f2092a = androidx.core.graphics.c.f(bVarArr);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.g$g, reason: collision with other inner class name */
    private static class C0032g {

        /* renamed from: q, reason: collision with root package name */
        private static final Matrix f2096q = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        private final Path f2097a;

        /* renamed from: b, reason: collision with root package name */
        private final Path f2098b;

        /* renamed from: c, reason: collision with root package name */
        private final Matrix f2099c;

        /* renamed from: d, reason: collision with root package name */
        Paint f2100d;

        /* renamed from: e, reason: collision with root package name */
        Paint f2101e;

        /* renamed from: f, reason: collision with root package name */
        private PathMeasure f2102f;

        /* renamed from: g, reason: collision with root package name */
        private int f2103g;

        /* renamed from: h, reason: collision with root package name */
        final d f2104h;

        /* renamed from: i, reason: collision with root package name */
        float f2105i;

        /* renamed from: j, reason: collision with root package name */
        float f2106j;

        /* renamed from: k, reason: collision with root package name */
        float f2107k;

        /* renamed from: l, reason: collision with root package name */
        float f2108l;

        /* renamed from: m, reason: collision with root package name */
        int f2109m;

        /* renamed from: n, reason: collision with root package name */
        String f2110n;

        /* renamed from: o, reason: collision with root package name */
        Boolean f2111o;

        /* renamed from: p, reason: collision with root package name */
        final l.a<String, Object> f2112p;

        public C0032g() {
            this.f2099c = new Matrix();
            this.f2105i = 0.0f;
            this.f2106j = 0.0f;
            this.f2107k = 0.0f;
            this.f2108l = 0.0f;
            this.f2109m = 255;
            this.f2110n = null;
            this.f2111o = null;
            this.f2112p = new l.a<>();
            this.f2104h = new d();
            this.f2097a = new Path();
            this.f2098b = new Path();
        }

        public C0032g(C0032g c0032g) {
            this.f2099c = new Matrix();
            this.f2105i = 0.0f;
            this.f2106j = 0.0f;
            this.f2107k = 0.0f;
            this.f2108l = 0.0f;
            this.f2109m = 255;
            this.f2110n = null;
            this.f2111o = null;
            l.a<String, Object> aVar = new l.a<>();
            this.f2112p = aVar;
            this.f2104h = new d(c0032g.f2104h, aVar);
            this.f2097a = new Path(c0032g.f2097a);
            this.f2098b = new Path(c0032g.f2098b);
            this.f2105i = c0032g.f2105i;
            this.f2106j = c0032g.f2106j;
            this.f2107k = c0032g.f2107k;
            this.f2108l = c0032g.f2108l;
            this.f2103g = c0032g.f2103g;
            this.f2109m = c0032g.f2109m;
            this.f2110n = c0032g.f2110n;
            String str = c0032g.f2110n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f2111o = c0032g.f2111o;
        }

        private static float a(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            dVar.f2079a.set(matrix);
            dVar.f2079a.preConcat(dVar.f2088j);
            canvas.save();
            for (int i4 = 0; i4 < dVar.f2080b.size(); i4++) {
                e eVar = dVar.f2080b.get(i4);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f2079a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i2, i3, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f2 = i2 / this.f2107k;
            float f3 = i3 / this.f2108l;
            float min = Math.min(f2, f3);
            Matrix matrix = dVar.f2079a;
            this.f2099c.set(matrix);
            this.f2099c.postScale(f2, f3);
            float e3 = e(matrix);
            if (e3 == 0.0f) {
                return;
            }
            fVar.d(this.f2097a);
            Path path = this.f2097a;
            this.f2098b.reset();
            if (fVar.c()) {
                this.f2098b.setFillType(fVar.f2094c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f2098b.addPath(path, this.f2099c);
                canvas.clipPath(this.f2098b);
                return;
            }
            c cVar = (c) fVar;
            float f4 = cVar.f2073k;
            if (f4 != 0.0f || cVar.f2074l != 1.0f) {
                float f5 = cVar.f2075m;
                float f6 = (f4 + f5) % 1.0f;
                float f7 = (cVar.f2074l + f5) % 1.0f;
                if (this.f2102f == null) {
                    this.f2102f = new PathMeasure();
                }
                this.f2102f.setPath(this.f2097a, false);
                float length = this.f2102f.getLength();
                float f8 = f6 * length;
                float f9 = f7 * length;
                path.reset();
                if (f8 > f9) {
                    this.f2102f.getSegment(f8, length, path, true);
                    this.f2102f.getSegment(0.0f, f9, path, true);
                } else {
                    this.f2102f.getSegment(f8, f9, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f2098b.addPath(path, this.f2099c);
            if (cVar.f2070h.l()) {
                androidx.core.content.res.d dVar2 = cVar.f2070h;
                if (this.f2101e == null) {
                    Paint paint = new Paint(1);
                    this.f2101e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f2101e;
                if (dVar2.h()) {
                    Shader f10 = dVar2.f();
                    f10.setLocalMatrix(this.f2099c);
                    paint2.setShader(f10);
                    paint2.setAlpha(Math.round(cVar.f2072j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(g.a(dVar2.e(), cVar.f2072j));
                }
                paint2.setColorFilter(colorFilter);
                this.f2098b.setFillType(cVar.f2094c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f2098b, paint2);
            }
            if (cVar.f2068f.l()) {
                androidx.core.content.res.d dVar3 = cVar.f2068f;
                if (this.f2100d == null) {
                    Paint paint3 = new Paint(1);
                    this.f2100d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f2100d;
                Paint.Join join = cVar.f2077o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f2076n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f2078p);
                if (dVar3.h()) {
                    Shader f11 = dVar3.f();
                    f11.setLocalMatrix(this.f2099c);
                    paint4.setShader(f11);
                    paint4.setAlpha(Math.round(cVar.f2071i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(g.a(dVar3.e(), cVar.f2071i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f2069g * min * e3);
                canvas.drawPath(this.f2098b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float a3 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a3) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            c(this.f2104h, f2096q, canvas, i2, i3, colorFilter);
        }

        public boolean f() {
            if (this.f2111o == null) {
                this.f2111o = Boolean.valueOf(this.f2104h.a());
            }
            return this.f2111o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f2104h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f2109m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.f2109m = i2;
        }
    }

    private static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f2113a;

        /* renamed from: b, reason: collision with root package name */
        C0032g f2114b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f2115c;

        /* renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f2116d;

        /* renamed from: e, reason: collision with root package name */
        boolean f2117e;

        /* renamed from: f, reason: collision with root package name */
        Bitmap f2118f;

        /* renamed from: g, reason: collision with root package name */
        ColorStateList f2119g;

        /* renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f2120h;

        /* renamed from: i, reason: collision with root package name */
        int f2121i;

        /* renamed from: j, reason: collision with root package name */
        boolean f2122j;

        /* renamed from: k, reason: collision with root package name */
        boolean f2123k;

        /* renamed from: l, reason: collision with root package name */
        Paint f2124l;

        public h() {
            this.f2115c = null;
            this.f2116d = g.f2057o;
            this.f2114b = new C0032g();
        }

        public h(h hVar) {
            this.f2115c = null;
            this.f2116d = g.f2057o;
            if (hVar != null) {
                this.f2113a = hVar.f2113a;
                C0032g c0032g = new C0032g(hVar.f2114b);
                this.f2114b = c0032g;
                if (hVar.f2114b.f2101e != null) {
                    c0032g.f2101e = new Paint(hVar.f2114b.f2101e);
                }
                if (hVar.f2114b.f2100d != null) {
                    this.f2114b.f2100d = new Paint(hVar.f2114b.f2100d);
                }
                this.f2115c = hVar.f2115c;
                this.f2116d = hVar.f2116d;
                this.f2117e = hVar.f2117e;
            }
        }

        public boolean a(int i2, int i3) {
            return i2 == this.f2118f.getWidth() && i3 == this.f2118f.getHeight();
        }

        public boolean b() {
            return !this.f2123k && this.f2119g == this.f2115c && this.f2120h == this.f2116d && this.f2122j == this.f2117e && this.f2121i == this.f2114b.getRootAlpha();
        }

        public void c(int i2, int i3) {
            if (this.f2118f == null || !a(i2, i3)) {
                this.f2118f = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.f2123k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f2118f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f2124l == null) {
                Paint paint = new Paint();
                this.f2124l = paint;
                paint.setFilterBitmap(true);
            }
            this.f2124l.setAlpha(this.f2114b.getRootAlpha());
            this.f2124l.setColorFilter(colorFilter);
            return this.f2124l;
        }

        public boolean f() {
            return this.f2114b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f2114b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2113a;
        }

        public boolean h(int[] iArr) {
            boolean g2 = this.f2114b.g(iArr);
            this.f2123k |= g2;
            return g2;
        }

        public void i() {
            this.f2119g = this.f2115c;
            this.f2120h = this.f2116d;
            this.f2121i = this.f2114b.getRootAlpha();
            this.f2122j = this.f2117e;
            this.f2123k = false;
        }

        public void j(int i2, int i3) {
            this.f2118f.eraseColor(0);
            this.f2114b.b(new Canvas(this.f2118f), i2, i3, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new g(this);
        }
    }

    private static class i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f2125a;

        public i(Drawable.ConstantState constantState) {
            this.f2125a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f2125a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2125a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g();
            gVar.f2056e = (VectorDrawable) this.f2125a.newDrawable();
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.f2056e = (VectorDrawable) this.f2125a.newDrawable(resources);
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.f2056e = (VectorDrawable) this.f2125a.newDrawable(resources, theme);
            return gVar;
        }
    }

    g() {
        this.f2062j = true;
        this.f2064l = new float[9];
        this.f2065m = new Matrix();
        this.f2066n = new Rect();
        this.f2058f = new h();
    }

    g(h hVar) {
        this.f2062j = true;
        this.f2064l = new float[9];
        this.f2065m = new Matrix();
        this.f2066n = new Rect();
        this.f2058f = hVar;
        this.f2059g = j(this.f2059g, hVar.f2115c, hVar.f2116d);
    }

    static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (Color.alpha(i2) * f2)) << 24);
    }

    public static g b(Resources resources, int i2, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            g gVar = new g();
            gVar.f2056e = androidx.core.content.res.h.a(resources, i2, theme);
            gVar.f2063k = new i(gVar.f2056e.getConstantState());
            return gVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e3) {
            Log.e("VectorDrawableCompat", "parser error", e3);
            return null;
        }
    }

    public static g c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        g gVar = new g();
        gVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i2;
        int i3;
        b bVar;
        h hVar = this.f2058f;
        C0032g c0032g = hVar.f2114b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c0032g.f2104h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2080b.add(cVar);
                    if (cVar.getPathName() != null) {
                        c0032g.f2112p.put(cVar.getPathName(), cVar);
                    }
                    z2 = false;
                    bVar = cVar;
                } else if ("clip-path".equals(name)) {
                    b bVar2 = new b();
                    bVar2.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2080b.add(bVar2);
                    String pathName = bVar2.getPathName();
                    bVar = bVar2;
                    if (pathName != null) {
                        c0032g.f2112p.put(bVar2.getPathName(), bVar2);
                        bVar = bVar2;
                    }
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2080b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        c0032g.f2112p.put(dVar2.getGroupName(), dVar2);
                    }
                    i2 = hVar.f2113a;
                    i3 = dVar2.f2089k;
                    hVar.f2113a = i3 | i2;
                }
                i2 = hVar.f2113a;
                i3 = bVar.f2095d;
                hVar.f2113a = i3 | i2;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    private static PorterDuff.Mode g(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f2058f;
        C0032g c0032g = hVar.f2114b;
        hVar.f2116d = g(l.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c3 = l.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c3 != null) {
            hVar.f2115c = c3;
        }
        hVar.f2117e = l.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f2117e);
        c0032g.f2107k = l.f(typedArray, xmlPullParser, "viewportWidth", 7, c0032g.f2107k);
        float f2 = l.f(typedArray, xmlPullParser, "viewportHeight", 8, c0032g.f2108l);
        c0032g.f2108l = f2;
        if (c0032g.f2107k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c0032g.f2105i = typedArray.getDimension(3, c0032g.f2105i);
        float dimension = typedArray.getDimension(2, c0032g.f2106j);
        c0032g.f2106j = dimension;
        if (c0032g.f2105i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        c0032g.setAlpha(l.f(typedArray, xmlPullParser, "alpha", 4, c0032g.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            c0032g.f2110n = string;
            c0032g.f2112p.put(string, c0032g);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f2056e;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    Object d(String str) {
        return this.f2058f.f2114b.f2112p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f2066n);
        if (this.f2066n.width() <= 0 || this.f2066n.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f2060h;
        if (colorFilter == null) {
            colorFilter = this.f2059g;
        }
        canvas.getMatrix(this.f2065m);
        this.f2065m.getValues(this.f2064l);
        float abs = Math.abs(this.f2064l[0]);
        float abs2 = Math.abs(this.f2064l[4]);
        float abs3 = Math.abs(this.f2064l[1]);
        float abs4 = Math.abs(this.f2064l[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f2066n.width() * abs));
        int min2 = Math.min(2048, (int) (this.f2066n.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f2066n;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.f2066n.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f2066n.offsetTo(0, 0);
        this.f2058f.c(min, min2);
        if (!this.f2062j) {
            this.f2058f.j(min, min2);
        } else if (!this.f2058f.b()) {
            this.f2058f.j(min, min2);
            this.f2058f.i();
        }
        this.f2058f.d(canvas, colorFilter, this.f2066n);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f2056e;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f2058f.f2114b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f2056e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2058f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f2056e;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f2060h;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f2056e != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f2056e.getConstantState());
        }
        this.f2058f.f2113a = getChangingConfigurations();
        return this.f2058f;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f2056e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f2058f.f2114b.f2106j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f2056e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f2058f.f2114b.f2105i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    void h(boolean z2) {
        this.f2062j = z2;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f2058f;
        hVar.f2114b = new C0032g();
        TypedArray k2 = l.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2029a);
        i(k2, xmlPullParser, theme);
        k2.recycle();
        hVar.f2113a = getChangingConfigurations();
        hVar.f2123k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f2059g = j(this.f2059g, hVar.f2115c, hVar.f2116d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f2056e;
        return drawable != null ? androidx.core.graphics.drawable.a.g(drawable) : this.f2058f.f2117e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f2056e;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f2058f) != null && (hVar.g() || ((colorStateList = this.f2058f.f2115c) != null && colorStateList.isStateful())));
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2061i && super.mutate() == this) {
            this.f2058f = new h(this.f2058f);
            this.f2061i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z2 = false;
        h hVar = this.f2058f;
        ColorStateList colorStateList = hVar.f2115c;
        if (colorStateList != null && (mode = hVar.f2116d) != null) {
            this.f2059g = j(this.f2059g, colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z2;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f2058f.f2114b.getRootAlpha() != i2) {
            this.f2058f.f2114b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, z2);
        } else {
            this.f2058f.f2117e = z2;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2060h = colorFilter;
            invalidateSelf();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z2) {
        super.setFilterBitmap(z2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, colorStateList);
            return;
        }
        h hVar = this.f2058f;
        if (hVar.f2115c != colorStateList) {
            hVar.f2115c = colorStateList;
            this.f2059g = j(this.f2059g, colorStateList, hVar.f2116d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, mode);
            return;
        }
        h hVar = this.f2058f;
        if (hVar.f2116d != mode) {
            hVar.f2116d = mode;
            this.f2059g = j(this.f2059g, hVar.f2115c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f2056e;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
