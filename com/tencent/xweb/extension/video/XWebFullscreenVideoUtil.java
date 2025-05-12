package com.tencent.xweb.extension.video;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebFullscreenVideoUtil {
    public static final String TAG = "XWebFullscreenVideoUtil";
    public static final String XWEB_FULLSCREEN_VIDEO_JAVASCRIPT_INTERFACE = "xwebToNative";
    public static final String XWEB_FULLSCREEN_VIDEO_JS_FILENAME = "xweb_fullscreen_video.js";
    public static final String XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_EXITFULLSCREEN = "xwebVideoBridge.xwebToJS_Video_ExitFullscreen();";
    public static final String XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_MUTE = "xwebVideoBridge.xwebToJS_Video_MuteChange(%b);";
    public static final String XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_MUTE_KEYWORD = "xwebVideoBridge.xwebToJS_Video_MuteChange";
    public static final String XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_NEW_PAUSE = "xwebVideoBridge.xwebToJS_Video_NewPause();";
    public static final String XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_NEW_PLAY = "xwebVideoBridge.xwebToJS_Video_NewPlay();";
    public static final String XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_PLAY = "xwebVideoBridge.xwebToJS_Video_Play();";
    public static final String XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_RATE_CHANGE = "xwebVideoBridge.xwebToJS_Video_RateChange(%f);";
    public static final String XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_RATE_CHANGE_KEYWORD = "xwebVideoBridge.xwebToJS_Video_RateChange";
    public static final String XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_SEEK = "xwebVideoBridge.xwebToJS_Video_Seek(%f);";

    public static String addDOMLoadedEventJS(String str) {
    }

    public static String initJs() {
    }
}
