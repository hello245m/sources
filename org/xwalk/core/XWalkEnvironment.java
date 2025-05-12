package org.xwalk.core;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.tencent.xweb.DeprecatedOutsideXWebSdk;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebBroadcastListener;
import com.tencent.xweb.internal.IWebViewProvider;
import com.tencent.xweb.util.WebViewExtensionListener;
import com.tencent.xweb.util.XWebCoreInfo;
import java.util.Locale;
import java.util.Set;

@SuppressLint({"ApplySharedPref"})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class XWalkEnvironment {
    public static final String CRASH_DUMP_FILE_SUFFIX = "xweb_sandbox_crash";
    public static final String CRASH_DUMP_FILE_SUFFIX_FOR_GPU = "xweb_gpu_crash";
    public static final String CRASH_DUMP_FILE_SUFFIX_FOR_RENDER_UNSANDBOX = "xweb_render_crash";
    public static final String LOCAL_TEST_ZIP_NAME = "runtime_package.zip";
    public static final String MODULE_APPBRAND = "appbrand";
    public static final String MODULE_MM = "mm";
    public static final String MODULE_TOOLS = "tools";
    public static final int MULTI_PROCESS_TYPE_DISABLE = 0;
    public static final int MULTI_PROCESS_TYPE_RENDERER = 1;
    public static final int MULTI_PROCESS_TYPE_RENDERER_AND_GPU = 2;
    public static final String PINUS_SO_NAME = "libxwebcore.so";
    public static final String RUNTIME_ABI_ARM32_STR = "armeabi-v7a";
    public static final String RUNTIME_ABI_ARM64_STR = "arm64-v8a";
    public static final int SDK_SUPPORT_INVOKE_NOTIFY_MIN_APKVERSION = 153;
    public static final int SDK_SUPPORT_INVOKE_RUNTIME_MIN_APKVERSION = 255;
    public static final int SDK_SUPPORT_MIN_APKVERSION = 2000;
    public static final int SDK_VERSION = 20230504;
    public static final int TEST_APK_START_VERSION = 100000000;
    public static final String XWALK_SO_NAME = "libxwalkcore.so";
    public static final XWebBroadcastListener a = null;
    public static Context b;
    public static XWebCoreInfo c;
    public static String d;
    public static String e;
    public static String f;
    public static boolean g;
    public static boolean h;

    /* renamed from: i, reason: collision with root package name */
    public static int f8401i;

    @Keep
    public static boolean isTurnOnKVLog;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f8402j;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f8403k;

    /* renamed from: l, reason: collision with root package name */
    public static final Bundle f8404l = null;

    /* renamed from: m, reason: collision with root package name */
    public static final Set<String> f8405m = null;

    /* renamed from: n, reason: collision with root package name */
    public static final Bundle f8406n = null;

    /* renamed from: o, reason: collision with root package name */
    public static WebViewExtensionListener f8407o;

    /* renamed from: p, reason: collision with root package name */
    public static String f8408p;

    /* renamed from: q, reason: collision with root package name */
    public static int f8409q;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f8410r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class ForceDarkBehavior {
        public static final ForceDarkBehavior FORCE_DARK_ONLY = null;
        public static final ForceDarkBehavior MEDIA_QUERY_ONLY = null;
        public static final ForceDarkBehavior PREFER_MEDIA_QUERY_OVER_FORCE_DARK = null;
        public static final /* synthetic */ ForceDarkBehavior[] a = null;

        public ForceDarkBehavior(String str, int i2) {
        }

        public static ForceDarkBehavior valueOf(String str) {
        }

        public static ForceDarkBehavior[] values() {
        }
    }

    public static boolean a(int i2) {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void appendAppInfo(String str) {
    }

    public static IWebViewProvider b() {
    }

    public static boolean c() {
    }

    @Keep
    public static boolean containsAppInfo(String str) {
    }

    public static Context convertContextToApplication(Context context) {
    }

    public static void d() {
    }

    @Keep
    public static String dumpAppInfo() {
    }

    public static XWebCoreInfo e() {
    }

    public static void f() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static Context getApplicationContext() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static int getAvailableVersion() {
    }

    public static String getAvailableVersionDetail() {
    }

    public static boolean getBuildConfigForceXWebCore() {
    }

    public static boolean getBuildConfigNeedTurnOffDynamicCode() {
    }

    public static boolean getBuildConfigShouldEmbedXWebCore() {
    }

    public static boolean getBuildConfigThirdPartyRelease() {
    }

    public static boolean getBuildConfigXWebTestMode() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static ContentResolver getContentResolver() {
    }

    public static float getCustomDensity() {
    }

    public static boolean getEnableCheckCertificate() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static synchronized boolean getEnableSandbox() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static Bundle getExtendBundle() {
    }

    public static int getForceDarkBehavior() {
    }

    public static boolean getForceDarkMode() {
    }

    public static Object getInitConfig(String str) {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static int getInstalledNewstVersion(Context context) {
    }

    public static int getInstalledNewstVersionForCurAbi() {
    }

    public static int getInstalledNewstVersionForPredownAbi() {
    }

    public static int getInstalledPluginVersion(Context context, String str) {
    }

    public static Locale getLocale() {
    }

    public static String getLocaleString() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static synchronized int getMultiProcessType() {
    }

    public static String getPackageName() {
    }

    public static String getPrivilegedServicesName() {
    }

    public static String getProcessName() {
    }

    public static String getSafeModuleName(String str) {
    }

    public static String getSandboxedServicesName() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean getUsingCustomContext() {
    }

    public static boolean getUsingCustomContextInternal() {
    }

    public static boolean getV8LiteMode() {
    }

    public static WebViewExtensionListener getWebViewExtensionListener() {
    }

    public static WebView.WebViewKind getWebViewKindFromAvailableVersion() {
    }

    public static WebView.WebViewKind getWebViewKindFromInstalledNewstVersion(Context context) {
    }

    public static WebView.WebViewKind getWebViewKindFromVersion(int i2) {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static Bundle getXWebInitConfigBundle() {
    }

    public static boolean hasAvailableVersion() {
    }

    public static boolean hasInstalledAvailableVersion() {
    }

    public static synchronized void init(Context context) {
    }

    public static void initInChildProcess(Context context, boolean z) {
    }

    public static void initProcessServices() {
    }

    public static void initProcessServicesForAppBrand() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean isCurrentSupportCustomContext() {
    }

    public static boolean isCurrentVersionSupportConfigureV8Lite() {
    }

    public static boolean isCurrentVersionSupportContentHeightChange() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean isCurrentVersionSupportCustomContext() {
    }

    public static boolean isCurrentVersionSupportCustomInputForAppbrand() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean isCurrentVersionSupportCustomTextAreaForAppbrand() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean isCurrentVersionSupportExtendPluginForAppbrand() {
    }

    public static boolean isCurrentVersionSupportForceDarkMode() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean isCurrentVersionSupportMapExtendPluginForAppbrand() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean isCurrentVersionSupportNativeView() {
    }

    public static boolean isCurrentVersionSupportProxyOverrideReverseBypass() {
    }

    public static boolean isCurrentVersionSupportScreenshotForSameLayer() {
    }

    public static boolean isCurrentVersionSupportSetProxyOverride() {
    }

    public static boolean isCurrentVersionSupportSetWebContentsSize() {
    }

    public static boolean isInTestMode() {
    }

    public static boolean isPinusWebViewCoreFromAvailableVersion() {
    }

    public static boolean isPinusWebViewCoreFromInstalledNewstVersion(Context context) {
    }

    public static boolean isTestVersion(int i2) {
    }

    public static void isTurnOnKVLog() {
    }

    public static void refreshVersionInfo() {
    }

    public static void reset() {
    }

    public static boolean setCoreVersionInfo(int i2, String str, String str2) {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setCustomDensity(float f2) {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setEnableCheckCertificate(boolean z) {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static synchronized void setEnableSandbox(boolean z) {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setForceDarkBehavior(ForceDarkBehavior forceDarkBehavior) {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setForceDarkMode(boolean z) {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setLocale(Locale locale) {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static synchronized void setMultiProcessType(int i2) {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setUsingCustomContext(boolean z) {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setV8LiteMode(boolean z) {
    }

    public static void setWebViewExtensionListener(WebViewExtensionListener webViewExtensionListener) {
    }

    public static void tryLoadLocalAssetRuntime(Context context) {
    }

    public static int getInstalledNewstVersion(String str) {
    }

    public static int getInitConfig(String str, int i2) {
    }

    public static void a(String str) {
    }

    public static String a() {
    }

    public static String getInitConfig(String str, String str2) {
    }

    public static boolean getInitConfig(String str, boolean z) {
    }

    public static void a(String str, String str2) {
    }
}
