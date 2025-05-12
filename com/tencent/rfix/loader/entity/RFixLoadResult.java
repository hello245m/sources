package com.tencent.rfix.loader.entity;

import android.content.Intent;
import com.tencent.rfix.loader.utils.RFixConstants;
import java.io.File;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class RFixLoadResult {
    public long applicationStartElapsedTime;
    public long applicationStartMillisTime;
    public RFixConstants.CheckError checkResult;
    public int checkSubResult;
    public long checkTimeCost;
    public boolean effectImmediate;
    public Throwable exception;
    public boolean loaderCleanPatch;
    public boolean loaderResult;
    public int loaderSubResult;
    public long loaderTimeCost;
    public RFixPatchInfo patchInfo;
    public File patchInfoFile;
    public File patchInfoLockFile;
    public File patchLibDirectory;
    public File patchVersionDirectory;
    public File patchVersionFile;
    public RFixConstants.LoadError result;
    public long timeCost;
    public int tinkerFlags;
    public boolean tinkerLoadVerifyFlag;
    public Intent tinkerResultIntent;

    public boolean isCheckSuccess() {
    }

    public boolean isLoaderSuccess() {
    }

    public boolean isSuccess() {
    }

    public String toString() {
    }
}
