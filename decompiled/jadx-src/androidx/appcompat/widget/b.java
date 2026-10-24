package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    final ActionBarContainer f603a;

    public b(ActionBarContainer actionBarContainer) {
        this.f603a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f603a;
        if (actionBarContainer.f426l) {
            Drawable drawable = actionBarContainer.f425k;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f423i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f603a;
        Drawable drawable3 = actionBarContainer2.f424j;
        if (drawable3 == null || !actionBarContainer2.f427m) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f603a;
        if (actionBarContainer.f426l) {
            drawable = actionBarContainer.f425k;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f423i;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
