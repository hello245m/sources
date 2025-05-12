package com.tencent.xweb;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class WebChromeClient {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static abstract class FileChooserParams {
        public static final int MODE_OPEN = 0;
        public static final int MODE_OPEN_FOLDER = 2;
        public static final int MODE_OPEN_MULTIPLE = 1;
        public static final int MODE_SAVE = 3;

        public static Uri[] parseResult(int i2, Intent intent) {
        }

        public abstract Intent createIntent();

        public abstract String[] getAcceptTypes();

        public abstract String getFilenameHint();

        public abstract int getMode();

        public abstract CharSequence getTitle();

        public abstract boolean isCaptureEnabled();
    }

    public Bitmap getDefaultVideoPoster() {
    }

    public View getVideoLoadingProgressView() {
    }

    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
    }

    public void onCloseWindow(WebView webView) {
    }

    @Deprecated
    public void onConsoleMessage(String str, int i2, String str2) {
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
    }

    public void onDidChangeThemeColor(WebView webView, int i2) {
    }

    public boolean onEnterFullscreen(View view, WebChromeClient.CustomViewCallback customViewCallback) {
    }

    @Deprecated
    public void onExceededDatabaseQuota(String str, String str2, long j2, long j3, long j4, WebStorage.QuotaUpdater quotaUpdater) {
    }

    public boolean onExitFullscreen() {
    }

    public void onExitFullscreenVideo(Bitmap bitmap) {
    }

    public void onGeolocationPermissionsHidePrompt() {
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
    }

    public void onHideCustomView() {
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
    }

    @Deprecated
    public boolean onJsTimeout() {
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
    }

    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
    }

    public void onProgressChanged(WebView webView, int i2) {
    }

    @Deprecated
    public void onReachedMaxAppCacheSize(long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
    }

    public void onReceivedTitle(WebView webView, String str) {
    }

    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
    }

    public void onRequestFocus(WebView webView) {
    }

    public boolean onSearchWord(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    public boolean onSelectInfoChanged(long j2, String str, String str2, String str3) {
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, FileChooserParams fileChooserParams) {
    }

    @Deprecated
    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
    }
}
