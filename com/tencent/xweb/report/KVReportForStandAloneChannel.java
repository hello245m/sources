package com.tencent.xweb.report;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class KVReportForStandAloneChannel {
    public static final int ERROR_GET_CLASSLOADER_FAIL = 3;
    public static final int ERROR_INIT_CORE_BRIDGE_FAIL = 4;
    public static final int ERROR_INIT_LOG_CHANNEL_FAIL = 8;
    public static final int ERROR_INIT_NOTIFY_CHANNEL_FAIL = 6;
    public static final int ERROR_INIT_RUNTIME_TO_SDK_CHANNEL_FAIL = 7;
    public static final int ERROR_INVALID_VERSION = 2;
    public static final int ERROR_LOAD_NATIVE_LIBRARY_FAIL = 5;
    public static final int FINISH_SUCCESS = 1;
    public static final int ID = 26318;
    public static final String TAG = "KVReportForStandAloneChannel";
    public int apkVersion;
    public long firstGetClassLoaderCostTime;
    public long getClassLoaderCostTime;
    public long initChannelCostTime;
    public long initChannelFinishTime;
    public int initChannelResultCode;
    public long initChannelStartTime;
    public long initCorBridgeCostTime;
    public boolean isStandAloneMode;
    public long loadLibraryCostTime;
    public long logChannelCostTime;
    public long notifyChannelCostTime;
    public long runtimeToSdkChannelCostTime;
    public int webViewKind;

    public void finishInitChannels(int i2) {
    }

    public long getInitChannelsCostTime() {
    }

    public void report() {
    }

    public void setApkVersion(int i2) {
    }

    public void setFirstGetClassLoaderCostTime(long j2) {
    }

    public void setGetClassLoaderCostTime(long j2) {
    }

    public void setInitCoreBridgeCostTime(long j2) {
    }

    public void setLoadLibraryCostTime(long j2) {
    }

    public void setLogChannelCostTime(long j2) {
    }

    public void setNotifyChannelCostTime(long j2) {
    }

    public void setRuntimeToSdkChannelCostTime(long j2) {
    }

    public void setStandAloneMode(boolean z) {
    }

    public void setWebViewKind(int i2) {
    }

    public void startInitChannels() {
    }
}
