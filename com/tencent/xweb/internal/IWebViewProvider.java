package com.tencent.xweb.internal;

import android.content.Context;
import com.tencent.xweb.IProfilerController;
import com.tencent.xweb.WebView;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IWebViewProvider {
    void clearAllWebViewCache(Context context, boolean z);

    void clearClientCertPreferences(Runnable runnable);

    IWebView createWebView(WebView webView);

    Object execute(String str, Object[] objArr);

    String findAddress(String str);

    ICookieManager getCookieManager();

    IProfilerController getProfilerController();

    IWebViewContextWrapper getWebViewContextWrapper();

    IWebViewCoreWrapper getWebViewCoreWrapper();

    IWebViewDatabase getWebViewDatabase(Context context);

    IWebStorage getWebviewStorage();

    boolean hasInitedWebViewCore();

    boolean initWebviewCore(Context context, WebView.PreInitCallback preInitCallback);

    Object invokeRuntimeChannel(int i2, Object[] objArr);

    boolean isSupportTranslateWebSite();
}
