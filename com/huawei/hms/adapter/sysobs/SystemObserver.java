package com.huawei.hms.adapter.sysobs;

import android.content.Intent;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface SystemObserver {
    boolean onNoticeResult(int i2);

    boolean onSolutionResult(Intent intent, String str);

    boolean onUpdateResult(int i2);
}
