package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ConnectInfo implements IMessageEntity {

    @Packed
    private List<String> a;

    @Packed
    private List<Scope> b;

    @Packed
    private String c;

    @Packed
    private String d;

    public ConnectInfo() {
    }

    public List<String> getApiNameList() {
    }

    public String getFingerprint() {
    }

    public List<Scope> getScopeList() {
    }

    public String getSubAppID() {
    }

    public void setApiNameList(List<String> list) {
    }

    public void setFingerprint(String str) {
    }

    public void setScopeList(List<Scope> list) {
    }

    public void setSubAppID(String str) {
    }

    public ConnectInfo(List<String> list, List<Scope> list2, String str, String str2) {
    }
}
