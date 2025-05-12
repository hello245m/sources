package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class DisconnectInfo implements IMessageEntity {

    @Packed
    public List<String> apiNameList;

    @Packed
    public List<Scope> scopeList;

    public DisconnectInfo() {
    }

    public List<String> getApiNameList() {
    }

    public List<Scope> getScopeList() {
    }

    public DisconnectInfo(List<Scope> list, List<String> list2) {
    }
}
