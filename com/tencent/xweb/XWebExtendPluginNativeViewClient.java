package com.tencent.xweb;

import android.annotation.TargetApi;
import android.app.Presentation;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.display.VirtualDisplay;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.Surface;
import android.widget.FrameLayout;
import androidx.annotation.Keep;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebExtendPluginNativeViewClient {
    public static final String TAG = "XWebExtendPluginNativeViewClient";
    public final Context mContext;
    public XWebExtendPluginNativeViewDelegate mDelegate;
    public int mHeight;
    public NativeViewPresentation mNativeViewPresentation;
    public FrameLayout mRootView;
    public final Surface mSurface;
    public final SurfaceTexture mSurfaceTexture;
    public VirtualDisplay mVirtualDisplay;
    public int mWidth;

    @Keep
    @TargetApi(17)
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class NativeViewPresentation extends Presentation {
        public final XWebExtendPluginNativeViewClient mClient;
        public FrameLayout mContentView;
        public boolean mStartFocused;
        public final /* synthetic */ XWebExtendPluginNativeViewClient this$0;

        public NativeViewPresentation(XWebExtendPluginNativeViewClient xWebExtendPluginNativeViewClient, Context context, Display display, boolean z, XWebExtendPluginNativeViewClient xWebExtendPluginNativeViewClient2) {
        }

        public void detach() {
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
        }
    }

    public XWebExtendPluginNativeViewClient(Context context, SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    public static /* synthetic */ FrameLayout access$000(XWebExtendPluginNativeViewClient xWebExtendPluginNativeViewClient) {
    }

    public static /* synthetic */ FrameLayout access$002(XWebExtendPluginNativeViewClient xWebExtendPluginNativeViewClient, FrameLayout frameLayout) {
    }

    public static /* synthetic */ XWebExtendPluginNativeViewDelegate access$100(XWebExtendPluginNativeViewClient xWebExtendPluginNativeViewClient) {
    }

    public static /* synthetic */ int access$200(XWebExtendPluginNativeViewClient xWebExtendPluginNativeViewClient) {
    }

    public static /* synthetic */ int access$300(XWebExtendPluginNativeViewClient xWebExtendPluginNativeViewClient) {
    }

    private void refresh(boolean z) {
    }

    public void dispose() {
    }

    public Context getContext() {
    }

    public FrameLayout getRootView() {
    }

    public void onNativeViewDestroy(int i2) {
    }

    public void onNativeViewReady(int i2) {
    }

    public void onNativeViewSizeChanged(int i2, int i3, int i4) {
    }

    public void onNativeViewTouch(int i2, MotionEvent motionEvent) {
    }

    public void onSizeChanged(int i2, int i3) {
    }

    public void setDelegate(XWebExtendPluginNativeViewDelegate xWebExtendPluginNativeViewDelegate) {
    }

    public XWebExtendPluginNativeViewClient(Context context, Surface surface, int i2, int i3) {
    }
}
