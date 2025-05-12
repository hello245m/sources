package com.tencent.xweb;

import android.webkit.WebSettings;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class WebSettings {
    public static final int APP_BRAND_TYPE_NONE = 0;
    public static final int APP_BRAND_TYPE_WE_APP = 1;
    public static final int APP_BRAND_TYPE_WE_APP_EMBEDDED_HTML = 2;
    public static final int FORCE_DARK_OFF = 0;
    public static final int FORCE_DARK_ON = 2;
    public static final int FORCE_DARK_ONLY = 0;
    public static final int LOAD_CACHE_ELSE_NETWORK = 1;
    public static final int LOAD_CACHE_ONLY = 3;
    public static final int LOAD_DEFAULT = -1;

    @Deprecated
    public static final int LOAD_NORMAL = 0;
    public static final int LOAD_NO_CACHE = 2;
    public static final int MEDIA_QUERY_ONLY = 1;
    public static final int MIXED_CONTENT_ALWAYS_ALLOW = 0;
    public static final int MIXED_CONTENT_COMPATIBILITY_MODE = 2;
    public static final int MIXED_CONTENT_NEVER_ALLOW = 1;
    public static final int PREFER_MEDIA_QUERY_OVER_FORCE_DARK = 2;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class TextSize {
        public static final TextSize LARGER = null;
        public static final TextSize LARGEST = null;
        public static final TextSize NORMAL = null;
        public static final TextSize SMALLER = null;
        public static final TextSize SMALLEST = null;
        public static final /* synthetic */ TextSize[] b = null;
        public int a;

        public TextSize(String str, int i2, int i3) {
        }

        public static TextSize valueOf(String str) {
        }

        public static TextSize[] values() {
        }
    }

    public abstract void disableCustomizedLongPressTimeout();

    public abstract void enableCustomizedLongPressTimeout(int i2);

    public abstract boolean getAllowContentAccess();

    public abstract boolean getAllowFileAccess();

    public abstract boolean getAllowFileAccessFromFileURLs();

    public abstract boolean getAllowUniversalAccessFromFileURLs();

    public abstract Map<String, String> getAppBrandInfo();

    public abstract boolean getBackgroundAudioPause();

    public abstract boolean getBlockNetworkImage();

    public abstract boolean getBlockNetworkLoads();

    public abstract boolean getBuiltInZoomControls();

    public abstract int getCacheMode();

    public abstract String getCursiveFontFamily();

    public abstract boolean getDatabaseEnabled();

    @Deprecated
    public abstract String getDatabasePath();

    public abstract int getDefaultFixedFontSize();

    public abstract int getDefaultFontSize();

    public abstract String getDefaultTextEncodingName();

    public abstract int getDisabledActionModeMenuItems();

    public abstract boolean getDomStorageEnabled();

    public abstract String getFantasyFontFamily();

    public abstract String getFixedFontFamily();

    public abstract int getForceDarkBehavior();

    public abstract int getForceDarkMode();

    public abstract boolean getJavaScriptCanOpenWindowsAutomatically();

    public abstract boolean getJavaScriptEnabled();

    public abstract boolean getJavascriptCanAccessClipboard();

    public abstract WebSettings.LayoutAlgorithm getLayoutAlgorithm();

    public abstract boolean getLoadWithOverviewMode();

    public abstract boolean getLoadsImagesAutomatically();

    public abstract boolean getMediaPlaybackRequiresUserGesture();

    public abstract int getMinimumFontSize();

    public abstract int getMinimumLogicalFontSize();

    public abstract int getMixedContentMode();

    public abstract boolean getOffscreenPreRaster();

    public abstract boolean getSafeBrowsingEnabled();

    public abstract String getSansSerifFontFamily();

    public abstract boolean getSaveFormData();

    @Deprecated
    public abstract boolean getSavePassword();

    public abstract String getSerifFontFamily();

    public abstract String getStandardFontFamily();

    public synchronized TextSize getTextSize() {
    }

    public abstract int getTextZoom();

    @Deprecated
    public boolean getUseDoubleTree() {
    }

    public abstract boolean getUseWideViewPort();

    public abstract String getUserAgentString();

    public abstract int getUsingForAppBrand();

    public abstract void setAllowContentAccess(boolean z);

    public abstract void setAllowFileAccess(boolean z);

    public abstract void setAllowFileAccessFromFileURLs(boolean z);

    public abstract void setAllowUniversalAccessFromFileURLs(boolean z);

    public abstract void setAppBrandInfo(Map<String, String> map);

    public abstract void setAppCacheEnabled(boolean z);

    @Deprecated
    public abstract void setAppCacheMaxSize(long j2);

    public abstract void setAppCachePath(String str);

    public abstract void setAudioPlaybackRequiresUserGesture(boolean z);

    public abstract void setBackgroundAudioPause(boolean z);

    public abstract void setBlockNetworkImage(boolean z);

    public abstract void setBlockNetworkLoads(boolean z);

    public abstract void setBuiltInZoomControls(boolean z);

    public abstract void setCacheMode(int i2);

    public abstract void setCursiveFontFamily(String str);

    public abstract void setDatabaseEnabled(boolean z);

    @Deprecated
    public abstract void setDatabasePath(String str);

    public abstract void setDefaultFixedFontSize(int i2);

    public abstract void setDefaultFontSize(int i2);

    public abstract void setDefaultTextEncodingName(String str);

    public abstract void setDisabledActionModeMenuItems(int i2);

    public abstract void setDisplayZoomControls(boolean z);

    public abstract void setDomStorageEnabled(boolean z);

    public abstract void setFantasyFontFamily(String str);

    public abstract void setFixedFontFamily(String str);

    public abstract void setForceDarkBehavior(int i2);

    public abstract void setForceDarkMode(int i2);

    public abstract void setGeolocationEnabled(boolean z);

    @Deprecated
    public abstract void setJavaScriptCanOpenWindowsAutomatically(boolean z);

    public abstract void setJavaScriptEnabled(boolean z);

    public abstract void setJavascriptCanAccessClipboard(boolean z);

    public abstract void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm);

    public abstract void setLoadWithOverviewMode(boolean z);

    public abstract void setLoadsImagesAutomatically(boolean z);

    public abstract void setMediaPlaybackRequiresUserGesture(boolean z);

    public abstract void setMinimumFontSize(int i2);

    public abstract void setMinimumLogicalFontSize(int i2);

    public abstract void setMixedContentMode(int i2);

    public abstract void setNeedInitialFocus(boolean z);

    public abstract void setOffscreenPreRaster(boolean z);

    @Deprecated
    public abstract void setRenderPriority(WebSettings.RenderPriority renderPriority);

    public abstract void setSafeBrowsingEnabled(boolean z);

    public abstract void setSansSerifFontFamily(String str);

    public abstract void setSaveFormData(boolean z);

    @Deprecated
    public abstract void setSavePassword(boolean z);

    public abstract void setSerifFontFamily(String str);

    public abstract void setStandardFontFamily(String str);

    public abstract void setSupportMultipleWindows(boolean z);

    public abstract void setSupportZoom(boolean z);

    public synchronized void setTextSize(TextSize textSize) {
    }

    public abstract void setTextZoom(int i2);

    @Deprecated
    public void setUseDoubleTree(boolean z) {
    }

    public abstract void setUseWideViewPort(boolean z);

    public abstract void setUserAgentString(String str);

    public abstract void setUsingForAppBrand(int i2);

    public abstract void setVideoHideDownloadUi(boolean z);

    public abstract void setVideoPlaybackRequiresUserGesture(boolean z);

    public abstract boolean supportMultipleWindows();

    public abstract boolean supportZoom();
}
