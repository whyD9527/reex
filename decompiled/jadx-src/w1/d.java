package w1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class d implements v1.b<t1.c> {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f4372a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4373b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4374c;

    /* renamed from: d, reason: collision with root package name */
    private final q1.p<CharSequence, Integer, g1.j<Integer, Integer>> f4375d;

    public static final class a implements Iterator<t1.c> {

        /* renamed from: e, reason: collision with root package name */
        private int f4376e = -1;

        /* renamed from: f, reason: collision with root package name */
        private int f4377f;

        /* renamed from: g, reason: collision with root package name */
        private int f4378g;

        /* renamed from: h, reason: collision with root package name */
        private t1.c f4379h;

        /* renamed from: i, reason: collision with root package name */
        private int f4380i;

        a() {
            int f2;
            f2 = t1.f.f(d.this.f4373b, 0, d.this.f4372a.length());
            this.f4377f = f2;
            this.f4378g = f2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 < r6.f4381j.f4374c) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void a() {
            t1.c h2;
            t1.c cVar;
            if (this.f4378g < 0) {
                this.f4376e = 0;
                this.f4379h = null;
                return;
            }
            int i2 = -1;
            if (d.this.f4374c > 0) {
                int i3 = this.f4380i + 1;
                this.f4380i = i3;
            }
            if (this.f4378g <= d.this.f4372a.length()) {
                g1.j jVar = (g1.j) d.this.f4375d.invoke(d.this.f4372a, Integer.valueOf(this.f4378g));
                if (jVar == null) {
                    cVar = new t1.c(this.f4377f, o.u(d.this.f4372a));
                    this.f4379h = cVar;
                    this.f4378g = i2;
                    this.f4376e = 1;
                }
                int intValue = ((Number) jVar.a()).intValue();
                int intValue2 = ((Number) jVar.b()).intValue();
                h2 = t1.f.h(this.f4377f, intValue);
                this.f4379h = h2;
                int i4 = intValue + intValue2;
                this.f4377f = i4;
                i2 = i4 + (intValue2 == 0 ? 1 : 0);
                this.f4378g = i2;
                this.f4376e = 1;
            }
            cVar = new t1.c(this.f4377f, o.u(d.this.f4372a));
            this.f4379h = cVar;
            this.f4378g = i2;
            this.f4376e = 1;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1.c next() {
            if (this.f4376e == -1) {
                a();
            }
            if (this.f4376e == 0) {
                throw new NoSuchElementException();
            }
            t1.c cVar = this.f4379h;
            kotlin.jvm.internal.k.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f4379h = null;
            this.f4376e = -1;
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f4376e == -1) {
                a();
            }
            return this.f4376e == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(CharSequence input, int i2, int i3, q1.p<? super CharSequence, ? super Integer, g1.j<Integer, Integer>> getNextMatch) {
        kotlin.jvm.internal.k.e(input, "input");
        kotlin.jvm.internal.k.e(getNextMatch, "getNextMatch");
        this.f4372a = input;
        this.f4373b = i2;
        this.f4374c = i3;
        this.f4375d = getNextMatch;
    }

    @Override // v1.b
    public Iterator<t1.c> iterator() {
        return new a();
    }
}
