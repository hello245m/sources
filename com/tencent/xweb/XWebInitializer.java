package com.tencent.xweb;

import com.tencent.xweb.internal.IWebViewContextWrapper;
import com.tencent.xweb.internal.IWebViewCoreWrapper;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class XWebInitializer {
    public static final String TAG = "XWebInitializer";
    public boolean mHasInited;
    public boolean mIsWebViewCoreReady;
    public IWebViewContextWrapper webViewContextWrapper;
    public IWebViewCoreWrapper webViewCoreWrapper;

    private boolean init() {
    }

    public abstract boolean doInitWebViewCore(int i2);

    public IWebViewContextWrapper getWebViewContextWrapper() {
    }

    public IWebViewCoreWrapper getWebViewCoreWrapper() {
    }

    public void initWebViewCore() {
    }

    public boolean isWebViewCoreReady() {
    }

    public abstract void postInitWebViewCore(int i2);

    public void setLocalStorageSuffix() {
    }
}
