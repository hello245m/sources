package com.tencent.xweb;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IProfilerController {
    void forceEnableFrameCostProfile(boolean z);

    void forceFlushCategory(String str);

    void initProfile();

    void setAllKindsFpsProfileEnable(boolean z);

    void setProfileConfig(String str, int i2, int i3, boolean z);

    boolean setProfileResultCallback(String str, IProfileResultCallback iProfileResultCallback);
}
