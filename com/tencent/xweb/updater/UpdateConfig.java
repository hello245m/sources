package com.tencent.xweb.updater;

import com.tencent.xweb.util.Scheduler;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class UpdateConfig {
    public String abi;
    public int apkVer;
    public boolean bTryUseSharedCore;
    public boolean bUseCdn;
    public String downUrl;
    public String downloadFileMd5;
    public boolean isMatchMd5;
    public boolean isPatchUpdate;
    public int nPatchTargetVersion;
    public String patchEndFileMd5;
    public int patchType;
    public Scheduler scheduler;
    public String versionDetail;

    public UpdateConfig(String str, boolean z, int i2, String str2, int i3, int i4) {
    }

    public boolean checkValid() {
    }

    public String getDownloadPath() {
    }

    public String getLogString() {
    }

    public int getUpdateBizType() {
    }

    public UpdateConfig(String str, boolean z, String str2, String str3, int i2, String str4, int i3, int i4) {
    }

    public UpdateConfig(String str, boolean z, int i2, String str2, int i3) {
    }

    public UpdateConfig(String str, boolean z, String str2, String str3, int i2, String str4, int i3) {
    }
}
