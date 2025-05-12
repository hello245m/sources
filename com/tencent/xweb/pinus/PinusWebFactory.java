package com.tencent.xweb.pinus;

import android.content.Context;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebViewProvider;
import com.tencent.xweb.internal.ICookieManager;
import com.tencent.xweb.internal.IWebStorage;
import com.tencent.xweb.internal.IWebView;
import com.tencent.xweb.internal.IWebViewContextWrapper;
import com.tencent.xweb.internal.IWebViewCoreWrapper;
import com.tencent.xweb.internal.IWebViewDatabase;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class PinusWebFactory extends XWebViewProvider {
    public static final String TAG = "PinusWebFactory";
    public boolean mHasInitedWebViewCore;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class SingletonHolder {
        public static final PinusWebFactory sInstance = null;

        public static /* synthetic */ PinusWebFactory access$100() {
        }
    }

    public /* synthetic */ PinusWebFactory(AnonymousClass1 anonymousClass1) {
    }

    public static PinusWebFactory getInstance() {
    }

    private boolean initWebViewCoreInternal() {
    }

    @Override // com.tencent.xweb.XWebViewProvider, com.tencent.xweb.internal.IWebViewProvider
    public void clearAllWebViewCache(Context context, boolean z) {
    }

    @Override // com.tencent.xweb.XWebViewProvider, com.tencent.xweb.internal.IWebViewProvider
    public void clearClientCertPreferences(Runnable runnable) {
    }

    @Override // com.tencent.xweb.XWebViewProvider, com.tencent.xweb.internal.IWebViewProvider
    public IWebView createWebView(WebView webView) {
    }

    @Override // com.tencent.xweb.XWebViewProvider, com.tencent.xweb.internal.IWebViewProvider
    public String findAddress(String str) {
    }

    @Override // com.tencent.xweb.XWebViewProvider, com.tencent.xweb.internal.IWebViewProvider
    public ICookieManager getCookieManager() {
    }

    @Override // com.tencent.xweb.XWebViewProvider, com.tencent.xweb.internal.IWebViewProvider
    public IWebViewContextWrapper getWebViewContextWrapper() {
    }

    @Override // com.tencent.xweb.XWebViewProvider, com.tencent.xweb.internal.IWebViewProvider
    public IWebViewCoreWrapper getWebViewCoreWrapper() {
    }

    @Override // com.tencent.xweb.XWebViewProvider, com.tencent.xweb.internal.IWebViewProvider
    public IWebViewDatabase getWebViewDatabase(Context context) {
    }

    @Override // com.tencent.xweb.XWebViewProvider, com.tencent.xweb.internal.IWebViewProvider
    public IWebStorage getWebviewStorage() {
    }

    @Override // com.tencent.xweb.XWebViewProvider
    public Object handleBaseContextChanged(Object[] objArr) {
    }

    @Override // com.tencent.xweb.XWebViewProvider, com.tencent.xweb.internal.IWebViewProvider
    public boolean hasInitedWebViewCore() {
    }

    @Override // com.tencent.xweb.XWebViewProvider, com.tencent.xweb.internal.IWebViewProvider
    public boolean initWebviewCore(Context context, WebView.PreInitCallback preInitCallback) {
    }

    public PinusWebFactory() {
    }
}
