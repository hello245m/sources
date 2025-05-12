package com.tencent.xweb.pinus.sdk;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import com.tencent.xweb.XWEB_BUILDFLAG;
import com.tencent.xweb.util.ReflectMethod;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class WebSettingsInterfaceImpl implements WebSettingsInterface {
    public static final String TAG = "WebSettingsInterfaceImpl";

    @XWEB_BUILDFLAG.XWEB_LONG_PRESS_TIME_CUSTOMIZE
    public ReflectMethod disableCustomizedLongPressTimeoutMethod;

    @XWEB_BUILDFLAG.XWEB_LONG_PRESS_TIME_CUSTOMIZE
    public ReflectMethod enableCustomizedLongPressTimeoutintMethod;
    public ReflectMethod getAllowContentAccessMethod;
    public ReflectMethod getAllowFileAccessFromFileURLsMethod;
    public ReflectMethod getAllowFileAccessMethod;
    public ReflectMethod getAllowUniversalAccessFromFileURLsMethod;

    @XWEB_BUILDFLAG.XWEB_COMMON
    public ReflectMethod getAppBrandInfoMethod;

    @XWEB_BUILDFLAG.XWEB_AUDIO_AUTOPLAY_FLAG
    public ReflectMethod getAudioPlaybackRequiresUserGestureMethod;

    @XWEB_BUILDFLAG.XWEB_BACKGROUND_AUDIO_PAUSE
    public ReflectMethod getBackgroundAudioPauseMethod;
    public ReflectMethod getBlockNetworkImageMethod;
    public ReflectMethod getBlockNetworkLoadsMethod;
    public ReflectMethod getBuiltInZoomControlsMethod;
    public ReflectMethod getCacheModeMethod;
    public ReflectMethod getCursiveFontFamilyMethod;
    public ReflectMethod getDatabaseEnabledMethod;
    public ReflectMethod getDatabasePathMethod;
    public ReflectMethod getDefaultFixedFontSizeMethod;
    public ReflectMethod getDefaultFontSizeMethod;
    public ReflectMethod getDefaultTextEncodingNameMethod;
    public ReflectMethod getDisabledActionModeMenuItemsMethod;
    public ReflectMethod getDisplayZoomControlsMethod;
    public ReflectMethod getDomStorageEnabledMethod;
    public ReflectMethod getFantasyFontFamilyMethod;
    public ReflectMethod getFixedFontFamilyMethod;

    @XWEB_BUILDFLAG.XWEB_DARK_MODE
    public ReflectMethod getForceDarkBehaviorMethod;
    public ReflectMethod getForceDarkMethod;

    @XWEB_BUILDFLAG.XWEB_DARK_MODE
    public ReflectMethod getForceDarkModeMethod;
    public ReflectMethod getJavaScriptCanOpenWindowsAutomaticallyMethod;
    public ReflectMethod getJavaScriptEnabledMethod;

    @XWEB_BUILDFLAG.XWEB_JAVASCRIPT_CAN_ACCESS_CLIPBOARD
    public ReflectMethod getJavascriptCanAccessClipboardMethod;
    public ReflectMethod getLayoutAlgorithmMethod;
    public ReflectMethod getLoadWithOverviewModeMethod;
    public ReflectMethod getLoadsImagesAutomaticallyMethod;
    public ReflectMethod getMediaPlaybackRequiresUserGestureMethod;
    public ReflectMethod getMinimumFontSizeMethod;
    public ReflectMethod getMinimumLogicalFontSizeMethod;
    public ReflectMethod getMixedContentModeMethod;
    public ReflectMethod getOffscreenPreRasterMethod;
    public ReflectMethod getSafeBrowsingEnabledMethod;
    public ReflectMethod getSansSerifFontFamilyMethod;
    public ReflectMethod getSaveFormDataMethod;
    public ReflectMethod getSavePasswordMethod;
    public ReflectMethod getSerifFontFamilyMethod;
    public ReflectMethod getStandardFontFamilyMethod;
    public ReflectMethod getTextZoomMethod;
    public ReflectMethod getUseWideViewPortMethod;
    public ReflectMethod getUserAgentStringMethod;

    @XWEB_BUILDFLAG.XWEB_COMMON
    public ReflectMethod getUsingForAppBrandMethod;

    @XWEB_BUILDFLAG.XWEB_VIDEO_AUTOPLAY_FLAG
    public ReflectMethod getVideoPlaybackRequiresUserGestureMethod;
    public final Object inner;
    public ReflectMethod setAllowContentAccessbooleanMethod;
    public ReflectMethod setAllowFileAccessFromFileURLsbooleanMethod;
    public ReflectMethod setAllowFileAccessbooleanMethod;
    public ReflectMethod setAllowUniversalAccessFromFileURLsbooleanMethod;

    @XWEB_BUILDFLAG.XWEB_COMMON
    public ReflectMethod setAppBrandInfoMapStringStringMethod;
    public ReflectMethod setAppCacheEnabledbooleanMethod;
    public ReflectMethod setAppCacheMaxSizelongMethod;
    public ReflectMethod setAppCachePathStringMethod;

    @XWEB_BUILDFLAG.XWEB_AUDIO_AUTOPLAY_FLAG
    public ReflectMethod setAudioPlaybackRequiresUserGesturebooleanMethod;

    @XWEB_BUILDFLAG.XWEB_BACKGROUND_AUDIO_PAUSE
    public ReflectMethod setBackgroundAudioPausebooleanMethod;
    public ReflectMethod setBlockNetworkImagebooleanMethod;
    public ReflectMethod setBlockNetworkLoadsbooleanMethod;
    public ReflectMethod setBuiltInZoomControlsbooleanMethod;
    public ReflectMethod setCacheModeintMethod;
    public ReflectMethod setCursiveFontFamilyStringMethod;
    public ReflectMethod setDatabaseEnabledbooleanMethod;
    public ReflectMethod setDatabasePathStringMethod;
    public ReflectMethod setDefaultFixedFontSizeintMethod;
    public ReflectMethod setDefaultFontSizeintMethod;
    public ReflectMethod setDefaultTextEncodingNameStringMethod;
    public ReflectMethod setDisabledActionModeMenuItemsintMethod;
    public ReflectMethod setDisplayZoomControlsbooleanMethod;
    public ReflectMethod setDomStorageEnabledbooleanMethod;
    public ReflectMethod setFantasyFontFamilyStringMethod;
    public ReflectMethod setFixedFontFamilyStringMethod;

    @XWEB_BUILDFLAG.XWEB_DARK_MODE
    public ReflectMethod setForceDarkBehaviorintMethod;

    @XWEB_BUILDFLAG.XWEB_DARK_MODE
    public ReflectMethod setForceDarkModeintMethod;
    public ReflectMethod setForceDarkintMethod;
    public ReflectMethod setGeolocationEnabledbooleanMethod;
    public ReflectMethod setJavaScriptCanOpenWindowsAutomaticallybooleanMethod;
    public ReflectMethod setJavaScriptEnabledbooleanMethod;

    @XWEB_BUILDFLAG.XWEB_JAVASCRIPT_CAN_ACCESS_CLIPBOARD
    public ReflectMethod setJavascriptCanAccessClipboardbooleanMethod;
    public ReflectMethod setLayoutAlgorithmWebSettingsLayoutAlgorithmMethod;
    public ReflectMethod setLoadWithOverviewModebooleanMethod;
    public ReflectMethod setLoadsImagesAutomaticallybooleanMethod;
    public ReflectMethod setMediaPlaybackRequiresUserGesturebooleanMethod;
    public ReflectMethod setMinimumFontSizeintMethod;
    public ReflectMethod setMinimumLogicalFontSizeintMethod;
    public ReflectMethod setMixedContentModeintMethod;
    public ReflectMethod setNeedInitialFocusbooleanMethod;
    public ReflectMethod setOffscreenPreRasterbooleanMethod;
    public ReflectMethod setSafeBrowsingEnabledbooleanMethod;
    public ReflectMethod setSansSerifFontFamilyStringMethod;
    public ReflectMethod setSaveFormDatabooleanMethod;
    public ReflectMethod setSavePasswordbooleanMethod;
    public ReflectMethod setSerifFontFamilyStringMethod;
    public ReflectMethod setStandardFontFamilyStringMethod;
    public ReflectMethod setSupportMultipleWindowsbooleanMethod;
    public ReflectMethod setSupportZoombooleanMethod;
    public ReflectMethod setTextZoomintMethod;
    public ReflectMethod setUseWideViewPortbooleanMethod;
    public ReflectMethod setUserAgentStringStringMethod;

    @XWEB_BUILDFLAG.XWEB_COMMON
    public ReflectMethod setUsingForAppBrandintMethod;

    @XWEB_BUILDFLAG.XWEB_VIDEO_HIDE_DOWNLOAD_UI
    public ReflectMethod setVideoHideDownloadUibooleanMethod;

    @XWEB_BUILDFLAG.XWEB_VIDEO_AUTOPLAY_FLAG
    public ReflectMethod setVideoPlaybackRequiresUserGesturebooleanMethod;
    public ReflectMethod supportMultipleWindowsMethod;
    public ReflectMethod supportZoomMethod;

    public WebSettingsInterfaceImpl(Object obj) {
    }

    @XWEB_BUILDFLAG.XWEB_LONG_PRESS_TIME_CUSTOMIZE
    private synchronized ReflectMethod getDisableCustomizedLongPressTimeoutMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_LONG_PRESS_TIME_CUSTOMIZE
    private synchronized ReflectMethod getEnableCustomizedLongPressTimeoutintMethod() {
    }

    private synchronized ReflectMethod getGetAllowContentAccessMethod() {
    }

    private synchronized ReflectMethod getGetAllowFileAccessFromFileURLsMethod() {
    }

    private synchronized ReflectMethod getGetAllowFileAccessMethod() {
    }

    private synchronized ReflectMethod getGetAllowUniversalAccessFromFileURLsMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_COMMON
    private synchronized ReflectMethod getGetAppBrandInfoMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_AUDIO_AUTOPLAY_FLAG
    private synchronized ReflectMethod getGetAudioPlaybackRequiresUserGestureMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_BACKGROUND_AUDIO_PAUSE
    private synchronized ReflectMethod getGetBackgroundAudioPauseMethod() {
    }

    private synchronized ReflectMethod getGetBlockNetworkImageMethod() {
    }

    private synchronized ReflectMethod getGetBlockNetworkLoadsMethod() {
    }

    private synchronized ReflectMethod getGetBuiltInZoomControlsMethod() {
    }

    private synchronized ReflectMethod getGetCacheModeMethod() {
    }

    private synchronized ReflectMethod getGetCursiveFontFamilyMethod() {
    }

    private synchronized ReflectMethod getGetDatabaseEnabledMethod() {
    }

    private synchronized ReflectMethod getGetDatabasePathMethod() {
    }

    private synchronized ReflectMethod getGetDefaultFixedFontSizeMethod() {
    }

    private synchronized ReflectMethod getGetDefaultFontSizeMethod() {
    }

    private synchronized ReflectMethod getGetDefaultTextEncodingNameMethod() {
    }

    private synchronized ReflectMethod getGetDisabledActionModeMenuItemsMethod() {
    }

    private synchronized ReflectMethod getGetDisplayZoomControlsMethod() {
    }

    private synchronized ReflectMethod getGetDomStorageEnabledMethod() {
    }

    private synchronized ReflectMethod getGetFantasyFontFamilyMethod() {
    }

    private synchronized ReflectMethod getGetFixedFontFamilyMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_DARK_MODE
    private synchronized ReflectMethod getGetForceDarkBehaviorMethod() {
    }

    private synchronized ReflectMethod getGetForceDarkMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_DARK_MODE
    private synchronized ReflectMethod getGetForceDarkModeMethod() {
    }

    private synchronized ReflectMethod getGetJavaScriptCanOpenWindowsAutomaticallyMethod() {
    }

    private synchronized ReflectMethod getGetJavaScriptEnabledMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_JAVASCRIPT_CAN_ACCESS_CLIPBOARD
    private synchronized ReflectMethod getGetJavascriptCanAccessClipboardMethod() {
    }

    private synchronized ReflectMethod getGetLayoutAlgorithmMethod() {
    }

    private synchronized ReflectMethod getGetLoadWithOverviewModeMethod() {
    }

    private synchronized ReflectMethod getGetLoadsImagesAutomaticallyMethod() {
    }

    private synchronized ReflectMethod getGetMediaPlaybackRequiresUserGestureMethod() {
    }

    private synchronized ReflectMethod getGetMinimumFontSizeMethod() {
    }

    private synchronized ReflectMethod getGetMinimumLogicalFontSizeMethod() {
    }

    private synchronized ReflectMethod getGetMixedContentModeMethod() {
    }

    private synchronized ReflectMethod getGetOffscreenPreRasterMethod() {
    }

    private synchronized ReflectMethod getGetSafeBrowsingEnabledMethod() {
    }

    private synchronized ReflectMethod getGetSansSerifFontFamilyMethod() {
    }

    private synchronized ReflectMethod getGetSaveFormDataMethod() {
    }

    private synchronized ReflectMethod getGetSavePasswordMethod() {
    }

    private synchronized ReflectMethod getGetSerifFontFamilyMethod() {
    }

    private synchronized ReflectMethod getGetStandardFontFamilyMethod() {
    }

    private synchronized ReflectMethod getGetTextZoomMethod() {
    }

    private synchronized ReflectMethod getGetUseWideViewPortMethod() {
    }

    private synchronized ReflectMethod getGetUserAgentStringMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_COMMON
    private synchronized ReflectMethod getGetUsingForAppBrandMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_VIDEO_AUTOPLAY_FLAG
    private synchronized ReflectMethod getGetVideoPlaybackRequiresUserGestureMethod() {
    }

    private synchronized ReflectMethod getSetAllowContentAccessbooleanMethod() {
    }

    private synchronized ReflectMethod getSetAllowFileAccessFromFileURLsbooleanMethod() {
    }

    private synchronized ReflectMethod getSetAllowFileAccessbooleanMethod() {
    }

    private synchronized ReflectMethod getSetAllowUniversalAccessFromFileURLsbooleanMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_COMMON
    private synchronized ReflectMethod getSetAppBrandInfoMapStringStringMethod() {
    }

    private synchronized ReflectMethod getSetAppCacheEnabledbooleanMethod() {
    }

    private synchronized ReflectMethod getSetAppCacheMaxSizelongMethod() {
    }

    private synchronized ReflectMethod getSetAppCachePathStringMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_AUDIO_AUTOPLAY_FLAG
    private synchronized ReflectMethod getSetAudioPlaybackRequiresUserGesturebooleanMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_BACKGROUND_AUDIO_PAUSE
    private synchronized ReflectMethod getSetBackgroundAudioPausebooleanMethod() {
    }

    private synchronized ReflectMethod getSetBlockNetworkImagebooleanMethod() {
    }

    private synchronized ReflectMethod getSetBlockNetworkLoadsbooleanMethod() {
    }

    private synchronized ReflectMethod getSetBuiltInZoomControlsbooleanMethod() {
    }

    private synchronized ReflectMethod getSetCacheModeintMethod() {
    }

    private synchronized ReflectMethod getSetCursiveFontFamilyStringMethod() {
    }

    private synchronized ReflectMethod getSetDatabaseEnabledbooleanMethod() {
    }

    private synchronized ReflectMethod getSetDatabasePathStringMethod() {
    }

    private synchronized ReflectMethod getSetDefaultFixedFontSizeintMethod() {
    }

    private synchronized ReflectMethod getSetDefaultFontSizeintMethod() {
    }

    private synchronized ReflectMethod getSetDefaultTextEncodingNameStringMethod() {
    }

    private synchronized ReflectMethod getSetDisabledActionModeMenuItemsintMethod() {
    }

    private synchronized ReflectMethod getSetDisplayZoomControlsbooleanMethod() {
    }

    private synchronized ReflectMethod getSetDomStorageEnabledbooleanMethod() {
    }

    private synchronized ReflectMethod getSetFantasyFontFamilyStringMethod() {
    }

    private synchronized ReflectMethod getSetFixedFontFamilyStringMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_DARK_MODE
    private synchronized ReflectMethod getSetForceDarkBehaviorintMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_DARK_MODE
    private synchronized ReflectMethod getSetForceDarkModeintMethod() {
    }

    private synchronized ReflectMethod getSetForceDarkintMethod() {
    }

    private synchronized ReflectMethod getSetGeolocationEnabledbooleanMethod() {
    }

    private synchronized ReflectMethod getSetJavaScriptCanOpenWindowsAutomaticallybooleanMethod() {
    }

    private synchronized ReflectMethod getSetJavaScriptEnabledbooleanMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_JAVASCRIPT_CAN_ACCESS_CLIPBOARD
    private synchronized ReflectMethod getSetJavascriptCanAccessClipboardbooleanMethod() {
    }

    private synchronized ReflectMethod getSetLayoutAlgorithmWebSettingsLayoutAlgorithmMethod() {
    }

    private synchronized ReflectMethod getSetLoadWithOverviewModebooleanMethod() {
    }

    private synchronized ReflectMethod getSetLoadsImagesAutomaticallybooleanMethod() {
    }

    private synchronized ReflectMethod getSetMediaPlaybackRequiresUserGesturebooleanMethod() {
    }

    private synchronized ReflectMethod getSetMinimumFontSizeintMethod() {
    }

    private synchronized ReflectMethod getSetMinimumLogicalFontSizeintMethod() {
    }

    private synchronized ReflectMethod getSetMixedContentModeintMethod() {
    }

    private synchronized ReflectMethod getSetNeedInitialFocusbooleanMethod() {
    }

    private synchronized ReflectMethod getSetOffscreenPreRasterbooleanMethod() {
    }

    private synchronized ReflectMethod getSetSafeBrowsingEnabledbooleanMethod() {
    }

    private synchronized ReflectMethod getSetSansSerifFontFamilyStringMethod() {
    }

    private synchronized ReflectMethod getSetSaveFormDatabooleanMethod() {
    }

    private synchronized ReflectMethod getSetSavePasswordbooleanMethod() {
    }

    private synchronized ReflectMethod getSetSerifFontFamilyStringMethod() {
    }

    private synchronized ReflectMethod getSetStandardFontFamilyStringMethod() {
    }

    private synchronized ReflectMethod getSetSupportMultipleWindowsbooleanMethod() {
    }

    private synchronized ReflectMethod getSetSupportZoombooleanMethod() {
    }

    private synchronized ReflectMethod getSetTextZoomintMethod() {
    }

    private synchronized ReflectMethod getSetUseWideViewPortbooleanMethod() {
    }

    private synchronized ReflectMethod getSetUserAgentStringStringMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_COMMON
    private synchronized ReflectMethod getSetUsingForAppBrandintMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_VIDEO_HIDE_DOWNLOAD_UI
    private synchronized ReflectMethod getSetVideoHideDownloadUibooleanMethod() {
    }

    @XWEB_BUILDFLAG.XWEB_VIDEO_AUTOPLAY_FLAG
    private synchronized ReflectMethod getSetVideoPlaybackRequiresUserGesturebooleanMethod() {
    }

    private synchronized ReflectMethod getSupportMultipleWindowsMethod() {
    }

    private synchronized ReflectMethod getSupportZoomMethod() {
    }

    @SuppressLint({"LongLogTag"})
    public static void handleRuntimeError(Exception exc) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    @XWEB_BUILDFLAG.XWEB_LONG_PRESS_TIME_CUSTOMIZE
    public void disableCustomizedLongPressTimeout() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    @XWEB_BUILDFLAG.XWEB_LONG_PRESS_TIME_CUSTOMIZE
    public void enableCustomizedLongPressTimeout(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean getAllowContentAccess() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean getAllowFileAccess() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean getAllowFileAccessFromFileURLs() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean getAllowUniversalAccessFromFileURLs() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    @XWEB_BUILDFLAG.XWEB_COMMON
    public Map<String, String> getAppBrandInfo() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    @XWEB_BUILDFLAG.XWEB_AUDIO_AUTOPLAY_FLAG
    public boolean getAudioPlaybackRequiresUserGesture() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    @XWEB_BUILDFLAG.XWEB_BACKGROUND_AUDIO_PAUSE
    public boolean getBackgroundAudioPause() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean getBlockNetworkImage() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean getBlockNetworkLoads() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean getBuiltInZoomControls() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public int getCacheMode() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public String getCursiveFontFamily() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean getDatabaseEnabled() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public String getDatabasePath() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public int getDefaultFixedFontSize() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public int getDefaultFontSize() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public String getDefaultTextEncodingName() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public int getDisabledActionModeMenuItems() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean getDisplayZoomControls() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean getDomStorageEnabled() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public String getFantasyFontFamily() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public String getFixedFontFamily() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public int getForceDark() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    @XWEB_BUILDFLAG.XWEB_DARK_MODE
    public int getForceDarkBehavior() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    @XWEB_BUILDFLAG.XWEB_DARK_MODE
    public int getForceDarkMode() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean getJavaScriptCanOpenWindowsAutomatically() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean getJavaScriptEnabled() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    @XWEB_BUILDFLAG.XWEB_JAVASCRIPT_CAN_ACCESS_CLIPBOARD
    public boolean getJavascriptCanAccessClipboard() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public WebSettings.LayoutAlgorithm getLayoutAlgorithm() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean getLoadWithOverviewMode() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean getLoadsImagesAutomatically() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean getMediaPlaybackRequiresUserGesture() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public int getMinimumFontSize() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public int getMinimumLogicalFontSize() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public int getMixedContentMode() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean getOffscreenPreRaster() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean getSafeBrowsingEnabled() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public String getSansSerifFontFamily() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean getSaveFormData() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean getSavePassword() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public String getSerifFontFamily() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public String getStandardFontFamily() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public int getTextZoom() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean getUseWideViewPort() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public String getUserAgentString() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    @XWEB_BUILDFLAG.XWEB_COMMON
    public int getUsingForAppBrand() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    @XWEB_BUILDFLAG.XWEB_VIDEO_AUTOPLAY_FLAG
    public boolean getVideoPlaybackRequiresUserGesture() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setAllowContentAccess(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setAllowFileAccess(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setAllowFileAccessFromFileURLs(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setAllowUniversalAccessFromFileURLs(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    @XWEB_BUILDFLAG.XWEB_COMMON
    public void setAppBrandInfo(Map<String, String> map) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setAppCacheEnabled(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setAppCacheMaxSize(long j2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setAppCachePath(String str) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    @XWEB_BUILDFLAG.XWEB_AUDIO_AUTOPLAY_FLAG
    public void setAudioPlaybackRequiresUserGesture(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    @XWEB_BUILDFLAG.XWEB_BACKGROUND_AUDIO_PAUSE
    public void setBackgroundAudioPause(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setBlockNetworkImage(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setBlockNetworkLoads(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setBuiltInZoomControls(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setCacheMode(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setCursiveFontFamily(String str) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setDatabaseEnabled(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setDatabasePath(String str) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setDefaultFixedFontSize(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setDefaultFontSize(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setDefaultTextEncodingName(String str) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setDisabledActionModeMenuItems(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setDisplayZoomControls(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setDomStorageEnabled(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setFantasyFontFamily(String str) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setFixedFontFamily(String str) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setForceDark(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    @XWEB_BUILDFLAG.XWEB_DARK_MODE
    public void setForceDarkBehavior(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    @XWEB_BUILDFLAG.XWEB_DARK_MODE
    public void setForceDarkMode(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setGeolocationEnabled(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setJavaScriptEnabled(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    @XWEB_BUILDFLAG.XWEB_JAVASCRIPT_CAN_ACCESS_CLIPBOARD
    public void setJavascriptCanAccessClipboard(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setLoadWithOverviewMode(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setLoadsImagesAutomatically(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setMediaPlaybackRequiresUserGesture(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setMinimumFontSize(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setMinimumLogicalFontSize(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setMixedContentMode(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setNeedInitialFocus(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setOffscreenPreRaster(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setSafeBrowsingEnabled(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setSansSerifFontFamily(String str) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setSaveFormData(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setSavePassword(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setSerifFontFamily(String str) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setStandardFontFamily(String str) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setSupportMultipleWindows(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setSupportZoom(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setTextZoom(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setUseWideViewPort(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public void setUserAgentString(String str) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    @XWEB_BUILDFLAG.XWEB_COMMON
    public void setUsingForAppBrand(int i2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    @XWEB_BUILDFLAG.XWEB_VIDEO_HIDE_DOWNLOAD_UI
    public void setVideoHideDownloadUi(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    @XWEB_BUILDFLAG.XWEB_VIDEO_AUTOPLAY_FLAG
    public void setVideoPlaybackRequiresUserGesture(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean supportMultipleWindows() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebSettingsInterface
    public boolean supportZoom() {
    }
}
