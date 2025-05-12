package com.huawei.hms.support.api.client;

import android.app.Activity;
import com.huawei.hms.support.api.client.Result;

@Deprecated
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {
    private static final String TAG = "ResolvingResultCallbacks";
    private final Activity mActivity;
    private final int requestCode;

    public ResolvingResultCallbacks(Activity activity, int i2) {
    }

    @Override // com.huawei.hms.support.api.client.ResultCallbacks
    public final void onFailure(Status status) {
    }

    @Override // com.huawei.hms.support.api.client.ResultCallbacks
    public abstract void onSuccess(R r2);

    public abstract void onUnresolvableFailure(Status status);
}
