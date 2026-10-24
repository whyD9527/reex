package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class h extends View {
    public h(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i2) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f987a = i2;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i2) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f989b = i2;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f2) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f991c = f2;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }
}
