package com.huawei.hms.common.internal;

import android.os.Parcelable;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ResponseHeader implements IMessageEntity, ResponseErrorCode {
    private static final String TAG = "ResponseHeader";

    @Packed
    private String api_name;

    @Packed
    private String app_id;

    @Packed
    private int error_code;

    @Packed
    private String error_reason;
    private Parcelable parcelable;

    @Packed
    private String pkg_name;

    @Packed
    private String resolution;

    @Packed
    private String session_id;

    @Packed
    private String srv_name;

    @Packed
    private int status_code;

    @Packed
    private String transaction_id;

    public ResponseHeader() {
    }

    public boolean fromJson(String str) {
    }

    public String getActualAppID() {
    }

    public String getApiName() {
    }

    public String getAppID() {
    }

    @Override // com.huawei.hms.common.internal.ResponseErrorCode
    public int getErrorCode() {
    }

    @Override // com.huawei.hms.common.internal.ResponseErrorCode
    public String getErrorReason() {
    }

    @Override // com.huawei.hms.common.internal.ResponseErrorCode
    public Parcelable getParcelable() {
    }

    public String getPkgName() {
    }

    @Override // com.huawei.hms.common.internal.ResponseErrorCode
    public String getResolution() {
    }

    public String getSessionId() {
    }

    public String getSrvName() {
    }

    @Override // com.huawei.hms.common.internal.ResponseErrorCode
    public int getStatusCode() {
    }

    @Override // com.huawei.hms.common.internal.ResponseErrorCode
    public String getTransactionId() {
    }

    @Override // com.huawei.hms.common.internal.ResponseErrorCode
    public boolean hasResolution() {
    }

    public boolean isSuccess() {
    }

    public void setApiName(String str) {
    }

    public void setAppID(String str) {
    }

    public void setErrorCode(int i2) {
    }

    public void setErrorReason(String str) {
    }

    public void setParcelable(Parcelable parcelable) {
    }

    public void setPkgName(String str) {
    }

    public void setResolution(String str) {
    }

    public void setSessionId(String str) {
    }

    public void setSrvName(String str) {
    }

    public void setStatusCode(int i2) {
    }

    public void setTransactionId(String str) {
    }

    public String toJson() {
    }

    public String toString() {
    }

    public ResponseHeader(int i2, int i3, String str) {
    }
}
