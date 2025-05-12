package k.i.h.b.l0.j;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import com.tencent.xweb.HttpAuthHandler;
import com.tencent.xweb.SslErrorHandler;
import com.tencent.xweb.WebResourceError;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import n.d0.c.l;
import n.d0.c.q;
import n.d0.d.h;
import n.u;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class g extends WebViewClient {
    public l<? super String, u> a;
    public q<? super Integer, ? super String, ? super String, u> b;
    public l<? super String, u> c;
    public WebViewClient d;

    public /* synthetic */ g(l lVar, q qVar, l lVar2, WebViewClient webViewClient, int i2, h hVar) {
    }

    public final void b(WebViewClient webViewClient) {
    }

    @Override // com.tencent.xweb.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
    }

    @Override // com.tencent.xweb.WebViewClient
    public void onLoadResource(WebView webView, String str) {
    }

    @Override // com.tencent.xweb.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
    }

    @Override // com.tencent.xweb.WebViewClient
    public void onPageFinished(WebView webView, String str) {
    }

    @Override // com.tencent.xweb.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
    }

    @Override // com.tencent.xweb.WebViewClient
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
    }

    @Override // com.tencent.xweb.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
    }

    @Override // com.tencent.xweb.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // com.tencent.xweb.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // com.tencent.xweb.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f2) {
    }

    @Override // com.tencent.xweb.WebViewClient
    public boolean shouldInterceptLoadError(WebView webView, int i2, String str, String str2) {
    }

    @Override // com.tencent.xweb.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
    }

    @Override // com.tencent.xweb.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
    }

    public g(l<? super String, u> lVar, q<? super Integer, ? super String, ? super String, u> qVar, l<? super String, u> lVar2, WebViewClient webViewClient) {
    }

    @Override // com.tencent.xweb.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
    }

    @Override // com.tencent.xweb.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
    }

    @Override // com.tencent.xweb.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
    }

    @Override // com.tencent.xweb.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest, Bundle bundle) {
    }
}
