package io.flutter.embedding.android;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: f, reason: collision with root package name */
    private static final Matrix f2984f = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    private final FlutterRenderer f2985a;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2987c;

    /* renamed from: e, reason: collision with root package name */
    private int f2989e;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Integer, float[]> f2988d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final c0 f2986b = c0.a();

    public c(FlutterRenderer flutterRenderer, boolean z2) {
        this.f2985a = flutterRenderer;
        this.f2987c = z2;
    }

    private void a(MotionEvent motionEvent, int i2, int i3, int i4, Matrix matrix, ByteBuffer byteBuffer) {
        b(motionEvent, i2, i3, i4, matrix, byteBuffer, null);
    }

    private void b(MotionEvent motionEvent, int i2, int i3, int i4, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        long j2;
        long j3;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        InputDevice.MotionRange motionRange;
        int i5 = -1;
        if (i3 == -1) {
            return;
        }
        int pointerId = motionEvent.getPointerId(i2);
        int f2 = f(motionEvent.getToolType(i2));
        float[] fArr = {motionEvent.getX(i2), motionEvent.getY(i2)};
        matrix.mapPoints(fArr);
        if (f2 == 1) {
            j2 = motionEvent.getButtonState() & 31;
            if (j2 == 0 && motionEvent.getSource() == 8194 && i3 == 4) {
                this.f2988d.put(Integer.valueOf(pointerId), fArr);
            }
        } else {
            j2 = f2 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean containsKey = this.f2988d.containsKey(Integer.valueOf(pointerId));
        if (containsKey) {
            int e3 = e(i3);
            if (e3 == -1) {
                return;
            } else {
                i5 = e3;
            }
        }
        long d9 = this.f2987c ? this.f2986b.c(motionEvent).d() : 0L;
        int i6 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        int i7 = i5;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(d9);
        byteBuffer.putLong(eventTime);
        if (containsKey) {
            byteBuffer.putLong(i7);
            j3 = 4;
        } else {
            byteBuffer.putLong(i3);
            j3 = f2;
        }
        byteBuffer.putLong(j3);
        byteBuffer.putLong(i6);
        byteBuffer.putLong(pointerId);
        byteBuffer.putLong(0L);
        if (containsKey) {
            float[] fArr2 = this.f2988d.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr2[0]);
            d3 = fArr2[1];
        } else {
            byteBuffer.putDouble(fArr[0]);
            d3 = fArr[1];
        }
        byteBuffer.putDouble(d3);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j2);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i2));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            d4 = 1.0d;
            d5 = 0.0d;
        } else {
            d5 = motionRange.getMin();
            d4 = motionRange.getMax();
        }
        byteBuffer.putDouble(d5);
        byteBuffer.putDouble(d4);
        if (f2 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, i2));
            d6 = 0.0d;
        } else {
            d6 = 0.0d;
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d6);
        byteBuffer.putDouble(motionEvent.getSize(i2));
        byteBuffer.putDouble(motionEvent.getToolMajor(i2));
        byteBuffer.putDouble(motionEvent.getToolMinor(i2));
        byteBuffer.putDouble(d6);
        byteBuffer.putDouble(d6);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, i2));
        if (f2 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, i2));
        } else {
            byteBuffer.putDouble(d6);
        }
        byteBuffer.putLong(i4);
        if (i6 == 1) {
            double d10 = 48.0d;
            if (context != null) {
                d10 = c(context);
                d8 = g(context);
            } else {
                d8 = 48.0d;
            }
            byteBuffer.putDouble(d10 * (-motionEvent.getAxisValue(10, i2)));
            byteBuffer.putDouble(d8 * (-motionEvent.getAxisValue(9, i2)));
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (containsKey) {
            float[] fArr3 = this.f2988d.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr[0] - fArr3[0]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d7 = 0.0d;
        } else {
            d7 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d7);
        byteBuffer.putDouble(d7);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d7);
        byteBuffer.putLong(0L);
        if (containsKey && i7 == 9) {
            this.f2988d.remove(Integer.valueOf(pointerId));
        }
    }

    private float c(Context context) {
        float scaledHorizontalScrollFactor;
        if (Build.VERSION.SDK_INT < 26) {
            return i(context);
        }
        scaledHorizontalScrollFactor = ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
        return scaledHorizontalScrollFactor;
    }

    private int d(int i2) {
        if (i2 == 0) {
            return 4;
        }
        if (i2 == 1) {
            return 6;
        }
        if (i2 == 5) {
            return 4;
        }
        if (i2 == 6) {
            return 6;
        }
        if (i2 == 2) {
            return 5;
        }
        if (i2 == 7) {
            return 3;
        }
        if (i2 == 3) {
            return 0;
        }
        return i2 == 8 ? 3 : -1;
    }

    private int e(int i2) {
        if (i2 == 4) {
            return 7;
        }
        if (i2 == 5) {
            return 8;
        }
        return (i2 == 6 || i2 == 0) ? 9 : -1;
    }

    private int f(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 2;
        }
        if (i2 != 3) {
            return i2 != 4 ? 5 : 3;
        }
        return 1;
    }

    private float g(Context context) {
        return Build.VERSION.SDK_INT >= 26 ? h(context) : i(context);
    }

    @TargetApi(26)
    private float h(Context context) {
        float scaledVerticalScrollFactor;
        scaledVerticalScrollFactor = ViewConfiguration.get(context).getScaledVerticalScrollFactor();
        return scaledVerticalScrollFactor;
    }

    private int i(Context context) {
        if (this.f2989e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f2989e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2989e;
    }

    public boolean j(MotionEvent motionEvent, Context context) {
        boolean z2 = motionEvent.isFromSource(2);
        boolean z3 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!z2 || !z3) {
            return false;
        }
        int d3 = d(motionEvent.getActionMasked());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 36 * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        b(motionEvent, motionEvent.getActionIndex(), d3, 0, f2984f, allocateDirect, context);
        if (allocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary.");
        }
        this.f2985a.m(allocateDirect, allocateDirect.position());
        return true;
    }

    public boolean k(MotionEvent motionEvent) {
        return l(motionEvent, f2984f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean l(MotionEvent motionEvent, Matrix matrix) {
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(pointerCount * 36 * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        int actionMasked = motionEvent.getActionMasked();
        int d3 = d(motionEvent.getActionMasked());
        boolean z2 = actionMasked == 0 || actionMasked == 5;
        boolean z3 = !z2 && (actionMasked == 1 || actionMasked == 6);
        if (!z2) {
            int i2 = 0;
            if (!z3) {
                while (i2 < pointerCount) {
                    a(motionEvent, i2, d3, 0, matrix, allocateDirect);
                    i2++;
                }
                if (allocateDirect.position() % 288 == 0) {
                    throw new AssertionError("Packet position is not on field boundary");
                }
                this.f2985a.m(allocateDirect, allocateDirect.position());
                return true;
            }
            while (i2 < pointerCount) {
                if (i2 != motionEvent.getActionIndex() && motionEvent.getToolType(i2) == 1) {
                    a(motionEvent, i2, 5, 1, matrix, allocateDirect);
                }
                i2++;
            }
        }
        a(motionEvent, motionEvent.getActionIndex(), d3, 0, matrix, allocateDirect);
        if (allocateDirect.position() % 288 == 0) {
        }
    }
}
