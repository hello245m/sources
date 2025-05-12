package com.huawei.hms.adapter.sysobs;

import android.content.Intent;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface SystemNotifier {
    void notifyNoticeObservers(int i2);

    void notifyObservers(int i2);

    void notifyObservers(Intent intent, String str);

    void registerObserver(SystemObserver systemObserver);

    void unRegisterObserver(SystemObserver systemObserver);
}
