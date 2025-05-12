package com.tencent.xweb.sys;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.print.PrintDocumentAdapter;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.textclassifier.TextClassifier;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JavascriptInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tencent.xweb.GetImageBitmapToFileFinishedCallback;
import com.tencent.xweb.VideoControl;
import com.tencent.xweb.VideoJsCallback;
import com.tencent.xweb.WebSettings;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewCallbackClient;
import com.tencent.xweb.WebViewJSExceptionListener;
import com.tencent.xweb.WebViewRenderProcessClient;
import com.tencent.xweb.XWebKeyEventHandler;
import com.tencent.xweb.extension.video.VideoNativeInterface;
import com.tencent.xweb.internal.ICookieManager;
import com.tencent.xweb.internal.IWebView;
import com.tencent.xweb.internal.ProxyWebViewClientExtension;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class SysWebView implements IWebView {
    public static final String TAG = "SysWebView";
    public static volatile boolean sEnforceThreadChecking = false;
    public int mContentHeight;
    public WebChromeClient.CustomViewCallback mFullscreenCallback;
    public boolean mIsFullscreen;
    public long mLoadStartTimestamp;
    public int mReferType;
    public SysWebViewSettings mSysWebViewSettings;
    public ValueCallBackWrapper mValueCallBackWrapper;
    public final WebChromeClient mWebChromeClient;
    public final CustomSysWeb mWebView;
    public WebViewCallbackClient mWebViewCallbackClient;
    public com.tencent.xweb.WebChromeClient mWebViewChromeClientEx;
    public final WebViewClient mWebViewClient;
    public com.tencent.xweb.WebViewClient mWebViewClientEx;
    public final Looper mWebViewThread;
    public final WebView mWebviewWraper;
    public VideoNativeInterface mXWebNativeInterface;
    public final String strCallBackName;

    /* renamed from: com.tencent.xweb.sys.SysWebView$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements VideoControl {
        public final /* synthetic */ SysWebView this$0;

        public AnonymousClass1(SysWebView sysWebView) {
        }

        @Override // com.tencent.xweb.VideoControl
        public boolean supportSetRequestedOrientationCallback() {
        }

        @Override // com.tencent.xweb.VideoControl
        public void videoChangeStatus() {
        }

        @Override // com.tencent.xweb.VideoControl
        public void videoExitFullscreen() {
        }

        @Override // com.tencent.xweb.VideoControl
        public void videoMute(boolean z) {
        }

        @Override // com.tencent.xweb.VideoControl
        public void videoPause() {
        }

        @Override // com.tencent.xweb.VideoControl
        public void videoPlay() {
        }

        @Override // com.tencent.xweb.VideoControl
        public void videoPlaybackRate(double d) {
        }

        @Override // com.tencent.xweb.VideoControl
        public void videoSeek(double d) {
        }
    }

    /* renamed from: com.tencent.xweb.sys.SysWebView$4, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ SysWebView this$0;
        public final /* synthetic */ IWebView.ICaptureBitmapCallback val$callback;

        public AnonymousClass4(SysWebView sysWebView, IWebView.ICaptureBitmapCallback iCaptureBitmapCallback) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.xweb.sys.SysWebView$5, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass5 extends WebView.VisualStateCallback {
        public final /* synthetic */ SysWebView this$0;
        public final /* synthetic */ WebView.VisualStateCallback val$callback;

        public AnonymousClass5(SysWebView sysWebView, WebView.VisualStateCallback visualStateCallback) {
        }

        @Override // android.webkit.WebView.VisualStateCallback
        public void onComplete(long j2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class ValueCallBackWrapper {
        public HashMap<String, ValueCallback<String>> mMapIdToCallBack;
        public int mNCallBackId;

        public String addCallBack(ValueCallback<String> valueCallback) {
        }

        @JavascriptInterface
        public void notifyJava(String str, String str2) {
        }
    }

    public SysWebView(com.tencent.xweb.WebView webView) {
    }

    public static /* synthetic */ com.tencent.xweb.WebView access$000(SysWebView sysWebView) {
    }

    public static /* synthetic */ WebViewCallbackClient access$100(SysWebView sysWebView) {
    }

    public static /* synthetic */ CustomSysWeb access$1000(SysWebView sysWebView) {
    }

    public static /* synthetic */ int access$200(SysWebView sysWebView) {
    }

    public static /* synthetic */ int access$202(SysWebView sysWebView, int i2) {
    }

    public static /* synthetic */ VideoNativeInterface access$300(SysWebView sysWebView) {
    }

    public static /* synthetic */ com.tencent.xweb.WebChromeClient access$400(SysWebView sysWebView) {
    }

    public static /* synthetic */ WebChromeClient.CustomViewCallback access$502(SysWebView sysWebView, WebChromeClient.CustomViewCallback customViewCallback) {
    }

    public static /* synthetic */ boolean access$602(SysWebView sysWebView, boolean z) {
    }

    public static /* synthetic */ com.tencent.xweb.WebViewClient access$700(SysWebView sysWebView) {
    }

    public static /* synthetic */ int access$800(SysWebView sysWebView) {
    }

    public static /* synthetic */ int access$802(SysWebView sysWebView, int i2) {
    }

    public static /* synthetic */ long access$900(SysWebView sysWebView) {
    }

    public static /* synthetic */ long access$902(SysWebView sysWebView, long j2) {
    }

    private void checkThread() {
    }

    public static void clearClientCertPreferences(Runnable runnable) {
    }

    public static String findAddress(String str) {
    }

    private void initFullscreenVideo(Activity activity) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public int addDocumentStartJavaScript(String str, String[] strArr) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    @SuppressLint({"JavascriptInterface"})
    public void addJavascriptInterface(Object obj, String str) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public boolean canGoBack() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public boolean canGoBackOrForward(int i2) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public boolean canGoForward() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public Bitmap captureBitmap() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void clearCache(boolean z) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void clearHistory() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void clearMatches() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void clearSslPreferences() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void clearView() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public WebBackForwardList copyBackForwardList() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public PrintDocumentAdapter createPrintDocumentAdapter(String str) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public WebMessagePort[] createWebMessageChannel() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void destroy() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void disablePlatformNotifications() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void disableVideoJsCallback(boolean z) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void documentHasImages(Message message) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void enablePlatformNotifications() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void findAllAsync(String str) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void findNext(boolean z) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void flingScroll(int i2, int i3) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public String getAbstractInfo() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public SslCertificate getCertificate() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public int getContentHeight() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public ICookieManager getCookieManager() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public Bitmap getFavicon() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public WebView.FullscreenVideoKind getFullscreenVideoKind() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public WebView.HitTestResult getHitTestResult() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public String[] getHttpAuthUsernamePassword(String str, String str2) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public boolean getImageBitmapToFile(String str, String str2, String str3, GetImageBitmapToFileFinishedCallback getImageBitmapToFileFinishedCallback) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public String getOriginalUrl() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public int getProgress() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public float getScale() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public int getScrollHeight() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public WebSettings getSettings() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public TextClassifier getTextClassifier() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public String getTitle() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public ViewGroup getTopView() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public String getUrl() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public String getVersionInfo() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public View getView() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public int getVisibleTitleHeight() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public com.tencent.xweb.WebChromeClient getWebChromeClient() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public int getWebScrollX() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public int getWebScrollY() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public WebViewCallbackClient getWebViewCallbackClient() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public com.tencent.xweb.WebViewClient getWebViewClient() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public Looper getWebViewLooper() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public WebViewRenderProcessClient getWebViewRenderProcessClient() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public View getWebViewUI() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void goBack() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void goBackOrForward(int i2) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void goForward() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public boolean hasEnteredFullscreen() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public Bundle invokeMiscMethod(String str, Bundle bundle) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public boolean isOverScrollStart() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void leaveFullscreen() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void loadData(String str, String str2, String str3) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void loadUrl(String str) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void onHide() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void onPause() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void onResume() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void onShow() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public boolean overlayHorizontalScrollbar() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public boolean overlayVerticalScrollbar() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public boolean pageDown(boolean z) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public boolean pageUp(boolean z) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void pauseTimers() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void postUrl(String str, byte[] bArr) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void postVisualStateCallback(long j2, WebView.VisualStateCallback visualStateCallback) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void postWebMessage(WebMessage webMessage, Uri uri) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void reload() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void removeDocumentStartJavaScript(int i2) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void removeJavascriptInterface(String str) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void requestFocusNodeHref(Message message) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void requestImageRef(Message message) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public WebBackForwardList restoreState(Bundle bundle) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void resumeTimers() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public boolean savePage(String str, String str2, int i2) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public WebBackForwardList saveState(Bundle bundle) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void saveWebArchive(String str) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setBottomHeight(int i2) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setDownloadListener(DownloadListener downloadListener) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setFindListener(WebView.FindListener findListener) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setHorizontalScrollBarEnabled(boolean z) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setHorizontalScrollbarOverlay(boolean z) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setInitialScale(int i2) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setJSExceptionListener(WebViewJSExceptionListener webViewJSExceptionListener) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setNetworkAvailable(boolean z) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    @Deprecated
    public void setPictureListener(WebView.PictureListener pictureListener) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setScrollBarStyle(int i2) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setScrollbarFadingEnabled(boolean z) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setTextClassifier(TextClassifier textClassifier) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setVerticalScrollBarEnabled(boolean z) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setVerticalScrollbarOverlay(boolean z) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public VideoControl setVideoJsCallback(VideoJsCallback videoJsCallback) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setWebChromeClient(com.tencent.xweb.WebChromeClient webChromeClient) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setWebContentsSize(int i2, int i3) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setWebViewCallbackClient(WebViewCallbackClient webViewCallbackClient) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setWebViewClient(com.tencent.xweb.WebViewClient webViewClient) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setWebViewClientExtension(ProxyWebViewClientExtension proxyWebViewClientExtension) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setWebViewRenderProcessClient(WebViewRenderProcessClient webViewRenderProcessClient) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setWebViewRenderProcessClient(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setXWebKeyEventHandler(XWebKeyEventHandler xWebKeyEventHandler) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void smoothScroll(int i2, int i3, long j2) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void stopLoading() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public boolean supportFeature(int i2) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public boolean supportSetWebContentsSize() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void zoomBy(float f) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public boolean zoomIn() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public boolean zoomOut() {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class CustomSysWeb extends android.webkit.WebView {
        public final /* synthetic */ SysWebView this$0;

        public CustomSysWeb(SysWebView sysWebView, Context context) {
        }

        @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        }

        public int getScrollHeight() {
        }

        @Override // android.view.View
        public void invalidate() {
        }

        @Override // android.webkit.WebView, android.view.View
        public void onOverScrolled(int i2, int i3, boolean z, boolean z2) {
        }

        @Override // android.webkit.WebView, android.view.View
        public void onScrollChanged(int i2, int i3, int i4, int i5) {
        }

        @Override // android.view.View
        public boolean overScrollBy(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z) {
        }

        public CustomSysWeb(SysWebView sysWebView, Context context, AttributeSet attributeSet) {
        }

        public CustomSysWeb(SysWebView sysWebView, Context context, AttributeSet attributeSet, int i2) {
        }

        public CustomSysWeb(SysWebView sysWebView, Context context, AttributeSet attributeSet, int i2, boolean z) {
        }
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void loadUrl(String str, Map<String, String> map) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback) {
    }

    /* renamed from: com.tencent.xweb.sys.SysWebView$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass2 extends WebChromeClient {
        public final /* synthetic */ SysWebView this$0;

        public AnonymousClass2(SysWebView sysWebView) {
        }

        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsHidePrompt() {
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(android.webkit.WebView webView, String str, String str2, JsResult jsResult) {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(android.webkit.WebView webView, String str, String str2, JsResult jsResult) {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(android.webkit.WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(android.webkit.WebView webView, int i2) {
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(android.webkit.WebView webView, String str) {
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(android.webkit.WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback) {
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        }
    }

    /* renamed from: com.tencent.xweb.sys.SysWebView$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass3 extends WebViewClient {
        public String mPreUrl;
        public final String mSessionId;
        public final /* synthetic */ SysWebView this$0;

        public AnonymousClass3(SysWebView sysWebView) {
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(android.webkit.WebView webView, String str, boolean z) {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(android.webkit.WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public void onPageCommitVisible(android.webkit.WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(android.webkit.WebView webView, String str, Bitmap bitmap) {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(android.webkit.WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(android.webkit.WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(android.webkit.WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(android.webkit.WebView webView, float f, float f2) {
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, WebResourceRequest webResourceRequest) {
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, WebResourceRequest webResourceRequest) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, int i2, String str, String str2) {
        }
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void captureBitmap(IWebView.ICaptureBitmapCallback iCaptureBitmapCallback) {
    }
}
