package com.tencent.rmonitor.io;

import com.tencent.rmonitor.base.meta.IOMeta;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class IoCanaryCore extends QAPMMonitorPlugin {
    private static final long START_SUCCESS_TIME_DELAY = 60000;
    public static final String TAG = "RMonitor_io_IoCanaryCore";
    private static volatile boolean isStart = false;

    public static synchronized void addWhiteList(String str) {
    }

    public static synchronized IOMeta getIODetail(int i2) {
    }

    public static synchronized long[] getIOStatus() {
    }

    public static synchronized void removeWhiteList(String str) {
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() {
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
    }
}
