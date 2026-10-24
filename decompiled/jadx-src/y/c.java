package y;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: m, reason: collision with root package name */
    private int f4506m;

    /* renamed from: n, reason: collision with root package name */
    private int f4507n;

    /* renamed from: o, reason: collision with root package name */
    private LayoutInflater f4508o;

    @Deprecated
    public c(Context context, int i2, Cursor cursor, boolean z2) {
        super(context, cursor, z2);
        this.f4507n = i2;
        this.f4506m = i2;
        this.f4508o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // y.a
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f4508o.inflate(this.f4507n, viewGroup, false);
    }

    @Override // y.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f4508o.inflate(this.f4506m, viewGroup, false);
    }
}
