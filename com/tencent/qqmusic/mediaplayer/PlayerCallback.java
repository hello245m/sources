package com.tencent.qqmusic.mediaplayer;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface PlayerCallback {
    void playThreadStart(CorePlayer corePlayer);

    void playerEnded(CorePlayer corePlayer);

    void playerException(CorePlayer corePlayer, int i2, int i3, int i4);

    void playerPaused(CorePlayer corePlayer);

    void playerPrepared(CorePlayer corePlayer);

    void playerSeekCompletion(CorePlayer corePlayer, int i2);

    void playerStarted(CorePlayer corePlayer);

    void playerStopped(CorePlayer corePlayer);
}
