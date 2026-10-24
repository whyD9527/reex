package h1;

/* loaded from: classes.dex */
public final class h extends r {
    public static /* bridge */ /* synthetic */ Appendable l(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, q1.l lVar, int i3, Object obj) {
        Appendable k2;
        k2 = r.k(iterable, appendable, (r14 & 2) != 0 ? ", " : charSequence, (r14 & 4) != 0 ? "" : charSequence2, (r14 & 8) == 0 ? charSequence3 : "", (r14 & 16) != 0 ? -1 : i2, (r14 & 32) != 0 ? "..." : charSequence4, (r14 & 64) != 0 ? null : lVar);
        return k2;
    }
}
