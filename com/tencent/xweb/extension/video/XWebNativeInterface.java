package com.tencent.xweb.extension.video;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.xweb.VideoJsCallback;
import com.tencent.xweb.WebView;
import com.tencent.xweb.extension.video.VideoPlayerSeekBar;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebNativeInterface implements VideoNativeInterface, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public static final int AUTO_HIDE_INTERVAL = 7000;
    public static final int BRIGHTNESS_CONTROL = 2;
    public static final int INVALID_ORIENTATION = -3;
    public static final int MIN_DISTANCE_PROGRESS_CONTROL = 1;
    public static final int MODE_DEFAULT = 0;
    public static final int MODE_ZOOM = 1;
    public static final int NONE_CONTROL = 0;
    public static final int PROGRESS_CONTROL = 3;
    public static final String TAG = "XWebNativeInterface";
    public static final int VOLUME_CONTROL = 1;
    public final Application.ActivityLifecycleCallbacks mActivityLifecycleCallbacks;
    public Application mApplication;
    public AudioManager mAudioManager;
    public Drawable mBackgroundDrawable;
    public FrameLayout mBackgroundView;
    public float mBrightness;
    public WebChromeClient.CustomViewCallback mCallback;
    public ViewGroup mControlView;
    public Timer mControlViewTimer;
    public int mCurrentOrientation;
    public GestureDetector mDetector;
    public boolean mDisableJsCallback;
    public boolean mEnableMute;
    public boolean mEnableSpeed;
    public WeakReference<Activity> mFullscreenActivity;
    public FullscreenStatus mFullscreenStatus;
    public boolean mHasInited;
    public final int mHideTime;
    public ImageView mImageBack;
    public ImageView mImageExit;
    public ImageView mImageMute;
    public ImageView mImagePlay;
    public boolean mImmersiveSticky;
    public boolean mIsFullscreen;
    public boolean mIsResumed;
    public int mLastSystemUiVisibility;
    public ClickableFrameLayout mLayoutBlank;
    public WindowManager.LayoutParams mLayoutParams;
    public View mLayoutProgress;
    public FrameLayout mLayoutRate;
    public VideoStatusLayout mLayoutStatus;
    public LinearLayout mLayoutTitleBar;
    public LinearLayout mLayoutVideoControl;
    public int mMaxVideoVolume;
    public int mMode;
    public float mNewVideoProgress;
    public float mOldVideoProgress;
    public double mOldVideoVolume;
    public OrientationEventListener mOrientationEventListener;
    public boolean mOriginalForceNotFullscreen;
    public boolean mOriginalFullscreen;
    public int mPreOrientation;
    public ProgressBar mProgressLoading;
    public WindowFocusChangedFrameLayout mRootView;
    public ScaleGestureDetector mScaleDetector;
    public VideoPlayerSeekBar mSeekBar;
    public TextView mTextViewRate;
    public TextView mTextViewRate05;
    public TextView mTextViewRate075;
    public TextView mTextViewRate10;
    public TextView mTextViewRate15;
    public TextView mTextViewRate20;
    public TextView mTextViewRate30;
    public ViewGroup mTopViewParent;
    public int mTouchStatus;
    public TextView mTvCurrentTime;
    public TextView mTvTotalTime;
    public double mVideoDuration;
    public double mVideoHeight;
    public long mVideoId;
    public boolean mVideoIsEnterFullscreen;
    public String mVideoJs;
    public VideoJsCallback mVideoJsCallback;
    public boolean mVideoMuted;
    public double mVideoRate;
    public View mVideoView;
    public double mVideoWidth;
    public WebView mWebView;
    public int mWebViewDescendantFocusability;
    public int mWebViewUIDescendantFocusability;
    public Window mWindow;
    public final WindowFocusChangedFrameLayout.WindowFocusChangedListener mWindowFocusChangedListener;

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass1(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$10, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass10 implements View.OnClickListener {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass10(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$11, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass11 implements View.OnClickListener {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass11(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$12, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass12 implements View.OnClickListener {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass12(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$13, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass13 implements View.OnClickListener {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass13(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$14, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass14 implements ValueCallback<String> {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass14(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
        }

        /* renamed from: onReceiveValue, reason: avoid collision after fix types in other method */
        public void onReceiveValue2(String str) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$15, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass15 implements ValueCallback<String> {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass15(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
        }

        /* renamed from: onReceiveValue, reason: avoid collision after fix types in other method */
        public void onReceiveValue2(String str) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$16, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass16 implements ValueCallback<String> {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass16(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
        }

        /* renamed from: onReceiveValue, reason: avoid collision after fix types in other method */
        public void onReceiveValue2(String str) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$17, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass17 implements ValueCallback<String> {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass17(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
        }

        /* renamed from: onReceiveValue, reason: avoid collision after fix types in other method */
        public void onReceiveValue2(String str) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$18, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass18 implements ValueCallback<String> {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass18(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
        }

        /* renamed from: onReceiveValue, reason: avoid collision after fix types in other method */
        public void onReceiveValue2(String str) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$19, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass19 implements ValueCallback<String> {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass19(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
        }

        /* renamed from: onReceiveValue, reason: avoid collision after fix types in other method */
        public void onReceiveValue2(String str) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass2 implements View.OnTouchListener {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass2(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$20, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass20 implements ValueCallback<String> {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass20(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
        }

        /* renamed from: onReceiveValue, reason: avoid collision after fix types in other method */
        public void onReceiveValue2(String str) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$21, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass21 implements ValueCallback<String> {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass21(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
        }

        /* renamed from: onReceiveValue, reason: avoid collision after fix types in other method */
        public void onReceiveValue2(String str) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$22, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass22 implements Runnable {
        public final /* synthetic */ XWebNativeInterface this$0;
        public final /* synthetic */ Runnable val$runnable;

        public AnonymousClass22(XWebNativeInterface xWebNativeInterface, Runnable runnable) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$23, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass23 extends TimerTask {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass23(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$24, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass24 implements Runnable {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass24(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$25, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass25 implements Runnable {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass25(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$26, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass26 implements Runnable {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass26(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$27, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass27 implements Runnable {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass27(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$28, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass28 implements Runnable {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass28(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$29, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass29 implements Runnable {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass29(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass3 implements VideoPlayerSeekBar.IVideoPlaySeekCallback {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass3(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // com.tencent.xweb.extension.video.VideoPlayerSeekBar.IVideoPlaySeekCallback
        public void onProgressChanged(float f, boolean z) {
        }

        @Override // com.tencent.xweb.extension.video.VideoPlayerSeekBar.IVideoPlaySeekCallback
        public void onSeekPre() {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$30, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass30 implements Runnable {
        public final /* synthetic */ XWebNativeInterface this$0;
        public final /* synthetic */ boolean val$paused;

        public AnonymousClass30(XWebNativeInterface xWebNativeInterface, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$31, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass31 implements Runnable {
        public final /* synthetic */ XWebNativeInterface this$0;
        public final /* synthetic */ boolean val$muted;

        public AnonymousClass31(XWebNativeInterface xWebNativeInterface, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$32, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass32 implements Runnable {
        public final /* synthetic */ XWebNativeInterface this$0;
        public final /* synthetic */ double val$currentTime;
        public final /* synthetic */ boolean val$needChangeSeekBar;

        public AnonymousClass32(XWebNativeInterface xWebNativeInterface, boolean z, double d) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$33, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass33 implements Runnable {
        public final /* synthetic */ XWebNativeInterface this$0;
        public final /* synthetic */ double[] val$buffered;
        public final /* synthetic */ double val$duration;

        public AnonymousClass33(XWebNativeInterface xWebNativeInterface, double d, double[] dArr) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$34, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass34 implements Runnable {
        public final /* synthetic */ XWebNativeInterface this$0;
        public final /* synthetic */ double val$height;
        public final /* synthetic */ boolean val$isVideoTag;
        public final /* synthetic */ double val$width;

        public AnonymousClass34(XWebNativeInterface xWebNativeInterface, double d, double d2, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$35, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass35 implements Runnable {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass35(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$36, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass36 implements Runnable {
        public final /* synthetic */ XWebNativeInterface this$0;
        public final /* synthetic */ double val$height;
        public final /* synthetic */ double val$width;

        public AnonymousClass36(XWebNativeInterface xWebNativeInterface, double d, double d2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$37, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass37 implements Application.ActivityLifecycleCallbacks {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass37(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$38, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass38 implements WindowFocusChangedFrameLayout.WindowFocusChangedListener {
        public final /* synthetic */ XWebNativeInterface this$0;

        /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$38$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass38 this$1;

            public AnonymousClass1(AnonymousClass38 anonymousClass38) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass38(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // com.tencent.xweb.extension.video.XWebNativeInterface.WindowFocusChangedFrameLayout.WindowFocusChangedListener
        @SuppressLint({"WrongConstant"})
        public void onWindowFocusChanged(boolean z) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$39, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass39 extends OrientationEventListener {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass39(XWebNativeInterface xWebNativeInterface, Context context, int i2) {
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i2) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$4, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass4(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$40, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass40 implements Runnable {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass40(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$41, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass41 implements Runnable {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass41(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$5, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass5 implements View.OnClickListener {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass5(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$6, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass6 implements View.OnClickListener {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass6(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$7, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass7(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$8, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass8 implements View.OnClickListener {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass8(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.xweb.extension.video.XWebNativeInterface$9, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass9 implements View.OnClickListener {
        public final /* synthetic */ XWebNativeInterface this$0;

        public AnonymousClass9(XWebNativeInterface xWebNativeInterface) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class FullscreenStatus {
        public static final /* synthetic */ FullscreenStatus[] $VALUES = null;
        public static final FullscreenStatus Attached = null;
        public static final FullscreenStatus Attaching = null;
        public static final FullscreenStatus AttachingDetached = null;
        public static final FullscreenStatus Detaching = null;
        public static final FullscreenStatus DetachingAttached = null;
        public static final FullscreenStatus None = null;

        public FullscreenStatus(String str, int i2) {
        }

        public static FullscreenStatus valueOf(String str) {
        }

        public static FullscreenStatus[] values() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class WindowFocusChangedFrameLayout extends FrameLayout {
        public WindowFocusChangedListener mWindowFocusChangedListener;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public interface WindowFocusChangedListener {
            void onWindowFocusChanged(boolean z);
        }

        public WindowFocusChangedFrameLayout(Context context) {
        }

        @Override // android.view.View
        public void onWindowFocusChanged(boolean z) {
        }

        public void setWindowFocusChangedListener(WindowFocusChangedListener windowFocusChangedListener) {
        }
    }

    public static /* synthetic */ boolean access$000(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ int access$100(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ boolean access$1000(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ int access$102(XWebNativeInterface xWebNativeInterface, int i2) {
    }

    public static /* synthetic */ ViewGroup access$1100(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ LinearLayout access$1200(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ LinearLayout access$1300(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ ProgressBar access$1400(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ FrameLayout access$1500(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ void access$1600(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ ImageView access$1700(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ Context access$1800(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ ImageView access$1900(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ int access$200(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ VideoPlayerSeekBar access$2000(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ int access$202(XWebNativeInterface xWebNativeInterface, int i2) {
    }

    public static /* synthetic */ TextView access$2100(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ String access$2200(XWebNativeInterface xWebNativeInterface, double d) {
    }

    public static /* synthetic */ TextView access$2300(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ String access$2400(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ View access$2500(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ TextView access$2600(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ WebView access$2700(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ View access$2800(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ SurfaceView access$2900(XWebNativeInterface xWebNativeInterface, View view) {
    }

    public static /* synthetic */ double access$300(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ TextureView access$3000(XWebNativeInterface xWebNativeInterface, View view) {
    }

    public static /* synthetic */ FrameLayout access$3100(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ WindowFocusChangedFrameLayout access$3200(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ Activity access$3300(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ boolean access$3400(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ boolean access$3402(XWebNativeInterface xWebNativeInterface, boolean z) {
    }

    public static /* synthetic */ WeakReference access$3500(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ WebChromeClient.CustomViewCallback access$3600(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ boolean access$3700(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ int access$3800(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ boolean access$3900(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ boolean access$400(XWebNativeInterface xWebNativeInterface, double d) {
    }

    public static /* synthetic */ void access$4000(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ void access$4100(XWebNativeInterface xWebNativeInterface, int i2) {
    }

    public static /* synthetic */ FullscreenStatus access$4200(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ FullscreenStatus access$4202(XWebNativeInterface xWebNativeInterface, FullscreenStatus fullscreenStatus) {
    }

    public static /* synthetic */ float access$500(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ ScaleGestureDetector access$600(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ GestureDetector access$700(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ boolean access$800(XWebNativeInterface xWebNativeInterface) {
    }

    public static /* synthetic */ void access$900(XWebNativeInterface xWebNativeInterface) {
    }

    private Activity activityFromContext(Context context) {
    }

    private boolean checkIfLiveVideo(double d) {
    }

    private void fixFocus() {
    }

    private String getAllVideoTime(double d) {
    }

    private FrameLayout.LayoutParams getAutoFixLayoutParams(int i2, int i3, int i4) {
    }

    private Context getContext() {
    }

    private String getCurrentVideoTime(double d) {
    }

    private String getFormatVideoTime(double d, double d2) {
    }

    private SurfaceView getSurfaceView(View view) {
    }

    private TextureView getTextureView(View view) {
    }

    private String getTotalVideoTime() {
    }

    private boolean hasFocus() {
    }

    private void hideLayoutRateView() {
    }

    private void hideProgressLoading() {
    }

    private boolean isLayoutRateViewVisible() {
    }

    private void registerActivityLifecycleCallback(Activity activity) {
    }

    private void resetRateTextViews() {
    }

    private void resumeFocus() {
    }

    private void setAutoFix(int i2, int i3, int i4) {
    }

    private void setRequestedOrientation(int i2) {
    }

    private void showLayoutRateView() {
    }

    private void showProgressLoading() {
    }

    private Activity tryGetActivity() {
    }

    public void attach() {
    }

    public void detach() {
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

    public void hideControlView() {
    }

    @Override // com.tencent.xweb.extension.video.VideoNativeInterface
    public void init(Activity activity, View view, View view2, Context context, String str) {
    }

    @Override // com.tencent.xweb.extension.video.VideoNativeInterface
    public void initConfigs(Bundle bundle) {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void initView() {
    }

    public void onActivityFullscreen(boolean z) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    @Override // com.tencent.xweb.extension.video.VideoNativeInterface
    public void onHideCustomView() {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onOrientationChanged(int i2) {
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    @Override // com.tencent.xweb.extension.video.VideoNativeInterface
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
    }

    @JavascriptInterface
    public void onSpecialVideoEnterFullscreen(int i2) {
    }

    @JavascriptInterface
    public void onSpecialVideoHook(int i2) {
    }

    public void onToggleFullscreen(boolean z) {
    }

    @JavascriptInterface
    public boolean onVideoEmptied() {
    }

    @JavascriptInterface
    public void onVideoEnded() {
    }

    @JavascriptInterface
    public void onVideoEnterFullscreen(boolean z, long j2, double d, double d2, boolean z2, boolean z3, double d3, double d4, double[] dArr) {
    }

    @JavascriptInterface
    public void onVideoError(int i2, String str) {
    }

    @JavascriptInterface
    public void onVideoExitFullscreen() {
    }

    @JavascriptInterface
    public void onVideoPause() {
    }

    @JavascriptInterface
    public void onVideoPlay() {
    }

    @JavascriptInterface
    public void onVideoPlaying() {
    }

    @JavascriptInterface
    public void onVideoRateChange(double d) {
    }

    @JavascriptInterface
    public void onVideoSeeked() {
    }

    @JavascriptInterface
    public void onVideoSeeking() {
    }

    @SuppressLint({"WrongConstant"})
    public void onVideoSizeChanged(int i2, int i3) {
    }

    @JavascriptInterface
    public void onVideoSizeUpdate(double d, double d2) {
    }

    @JavascriptInterface
    public void onVideoTimeUpdate(double d, double d2, double[] dArr) {
    }

    @JavascriptInterface
    public void onVideoVolumeChange(boolean z) {
    }

    @JavascriptInterface
    public void onVideoWaiting() {
    }

    @Override // com.tencent.xweb.extension.video.VideoNativeInterface
    public void registerJavascriptInterface(Object obj) {
    }

    public void resetAudioAndBrightness() {
    }

    public void runOnUIThread(Runnable runnable) {
    }

    @Override // com.tencent.xweb.extension.video.VideoNativeInterface
    public boolean setVideoJsCallback(Object obj) {
    }

    public void showControlView() {
    }

    public void startControlViewTimer() {
    }

    public void stopControlViewTimer() {
    }

    @Override // com.tencent.xweb.VideoControl
    public boolean supportSetRequestedOrientationCallback() {
    }

    public void switchControlView() {
    }

    public void unRegisterActivityLifecycleCallback() {
    }

    public void uninitView() {
    }

    public void unsetAudioAndBrightness() {
    }

    public void updateImageMute(boolean z) {
    }

    public void updateImagePlay(boolean z) {
    }

    public void updateVideoCache(double d, double[] dArr) {
    }

    public void updateVideoTime(double d, boolean z) {
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
