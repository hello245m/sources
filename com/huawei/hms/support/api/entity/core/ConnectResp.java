package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ConnectResp implements IMessageEntity {

    @Packed
    public List<Integer> protocolVersion;

    @Packed
    public String sessionId;

    public String toString() {
    }
}
