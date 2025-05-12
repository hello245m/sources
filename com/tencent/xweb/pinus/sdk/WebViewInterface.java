package com.tencent.xweb.pinus.sdk;

import android.graphics.Bitmap;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Message;
import android.print.PrintDocumentAdapter;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeProvider;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.tencent.xweb.XWEB_BUILDFLAG;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface WebViewInterface {
    int addDocumentStartJavaScript(String str, String[] strArr);

    void addJavascriptInterface(Object obj, String str);

    boolean canGoBack();

    boolean canGoBackOrForward(int i2);

    boolean canGoForward();

    void clearCache(boolean z);

    void clearFormData();

    void clearHistory();

    void clearMatches();

    void clearSslPreferences();

    void clearView();

    WebBackForwardList copyBackForwardList();

    PrintDocumentAdapter createPrintDocumentAdapter(String str);

    void destroy();

    boolean dispatchKeyEvent(KeyEvent keyEvent);

    void documentHasImages(Message message);

    void evaluateJavascript(String str, ValueCallback<String> valueCallback);

    void findAllAsync(String str);

    void findNext(boolean z);

    void flingScroll(int i2, int i3);

    AccessibilityNodeProvider getAccessibilityNodeProvider();

    SslCertificate getCertificate();

    int getContentHeight();

    ViewGroup getContentView();

    Bitmap getFavicon();

    Object getHitTestResultInner();

    @XWEB_BUILDFLAG.XWEB_IMAGE_TO_FILE
    boolean getImageBitmapToFile(String str, String str2, String str3, Object obj);

    String getOriginalUrl();

    int getProgress();

    float getScale();

    Object getSettingsInner();

    String getTitle();

    @XWEB_BUILDFLAG.XWEB_TRANSLATE
    void getTranslateSampleString(int i2);

    String getUrl();

    void goBack();

    void goBackOrForward(int i2);

    void goForward();

    void invokeZoomPicker();

    boolean isPrivateBrowsingEnabled();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void loadUrl(String str, Map<String, String> map);

    boolean onCheckIsTextEditor();

    @XWEB_BUILDFLAG.XWEB_INPUT
    void onExtendInputKeyboardHeightChanged(boolean z, int i2, boolean z2);

    @XWEB_BUILDFLAG.XWEB_TEXT_AREA
    void onExtendTextAreaKeyboardHeightChanged(boolean z, int i2, boolean z2);

    @XWEB_BUILDFLAG.XWEB_COMMON
    void onHide();

    void onPause();

    void onResume();

    @XWEB_BUILDFLAG.XWEB_COMMON
    void onShow();

    boolean onTouchEvent(MotionEvent motionEvent);

    boolean pageDown(boolean z);

    boolean pageUp(boolean z);

    void pauseTimers();

    void postUrl(String str, byte[] bArr);

    void reload();

    void removeDocumentStartJavaScript(int i2);

    void removeJavascriptInterface(String str);

    @XWEB_BUILDFLAG.XWEB_TRANSLATE
    void replaceTranslatedString(Map<String, String> map);

    void requestFocusNodeHref(Message message);

    void requestImageRef(Message message);

    WebBackForwardList restoreState(Bundle bundle);

    void resumeTimers();

    @XWEB_BUILDFLAG.XWEB_COMMON
    boolean savePage(String str, String str2, int i2);

    WebBackForwardList saveState(Bundle bundle);

    void saveWebArchive(String str);

    void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback);

    void setBackgroundColor(int i2);

    @XWEB_BUILDFLAG.XWEB_COMMON
    void setBottomHeight(int i2);

    void setDownloadListener(DownloadListener downloadListener);

    @XWEB_BUILDFLAG.XWEB_INPUT
    void setExtendInputClient(Object obj);

    @XWEB_BUILDFLAG.XWEB_SAME_LAYER
    void setExtendPluginClient(Object obj);

    @XWEB_BUILDFLAG.XWEB_TEXT_AREA
    void setExtendTextAreaClient(Object obj);

    void setFindListener(WebView.FindListener findListener);

    @XWEB_BUILDFLAG.XWEB_SCROLLBAR
    void setHorizontalScrollBarEnable(boolean z);

    void setInitialScale(int i2);

    void setNetworkAvailable(boolean z);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    @XWEB_BUILDFLAG.XWEB_SAME_LAYER
    void setPluginTextureScale(String str, int i2, float f, float f2);

    @XWEB_BUILDFLAG.XWEB_COMMON
    void setProxyWebViewClientExtension(Object obj);

    @XWEB_BUILDFLAG.XWEB_TRANSLATE
    void setTranslateMode(boolean z);

    @XWEB_BUILDFLAG.XWEB_SCROLLBAR
    void setVerticalScrollBarEnable(boolean z);

    void setWebChromeClient(Object obj);

    void setWebContentsDebuggingEnabled(boolean z);

    @XWEB_BUILDFLAG.XWEB_SET_WEB_CONTENTS_SIZE
    void setWebContentsSize(int i2, int i3);

    void setWebViewClient(Object obj);

    void smoothScroll(int i2, int i3, long j2);

    void stopLoading();

    @XWEB_BUILDFLAG.XWEB_SAME_LAYER
    void takePluginScreenshot(String str, int i2);

    int view_computeHorizontalScrollOffset();

    int view_computeHorizontalScrollRange();

    int view_computeVerticalScrollExtent();

    int view_computeVerticalScrollOffset();

    int view_computeVerticalScrollRange();

    void view_scrollBy(int i2, int i3);

    void view_scrollTo(int i2, int i3);

    void zoomBy(float f);

    boolean zoomIn();

    boolean zoomOut();
}
