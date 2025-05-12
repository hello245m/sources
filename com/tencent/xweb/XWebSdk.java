package com.tencent.xweb;

import android.content.Context;
import android.os.Bundle;
import com.tencent.xweb.LibraryLoader;
import com.tencent.xweb.WebView;
import com.tencent.xweb.downloader.IFileDownloaderProxy;
import com.tencent.xweb.internal.IXWebUpdateListener;
import com.tencent.xweb.util.IXWebLogClient;
import com.tencent.xweb.util.WebViewExtensionListener;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.xwalk.core.XWalkEnvironment;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebSdk extends XWebSdkInternal {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class WebViewModeForAppBrand {
        public static final WebViewModeForAppBrand DISABLE_MULTI_PROCESS = null;
        public static final WebViewModeForAppBrand GPU_RENDER_SANDBOX = null;
        public static final WebViewModeForAppBrand GPU_RENDER_UNSANDBOX = null;
        public static final WebViewModeForAppBrand RENDER_SANDBOX = null;
        public static final WebViewModeForAppBrand RENDER_UNSANDBOX = null;
        public static final /* synthetic */ WebViewModeForAppBrand[] a = null;

        public WebViewModeForAppBrand(String str, int i2) {
        }

        public static WebViewModeForAppBrand valueOf(String str) {
        }

        public static WebViewModeForAppBrand[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class WebViewModeForMM {
        public static final WebViewModeForMM DISABLE_MULTI_PROCESS = null;
        public static final WebViewModeForMM GPU_RENDER_SANDBOX = null;
        public static final WebViewModeForMM GPU_RENDER_UNSANDBOX = null;
        public static final WebViewModeForMM NOT_IN_MM = null;
        public static final WebViewModeForMM RENDER_SANDBOX = null;
        public static final WebViewModeForMM RENDER_UNSANDBOX = null;
        public static final /* synthetic */ WebViewModeForMM[] a = null;

        public WebViewModeForMM(String str, int i2) {
        }

        public static WebViewModeForMM valueOf(String str) {
        }

        public static WebViewModeForMM[] values() {
        }
    }

    public static void appendAppInfo(String str) {
    }

    public static void bindNativeTrans(long j2) {
    }

    public static void checkConfigUpdate(Context context) {
    }

    public static void checkNeedDownload() {
    }

    public static void clearAllWebViewCache(boolean z) {
    }

    public static void forceKillGpuProcess() {
    }

    public static void forceKillRenderProcess() {
    }

    public static long getApplicationStartTime() {
    }

    public static int getAvailableVersion() {
    }

    public static boolean getBuildConfigNeedTurnOffDynamicCode() {
    }

    public static boolean getBuildConfigShouldEmbedXWebCore() {
    }

    public static String getConfigValue(String str) {
    }

    public static boolean getConfigValueAsBoolean(String str, String str2, boolean z) {
    }

    public static int getConfigValueAsInt(String str, String str2, int i2) {
    }

    public static String getCurrentVersionDir(Context context) {
    }

    public static boolean getDowngradeToSys() {
    }

    public static boolean getEnableRemoteDebug() {
    }

    public static boolean getEnableSandbox() {
    }

    public static Bundle getExtendBundle() {
    }

    public static int getInstalledNewstVersion(Context context) {
    }

    public static int getMultiProcessType() {
    }

    public static String getNewestVersionDir(Context context) {
    }

    public static String getPluginConfigValue(String str) {
    }

    public static String getPredownloadVersionDir(Context context) {
    }

    public static int getRenderSandboxProcessMemory() {
    }

    public static boolean getUsingCustomContext() {
    }

    public static boolean getV8LiteMode() {
    }

    public static int getWebViewCount() {
    }

    public static WebViewModeForAppBrand getWebViewModeCommandForAppBrand() {
    }

    public static WebViewModeForMM getWebViewModeCommandForMM() {
    }

    public static String getXWebConfigVersion() {
    }

    public static Bundle getXWebInitConfigBundle() {
    }

    public static int getXWebSdkVersion() {
    }

    public static boolean hasWebViewCoreInited() {
    }

    public static boolean hasXWebFeature(int i2) {
    }

    public static void initProcessServices() {
    }

    public static void initProcessServicesForAppBrand() {
    }

    public static void initWebviewCore(Context context, WebView.WebViewKind webViewKind, String str, WebView.PreInitCallback preInitCallback) {
    }

    public static synchronized void initXWebEnvironment(Context context, XWebEnvironmentConfig xWebEnvironmentConfig) {
    }

    public static boolean isBusy() {
    }

    public static boolean isCurrentSupportCustomContext() {
    }

    public static boolean isCurrentVersionSupportCustomContext() {
    }

    public static boolean isCurrentVersionSupportCustomInputForAppbrand() {
    }

    public static boolean isCurrentVersionSupportCustomTextAreaForAppbrand() {
    }

    public static boolean isCurrentVersionSupportExtendPluginForAppbrand() {
    }

    public static boolean isCurrentVersionSupportMapExtendPluginForAppbrand() {
    }

    public static boolean isCurrentVersionSupportNativeView() {
    }

    public static boolean isCurrentVersionSupportProxyOverrideReverseBypass() {
    }

    public static boolean isCurrentVersionSupportSetProxyOverride() {
    }

    public static boolean isSysWebView() {
    }

    public static boolean isXWebApplicationContextReady() {
    }

    public static boolean isXWebChildProcessCrashDumpFiles(File file) {
    }

    public static boolean isXWebCoreInited() {
    }

    public static boolean isXWebView() {
    }

    public static boolean loadPackageFromFile(Context context, String str) {
    }

    public static boolean needCheckUpdate(boolean z) {
    }

    public static boolean needRebootProcess() {
    }

    public static boolean needSwitchToTools(String str) {
    }

    public static boolean needUseXWeb(String str) {
    }

    public static void onReportXWebCrash(File file) {
    }

    public static void openDebugActivity(Context context) {
    }

    public static void preInitGpuProcess() {
    }

    public static void preInitRenderProcess() {
    }

    public static void registerBroadcastListener(Context context, IXWebBroadcastListener iXWebBroadcastListener) {
    }

    public static void runCommand(Bundle bundle) {
    }

    public static int safeGetChromiumVersion() {
    }

    public static void setAppBrandId(String str) {
    }

    public static void setApplicationStartTime(long j2) {
    }

    public static void setBaseConfigUpdatePeriod(long j2) {
    }

    public static void setCustomDensity(float f) {
    }

    @Deprecated
    public static synchronized void setEmbedInstallLibDir(String str) {
    }

    public static void setEnableCheckCertificate(boolean z) {
    }

    public static boolean setEnableRemoteDebug(boolean z) {
    }

    public static void setEnableSandbox(boolean z) {
    }

    public static void setFileDownloaderProxy(IFileDownloaderProxy iFileDownloaderProxy) {
    }

    public static synchronized void setForbidDownloadCode(boolean z) {
    }

    public static void setForceCheckUpdate() {
    }

    public static void setForceDarkBehavior(XWalkEnvironment.ForceDarkBehavior forceDarkBehavior) {
    }

    public static void setForceDarkMode(boolean z) {
    }

    public static boolean setGrayValueByUserId(int i2) {
    }

    public static boolean setIpType(int i2) {
    }

    public static synchronized void setIsEmbedDirReady(boolean z) {
    }

    public static void setLibraryLoader(LibraryLoader.ILibraryLoader iLibraryLoader) {
    }

    public static void setLocale(Locale locale) {
    }

    public static void setLogInterface(IXWebLogClient iXWebLogClient) {
    }

    public static void setMultiProcessType(int i2) {
    }

    public static void setPluginConfigUpdatePeriod(int i2) {
    }

    public static void setReportInterface(WebViewReporterInterface webViewReporterInterface) {
    }

    public static void setSharedPreferenceProvider(ISharedPreferenceProvider iSharedPreferenceProvider) {
    }

    public static synchronized void setSoLibDirs(List<File> list) {
    }

    public static void setTempBaseConfigUrl(String str) {
    }

    public static void setTempPluginConfigUrl(String str) {
    }

    public static void setUsingCustomContext(boolean z) {
    }

    public static void setV8LiteMode(boolean z) {
    }

    public static void setWaitForXWeb(boolean z) {
    }

    public static void setWebViewExtensionListener(WebViewExtensionListener webViewExtensionListener) {
    }

    public static void setXWebReportRequestIpInterface(XWebReportRequestIpInterface xWebReportRequestIpInterface) {
    }

    public static void setXWebUpdateListener(IXWebUpdateListener iXWebUpdateListener) {
    }

    public static void startCheck(Context context, HashMap<String, String> hashMap) {
    }

    public static void startMemoryDump(XWebMemoryDumpInterface xWebMemoryDumpInterface) {
    }

    public static boolean supportMultiProcess(Context context) {
    }

    public static void tryStartDownload() {
    }

    public static void unregisterBroadcastListener(IXWebBroadcastListener iXWebBroadcastListener) {
    }

    public static void updateResourceLocale(Locale locale) {
    }

    public static String getConfigValue(String str, String str2) {
    }

    public static String getPluginConfigValue(String str, String str2) {
    }

    public static void setTempBaseConfigUrl(String str, String str2) {
    }

    public static void setTempPluginConfigUrl(String str, String str2) {
    }
}
