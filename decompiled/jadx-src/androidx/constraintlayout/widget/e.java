package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.f;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f1080d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    private static SparseIntArray f1081e;

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.widget.b> f1082a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private boolean f1083b = true;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<Integer, a> f1084c = new HashMap<>();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f1085a;

        /* renamed from: b, reason: collision with root package name */
        public final d f1086b = new d();

        /* renamed from: c, reason: collision with root package name */
        public final c f1087c = new c();

        /* renamed from: d, reason: collision with root package name */
        public final b f1088d = new b();

        /* renamed from: e, reason: collision with root package name */
        public final C0016e f1089e = new C0016e();

        /* renamed from: f, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.b> f1090f = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        public void f(int i2, ConstraintLayout.b bVar) {
            this.f1085a = i2;
            b bVar2 = this.f1088d;
            bVar2.f1106h = bVar.f993d;
            bVar2.f1108i = bVar.f995e;
            bVar2.f1110j = bVar.f997f;
            bVar2.f1112k = bVar.f999g;
            bVar2.f1113l = bVar.f1001h;
            bVar2.f1114m = bVar.f1003i;
            bVar2.f1115n = bVar.f1005j;
            bVar2.f1116o = bVar.f1007k;
            bVar2.f1117p = bVar.f1009l;
            bVar2.f1118q = bVar.f1017p;
            bVar2.f1119r = bVar.f1018q;
            bVar2.f1120s = bVar.f1019r;
            bVar2.f1121t = bVar.f1020s;
            bVar2.f1122u = bVar.f1027z;
            bVar2.f1123v = bVar.A;
            bVar2.f1124w = bVar.B;
            bVar2.f1125x = bVar.f1011m;
            bVar2.f1126y = bVar.f1013n;
            bVar2.f1127z = bVar.f1015o;
            bVar2.A = bVar.Q;
            bVar2.B = bVar.R;
            bVar2.C = bVar.S;
            bVar2.f1104g = bVar.f991c;
            bVar2.f1100e = bVar.f987a;
            bVar2.f1102f = bVar.f989b;
            bVar2.f1096c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f1098d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.D = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.E = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.F = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.G = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.P = bVar.F;
            bVar2.Q = bVar.E;
            bVar2.S = bVar.H;
            bVar2.R = bVar.G;
            bVar2.f1107h0 = bVar.T;
            bVar2.f1109i0 = bVar.U;
            bVar2.T = bVar.I;
            bVar2.U = bVar.J;
            bVar2.V = bVar.M;
            bVar2.W = bVar.N;
            bVar2.X = bVar.K;
            bVar2.Y = bVar.L;
            bVar2.Z = bVar.O;
            bVar2.f1093a0 = bVar.P;
            bVar2.f1105g0 = bVar.V;
            bVar2.K = bVar.f1022u;
            bVar2.M = bVar.f1024w;
            bVar2.J = bVar.f1021t;
            bVar2.L = bVar.f1023v;
            bVar2.O = bVar.f1025x;
            bVar2.N = bVar.f1026y;
            bVar2.H = bVar.getMarginEnd();
            this.f1088d.I = bVar.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i2, f.a aVar) {
            f(i2, aVar);
            this.f1086b.f1139d = aVar.f1156p0;
            C0016e c0016e = this.f1089e;
            c0016e.f1143b = aVar.f1159s0;
            c0016e.f1144c = aVar.f1160t0;
            c0016e.f1145d = aVar.f1161u0;
            c0016e.f1146e = aVar.f1162v0;
            c0016e.f1147f = aVar.f1163w0;
            c0016e.f1148g = aVar.f1164x0;
            c0016e.f1149h = aVar.f1165y0;
            c0016e.f1150i = aVar.f1166z0;
            c0016e.f1151j = aVar.A0;
            c0016e.f1152k = aVar.B0;
            c0016e.f1154m = aVar.f1158r0;
            c0016e.f1153l = aVar.f1157q0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(androidx.constraintlayout.widget.c cVar, int i2, f.a aVar) {
            g(i2, aVar);
            if (cVar instanceof androidx.constraintlayout.widget.a) {
                b bVar = this.f1088d;
                bVar.f1099d0 = 1;
                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) cVar;
                bVar.f1095b0 = aVar2.getType();
                this.f1088d.f1101e0 = aVar2.getReferencedIds();
                this.f1088d.f1097c0 = aVar2.getMargin();
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f1088d;
            bVar.f993d = bVar2.f1106h;
            bVar.f995e = bVar2.f1108i;
            bVar.f997f = bVar2.f1110j;
            bVar.f999g = bVar2.f1112k;
            bVar.f1001h = bVar2.f1113l;
            bVar.f1003i = bVar2.f1114m;
            bVar.f1005j = bVar2.f1115n;
            bVar.f1007k = bVar2.f1116o;
            bVar.f1009l = bVar2.f1117p;
            bVar.f1017p = bVar2.f1118q;
            bVar.f1018q = bVar2.f1119r;
            bVar.f1019r = bVar2.f1120s;
            bVar.f1020s = bVar2.f1121t;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.D;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.E;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.F;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.G;
            bVar.f1025x = bVar2.O;
            bVar.f1026y = bVar2.N;
            bVar.f1022u = bVar2.K;
            bVar.f1024w = bVar2.M;
            bVar.f1027z = bVar2.f1122u;
            bVar.A = bVar2.f1123v;
            bVar.f1011m = bVar2.f1125x;
            bVar.f1013n = bVar2.f1126y;
            bVar.f1015o = bVar2.f1127z;
            bVar.B = bVar2.f1124w;
            bVar.Q = bVar2.A;
            bVar.R = bVar2.B;
            bVar.F = bVar2.P;
            bVar.E = bVar2.Q;
            bVar.H = bVar2.S;
            bVar.G = bVar2.R;
            bVar.T = bVar2.f1107h0;
            bVar.U = bVar2.f1109i0;
            bVar.I = bVar2.T;
            bVar.J = bVar2.U;
            bVar.M = bVar2.V;
            bVar.N = bVar2.W;
            bVar.K = bVar2.X;
            bVar.L = bVar2.Y;
            bVar.O = bVar2.Z;
            bVar.P = bVar2.f1093a0;
            bVar.S = bVar2.C;
            bVar.f991c = bVar2.f1104g;
            bVar.f987a = bVar2.f1100e;
            bVar.f989b = bVar2.f1102f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f1096c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f1098d;
            String str = bVar2.f1105g0;
            if (str != null) {
                bVar.V = str;
            }
            bVar.setMarginStart(bVar2.I);
            bVar.setMarginEnd(this.f1088d.H);
            bVar.a();
        }

        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f1088d.a(this.f1088d);
            aVar.f1087c.a(this.f1087c);
            aVar.f1086b.a(this.f1086b);
            aVar.f1089e.a(this.f1089e);
            aVar.f1085a = this.f1085a;
            return aVar;
        }
    }

    public static class b {

        /* renamed from: k0, reason: collision with root package name */
        private static SparseIntArray f1091k0;

        /* renamed from: c, reason: collision with root package name */
        public int f1096c;

        /* renamed from: d, reason: collision with root package name */
        public int f1098d;

        /* renamed from: e0, reason: collision with root package name */
        public int[] f1101e0;

        /* renamed from: f0, reason: collision with root package name */
        public String f1103f0;

        /* renamed from: g0, reason: collision with root package name */
        public String f1105g0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f1092a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1094b = false;

        /* renamed from: e, reason: collision with root package name */
        public int f1100e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f1102f = -1;

        /* renamed from: g, reason: collision with root package name */
        public float f1104g = -1.0f;

        /* renamed from: h, reason: collision with root package name */
        public int f1106h = -1;

        /* renamed from: i, reason: collision with root package name */
        public int f1108i = -1;

        /* renamed from: j, reason: collision with root package name */
        public int f1110j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f1112k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f1113l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f1114m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f1115n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f1116o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f1117p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f1118q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f1119r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f1120s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f1121t = -1;

        /* renamed from: u, reason: collision with root package name */
        public float f1122u = 0.5f;

        /* renamed from: v, reason: collision with root package name */
        public float f1123v = 0.5f;

        /* renamed from: w, reason: collision with root package name */
        public String f1124w = null;

        /* renamed from: x, reason: collision with root package name */
        public int f1125x = -1;

        /* renamed from: y, reason: collision with root package name */
        public int f1126y = 0;

        /* renamed from: z, reason: collision with root package name */
        public float f1127z = 0.0f;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public float P = -1.0f;
        public float Q = -1.0f;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = -1;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public float Z = 1.0f;

        /* renamed from: a0, reason: collision with root package name */
        public float f1093a0 = 1.0f;

        /* renamed from: b0, reason: collision with root package name */
        public int f1095b0 = -1;

        /* renamed from: c0, reason: collision with root package name */
        public int f1097c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public int f1099d0 = -1;

        /* renamed from: h0, reason: collision with root package name */
        public boolean f1107h0 = false;

        /* renamed from: i0, reason: collision with root package name */
        public boolean f1109i0 = false;

        /* renamed from: j0, reason: collision with root package name */
        public boolean f1111j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1091k0 = sparseIntArray;
            sparseIntArray.append(k.F3, 24);
            f1091k0.append(k.G3, 25);
            f1091k0.append(k.I3, 28);
            f1091k0.append(k.J3, 29);
            f1091k0.append(k.O3, 35);
            f1091k0.append(k.N3, 34);
            f1091k0.append(k.q3, 4);
            f1091k0.append(k.p3, 3);
            f1091k0.append(k.n3, 1);
            f1091k0.append(k.T3, 6);
            f1091k0.append(k.U3, 7);
            f1091k0.append(k.x3, 17);
            f1091k0.append(k.y3, 18);
            f1091k0.append(k.z3, 19);
            f1091k0.append(k.Y2, 26);
            f1091k0.append(k.K3, 31);
            f1091k0.append(k.L3, 32);
            f1091k0.append(k.w3, 10);
            f1091k0.append(k.v3, 9);
            f1091k0.append(k.X3, 13);
            f1091k0.append(k.a4, 16);
            f1091k0.append(k.Y3, 14);
            f1091k0.append(k.V3, 11);
            f1091k0.append(k.Z3, 15);
            f1091k0.append(k.W3, 12);
            f1091k0.append(k.R3, 38);
            f1091k0.append(k.D3, 37);
            f1091k0.append(k.C3, 39);
            f1091k0.append(k.Q3, 40);
            f1091k0.append(k.B3, 20);
            f1091k0.append(k.P3, 36);
            f1091k0.append(k.u3, 5);
            f1091k0.append(k.E3, 76);
            f1091k0.append(k.M3, 76);
            f1091k0.append(k.H3, 76);
            f1091k0.append(k.o3, 76);
            f1091k0.append(k.m3, 76);
            f1091k0.append(k.b3, 23);
            f1091k0.append(k.d3, 27);
            f1091k0.append(k.f3, 30);
            f1091k0.append(k.g3, 8);
            f1091k0.append(k.c3, 33);
            f1091k0.append(k.e3, 2);
            f1091k0.append(k.Z2, 22);
            f1091k0.append(k.a3, 21);
            f1091k0.append(k.r3, 61);
            f1091k0.append(k.t3, 62);
            f1091k0.append(k.s3, 63);
            f1091k0.append(k.S3, 69);
            f1091k0.append(k.A3, 70);
            f1091k0.append(k.k3, 71);
            f1091k0.append(k.i3, 72);
            f1091k0.append(k.j3, 73);
            f1091k0.append(k.l3, 74);
            f1091k0.append(k.h3, 75);
        }

        public void a(b bVar) {
            this.f1092a = bVar.f1092a;
            this.f1096c = bVar.f1096c;
            this.f1094b = bVar.f1094b;
            this.f1098d = bVar.f1098d;
            this.f1100e = bVar.f1100e;
            this.f1102f = bVar.f1102f;
            this.f1104g = bVar.f1104g;
            this.f1106h = bVar.f1106h;
            this.f1108i = bVar.f1108i;
            this.f1110j = bVar.f1110j;
            this.f1112k = bVar.f1112k;
            this.f1113l = bVar.f1113l;
            this.f1114m = bVar.f1114m;
            this.f1115n = bVar.f1115n;
            this.f1116o = bVar.f1116o;
            this.f1117p = bVar.f1117p;
            this.f1118q = bVar.f1118q;
            this.f1119r = bVar.f1119r;
            this.f1120s = bVar.f1120s;
            this.f1121t = bVar.f1121t;
            this.f1122u = bVar.f1122u;
            this.f1123v = bVar.f1123v;
            this.f1124w = bVar.f1124w;
            this.f1125x = bVar.f1125x;
            this.f1126y = bVar.f1126y;
            this.f1127z = bVar.f1127z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f1093a0 = bVar.f1093a0;
            this.f1095b0 = bVar.f1095b0;
            this.f1097c0 = bVar.f1097c0;
            this.f1099d0 = bVar.f1099d0;
            this.f1105g0 = bVar.f1105g0;
            int[] iArr = bVar.f1101e0;
            if (iArr != null) {
                this.f1101e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f1101e0 = null;
            }
            this.f1103f0 = bVar.f1103f0;
            this.f1107h0 = bVar.f1107h0;
            this.f1109i0 = bVar.f1109i0;
            this.f1111j0 = bVar.f1111j0;
        }

        void b(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.X2);
            this.f1094b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = f1091k0.get(index);
                if (i3 == 80) {
                    this.f1107h0 = obtainStyledAttributes.getBoolean(index, this.f1107h0);
                } else if (i3 != 81) {
                    switch (i3) {
                        case 1:
                            this.f1117p = e.k(obtainStyledAttributes, index, this.f1117p);
                            break;
                        case 2:
                            this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 3:
                            this.f1116o = e.k(obtainStyledAttributes, index, this.f1116o);
                            break;
                        case 4:
                            this.f1115n = e.k(obtainStyledAttributes, index, this.f1115n);
                            break;
                        case 5:
                            this.f1124w = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.A = obtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                            break;
                        case 7:
                            this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            break;
                        case 8:
                            this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case 9:
                            this.f1121t = e.k(obtainStyledAttributes, index, this.f1121t);
                            break;
                        case 10:
                            this.f1120s = e.k(obtainStyledAttributes, index, this.f1120s);
                            break;
                        case 11:
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        case 12:
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 13:
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        case 14:
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case 15:
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        case 16:
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        case 17:
                            this.f1100e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1100e);
                            break;
                        case 18:
                            this.f1102f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1102f);
                            break;
                        case 19:
                            this.f1104g = obtainStyledAttributes.getFloat(index, this.f1104g);
                            break;
                        case 20:
                            this.f1122u = obtainStyledAttributes.getFloat(index, this.f1122u);
                            break;
                        case 21:
                            this.f1098d = obtainStyledAttributes.getLayoutDimension(index, this.f1098d);
                            break;
                        case 22:
                            this.f1096c = obtainStyledAttributes.getLayoutDimension(index, this.f1096c);
                            break;
                        case 23:
                            this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            break;
                        case 24:
                            this.f1106h = e.k(obtainStyledAttributes, index, this.f1106h);
                            break;
                        case 25:
                            this.f1108i = e.k(obtainStyledAttributes, index, this.f1108i);
                            break;
                        case 26:
                            this.C = obtainStyledAttributes.getInt(index, this.C);
                            break;
                        case 27:
                            this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            break;
                        case 28:
                            this.f1110j = e.k(obtainStyledAttributes, index, this.f1110j);
                            break;
                        case 29:
                            this.f1112k = e.k(obtainStyledAttributes, index, this.f1112k);
                            break;
                        case 30:
                            this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            break;
                        case k.T /* 31 */:
                            this.f1118q = e.k(obtainStyledAttributes, index, this.f1118q);
                            break;
                        case k.U /* 32 */:
                            this.f1119r = e.k(obtainStyledAttributes, index, this.f1119r);
                            break;
                        case 33:
                            this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            break;
                        case 34:
                            this.f1114m = e.k(obtainStyledAttributes, index, this.f1114m);
                            break;
                        case k.B3 /* 35 */:
                            this.f1113l = e.k(obtainStyledAttributes, index, this.f1113l);
                            break;
                        case k.C3 /* 36 */:
                            this.f1123v = obtainStyledAttributes.getFloat(index, this.f1123v);
                            break;
                        case k.D3 /* 37 */:
                            this.Q = obtainStyledAttributes.getFloat(index, this.Q);
                            break;
                        case k.E3 /* 38 */:
                            this.P = obtainStyledAttributes.getFloat(index, this.P);
                            break;
                        case 39:
                            this.R = obtainStyledAttributes.getInt(index, this.R);
                            break;
                        case 40:
                            this.S = obtainStyledAttributes.getInt(index, this.S);
                            break;
                        default:
                            switch (i3) {
                                case 54:
                                    this.T = obtainStyledAttributes.getInt(index, this.T);
                                    break;
                                case 55:
                                    this.U = obtainStyledAttributes.getInt(index, this.U);
                                    break;
                                case 56:
                                    this.V = obtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                    break;
                                case 57:
                                    this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    break;
                                case 58:
                                    this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    break;
                                case 59:
                                    this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    break;
                                default:
                                    switch (i3) {
                                        case 61:
                                            this.f1125x = e.k(obtainStyledAttributes, index, this.f1125x);
                                            break;
                                        case 62:
                                            this.f1126y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1126y);
                                            break;
                                        case 63:
                                            this.f1127z = obtainStyledAttributes.getFloat(index, this.f1127z);
                                            break;
                                        default:
                                            switch (i3) {
                                                case 69:
                                                    this.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.f1093a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.f1095b0 = obtainStyledAttributes.getInt(index, this.f1095b0);
                                                    continue;
                                                case 73:
                                                    this.f1097c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1097c0);
                                                    continue;
                                                case 74:
                                                    this.f1103f0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.f1111j0 = obtainStyledAttributes.getBoolean(index, this.f1111j0);
                                                    continue;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    break;
                                                case 77:
                                                    this.f1105g0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    break;
                                            }
                                            sb.append(str);
                                            sb.append(Integer.toHexString(index));
                                            sb.append("   ");
                                            sb.append(f1091k0.get(index));
                                            Log.w("ConstraintSet", sb.toString());
                                            break;
                                    }
                            }
                    }
                } else {
                    this.f1109i0 = obtainStyledAttributes.getBoolean(index, this.f1109i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* renamed from: h, reason: collision with root package name */
        private static SparseIntArray f1128h;

        /* renamed from: a, reason: collision with root package name */
        public boolean f1129a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f1130b = -1;

        /* renamed from: c, reason: collision with root package name */
        public String f1131c = null;

        /* renamed from: d, reason: collision with root package name */
        public int f1132d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f1133e = 0;

        /* renamed from: f, reason: collision with root package name */
        public float f1134f = Float.NaN;

        /* renamed from: g, reason: collision with root package name */
        public float f1135g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1128h = sparseIntArray;
            sparseIntArray.append(k.l4, 1);
            f1128h.append(k.n4, 2);
            f1128h.append(k.o4, 3);
            f1128h.append(k.k4, 4);
            f1128h.append(k.j4, 5);
            f1128h.append(k.m4, 6);
        }

        public void a(c cVar) {
            this.f1129a = cVar.f1129a;
            this.f1130b = cVar.f1130b;
            this.f1131c = cVar.f1131c;
            this.f1132d = cVar.f1132d;
            this.f1133e = cVar.f1133e;
            this.f1135g = cVar.f1135g;
            this.f1134f = cVar.f1134f;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.i4);
            this.f1129a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (f1128h.get(index)) {
                    case 1:
                        this.f1135g = obtainStyledAttributes.getFloat(index, this.f1135g);
                        break;
                    case 2:
                        this.f1132d = obtainStyledAttributes.getInt(index, this.f1132d);
                        break;
                    case 3:
                        this.f1131c = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : m.a.f3835c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f1133e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1130b = e.k(obtainStyledAttributes, index, this.f1130b);
                        break;
                    case 6:
                        this.f1134f = obtainStyledAttributes.getFloat(index, this.f1134f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1136a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f1137b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f1138c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f1139d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f1140e = Float.NaN;

        public void a(d dVar) {
            this.f1136a = dVar.f1136a;
            this.f1137b = dVar.f1137b;
            this.f1139d = dVar.f1139d;
            this.f1140e = dVar.f1140e;
            this.f1138c = dVar.f1138c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.x4);
            this.f1136a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == k.z4) {
                    this.f1139d = obtainStyledAttributes.getFloat(index, this.f1139d);
                } else if (index == k.y4) {
                    this.f1137b = obtainStyledAttributes.getInt(index, this.f1137b);
                    this.f1137b = e.f1080d[this.f1137b];
                } else if (index == k.B4) {
                    this.f1138c = obtainStyledAttributes.getInt(index, this.f1138c);
                } else if (index == k.A4) {
                    this.f1140e = obtainStyledAttributes.getFloat(index, this.f1140e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$e, reason: collision with other inner class name */
    public static class C0016e {

        /* renamed from: n, reason: collision with root package name */
        private static SparseIntArray f1141n;

        /* renamed from: a, reason: collision with root package name */
        public boolean f1142a = false;

        /* renamed from: b, reason: collision with root package name */
        public float f1143b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f1144c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f1145d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f1146e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f1147f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f1148g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f1149h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public float f1150i = 0.0f;

        /* renamed from: j, reason: collision with root package name */
        public float f1151j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f1152k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public boolean f1153l = false;

        /* renamed from: m, reason: collision with root package name */
        public float f1154m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1141n = sparseIntArray;
            sparseIntArray.append(k.V4, 1);
            f1141n.append(k.W4, 2);
            f1141n.append(k.X4, 3);
            f1141n.append(k.T4, 4);
            f1141n.append(k.U4, 5);
            f1141n.append(k.P4, 6);
            f1141n.append(k.Q4, 7);
            f1141n.append(k.R4, 8);
            f1141n.append(k.S4, 9);
            f1141n.append(k.Y4, 10);
            f1141n.append(k.Z4, 11);
        }

        public void a(C0016e c0016e) {
            this.f1142a = c0016e.f1142a;
            this.f1143b = c0016e.f1143b;
            this.f1144c = c0016e.f1144c;
            this.f1145d = c0016e.f1145d;
            this.f1146e = c0016e.f1146e;
            this.f1147f = c0016e.f1147f;
            this.f1148g = c0016e.f1148g;
            this.f1149h = c0016e.f1149h;
            this.f1150i = c0016e.f1150i;
            this.f1151j = c0016e.f1151j;
            this.f1152k = c0016e.f1152k;
            this.f1153l = c0016e.f1153l;
            this.f1154m = c0016e.f1154m;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.O4);
            this.f1142a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (f1141n.get(index)) {
                    case 1:
                        this.f1143b = obtainStyledAttributes.getFloat(index, this.f1143b);
                        break;
                    case 2:
                        this.f1144c = obtainStyledAttributes.getFloat(index, this.f1144c);
                        break;
                    case 3:
                        this.f1145d = obtainStyledAttributes.getFloat(index, this.f1145d);
                        break;
                    case 4:
                        this.f1146e = obtainStyledAttributes.getFloat(index, this.f1146e);
                        break;
                    case 5:
                        this.f1147f = obtainStyledAttributes.getFloat(index, this.f1147f);
                        break;
                    case 6:
                        this.f1148g = obtainStyledAttributes.getDimension(index, this.f1148g);
                        break;
                    case 7:
                        this.f1149h = obtainStyledAttributes.getDimension(index, this.f1149h);
                        break;
                    case 8:
                        this.f1150i = obtainStyledAttributes.getDimension(index, this.f1150i);
                        break;
                    case 9:
                        this.f1151j = obtainStyledAttributes.getDimension(index, this.f1151j);
                        break;
                    case 10:
                        this.f1152k = obtainStyledAttributes.getDimension(index, this.f1152k);
                        break;
                    case 11:
                        this.f1153l = true;
                        this.f1154m = obtainStyledAttributes.getDimension(index, this.f1154m);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1081e = sparseIntArray;
        sparseIntArray.append(k.f1236u0, 25);
        f1081e.append(k.f1239v0, 26);
        f1081e.append(k.f1245x0, 29);
        f1081e.append(k.f1248y0, 30);
        f1081e.append(k.E0, 36);
        f1081e.append(k.D0, 35);
        f1081e.append(k.f1179c0, 4);
        f1081e.append(k.f1175b0, 3);
        f1081e.append(k.Z, 1);
        f1081e.append(k.M0, 6);
        f1081e.append(k.N0, 7);
        f1081e.append(k.f1203j0, 17);
        f1081e.append(k.f1206k0, 18);
        f1081e.append(k.f1209l0, 19);
        f1081e.append(k.f1229s, 27);
        f1081e.append(k.f1251z0, 32);
        f1081e.append(k.A0, 33);
        f1081e.append(k.f1200i0, 10);
        f1081e.append(k.f1197h0, 9);
        f1081e.append(k.Q0, 13);
        f1081e.append(k.T0, 16);
        f1081e.append(k.R0, 14);
        f1081e.append(k.O0, 11);
        f1081e.append(k.S0, 15);
        f1081e.append(k.P0, 12);
        f1081e.append(k.H0, 40);
        f1081e.append(k.f1230s0, 39);
        f1081e.append(k.f1227r0, 41);
        f1081e.append(k.G0, 42);
        f1081e.append(k.f1224q0, 20);
        f1081e.append(k.F0, 37);
        f1081e.append(k.f1194g0, 5);
        f1081e.append(k.f1233t0, 82);
        f1081e.append(k.C0, 82);
        f1081e.append(k.f1242w0, 82);
        f1081e.append(k.f1171a0, 82);
        f1081e.append(k.Y, 82);
        f1081e.append(k.f1244x, 24);
        f1081e.append(k.f1250z, 28);
        f1081e.append(k.L, 31);
        f1081e.append(k.M, 8);
        f1081e.append(k.f1247y, 34);
        f1081e.append(k.A, 2);
        f1081e.append(k.f1238v, 23);
        f1081e.append(k.f1241w, 21);
        f1081e.append(k.f1235u, 22);
        f1081e.append(k.B, 43);
        f1081e.append(k.O, 44);
        f1081e.append(k.J, 45);
        f1081e.append(k.K, 46);
        f1081e.append(k.I, 60);
        f1081e.append(k.G, 47);
        f1081e.append(k.H, 48);
        f1081e.append(k.C, 49);
        f1081e.append(k.D, 50);
        f1081e.append(k.E, 51);
        f1081e.append(k.F, 52);
        f1081e.append(k.N, 53);
        f1081e.append(k.I0, 54);
        f1081e.append(k.f1212m0, 55);
        f1081e.append(k.J0, 56);
        f1081e.append(k.f1215n0, 57);
        f1081e.append(k.K0, 58);
        f1081e.append(k.f1218o0, 59);
        f1081e.append(k.f1183d0, 61);
        f1081e.append(k.f1191f0, 62);
        f1081e.append(k.f1187e0, 63);
        f1081e.append(k.P, 64);
        f1081e.append(k.X0, 65);
        f1081e.append(k.V, 66);
        f1081e.append(k.Y0, 67);
        f1081e.append(k.V0, 79);
        f1081e.append(k.f1232t, 38);
        f1081e.append(k.U0, 68);
        f1081e.append(k.L0, 69);
        f1081e.append(k.f1221p0, 70);
        f1081e.append(k.T, 71);
        f1081e.append(k.R, 72);
        f1081e.append(k.S, 73);
        f1081e.append(k.U, 74);
        f1081e.append(k.Q, 75);
        f1081e.append(k.W0, 76);
        f1081e.append(k.B0, 77);
        f1081e.append(k.Z0, 78);
        f1081e.append(k.X, 80);
        f1081e.append(k.W, 81);
    }

    private int[] g(View view, String str) {
        int i2;
        Object f2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = j.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (f2 = ((ConstraintLayout) view.getParent()).f(0, trim)) != null && (f2 instanceof Integer)) {
                i2 = ((Integer) f2).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    private a h(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f1226r);
        l(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    private void l(Context context, a aVar, TypedArray typedArray) {
        c cVar;
        String str;
        StringBuilder sb;
        String str2;
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            if (index != k.f1232t && k.L != index && k.M != index) {
                aVar.f1087c.f1129a = true;
                aVar.f1088d.f1094b = true;
                aVar.f1086b.f1136a = true;
                aVar.f1089e.f1142a = true;
            }
            switch (f1081e.get(index)) {
                case 1:
                    b bVar = aVar.f1088d;
                    bVar.f1117p = k(typedArray, index, bVar.f1117p);
                    continue;
                case 2:
                    b bVar2 = aVar.f1088d;
                    bVar2.G = typedArray.getDimensionPixelSize(index, bVar2.G);
                    continue;
                case 3:
                    b bVar3 = aVar.f1088d;
                    bVar3.f1116o = k(typedArray, index, bVar3.f1116o);
                    continue;
                case 4:
                    b bVar4 = aVar.f1088d;
                    bVar4.f1115n = k(typedArray, index, bVar4.f1115n);
                    continue;
                case 5:
                    aVar.f1088d.f1124w = typedArray.getString(index);
                    continue;
                case 6:
                    b bVar5 = aVar.f1088d;
                    bVar5.A = typedArray.getDimensionPixelOffset(index, bVar5.A);
                    continue;
                case 7:
                    b bVar6 = aVar.f1088d;
                    bVar6.B = typedArray.getDimensionPixelOffset(index, bVar6.B);
                    continue;
                case 8:
                    b bVar7 = aVar.f1088d;
                    bVar7.H = typedArray.getDimensionPixelSize(index, bVar7.H);
                    continue;
                case 9:
                    b bVar8 = aVar.f1088d;
                    bVar8.f1121t = k(typedArray, index, bVar8.f1121t);
                    continue;
                case 10:
                    b bVar9 = aVar.f1088d;
                    bVar9.f1120s = k(typedArray, index, bVar9.f1120s);
                    continue;
                case 11:
                    b bVar10 = aVar.f1088d;
                    bVar10.M = typedArray.getDimensionPixelSize(index, bVar10.M);
                    continue;
                case 12:
                    b bVar11 = aVar.f1088d;
                    bVar11.N = typedArray.getDimensionPixelSize(index, bVar11.N);
                    continue;
                case 13:
                    b bVar12 = aVar.f1088d;
                    bVar12.J = typedArray.getDimensionPixelSize(index, bVar12.J);
                    continue;
                case 14:
                    b bVar13 = aVar.f1088d;
                    bVar13.L = typedArray.getDimensionPixelSize(index, bVar13.L);
                    continue;
                case 15:
                    b bVar14 = aVar.f1088d;
                    bVar14.O = typedArray.getDimensionPixelSize(index, bVar14.O);
                    continue;
                case 16:
                    b bVar15 = aVar.f1088d;
                    bVar15.K = typedArray.getDimensionPixelSize(index, bVar15.K);
                    continue;
                case 17:
                    b bVar16 = aVar.f1088d;
                    bVar16.f1100e = typedArray.getDimensionPixelOffset(index, bVar16.f1100e);
                    continue;
                case 18:
                    b bVar17 = aVar.f1088d;
                    bVar17.f1102f = typedArray.getDimensionPixelOffset(index, bVar17.f1102f);
                    continue;
                case 19:
                    b bVar18 = aVar.f1088d;
                    bVar18.f1104g = typedArray.getFloat(index, bVar18.f1104g);
                    continue;
                case 20:
                    b bVar19 = aVar.f1088d;
                    bVar19.f1122u = typedArray.getFloat(index, bVar19.f1122u);
                    continue;
                case 21:
                    b bVar20 = aVar.f1088d;
                    bVar20.f1098d = typedArray.getLayoutDimension(index, bVar20.f1098d);
                    continue;
                case 22:
                    d dVar = aVar.f1086b;
                    dVar.f1137b = typedArray.getInt(index, dVar.f1137b);
                    d dVar2 = aVar.f1086b;
                    dVar2.f1137b = f1080d[dVar2.f1137b];
                    continue;
                case 23:
                    b bVar21 = aVar.f1088d;
                    bVar21.f1096c = typedArray.getLayoutDimension(index, bVar21.f1096c);
                    continue;
                case 24:
                    b bVar22 = aVar.f1088d;
                    bVar22.D = typedArray.getDimensionPixelSize(index, bVar22.D);
                    continue;
                case 25:
                    b bVar23 = aVar.f1088d;
                    bVar23.f1106h = k(typedArray, index, bVar23.f1106h);
                    continue;
                case 26:
                    b bVar24 = aVar.f1088d;
                    bVar24.f1108i = k(typedArray, index, bVar24.f1108i);
                    continue;
                case 27:
                    b bVar25 = aVar.f1088d;
                    bVar25.C = typedArray.getInt(index, bVar25.C);
                    continue;
                case 28:
                    b bVar26 = aVar.f1088d;
                    bVar26.E = typedArray.getDimensionPixelSize(index, bVar26.E);
                    continue;
                case 29:
                    b bVar27 = aVar.f1088d;
                    bVar27.f1110j = k(typedArray, index, bVar27.f1110j);
                    continue;
                case 30:
                    b bVar28 = aVar.f1088d;
                    bVar28.f1112k = k(typedArray, index, bVar28.f1112k);
                    continue;
                case k.T /* 31 */:
                    b bVar29 = aVar.f1088d;
                    bVar29.I = typedArray.getDimensionPixelSize(index, bVar29.I);
                    continue;
                case k.U /* 32 */:
                    b bVar30 = aVar.f1088d;
                    bVar30.f1118q = k(typedArray, index, bVar30.f1118q);
                    continue;
                case 33:
                    b bVar31 = aVar.f1088d;
                    bVar31.f1119r = k(typedArray, index, bVar31.f1119r);
                    continue;
                case 34:
                    b bVar32 = aVar.f1088d;
                    bVar32.F = typedArray.getDimensionPixelSize(index, bVar32.F);
                    continue;
                case k.B3 /* 35 */:
                    b bVar33 = aVar.f1088d;
                    bVar33.f1114m = k(typedArray, index, bVar33.f1114m);
                    continue;
                case k.C3 /* 36 */:
                    b bVar34 = aVar.f1088d;
                    bVar34.f1113l = k(typedArray, index, bVar34.f1113l);
                    continue;
                case k.D3 /* 37 */:
                    b bVar35 = aVar.f1088d;
                    bVar35.f1123v = typedArray.getFloat(index, bVar35.f1123v);
                    continue;
                case k.E3 /* 38 */:
                    aVar.f1085a = typedArray.getResourceId(index, aVar.f1085a);
                    continue;
                case 39:
                    b bVar36 = aVar.f1088d;
                    bVar36.Q = typedArray.getFloat(index, bVar36.Q);
                    continue;
                case 40:
                    b bVar37 = aVar.f1088d;
                    bVar37.P = typedArray.getFloat(index, bVar37.P);
                    continue;
                case 41:
                    b bVar38 = aVar.f1088d;
                    bVar38.R = typedArray.getInt(index, bVar38.R);
                    continue;
                case 42:
                    b bVar39 = aVar.f1088d;
                    bVar39.S = typedArray.getInt(index, bVar39.S);
                    continue;
                case 43:
                    d dVar3 = aVar.f1086b;
                    dVar3.f1139d = typedArray.getFloat(index, dVar3.f1139d);
                    continue;
                case 44:
                    C0016e c0016e = aVar.f1089e;
                    c0016e.f1153l = true;
                    c0016e.f1154m = typedArray.getDimension(index, c0016e.f1154m);
                    continue;
                case 45:
                    C0016e c0016e2 = aVar.f1089e;
                    c0016e2.f1144c = typedArray.getFloat(index, c0016e2.f1144c);
                    continue;
                case 46:
                    C0016e c0016e3 = aVar.f1089e;
                    c0016e3.f1145d = typedArray.getFloat(index, c0016e3.f1145d);
                    continue;
                case 47:
                    C0016e c0016e4 = aVar.f1089e;
                    c0016e4.f1146e = typedArray.getFloat(index, c0016e4.f1146e);
                    continue;
                case 48:
                    C0016e c0016e5 = aVar.f1089e;
                    c0016e5.f1147f = typedArray.getFloat(index, c0016e5.f1147f);
                    continue;
                case 49:
                    C0016e c0016e6 = aVar.f1089e;
                    c0016e6.f1148g = typedArray.getDimension(index, c0016e6.f1148g);
                    continue;
                case 50:
                    C0016e c0016e7 = aVar.f1089e;
                    c0016e7.f1149h = typedArray.getDimension(index, c0016e7.f1149h);
                    continue;
                case 51:
                    C0016e c0016e8 = aVar.f1089e;
                    c0016e8.f1150i = typedArray.getDimension(index, c0016e8.f1150i);
                    continue;
                case k.B1 /* 52 */:
                    C0016e c0016e9 = aVar.f1089e;
                    c0016e9.f1151j = typedArray.getDimension(index, c0016e9.f1151j);
                    continue;
                case 53:
                    C0016e c0016e10 = aVar.f1089e;
                    c0016e10.f1152k = typedArray.getDimension(index, c0016e10.f1152k);
                    continue;
                case 54:
                    b bVar40 = aVar.f1088d;
                    bVar40.T = typedArray.getInt(index, bVar40.T);
                    continue;
                case 55:
                    b bVar41 = aVar.f1088d;
                    bVar41.U = typedArray.getInt(index, bVar41.U);
                    continue;
                case 56:
                    b bVar42 = aVar.f1088d;
                    bVar42.V = typedArray.getDimensionPixelSize(index, bVar42.V);
                    continue;
                case 57:
                    b bVar43 = aVar.f1088d;
                    bVar43.W = typedArray.getDimensionPixelSize(index, bVar43.W);
                    continue;
                case 58:
                    b bVar44 = aVar.f1088d;
                    bVar44.X = typedArray.getDimensionPixelSize(index, bVar44.X);
                    continue;
                case 59:
                    b bVar45 = aVar.f1088d;
                    bVar45.Y = typedArray.getDimensionPixelSize(index, bVar45.Y);
                    continue;
                case 60:
                    C0016e c0016e11 = aVar.f1089e;
                    c0016e11.f1143b = typedArray.getFloat(index, c0016e11.f1143b);
                    continue;
                case 61:
                    b bVar46 = aVar.f1088d;
                    bVar46.f1125x = k(typedArray, index, bVar46.f1125x);
                    continue;
                case 62:
                    b bVar47 = aVar.f1088d;
                    bVar47.f1126y = typedArray.getDimensionPixelSize(index, bVar47.f1126y);
                    continue;
                case 63:
                    b bVar48 = aVar.f1088d;
                    bVar48.f1127z = typedArray.getFloat(index, bVar48.f1127z);
                    continue;
                case 64:
                    c cVar2 = aVar.f1087c;
                    cVar2.f1130b = k(typedArray, index, cVar2.f1130b);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f1087c;
                        str = typedArray.getString(index);
                    } else {
                        cVar = aVar.f1087c;
                        str = m.a.f3835c[typedArray.getInteger(index, 0)];
                    }
                    cVar.f1131c = str;
                    continue;
                case 66:
                    aVar.f1087c.f1133e = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    c cVar3 = aVar.f1087c;
                    cVar3.f1135g = typedArray.getFloat(index, cVar3.f1135g);
                    continue;
                case 68:
                    d dVar4 = aVar.f1086b;
                    dVar4.f1140e = typedArray.getFloat(index, dVar4.f1140e);
                    continue;
                case 69:
                    aVar.f1088d.Z = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.f1088d.f1093a0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    b bVar49 = aVar.f1088d;
                    bVar49.f1095b0 = typedArray.getInt(index, bVar49.f1095b0);
                    continue;
                case 73:
                    b bVar50 = aVar.f1088d;
                    bVar50.f1097c0 = typedArray.getDimensionPixelSize(index, bVar50.f1097c0);
                    continue;
                case 74:
                    aVar.f1088d.f1103f0 = typedArray.getString(index);
                    continue;
                case 75:
                    b bVar51 = aVar.f1088d;
                    bVar51.f1111j0 = typedArray.getBoolean(index, bVar51.f1111j0);
                    continue;
                case 76:
                    c cVar4 = aVar.f1087c;
                    cVar4.f1132d = typedArray.getInt(index, cVar4.f1132d);
                    continue;
                case 77:
                    aVar.f1088d.f1105g0 = typedArray.getString(index);
                    continue;
                case 78:
                    d dVar5 = aVar.f1086b;
                    dVar5.f1138c = typedArray.getInt(index, dVar5.f1138c);
                    continue;
                case 79:
                    c cVar5 = aVar.f1087c;
                    cVar5.f1134f = typedArray.getFloat(index, cVar5.f1134f);
                    continue;
                case 80:
                    b bVar52 = aVar.f1088d;
                    bVar52.f1107h0 = typedArray.getBoolean(index, bVar52.f1107h0);
                    continue;
                case 81:
                    b bVar53 = aVar.f1088d;
                    bVar53.f1109i0 = typedArray.getBoolean(index, bVar53.f1109i0);
                    continue;
                case 82:
                    sb = new StringBuilder();
                    str2 = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str2 = "Unknown attribute 0x";
                    break;
            }
            sb.append(str2);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(f1081e.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
    }

    void c(ConstraintLayout constraintLayout, boolean z2) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1084c.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.f1084c.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + n.a.a(childAt));
            } else {
                if (this.f1083b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f1084c.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.f1084c.get(Integer.valueOf(id));
                        if (childAt instanceof androidx.constraintlayout.widget.a) {
                            aVar.f1088d.f1099d0 = 1;
                        }
                        int i3 = aVar.f1088d.f1099d0;
                        if (i3 != -1 && i3 == 1) {
                            androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                            aVar2.setId(id);
                            aVar2.setType(aVar.f1088d.f1095b0);
                            aVar2.setMargin(aVar.f1088d.f1097c0);
                            aVar2.setAllowsGoneWidget(aVar.f1088d.f1111j0);
                            b bVar = aVar.f1088d;
                            int[] iArr = bVar.f1101e0;
                            if (iArr != null) {
                                aVar2.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f1103f0;
                                if (str != null) {
                                    bVar.f1101e0 = g(aVar2, str);
                                    aVar2.setReferencedIds(aVar.f1088d.f1101e0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.d(bVar2);
                        if (z2) {
                            androidx.constraintlayout.widget.b.c(childAt, aVar.f1090f);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f1086b;
                        if (dVar.f1138c == 0) {
                            childAt.setVisibility(dVar.f1137b);
                        }
                        childAt.setAlpha(aVar.f1086b.f1139d);
                        childAt.setRotation(aVar.f1089e.f1143b);
                        childAt.setRotationX(aVar.f1089e.f1144c);
                        childAt.setRotationY(aVar.f1089e.f1145d);
                        childAt.setScaleX(aVar.f1089e.f1146e);
                        childAt.setScaleY(aVar.f1089e.f1147f);
                        if (!Float.isNaN(aVar.f1089e.f1148g)) {
                            childAt.setPivotX(aVar.f1089e.f1148g);
                        }
                        if (!Float.isNaN(aVar.f1089e.f1149h)) {
                            childAt.setPivotY(aVar.f1089e.f1149h);
                        }
                        childAt.setTranslationX(aVar.f1089e.f1150i);
                        childAt.setTranslationY(aVar.f1089e.f1151j);
                        childAt.setTranslationZ(aVar.f1089e.f1152k);
                        C0016e c0016e = aVar.f1089e;
                        if (c0016e.f1153l) {
                            childAt.setElevation(c0016e.f1154m);
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = this.f1084c.get(num);
            int i4 = aVar3.f1088d.f1099d0;
            if (i4 != -1 && i4 == 1) {
                androidx.constraintlayout.widget.a aVar4 = new androidx.constraintlayout.widget.a(constraintLayout.getContext());
                aVar4.setId(num.intValue());
                b bVar3 = aVar3.f1088d;
                int[] iArr2 = bVar3.f1101e0;
                if (iArr2 != null) {
                    aVar4.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f1103f0;
                    if (str2 != null) {
                        bVar3.f1101e0 = g(aVar4, str2);
                        aVar4.setReferencedIds(aVar3.f1088d.f1101e0);
                    }
                }
                aVar4.setType(aVar3.f1088d.f1095b0);
                aVar4.setMargin(aVar3.f1088d.f1097c0);
                ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                aVar4.n();
                aVar3.d(generateDefaultLayoutParams);
                constraintLayout.addView(aVar4, generateDefaultLayoutParams);
            }
            if (aVar3.f1088d.f1092a) {
                View hVar = new h(constraintLayout.getContext());
                hVar.setId(num.intValue());
                ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar3.d(generateDefaultLayoutParams2);
                constraintLayout.addView(hVar, generateDefaultLayoutParams2);
            }
        }
    }

    public void d(Context context, int i2) {
        e((ConstraintLayout) LayoutInflater.from(context).inflate(i2, (ViewGroup) null));
    }

    public void e(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1084c.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f1083b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1084c.containsKey(Integer.valueOf(id))) {
                this.f1084c.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f1084c.get(Integer.valueOf(id));
            aVar.f1090f = androidx.constraintlayout.widget.b.a(this.f1082a, childAt);
            aVar.f(id, bVar);
            aVar.f1086b.f1137b = childAt.getVisibility();
            aVar.f1086b.f1139d = childAt.getAlpha();
            aVar.f1089e.f1143b = childAt.getRotation();
            aVar.f1089e.f1144c = childAt.getRotationX();
            aVar.f1089e.f1145d = childAt.getRotationY();
            aVar.f1089e.f1146e = childAt.getScaleX();
            aVar.f1089e.f1147f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                C0016e c0016e = aVar.f1089e;
                c0016e.f1148g = pivotX;
                c0016e.f1149h = pivotY;
            }
            aVar.f1089e.f1150i = childAt.getTranslationX();
            aVar.f1089e.f1151j = childAt.getTranslationY();
            aVar.f1089e.f1152k = childAt.getTranslationZ();
            C0016e c0016e2 = aVar.f1089e;
            if (c0016e2.f1153l) {
                c0016e2.f1154m = childAt.getElevation();
            }
            if (childAt instanceof androidx.constraintlayout.widget.a) {
                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                aVar.f1088d.f1111j0 = aVar2.o();
                aVar.f1088d.f1101e0 = aVar2.getReferencedIds();
                aVar.f1088d.f1095b0 = aVar2.getType();
                aVar.f1088d.f1097c0 = aVar2.getMargin();
            }
        }
    }

    public void f(f fVar) {
        int childCount = fVar.getChildCount();
        this.f1084c.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = fVar.getChildAt(i2);
            f.a aVar = (f.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f1083b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1084c.containsKey(Integer.valueOf(id))) {
                this.f1084c.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.f1084c.get(Integer.valueOf(id));
            if (childAt instanceof androidx.constraintlayout.widget.c) {
                aVar2.h((androidx.constraintlayout.widget.c) childAt, id, aVar);
            }
            aVar2.g(id, aVar);
        }
    }

    public void i(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a h2 = h(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        h2.f1088d.f1092a = true;
                    }
                    this.f1084c.put(Integer.valueOf(h2.f1085a), h2);
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0179, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(Context context, XmlPullParser xmlPullParser) {
        a h2;
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    char c3 = 3;
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    c3 = 6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1791837707:
                                if (name.equals("CustomAttribute")) {
                                    c3 = 7;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                h2 = h(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            case 1:
                                h2 = h(context, Xml.asAttributeSet(xmlPullParser));
                                b bVar = h2.f1088d;
                                bVar.f1092a = true;
                                bVar.f1094b = true;
                                break;
                            case 2:
                                h2 = h(context, Xml.asAttributeSet(xmlPullParser));
                                h2.f1088d.f1099d0 = 1;
                                break;
                            case 3:
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f1086b.b(context, Xml.asAttributeSet(xmlPullParser));
                                continue;
                            case 4:
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f1089e.b(context, Xml.asAttributeSet(xmlPullParser));
                                continue;
                            case 5:
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f1088d.b(context, Xml.asAttributeSet(xmlPullParser));
                                continue;
                            case 6:
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f1087c.b(context, Xml.asAttributeSet(xmlPullParser));
                                continue;
                            case 7:
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                androidx.constraintlayout.widget.b.b(context, xmlPullParser, aVar.f1090f);
                                continue;
                        }
                        aVar = h2;
                    } else if (eventType != 3) {
                        continue;
                    } else {
                        String name2 = xmlPullParser.getName();
                        if ("ConstraintSet".equals(name2)) {
                            return;
                        }
                        if (name2.equalsIgnoreCase("Constraint")) {
                            this.f1084c.put(Integer.valueOf(aVar.f1085a), aVar);
                            aVar = null;
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
    }
}
