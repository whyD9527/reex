package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f1429k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f1430a;

    /* renamed from: b, reason: collision with root package name */
    Object f1431b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f1432c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f1433d;

    /* renamed from: e, reason: collision with root package name */
    public int f1434e;

    /* renamed from: f, reason: collision with root package name */
    public int f1435f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1436g;

    /* renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f1437h;

    /* renamed from: i, reason: collision with root package name */
    public String f1438i;

    /* renamed from: j, reason: collision with root package name */
    public String f1439j;

    static class a {
        static IconCompat a(Object obj) {
            androidx.core.util.e.b(obj);
            int d3 = d(obj);
            if (d3 == 2) {
                return IconCompat.g(null, c(obj), b(obj));
            }
            if (d3 == 4) {
                return IconCompat.e(e(obj));
            }
            if (d3 == 6) {
                return IconCompat.c(e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f1431b = obj;
            return iconCompat;
        }

        static int b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon resource", e4);
                return 0;
            } catch (InvocationTargetException e5) {
                Log.e("IconCompat", "Unable to get icon resource", e5);
                return 0;
            }
        }

        static String c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon package", e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.e("IconCompat", "Unable to get icon package", e5);
                return null;
            }
        }

        static int d(Object obj) {
            StringBuilder sb;
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e3) {
                e = e3;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (NoSuchMethodException e4) {
                e = e4;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (InvocationTargetException e5) {
                e = e5;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            }
        }

        static Uri e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon uri", e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.e("IconCompat", "Unable to get icon uri", e5);
                return null;
            }
        }

        static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
        
            if (r0 >= 26) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        static Icon g(IconCompat iconCompat, Context context) {
            Bitmap bitmap;
            Icon createWithResource;
            Bitmap bitmap2;
            ColorStateList colorStateList;
            PorterDuff.Mode mode;
            switch (iconCompat.f1430a) {
                case -1:
                    return (Icon) iconCompat.f1431b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    bitmap = (Bitmap) iconCompat.f1431b;
                    createWithResource = Icon.createWithBitmap(bitmap);
                    colorStateList = iconCompat.f1436g;
                    if (colorStateList != null) {
                        createWithResource.setTintList(colorStateList);
                    }
                    mode = iconCompat.f1437h;
                    if (mode != IconCompat.f1429k) {
                        createWithResource.setTintMode(mode);
                    }
                    return createWithResource;
                case 2:
                    createWithResource = Icon.createWithResource(iconCompat.i(), iconCompat.f1434e);
                    colorStateList = iconCompat.f1436g;
                    if (colorStateList != null) {
                    }
                    mode = iconCompat.f1437h;
                    if (mode != IconCompat.f1429k) {
                    }
                    return createWithResource;
                case 3:
                    createWithResource = Icon.createWithData((byte[]) iconCompat.f1431b, iconCompat.f1434e, iconCompat.f1435f);
                    colorStateList = iconCompat.f1436g;
                    if (colorStateList != null) {
                    }
                    mode = iconCompat.f1437h;
                    if (mode != IconCompat.f1429k) {
                    }
                    return createWithResource;
                case 4:
                    createWithResource = Icon.createWithContentUri((String) iconCompat.f1431b);
                    colorStateList = iconCompat.f1436g;
                    if (colorStateList != null) {
                    }
                    mode = iconCompat.f1437h;
                    if (mode != IconCompat.f1429k) {
                    }
                    return createWithResource;
                case 5:
                    if (Build.VERSION.SDK_INT >= 26) {
                        bitmap2 = (Bitmap) iconCompat.f1431b;
                        createWithResource = b.b(bitmap2);
                        colorStateList = iconCompat.f1436g;
                        if (colorStateList != null) {
                        }
                        mode = iconCompat.f1437h;
                        if (mode != IconCompat.f1429k) {
                        }
                        return createWithResource;
                    }
                    bitmap2 = (Bitmap) iconCompat.f1431b;
                    bitmap = IconCompat.b(bitmap2, false);
                    createWithResource = Icon.createWithBitmap(bitmap);
                    colorStateList = iconCompat.f1436g;
                    if (colorStateList != null) {
                    }
                    mode = iconCompat.f1437h;
                    if (mode != IconCompat.f1429k) {
                    }
                    return createWithResource;
                case 6:
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30) {
                        createWithResource = d.a(iconCompat.k());
                        colorStateList = iconCompat.f1436g;
                        if (colorStateList != null) {
                        }
                        mode = iconCompat.f1437h;
                        if (mode != IconCompat.f1429k) {
                        }
                        return createWithResource;
                    }
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.k());
                    }
                    InputStream l2 = iconCompat.l(context);
                    if (l2 == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.k());
                    }
                    bitmap2 = BitmapFactory.decodeStream(l2);
                    break;
                    break;
            }
        }
    }

    static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            Icon createWithAdaptiveBitmap;
            createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
            return createWithAdaptiveBitmap;
        }
    }

    static class c {
        static int a(Object obj) {
            int resId;
            resId = ((Icon) obj).getResId();
            return resId;
        }

        static String b(Object obj) {
            String resPackage;
            resPackage = ((Icon) obj).getResPackage();
            return resPackage;
        }

        static int c(Object obj) {
            int type;
            type = ((Icon) obj).getType();
            return type;
        }

        static Uri d(Object obj) {
            Uri uri;
            uri = ((Icon) obj).getUri();
            return uri;
        }
    }

    static class d {
        static Icon a(Uri uri) {
            Icon createWithAdaptiveBitmapContentUri;
            createWithAdaptiveBitmapContentUri = Icon.createWithAdaptiveBitmapContentUri(uri);
            return createWithAdaptiveBitmapContentUri;
        }
    }

    public IconCompat() {
        this.f1430a = -1;
        this.f1432c = null;
        this.f1433d = null;
        this.f1434e = 0;
        this.f1435f = 0;
        this.f1436g = null;
        this.f1437h = f1429k;
        this.f1438i = null;
    }

    IconCompat(int i2) {
        this.f1432c = null;
        this.f1433d = null;
        this.f1434e = 0;
        this.f1435f = 0;
        this.f1436g = null;
        this.f1437h = f1429k;
        this.f1438i = null;
        this.f1430a = i2;
    }

    public static IconCompat a(Icon icon) {
        return a.a(icon);
    }

    static Bitmap b(Bitmap bitmap, boolean z2) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z2) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat c(Uri uri) {
        androidx.core.util.d.c(uri);
        return d(uri.toString());
    }

    public static IconCompat d(String str) {
        androidx.core.util.d.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f1431b = str;
        return iconCompat;
    }

    public static IconCompat e(Uri uri) {
        androidx.core.util.d.c(uri);
        return f(uri.toString());
    }

    public static IconCompat f(String str) {
        androidx.core.util.d.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f1431b = str;
        return iconCompat;
    }

    public static IconCompat g(Resources resources, String str, int i2) {
        androidx.core.util.d.c(str);
        if (i2 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f1434e = i2;
        if (resources != null) {
            try {
                iconCompat.f1431b = resources.getResourceName(i2);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f1431b = str;
        }
        iconCompat.f1439j = str;
        return iconCompat;
    }

    private static String q(int i2) {
        switch (i2) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public int h() {
        int i2 = this.f1430a;
        if (i2 == -1) {
            return a.b(this.f1431b);
        }
        if (i2 == 2) {
            return this.f1434e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String i() {
        int i2 = this.f1430a;
        if (i2 == -1) {
            return a.c(this.f1431b);
        }
        if (i2 == 2) {
            String str = this.f1439j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f1431b).split(":", -1)[0] : this.f1439j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int j() {
        int i2 = this.f1430a;
        return i2 == -1 ? a.d(this.f1431b) : i2;
    }

    public Uri k() {
        int i2 = this.f1430a;
        if (i2 == -1) {
            return a.e(this.f1431b);
        }
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.f1431b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream l(Context context) {
        StringBuilder sb;
        String str;
        Uri k2 = k();
        String scheme = k2.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(k2);
            } catch (Exception e3) {
                e = e3;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f1431b));
            } catch (FileNotFoundException e4) {
                e = e4;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(k2);
        Log.w("IconCompat", sb.toString(), e);
        return null;
    }

    public void m() {
        Parcelable parcelable;
        this.f1437h = PorterDuff.Mode.valueOf(this.f1438i);
        switch (this.f1430a) {
            case -1:
                parcelable = this.f1433d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f1433d;
                if (parcelable == null) {
                    byte[] bArr = this.f1432c;
                    this.f1431b = bArr;
                    this.f1430a = 3;
                    this.f1434e = 0;
                    this.f1435f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f1432c, Charset.forName("UTF-16"));
                this.f1431b = str;
                if (this.f1430a == 2 && this.f1439j == null) {
                    this.f1439j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f1431b = this.f1432c;
                return;
        }
        this.f1431b = parcelable;
    }

    public void n(boolean z2) {
        this.f1438i = this.f1437h.name();
        switch (this.f1430a) {
            case -1:
                if (z2) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z2) {
                    Bitmap bitmap = (Bitmap) this.f1431b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f1432c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f1432c = ((String) this.f1431b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f1432c = (byte[]) this.f1431b;
                return;
            case 4:
            case 6:
                this.f1432c = this.f1431b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f1433d = (Parcelable) this.f1431b;
    }

    @Deprecated
    public Icon o() {
        return p(null);
    }

    public Icon p(Context context) {
        return a.g(this, context);
    }

    public String toString() {
        int height;
        if (this.f1430a == -1) {
            return String.valueOf(this.f1431b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(q(this.f1430a));
        switch (this.f1430a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1431b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f1431b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1439j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(h())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1434e);
                if (this.f1435f != 0) {
                    sb.append(" off=");
                    height = this.f1435f;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1431b);
                break;
        }
        if (this.f1436g != null) {
            sb.append(" tint=");
            sb.append(this.f1436g);
        }
        if (this.f1437h != f1429k) {
            sb.append(" mode=");
            sb.append(this.f1437h);
        }
        sb.append(")");
        return sb.toString();
    }
}
