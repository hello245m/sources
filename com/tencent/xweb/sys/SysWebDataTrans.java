package com.tencent.xweb.sys;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import com.tencent.xweb.HttpAuthHandler;
import com.tencent.xweb.JsPromptResult;
import com.tencent.xweb.JsResult;
import com.tencent.xweb.SslErrorHandler;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebReqBundleCreator;
import com.tencent.xweb.WebResourceError;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class SysWebDataTrans {
    public static final String TAG = "SysWebDataTrans";

    /* renamed from: com.tencent.xweb.sys.SysWebDataTrans$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 extends WebResourceError {
        public final /* synthetic */ android.webkit.WebResourceError val$error;

        public AnonymousClass1(android.webkit.WebResourceError webResourceError) {
        }

        @Override // com.tencent.xweb.WebResourceError
        public CharSequence getDescription() {
        }

        @Override // com.tencent.xweb.WebResourceError
        public int getErrorCode() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class SslErrorHandlerImp implements SslErrorHandler {
        public android.webkit.SslErrorHandler mHandler;

        public SslErrorHandlerImp(android.webkit.SslErrorHandler sslErrorHandler) {
        }

        @Override // com.tencent.xweb.SslErrorHandler
        public void cancel() {
        }

        @Override // com.tencent.xweb.SslErrorHandler
        public void proceed() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class SysHttpAuthHandler implements HttpAuthHandler {
        public android.webkit.HttpAuthHandler mHandler;

        public SysHttpAuthHandler(android.webkit.HttpAuthHandler httpAuthHandler) {
        }

        @Override // com.tencent.xweb.HttpAuthHandler
        public void cancel() {
        }

        @Override // com.tencent.xweb.HttpAuthHandler
        public void proceed(String str, String str2) {
        }

        @Override // com.tencent.xweb.HttpAuthHandler
        public boolean useHttpAuthUsernamePassword() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class SysWebFileChooserParamsImpl extends WebChromeClient.FileChooserParams {
        public WebChromeClient.FileChooserParams mParams;

        public SysWebFileChooserParamsImpl(WebChromeClient.FileChooserParams fileChooserParams) {
        }

        @Override // com.tencent.xweb.WebChromeClient.FileChooserParams
        @TargetApi(21)
        public Intent createIntent() {
        }

        @Override // com.tencent.xweb.WebChromeClient.FileChooserParams
        @TargetApi(21)
        public String[] getAcceptTypes() {
        }

        @Override // com.tencent.xweb.WebChromeClient.FileChooserParams
        @TargetApi(21)
        public String getFilenameHint() {
        }

        @Override // com.tencent.xweb.WebChromeClient.FileChooserParams
        @TargetApi(21)
        public int getMode() {
        }

        @Override // com.tencent.xweb.WebChromeClient.FileChooserParams
        @TargetApi(21)
        public CharSequence getTitle() {
        }

        @Override // com.tencent.xweb.WebChromeClient.FileChooserParams
        @TargetApi(21)
        public boolean isCaptureEnabled() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class SysWebJsResultImpl extends JsResult {
        public android.webkit.JsResult mJsResult;

        public SysWebJsResultImpl(android.webkit.JsResult jsResult) {
        }

        @Override // com.tencent.xweb.JsResult
        public void cancel() {
        }

        @Override // com.tencent.xweb.JsResult
        public void confirm() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class WebResourceRequestImpl implements WebResourceRequest {
        public boolean hasUserGesture;
        public boolean isMainFrame;
        public boolean isRedirect;
        public WebReqBundleCreator mBundleCreator;
        public String method;
        public Map<String, String> requestHeaders;
        public Uri url;

        public WebResourceRequestImpl(android.webkit.WebResourceRequest webResourceRequest) {
        }

        public Bundle getBundle() {
        }

        @Override // com.tencent.xweb.WebResourceRequest
        public String getMethod() {
        }

        @Override // com.tencent.xweb.WebResourceRequest
        public Map<String, String> getRequestHeaders() {
        }

        @Override // com.tencent.xweb.WebResourceRequest
        public Uri getUrl() {
        }

        @Override // com.tencent.xweb.WebResourceRequest
        public boolean hasGesture() {
        }

        @Override // com.tencent.xweb.WebResourceRequest
        public boolean isForMainFrame() {
        }

        @Override // com.tencent.xweb.WebResourceRequest
        @TargetApi(24)
        public boolean isRedirect() {
        }
    }

    public static WebResourceError createWCWebResourceError(android.webkit.WebResourceError webResourceError) {
    }

    public static WebResourceResponse createWCWebResponse(android.webkit.WebResourceResponse webResourceResponse) {
    }

    public static android.webkit.WebResourceResponse createWebKitResponse(WebResourceResponse webResourceResponse) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class SysWebJsPromptResultImpl extends JsPromptResult {
        public android.webkit.JsPromptResult mJsResult;

        public SysWebJsPromptResultImpl(android.webkit.JsPromptResult jsPromptResult) {
        }

        @Override // com.tencent.xweb.JsResult
        public void cancel() {
        }

        @Override // com.tencent.xweb.JsPromptResult
        public void confirm(String str) {
        }

        @Override // com.tencent.xweb.JsResult
        public void confirm() {
        }
    }
}
