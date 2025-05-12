package com.huawei.hms.activity.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface BusResponseCallback {
    BusResponseResult innerError(Activity activity, int i2, String str);

    BusResponseResult succeedReturn(Activity activity, int i2, Intent intent);
}
