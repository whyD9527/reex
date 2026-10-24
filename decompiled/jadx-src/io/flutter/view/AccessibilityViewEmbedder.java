package io.flutter.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Keep
/* loaded from: classes.dex */
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final b reflectionAccessors = new b();
    private final SparseArray<c> flutterIdToOrigin = new SparseArray<>();
    private final Map<c, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Method f3436a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f3437b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f3438c;

        /* renamed from: d, reason: collision with root package name */
        private final Method f3439d;

        /* renamed from: e, reason: collision with root package name */
        private final Field f3440e;

        /* renamed from: f, reason: collision with root package name */
        private final Method f3441f;

        /* JADX WARN: Multi-variable type inference failed */
        @SuppressLint({"DiscouragedPrivateApi,PrivateApi"})
        private b() {
            Method method;
            Method method2;
            Method method3;
            Field field;
            Field declaredField;
            Method method4;
            Method method5;
            Field field2;
            Method method6 = null;
            try {
                method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused) {
                n0.b.g(AccessibilityViewEmbedder.TAG, "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
                method = null;
            }
            try {
                method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused2) {
                n0.b.g(AccessibilityViewEmbedder.TAG, "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
                method2 = null;
            }
            if (Build.VERSION.SDK_INT > 26) {
                try {
                    declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                    declaredField.setAccessible(true);
                    method4 = Class.forName("android.util.LongArray").getMethod("get", Integer.TYPE);
                    method3 = null;
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused3) {
                    n0.b.g(AccessibilityViewEmbedder.TAG, "can't access childNodeIdsField with reflection");
                    method3 = null;
                    field = null;
                }
                this.f3436a = method;
                this.f3437b = method6;
                this.f3438c = method2;
                this.f3439d = method3;
                this.f3440e = declaredField;
                this.f3441f = method4;
            }
            try {
                method5 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", new Class[0]);
            } catch (NoSuchMethodException unused4) {
                n0.b.g(AccessibilityViewEmbedder.TAG, "can't invoke getParentNodeId with reflection");
                method5 = null;
            }
            try {
                method3 = AccessibilityNodeInfo.class.getMethod("getChildId", Integer.TYPE);
                field2 = null;
            } catch (NoSuchMethodException unused5) {
                n0.b.g(AccessibilityViewEmbedder.TAG, "can't invoke getChildId with reflection");
                method3 = null;
                field2 = null;
            }
            method6 = method5;
            field = field2;
            declaredField = field;
            method4 = field;
            this.f3436a = method;
            this.f3437b = method6;
            this.f3438c = method2;
            this.f3439d = method3;
            this.f3440e = declaredField;
            this.f3441f = method4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long f(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
            String str;
            Method method = this.f3439d;
            if (method == null && (this.f3440e == null || this.f3441f == null)) {
                return null;
            }
            if (method != null) {
                try {
                    return (Long) method.invoke(accessibilityNodeInfo, Integer.valueOf(i2));
                } catch (IllegalAccessException e3) {
                    e = e3;
                    str = "Failed to access getChildId method.";
                } catch (InvocationTargetException e4) {
                    e = e4;
                    str = "The getChildId method threw an exception when invoked.";
                }
            } else {
                try {
                    return Long.valueOf(((Long) this.f3441f.invoke(this.f3440e.get(accessibilityNodeInfo), Integer.valueOf(i2))).longValue());
                } catch (ArrayIndexOutOfBoundsException e5) {
                    e = e5;
                    str = "The longArrayGetIndex method threw an exception when invoked.";
                    n0.b.h(AccessibilityViewEmbedder.TAG, str, e);
                    return null;
                } catch (IllegalAccessException e6) {
                    e = e6;
                    str = "Failed to access longArrayGetIndex method or the childNodeId field.";
                } catch (InvocationTargetException e7) {
                    e = e7;
                    str = "The longArrayGetIndex method threw an exception when invoked.";
                    n0.b.h(AccessibilityViewEmbedder.TAG, str, e);
                    return null;
                }
            }
            n0.b.h(AccessibilityViewEmbedder.TAG, str, e);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long g(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            Method method = this.f3437b;
            if (method != null) {
                try {
                    return Long.valueOf(((Long) method.invoke(accessibilityNodeInfo, new Object[0])).longValue());
                } catch (IllegalAccessException e3) {
                    e = e3;
                    str = "Failed to access getParentNodeId method.";
                    n0.b.h(AccessibilityViewEmbedder.TAG, str, e);
                    return l(accessibilityNodeInfo);
                } catch (InvocationTargetException e4) {
                    e = e4;
                    str = "The getParentNodeId method threw an exception when invoked.";
                    n0.b.h(AccessibilityViewEmbedder.TAG, str, e);
                    return l(accessibilityNodeInfo);
                }
            }
            return l(accessibilityNodeInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long h(AccessibilityRecord accessibilityRecord) {
            String str;
            Method method = this.f3438c;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityRecord, new Object[0]);
            } catch (IllegalAccessException e3) {
                e = e3;
                str = "Failed to access the getRecordSourceNodeId method.";
                n0.b.h(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            } catch (InvocationTargetException e4) {
                e = e4;
                str = "The getRecordSourceNodeId method threw an exception when invoked.";
                n0.b.h(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long i(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            Method method = this.f3436a;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
            } catch (IllegalAccessException e3) {
                e = e3;
                str = "Failed to access getSourceNodeId method.";
                n0.b.h(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            } catch (InvocationTargetException e4) {
                e = e4;
                str = "The getSourceNodeId method threw an exception when invoked.";
                n0.b.h(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int j(long j2) {
            return (int) (j2 >> 32);
        }

        private static boolean k(long j2, int i2) {
            return (j2 & (1 << i2)) != 0;
        }

        private static Long l(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (Build.VERSION.SDK_INT < 26) {
                n0.b.g(AccessibilityViewEmbedder.TAG, "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel obtain2 = Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            long readLong = obtain2.readLong();
            if (k(readLong, 0)) {
                obtain2.readInt();
            }
            if (k(readLong, 1)) {
                obtain2.readLong();
            }
            if (k(readLong, 2)) {
                obtain2.readInt();
            }
            Long valueOf = k(readLong, 3) ? Long.valueOf(obtain2.readLong()) : null;
            obtain2.recycle();
            return valueOf;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final View f3442a;

        /* renamed from: b, reason: collision with root package name */
        final int f3443b;

        private c(View view, int i2) {
            this.f3442a = view;
            this.f3443b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f3443b == cVar.f3443b && this.f3442a.equals(cVar.f3442a);
        }

        public int hashCode() {
            return ((this.f3442a.hashCode() + 31) * 31) + this.f3443b;
        }
    }

    AccessibilityViewEmbedder(View view, int i2) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i2;
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        int i2;
        for (int i3 = 0; i3 < accessibilityNodeInfo.getChildCount(); i3++) {
            Long f2 = this.reflectionAccessors.f(accessibilityNodeInfo, i3);
            if (f2 != null) {
                int j2 = b.j(f2.longValue());
                c cVar = new c(view, j2);
                if (this.originToFlutterId.containsKey(cVar)) {
                    i2 = this.originToFlutterId.get(cVar).intValue();
                } else {
                    int i4 = this.nextFlutterId;
                    this.nextFlutterId = i4 + 1;
                    cacheVirtualIdMappings(view, j2, i4);
                    i2 = i4;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i2);
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i2, int i3) {
        c cVar = new c(view, i2);
        this.originToFlutterId.put(cVar, Integer.valueOf(i3));
        this.flutterIdToOrigin.put(i3, cVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i2, View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i2);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i2);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        List availableExtraData;
        CharSequence hintText;
        boolean isShowingHintText;
        int drawingOrder;
        boolean isImportantForAccessibility;
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        int i2 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        if (i2 >= 24) {
            drawingOrder = accessibilityNodeInfo.getDrawingOrder();
            accessibilityNodeInfo2.setDrawingOrder(drawingOrder);
            isImportantForAccessibility = accessibilityNodeInfo.isImportantForAccessibility();
            accessibilityNodeInfo2.setImportantForAccessibility(isImportantForAccessibility);
        }
        if (i2 >= 26) {
            availableExtraData = accessibilityNodeInfo.getAvailableExtraData();
            accessibilityNodeInfo2.setAvailableExtraData(availableExtraData);
            hintText = accessibilityNodeInfo.getHintText();
            accessibilityNodeInfo2.setHintText(hintText);
            isShowingHintText = accessibilityNodeInfo.isShowingHintText();
            accessibilityNodeInfo2.setShowingHintText(isShowingHintText);
        }
    }

    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long g2 = this.reflectionAccessors.g(accessibilityNodeInfo);
        if (g2 == null) {
            return;
        }
        Integer num = this.originToFlutterId.get(new c(view, b.j(g2.longValue())));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        c cVar = this.flutterIdToOrigin.get(i2);
        if (cVar == null || !this.embeddedViewToDisplayBounds.containsKey(cVar.f3442a) || cVar.f3442a.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = cVar.f3442a.getAccessibilityNodeProvider().createAccessibilityNodeInfo(cVar.f3443b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i2, cVar.f3442a);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long h2 = this.reflectionAccessors.h(accessibilityRecord);
        if (h2 == null) {
            return null;
        }
        return this.originToFlutterId.get(new c(view, b.j(h2.longValue())));
    }

    public AccessibilityNodeInfo getRootNode(View view, int i2, Rect rect) {
        AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long i3 = this.reflectionAccessors.i(createAccessibilityNodeInfo);
        if (i3 == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, b.j(i3.longValue()), i2);
        return convertToFlutterNode(createAccessibilityNodeInfo, i2, view);
    }

    public boolean onAccessibilityHoverEvent(int i2, MotionEvent motionEvent) {
        c cVar = this.flutterIdToOrigin.get(i2);
        if (cVar == null) {
            return false;
        }
        Rect rect = this.embeddedViewToDisplayBounds.get(cVar.f3442a);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < motionEvent.getPointerCount(); i3++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i3] = pointerProperties;
            motionEvent.getPointerProperties(i3, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i3, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i3] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return cVar.f3442a.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i2, int i3, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        c cVar = this.flutterIdToOrigin.get(i2);
        if (cVar == null || (accessibilityNodeProvider = cVar.f3442a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(cVar.f3443b, i3, bundle);
    }

    public View platformViewOfNode(int i2) {
        c cVar = this.flutterIdToOrigin.get(i2);
        if (cVar == null) {
            return null;
        }
        return cVar.f3442a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long h2 = this.reflectionAccessors.h(accessibilityEvent);
        if (h2 == null) {
            return false;
        }
        int j2 = b.j(h2.longValue());
        Integer num = this.originToFlutterId.get(new c(view, j2));
        if (num == null) {
            int i2 = this.nextFlutterId;
            this.nextFlutterId = i2 + 1;
            num = Integer.valueOf(i2);
            cacheVirtualIdMappings(view, j2, num.intValue());
        }
        obtain.setSource(this.rootAccessibilityView, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i3 = 0; i3 < obtain.getRecordCount(); i3++) {
            AccessibilityRecord record = obtain.getRecord(i3);
            Long h3 = this.reflectionAccessors.h(record);
            if (h3 == null) {
                return false;
            }
            c cVar = new c(view, b.j(h3.longValue()));
            if (!this.originToFlutterId.containsKey(cVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(cVar).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
