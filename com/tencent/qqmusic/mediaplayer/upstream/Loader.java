package com.tencent.qqmusic.mediaplayer.upstream;

import java.io.IOException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface Loader {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface Factory {
        Loader createLoader(Listener listener);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface Listener {
        void onLoadCancelled(boolean z);

        void onLoadCompleted();

        void onLoadError(IOException iOException);

        void onLoadProgress(long j2, long j3);
    }

    void cancelLoading();

    long getUpstreamSize();

    boolean isLoading();

    void prepare() throws IOException;

    void shutdown() throws InterruptedException;

    void startLoading(Chunk chunk);
}
