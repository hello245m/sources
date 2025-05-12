package com.huawei.hms.support.api.client;

import android.os.Looper;
import com.huawei.hms.support.api.client.Result;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class EmptyPendingResult<R extends Result> extends PendingResult<R> {
    private R result;

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await() {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void cancel() {
    }

    public R getResult() {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public boolean isCanceled() {
    }

    public void setResult(R r2) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(Looper looper, ResultCallback<R> resultCallback) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(ResultCallback<R> resultCallback) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(ResultCallback<R> resultCallback, long j2, TimeUnit timeUnit) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await(long j2, TimeUnit timeUnit) {
    }
}
