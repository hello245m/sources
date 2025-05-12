package com.tencent.rfix.lib.entity;

import androidx.annotation.Keep;
import com.tencent.rfix.loader.utils.RFixConstants;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class RFixPatchResult {
    public int configId;
    public int configType;
    public boolean effectImmediate;
    public boolean enableAssertDex;
    public boolean enableAssertLib;
    public boolean enableAssertRes;
    public Exception exception;
    public int installResult;
    public String patchFilePath;
    public String patchId;
    public int patchIndex;
    public String patchProcess;
    public String patchType;
    public String patchVersion;
    public RFixConstants.PatchError result;
    public long timeCost;

    public boolean isPatchSuccess() {
    }

    public boolean isPatchSuccessFirstTime() {
    }

    public String toString() {
    }
}
