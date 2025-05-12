package com.tencent.xweb.pinus;

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
import com.tencent.xweb.pinus.sdk.HttpAuthHandlerInterface;
import com.tencent.xweb.pinus.sdk.JsResultInterface;
import com.tencent.xweb.pinus.sdk.SslErrorHandlerInterface;
import com.tencent.xweb.pinus.sdk.WebResourceErrorInterface;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class PinusWebDataTrans {
    public static final String TAG = "PinusWebDataTrans";

    /* renamed from: com.tencent.xweb.pinus.PinusWebDataTrans$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 extends WebResourceError {
        public final /* synthetic */ WebResourceErrorInterface val$error;

        public AnonymousClass1(WebResourceErrorInterface webResourceErrorInterface) {
        }

        @Override // com.tencent.xweb.WebResourceError
        public CharSequence getDescription() {
        }

        @Override // com.tencent.xweb.WebResourceError
        public int getErrorCode() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class PsWebFileChooserParamsImpl extends WebChromeClient.FileChooserParams {
        public WebChromeClient.FileChooserParams mParams;

        public PsWebFileChooserParamsImpl(WebChromeClient.FileChooserParams fileChooserParams) {
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
    public static class PsWebHttpAuthHandler implements HttpAuthHandler {
        public HttpAuthHandlerInterface mHandler;

        public PsWebHttpAuthHandler(HttpAuthHandlerInterface httpAuthHandlerInterface) {
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
    public static class PsWebJsResultImpl extends JsResult {
        public JsResultInterface mJsResult;

        public PsWebJsResultImpl(JsResultInterface jsResultInterface) {
        }

        @Override // com.tencent.xweb.JsResult
        public void cancel() {
        }

        @Override // com.tencent.xweb.JsResult
        public void confirm() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class SslErrorHandlerImp implements SslErrorHandler {
        public SslErrorHandlerInterface mHandler;

        public SslErrorHandlerImp(SslErrorHandlerInterface sslErrorHandlerInterface) {
        }

        @Override // com.tencent.xweb.SslErrorHandler
        public void cancel() {
        }

        @Override // com.tencent.xweb.SslErrorHandler
        public void proceed() {
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
        public boolean isRedirect() {
        }
    }

    public static WebResourceError createPSWebResourceError(WebResourceErrorInterface webResourceErrorInterface) {
    }

    public static WebResourceResponse createWCWebResponse(android.webkit.WebResourceResponse webResourceResponse) {
    }

    public static android.webkit.WebResourceResponse createWebKitResponse(WebResourceResponse webResourceResponse) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class PsWebJsPromptResultImpl extends JsPromptResult {
        public JsResultInterface mJsResult;

        public PsWebJsPromptResultImpl(JsResultInterface jsResultInterface) {
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
