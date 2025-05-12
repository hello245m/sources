package com.huawei.hms.support.api.client;

import com.huawei.hms.support.api.client.Result;

@Deprecated
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    private static final String TAG = "ResultCallbacks";

    public abstract void onFailure(Status status);

    @Override // com.huawei.hms.support.api.client.ResultCallback
    public /* bridge */ /* synthetic */ void onResult(Object obj) {
    }

    public abstract void onSuccess(R r2);

    public final void onResult(R r2) {
    }
}
