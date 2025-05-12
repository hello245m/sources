package com.huawei.hms.core.aidl;

import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class RequestHeader implements IMessageEntity {

    @Packed
    private int apiLevel;

    @Packed
    private List<String> apiNameList;

    @Packed
    private String appId;

    @Packed
    private String packageName;

    @Packed
    private int sdkVersion;

    @Packed
    private String sessionId;

    public RequestHeader() {
    }

    public List<String> getApiNameList() {
    }

    public String getAppID() {
    }

    public String getPackageName() {
    }

    public int getSdkVersion() {
    }

    public String getSessionId() {
    }

    public void setApiLevel(int i2) {
    }

    public void setApiNameList(List<String> list) {
    }

    public void setAppID(String str) {
    }

    public void setPackageName(String str) {
    }

    public void setSdkVersion(int i2) {
    }

    public void setSessionId(String str) {
    }

    public RequestHeader(String str, String str2, int i2, String str3) {
    }
}
