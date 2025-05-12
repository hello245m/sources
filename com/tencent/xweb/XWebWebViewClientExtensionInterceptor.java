package com.tencent.xweb;

import android.os.Bundle;
import com.tencent.xweb.internal.IWebView;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebWebViewClientExtensionInterceptor {
    public static final String TAG = "XWebWebViewClientExtensionInterceptor";
    public int mContentHeight;
    public final IWebView mWebView;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class InterceptResult {
        public boolean intercepted;
        public Object result;

        public InterceptResult(boolean z, Object obj) {
        }
    }

    public XWebWebViewClientExtensionInterceptor(IWebView iWebView) {
    }

    public InterceptResult interceptOnMiscCallback(String str, Bundle bundle) {
    }
}
