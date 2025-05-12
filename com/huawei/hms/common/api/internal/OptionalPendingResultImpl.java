package com.huawei.hms.common.api.internal;

import android.os.Looper;
import com.huawei.hms.common.api.OptionalPendingResult;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.ResultCallback;
import java.util.concurrent.TimeUnit;

@Deprecated
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class OptionalPendingResultImpl<R extends Result> extends OptionalPendingResult<R> {
    private final PendingResult<R> a;

    public OptionalPendingResultImpl(PendingResult<R> pendingResult) {
    }

    public final void addStatusListener() {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final R await() {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void cancel() {
    }

    @Override // com.huawei.hms.common.api.OptionalPendingResult
    public final R get() {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final boolean isCanceled() {
    }

    @Override // com.huawei.hms.common.api.OptionalPendingResult
    public final boolean isDone() {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(ResultCallback<R> resultCallback) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final R await(long j2, TimeUnit timeUnit) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(Looper looper, ResultCallback<R> resultCallback) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(ResultCallback<R> resultCallback, long j2, TimeUnit timeUnit) {
    }
}
