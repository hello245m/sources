package com.huawei.hms.common.api;

import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.Result;

@Deprecated
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class OptionalPendingResult<R extends Result> extends PendingResult<R> {
    public abstract R get();

    public abstract boolean isDone();
}
