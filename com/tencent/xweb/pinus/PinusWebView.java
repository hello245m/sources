package com.tencent.xweb.pinus;

import android.annotation.SuppressLint;
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
import android.view.View;
import android.view.ViewGroup;
import android.view.textclassifier.TextClassifier;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import com.tencent.xweb.GetImageBitmapToFileFinishedCallback;
import com.tencent.xweb.RenderProcessGoneDetail;
import com.tencent.xweb.VideoControl;
import com.tencent.xweb.VideoJsCallback;
import com.tencent.xweb.WebSettings;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewCallbackClient;
import com.tencent.xweb.WebViewJSExceptionListener;
import com.tencent.xweb.WebViewRenderProcessClient;
import com.tencent.xweb.XWebKeyEventHandler;
import com.tencent.xweb.XWebTranslateLogic;
import com.tencent.xweb.XWebWebViewClientExtensionInterceptor;
import com.tencent.xweb.extension.video.VideoNativeInterface;
import com.tencent.xweb.internal.ICookieManager;
import com.tencent.xweb.internal.IWebView;
import com.tencent.xweb.internal.ProxyWebViewClientExtension;
import com.tencent.xweb.pinus.sdk.HttpAuthHandlerInterface;
import com.tencent.xweb.pinus.sdk.JsResultInterface;
import com.tencent.xweb.pinus.sdk.SslErrorHandlerInterface;
import com.tencent.xweb.pinus.sdk.WebResourceErrorInterface;
import com.tencent.xweb.pinus.sdk.WebView;
import com.tencent.xweb.pinus.sdk.WebViewClient;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class PinusWebView implements IWebView, XWebTranslateLogic.TranslateLogicCallback {
    public static final String TAG = "PinusWebView";
    public static volatile boolean sEnforceThreadChecking = false;
    public boolean bIsIn404Stage;
    public WebViewJSExceptionListener jsExceptionListener;
    public final int mApkVersion;
    public final XWebWebViewClientExtensionInterceptor mClientExtensionInterceptor;
    public WebChromeClient.CustomViewCallback mFullscreenCallback;
    public boolean mIsClampedY;
    public boolean mIsFullscreen;
    public boolean mIsMediaPlaybackRequiresUserGesture;
    public boolean mIsVideoPlaybackRequiresUserGesture;
    public long mLoadStartTimestamp;
    public final ProxyWebViewClientExtension mPinusProxyWebViewClientExtension;
    public final PinusWebViewSettings mPinusWebViewSettings;
    public int mReferType;
    public final AbsoluteLayout mTopView;
    public final XWebTranslateLogic mTranslateLogic;
    public final com.tencent.xweb.pinus.sdk.WebChromeClient mWebChromeClient;
    public final CustomPsWeb mWebView;
    public WebViewCallbackClient mWebViewCallbackClient;
    public com.tencent.xweb.WebChromeClient mWebViewChromeClientEx;
    public final WebViewClient mWebViewClient;
    public com.tencent.xweb.WebViewClient mWebViewClientEx;
    public ProxyWebViewClientExtension mWebViewClientExtension;
    public final Looper mWebViewThread;
    public final WebView mWebviewWraper;
    public VideoNativeInterface mXWebNativeInterface;

    /* renamed from: com.tencent.xweb.pinus.PinusWebView$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements WebView.ScrollChangedListener {
        public final /* synthetic */ PinusWebView this$0;

        public AnonymousClass1(PinusWebView pinusWebView) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebView.ScrollChangedListener
        public void onScrollChanged(int i2, int i3, int i4, int i5) {
        }
    }

    /* renamed from: com.tencent.xweb.pinus.PinusWebView$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass2 implements WebView.OverScrolledListener {
        public final /* synthetic */ PinusWebView this$0;

        public AnonymousClass2(PinusWebView pinusWebView) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebView.OverScrolledListener
        public void onOverScrolled(boolean z) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebView.OverScrolledListener
        public boolean overScrollBy(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, View view) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebView.OverScrolledListener
        public void onOverScrolled(int i2, int i3, boolean z, boolean z2, View view) {
        }
    }

    /* renamed from: com.tencent.xweb.pinus.PinusWebView$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass3 implements VideoControl {
        public final /* synthetic */ PinusWebView this$0;

        public AnonymousClass3(PinusWebView pinusWebView) {
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

    /* renamed from: com.tencent.xweb.pinus.PinusWebView$6, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass6 extends ProxyWebViewClientExtension {
        public final /* synthetic */ PinusWebView this$0;

        public AnonymousClass6(PinusWebView pinusWebView) {
        }

        @Override // com.tencent.xweb.internal.ProxyWebViewClientExtension
        public Object onMiscCallBack(String str, Bundle bundle) {
        }
    }

    /* renamed from: com.tencent.xweb.pinus.PinusWebView$7, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass7 implements Runnable {
        public final /* synthetic */ PinusWebView this$0;
        public final /* synthetic */ IWebView.ICaptureBitmapCallback val$callback;
        public final /* synthetic */ View val$view;

        public AnonymousClass7(PinusWebView pinusWebView, View view, IWebView.ICaptureBitmapCallback iCaptureBitmapCallback) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public PinusWebView(com.tencent.xweb.WebView webView) {
    }

    public static /* synthetic */ com.tencent.xweb.WebView access$000(PinusWebView pinusWebView) {
    }

    public static /* synthetic */ AbsoluteLayout access$100(PinusWebView pinusWebView) {
    }

    public static /* synthetic */ boolean access$1000(PinusWebView pinusWebView) {
    }

    public static /* synthetic */ boolean access$1002(PinusWebView pinusWebView, boolean z) {
    }

    public static /* synthetic */ WebViewJSExceptionListener access$1100(PinusWebView pinusWebView) {
    }

    public static /* synthetic */ XWebTranslateLogic access$1200(PinusWebView pinusWebView) {
    }

    public static /* synthetic */ com.tencent.xweb.WebViewClient access$1300(PinusWebView pinusWebView) {
    }

    public static /* synthetic */ int access$1400(PinusWebView pinusWebView) {
    }

    public static /* synthetic */ int access$1402(PinusWebView pinusWebView, int i2) {
    }

    public static /* synthetic */ long access$1500(PinusWebView pinusWebView) {
    }

    public static /* synthetic */ long access$1502(PinusWebView pinusWebView, long j2) {
    }

    public static /* synthetic */ boolean access$1602(PinusWebView pinusWebView, boolean z) {
    }

    public static /* synthetic */ XWebWebViewClientExtensionInterceptor access$1700(PinusWebView pinusWebView) {
    }

    public static /* synthetic */ ProxyWebViewClientExtension access$1800(PinusWebView pinusWebView) {
    }

    public static /* synthetic */ WebViewCallbackClient access$200(PinusWebView pinusWebView) {
    }

    public static /* synthetic */ CustomPsWeb access$300(PinusWebView pinusWebView) {
    }

    public static /* synthetic */ boolean access$402(PinusWebView pinusWebView, boolean z) {
    }

    public static /* synthetic */ VideoNativeInterface access$500(PinusWebView pinusWebView) {
    }

    public static /* synthetic */ com.tencent.xweb.WebChromeClient access$600(PinusWebView pinusWebView) {
    }

    public static /* synthetic */ WebChromeClient.CustomViewCallback access$702(PinusWebView pinusWebView, WebChromeClient.CustomViewCallback customViewCallback) {
    }

    public static /* synthetic */ boolean access$800(PinusWebView pinusWebView) {
    }

    public static /* synthetic */ boolean access$802(PinusWebView pinusWebView, boolean z) {
    }

    public static /* synthetic */ boolean access$900(PinusWebView pinusWebView) {
    }

    public static /* synthetic */ boolean access$902(PinusWebView pinusWebView, boolean z) {
    }

    private void checkThread() {
    }

    public static void clearClientCertPreferences(Runnable runnable) {
    }

    public static String findAddress(String str) {
    }

    private void initFullscreenVideo(Context context) {
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
    public void captureBitmap(IWebView.ICaptureBitmapCallback iCaptureBitmapCallback) {
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

    public Object getBridge() {
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

    public boolean isClampedY() {
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

    @Override // com.tencent.xweb.XWebTranslateLogic.TranslateLogicCallback
    public void onTranslateFinish() {
    }

    @Override // com.tencent.xweb.XWebTranslateLogic.TranslateLogicCallback
    public void onTranslateMiscCallBack(String str, Bundle bundle) {
    }

    @Override // com.tencent.xweb.XWebTranslateLogic.TranslateLogicCallback
    public void onTranslateStart() {
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

    @Override // com.tencent.xweb.XWebTranslateLogic.TranslateLogicCallback
    public void replaceTranslatedString(Map<String, String> map) {
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
    public class CustomPsWeb extends com.tencent.xweb.pinus.sdk.WebView {
        public final /* synthetic */ PinusWebView this$0;

        public CustomPsWeb(PinusWebView pinusWebView, Context context) {
        }

        @Override // android.view.View
        public void onScrollChanged(int i2, int i3, int i4, int i5) {
        }

        public CustomPsWeb(PinusWebView pinusWebView, Context context, AttributeSet attributeSet) {
        }
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback) {
    }

    /* renamed from: com.tencent.xweb.pinus.PinusWebView$4, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass4 extends com.tencent.xweb.pinus.sdk.WebChromeClient {
        public final /* synthetic */ PinusWebView this$0;

        public AnonymousClass4(PinusWebView pinusWebView) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public View getVideoLoadingProgressView() {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public boolean onCreateWindow(com.tencent.xweb.pinus.sdk.WebView webView, boolean z, boolean z2, Message message) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public void onExitFullscreenVideo(Bitmap bitmap) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public void onGeolocationPermissionsHidePrompt() {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public void onGetSampleString(com.tencent.xweb.pinus.sdk.WebView webView, Map<String, String> map) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public void onGetTranslateString(com.tencent.xweb.pinus.sdk.WebView webView, Map<String, String> map) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public void onHideCustomView() {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public boolean onJsAlert(com.tencent.xweb.pinus.sdk.WebView webView, String str, String str2, JsResultInterface jsResultInterface) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public boolean onJsAlertInner(com.tencent.xweb.pinus.sdk.WebView webView, String str, String str2, Object obj) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public boolean onJsConfirm(com.tencent.xweb.pinus.sdk.WebView webView, String str, String str2, JsResultInterface jsResultInterface) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public boolean onJsConfirmInner(com.tencent.xweb.pinus.sdk.WebView webView, String str, String str2, Object obj) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public boolean onJsPrompt(com.tencent.xweb.pinus.sdk.WebView webView, String str, String str2, String str3, JsResultInterface jsResultInterface) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public boolean onJsPromptInner(com.tencent.xweb.pinus.sdk.WebView webView, String str, String str2, String str3, Object obj) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public void onProgressChanged(com.tencent.xweb.pinus.sdk.WebView webView, int i2) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public void onReceivedTitle(com.tencent.xweb.pinus.sdk.WebView webView, String str) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public void onRequestFocus(com.tencent.xweb.pinus.sdk.WebView webView) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
        public boolean onShowFileChooser(com.tencent.xweb.pinus.sdk.WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback) {
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        }
    }

    @Override // com.tencent.xweb.internal.IWebView
    public Bitmap captureBitmap() {
    }

    /* renamed from: com.tencent.xweb.pinus.PinusWebView$5, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass5 extends WebViewClient {
        public String mPreUrl;
        public String mSessionId;
        public String mStrLastFinishedUrl;
        public final /* synthetic */ PinusWebView this$0;

        /* renamed from: com.tencent.xweb.pinus.PinusWebView$5$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class AnonymousClass1 extends RenderProcessGoneDetail {
            public final /* synthetic */ AnonymousClass5 this$1;
            public final /* synthetic */ RenderProcessGoneDetail val$detail;

            public AnonymousClass1(AnonymousClass5 anonymousClass5, RenderProcessGoneDetail renderProcessGoneDetail) {
            }

            @Override // com.tencent.xweb.RenderProcessGoneDetail
            public boolean didCrash() {
            }

            @Override // com.tencent.xweb.RenderProcessGoneDetail
            public int rendererPriorityAtExit() {
            }
        }

        public AnonymousClass5(PinusWebView pinusWebView) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebViewClient
        public void doUpdateVisitedHistory(com.tencent.xweb.pinus.sdk.WebView webView, String str, boolean z) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebViewClient
        public void onLoadResource(com.tencent.xweb.pinus.sdk.WebView webView, String str) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebViewClient
        public void onPageCommitVisible(com.tencent.xweb.pinus.sdk.WebView webView, String str) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebViewClient
        public void onPageFinished(com.tencent.xweb.pinus.sdk.WebView webView, String str) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebViewClient
        public void onPageStarted(com.tencent.xweb.pinus.sdk.WebView webView, String str, Bitmap bitmap) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebViewClient
        public void onReceivedError(com.tencent.xweb.pinus.sdk.WebView webView, int i2, String str, String str2) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebViewClient
        public void onReceivedHttpAuthRequest(com.tencent.xweb.pinus.sdk.WebView webView, HttpAuthHandlerInterface httpAuthHandlerInterface, String str, String str2) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebViewClient
        public void onReceivedHttpError(com.tencent.xweb.pinus.sdk.WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebViewClient
        public void onReceivedSslError(com.tencent.xweb.pinus.sdk.WebView webView, SslErrorHandlerInterface sslErrorHandlerInterface, SslError sslError) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebViewClient
        public boolean onRenderProcessGone(com.tencent.xweb.pinus.sdk.WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebViewClient
        public void onScaleChanged(com.tencent.xweb.pinus.sdk.WebView webView, float f, float f2) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebViewClient
        public WebResourceResponse shouldInterceptRequest(com.tencent.xweb.pinus.sdk.WebView webView, String str) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebViewClient
        public boolean shouldOverrideUrlLoading(com.tencent.xweb.pinus.sdk.WebView webView, String str) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebViewClient
        public WebResourceResponse shouldInterceptRequest(com.tencent.xweb.pinus.sdk.WebView webView, WebResourceRequest webResourceRequest) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebViewClient
        public boolean shouldOverrideUrlLoading(com.tencent.xweb.pinus.sdk.WebView webView, WebResourceRequest webResourceRequest) {
        }

        @Override // com.tencent.xweb.pinus.sdk.WebViewClient
        public void onReceivedError(com.tencent.xweb.pinus.sdk.WebView webView, WebResourceRequest webResourceRequest, WebResourceErrorInterface webResourceErrorInterface) {
        }
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void loadUrl(String str, Map<String, String> map) {
    }
}
