package io.flutter.plugin.editing;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f3281a;

    /* renamed from: b, reason: collision with root package name */
    private CharSequence f3282b;

    /* renamed from: c, reason: collision with root package name */
    private int f3283c;

    /* renamed from: d, reason: collision with root package name */
    private int f3284d;

    /* renamed from: e, reason: collision with root package name */
    private int f3285e;

    /* renamed from: f, reason: collision with root package name */
    private int f3286f;

    /* renamed from: g, reason: collision with root package name */
    private int f3287g;

    /* renamed from: h, reason: collision with root package name */
    private int f3288h;

    public g(CharSequence charSequence, int i2, int i3, int i4, int i5) {
        this.f3285e = i2;
        this.f3286f = i3;
        this.f3287g = i4;
        this.f3288h = i5;
        a(charSequence, "", -1, -1);
    }

    public g(CharSequence charSequence, int i2, int i3, CharSequence charSequence2, int i4, int i5, int i6, int i7) {
        this.f3285e = i4;
        this.f3286f = i5;
        this.f3287g = i6;
        this.f3288h = i7;
        a(charSequence, charSequence2.toString(), i2, i3);
    }

    private void a(CharSequence charSequence, CharSequence charSequence2, int i2, int i3) {
        this.f3281a = charSequence;
        this.f3282b = charSequence2;
        this.f3283c = i2;
        this.f3284d = i3;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.f3281a.toString());
            jSONObject.put("deltaText", this.f3282b.toString());
            jSONObject.put("deltaStart", this.f3283c);
            jSONObject.put("deltaEnd", this.f3284d);
            jSONObject.put("selectionBase", this.f3285e);
            jSONObject.put("selectionExtent", this.f3286f);
            jSONObject.put("composingBase", this.f3287g);
            jSONObject.put("composingExtent", this.f3288h);
        } catch (JSONException e3) {
            n0.b.b("TextEditingDelta", "unable to create JSONObject: " + e3);
        }
        return jSONObject;
    }
}
