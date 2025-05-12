package com.tencent.xweb;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface VideoJsCallback {
    boolean onSetRequestedOrientation(int i2);

    void onVideoEmptied();

    void onVideoEnded();

    void onVideoEnterFullscreen(boolean z, long j2, double d, double d2, boolean z2, boolean z3, double d3, double d4, double[] dArr);

    void onVideoError(int i2, String str);

    void onVideoExitFullscreen();

    void onVideoPause();

    void onVideoPlay();

    void onVideoPlaying();

    void onVideoRateChange(double d);

    void onVideoSeeked();

    void onVideoSeeking();

    void onVideoSizeUpdate(double d, double d2);

    void onVideoTimeUpdate(double d, double d2, double[] dArr);

    void onVideoVolumeChange(boolean z);

    void onVideoWaiting();
}
