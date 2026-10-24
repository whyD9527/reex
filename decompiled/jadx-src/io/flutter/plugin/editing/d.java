package io.flutter.plugin.editing;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.e;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import y0.r;

/* loaded from: classes.dex */
public class d extends BaseInputConnection implements e.b {

    /* renamed from: a, reason: collision with root package name */
    private final View f3249a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3250b;

    /* renamed from: c, reason: collision with root package name */
    private final r f3251c;

    /* renamed from: d, reason: collision with root package name */
    private final e f3252d;

    /* renamed from: e, reason: collision with root package name */
    private final EditorInfo f3253e;

    /* renamed from: f, reason: collision with root package name */
    private ExtractedTextRequest f3254f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3255g;

    /* renamed from: h, reason: collision with root package name */
    private CursorAnchorInfo.Builder f3256h;

    /* renamed from: i, reason: collision with root package name */
    private ExtractedText f3257i;

    /* renamed from: j, reason: collision with root package name */
    private InputMethodManager f3258j;

    /* renamed from: k, reason: collision with root package name */
    private final Layout f3259k;

    /* renamed from: l, reason: collision with root package name */
    private io.flutter.plugin.editing.a f3260l;

    /* renamed from: m, reason: collision with root package name */
    private final a f3261m;

    /* renamed from: n, reason: collision with root package name */
    private int f3262n;

    public interface a {
        boolean b(KeyEvent keyEvent);
    }

    public d(View view, int i2, r rVar, a aVar, e eVar, EditorInfo editorInfo) {
        this(view, i2, rVar, aVar, eVar, editorInfo, new FlutterJNI());
    }

