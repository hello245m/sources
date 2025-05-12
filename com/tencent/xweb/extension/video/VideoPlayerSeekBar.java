package com.tencent.xweb.extension.video;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class VideoPlayerSeekBar {
    public final ImageView mBackBar;
    public final ImageView mBarPoint;
    public float mDownX;
    public final ImageView mFrontBar;
    public boolean mIsMoving;
    public float mLastMoveProgress;
    public final ImageView mMiddleBar;
    public float mProgress;
    public IVideoPlaySeekCallback mVideoPlayerSeekCallback;

    /* renamed from: com.tencent.xweb.extension.video.VideoPlayerSeekBar$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements View.OnTouchListener {
        public final /* synthetic */ VideoPlayerSeekBar this$0;

        public AnonymousClass1(VideoPlayerSeekBar videoPlayerSeekBar) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface IVideoPlaySeekCallback {
        void onProgressChanged(float f, boolean z);

        void onSeekPre();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public VideoPlayerSeekBar(View view) {
    }

    public static /* synthetic */ boolean access$000(VideoPlayerSeekBar videoPlayerSeekBar) {
    }

    public static /* synthetic */ boolean access$002(VideoPlayerSeekBar videoPlayerSeekBar, boolean z) {
    }

    public static /* synthetic */ float access$100(VideoPlayerSeekBar videoPlayerSeekBar) {
    }

    public static /* synthetic */ float access$102(VideoPlayerSeekBar videoPlayerSeekBar, float f) {
    }

    public static /* synthetic */ IVideoPlaySeekCallback access$200(VideoPlayerSeekBar videoPlayerSeekBar) {
    }

    public static /* synthetic */ ImageView access$300(VideoPlayerSeekBar videoPlayerSeekBar) {
    }

    public static /* synthetic */ ImageView access$400(VideoPlayerSeekBar videoPlayerSeekBar) {
    }

    public static /* synthetic */ float access$500(VideoPlayerSeekBar videoPlayerSeekBar) {
    }

    public static /* synthetic */ float access$502(VideoPlayerSeekBar videoPlayerSeekBar, float f) {
    }

    public float getProgress() {
    }

    public int progressToEdge(float f) {
    }

    public void setProgress(float f, boolean z) {
    }

    public void setVideoPlayerSeekCallback(IVideoPlaySeekCallback iVideoPlaySeekCallback) {
    }

    public void updateCacheProgress(double d, double[] dArr) {
    }
}
