package com.huawei.hms.adapter;

import android.os.Parcelable;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class CoreBaseRequest implements IMessageEntity {

    @Packed
    private String jsonHeader;

    @Packed
    private String jsonObject;

    @Packed
    private Parcelable parcelable;

    public String getJsonHeader() {
    }

    public String getJsonObject() {
    }

    public Parcelable getParcelable() {
    }

    public void setJsonHeader(String str) {
    }

    public void setJsonObject(String str) {
    }

    public void setParcelable(Parcelable parcelable) {
    }
}