    public d(View view, int i2, r rVar, a aVar, e eVar, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.f3255g = false;
        this.f3257i = new ExtractedText();
        this.f3262n = 0;
        this.f3249a = view;
        this.f3250b = i2;
        this.f3251c = rVar;
        this.f3252d = eVar;
        eVar.a(this);
        this.f3253e = editorInfo;
        this.f3261m = aVar;
        this.f3260l = new io.flutter.plugin.editing.a(flutterJNI);
        this.f3259k = new DynamicLayout(eVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f3258j = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    private boolean b(int i2) {
        if (i2 == 16908319) {
            setSelection(0, this.f3252d.length());
            return true;
        }
        if (i2 == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f3252d);
            int selectionEnd = Selection.getSelectionEnd(this.f3252d);
            if (selectionStart != selectionEnd) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.f3249a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f3252d.subSequence(min, max)));
                this.f3252d.delete(min, max);
                setSelection(min, min);
            }
            return true;
        }
        if (i2 == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f3252d);
            int selectionEnd2 = Selection.getSelectionEnd(this.f3252d);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.f3249a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f3252d.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        }
        if (i2 != 16908322) {
            return false;
        }
        ClipData primaryClip = ((ClipboardManager) this.f3249a.getContext().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip != null) {
            CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.f3249a.getContext());
            int max2 = Math.max(0, Selection.getSelectionStart(this.f3252d));
            int max3 = Math.max(0, Selection.getSelectionEnd(this.f3252d));
            int min2 = Math.min(max2, max3);
            int max4 = Math.max(max2, max3);
            if (min2 != max4) {
                this.f3252d.delete(min2, max4);
            }
            this.f3252d.insert(min2, coerceToText);
            int length = min2 + coerceToText.length();
            setSelection(length, length);
        }
        return true;
    }

    private CursorAnchorInfo c() {
        CursorAnchorInfo.Builder builder = this.f3256h;
        if (builder == null) {
            this.f3256h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.f3256h.setSelectionRange(this.f3252d.i(), this.f3252d.h());
        int g2 = this.f3252d.g();
        int f2 = this.f3252d.f();
        if (g2 < 0 || f2 <= g2) {
            this.f3256h.setComposingText(-1, "");
        } else {
            this.f3256h.setComposingText(g2, this.f3252d.toString().subSequence(g2, f2));
        }
        return this.f3256h.build();
    }

    private ExtractedText d(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f3257i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.f3252d.i();
        this.f3257i.selectionEnd = this.f3252d.h();
        this.f3257i.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.f3252d.toString() : this.f3252d;
        return this.f3257i;
    }

    private boolean e(boolean z2, boolean z3) {
        int selectionStart = Selection.getSelectionStart(this.f3252d);
        int selectionEnd = Selection.getSelectionEnd(this.f3252d);
        boolean z4 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int max = z2 ? Math.max(this.f3260l.b(this.f3252d, selectionEnd), 0) : Math.min(this.f3260l.a(this.f3252d, selectionEnd), this.f3252d.length());
        if (selectionStart == selectionEnd && !z3) {
            z4 = true;
        }
        if (z4) {
            setSelection(max, max);
        } else {
            setSelection(selectionStart, max);
        }
        return true;
    }

    private boolean g(boolean z2, boolean z3) {
        int selectionStart = Selection.getSelectionStart(this.f3252d);
        int selectionEnd = Selection.getSelectionEnd(this.f3252d);
        boolean z4 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z3) {
            z4 = true;
        }
        beginBatchEdit();
        if (z4) {
            if (z2) {
                Selection.moveUp(this.f3252d, this.f3259k);
            } else {
                Selection.moveDown(this.f3252d, this.f3259k);
            }
            int selectionStart2 = Selection.getSelectionStart(this.f3252d);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z2) {
                Selection.extendUp(this.f3252d, this.f3259k);
            } else {
                Selection.extendDown(this.f3252d, this.f3259k);
            }
            setSelection(Selection.getSelectionStart(this.f3252d), Selection.getSelectionEnd(this.f3252d));
        }
        endBatchEdit();
        return true;
    }

    private byte[] h(InputStream inputStream, int i2) {
        int i3;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i2];
        while (true) {
            try {
                i3 = inputStream.read(bArr);
            } catch (IOException unused) {
                i3 = -1;
            }
            if (i3 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i3);
        }
    }

    @Override // io.flutter.plugin.editing.e.b
    public void a(boolean z2, boolean z3, boolean z4) {
        this.f3258j.updateSelection(this.f3249a, this.f3252d.i(), this.f3252d.h(), this.f3252d.g(), this.f3252d.f());
        ExtractedTextRequest extractedTextRequest = this.f3254f;
        if (extractedTextRequest != null) {
            this.f3258j.updateExtractedText(this.f3249a, extractedTextRequest.token, d(extractedTextRequest));
        }
        if (this.f3255g) {
            this.f3258j.updateCursorAnchorInfo(this.f3249a, c());
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f3252d.b();
        this.f3262n++;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i2) {
        return super.clearMetaKeyStates(i2);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        this.f3252d.l(this);
        while (this.f3262n > 0) {
            endBatchEdit();
            this.f3262n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    @TargetApi(25)
    public boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i2 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f3249a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                byte[] h2 = h(openInputStream, 65536);
                                HashMap hashMap = new HashMap();
                                hashMap.put("mimeType", mimeType);
                                hashMap.put("data", h2);
                                hashMap.put("uri", contentUri.toString());
                                this.f3251c.b(this.f3250b, hashMap);
                                inputContentInfo.releasePermission();
                                return true;
                            }
                        } catch (FileNotFoundException unused) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i2) {
        return super.commitText(charSequence, i2);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i2, int i3) {
        if (this.f3252d.i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i2, i3);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        return super.deleteSurroundingTextInCodePoints(i2, i3);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f3262n--;
        this.f3252d.d();
        return endBatchEdit;
    }

    public boolean f(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return e(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return e(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return g(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return g(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.f3253e;
                if ((131072 & editorInfo.inputType) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = Selection.getSelectionStart(this.f3252d);
            int selectionEnd = Selection.getSelectionEnd(this.f3252d);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                beginBatchEdit();
                if (min != max) {
                    this.f3252d.delete(min, max);
                }
                this.f3252d.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                int i2 = min + 1;
                setSelection(i2, i2);
                endBatchEdit();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public Editable getEditable() {
        return this.f3252d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        boolean z2 = (i2 & 1) != 0;
        if (z2 == (this.f3254f == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled text monitoring ");
            sb.append(z2 ? "on" : "off");
            n0.b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f3254f = z2 ? extractedTextRequest : null;
        return d(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i2) {
        beginBatchEdit();
        boolean b3 = b(i2);
        endBatchEdit();
        return b3;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i2) {
        if (i2 == 0) {
            this.f3251c.p(this.f3250b);
        } else if (i2 == 1) {
            this.f3251c.g(this.f3250b);
        } else if (i2 == 2) {
            this.f3251c.f(this.f3250b);
        } else if (i2 == 3) {
            this.f3251c.m(this.f3250b);
        } else if (i2 == 4) {
            this.f3251c.n(this.f3250b);
        } else if (i2 == 5) {
            this.f3251c.h(this.f3250b);
        } else if (i2 != 7) {
            this.f3251c.e(this.f3250b);
        } else {
            this.f3251c.k(this.f3250b);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.f3251c.j(this.f3250b, str, bundle);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i2) {
        if ((i2 & 1) != 0) {
            this.f3258j.updateCursorAnchorInfo(this.f3249a, c());
        }
        boolean z2 = (i2 & 2) != 0;
        if (z2 != this.f3255g) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled cursor monitoring ");
            sb.append(z2 ? "on" : "off");
            n0.b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f3255g = z2;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f3261m.b(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i2, int i3) {
        return super.setComposingRegion(i2, i3);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i2) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i2) : super.setComposingText(charSequence, i2);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int i2, int i3) {
        beginBatchEdit();
        boolean selection = super.setSelection(i2, i3);
        endBatchEdit();
        return selection;
    }
}
