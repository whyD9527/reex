package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Shader f1379a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f1380b;

    /* renamed from: c, reason: collision with root package name */
    private int f1381c;

    private d(Shader shader, ColorStateList colorStateList, int i2) {
        this.f1379a = shader;
        this.f1380b = colorStateList;
        this.f1381c = i2;
    }

    private static d a(Resources resources, int i2, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i2);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return d(f.b(resources, xml, asAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return c(c.b(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    static d b(int i2) {
        return new d(null, null, i2);
    }

    static d c(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(Shader shader) {
        return new d(shader, null, 0);
    }

    public static d g(Resources resources, int i2, Resources.Theme theme) {
        try {
            return a(resources, i2, theme);
        } catch (Exception e3) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e3);
            return null;
        }
    }

    public int e() {
        return this.f1381c;
    }

    public Shader f() {
        return this.f1379a;
    }

    public boolean h() {
        return this.f1379a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f1379a == null && (colorStateList = this.f1380b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f1380b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f1381c) {
                this.f1381c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i2) {
        this.f1381c = i2;
    }

    public boolean l() {
        return h() || this.f1381c != 0;
    }
}
