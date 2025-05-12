package com.tencent.rmonitor.base.plugin.listener;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IBatteryListener extends IBaseListener {
    String getBlackClassName();

    void onPrintLog(String str);

    void onUsageAlarm(int i2, int i3, int i4, String str, String str2);
}
