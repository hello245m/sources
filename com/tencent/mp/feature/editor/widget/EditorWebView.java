package com.tencent.mp.feature.editor.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.EditText;
import com.tencent.mp.feature.webview.offline.OfflinePackageWebView;
import com.tencent.xweb.JsPromptResult;
import com.tencent.xweb.JsResult;
import com.tencent.xweb.SslErrorHandler;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class EditorWebView extends OfflinePackageWebView {

    /* renamed from: s, reason: collision with root package name */
    public a f1496s;

    /* renamed from: t, reason: collision with root package name */
    public Bitmap f1497t;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface a {
        void a(int i2, int i3, int i4, int i5);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends WebChromeClient {
        public static /* synthetic */ void a(JsResult jsResult, DialogInterface dialogInterface, int i2) {
        }

        public static /* synthetic */ void b(JsPromptResult jsPromptResult, DialogInterface dialogInterface, int i2) {
        }

        public static /* synthetic */ void c(JsResult jsResult, DialogInterface dialogInterface, int i2) {
        }

        public static /* synthetic */ void d(JsPromptResult jsPromptResult, EditText editText, DialogInterface dialogInterface, int i2) {
        }

        public static /* synthetic */ void e(DialogInterface dialogInterface, int i2) {
        }

        public static final void f(DialogInterface dialogInterface, int i2) {
        }

        public static final void g(JsResult jsResult, DialogInterface dialogInterface, int i2) {
        }

        public static final void h(JsResult jsResult, DialogInterface dialogInterface, int i2) {
        }

        public static final void i(JsPromptResult jsPromptResult, EditText editText, DialogInterface dialogInterface, int i2) {
        }

        public static final void j(JsPromptResult jsPromptResult, DialogInterface dialogInterface, int i2) {
        }

        @Override // com.tencent.xweb.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        }

        @Override // com.tencent.xweb.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        }

        @Override // com.tencent.xweb.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        }
    }

    public EditorWebView(Context context, AttributeSet attributeSet) {
    }

    public static final /* synthetic */ Bitmap u(EditorWebView editorWebView) {
    }

    public static final /* synthetic */ Bitmap v(EditorWebView editorWebView) {
    }

    public static final /* synthetic */ void w(EditorWebView editorWebView, Bitmap bitmap) {
    }

    public final a getOnWebViewScrollChangedListener() {
    }

    @Override // com.tencent.mp.feature.webview.offline.OfflinePackageWebView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // com.tencent.xweb.WebView
    public void onWebViewScrollChanged(int i2, int i3, int i4, int i5) {
    }

    public final void setOnWebViewScrollChangedListener(a aVar) {
    }

    public final Bitmap x() {
    }

    public final void y() {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends WebViewClient {
        public final /* synthetic */ EditorWebView a;

        public b(EditorWebView editorWebView) {
        }

        public final WebResourceResponse b(Uri uri) {
        }

        @Override // com.tencent.xweb.WebViewClient
        public void onLoadResource(WebView webView, String str) {
        }

        @Override // com.tencent.xweb.WebViewClient
        public void onPageFinished(WebView webView, String str) {
        }

        @Override // com.tencent.xweb.WebViewClient
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
        }

        @Override // com.tencent.xweb.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        @Override // com.tencent.xweb.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        @Override // com.tencent.xweb.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        }

        @Override // com.tencent.xweb.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        }

        @Override // com.tencent.xweb.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        }

        @Override // com.tencent.xweb.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest, Bundle bundle) {
        }
    }
}
