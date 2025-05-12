package com.tencent.qqmusic.mediaplayer.upstream;

import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface UriLoader {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface Callback {
        void onCancelled();

        void onFailed(Throwable th);

        void onSucceed(StreamingRequest streamingRequest);
    }

    void cancelLoading();

    boolean isLoading();

    void startLoading(int i2, TimeUnit timeUnit, Callback callback);
}
