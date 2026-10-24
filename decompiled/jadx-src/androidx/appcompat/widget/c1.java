package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
class c1 extends y.c implements View.OnClickListener {
    private int A;
    private int B;
    private int C;

    /* renamed from: p, reason: collision with root package name */
    private final SearchView f645p;

    /* renamed from: q, reason: collision with root package name */
    private final SearchableInfo f646q;

    /* renamed from: r, reason: collision with root package name */
    private final Context f647r;

    /* renamed from: s, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f648s;

    /* renamed from: t, reason: collision with root package name */
    private final int f649t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f650u;

    /* renamed from: v, reason: collision with root package name */
    private int f651v;

    /* renamed from: w, reason: collision with root package name */
    private ColorStateList f652w;

    /* renamed from: x, reason: collision with root package name */
    private int f653x;

    /* renamed from: y, reason: collision with root package name */
    private int f654y;

    /* renamed from: z, reason: collision with root package name */
    private int f655z;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f656a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f657b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f658c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f659d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f660e;

        public a(View view) {
            this.f656a = (TextView) view.findViewById(R.id.text1);
            this.f657b = (TextView) view.findViewById(R.id.text2);
            this.f658c = (ImageView) view.findViewById(R.id.icon1);
            this.f659d = (ImageView) view.findViewById(R.id.icon2);
            this.f660e = (ImageView) view.findViewById(b.f.f2239q);
        }
    }

    public c1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f650u = false;
        this.f651v = 1;
        this.f653x = -1;
        this.f654y = -1;
        this.f655z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.f645p = searchView;
        this.f646q = searchableInfo;
        this.f649t = searchView.getSuggestionCommitIconResId();
        this.f647r = context;
        this.f648s = weakHashMap;
    }

    private void A(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable j(String str) {
        Drawable.ConstantState constantState = this.f648s.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence k(CharSequence charSequence) {
        if (this.f652w == null) {
            TypedValue typedValue = new TypedValue();
            this.f4498h.getTheme().resolveAttribute(b.a.J, typedValue, true);
            this.f652w = this.f4498h.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f652w, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable l(ComponentName componentName) {
        String obj;
        ActivityInfo activityInfo;
        int iconResource;
        PackageManager packageManager = this.f4498h.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
            iconResource = activityInfo.getIconResource();
        } catch (PackageManager.NameNotFoundException e3) {
            obj = e3.toString();
        }
        if (iconResource == 0) {
            return null;
        }
        Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
        if (drawable != null) {
            return drawable;
        }
        obj = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
        Log.w("SuggestionsAdapter", obj);
        return null;
    }

    private Drawable m(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f648s.containsKey(flattenToShortString)) {
            Drawable l2 = l(componentName);
            this.f648s.put(flattenToShortString, l2 != null ? l2.getConstantState() : null);
            return l2;
        }
        Drawable.ConstantState constantState = this.f648s.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f647r.getResources());
    }

    public static String n(Cursor cursor, String str) {
        return v(cursor, cursor.getColumnIndex(str));
    }

    private Drawable o() {
        Drawable m2 = m(this.f646q.getSearchActivity());
        return m2 != null ? m2 : this.f4498h.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable p(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return q(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f647r.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(openInputStream, null);
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException e3) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e3);
                }
            }
        } catch (FileNotFoundException e4) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e4.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e4.getMessage());
        return null;
    }

    private Drawable r(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f647r.getPackageName() + "/" + parseInt;
            Drawable j2 = j(str2);
            if (j2 != null) {
                return j2;
            }
            Drawable c3 = androidx.core.content.a.c(this.f647r, parseInt);
            z(str2, c3);
            return c3;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable j3 = j(str);
            if (j3 != null) {
                return j3;
            }
            Drawable p2 = p(Uri.parse(str));
            z(str, p2);
            return p2;
        }
    }

    private Drawable s(Cursor cursor) {
        int i2 = this.A;
        if (i2 == -1) {
            return null;
        }
        Drawable r2 = r(cursor.getString(i2));
        return r2 != null ? r2 : o();
    }

    private Drawable t(Cursor cursor) {
        int i2 = this.B;
        if (i2 == -1) {
            return null;
        }
        return r(cursor.getString(i2));
    }

    private static String v(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e3) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e3);
            return null;
        }
    }

    private void x(ImageView imageView, Drawable drawable, int i2) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i2);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    private void z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f648s.put(str, drawable.getConstantState());
        }
    }

    @Override // y.a, y.b.a
    public void a(Cursor cursor) {
        if (this.f650u) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f653x = cursor.getColumnIndex("suggest_text_1");
                this.f654y = cursor.getColumnIndex("suggest_text_2");
                this.f655z = cursor.getColumnIndex("suggest_text_2_url");
                this.A = cursor.getColumnIndex("suggest_icon_1");
                this.B = cursor.getColumnIndex("suggest_icon_2");
                this.C = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e3) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e3);
        }
    }

    @Override // y.b.a
    public Cursor c(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f645p.getVisibility() == 0 && this.f645p.getWindowVisibility() == 0) {
            try {
                Cursor u2 = u(this.f646q, charSequence2, 50);
                if (u2 != null) {
                    u2.getCount();
                    return u2;
                }
            } catch (RuntimeException e3) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e3);
            }
        }
        return null;
    }

    @Override // y.a, y.b.a
    public CharSequence convertToString(Cursor cursor) {
        String n2;
        String n3;
        if (cursor == null) {
            return null;
        }
        String n4 = n(cursor, "suggest_intent_query");
        if (n4 != null) {
            return n4;
        }
        if (this.f646q.shouldRewriteQueryFromData() && (n3 = n(cursor, "suggest_intent_data")) != null) {
            return n3;
        }
        if (!this.f646q.shouldRewriteQueryFromText() || (n2 = n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return n2;
    }

    @Override // y.a
    public void d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i2 = this.C;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        if (aVar.f656a != null) {
            y(aVar.f656a, v(cursor, this.f653x));
        }
        if (aVar.f657b != null) {
            String v2 = v(cursor, this.f655z);
            CharSequence k2 = v2 != null ? k(v2) : v(cursor, this.f654y);
            if (TextUtils.isEmpty(k2)) {
                TextView textView = aVar.f656a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f656a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f656a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f656a.setMaxLines(1);
                }
            }
            y(aVar.f657b, k2);
        }
        ImageView imageView = aVar.f658c;
        if (imageView != null) {
            x(imageView, s(cursor), 4);
        }
        ImageView imageView2 = aVar.f659d;
        if (imageView2 != null) {
            x(imageView2, t(cursor), 8);
        }
        int i4 = this.f651v;
        if (i4 != 2 && (i4 != 1 || (i3 & 1) == 0)) {
            aVar.f660e.setVisibility(8);
            return;
        }
        aVar.f660e.setVisibility(0);
        aVar.f660e.setTag(aVar.f656a.getText());
        aVar.f660e.setOnClickListener(this);
    }

    @Override // y.c, y.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View g2 = super.g(context, cursor, viewGroup);
        g2.setTag(new a(g2));
        ((ImageView) g2.findViewById(b.f.f2239q)).setImageResource(this.f649t);
        return g2;
    }

    @Override // y.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View f2 = f(this.f4498h, this.f4497g, viewGroup);
            if (f2 != null) {
                ((a) f2.getTag()).f656a.setText(e3.toString());
            }
            return f2;
        }
    }

    @Override // y.a, android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View g2 = g(this.f4498h, this.f4497g, viewGroup);
            if (g2 != null) {
                ((a) g2.getTag()).f656a.setText(e3.toString());
            }
            return g2;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        A(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        A(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f645p.Q((CharSequence) tag);
        }
    }

    Drawable q(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f4498h.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor u(SearchableInfo searchableInfo, String str, int i2) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i2 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i2));
        }
        return this.f4498h.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void w(int i2) {
        this.f651v = i2;
    }
}
