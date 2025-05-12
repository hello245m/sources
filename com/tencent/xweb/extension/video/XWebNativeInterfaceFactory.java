package com.tencent.xweb.extension.video;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import com.tencent.xweb.WebView;
import com.tencent.xweb.util.ReflectMethod;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebNativeInterfaceFactory {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TAG = "XWebNativeInterfaceFactory";
    public static final String VIDEO_NATIVE_RUNTIME_CLASS_NAME = "org.xwalk.core.internal.videofullscreen.XWebNativeInterfaceInternal";

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class VideoNativeInterfaceRuntime implements VideoNativeInterface {
        public static final String TAG = "VideoNativeInterfaceRuntime";
        public final ReflectMethod disableJsCallbackMethod;
        public final ReflectMethod evaluteJavascriptMethod;
        public final ReflectMethod hasEnteredFullscreenMethod;
        public final ReflectMethod initActivityObjectStringMethod;
        public final ReflectMethod initConfigsBundleMethod;
        public final Object mReflectionObject;
        public final ReflectMethod onHideCustomViewMethod;
        public final ReflectMethod onShowCustomViewMethod;
        public final ReflectMethod registerJavascriptInterfaceMethod;
        public final ReflectMethod setVideoJsCallbackMethod;
        public final ReflectMethod supportSetRequestedOrientationCallbackMethod;
        public final ReflectMethod videoChangeStatusMethod;
        public final ReflectMethod videoExitFullscreenMethod;
        public final ReflectMethod videoMuteMethod;
        public final ReflectMethod videoPauseMethod;
        public final ReflectMethod videoPlayMethod;
        public final ReflectMethod videoPlaybackRateMethod;
        public final ReflectMethod videoSeekMethod;

        public VideoNativeInterfaceRuntime(Object obj) {
        }

        @Override // com.tencent.xweb.extension.video.VideoNativeInterface
        public void disableJsCallback(boolean z) {
        }

        @Override // com.tencent.xweb.extension.video.VideoNativeInterface
        public void evaluteJavascript(boolean z, boolean z2) {
        }

        @Override // com.tencent.xweb.extension.video.VideoNativeInterface
        public boolean hasEnteredFullscreen() {
        }

        @Override // com.tencent.xweb.extension.video.VideoNativeInterface
        public void init(Activity activity, View view, View view2, Context context, String str) throws Exception {
        }

        @Override // com.tencent.xweb.extension.video.VideoNativeInterface
        public void initConfigs(Bundle bundle) {
        }

        @Override // com.tencent.xweb.extension.video.VideoNativeInterface
        public void onHideCustomView() {
        }

        @Override // com.tencent.xweb.extension.video.VideoNativeInterface
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        }

        @Override // com.tencent.xweb.extension.video.VideoNativeInterface
        public void registerJavascriptInterface(Object obj) {
        }

        @Override // com.tencent.xweb.extension.video.VideoNativeInterface
        public boolean setVideoJsCallback(Object obj) {
        }

        @Override // com.tencent.xweb.VideoControl
        public boolean supportSetRequestedOrientationCallback() {
        }

        @Override // com.tencent.xweb.VideoControl
        public void videoChangeStatus() {
        }

        @Override // com.tencent.xweb.VideoControl
        public void videoExitFullscreen() {
        }

        @Override // com.tencent.xweb.VideoControl
        public void videoMute(boolean z) {
        }

        @Override // com.tencent.xweb.VideoControl
        public void videoPause() {
        }

        @Override // com.tencent.xweb.VideoControl
        public void videoPlay() {
        }

        @Override // com.tencent.xweb.VideoControl
        public void videoPlaybackRate(double d) {
        }

        @Override // com.tencent.xweb.VideoControl
        public void videoSeek(double d) {
        }
    }

    public static VideoNativeInterface createXWebNativeInterface(WebView.WebViewKind webViewKind, Context context, WebView webView, View view, String str) {
    }

    public static VideoNativeInterfaceRuntime createXWebNativeInterfaceByOthers(Context context, WebView webView, View view, String str) {
    }

    public static VideoNativeInterfaceRuntime createXWebNativeInterfaceByPinus(Context context, WebView webView, View view, String str) {
    }

    public static Bundle getVideoConfigBundle() {
    }

    public static VideoNativeInterfaceRuntime getVideoNativeInterfaceRuntime(Context context, WebView webView, View view, String str, Class<?> cls) throws IllegalAccessException, InstantiationException {
    }
}
