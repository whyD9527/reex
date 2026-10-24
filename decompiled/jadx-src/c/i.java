package c;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.f1;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.o;
import androidx.appcompat.widget.p;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.t;
import androidx.appcompat.widget.u;
import androidx.appcompat.widget.w;
import androidx.core.view.f0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f2468b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f2469c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f2470d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e, reason: collision with root package name */
    private static final l.g<String, Constructor<? extends View>> f2471e = new l.g<>();

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f2472a = new Object[2];

    private static class a implements View.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        private final View f2473e;

        /* renamed from: f, reason: collision with root package name */
        private final String f2474f;

        /* renamed from: g, reason: collision with root package name */
        private Method f2475g;

        /* renamed from: h, reason: collision with root package name */
        private Context f2476h;

        public a(View view, String str) {
            this.f2473e = view;
            this.f2474f = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f2474f, View.class)) != null) {
                        this.f2475g = method;
                        this.f2476h = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f2473e.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f2473e.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f2474f + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f2473e.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f2475g == null) {
                a(this.f2473e.getContext());
            }
            try {
                this.f2475g.invoke(this.f2476h, view);
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("Could not execute method for android:onClick", e4);
            }
        }
    }

    private void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && f0.t(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2469c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View r(Context context, String str, String str2) {
        String str3;
        l.g<String, Constructor<? extends View>> gVar = f2471e;
        Constructor<? extends View> constructor = gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2468b);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f2472a);
    }

    private View s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f2472a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return r(context, str, null);
            }
            int i2 = 0;
            while (true) {
                String[] strArr = f2470d;
                if (i2 >= strArr.length) {
                    return null;
                }
                View r2 = r(context, str, strArr[i2]);
                if (r2 != null) {
                    return r2;
                }
                i2++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f2472a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context t(Context context, AttributeSet attributeSet, boolean z2, boolean z3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.j.x3, 0, 0);
        int resourceId = z2 ? obtainStyledAttributes.getResourceId(b.j.y3, 0) : 0;
        if (z3 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(b.j.z3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof g.d) && ((g.d) context).c() == resourceId) ? context : new g.d(context, resourceId) : context;
    }

    private void u(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected androidx.appcompat.widget.d b(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.d(context, attributeSet);
    }

    protected androidx.appcompat.widget.f c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f(context, attributeSet);
    }

    protected androidx.appcompat.widget.g d(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.g(context, attributeSet);
    }

    protected androidx.appcompat.widget.h e(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.h(context, attributeSet);
    }

    protected androidx.appcompat.widget.k f(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.k(context, attributeSet);
    }

    protected androidx.appcompat.widget.m g(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.m(context, attributeSet);
    }

    protected o h(Context context, AttributeSet attributeSet) {
        return new o(context, attributeSet);
    }

    protected p i(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    protected s j(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    protected t k(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    protected u l(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    protected w m(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    protected androidx.appcompat.widget.f0 n(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f0(context, attributeSet);
    }

    protected j0 o(Context context, AttributeSet attributeSet) {
        return new j0(context, attributeSet);
    }

    protected View p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    final View q(View view, String str, Context context, AttributeSet attributeSet, boolean z2, boolean z3, boolean z4, boolean z5) {
        Context context2;
        View k2;
        context2 = (!z2 || view == null) ? context : view.getContext();
        if (z3 || z4) {
            context2 = t(context2, attributeSet, z3, z4);
        }
        if (z5) {
            context2 = f1.b(context2);
        }
        str.hashCode();
        switch (str) {
            case "RatingBar":
                k2 = k(context2, attributeSet);
                u(k2, str);
                break;
            case "CheckedTextView":
                k2 = e(context2, attributeSet);
                u(k2, str);
                break;
            case "MultiAutoCompleteTextView":
                k2 = i(context2, attributeSet);
                u(k2, str);
                break;
            case "TextView":
                k2 = n(context2, attributeSet);
                u(k2, str);
                break;
            case "ImageButton":
                k2 = g(context2, attributeSet);
                u(k2, str);
                break;
            case "SeekBar":
                k2 = l(context2, attributeSet);
                u(k2, str);
                break;
            case "Spinner":
                k2 = m(context2, attributeSet);
                u(k2, str);
                break;
            case "RadioButton":
                k2 = j(context2, attributeSet);
                u(k2, str);
                break;
            case "ToggleButton":
                k2 = o(context2, attributeSet);
                u(k2, str);
                break;
            case "ImageView":
                k2 = h(context2, attributeSet);
                u(k2, str);
                break;
            case "AutoCompleteTextView":
                k2 = b(context2, attributeSet);
                u(k2, str);
                break;
            case "CheckBox":
                k2 = d(context2, attributeSet);
                u(k2, str);
                break;
            case "EditText":
                k2 = f(context2, attributeSet);
                u(k2, str);
                break;
            case "Button":
                k2 = c(context2, attributeSet);
                u(k2, str);
                break;
            default:
                k2 = p(context2, str, attributeSet);
                break;
        }
        if (k2 == null && context != context2) {
            k2 = s(context2, str, attributeSet);
        }
        if (k2 != null) {
            a(k2, attributeSet);
        }
        return k2;
    }
}
