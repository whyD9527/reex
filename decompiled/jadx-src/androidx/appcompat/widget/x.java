package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* loaded from: classes.dex */
final class x {

    /* renamed from: a, reason: collision with root package name */
    private TextView f926a;

    /* renamed from: b, reason: collision with root package name */
    private TextClassifier f927b;

    x(TextView textView) {
        this.f926a = (TextView) androidx.core.util.e.b(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f927b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f926a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public void b(TextClassifier textClassifier) {
        this.f927b = textClassifier;
    }
}
