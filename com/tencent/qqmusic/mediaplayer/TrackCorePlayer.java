package com.tencent.qqmusic.mediaplayer;

import android.os.Looper;
import com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.TrackDataSource;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class TrackCorePlayer extends CorePlayer implements TrackDataSource.TrackStateCallback {
    private static final String TAG = "TrackCorePlayer";
    private long mStartPosition;

    public TrackCorePlayer(IDataSource iDataSource, PlayerCallback playerCallback, Looper looper, QMThreadExecutor qMThreadExecutor) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.CorePlayer
    public long getCurPosition() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.TrackDataSource.TrackStateCallback
    public void onTrackPrepared(TrackInfo trackInfo) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.CorePlayer
    public void seek(int i2) {
    }
}
