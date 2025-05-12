package com.huawei.hms.aaid.entity;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class TokenReq implements IMessageEntity {

    @Packed
    private String aaid;

    @Packed
    private String appId;

    @Packed
    private boolean firstTime;

    @Packed
    private boolean isFastApp;

    @Packed
    private boolean isMultiSender;

    @Packed
    private String packageName;

    @Packed
    private String projectId;

    @Packed
    private String scope;

    @Packed
    private String subjectId;

    public String getAaid() {
    }

    public String getAppId() {
    }

    public String getPackageName() {
    }

    public String getProjectId() {
    }

    public String getScope() {
    }

    public String getSubjectId() {
    }

    public boolean isFastApp() {
    }

    public boolean isFirstTime() {
    }

    public boolean isMultiSender() {
    }

    public void setAaid(String str) {
    }

    public void setAppId(String str) {
    }

    public void setFastApp(boolean z) {
    }

    public void setFirstTime(boolean z) {
    }

    public void setMultiSender(boolean z) {
    }

    public void setPackageName(String str) {
    }

    public void setProjectId(String str) {
    }

    public void setScope(String str) {
    }

    public void setSubjectId(String str) {
    }

    public String toString() {
    }
}
