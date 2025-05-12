package com.tencent.xweb;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface VideoControl {
    boolean supportSetRequestedOrientationCallback();

    void videoChangeStatus();

    void videoExitFullscreen();

    void videoMute(boolean z);

    void videoPause();

    void videoPlay();

    void videoPlaybackRate(double d);

    void videoSeek(double d);
}
