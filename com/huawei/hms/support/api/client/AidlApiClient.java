package com.huawei.hms.support.api.client;

import com.huawei.hms.core.aidl.IAIDLInvoke;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface AidlApiClient extends ApiClient {
    List<String> getApiNameList();

    IAIDLInvoke getService();
}
