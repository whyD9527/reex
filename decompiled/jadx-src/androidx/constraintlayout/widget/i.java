package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p.e;

/* loaded from: classes.dex */
public class i extends View {

    /* renamed from: e, reason: collision with root package name */
    private int f1167e;

    /* renamed from: f, reason: collision with root package name */
    private View f1168f;

    /* renamed from: g, reason: collision with root package name */
    private int f1169g;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f1168f == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f1168f.getLayoutParams();
        bVar2.f1014n0.T0(0);
        e.b y2 = bVar.f1014n0.y();
        e.b bVar3 = e.b.FIXED;
        if (y2 != bVar3) {
            bVar.f1014n0.U0(bVar2.f1014n0.R());
        }
        if (bVar.f1014n0.O() != bVar3) {
            bVar.f1014n0.v0(bVar2.f1014n0.v());
        }
        bVar2.f1014n0.T0(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f1167e == -1 && !isInEditMode()) {
            setVisibility(this.f1169g);
        }
        View findViewById = constraintLayout.findViewById(this.f1167e);
        this.f1168f = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).f990b0 = true;
            this.f1168f.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f1168f;
    }

    public int getEmptyVisibility() {
        return this.f1169g;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i2) {
        View findViewById;
        if (this.f1167e == i2) {
            return;
        }
        View view = this.f1168f;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f1168f.getLayoutParams()).f990b0 = false;
            this.f1168f = null;
        }
        this.f1167e = i2;
        if (i2 == -1 || (findViewById = ((View) getParent()).findViewById(i2)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i2) {
        this.f1169g = i2;
    }
}
