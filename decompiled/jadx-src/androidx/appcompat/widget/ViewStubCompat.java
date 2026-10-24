package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: e, reason: collision with root package name */
    private int f579e;

    /* renamed from: f, reason: collision with root package name */
    private int f580f;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference<View> f581g;

    /* renamed from: h, reason: collision with root package name */
    private LayoutInflater f582h;

    /* renamed from: i, reason: collision with root package name */
    private a f583i;

    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f579e = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.j.E3, i2, 0);
        this.f580f = obtainStyledAttributes.getResourceId(b.j.H3, -1);
        this.f579e = obtainStyledAttributes.getResourceId(b.j.G3, 0);
        setId(obtainStyledAttributes.getResourceId(b.j.F3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f579e == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f582h;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f579e, viewGroup, false);
        int i2 = this.f580f;
        if (i2 != -1) {
            inflate.setId(i2);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f581g = new WeakReference<>(inflate);
        a aVar = this.f583i;
        if (aVar != null) {
            aVar.a(this, inflate);
        }
        return inflate;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f580f;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f582h;
    }

    public int getLayoutResource() {
        return this.f579e;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i2) {
        this.f580f = i2;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f582h = layoutInflater;
    }

    public void setLayoutResource(int i2) {
        this.f579e = i2;
    }

    public void setOnInflateListener(a aVar) {
        this.f583i = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        WeakReference<View> weakReference = this.f581g;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i2);
            return;
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            a();
        }
    }
}
