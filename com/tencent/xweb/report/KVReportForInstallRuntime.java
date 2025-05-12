package com.tencent.xweb.report;

import com.tencent.xweb.updater.UpdateConfig;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class KVReportForInstallRuntime {
    public static final int ID = 24763;
    public static final int ID_FOR_WXA_SDK = 10126;
    public static final int INSTALL_TYPE_DOWNLOAD = 2;
    public static final int INSTALL_TYPE_EMBED = 1;
    public static final String TAG = "KVReportForInstallRuntime";
    public String downloadUrl;
    public int fromApkVersion;
    public long installRuntimeCostTime;
    public long installRuntimeFinishTime;
    public int installRuntimeResultCode;
    public long installRuntimeStartTime;
    public int installType;
    public boolean isPatchUpdate;
    public int patchType;
    public int toApkVersion;

    private void report() {
    }

    public void finishInstallRuntime(int i2) {
    }

    public void setEmbedInstallApkVersion(int i2, int i3) {
    }

    public void setInstallType(int i2) {
    }

    public void setUpdateConfig(UpdateConfig updateConfig) {
    }

    public void startInstallRuntime() {
    }
}
