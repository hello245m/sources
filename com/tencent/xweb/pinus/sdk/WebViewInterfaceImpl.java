package com.tencent.xweb.pinus.sdk;

import android.annotation.SuppressLint;
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
import com.tencent.xweb.util.ReflectMethod;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class WebViewInterfaceImpl implements WebViewInterface {
    public static final String TAG = "WebViewInterfaceImpl";
    public ReflectMethod addDocumentStartJavaScriptStringStringMethod;
    public ReflectMethod addJavascriptInterfaceObjectStringMethod;
    public ReflectMethod canGoBackMethod;
    public ReflectMethod canGoBackOrForwardintMethod;
    public ReflectMethod canGoForwardMethod;
    public ReflectMethod clearCachebooleanMethod;
    public ReflectMethod clearFormDataMethod;
    public ReflectMethod clearHistoryMethod;
    public ReflectMethod clearMatchesMethod;
    public ReflectMethod clearSslPreferencesMethod;
    public ReflectMethod clearViewMethod;
    public ReflectMethod copyBackForwardListMethod;
    public ReflectMethod createPrintDocumentAdapterStringMethod;
    public ReflectMethod destroyMethod;
    public ReflectMethod dispatchKeyEventKeyEventMethod;
    public ReflectMethod documentHasImagesMessageMethod;
    public ReflectMethod evaluateJavascriptStringValueCallbackStringMethod;
    public ReflectMethod findAllAsyncStringMethod;
    public ReflectMethod findNextbooleanMethod;
    public ReflectMethod flingScrollintintMethod;
    public ReflectMethod getAccessibilityNodeProviderMethod;
    public ReflectMethod getCertificateMethod;
    public ReflectMethod getContentHeightMethod;
    public ReflectMethod getContentViewMethod;
    public ReflectMethod getFaviconMethod;
    public ReflectMethod getHitTestResultInnerMethod;

    @XWEB_BUILDFLAG.XWEB_IMAGE_TO_FILE
    public ReflectMethod getImageBitmapToFileStringStringStringObjectMethod;
    public ReflectMethod getOriginalUrlMethod;
    public ReflectMethod getProgressMethod;
    public ReflectMethod getScaleMethod;
    public ReflectMethod getSettingsInnerMethod;
    public ReflectMethod getTitleMethod;

    @XWEB_BUILDFLAG.XWEB_TRANSLATE
    public ReflectMethod getTranslateSampleStringintMethod;
    public ReflectMethod getUrlMethod;
    public ReflectMethod goBackMethod;
    public ReflectMethod goBackOrForwardintMethod;
    public ReflectMethod goForwardMethod;
    public final Object inner;
    public ReflectMethod invokeZoomPickerMethod;
    public ReflectMethod isPrivateBrowsingEnabledMethod;
    public ReflectMethod loadDataStringStringStringMethod;
    public ReflectMethod loadDataWithBaseURLStringStringStringStringStringMethod;
    public ReflectMethod loadUrlStringMapStringStringMethod;
    public ReflectMethod loadUrlStringMethod;
    public ReflectMethod onCheckIsTextEditorMethod;

    @XWEB_BUILDFLAG.XWEB_INPUT
    public ReflectMethod onExtendInputKeyboardHeightChangedbooleanintbooleanMethod;

    @XWEB_BUILDFLAG.XWEB_TEXT_AREA
    public ReflectMethod onExtendTextAreaKeyboardHeightChangedbooleanintbooleanMethod;

    @XWEB_BUILDFLAG.XWEB_COMMON
    public ReflectMethod onHideMethod;
    public ReflectMethod onPauseMethod;
    public ReflectMethod onResumeMethod;

    @XWEB_BUILDFLAG.XWEB_COMMON
    public ReflectMethod onShowMethod;
    public ReflectMethod onTouchEventMotionEventMethod;
    public ReflectMethod pageDownbooleanMethod;
    public ReflectMethod pageUpbooleanMethod;
    public ReflectMethod pauseTimersMethod;
    public ReflectMethod postUrlStringbyteMethod;
    public ReflectMethod reloadMethod;
    public ReflectMethod removeDocumentStartJavaScriptintMethod;
    public ReflectMethod removeJavascriptInterfaceStringMethod;

    @XWEB_BUILDFLAG.XWEB_TRANSLATE
    public ReflectMethod replaceTranslatedStringMapStringStringMethod;
    public ReflectMethod requestFocusNodeHrefMessageMethod;
    public ReflectMethod requestImageRefMessageMethod;
    public ReflectMethod restoreStateBundleMethod;
    public ReflectMethod resumeTimersMethod;

    @XWEB_BUILDFLAG.XWEB_COMMON
    public ReflectMethod savePageStringStringintMethod;
    public ReflectMethod saveStateBundleMethod;
    public ReflectMethod saveWebArchiveStringMethod;
    public ReflectMethod saveWebArchiveStringbooleanValueCallbackStringMethod;
    public ReflectMethod setBackgroundColorintMethod;

    @XWEB_BUILDFLAG.XWEB_COMMON
    public ReflectMethod setBottomHeightintMethod;
    public ReflectMethod setDownloadListenerDownloadListenerMethod;

    @XWEB_BUILDFLAG.XWEB_INPUT
    public ReflectMethod setExtendInputClientObjectMethod;

    @XWEB_BUILDFLAG.XWEB_SAME_LAYER
    public ReflectMethod setExtendPluginClientObjectMethod;

    @XWEB_BUILDFLAG.XWEB_TEXT_AREA
    public ReflectMethod setExtendTextAreaClientObjectMethod;
    public ReflectMethod setFindListenerandroidwebkitWebViewFindListenerMethod;

    @XWEB_BUILDFLAG.XWEB_SCROLLBAR
    public ReflectMethod setHorizontalScrollBarEnablebooleanMethod;
    public ReflectMethod setInitialScaleintMethod;
    public ReflectMethod setNetworkAvailablebooleanMethod;
    public ReflectMethod setOnTouchListenerOnTouchListenerMethod;

    @XWEB_BUILDFLAG.XWEB_SAME_LAYER
    public ReflectMethod setPluginTextureScaleStringintfloatfloatMethod;

    @XWEB_BUILDFLAG.XWEB_COMMON
    public ReflectMethod setProxyWebViewClientExtensionObjectMethod;

    @XWEB_BUILDFLAG.XWEB_TRANSLATE
    public ReflectMethod setTranslateModebooleanMethod;

    @XWEB_BUILDFLAG.XWEB_SCROLLBAR
    public ReflectMethod setVerticalScrollBarEnablebooleanMethod;
    public ReflectMethod setWebChromeClientObjectMethod;
    public ReflectMethod setWebContentsDebuggingEnabledbooleanMethod;

    @XWEB_BUILDFLAG.XWEB_SET_WEB_CONTENTS_SIZE
    public ReflectMethod setWebContentsSizeintintMethod;
    public ReflectMethod setWebViewClientObjectMethod;
    public ReflectMethod smoothScrollintintlongMethod;
    public ReflectMethod stopLoadingMethod;

    @XWEB_BUILDFLAG.XWEB_SAME_LAYER
    public ReflectMethod takePluginScreenshotStringintMethod;
    public ReflectMethod view_computeHorizontalScrollOffsetMethod;
    public ReflectMethod view_computeHorizontalScrollRangeMethod;
    public ReflectMethod view_computeVerticalScrollExtentMethod;
    public ReflectMethod view_computeVerticalScrollOffsetMethod;
    public ReflectMethod view_computeVerticalScrollRangeMethod;
    public ReflectMethod view_scrollByintintMethod;
    public ReflectMethod view_scrollTointintMethod;
    public ReflectMethod zoomByfloatMethod;
    public ReflectMethod zoomInMethod;
    public ReflectMethod zoomOutMethod;

    public WebViewInterfaceImpl(Object obj) {
    }

    private synchronized ReflectMethod getAddDocumentStartJavaScriptStringStringMethod() {
    }

    private synchronized ReflectMethod getAddJavascriptInterfaceObjectStringMethod() {
    }

    private synchronized ReflectMethod getCanGoBackMethod() {
    }

    private synchronized ReflectMethod getCanGoBackOrForwardintMethod() {
    }

    private synchronized ReflectMethod getCanGoForwardMethod() {
    }

    private synchronized ReflectMethod getClearCachebooleanMethod() {
    }

    private synchronized ReflectMethod getClearFormDataMethod() {
    }

    private synchronized ReflectMethod getClearHistoryMethod() {
    }

    private synchronized ReflectMethod getClearMatchesMethod() {
    }

    private synchronized ReflectMethod getClearSslPreferencesMethod() {
    }

    private synchronized ReflectMethod getClearViewMethod() {
    }

    private synchronized ReflectMethod getCopyBackForwardListMethod() {
    }

    private synchronized ReflectMethod getCreatePrintDocumentAdapterStringMethod() {
    }

    private synchronized ReflectMethod getDestroyMethod() {
    }

    private synchronized ReflectMethod getDispatchKeyEventKeyEventMethod() {
    }

    private synchronized ReflectMethod getDocumentHasImagesMessageMethod() {
    }

    private synchronized ReflectMethod getEvaluateJavascriptStringValueCallbackStringMethod() {
    }

    private synchronized ReflectMethod getFindAllAsyncStringMethod() {
    }

    private synchronized ReflectMethod getFindNextbooleanMethod() {
    }

    private synchronized ReflectMethod getFlingScrollintintMethod() {
    }

    private synchronized ReflectMethod getGetAccessibilityNodeProviderMethod() {
    }

    private synchronized ReflectMethod getGetCertificateMethod() {
    }

    private synchronized ReflectMethod getGetContentHeightMethod() {
    }

    private synchronized ReflectMethod getGetContentViewMethod() {
    }

    private synchronized ReflectMethod getGetFaviconMethod() {
    }

    private synchronized ReflectMethod getGetHitTestResultInnerMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_IMAGE_TO_FILE
    private synchronized ReflectMethod getGetImageBitmapToFileStringStringStringObjectMethod() {
    }

    private synchronized ReflectMethod getGetOriginalUrlMethod() {
    }

    private synchronized ReflectMethod getGetProgressMethod() {
    }

    private synchronized ReflectMethod getGetScaleMethod() {
    }

    private synchronized ReflectMethod getGetSettingsInnerMethod() {
    }

    private synchronized ReflectMethod getGetTitleMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_TRANSLATE
    private synchronized ReflectMethod getGetTranslateSampleStringintMethod() {
    }

    private synchronized ReflectMethod getGetUrlMethod() {
    }

    private synchronized ReflectMethod getGoBackMethod() {
    }

    private synchronized ReflectMethod getGoBackOrForwardintMethod() {
    }

    private synchronized ReflectMethod getGoForwardMethod() {
    }

    private synchronized ReflectMethod getInvokeZoomPickerMethod() {
    }

    private synchronized ReflectMethod getIsPrivateBrowsingEnabledMethod() {
    }

    private synchronized ReflectMethod getLoadDataStringStringStringMethod() {
    }

    private synchronized ReflectMethod getLoadDataWithBaseURLStringStringStringStringStringMethod() {
    }

    private synchronized ReflectMethod getLoadUrlStringMapStringStringMethod() {
    }

    private synchronized ReflectMethod getLoadUrlStringMethod() {
    }

    private synchronized ReflectMethod getOnCheckIsTextEditorMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_INPUT
    private synchronized ReflectMethod getOnExtendInputKeyboardHeightChangedbooleanintbooleanMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_TEXT_AREA
    private synchronized ReflectMethod getOnExtendTextAreaKeyboardHeightChangedbooleanintbooleanMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_COMMON
    private synchronized ReflectMethod getOnHideMethod() {
    }

    private synchronized ReflectMethod getOnPauseMethod() {
    }

    private synchronized ReflectMethod getOnResumeMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_COMMON
    private synchronized ReflectMethod getOnShowMethod() {
    }

    private synchronized ReflectMethod getOnTouchEventMotionEventMethod() {
    }

    private synchronized ReflectMethod getPageDownbooleanMethod() {
    }

    private synchronized ReflectMethod getPageUpbooleanMethod() {
    }

    private synchronized ReflectMethod getPauseTimersMethod() {
    }

    private synchronized ReflectMethod getPostUrlStringbyteMethod() {
    }

    private synchronized ReflectMethod getReloadMethod() {
    }

    private synchronized ReflectMethod getRemoveDocumentStartJavaScriptintMethod() {
    }

    private synchronized ReflectMethod getRemoveJavascriptInterfaceStringMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_TRANSLATE
    private synchronized ReflectMethod getReplaceTranslatedStringMapStringStringMethod() {
    }

    private synchronized ReflectMethod getRequestFocusNodeHrefMessageMethod() {
    }

    private synchronized ReflectMethod getRequestImageRefMessageMethod() {
    }

    private synchronized ReflectMethod getRestoreStateBundleMethod() {
    }

    private synchronized ReflectMethod getResumeTimersMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_COMMON
    private synchronized ReflectMethod getSavePageStringStringintMethod() {
    }

    private synchronized ReflectMethod getSaveStateBundleMethod() {
    }

    private synchronized ReflectMethod getSaveWebArchiveStringMethod() {
    }

    private synchronized ReflectMethod getSaveWebArchiveStringbooleanValueCallbackStringMethod() {
    }

    private synchronized ReflectMethod getSetBackgroundColorintMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_COMMON
    private synchronized ReflectMethod getSetBottomHeightintMethod() {
    }

    private synchronized ReflectMethod getSetDownloadListenerDownloadListenerMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_INPUT
    private synchronized ReflectMethod getSetExtendInputClientObjectMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_SAME_LAYER
    private synchronized ReflectMethod getSetExtendPluginClientObjectMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_TEXT_AREA
    private synchronized ReflectMethod getSetExtendTextAreaClientObjectMethod() {
    }

    private synchronized ReflectMethod getSetFindListenerandroidwebkitWebViewFindListenerMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_SCROLLBAR
    private synchronized ReflectMethod getSetHorizontalScrollBarEnablebooleanMethod() {
    }

    private synchronized ReflectMethod getSetInitialScaleintMethod() {
    }

    private synchronized ReflectMethod getSetNetworkAvailablebooleanMethod() {
    }

    private synchronized ReflectMethod getSetOnTouchListenerOnTouchListenerMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_SAME_LAYER
    private synchronized ReflectMethod getSetPluginTextureScaleStringintfloatfloatMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_COMMON
    private synchronized ReflectMethod getSetProxyWebViewClientExtensionObjectMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_TRANSLATE
    private synchronized ReflectMethod getSetTranslateModebooleanMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_SCROLLBAR
    private synchronized ReflectMethod getSetVerticalScrollBarEnablebooleanMethod() {
    }

    private synchronized ReflectMethod getSetWebChromeClientObjectMethod() {
    }

    private synchronized ReflectMethod getSetWebContentsDebuggingEnabledbooleanMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_SET_WEB_CONTENTS_SIZE
    private synchronized ReflectMethod getSetWebContentsSizeintintMethod() {
    }

    private synchronized ReflectMethod getSetWebViewClientObjectMethod() {
    }

    private synchronized ReflectMethod getSmoothScrollintintlongMethod() {
    }

    private synchronized ReflectMethod getStopLoadingMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_SAME_LAYER
    private synchronized ReflectMethod getTakePluginScreenshotStringintMethod() {
    }

    private synchronized ReflectMethod getView_computeHorizontalScrollOffsetMethod() {
    }

    private synchronized ReflectMethod getView_computeHorizontalScrollRangeMethod() {
    }

    private synchronized ReflectMethod getView_computeVerticalScrollExtentMethod() {
    }

    private synchronized ReflectMethod getView_computeVerticalScrollOffsetMethod() {
    }

    private synchronized ReflectMethod getView_computeVerticalScrollRangeMethod() {
    }

    private synchronized ReflectMethod getView_scrollByintintMethod() {
    }

    private synchronized ReflectMethod getView_scrollTointintMethod() {
    }

    private synchronized ReflectMethod getZoomByfloatMethod() {
    }

    private synchronized ReflectMethod getZoomInMethod() {
    }

    private synchronized ReflectMethod getZoomOutMethod() {
    }

    @SuppressLint({"LongLogTag"})
    public static void handleRuntimeError(Exception exc) {
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

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public WebBackForwardList copyBackForwardList() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public PrintDocumentAdapter createPrintDocumentAdapter(String str) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void destroy() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface, android.view.View
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

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
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

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public Object getHitTestResultInner() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    @XWEB_BUILDFLAG.XWEB_IMAGE_TO_FILE
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

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public Object getSettingsInner() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public String getTitle() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    @XWEB_BUILDFLAG.XWEB_TRANSLATE
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

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean onCheckIsTextEditor() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    @XWEB_BUILDFLAG.XWEB_INPUT
    public void onExtendInputKeyboardHeightChanged(boolean z, int i2, boolean z2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    @XWEB_BUILDFLAG.XWEB_TEXT_AREA
    public void onExtendTextAreaKeyboardHeightChanged(boolean z, int i2, boolean z2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    @XWEB_BUILDFLAG.XWEB_COMMON
    public void onHide() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void onPause() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void onResume() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    @XWEB_BUILDFLAG.XWEB_COMMON
    public void onShow() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean onTouchEvent(MotionEvent motionEvent) {
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
    @XWEB_BUILDFLAG.XWEB_TRANSLATE
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
    @XWEB_BUILDFLAG.XWEB_COMMON
    public boolean savePage(String str, String str2, int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public WebBackForwardList saveState(Bundle bundle) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void saveWebArchive(String str) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setBackgroundColor(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    @XWEB_BUILDFLAG.XWEB_COMMON
    public void setBottomHeight(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setDownloadListener(DownloadListener downloadListener) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    @XWEB_BUILDFLAG.XWEB_INPUT
    public void setExtendInputClient(Object obj) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    @XWEB_BUILDFLAG.XWEB_SAME_LAYER
    public void setExtendPluginClient(Object obj) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    @XWEB_BUILDFLAG.XWEB_TEXT_AREA
    public void setExtendTextAreaClient(Object obj) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setFindListener(WebView.FindListener findListener) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    @XWEB_BUILDFLAG.XWEB_SCROLLBAR
    public void setHorizontalScrollBarEnable(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setInitialScale(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setNetworkAvailable(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    @XWEB_BUILDFLAG.XWEB_SAME_LAYER
    public void setPluginTextureScale(String str, int i2, float f, float f2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    @XWEB_BUILDFLAG.XWEB_COMMON
    public void setProxyWebViewClientExtension(Object obj) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    @XWEB_BUILDFLAG.XWEB_TRANSLATE
    public void setTranslateMode(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    @XWEB_BUILDFLAG.XWEB_SCROLLBAR
    public void setVerticalScrollBarEnable(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setWebChromeClient(Object obj) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setWebContentsDebuggingEnabled(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    @XWEB_BUILDFLAG.XWEB_SET_WEB_CONTENTS_SIZE
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
    @XWEB_BUILDFLAG.XWEB_SAME_LAYER
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
}
