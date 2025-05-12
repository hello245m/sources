package com.tencent.xweb.pinus.sdk;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class WebChromeClient {
    public Bitmap getDefaultVideoPoster() {
    }

    public View getVideoLoadingProgressView() {
    }

    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
    }

    public void onCloseWindow(WebView webView) {
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
    }

    public void onExitFullscreenVideo(Bitmap bitmap) {
    }

    public void onGeolocationPermissionsHidePrompt() {
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
    }

    public void onGetSampleString(WebView webView, Map<String, String> map) {
    }

    public void onGetTranslateString(WebView webView, Map<String, String> map) {
    }

    public void onHideCustomView() {
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResultInterface jsResultInterface) {
    }

    public boolean onJsAlertInner(WebView webView, String str, String str2, Object obj) {
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResultInterface jsResultInterface) {
    }

    public boolean onJsBeforeUnloadInner(WebView webView, String str, String str2, Object obj) {
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResultInterface jsResultInterface) {
    }

    public boolean onJsConfirmInner(WebView webView, String str, String str2, Object obj) {
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsResultInterface jsResultInterface) {
    }

    public boolean onJsPromptInner(WebView webView, String str, String str2, String str3, Object obj) {
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
    }

    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
    }

    public void onProgressChanged(WebView webView, int i2) {
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
    }

    public void onReceivedTitle(WebView webView, String str) {
    }

    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
    }

    public void onRequestFocus(WebView webView) {
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
    }
}
