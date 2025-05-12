package com.tencent.xweb;

import android.content.Context;
import com.tencent.xweb.WebView;
import com.tencent.xweb.internal.IXWebUpdateListener;
import java.util.Locale;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebSdkInternal {
    public static final String SP_KEY_IP_TYPE = "IP_TYPE";
    public static boolean a = false;
    public static long sApplicationStartTime = 0;
    public static IXWebUpdateListener sUpdateListener = null;
    public static boolean sWaitForXWeb = false;

    public static WebDebugCfg a(Context context) {
    }

    public static void bindNativeTransInternal(long j2) {
    }

    public static void clearAllWebViewCacheInternal(boolean z) {
    }

    public static void forceKillGpuProcessInternal() {
    }

    public static void forceKillRenderProcessInternal() {
    }

    public static long getApplicationStartTime() {
    }

    public static boolean getEnableRemoteDebugInternal() {
    }

    public static int getIpType() {
    }

    public static int getRenderSandboxProcessMemoryInternal() {
    }

    public static IXWebUpdateListener getXWebUpdateListener() {
    }

    public static boolean hasXWebFeatureInternal(int i2) {
    }

    public static synchronized void initXWebEnvironmentInternal(Context context, XWebEnvironmentConfig xWebEnvironmentConfig) {
    }

    public static boolean isWaitForXWeb() {
    }

    public static boolean loadPackageFromFileInternal(Context context, String str) {
    }

    public static void preInitGpuProcessInternal() {
    }

    public static void preInitRenderProcessInternal() {
    }

    public static void setABTestWebViewKindInternal(Context context, String str, WebView.WebViewKind webViewKind) {
    }

    public static void setAppBrandIdInternal(String str) {
    }

    public static void setApplicationStartTime(long j2) {
    }

    public static void setEnableCheckStorageInternal(Context context, boolean z) {
    }

    public static void setEnableLocalDebugInternal(Context context, boolean z) {
    }

    public static boolean setEnableRemoteDebugInternal(boolean z) {
    }

    public static boolean setIpTypeInternal(int i2) {
    }

    public static void setWaitForXWebInternal(boolean z) {
    }

    public static void setXWebUpdateListenerInternal(IXWebUpdateListener iXWebUpdateListener) {
    }

    public static void updateResourceLocaleInternal(Locale locale) {
    }
}
