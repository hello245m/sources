package com.tencent.xweb.extension.video;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import com.tencent.xweb.VideoControl;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface VideoNativeInterface extends VideoControl {
    void disableJsCallback(boolean z);

    void evaluteJavascript(boolean z, boolean z2);

    boolean hasEnteredFullscreen();

    void init(Activity activity, View view, View view2, Context context, String str) throws Exception;

    void initConfigs(Bundle bundle);

    void onHideCustomView();

    void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback);

    void registerJavascriptInterface(Object obj);

    boolean setVideoJsCallback(Object obj);
}
