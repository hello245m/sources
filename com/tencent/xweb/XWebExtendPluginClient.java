package com.tencent.xweb;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.Surface;
import com.tencent.xweb.compatible.PinusAdaptClient;
import java.util.HashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebExtendPluginClient extends PinusAdaptClient implements ExtendPluginClient {
    public static final String NATIVE_VIEW_TYPE = "native_view";
    public static final String TAG = "XWebExtendPluginClient";
    public final HashMap<Integer, XWebExtendPluginNativeViewClient> mNativeViewClientMap;
    public WebView obj;

    public XWebExtendPluginClient(XWebExtendInterface xWebExtendInterface) {
    }

    @Override // com.tencent.xweb.compatible.PinusAdaptClient
    public void initPSWebView(com.tencent.xweb.pinus.sdk.WebView webView) {
    }

    public XWebExtendPluginNativeViewDelegate onNativeViewReady(int i2) {
    }

    @Override // com.tencent.xweb.ExtendPluginClient
    public void onPluginDestroy(String str, int i2) {
    }

    @Override // com.tencent.xweb.ExtendPluginClient
    public void onPluginManagerDestroy() {
    }

    @Override // com.tencent.xweb.ExtendPluginClient
    public void onPluginReady(String str, int i2, SurfaceTexture surfaceTexture) {
    }

    @Override // com.tencent.xweb.ExtendPluginClient
    public void onPluginReadyForGPUProcess(String str, int i2, Surface surface) {
    }

    @Override // com.tencent.xweb.ExtendPluginClient
    public void onPluginScreenshotTaken(String str, int i2, Bitmap bitmap) {
    }

    @Override // com.tencent.xweb.ExtendPluginClient
    public void onPluginSizeChanged(String str, int i2, int i3, int i4, SurfaceTexture surfaceTexture) {
    }

    @Override // com.tencent.xweb.ExtendPluginClient
    public void onPluginSizeChangedForGPUProcess(String str, int i2, int i3, int i4, Surface surface) {
    }

    @Override // com.tencent.xweb.ExtendPluginClient
    public void onPluginTouch(String str, int i2, MotionEvent motionEvent) {
    }

    public void onPluginTouch(String str, int i2, String str2) {
    }

    public void setPluginTextureScale(String str, int i2, float f, float f2) {
    }

    public void takePluginScreenshot(String str, int i2) {
    }
}
