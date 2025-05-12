package com.tencent.xweb;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.Surface;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface ExtendPluginClient {
    void onPluginDestroy(String str, int i2);

    void onPluginManagerDestroy();

    void onPluginReady(String str, int i2, SurfaceTexture surfaceTexture);

    void onPluginReadyForGPUProcess(String str, int i2, Surface surface);

    void onPluginScreenshotTaken(String str, int i2, Bitmap bitmap);

    void onPluginSizeChanged(String str, int i2, int i3, int i4, SurfaceTexture surfaceTexture);

    void onPluginSizeChangedForGPUProcess(String str, int i2, int i3, int i4, Surface surface);

    void onPluginTouch(String str, int i2, MotionEvent motionEvent);
}
