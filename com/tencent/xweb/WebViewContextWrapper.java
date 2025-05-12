package com.tencent.xweb;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.ServiceConnection;
import com.tencent.xweb.internal.IWebView;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class WebViewContextWrapper extends MutableContextWrapper {
    public static final String TAG = "WebViewContextWrapper";
    public IWebView a;

    public WebViewContextWrapper(Context context) {
    }

    @Override // android.content.MutableContextWrapper
    public void setBaseContext(Context context) {
    }

    public void setBindedWebview(IWebView iWebView) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unbindService(ServiceConnection serviceConnection) {
    }
}
