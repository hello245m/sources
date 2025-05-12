package com.huawei.hms.support.api.entity.push;

import android.content.Context;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class SubscribeReq implements IMessageEntity {

    @Packed
    private String appId;

    @Packed
    private boolean isFastApp;

    @Packed
    private String operation;

    @Packed
    private String packageName;

    @Packed
    private String projectId;

    @Packed
    private String subjectId;

    @Packed
    private String token;

    @Packed
    private String topic;

    public SubscribeReq() {
    }

    public String getAppId() {
    }

    public String getOperation() {
    }

    public String getPackageName() {
    }

    public String getProjectId() {
    }

    public String getSubjectId() {
    }

    public String getToken() {
    }

    public String getTopic() {
    }

    public boolean isFastApp() {
    }

    public void setAppId(String str) {
    }

    public void setFastApp(boolean z) {
    }

    public void setOperation(String str) {
    }

    public void setPackageName(String str) {
    }

    public void setProjectId(String str) {
    }

    public void setSubjectId(String str) {
    }

    public void setToken(String str) {
    }

    public void setTopic(String str) {
    }

    public String toString() {
    }

    public SubscribeReq(Context context, String str, String str2) {
    }
}
