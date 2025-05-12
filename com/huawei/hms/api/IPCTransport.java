package com.huawei.hms.api;

import com.huawei.hms.core.aidl.IAIDLCallback;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.transport.DatagramTransport;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class IPCTransport implements DatagramTransport {
    private static final String TAG = "IPCTransport";
    private int apiLevel;
    private final IMessageEntity mEntity;
    private final Class<? extends IMessageEntity> mResponseClass;
    private final String mURI;

    public IPCTransport(String str, IMessageEntity iMessageEntity, Class<? extends IMessageEntity> cls) {
    }

    private int syncCall(ApiClient apiClient, IAIDLCallback iAIDLCallback) {
    }

    @Override // com.huawei.hms.support.api.transport.DatagramTransport
    public final void post(ApiClient apiClient, DatagramTransport.a aVar) {
    }

    @Override // com.huawei.hms.support.api.transport.DatagramTransport
    public final void send(ApiClient apiClient, DatagramTransport.a aVar) {
    }

    public IPCTransport(String str, IMessageEntity iMessageEntity, Class<? extends IMessageEntity> cls, int i2) {
    }
}
