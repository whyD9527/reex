package io.flutter.plugins.urllauncher;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class WebViewActivity extends Activity {

    /* renamed from: g, reason: collision with root package name */
    WebView f3430g;

    /* renamed from: e, reason: collision with root package name */
    private final BroadcastReceiver f3428e = new a();

    /* renamed from: f, reason: collision with root package name */
    private final WebViewClient f3429f = new b();

    /* renamed from: h, reason: collision with root package name */
    private final IntentFilter f3431h = new IntentFilter("close action");

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("close action".equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    }

    class b extends WebViewClient {
        b() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    class c extends WebChromeClient {

        class a extends WebViewClient {
            a() {
            }

            @Override // android.webkit.WebViewClient
            @TargetApi(21)
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                WebViewActivity.this.f3430g.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                WebViewActivity.this.f3430g.loadUrl(str);
                return true;
            }
        }

        c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z2, boolean z3, Message message) {
            a aVar = new a();
            WebView webView2 = new WebView(WebViewActivity.this.f3430g.getContext());
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public static Intent a(Context context, String str, boolean z2, boolean z3, Bundle bundle) {
        return new Intent(context, (Class<?>) WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", z2).putExtra("enableDomStorage", z3).putExtra("com.android.browser.headers", bundle);
    }

    public static Map<String, String> b(Bundle bundle) {
        if (bundle == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f3430g = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        this.f3430g.loadUrl(stringExtra, b(intent.getBundleExtra("com.android.browser.headers")));
        this.f3430g.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f3430g.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f3430g.setWebViewClient(this.f3429f);
        this.f3430g.getSettings().setSupportMultipleWindows(true);
        this.f3430g.setWebChromeClient(new c());
        androidx.core.content.a.i(this, this.f3428e, this.f3431h, 2);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f3428e);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || !this.f3430g.canGoBack()) {
            return super.onKeyDown(i2, keyEvent);
        }
        this.f3430g.goBack();
        return true;
    }
}
