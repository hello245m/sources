package com.huawei.hms.support.api.client;

import android.os.Looper;
import com.huawei.hms.support.api.client.Result;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class PendingResult<R extends Result> {
    public abstract R await();

    public abstract R await(long j2, TimeUnit timeUnit);

    @Deprecated
    public abstract void cancel();

    public <S extends Result> ConvertedResult<S> convertResult(ResultConvert<? super R, ? extends S> resultConvert) {
    }

    @Deprecated
    public abstract boolean isCanceled();

    public abstract void setResultCallback(Looper looper, ResultCallback<R> resultCallback);

    public abstract void setResultCallback(ResultCallback<R> resultCallback);

    @Deprecated
    public abstract void setResultCallback(ResultCallback<R> resultCallback, long j2, TimeUnit timeUnit);
}
