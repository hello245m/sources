package com.tencent.xweb;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class WebViewFeature {
    public static final String PROXY_OVERRIDE = "PROXY_OVERRIDE";
    public static final String PROXY_OVERRIDE_REVERSE_BYPASS = "PROXY_OVERRIDE_REVERSE_BYPASS";
    public static final String TAG = "WebViewFeature";

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public @interface WebViewSupportFeature {
    }

    public static boolean isFeatureSupported(String str) {
    }
}
