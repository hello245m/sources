package com.huawei.hms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ResolvableApiException extends ApiException {
    public ResolvableApiException(Status status) {
    }

    public PendingIntent getResolution() {
    }

    public Intent getResolutionIntent() {
    }

    public void startResolutionForResult(Activity activity, int i2) throws IntentSender.SendIntentException {
    }

    public ResolvableApiException(ResponseErrorCode responseErrorCode) {
    }
}
