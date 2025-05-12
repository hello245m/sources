package com.huawei.hms.common;

import com.huawei.hms.support.api.client.Status;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ApiException extends Exception {
    public final Status mStatus;

    public ApiException(Status status) {
    }

    public int getStatusCode() {
    }

    @Deprecated
    public String getStatusMessage() {
    }
}
