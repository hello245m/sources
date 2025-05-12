package com.tencent.xweb.pinus.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Message;
import android.print.PrintDocumentAdapter;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeProvider;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import com.tencent.xweb.XWebExtendInputClient;
import com.tencent.xweb.XWebExtendInterface;
import com.tencent.xweb.XWebExtendPluginClient;
import com.tencent.xweb.XWebExtendTextAreaClient;
import com.tencent.xweb.pinus.PSCoreWrapper;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class WebView extends FrameLayout implements WebViewInterface, XWebExtendInterface {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TAG = "Pinus.WebView";
    public final ArrayList<Object> constructorParams;
    public final ArrayList<Object> constructorTypes;
    public PSCoreWrapper coreWrapper;
    public Object inner;
    public OverScrolledListener mOverScrolledListener;
    public ScrollChangedListener mScrollChangedListener;
    public WebViewInterface reflectInterface;
    public WebSettingsInterface webSettings;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface OverScrolledListener {
        void onOverScrolled(int i2, int i3, boolean z, boolean z2, View view);

        void onOverScrolled(boolean z);

        boolean overScrollBy(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, View view);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface ScrollChangedListener {
        void onScrollChanged(int i2, int i3, int i4, int i5);
    }

    public WebView(Context context) {
    }

    private void init() {
    }

    @Keep
    private boolean performLongClickDelegate() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public int addDocumentStartJavaScript(String str, String[] strArr) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void addJavascriptInterface(Object obj, String str) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean canGoBack() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean canGoBackOrForward(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean canGoForward() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void clearCache(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void clearFormData() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void clearHistory() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void clearMatches() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void clearSslPreferences() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void clearView() {
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public WebBackForwardList copyBackForwardList() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public PrintDocumentAdapter createPrintDocumentAdapter(String str) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void destroy() {
    }

    @Override // android.view.ViewGroup, android.view.View, com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void documentHasImages(Message message) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void findAllAsync(String str) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void findNext(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void flingScroll(int i2, int i3) {
    }

    @Override // android.view.View, com.tencent.xweb.pinus.sdk.WebViewInterface
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
    }

    public Object getBridge() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public SslCertificate getCertificate() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public int getContentHeight() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public ViewGroup getContentView() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public Bitmap getFavicon() {
    }

    public HitTestResultInterface getHitTestResult() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public Object getHitTestResultInner() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean getImageBitmapToFile(String str, String str2, String str3, Object obj) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public String getOriginalUrl() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public int getProgress() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public float getScale() {
    }

    public WebSettingsInterface getSettings() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public Object getSettingsInner() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public String getTitle() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void getTranslateSampleString(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public String getUrl() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void goBack() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void goBackOrForward(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void goForward() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void invokeZoomPicker() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean isPrivateBrowsingEnabled() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void loadData(String str, String str2, String str3) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void loadUrl(String str) {
    }

    @Override // android.view.View, com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean onCheckIsTextEditor() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void onExtendInputKeyboardHeightChanged(boolean z, int i2, boolean z2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void onExtendTextAreaKeyboardHeightChanged(boolean z, int i2, boolean z2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void onHide() {
    }

    @Keep
    public void onOverScrolledDelegate(int i2, int i3, boolean z, boolean z2, View view) {
    }

    @Keep
    public void onOverscrollRefresh(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void onPause() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void onResume() {
    }

    @Keep
    public void onScrollChangedDelegate(int i2, int i3, int i4, int i5) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void onShow() {
    }

    @Override // android.view.View, com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Keep
    public boolean overScrollByDelegate(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, View view) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean pageDown(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean pageUp(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void pauseTimers() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void postUrl(String str, byte[] bArr) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void reload() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void removeDocumentStartJavaScript(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void removeJavascriptInterface(String str) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void replaceTranslatedString(Map<String, String> map) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void requestFocusNodeHref(Message message) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void requestImageRef(Message message) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public WebBackForwardList restoreState(Bundle bundle) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void resumeTimers() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean savePage(String str, String str2, int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public WebBackForwardList saveState(Bundle bundle) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void saveWebArchive(String str) {
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
    }

    @Override // android.view.View, com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setBackgroundColor(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setBottomHeight(int i2) {
    }

    public void setCustomOnOverScrolledListener(OverScrolledListener overScrolledListener) {
    }

    public void setCustomOnScrollChangedListener(ScrollChangedListener scrollChangedListener) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setDownloadListener(DownloadListener downloadListener) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setExtendInputClient(Object obj) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setExtendPluginClient(Object obj) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setExtendTextAreaClient(Object obj) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setFindListener(WebView.FindListener findListener) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setHorizontalScrollBarEnable(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setInitialScale(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setNetworkAvailable(boolean z) {
    }

    @Override // android.view.View, com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setPluginTextureScale(String str, int i2, float f, float f2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setProxyWebViewClientExtension(Object obj) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setTranslateMode(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setVerticalScrollBarEnable(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setWebChromeClient(Object obj) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setWebContentsDebuggingEnabled(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setWebContentsSize(int i2, int i3) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setWebViewClient(Object obj) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void smoothScroll(int i2, int i3, long j2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void stopLoading() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void takePluginScreenshot(String str, int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public int view_computeHorizontalScrollOffset() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public int view_computeHorizontalScrollRange() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public int view_computeVerticalScrollExtent() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public int view_computeVerticalScrollOffset() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public int view_computeVerticalScrollRange() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void view_scrollBy(int i2, int i3) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void view_scrollTo(int i2, int i3) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void zoomBy(float f) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean zoomIn() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean zoomOut() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void loadUrl(String str, Map<String, String> map) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback) {
    }

    @Override // com.tencent.xweb.XWebExtendInterface
    public void setExtendInputClient(XWebExtendInputClient xWebExtendInputClient) {
    }

    @Override // com.tencent.xweb.XWebExtendInterface
    public void setExtendPluginClient(XWebExtendPluginClient xWebExtendPluginClient) {
    }

    @Override // com.tencent.xweb.XWebExtendInterface
    public void setExtendTextAreaClient(XWebExtendTextAreaClient xWebExtendTextAreaClient) {
    }

    public WebView(Context context, AttributeSet attributeSet) {
    }
}
