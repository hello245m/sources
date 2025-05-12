package com.tencent.xweb.pinus.sdk;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.tencent.xweb.RenderProcessGoneDetail;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class WebViewClient {
    public static final int ERROR_AUTHENTICATION = -4;
    public static final int ERROR_BAD_URL = -12;
    public static final int ERROR_CONNECT = -6;
    public static final int ERROR_FAILED_SSL_HANDSHAKE = -11;
    public static final int ERROR_FILE = -13;
    public static final int ERROR_FILE_NOT_FOUND = -14;
    public static final int ERROR_HOST_LOOKUP = -2;
    public static final int ERROR_IO = -7;
    public static final int ERROR_PROXY_AUTHENTICATION = -5;
    public static final int ERROR_REDIRECT_LOOP = -9;
    public static final int ERROR_TIMEOUT = -8;
    public static final int ERROR_TOO_MANY_REQUESTS = -15;
    public static final int ERROR_UNKNOWN = -1;
    public static final int ERROR_UNSAFE_RESOURCE = -16;
    public static final int ERROR_UNSUPPORTED_AUTH_SCHEME = -3;
    public static final int ERROR_UNSUPPORTED_SCHEME = -10;
    public static final int SAFE_BROWSING_THREAT_BILLING = 4;
    public static final int SAFE_BROWSING_THREAT_MALWARE = 1;
    public static final int SAFE_BROWSING_THREAT_PHISHING = 2;
    public static final int SAFE_BROWSING_THREAT_UNKNOWN = 0;
    public static final int SAFE_BROWSING_THREAT_UNWANTED_SOFTWARE = 3;

    /* renamed from: com.tencent.xweb.pinus.sdk.WebViewClient$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 extends RenderProcessGoneDetail {
        public final /* synthetic */ WebViewClient this$0;
        public final /* synthetic */ boolean val$didCrash;
        public final /* synthetic */ int val$rendererPriorityAtExit;

        public AnonymousClass1(WebViewClient webViewClient, boolean z, int i2) {
        }

        @Override // com.tencent.xweb.RenderProcessGoneDetail
        public boolean didCrash() {
        }

        @Override // com.tencent.xweb.RenderProcessGoneDetail
        public int rendererPriorityAtExit() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public @interface SafeBrowsingThreat {
    }

    private void onReceivedError2(WebView webView, WebResourceRequest webResourceRequest, Object obj) {
    }

    private void onReceivedHttpAuthRequestInner(WebView webView, Object obj, String str, String str2) {
    }

    private void onReceivedSslErrorInner(WebView webView, Object obj, SslError sslError) {
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
    }

    public void onLoadResource(WebView webView, String str) {
    }

    public void onPageCommitVisible(WebView webView, String str) {
    }

    public void onPageFinished(WebView webView, String str) {
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
    }

    public void onReceivedError(WebView webView, int i2, String str, String str2) {
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceErrorInterface webResourceErrorInterface) {
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandlerInterface httpAuthHandlerInterface, String str, String str2) {
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
    }

    public void onReceivedSslError(WebView webView, SslErrorHandlerInterface sslErrorHandlerInterface, SslError sslError) {
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
    }

    public boolean onRenderProcessGoneInner(WebView webView, boolean z, int i2) {
    }

    public void onScaleChanged(WebView webView, float f, float f2) {
    }

    @Deprecated
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
    }

    public void onUnhandledInputEvent(WebView webView, InputEvent inputEvent) {
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
    }

    @Deprecated
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
    }
}
