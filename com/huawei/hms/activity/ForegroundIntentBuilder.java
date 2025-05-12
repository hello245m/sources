package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.ForegroundInnerHeader;
import com.huawei.hms.common.internal.RequestHeader;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ForegroundIntentBuilder {
    private Activity a;
    private RequestHeader b;
    private String c;
    private ForegroundInnerHeader d;
    private String e;
    private Context f;

    public ForegroundIntentBuilder(Activity activity) throws IllegalArgumentException {
    }

    public static void registerResponseCallback(String str, BusResponseCallback busResponseCallback) {
    }

    public static void unregisterResponseCallback(String str) {
    }

    public Intent build() {
    }

    public ForegroundIntentBuilder setAction(String str) {
    }

    public ForegroundIntentBuilder setApiLevel(int i2) {
    }

    public ForegroundIntentBuilder setApplicationContext(Context context) {
    }

    public ForegroundIntentBuilder setInnerHms() {
    }

    public ForegroundIntentBuilder setKitSdkVersion(int i2) {
    }

    public ForegroundIntentBuilder setMinApkVersion(int i2) {
    }

    public ForegroundIntentBuilder setRequestBody(String str) {
    }

    public ForegroundIntentBuilder setResponseCallback(String str, BusResponseCallback busResponseCallback) {
    }

    public ForegroundIntentBuilder setServiceName(String str) {
    }

    public ForegroundIntentBuilder setSubAppId(String str) {
    }

    public ForegroundIntentBuilder setTransactionId(String str) {
    }

    public ForegroundIntentBuilder setResponseCallback(String str) {
    }
}
