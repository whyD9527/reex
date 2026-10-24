package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import p.d;
import p.e;
import q.b;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private int A;

    /* renamed from: e, reason: collision with root package name */
    SparseArray<View> f964e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<androidx.constraintlayout.widget.c> f965f;

    /* renamed from: g, reason: collision with root package name */
    protected p.f f966g;

    /* renamed from: h, reason: collision with root package name */
    private int f967h;

    /* renamed from: i, reason: collision with root package name */
    private int f968i;

    /* renamed from: j, reason: collision with root package name */
    private int f969j;

    /* renamed from: k, reason: collision with root package name */
    private int f970k;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f971l;

    /* renamed from: m, reason: collision with root package name */
    private int f972m;

    /* renamed from: n, reason: collision with root package name */
    private e f973n;

    /* renamed from: o, reason: collision with root package name */
    protected d f974o;

    /* renamed from: p, reason: collision with root package name */
    private int f975p;

    /* renamed from: q, reason: collision with root package name */
    private HashMap<String, Integer> f976q;

    /* renamed from: r, reason: collision with root package name */
    private int f977r;

    /* renamed from: s, reason: collision with root package name */
    private int f978s;

    /* renamed from: t, reason: collision with root package name */
    int f979t;

    /* renamed from: u, reason: collision with root package name */
    int f980u;

    /* renamed from: v, reason: collision with root package name */
    int f981v;

    /* renamed from: w, reason: collision with root package name */
    int f982w;

    /* renamed from: x, reason: collision with root package name */
    private SparseArray<p.e> f983x;

    /* renamed from: y, reason: collision with root package name */
    c f984y;

    /* renamed from: z, reason: collision with root package name */
    private int f985z;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f986a;

        static {
            int[] iArr = new int[e.b.values().length];
            f986a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f986a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f986a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f986a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public float A;
        public String B;
        float C;
        int D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public float O;
        public float P;
        public int Q;
        public int R;
        public int S;
        public boolean T;
        public boolean U;
        public String V;
        boolean W;
        boolean X;
        boolean Y;
        boolean Z;

        /* renamed from: a, reason: collision with root package name */
        public int f987a;

        /* renamed from: a0, reason: collision with root package name */
        boolean f988a0;

        /* renamed from: b, reason: collision with root package name */
        public int f989b;

        /* renamed from: b0, reason: collision with root package name */
        boolean f990b0;

        /* renamed from: c, reason: collision with root package name */
        public float f991c;

        /* renamed from: c0, reason: collision with root package name */
        boolean f992c0;

        /* renamed from: d, reason: collision with root package name */
        public int f993d;

        /* renamed from: d0, reason: collision with root package name */
        int f994d0;

        /* renamed from: e, reason: collision with root package name */
        public int f995e;

        /* renamed from: e0, reason: collision with root package name */
        int f996e0;

        /* renamed from: f, reason: collision with root package name */
        public int f997f;

        /* renamed from: f0, reason: collision with root package name */
        int f998f0;

        /* renamed from: g, reason: collision with root package name */
        public int f999g;

        /* renamed from: g0, reason: collision with root package name */
        int f1000g0;

        /* renamed from: h, reason: collision with root package name */
        public int f1001h;

        /* renamed from: h0, reason: collision with root package name */
        int f1002h0;

        /* renamed from: i, reason: collision with root package name */
        public int f1003i;

        /* renamed from: i0, reason: collision with root package name */
        int f1004i0;

        /* renamed from: j, reason: collision with root package name */
        public int f1005j;

        /* renamed from: j0, reason: collision with root package name */
        float f1006j0;

        /* renamed from: k, reason: collision with root package name */
        public int f1007k;

        /* renamed from: k0, reason: collision with root package name */
        int f1008k0;

        /* renamed from: l, reason: collision with root package name */
        public int f1009l;

        /* renamed from: l0, reason: collision with root package name */
        int f1010l0;

        /* renamed from: m, reason: collision with root package name */
        public int f1011m;

        /* renamed from: m0, reason: collision with root package name */
        float f1012m0;

        /* renamed from: n, reason: collision with root package name */
        public int f1013n;

        /* renamed from: n0, reason: collision with root package name */
        p.e f1014n0;

        /* renamed from: o, reason: collision with root package name */
        public float f1015o;

        /* renamed from: o0, reason: collision with root package name */
        public boolean f1016o0;

        /* renamed from: p, reason: collision with root package name */
        public int f1017p;

        /* renamed from: q, reason: collision with root package name */
        public int f1018q;

        /* renamed from: r, reason: collision with root package name */
        public int f1019r;

        /* renamed from: s, reason: collision with root package name */
        public int f1020s;

        /* renamed from: t, reason: collision with root package name */
        public int f1021t;

        /* renamed from: u, reason: collision with root package name */
        public int f1022u;

        /* renamed from: v, reason: collision with root package name */
        public int f1023v;

        /* renamed from: w, reason: collision with root package name */
        public int f1024w;

        /* renamed from: x, reason: collision with root package name */
        public int f1025x;

        /* renamed from: y, reason: collision with root package name */
        public int f1026y;

        /* renamed from: z, reason: collision with root package name */
        public float f1027z;

        private static class a {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f1028a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1028a = sparseIntArray;
                sparseIntArray.append(k.N1, 8);
                sparseIntArray.append(k.O1, 9);
                sparseIntArray.append(k.Q1, 10);
                sparseIntArray.append(k.R1, 11);
                sparseIntArray.append(k.X1, 12);
                sparseIntArray.append(k.W1, 13);
                sparseIntArray.append(k.f1240v1, 14);
                sparseIntArray.append(k.f1237u1, 15);
                sparseIntArray.append(k.f1231s1, 16);
                sparseIntArray.append(k.f1243w1, 2);
                sparseIntArray.append(k.f1249y1, 3);
                sparseIntArray.append(k.f1246x1, 4);
                sparseIntArray.append(k.f2, 49);
                sparseIntArray.append(k.g2, 50);
                sparseIntArray.append(k.C1, 5);
                sparseIntArray.append(k.D1, 6);
                sparseIntArray.append(k.E1, 7);
                sparseIntArray.append(k.f1176b1, 1);
                sparseIntArray.append(k.S1, 17);
                sparseIntArray.append(k.T1, 18);
                sparseIntArray.append(k.B1, 19);
                sparseIntArray.append(k.A1, 20);
                sparseIntArray.append(k.j2, 21);
                sparseIntArray.append(k.m2, 22);
                sparseIntArray.append(k.k2, 23);
                sparseIntArray.append(k.h2, 24);
                sparseIntArray.append(k.l2, 25);
                sparseIntArray.append(k.i2, 26);
                sparseIntArray.append(k.J1, 29);
                sparseIntArray.append(k.Y1, 30);
                sparseIntArray.append(k.f1252z1, 44);
                sparseIntArray.append(k.L1, 45);
                sparseIntArray.append(k.f1173a2, 46);
                sparseIntArray.append(k.K1, 47);
                sparseIntArray.append(k.Z1, 48);
                sparseIntArray.append(k.f1225q1, 27);
                sparseIntArray.append(k.f1222p1, 28);
                sparseIntArray.append(k.f1177b2, 31);
                sparseIntArray.append(k.F1, 32);
                sparseIntArray.append(k.f1185d2, 33);
                sparseIntArray.append(k.f1181c2, 34);
                sparseIntArray.append(k.f1189e2, 35);
                sparseIntArray.append(k.H1, 36);
                sparseIntArray.append(k.G1, 37);
                sparseIntArray.append(k.I1, 38);
                sparseIntArray.append(k.M1, 39);
                sparseIntArray.append(k.V1, 40);
                sparseIntArray.append(k.P1, 41);
                sparseIntArray.append(k.f1234t1, 42);
                sparseIntArray.append(k.f1228r1, 43);
                sparseIntArray.append(k.U1, 51);
            }
        }

        public b(int i2, int i3) {
            super(i2, i3);
            this.f987a = -1;
            this.f989b = -1;
            this.f991c = -1.0f;
            this.f993d = -1;
            this.f995e = -1;
            this.f997f = -1;
            this.f999g = -1;
            this.f1001h = -1;
            this.f1003i = -1;
            this.f1005j = -1;
            this.f1007k = -1;
            this.f1009l = -1;
            this.f1011m = -1;
            this.f1013n = 0;
            this.f1015o = 0.0f;
            this.f1017p = -1;
            this.f1018q = -1;
            this.f1019r = -1;
            this.f1020s = -1;
            this.f1021t = -1;
            this.f1022u = -1;
            this.f1023v = -1;
            this.f1024w = -1;
            this.f1025x = -1;
            this.f1026y = -1;
            this.f1027z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.f988a0 = false;
            this.f990b0 = false;
            this.f992c0 = false;
            this.f994d0 = -1;
            this.f996e0 = -1;
            this.f998f0 = -1;
            this.f1000g0 = -1;
            this.f1002h0 = -1;
            this.f1004i0 = -1;
            this.f1006j0 = 0.5f;
            this.f1014n0 = new p.e();
            this.f1016o0 = false;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            int i2;
            float parseFloat;
            this.f987a = -1;
            this.f989b = -1;
            this.f991c = -1.0f;
            this.f993d = -1;
            this.f995e = -1;
            this.f997f = -1;
            this.f999g = -1;
            this.f1001h = -1;
            this.f1003i = -1;
            this.f1005j = -1;
            this.f1007k = -1;
            this.f1009l = -1;
            this.f1011m = -1;
            this.f1013n = 0;
            this.f1015o = 0.0f;
            this.f1017p = -1;
            this.f1018q = -1;
            this.f1019r = -1;
            this.f1020s = -1;
            this.f1021t = -1;
            this.f1022u = -1;
            this.f1023v = -1;
            this.f1024w = -1;
            this.f1025x = -1;
            this.f1026y = -1;
            this.f1027z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.f988a0 = false;
            this.f990b0 = false;
            this.f992c0 = false;
            this.f994d0 = -1;
            this.f996e0 = -1;
            this.f998f0 = -1;
            this.f1000g0 = -1;
            this.f1002h0 = -1;
            this.f1004i0 = -1;
            this.f1006j0 = 0.5f;
            this.f1014n0 = new p.e();
            this.f1016o0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f1172a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = a.f1028a.get(index);
                switch (i4) {
                    case 1:
                        this.S = obtainStyledAttributes.getInt(index, this.S);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1011m);
                        this.f1011m = resourceId;
                        if (resourceId == -1) {
                            this.f1011m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        this.f1013n = obtainStyledAttributes.getDimensionPixelSize(index, this.f1013n);
                        continue;
                    case 4:
                        float f2 = obtainStyledAttributes.getFloat(index, this.f1015o) % 360.0f;
                        this.f1015o = f2;
                        if (f2 < 0.0f) {
                            this.f1015o = (360.0f - f2) % 360.0f;
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f987a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f987a);
                        continue;
                    case 6:
                        this.f989b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f989b);
                        continue;
                    case 7:
                        this.f991c = obtainStyledAttributes.getFloat(index, this.f991c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f993d);
                        this.f993d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f993d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f995e);
                        this.f995e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f995e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f997f);
                        this.f997f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f997f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f999g);
                        this.f999g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f999g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1001h);
                        this.f1001h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1001h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1003i);
                        this.f1003i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1003i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1005j);
                        this.f1005j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1005j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1007k);
                        this.f1007k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1007k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1009l);
                        this.f1009l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1009l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1017p);
                        this.f1017p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1017p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1018q);
                        this.f1018q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1018q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1019r);
                        this.f1019r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1019r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1020s);
                        this.f1020s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1020s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 21:
                        this.f1021t = obtainStyledAttributes.getDimensionPixelSize(index, this.f1021t);
                        continue;
                    case 22:
                        this.f1022u = obtainStyledAttributes.getDimensionPixelSize(index, this.f1022u);
                        continue;
                    case 23:
                        this.f1023v = obtainStyledAttributes.getDimensionPixelSize(index, this.f1023v);
                        continue;
                    case 24:
                        this.f1024w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1024w);
                        continue;
                    case 25:
                        this.f1025x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1025x);
                        continue;
                    case 26:
                        this.f1026y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1026y);
                        continue;
                    case 27:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        continue;
                    case 28:
                        this.U = obtainStyledAttributes.getBoolean(index, this.U);
                        continue;
                    case 29:
                        this.f1027z = obtainStyledAttributes.getFloat(index, this.f1027z);
                        continue;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        continue;
                    case k.T /* 31 */:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.I = i5;
                        if (i5 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            break;
                        }
                    case k.U /* 32 */:
                        int i6 = obtainStyledAttributes.getInt(index, 0);
                        this.J = i6;
                        if (i6 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case k.B3 /* 35 */:
                        this.O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        continue;
                    case k.C3 /* 36 */:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case k.D3 /* 37 */:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case k.E3 /* 38 */:
                        this.P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.P));
                        this.J = 2;
                        continue;
                    default:
                        switch (i4) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = Float.NaN;
                                this.D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i2 = 0;
                                    } else {
                                        String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.D = 1;
                                        }
                                        i2 = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.B.substring(i2, indexOf2);
                                        String substring3 = this.B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat2 = Float.parseFloat(substring2);
                                                float parseFloat3 = Float.parseFloat(substring3);
                                                parseFloat = (parseFloat2 > 0.0f && parseFloat3 > 0.0f) ? this.D == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3) : parseFloat;
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.B.substring(i2);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            parseFloat = Float.parseFloat(substring4);
                                        }
                                    }
                                    this.C = parseFloat;
                                    break;
                                } else {
                                    break;
                                }
                            case 45:
                                this.E = obtainStyledAttributes.getFloat(index, this.E);
                                break;
                            case 46:
                                this.F = obtainStyledAttributes.getFloat(index, this.F);
                                break;
                            case 47:
                                this.G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.H = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                break;
                            case 50:
                                this.R = obtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                                break;
                            case 51:
                                this.V = obtainStyledAttributes.getString(index);
                                continue;
                        }
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f987a = -1;
            this.f989b = -1;
            this.f991c = -1.0f;
            this.f993d = -1;
            this.f995e = -1;
            this.f997f = -1;
            this.f999g = -1;
            this.f1001h = -1;
            this.f1003i = -1;
            this.f1005j = -1;
            this.f1007k = -1;
            this.f1009l = -1;
            this.f1011m = -1;
            this.f1013n = 0;
            this.f1015o = 0.0f;
            this.f1017p = -1;
            this.f1018q = -1;
            this.f1019r = -1;
            this.f1020s = -1;
            this.f1021t = -1;
            this.f1022u = -1;
            this.f1023v = -1;
            this.f1024w = -1;
            this.f1025x = -1;
            this.f1026y = -1;
            this.f1027z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.f988a0 = false;
            this.f990b0 = false;
            this.f992c0 = false;
            this.f994d0 = -1;
            this.f996e0 = -1;
            this.f998f0 = -1;
            this.f1000g0 = -1;
            this.f1002h0 = -1;
            this.f1004i0 = -1;
            this.f1006j0 = 0.5f;
            this.f1014n0 = new p.e();
            this.f1016o0 = false;
        }

        public void a() {
            this.Z = false;
            this.W = true;
            this.X = true;
            int i2 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i2 == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            int i3 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i3 == -2 && this.U) {
                this.X = false;
                if (this.J == 0) {
                    this.J = 1;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.W = false;
                if (i2 == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.T = true;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.X = false;
                if (i3 == 0 && this.J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.U = true;
                }
            }
            if (this.f991c == -1.0f && this.f987a == -1 && this.f989b == -1) {
                return;
            }
            this.Z = true;
            this.W = true;
            this.X = true;
            if (!(this.f1014n0 instanceof p.g)) {
                this.f1014n0 = new p.g();
            }
            ((p.g) this.f1014n0).j1(this.S);
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00ca, code lost:
        
            if (r1 > 0) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00cc, code lost:
        
            ((android.view.ViewGroup.MarginLayoutParams) r9).rightMargin = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x00d9, code lost:
        
            if (r1 > 0) goto L73;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void resolveLayoutDirection(int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i9 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i2);
            boolean z2 = false;
            boolean z3 = 1 == getLayoutDirection();
            this.f998f0 = -1;
            this.f1000g0 = -1;
            this.f994d0 = -1;
            this.f996e0 = -1;
            this.f1002h0 = this.f1021t;
            this.f1004i0 = this.f1023v;
            float f2 = this.f1027z;
            this.f1006j0 = f2;
            int i10 = this.f987a;
            this.f1008k0 = i10;
            int i11 = this.f989b;
            this.f1010l0 = i11;
            float f3 = this.f991c;
            this.f1012m0 = f3;
            if (z3) {
                int i12 = this.f1017p;
                if (i12 != -1) {
                    this.f998f0 = i12;
                } else {
                    int i13 = this.f1018q;
                    if (i13 != -1) {
                        this.f1000g0 = i13;
                    }
                    i4 = this.f1019r;
                    if (i4 != -1) {
                        this.f996e0 = i4;
                        z2 = true;
                    }
                    i5 = this.f1020s;
                    if (i5 != -1) {
                        this.f994d0 = i5;
                        z2 = true;
                    }
                    i6 = this.f1025x;
                    if (i6 != -1) {
                        this.f1004i0 = i6;
                    }
                    i7 = this.f1026y;
                    if (i7 != -1) {
                        this.f1002h0 = i7;
                    }
                    if (z2) {
                        this.f1006j0 = 1.0f - f2;
                    }
                    if (this.Z && this.S == 1) {
                        if (f3 == -1.0f) {
                            this.f1012m0 = 1.0f - f3;
                            this.f1008k0 = -1;
                            this.f1010l0 = -1;
                        } else {
                            if (i10 != -1) {
                                this.f1010l0 = i10;
                                this.f1008k0 = -1;
                            } else if (i11 != -1) {
                                this.f1008k0 = i11;
                                this.f1010l0 = -1;
                            }
                            this.f1012m0 = -1.0f;
                        }
                    }
                }
                z2 = true;
                i4 = this.f1019r;
                if (i4 != -1) {
                }
                i5 = this.f1020s;
                if (i5 != -1) {
                }
                i6 = this.f1025x;
                if (i6 != -1) {
                }
                i7 = this.f1026y;
                if (i7 != -1) {
                }
                if (z2) {
                }
                if (this.Z) {
                    if (f3 == -1.0f) {
                    }
                }
            } else {
                int i14 = this.f1017p;
                if (i14 != -1) {
                    this.f996e0 = i14;
                }
                int i15 = this.f1018q;
                if (i15 != -1) {
                    this.f994d0 = i15;
                }
                int i16 = this.f1019r;
                if (i16 != -1) {
                    this.f998f0 = i16;
                }
                int i17 = this.f1020s;
                if (i17 != -1) {
                    this.f1000g0 = i17;
                }
                int i18 = this.f1025x;
                if (i18 != -1) {
                    this.f1002h0 = i18;
                }
                int i19 = this.f1026y;
                if (i19 != -1) {
                    this.f1004i0 = i19;
                }
            }
            if (this.f1019r == -1 && this.f1020s == -1 && this.f1018q == -1 && this.f1017p == -1) {
                int i20 = this.f997f;
                if (i20 == -1) {
                    int i21 = this.f999g;
                    if (i21 != -1) {
                        this.f1000g0 = i21;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0) {
                        }
                    }
                    i3 = this.f993d;
                    if (i3 == -1) {
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i8;
                }
                this.f998f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0) {
                }
                i3 = this.f993d;
                if (i3 == -1) {
                    this.f994d0 = i3;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i8 <= 0) {
                        return;
                    }
                } else {
                    int i22 = this.f995e;
                    if (i22 == -1) {
                        return;
                    }
                    this.f996e0 = i22;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i8 <= 0) {
                        return;
                    }
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i8;
            }
        }
    }

    class c implements b.InterfaceC0062b {

        /* renamed from: a, reason: collision with root package name */
        ConstraintLayout f1029a;

        /* renamed from: b, reason: collision with root package name */
        int f1030b;

        /* renamed from: c, reason: collision with root package name */
        int f1031c;

        /* renamed from: d, reason: collision with root package name */
        int f1032d;

        /* renamed from: e, reason: collision with root package name */
        int f1033e;

        /* renamed from: f, reason: collision with root package name */
        int f1034f;

        /* renamed from: g, reason: collision with root package name */
        int f1035g;

        public c(ConstraintLayout constraintLayout) {
            this.f1029a = constraintLayout;
        }

        private boolean d(int i2, int i3, int i4) {
            if (i2 == i3) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
            }
            return false;
        }

        @Override // q.b.InterfaceC0062b
        public final void a() {
            int childCount = this.f1029a.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f1029a.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).a(this.f1029a);
                }
            }
            int size = this.f1029a.f965f.size();
            if (size > 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    ((androidx.constraintlayout.widget.c) this.f1029a.f965f.get(i3)).k(this.f1029a);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:152:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01da A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01db  */
        @Override // q.b.InterfaceC0062b
        @SuppressLint({"WrongCall"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void b(p.e eVar, b.a aVar) {
            int makeMeasureSpec;
            int i2;
            int makeMeasureSpec2;
            p.f fVar;
            int baseline;
            int max;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            if (eVar == null) {
                return;
            }
            if (eVar.Q() == 8 && !eVar.a0()) {
                aVar.f4117e = 0;
                aVar.f4118f = 0;
                aVar.f4119g = 0;
                return;
            }
            if (eVar.I() == null) {
                return;
            }
            e.b bVar = aVar.f4113a;
            e.b bVar2 = aVar.f4114b;
            int i10 = aVar.f4115c;
            int i11 = aVar.f4116d;
            int i12 = this.f1030b + this.f1031c;
            int i13 = this.f1032d;
            View view = (View) eVar.q();
            int[] iArr = a.f986a;
            int i14 = iArr[bVar.ordinal()];
            if (i14 != 1) {
                if (i14 == 2) {
                    i8 = this.f1034f;
                    i9 = -2;
                } else if (i14 != 3) {
                    if (i14 != 4) {
                        makeMeasureSpec = 0;
                    } else {
                        makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1034f, i13, -2);
                        boolean z2 = eVar.f4070p == 1;
                        int i15 = aVar.f4122j;
                        if (i15 == b.a.f4111l || i15 == b.a.f4112m) {
                            if (aVar.f4122j == b.a.f4112m || !z2 || (z2 && (view.getMeasuredHeight() == eVar.v())) || (view instanceof i) || eVar.e0()) {
                                i10 = eVar.R();
                            }
                        }
                    }
                    i2 = iArr[bVar2.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            i6 = this.f1035g;
                            i7 = -2;
                        } else {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    makeMeasureSpec2 = 0;
                                } else {
                                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1035g, i12, -2);
                                    boolean z3 = eVar.f4072q == 1;
                                    int i16 = aVar.f4122j;
                                    if (i16 == b.a.f4111l || i16 == b.a.f4112m) {
                                        if (aVar.f4122j == b.a.f4112m || !z3 || (z3 && (view.getMeasuredWidth() == eVar.R())) || (view instanceof i) || eVar.f0()) {
                                            i11 = eVar.v();
                                        }
                                    }
                                }
                                fVar = (p.f) eVar.I();
                                if (fVar != null && p.j.b(ConstraintLayout.this.f972m, 256) && view.getMeasuredWidth() == eVar.R() && view.getMeasuredWidth() < fVar.R() && view.getMeasuredHeight() == eVar.v() && view.getMeasuredHeight() < fVar.v() && view.getBaseline() == eVar.n() && !eVar.d0()) {
                                    if (!d(eVar.A(), makeMeasureSpec, eVar.R()) && d(eVar.B(), makeMeasureSpec2, eVar.v())) {
                                        aVar.f4117e = eVar.R();
                                        aVar.f4118f = eVar.v();
                                        aVar.f4119g = eVar.n();
                                        return;
                                    }
                                }
                                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                                boolean z4 = bVar == bVar3;
                                boolean z5 = bVar2 == bVar3;
                                e.b bVar4 = e.b.MATCH_PARENT;
                                boolean z6 = bVar2 != bVar4 || bVar2 == e.b.FIXED;
                                boolean z7 = bVar != bVar4 || bVar == e.b.FIXED;
                                boolean z8 = !z4 && eVar.W > 0.0f;
                                boolean z9 = !z5 && eVar.W > 0.0f;
                                if (view == null) {
                                    return;
                                }
                                b bVar5 = (b) view.getLayoutParams();
                                int i17 = aVar.f4122j;
                                if (i17 != b.a.f4111l && i17 != b.a.f4112m && z4 && eVar.f4070p == 0 && z5 && eVar.f4072q == 0) {
                                    i5 = -1;
                                    i4 = 0;
                                    baseline = 0;
                                    max = 0;
                                } else {
                                    if ((view instanceof l) && (eVar instanceof p.k)) {
                                        ((l) view).o((p.k) eVar, makeMeasureSpec, makeMeasureSpec2);
                                    } else {
                                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                                    }
                                    eVar.F0(makeMeasureSpec, makeMeasureSpec2);
                                    int measuredWidth = view.getMeasuredWidth();
                                    int measuredHeight = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                    int i18 = eVar.f4076s;
                                    max = i18 > 0 ? Math.max(i18, measuredWidth) : measuredWidth;
                                    int i19 = eVar.f4078t;
                                    if (i19 > 0) {
                                        max = Math.min(i19, max);
                                    }
                                    int i20 = eVar.f4082v;
                                    if (i20 > 0) {
                                        i4 = Math.max(i20, measuredHeight);
                                        i3 = makeMeasureSpec;
                                    } else {
                                        i3 = makeMeasureSpec;
                                        i4 = measuredHeight;
                                    }
                                    int i21 = eVar.f4084w;
                                    if (i21 > 0) {
                                        i4 = Math.min(i21, i4);
                                    }
                                    if (!p.j.b(ConstraintLayout.this.f972m, 1)) {
                                        if (z8 && z6) {
                                            max = (int) ((i4 * eVar.W) + 0.5f);
                                        } else if (z9 && z7) {
                                            i4 = (int) ((max / eVar.W) + 0.5f);
                                        }
                                    }
                                    if (measuredWidth != max || measuredHeight != i4) {
                                        int makeMeasureSpec3 = measuredWidth != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i3;
                                        if (measuredHeight != i4) {
                                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                                        }
                                        view.measure(makeMeasureSpec3, makeMeasureSpec2);
                                        eVar.F0(makeMeasureSpec3, makeMeasureSpec2);
                                        max = view.getMeasuredWidth();
                                        i4 = view.getMeasuredHeight();
                                        baseline = view.getBaseline();
                                    }
                                    i5 = -1;
                                }
                                boolean z10 = baseline != i5;
                                aVar.f4121i = (max == aVar.f4115c && i4 == aVar.f4116d) ? false : true;
                                if (bVar5.Y) {
                                    z10 = true;
                                }
                                if (z10 && baseline != -1 && eVar.n() != baseline) {
                                    aVar.f4121i = true;
                                }
                                aVar.f4117e = max;
                                aVar.f4118f = i4;
                                aVar.f4120h = z10;
                                aVar.f4119g = baseline;
                                return;
                            }
                            i6 = this.f1035g;
                            i12 += eVar.P();
                            i7 = -1;
                        }
                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, i12, i7);
                        fVar = (p.f) eVar.I();
                        if (fVar != null) {
                            if (!d(eVar.A(), makeMeasureSpec, eVar.R()) && d(eVar.B(), makeMeasureSpec2, eVar.v())) {
                            }
                        }
                        e.b bVar32 = e.b.MATCH_CONSTRAINT;
                        if (bVar == bVar32) {
                        }
                        if (bVar2 == bVar32) {
                        }
                        e.b bVar42 = e.b.MATCH_PARENT;
                        if (bVar2 != bVar42) {
                        }
                        if (bVar != bVar42) {
                        }
                        if (z4) {
                        }
                        if (z5) {
                        }
                        if (view == null) {
                        }
                    }
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                    fVar = (p.f) eVar.I();
                    if (fVar != null) {
                    }
                    e.b bVar322 = e.b.MATCH_CONSTRAINT;
                    if (bVar == bVar322) {
                    }
                    if (bVar2 == bVar322) {
                    }
                    e.b bVar422 = e.b.MATCH_PARENT;
                    if (bVar2 != bVar422) {
                    }
                    if (bVar != bVar422) {
                    }
                    if (z4) {
                    }
                    if (z5) {
                    }
                    if (view == null) {
                    }
                } else {
                    i8 = this.f1034f;
                    i13 += eVar.z();
                    i9 = -1;
                }
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(i8, i13, i9);
                i2 = iArr[bVar2.ordinal()];
                if (i2 != 1) {
                }
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                fVar = (p.f) eVar.I();
                if (fVar != null) {
                }
                e.b bVar3222 = e.b.MATCH_CONSTRAINT;
                if (bVar == bVar3222) {
                }
                if (bVar2 == bVar3222) {
                }
                e.b bVar4222 = e.b.MATCH_PARENT;
                if (bVar2 != bVar4222) {
                }
                if (bVar != bVar4222) {
                }
                if (z4) {
                }
                if (z5) {
                }
                if (view == null) {
                }
            }
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            i2 = iArr[bVar2.ordinal()];
            if (i2 != 1) {
            }
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            fVar = (p.f) eVar.I();
            if (fVar != null) {
            }
            e.b bVar32222 = e.b.MATCH_CONSTRAINT;
            if (bVar == bVar32222) {
            }
            if (bVar2 == bVar32222) {
            }
            e.b bVar42222 = e.b.MATCH_PARENT;
            if (bVar2 != bVar42222) {
            }
            if (bVar != bVar42222) {
            }
            if (z4) {
            }
            if (z5) {
            }
            if (view == null) {
            }
        }

        public void c(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f1030b = i4;
            this.f1031c = i5;
            this.f1032d = i6;
            this.f1033e = i7;
            this.f1034f = i2;
            this.f1035g = i3;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f964e = new SparseArray<>();
        this.f965f = new ArrayList<>(4);
        this.f966g = new p.f();
        this.f967h = 0;
        this.f968i = 0;
        this.f969j = Integer.MAX_VALUE;
        this.f970k = Integer.MAX_VALUE;
        this.f971l = true;
        this.f972m = 257;
        this.f973n = null;
        this.f974o = null;
        this.f975p = -1;
        this.f976q = new HashMap<>();
        this.f977r = -1;
        this.f978s = -1;
        this.f979t = -1;
        this.f980u = -1;
        this.f981v = 0;
        this.f982w = 0;
        this.f983x = new SparseArray<>();
        this.f984y = new c(this);
        this.f985z = 0;
        this.A = 0;
        j(attributeSet, 0, 0);
    }

    private final p.e g(int i2) {
        if (i2 == 0) {
            return this.f966g;
        }
        View view = this.f964e.get(i2);
        if (view == null && (view = findViewById(i2)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f966g;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f1014n0;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    private void j(AttributeSet attributeSet, int i2, int i3) {
        this.f966g.l0(this);
        this.f966g.D1(this.f984y);
        this.f964e.put(getId(), this);
        this.f973n = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f1172a1, i2, i3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == k.f1192f1) {
                    this.f967h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f967h);
                } else if (index == k.f1195g1) {
                    this.f968i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f968i);
                } else if (index == k.f1184d1) {
                    this.f969j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f969j);
                } else if (index == k.f1188e1) {
                    this.f970k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f970k);
                } else if (index == k.n2) {
                    this.f972m = obtainStyledAttributes.getInt(index, this.f972m);
                } else if (index == k.f1219o1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f974o = null;
                        }
                    }
                } else if (index == k.f1210l1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e eVar = new e();
                        this.f973n = eVar;
                        eVar.i(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f973n = null;
                    }
                    this.f975p = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f966g.E1(this.f972m);
    }

    private void l() {
        this.f971l = true;
        this.f977r = -1;
        this.f978s = -1;
        this.f979t = -1;
        this.f980u = -1;
        this.f981v = 0;
        this.f982w = 0;
    }

    private void p() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            p.e i3 = i(getChildAt(i2));
            if (i3 != null) {
                i3.h0();
            }
        }
        if (isInEditMode) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    g(childAt.getId()).m0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f975p != -1) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt2 = getChildAt(i5);
                if (childAt2.getId() == this.f975p && (childAt2 instanceof f)) {
                    this.f973n = ((f) childAt2).getConstraintSet();
                }
            }
        }
        e eVar = this.f973n;
        if (eVar != null) {
            eVar.c(this, true);
        }
        this.f966g.d1();
        int size = this.f965f.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f965f.get(i6).m(this);
            }
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt3 = getChildAt(i7);
            if (childAt3 instanceof i) {
                ((i) childAt3).b(this);
            }
        }
        this.f983x.clear();
        this.f983x.put(0, this.f966g);
        this.f983x.put(getId(), this.f966g);
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt4 = getChildAt(i8);
            this.f983x.put(childAt4.getId(), i(childAt4));
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt5 = getChildAt(i9);
            p.e i10 = i(childAt5);
            if (i10 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f966g.c(i10);
                c(isInEditMode, childAt5, i10, bVar, this.f983x);
            }
        }
    }

    private boolean s() {
        int childCount = getChildCount();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            if (getChildAt(i2).isLayoutRequested()) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (z2) {
            p();
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void c(boolean z2, View view, p.e eVar, b bVar, SparseArray<p.e> sparseArray) {
        float f2;
        p.e eVar2;
        d.b bVar2;
        d.b bVar3;
        int i2;
        p.e eVar3;
        p.e eVar4;
        d.b bVar4;
        int i3;
        p.e eVar5;
        d.b bVar5;
        int i4;
        p.e eVar6;
        d.b bVar6;
        d.b bVar7;
        int i5;
        int i6;
        p.e eVar7;
        int i7;
        p.e eVar8;
        d.b bVar8;
        int i8;
        int i9;
        p.e eVar9;
        d.b bVar9;
        int i10;
        float f3;
        float f4;
        int i11;
        bVar.a();
        bVar.f1016o0 = false;
        eVar.T0(view.getVisibility());
        if (bVar.f990b0) {
            eVar.D0(true);
            eVar.T0(8);
        }
        eVar.l0(view);
        if (view instanceof androidx.constraintlayout.widget.c) {
            ((androidx.constraintlayout.widget.c) view).i(eVar, this.f966g.x1());
        }
        if (bVar.Z) {
            p.g gVar = (p.g) eVar;
            int i12 = bVar.f1008k0;
            int i13 = bVar.f1010l0;
            float f5 = bVar.f1012m0;
            if (f5 != -1.0f) {
                gVar.i1(f5);
                return;
            } else if (i12 != -1) {
                gVar.g1(i12);
                return;
            } else {
                if (i13 != -1) {
                    gVar.h1(i13);
                    return;
                }
                return;
            }
        }
        int i14 = bVar.f994d0;
        int i15 = bVar.f996e0;
        int i16 = bVar.f998f0;
        int i17 = bVar.f1000g0;
        int i18 = bVar.f1002h0;
        int i19 = bVar.f1004i0;
        float f6 = bVar.f1006j0;
        int i20 = bVar.f1011m;
        if (i20 != -1) {
            p.e eVar10 = sparseArray.get(i20);
            if (eVar10 != null) {
                eVar.j(eVar10, bVar.f1015o, bVar.f1013n);
            }
        } else if (i14 != -1) {
            eVar2 = sparseArray.get(i14);
            if (eVar2 != null) {
                bVar3 = d.b.LEFT;
                eVar3 = eVar;
                bVar2 = bVar3;
                f2 = f6;
                i2 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                eVar3.X(bVar2, eVar2, bVar3, i2, i18);
                if (i16 != -1) {
                    eVar4 = sparseArray.get(i16);
                    if (eVar4 != null) {
                        bVar5 = d.b.RIGHT;
                        bVar4 = d.b.LEFT;
                        i3 = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
                        eVar5 = eVar;
                        eVar5.X(bVar5, eVar4, bVar4, i3, i19);
                    }
                    i4 = bVar.f1001h;
                    if (i4 == -1) {
                        eVar6 = sparseArray.get(i4);
                        if (eVar6 != null) {
                            bVar7 = d.b.TOP;
                            i5 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                            i6 = bVar.f1022u;
                            eVar7 = eVar;
                            bVar6 = bVar7;
                            eVar7.X(bVar6, eVar6, bVar7, i5, i6);
                        }
                        i7 = bVar.f1005j;
                        if (i7 == -1) {
                            eVar8 = sparseArray.get(i7);
                            if (eVar8 != null) {
                                bVar9 = d.b.BOTTOM;
                                bVar8 = d.b.TOP;
                                i8 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
                                i9 = bVar.f1024w;
                                eVar9 = eVar;
                                eVar9.X(bVar9, eVar8, bVar8, i8, i9);
                            }
                            i10 = bVar.f1009l;
                            if (i10 != -1) {
                                View view2 = this.f964e.get(i10);
                                p.e eVar11 = sparseArray.get(bVar.f1009l);
                                if (eVar11 != null && view2 != null && (view2.getLayoutParams() instanceof b)) {
                                    b bVar10 = (b) view2.getLayoutParams();
                                    bVar.Y = true;
                                    bVar10.Y = true;
                                    d.b bVar11 = d.b.BASELINE;
                                    eVar.m(bVar11).a(eVar11.m(bVar11), 0, -1, true);
                                    eVar.u0(true);
                                    bVar10.f1014n0.u0(true);
                                    eVar.m(d.b.TOP).p();
                                    eVar.m(d.b.BOTTOM).p();
                                }
                            }
                            f3 = f2;
                            if (f3 >= 0.0f) {
                                eVar.w0(f3);
                            }
                            f4 = bVar.A;
                            if (f4 >= 0.0f) {
                                eVar.N0(f4);
                            }
                        } else {
                            int i21 = bVar.f1007k;
                            if (i21 != -1 && (eVar8 = sparseArray.get(i21)) != null) {
                                bVar8 = d.b.BOTTOM;
                                i8 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
                                i9 = bVar.f1024w;
                                eVar9 = eVar;
                                bVar9 = bVar8;
                                eVar9.X(bVar9, eVar8, bVar8, i8, i9);
                            }
                            i10 = bVar.f1009l;
                            if (i10 != -1) {
                            }
                            f3 = f2;
                            if (f3 >= 0.0f) {
                            }
                            f4 = bVar.A;
                            if (f4 >= 0.0f) {
                            }
                        }
                    } else {
                        int i22 = bVar.f1003i;
                        if (i22 != -1 && (eVar6 = sparseArray.get(i22)) != null) {
                            bVar6 = d.b.TOP;
                            bVar7 = d.b.BOTTOM;
                            i5 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                            i6 = bVar.f1022u;
                            eVar7 = eVar;
                            eVar7.X(bVar6, eVar6, bVar7, i5, i6);
                        }
                        i7 = bVar.f1005j;
                        if (i7 == -1) {
                        }
                    }
                } else {
                    if (i17 != -1 && (eVar4 = sparseArray.get(i17)) != null) {
                        bVar4 = d.b.RIGHT;
                        i3 = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
                        eVar5 = eVar;
                        bVar5 = bVar4;
                        eVar5.X(bVar5, eVar4, bVar4, i3, i19);
                    }
                    i4 = bVar.f1001h;
                    if (i4 == -1) {
                    }
                }
            } else {
                f2 = f6;
                if (i16 != -1) {
                }
            }
        } else {
            f2 = f6;
            if (i15 != -1 && (eVar2 = sparseArray.get(i15)) != null) {
                bVar2 = d.b.LEFT;
                bVar3 = d.b.RIGHT;
                i2 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                eVar3 = eVar;
                eVar3.X(bVar2, eVar2, bVar3, i2, i18);
            }
            if (i16 != -1) {
            }
        }
        if (z2 && ((i11 = bVar.Q) != -1 || bVar.R != -1)) {
            eVar.L0(i11, bVar.R);
        }
        if (bVar.W) {
            eVar.z0(e.b.FIXED);
            eVar.U0(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                eVar.z0(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
            eVar.z0(bVar.T ? e.b.MATCH_CONSTRAINT : e.b.MATCH_PARENT);
            eVar.m(d.b.LEFT).f4026g = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            eVar.m(d.b.RIGHT).f4026g = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        } else {
            eVar.z0(e.b.MATCH_CONSTRAINT);
            eVar.U0(0);
        }
        if (bVar.X) {
            eVar.Q0(e.b.FIXED);
            eVar.v0(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                eVar.Q0(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
            eVar.Q0(bVar.U ? e.b.MATCH_CONSTRAINT : e.b.MATCH_PARENT);
            eVar.m(d.b.TOP).f4026g = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            eVar.m(d.b.BOTTOM).f4026g = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        } else {
            eVar.Q0(e.b.MATCH_CONSTRAINT);
            eVar.v0(0);
        }
        eVar.n0(bVar.B);
        eVar.B0(bVar.E);
        eVar.S0(bVar.F);
        eVar.x0(bVar.G);
        eVar.O0(bVar.H);
        eVar.A0(bVar.I, bVar.K, bVar.M, bVar.O);
        eVar.R0(bVar.J, bVar.L, bVar.N, bVar.P);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.c> arrayList = this.f965f;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.f965f.get(i2).l(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i4 = (int) ((parseInt / 1080.0f) * width);
                        int i5 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i4;
                        float f3 = i5;
                        float f4 = i4 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float parseInt4 = i5 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f4, f3, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i2, Object obj) {
        if (i2 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f976q;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f976q.get(str);
    }

    @Override // android.view.View
    public void forceLayout() {
        l();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getMaxHeight() {
        return this.f970k;
    }

    public int getMaxWidth() {
        return this.f969j;
    }

    public int getMinHeight() {
        return this.f968i;
    }

    public int getMinWidth() {
        return this.f967h;
    }

    public int getOptimizationLevel() {
        return this.f966g.s1();
    }

    public View h(int i2) {
        return this.f964e.get(i2);
    }

    public final p.e i(View view) {
        if (view == this) {
            return this.f966g;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f1014n0;
    }

    protected boolean k() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    protected void m(int i2) {
        this.f974o = new d(getContext(), this, i2);
    }

    protected void n(int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
        c cVar = this.f984y;
        int i6 = cVar.f1033e;
        int resolveSizeAndState = View.resolveSizeAndState(i4 + cVar.f1032d, i2, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i5 + i6, i3, 0) & 16777215;
        int min = Math.min(this.f969j, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f970k, resolveSizeAndState2);
        if (z2) {
            min |= 16777216;
        }
        if (z3) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f977r = min;
        this.f978s = min2;
    }

    protected void o(p.f fVar, int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f984y.c(i3, i4, max, max2, paddingWidth, i5);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? k() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        r(fVar, mode, i6, mode2, i7);
        fVar.z1(i2, mode, i6, mode2, i7, this.f977r, this.f978s, max5, max);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            b bVar = (b) childAt.getLayoutParams();
            p.e eVar = bVar.f1014n0;
            if ((childAt.getVisibility() != 8 || bVar.Z || bVar.f988a0 || bVar.f992c0 || isInEditMode) && !bVar.f990b0) {
                int S = eVar.S();
                int T = eVar.T();
                int R = eVar.R() + S;
                int v2 = eVar.v() + T;
                childAt.layout(S, T, R, v2);
                if ((childAt instanceof i) && (content = ((i) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(S, T, R, v2);
                }
            }
        }
        int size = this.f965f.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.f965f.get(i7).j(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (!this.f971l) {
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                if (getChildAt(i4).isLayoutRequested()) {
                    this.f971l = true;
                    break;
                }
                i4++;
            }
        }
        if (!this.f971l) {
            int i5 = this.f985z;
            if (i5 != i2 || this.A != i3) {
                if (i5 == i2 && View.MeasureSpec.getMode(i2) == 1073741824 && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.A) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i3) >= this.f966g.v()) {
                    this.f985z = i2;
                    this.A = i3;
                }
            }
            n(i2, i3, this.f966g.R(), this.f966g.v(), this.f966g.y1(), this.f966g.w1());
        }
        this.f985z = i2;
        this.A = i3;
        this.f966g.F1(k());
        if (this.f971l) {
            this.f971l = false;
            if (s()) {
                this.f966g.H1();
            }
        }
        o(this.f966g, this.f972m, i2, i3);
        n(i2, i3, this.f966g.R(), this.f966g.v(), this.f966g.y1(), this.f966g.w1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        p.e i2 = i(view);
        if ((view instanceof h) && !(i2 instanceof p.g)) {
            b bVar = (b) view.getLayoutParams();
            p.g gVar = new p.g();
            bVar.f1014n0 = gVar;
            bVar.Z = true;
            gVar.j1(bVar.S);
        }
        if (view instanceof androidx.constraintlayout.widget.c) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) view;
            cVar.n();
            ((b) view.getLayoutParams()).f988a0 = true;
            if (!this.f965f.contains(cVar)) {
                this.f965f.add(cVar);
            }
        }
        this.f964e.put(view.getId(), view);
        this.f971l = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f964e.remove(view.getId());
        this.f966g.c1(i(view));
        this.f965f.remove(view);
        this.f971l = true;
    }

    public void q(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f976q == null) {
                this.f976q = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f976q.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r3 == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        r12 = java.lang.Math.max(0, r7.f968i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        if (r3 == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0025, code lost:
    
        if (r3 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002c, code lost:
    
        r10 = java.lang.Math.max(0, r7.f967h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002a, code lost:
    
        if (r3 == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void r(p.f fVar, int i2, int i3, int i4, int i5) {
        e.b bVar;
        c cVar = this.f984y;
        int i6 = cVar.f1033e;
        int i7 = cVar.f1032d;
        e.b bVar2 = e.b.FIXED;
        int childCount = getChildCount();
        if (i2 != Integer.MIN_VALUE) {
            if (i2 == 0) {
                bVar = e.b.WRAP_CONTENT;
            } else if (i2 != 1073741824) {
                bVar = bVar2;
            } else {
                i3 = Math.min(this.f969j - i7, i3);
                bVar = bVar2;
            }
            i3 = 0;
        } else {
            bVar = e.b.WRAP_CONTENT;
        }
        if (i4 != Integer.MIN_VALUE) {
            if (i4 == 0) {
                bVar2 = e.b.WRAP_CONTENT;
            } else if (i4 == 1073741824) {
                i5 = Math.min(this.f970k - i6, i5);
            }
            i5 = 0;
        } else {
            bVar2 = e.b.WRAP_CONTENT;
        }
        if (i3 != fVar.R() || i5 != fVar.v()) {
            fVar.v1();
        }
        fVar.V0(0);
        fVar.W0(0);
        fVar.H0(this.f969j - i7);
        fVar.G0(this.f970k - i6);
        fVar.K0(0);
        fVar.J0(0);
        fVar.z0(bVar);
        fVar.U0(i3);
        fVar.Q0(bVar2);
        fVar.v0(i5);
        fVar.K0(this.f967h - i7);
        fVar.J0(this.f968i - i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        l();
        super.requestLayout();
    }

    public void setConstraintSet(e eVar) {
        this.f973n = eVar;
    }

    @Override // android.view.View
    public void setId(int i2) {
        this.f964e.remove(getId());
        super.setId(i2);
        this.f964e.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.f970k) {
            return;
        }
        this.f970k = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.f969j) {
            return;
        }
        this.f969j = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.f968i) {
            return;
        }
        this.f968i = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.f967h) {
            return;
        }
        this.f967h = i2;
        requestLayout();
    }

    public void setOnConstraintsChanged(g gVar) {
        d dVar = this.f974o;
        if (dVar != null) {
            dVar.c(gVar);
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f972m = i2;
        this.f966g.E1(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
