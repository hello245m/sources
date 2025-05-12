package com.tencent.xweb.pinus.sdk;

import android.webkit.WebSettings;
import com.tencent.xweb.XWEB_BUILDFLAG;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface WebSettingsInterface {
    @XWEB_BUILDFLAG.XWEB_LONG_PRESS_TIME_CUSTOMIZE
    void disableCustomizedLongPressTimeout();

    @XWEB_BUILDFLAG.XWEB_LONG_PRESS_TIME_CUSTOMIZE
    void enableCustomizedLongPressTimeout(int i2);

    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getAllowFileAccessFromFileURLs();

    boolean getAllowUniversalAccessFromFileURLs();

    @XWEB_BUILDFLAG.XWEB_COMMON
    Map<String, String> getAppBrandInfo();

    @XWEB_BUILDFLAG.XWEB_AUDIO_AUTOPLAY_FLAG
    boolean getAudioPlaybackRequiresUserGesture();

    @XWEB_BUILDFLAG.XWEB_BACKGROUND_AUDIO_PAUSE
    boolean getBackgroundAudioPause();

    boolean getBlockNetworkImage();

    boolean getBlockNetworkLoads();

    boolean getBuiltInZoomControls();

    int getCacheMode();

    String getCursiveFontFamily();

    boolean getDatabaseEnabled();

    String getDatabasePath();

    int getDefaultFixedFontSize();

    int getDefaultFontSize();

    String getDefaultTextEncodingName();

    int getDisabledActionModeMenuItems();

    boolean getDisplayZoomControls();

    boolean getDomStorageEnabled();

    String getFantasyFontFamily();

    String getFixedFontFamily();

    int getForceDark();

    @XWEB_BUILDFLAG.XWEB_DARK_MODE
    int getForceDarkBehavior();

    @XWEB_BUILDFLAG.XWEB_DARK_MODE
    int getForceDarkMode();

    boolean getJavaScriptCanOpenWindowsAutomatically();

    boolean getJavaScriptEnabled();

    @XWEB_BUILDFLAG.XWEB_JAVASCRIPT_CAN_ACCESS_CLIPBOARD
    boolean getJavascriptCanAccessClipboard();

    WebSettings.LayoutAlgorithm getLayoutAlgorithm();

    boolean getLoadWithOverviewMode();

    boolean getLoadsImagesAutomatically();

    boolean getMediaPlaybackRequiresUserGesture();

    int getMinimumFontSize();

    int getMinimumLogicalFontSize();

    int getMixedContentMode();

    boolean getOffscreenPreRaster();

    boolean getSafeBrowsingEnabled();

    String getSansSerifFontFamily();

    boolean getSaveFormData();

    boolean getSavePassword();

    String getSerifFontFamily();

    String getStandardFontFamily();

    int getTextZoom();

    boolean getUseWideViewPort();

    String getUserAgentString();

    @XWEB_BUILDFLAG.XWEB_COMMON
    int getUsingForAppBrand();

    @XWEB_BUILDFLAG.XWEB_VIDEO_AUTOPLAY_FLAG
    boolean getVideoPlaybackRequiresUserGesture();

    void setAllowContentAccess(boolean z);

    void setAllowFileAccess(boolean z);

    void setAllowFileAccessFromFileURLs(boolean z);

    void setAllowUniversalAccessFromFileURLs(boolean z);

    @XWEB_BUILDFLAG.XWEB_COMMON
    void setAppBrandInfo(Map<String, String> map);

    void setAppCacheEnabled(boolean z);

    void setAppCacheMaxSize(long j2);

    void setAppCachePath(String str);

    @XWEB_BUILDFLAG.XWEB_AUDIO_AUTOPLAY_FLAG
    void setAudioPlaybackRequiresUserGesture(boolean z);

    @XWEB_BUILDFLAG.XWEB_BACKGROUND_AUDIO_PAUSE
    void setBackgroundAudioPause(boolean z);

    void setBlockNetworkImage(boolean z);

    void setBlockNetworkLoads(boolean z);

    void setBuiltInZoomControls(boolean z);

    void setCacheMode(int i2);

    void setCursiveFontFamily(String str);

    void setDatabaseEnabled(boolean z);

    void setDatabasePath(String str);

    void setDefaultFixedFontSize(int i2);

    void setDefaultFontSize(int i2);

    void setDefaultTextEncodingName(String str);

    void setDisabledActionModeMenuItems(int i2);

    void setDisplayZoomControls(boolean z);

    void setDomStorageEnabled(boolean z);

    void setFantasyFontFamily(String str);

    void setFixedFontFamily(String str);

    void setForceDark(int i2);

    @XWEB_BUILDFLAG.XWEB_DARK_MODE
    void setForceDarkBehavior(int i2);

    @XWEB_BUILDFLAG.XWEB_DARK_MODE
    void setForceDarkMode(int i2);

    void setGeolocationEnabled(boolean z);

    void setJavaScriptCanOpenWindowsAutomatically(boolean z);

    void setJavaScriptEnabled(boolean z);

    @XWEB_BUILDFLAG.XWEB_JAVASCRIPT_CAN_ACCESS_CLIPBOARD
    void setJavascriptCanAccessClipboard(boolean z);

    void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm);

    void setLoadWithOverviewMode(boolean z);

    void setLoadsImagesAutomatically(boolean z);

    void setMediaPlaybackRequiresUserGesture(boolean z);

    void setMinimumFontSize(int i2);

    void setMinimumLogicalFontSize(int i2);

    void setMixedContentMode(int i2);

    void setNeedInitialFocus(boolean z);

    void setOffscreenPreRaster(boolean z);

    void setSafeBrowsingEnabled(boolean z);

    void setSansSerifFontFamily(String str);

    void setSaveFormData(boolean z);

    void setSavePassword(boolean z);

    void setSerifFontFamily(String str);

    void setStandardFontFamily(String str);

    void setSupportMultipleWindows(boolean z);

    void setSupportZoom(boolean z);

    void setTextZoom(int i2);

    void setUseWideViewPort(boolean z);

    void setUserAgentString(String str);

    @XWEB_BUILDFLAG.XWEB_COMMON
    void setUsingForAppBrand(int i2);

    @XWEB_BUILDFLAG.XWEB_VIDEO_HIDE_DOWNLOAD_UI
    void setVideoHideDownloadUi(boolean z);

    @XWEB_BUILDFLAG.XWEB_VIDEO_AUTOPLAY_FLAG
    void setVideoPlaybackRequiresUserGesture(boolean z);

    boolean supportMultipleWindows();

    boolean supportZoom();
}
