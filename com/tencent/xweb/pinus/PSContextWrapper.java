package com.tencent.xweb.pinus;

import android.content.Context;
import androidx.annotation.Keep;
import com.tencent.xweb.XWebContextWrapper;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class PSContextWrapper extends XWebContextWrapper {
    public static final String TAG = "PSContextWrapper";

    @Keep
    public int apkVersion;

    @Keep
    public boolean enableV8Lite;

    @Keep
    public String extractedCoreDir;

    @Keep
    public int forceDarkBehavior;

    @Keep
    public boolean isForceDarkMode;

    @Keep
    public boolean usingCustomContext;

    public PSContextWrapper(Context context, int i2) {
    }

    private void initContextWrapper(Context context, int i2) {
    }

    @Override // com.tencent.xweb.XWebContextWrapper, com.tencent.xweb.internal.IWebViewContextWrapper
    public ClassLoader getWebViewCoreClassLoader() {
    }
}
