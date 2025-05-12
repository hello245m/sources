package com.huawei.hms.aaid.entity;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class DeleteTokenReq implements IMessageEntity {

    @Packed
    private String appId;

    @Packed
    private int deleteType;

    @Packed
    private boolean isFastApp;

    @Packed
    private boolean isMultiSender;

    @Packed
    private String pkgName;

    @Packed
    private String projectId;

    @Packed
    private String scope;

    @Packed
    private String subjectId;

    @Packed
    private String token;

    public String getAppId() {
    }

    public int getDeleteType() {
    }

    public String getPkgName() {
    }

    public String getProjectId() {
    }

    public String getScope() {
    }

    public String getSubjectId() {
    }

    public String getToken() {
    }

    public boolean isFastApp() {
    }

    public boolean isMultiSender() {
    }

    public void setAppId(String str) {
    }

    public void setDeleteType(int i2) {
    }

    public void setFastApp(boolean z) {
    }

    public void setMultiSender(boolean z) {
    }

    public void setPkgName(String str) {
    }

    public void setProjectId(String str) {
    }

    public void setScope(String str) {
    }

    public void setSubjectId(String str) {
    }

    public void setToken(String str) {
    }

    public String toString() {
    }
}
