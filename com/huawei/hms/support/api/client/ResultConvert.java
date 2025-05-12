package com.huawei.hms.support.api.client;

import com.huawei.hms.support.api.client.Result;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class ResultConvert<R extends Result, S extends Result> {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class FailPendingResult extends EmptyPendingResult {
        public final /* synthetic */ ResultConvert this$0;

        public FailPendingResult(ResultConvert resultConvert, Status status) {
        }
    }

    public final PendingResult newFailedPendingResult(Status status) {
    }

    public Status onFailed(Status status) {
    }

    public abstract PendingResult onSuccess(Result result);
}
