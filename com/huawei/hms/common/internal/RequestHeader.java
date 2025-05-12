package com.huawei.hms.common.internal;

import android.os.Parcelable;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class RequestHeader implements IMessageEntity {
    private static final String TAG = "RequestHeader";

    @Packed
    private int apiLevel;

    @Packed
    private String api_name;

    @Packed
    private String app_id;

    @Packed
    private int kitSdkVersion;
    private Parcelable parcelable;

    @Packed
    private String pkg_name;

    @Packed
    private int sdk_version;

    @Packed
    private String session_id;

    @Packed
    private String srv_name;

    @Packed
    private String transaction_id;

    @Packed
    private String version;

    public boolean fromJson(String str) {
    }

    public String getActualAppID() {
    }

    public int getApiLevel() {
    }

    public String getApiName() {
    }

    public String getAppID() {
    }

    public int getKitSdkVersion() {
    }

    public Parcelable getParcelable() {
    }

    public String getPkgName() {
    }

    public int getSdkVersion() {
    }

    public String getSessionId() {
    }

    public String getSrvName() {
    }

    public String getTransactionId() {
    }

    public String getVersion() {
    }

    public void setApiLevel(int i2) {
    }

    public void setApiName(String str) {
    }

    public void setAppID(String str) {
    }

    public void setKitSdkVersion(int i2) {
    }

    public void setParcelable(Parcelable parcelable) {
    }

    public void setPkgName(String str) {
    }

    public void setSdkVersion(int i2) {
    }

    public void setSessionId(String str) {
    }

    public void setSrvName(String str) {
    }

    public void setTransactionId(String str) {
    }

    public void setVersion(String str) {
    }

    public String toJson() {
    }

    public String toString() {
    }
}
