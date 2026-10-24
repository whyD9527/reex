package b1;

import android.annotation.TargetApi;
import android.view.PointerIcon;
import java.util.HashMap;
import y0.h;

@TargetApi(24)
/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static HashMap<String, Integer> f2373c;

    /* renamed from: a, reason: collision with root package name */
    private final c f2374a;

    /* renamed from: b, reason: collision with root package name */
    private final h f2375b;

    class a implements h.b {
        a() {
        }

        @Override // y0.h.b
        public void a(String str) {
            b.this.f2374a.setPointerIcon(b.this.d(str));
        }
    }

    /* renamed from: b1.b$b, reason: collision with other inner class name */
    class C0033b extends HashMap<String, Integer> {
        C0033b() {
            put("alias", 1010);
            put("allScroll", 1013);
            put("basic", 1000);
            put("cell", 1006);
            put("click", 1002);
            put("contextMenu", 1001);
            put("copy", 1011);
            put("forbidden", 1012);
            put("grab", 1020);
            put("grabbing", 1021);
            put("help", 1003);
            put("move", 1013);
            put("none", 0);
            put("noDrop", 1012);
            put("precise", 1007);
            put("text", 1008);
            put("resizeColumn", 1014);
            put("resizeDown", 1015);
            put("resizeUpLeft", 1016);
            put("resizeDownRight", 1017);
            put("resizeLeft", 1014);
            put("resizeLeftRight", 1014);
            put("resizeRight", 1014);
            put("resizeRow", 1015);
            put("resizeUp", 1015);
            put("resizeUpDown", 1015);
            put("resizeUpLeft", 1017);
            put("resizeUpRight", 1016);
            put("resizeUpLeftDownRight", 1017);
            put("resizeUpRightDownLeft", 1016);
            put("verticalText", 1009);
            put("wait", 1004);
            put("zoomIn", 1018);
            put("zoomOut", 1019);
        }
    }

    public interface c {
        PointerIcon b(int i2);

        void setPointerIcon(PointerIcon pointerIcon);
    }

    public b(c cVar, h hVar) {
        this.f2374a = cVar;
        this.f2375b = hVar;
        hVar.b(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PointerIcon d(String str) {
        Object orDefault;
        if (f2373c == null) {
            f2373c = new C0033b();
        }
        orDefault = f2373c.getOrDefault(str, 1000);
        return this.f2374a.b(((Integer) orDefault).intValue());
    }

    public void c() {
        this.f2375b.b(null);
    }
}
