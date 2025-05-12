package com.tencent.xweb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.print.PrintDocumentAdapter;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.textclassifier.TextClassifier;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import com.tencent.xweb.debug.IDebugView;
import com.tencent.xweb.internal.ICookieManager;
import com.tencent.xweb.internal.IWebView;
import com.tencent.xweb.internal.ProxyWebViewClientExtension;
import com.tencent.xweb.report.KVReportForWebView;
import com.tencent.xweb.report.KVReportForWebViewCore;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class WebView extends FrameLayout implements IWebView {
    public static WebViewKind g;
    public static String h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f2015i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f2016j;

    /* renamed from: k, reason: collision with root package name */
    public static final KVReportForWebViewCore f2017k = null;
    public static final WebViewKind sDefaultWebViewKind = null;
    public WebViewKind a;
    public IWebView b;
    public IDebugView c;
    public View.OnLongClickListener d;
    public boolean e;
    public final KVReportForWebView f;

    /* renamed from: com.tencent.xweb.WebView$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements View.OnLongClickListener {
        public final /* synthetic */ WebView a;

        public AnonymousClass1(WebView webView) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class FullscreenVideoKind {
        public static final FullscreenVideoKind HOOK_EVALUTE_JS = null;
        public static final FullscreenVideoKind HOOK_NOT_EVALUTE_JS = null;
        public static final FullscreenVideoKind NOT_HOOK = null;
        public static final /* synthetic */ FullscreenVideoKind[] a = null;

        public FullscreenVideoKind(String str, int i2) {
        }

        public static FullscreenVideoKind valueOf(String str) {
        }

        public static FullscreenVideoKind[] values() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class HitTestResult {

        @Deprecated
        public static final int ANCHOR_TYPE = 1;
        public static final int EDIT_TEXT_TYPE = 9;
        public static final int EMAIL_TYPE = 4;
        public static final int GEO_TYPE = 3;

        @Deprecated
        public static final int IMAGE_ANCHOR_TYPE = 6;
        public static final int IMAGE_TYPE = 5;
        public static final int PHONE_TYPE = 2;
        public static final int SRC_ANCHOR_TYPE = 7;
        public static final int SRC_IMAGE_ANCHOR_TYPE = 8;
        public static final int UNKNOWN_TYPE = 0;
        public int a;
        public String b;

        public String getExtra() {
        }

        public int getType() {
        }

        public void setExtra(String str) {
        }

        public void setType(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface PreInitCallback {
        void onCoreInitFailed();

        void onCoreInitFinished();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static abstract class VisualStateCallback {
        public abstract void onComplete(long j2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class WebViewKind {
        public static final WebViewKind WV_KIND_CW = null;
        public static final WebViewKind WV_KIND_NONE = null;
        public static final WebViewKind WV_KIND_PINUS = null;
        public static final WebViewKind WV_KIND_SYS = null;
        public static final WebViewKind WV_KIND_X5 = null;
        public static final /* synthetic */ WebViewKind[] a = null;

        public WebViewKind(String str, int i2) {
        }

        public static WebViewKind valueOf(String str) {
        }

        public static WebViewKind[] values() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class WebViewTransport {
        public WebView a;

        public WebViewTransport(WebView webView) {
        }

        public synchronized WebView getWebView() {
        }

        public synchronized void setWebView(WebView webView) {
        }
    }

    public WebView(Context context) throws CreateWebViewException {
    }

    public static /* synthetic */ View.OnLongClickListener a(WebView webView) {
    }

    public static void c() {
    }

    public static void clearClientCertPreferences(Runnable runnable) {
    }

    public static void d() {
    }

    public static String findAddress(String str) {
    }

    public static WebViewKind getCurrentModuleWebCoreType() {
    }

    public static String getModuleName() {
    }

    public static WebViewKind getPreferedWebviewType(WebViewKind webViewKind, String str) {
    }

    public static WebViewKind[] getWebViewKindList() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean hasInited() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static synchronized void initWebviewCore(Context context, WebViewKind webViewKind, String str, PreInitCallback preInitCallback) {
    }

    public static boolean isPinus() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean isSys() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean isXWeb() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean isXWebCoreInited() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean needRebootProcess() {
    }

    public static void onXWebCoreInited() {
    }

    public static void reinitToXWeb() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public int addDocumentStartJavaScript(String str, String[] strArr) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void addJavascriptInterface(Object obj, String str) {
    }

    public final String b() {
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

    @Deprecated
    public boolean canZoomIn() {
    }

    @Deprecated
    public boolean canZoomOut() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void captureBitmap(IWebView.ICaptureBitmapCallback iCaptureBitmapCallback) {
    }

    @Deprecated
    public Picture capturePicture() {
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

    @Deprecated
    public PrintDocumentAdapter createPrintDocumentAdapter() {
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

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void documentHasImages(Message message) {
    }

    public void drawCanvas(Canvas canvas) {
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void enablePlatformNotifications() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
    }

    @Deprecated
    public int findAll(String str) {
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

    public Bitmap getBitmap() {
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

    public WebViewKind getCurrentInstanceWebCoreType() {
    }

    public IDebugView getDebugView() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public Bitmap getFavicon() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public FullscreenVideoKind getFullscreenVideoKind() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public HitTestResult getHitTestResult() {
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
    public WebChromeClient getWebChromeClient() {
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
    public WebViewClient getWebViewClient() {
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

    @Keep
    public boolean isSysKernel() {
    }

    @Keep
    @Deprecated
    public boolean isXWalkKernel() {
    }

    public boolean isXWebKernel() {
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
    public void loadUrl(String str, Map<String, String> map) {
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

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
    }

    public void onWebViewScrollChanged(int i2, int i3, int i4, int i5) {
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
    public void postVisualStateCallback(long j2, VisualStateCallback visualStateCallback) {
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

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
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

    @Override // android.view.View
    public void setFocusable(boolean z) {
    }

    @Override // android.view.View
    public void setFocusableInTouchMode(boolean z) {
    }

    @Override // android.view.View, com.tencent.xweb.internal.IWebView
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

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    @Deprecated
    public void setPictureListener(WebView.PictureListener pictureListener) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setTextClassifier(TextClassifier textClassifier) {
    }

    @Override // android.view.View, com.tencent.xweb.internal.IWebView
    public void setVerticalScrollBarEnabled(boolean z) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setVerticalScrollbarOverlay(boolean z) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public VideoControl setVideoJsCallback(VideoJsCallback videoJsCallback) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setWebContentsSize(int i2, int i3) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setWebViewCallbackClient(WebViewCallbackClient webViewCallbackClient) {
    }

    public void setWebViewClient(WebViewClient webViewClient) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setWebViewClientExtension(ProxyWebViewClientExtension proxyWebViewClientExtension) {
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

    public WebView(Context context, AttributeSet attributeSet) throws CreateWebViewException {
    }

    public static Context a(Context context) {
    }

    public static String b(String str) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public Bitmap captureBitmap() {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback) {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void setWebViewRenderProcessClient(WebViewRenderProcessClient webViewRenderProcessClient) {
    }

    public WebView(Context context, AttributeSet attributeSet, int i2) throws CreateWebViewException {
    }

    public WebView(Context context, AttributeSet attributeSet, int i2, WebViewKind webViewKind) throws CreateWebViewException {
    }

    public final void a(WebViewKind webViewKind) throws CreateWebViewException {
    }

    @Override // com.tencent.xweb.internal.IWebView
    public void loadUrl(String str) {
    }

    public static synchronized boolean initWebviewCore(Context context, WebViewKind webViewKind, PreInitCallback preInitCallback, boolean z) {
    }

    public final void a() {
    }

    public static WebViewKind a(String str) {
    }

    public static boolean a(Context context, WebViewKind webViewKind) {
    }

    public final List<TextureView> a(View view) {
    }
}
