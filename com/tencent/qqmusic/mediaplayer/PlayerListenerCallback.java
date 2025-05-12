package com.tencent.qqmusic.mediaplayer;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface PlayerListenerCallback {
    void onBufferingUpdate(BaseMediaPlayer baseMediaPlayer, int i2);

    void onCompletion(BaseMediaPlayer baseMediaPlayer);

    void onError(BaseMediaPlayer baseMediaPlayer, int i2, int i3, int i4);

    void onPrepared(BaseMediaPlayer baseMediaPlayer);

    void onSeekComplete(BaseMediaPlayer baseMediaPlayer, int i2);

    void onStarted(BaseMediaPlayer baseMediaPlayer);

    void onStateChanged(BaseMediaPlayer baseMediaPlayer, int i2);
}
