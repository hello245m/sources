package com.tencent.xweb;

import android.content.Context;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class XWebExtendPluginNativeViewDelegate {
    public WeakReference<XWebExtendPluginNativeViewClient> mClient;

    public abstract Context getContext();

    public FrameLayout getRootView() {
    }

    public abstract void onCreate(int i2, int i3);

    public abstract void onDestroy();

    public abstract void onSizeChanged(int i2, int i3);

    public void setClient(XWebExtendPluginNativeViewClient xWebExtendPluginNativeViewClient) {
    }
}
