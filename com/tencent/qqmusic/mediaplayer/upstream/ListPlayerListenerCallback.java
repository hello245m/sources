package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.qqmusic.mediaplayer.BaseMediaPlayer;
import com.tencent.qqmusic.mediaplayer.PlayerListenerCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ListPlayerListenerCallback implements PlayerListenerCallback {
    private final CopyOnWriteArrayList<PlayerListenerCallback> mCallbacks;

    public synchronized void add(PlayerListenerCallback playerListenerCallback) {
    }

    public synchronized void addAll(List<PlayerListenerCallback> list) {
    }

    public synchronized void clear() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onBufferingUpdate(BaseMediaPlayer baseMediaPlayer, int i2) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onCompletion(BaseMediaPlayer baseMediaPlayer) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onError(BaseMediaPlayer baseMediaPlayer, int i2, int i3, int i4) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onPrepared(BaseMediaPlayer baseMediaPlayer) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onSeekComplete(BaseMediaPlayer baseMediaPlayer, int i2) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onStarted(BaseMediaPlayer baseMediaPlayer) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onStateChanged(BaseMediaPlayer baseMediaPlayer, int i2) {
    }

    public synchronized void remove(PlayerListenerCallback playerListenerCallback) {
    }

    public synchronized List<PlayerListenerCallback> toCollection() {
    }

    public synchronized void add(ListPlayerListenerCallback listPlayerListenerCallback) {
    }
}
