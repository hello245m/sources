package com.huawei.hms.support.api.entity.auth;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class AbstractResp implements IMessageEntity {

    @Packed
    private String errorReason;

    @Packed
    private int rtnCode;

    public String getErrorReason() {
    }

    public int getRtnCode() {
    }

    public void setErrorReason(String str) {
    }

    public void setRtnCode(int i2) {
    }
}
