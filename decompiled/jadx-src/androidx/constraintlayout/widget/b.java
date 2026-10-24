package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    String f1040a;

    /* renamed from: b, reason: collision with root package name */
    private EnumC0015b f1041b;

    /* renamed from: c, reason: collision with root package name */
    private int f1042c;

    /* renamed from: d, reason: collision with root package name */
    private float f1043d;

    /* renamed from: e, reason: collision with root package name */
    private String f1044e;

    /* renamed from: f, reason: collision with root package name */
    boolean f1045f;

    /* renamed from: g, reason: collision with root package name */
    private int f1046g;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1047a;

        static {
            int[] iArr = new int[EnumC0015b.values().length];
            f1047a = iArr;
            try {
                iArr[EnumC0015b.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1047a[EnumC0015b.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1047a[EnumC0015b.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1047a[EnumC0015b.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1047a[EnumC0015b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1047a[EnumC0015b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1047a[EnumC0015b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    public enum EnumC0015b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public b(b bVar, Object obj) {
        this.f1040a = bVar.f1040a;
        this.f1041b = bVar.f1041b;
        d(obj);
    }

    public b(String str, EnumC0015b enumC0015b, Object obj) {
        this.f1040a = str;
        this.f1041b = enumC0015b;
        d(obj);
    }

    public static HashMap<String, b> a(HashMap<String, b> hashMap, View view) {
        HashMap<String, b> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            b bVar = hashMap.get(str);
            try {
                hashMap2.put(str, str.equals("BackgroundColor") ? new b(bVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())) : new b(bVar, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap2;
    }

    public static void b(Context context, XmlPullParser xmlPullParser, HashMap<String, b> hashMap) {
        EnumC0015b enumC0015b;
        Object string;
        int integer;
        float f2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.C2);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        EnumC0015b enumC0015b2 = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == k.D2) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == k.E2) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                enumC0015b2 = EnumC0015b.BOOLEAN_TYPE;
            } else {
                if (index == k.G2) {
                    enumC0015b = EnumC0015b.COLOR_TYPE;
                } else if (index == k.F2) {
                    enumC0015b = EnumC0015b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == k.K2) {
                        enumC0015b = EnumC0015b.DIMENSION_TYPE;
                        f2 = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == k.H2) {
                        enumC0015b = EnumC0015b.DIMENSION_TYPE;
                        f2 = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == k.I2) {
                        enumC0015b = EnumC0015b.FLOAT_TYPE;
                        f2 = obtainStyledAttributes.getFloat(index, Float.NaN);
                    } else if (index == k.J2) {
                        enumC0015b = EnumC0015b.INT_TYPE;
                        integer = obtainStyledAttributes.getInteger(index, -1);
                        string = Integer.valueOf(integer);
                        Object obj2 = string;
                        enumC0015b2 = enumC0015b;
                        obj = obj2;
                    } else if (index == k.L2) {
                        enumC0015b = EnumC0015b.STRING_TYPE;
                        string = obtainStyledAttributes.getString(index);
                        Object obj22 = string;
                        enumC0015b2 = enumC0015b;
                        obj = obj22;
                    }
                    string = Float.valueOf(f2);
                    Object obj222 = string;
                    enumC0015b2 = enumC0015b;
                    obj = obj222;
                }
                integer = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(integer);
                Object obj2222 = string;
                enumC0015b2 = enumC0015b;
                obj = obj2222;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new b(str, enumC0015b2, obj));
        }
        obtainStyledAttributes.recycle();
    }

    public static void c(View view, HashMap<String, b> hashMap) {
        StringBuilder sb;
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            b bVar = hashMap.get(str);
            String str2 = "set" + str;
            try {
                switch (a.f1047a[bVar.f1041b.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.f1046g));
                        break;
                    case 2:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.f1046g);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.f1042c));
                        break;
                    case 4:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(bVar.f1043d));
                        break;
                    case 5:
                        cls.getMethod(str2, CharSequence.class).invoke(view, bVar.f1044e);
                        break;
                    case 6:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(bVar.f1045f));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(bVar.f1043d));
                        break;
                }
            } catch (IllegalAccessException e3) {
                e = e3;
                sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            } catch (NoSuchMethodException e4) {
                Log.e("TransitionLayout", e4.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str2);
                Log.e("TransitionLayout", sb2.toString());
            } catch (InvocationTargetException e5) {
                e = e5;
                sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            }
        }
    }

    public void d(Object obj) {
        switch (a.f1047a[this.f1041b.ordinal()]) {
            case 1:
            case 2:
                this.f1046g = ((Integer) obj).intValue();
                break;
            case 3:
                this.f1042c = ((Integer) obj).intValue();
                break;
            case 4:
            case 7:
                this.f1043d = ((Float) obj).floatValue();
                break;
            case 5:
                this.f1044e = (String) obj;
                break;
            case 6:
                this.f1045f = ((Boolean) obj).booleanValue();
                break;
        }
    }
}
