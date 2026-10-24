package w;

import android.annotation.NonNull;
import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.util.d;

/* loaded from: classes.dex */
public class c implements Spannable {

    /* renamed from: h, reason: collision with root package name */
    private static final Object f4352h = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Spannable f4353e;

    /* renamed from: f, reason: collision with root package name */
    private final a f4354f;

    /* renamed from: g, reason: collision with root package name */
    private final PrecomputedText f4355g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final TextPaint f4356a;

        /* renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f4357b;

        /* renamed from: c, reason: collision with root package name */
        private final int f4358c;

        /* renamed from: d, reason: collision with root package name */
        private final int f4359d;

        /* renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f4360e;

        /* renamed from: w.c$a$a, reason: collision with other inner class name */
        public static class C0068a {

            /* renamed from: a, reason: collision with root package name */
            private final TextPaint f4361a;

            /* renamed from: c, reason: collision with root package name */
            private int f4363c = 1;

            /* renamed from: d, reason: collision with root package name */
            private int f4364d = 1;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f4362b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0068a(TextPaint textPaint) {
                this.f4361a = textPaint;
            }

            public a a() {
                return new a(this.f4361a, this.f4362b, this.f4363c, this.f4364d);
            }

            public C0068a b(int i2) {
                this.f4363c = i2;
                return this;
            }

            public C0068a c(int i2) {
                this.f4364d = i2;
                return this;
            }

            public C0068a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f4362b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f4356a = params.getTextPaint();
            this.f4357b = params.getTextDirection();
            this.f4358c = params.getBreakStrategy();
            this.f4359d = params.getHyphenationFrequency();
            this.f4360e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            this.f4360e = Build.VERSION.SDK_INT >= 29 ? new Object(textPaint) { // from class: android.text.PrecomputedText.Params.Builder
                static {
                    throw new NoClassDefFoundError();
                }

                public /* synthetic */ Builder(@NonNull TextPaint textPaint2) {
                }

                @NonNull
                public native /* synthetic */ Params build();

                public native /* synthetic */ Builder setBreakStrategy(int i4);

                public native /* synthetic */ Builder setHyphenationFrequency(int i4);

                public native /* synthetic */ Builder setTextDirection(@NonNull TextDirectionHeuristic textDirectionHeuristic2);
            }.setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build() : null;
            this.f4356a = textPaint2;
            this.f4357b = textDirectionHeuristic;
            this.f4358c = i2;
            this.f4359d = i3;
        }

        public boolean a(a aVar) {
            LocaleList textLocales;
            LocaleList textLocales2;
            int i2 = Build.VERSION.SDK_INT;
            if (this.f4358c != aVar.b() || this.f4359d != aVar.c() || this.f4356a.getTextSize() != aVar.e().getTextSize() || this.f4356a.getTextScaleX() != aVar.e().getTextScaleX() || this.f4356a.getTextSkewX() != aVar.e().getTextSkewX() || this.f4356a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f4356a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f4356a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i2 >= 24) {
                textLocales = this.f4356a.getTextLocales();
                textLocales2 = aVar.e().getTextLocales();
                if (!textLocales.equals(textLocales2)) {
                    return false;
                }
            } else if (!this.f4356a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            return this.f4356a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f4356a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f4358c;
        }

        public int c() {
            return this.f4359d;
        }

        public TextDirectionHeuristic d() {
            return this.f4357b;
        }

        public TextPaint e() {
            return this.f4356a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f4357b == aVar.d();
        }

        public int hashCode() {
            LocaleList textLocales;
            if (Build.VERSION.SDK_INT < 24) {
                return d.b(Float.valueOf(this.f4356a.getTextSize()), Float.valueOf(this.f4356a.getTextScaleX()), Float.valueOf(this.f4356a.getTextSkewX()), Float.valueOf(this.f4356a.getLetterSpacing()), Integer.valueOf(this.f4356a.getFlags()), this.f4356a.getTextLocale(), this.f4356a.getTypeface(), Boolean.valueOf(this.f4356a.isElegantTextHeight()), this.f4357b, Integer.valueOf(this.f4358c), Integer.valueOf(this.f4359d));
            }
            textLocales = this.f4356a.getTextLocales();
            return d.b(Float.valueOf(this.f4356a.getTextSize()), Float.valueOf(this.f4356a.getTextScaleX()), Float.valueOf(this.f4356a.getTextSkewX()), Float.valueOf(this.f4356a.getLetterSpacing()), Integer.valueOf(this.f4356a.getFlags()), textLocales, this.f4356a.getTypeface(), Boolean.valueOf(this.f4356a.isElegantTextHeight()), this.f4357b, Integer.valueOf(this.f4358c), Integer.valueOf(this.f4359d));
        }

        public String toString() {
            StringBuilder sb;
            Object textLocale;
            String fontVariationSettings;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f4356a.getTextSize());
            sb2.append(", textScaleX=" + this.f4356a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f4356a.getTextSkewX());
            int i2 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f4356a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f4356a.isElegantTextHeight());
            if (i2 >= 24) {
                sb = new StringBuilder();
                sb.append(", textLocale=");
                textLocale = this.f4356a.getTextLocales();
            } else {
                sb = new StringBuilder();
                sb.append(", textLocale=");
                textLocale = this.f4356a.getTextLocale();
            }
            sb.append(textLocale);
            sb2.append(sb.toString());
            sb2.append(", typeface=" + this.f4356a.getTypeface());
            if (i2 >= 26) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(", variationSettings=");
                fontVariationSettings = this.f4356a.getFontVariationSettings();
                sb3.append(fontVariationSettings);
                sb2.append(sb3.toString());
            }
            sb2.append(", textDir=" + this.f4357b);
            sb2.append(", breakStrategy=" + this.f4358c);
            sb2.append(", hyphenationFrequency=" + this.f4359d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public a a() {
        return this.f4354f;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f4353e;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i2) {
        return this.f4353e.charAt(i2);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f4353e.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f4353e.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f4353e.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f4355g.getSpans(i2, i3, cls) : (T[]) this.f4353e.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f4353e.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f4353e.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f4355g.removeSpan(obj);
        } else {
            this.f4353e.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f4355g.setSpan(obj, i2, i3, i4);
        } else {
            this.f4353e.setSpan(obj, i2, i3, i4);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        return this.f4353e.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f4353e.toString();
    }
}
