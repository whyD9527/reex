package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import y0.p;
import z0.k;

/* loaded from: classes.dex */
public class f implements p.b, SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a, reason: collision with root package name */
    private final p f3277a;

    /* renamed from: b, reason: collision with root package name */
    private final TextServicesManager f3278b;

    /* renamed from: c, reason: collision with root package name */
    private SpellCheckerSession f3279c;

    /* renamed from: d, reason: collision with root package name */
    k.d f3280d;

    public f(TextServicesManager textServicesManager, p pVar) {
        this.f3278b = textServicesManager;
        this.f3277a = pVar;
        pVar.b(this);
    }

    @Override // y0.p.b
    public void a(String str, String str2, k.d dVar) {
        if (this.f3280d != null) {
            dVar.c("error", "Previous spell check request still pending.", null);
        } else {
            this.f3280d = dVar;
            c(str, str2);
        }
    }

    public void b() {
        this.f3277a.b(null);
        SpellCheckerSession spellCheckerSession = this.f3279c;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    public void c(String str, String str2) {
        Locale b3 = a1.b.b(str);
        if (this.f3279c == null) {
            this.f3279c = this.f3278b.newSpellCheckerSession(null, b3, this, true);
        }
        this.f3279c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        ArrayList arrayList;
        k.d dVar;
        if (sentenceSuggestionsInfoArr.length == 0) {
            dVar = this.f3280d;
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
            if (sentenceSuggestionsInfo == null) {
                dVar = this.f3280d;
                arrayList = new ArrayList();
            } else {
                for (int i2 = 0; i2 < sentenceSuggestionsInfo.getSuggestionsCount(); i2++) {
                    SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i2);
                    int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
                    if (suggestionsCount > 0) {
                        HashMap hashMap = new HashMap();
                        int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i2);
                        int lengthAt = sentenceSuggestionsInfo.getLengthAt(i2) + offsetAt;
                        hashMap.put("startIndex", Integer.valueOf(offsetAt));
                        hashMap.put("endIndex", Integer.valueOf(lengthAt));
                        ArrayList arrayList2 = new ArrayList();
                        boolean z2 = false;
                        for (int i3 = 0; i3 < suggestionsCount; i3++) {
                            String suggestionAt = suggestionsInfoAt.getSuggestionAt(i3);
                            if (!suggestionAt.equals("")) {
                                arrayList2.add(suggestionAt);
                                z2 = true;
                            }
                        }
                        if (z2) {
                            hashMap.put("suggestions", arrayList2);
                            arrayList.add(hashMap);
                        }
                    }
                }
                dVar = this.f3280d;
            }
        }
        dVar.a(arrayList);
        this.f3280d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
