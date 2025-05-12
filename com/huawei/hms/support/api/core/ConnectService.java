package com.huawei.hms.support.api.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolvePendingResult;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.InnerPendingResult;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.entity.core.CheckConnectInfo;
import com.huawei.hms.support.api.entity.core.CheckConnectResp;
import com.huawei.hms.support.api.entity.core.ConnectInfo;
import com.huawei.hms.support.api.entity.core.ConnectResp;
import com.huawei.hms.support.api.entity.core.DisconnectInfo;
import com.huawei.hms.support.api.entity.core.DisconnectResp;
import com.huawei.hms.support.api.entity.core.JosGetNoticeResp;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class ConnectService {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a extends PendingResultImpl<ResolveResult<ConnectResp>, ConnectResp> {
        public a(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
        }

        public ResolveResult<ConnectResp> a(ConnectResp connectResp) {
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        public boolean checkApiClient(ApiClient apiClient) {
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        public /* bridge */ /* synthetic */ ResolveResult<ConnectResp> onComplete(ConnectResp connectResp) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b extends PendingResultImpl<ResolveResult<ConnectResp>, ConnectResp> {
        public b(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
        }

        public ResolveResult<ConnectResp> a(ConnectResp connectResp) {
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        public boolean checkApiClient(ApiClient apiClient) {
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        public /* bridge */ /* synthetic */ ResolveResult<ConnectResp> onComplete(ConnectResp connectResp) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends PendingResultImpl<ResolveResult<JosGetNoticeResp>, JosGetNoticeResp> {
        public c(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
        }

        public ResolveResult<JosGetNoticeResp> a(JosGetNoticeResp josGetNoticeResp) {
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        public /* bridge */ /* synthetic */ ResolveResult<JosGetNoticeResp> onComplete(JosGetNoticeResp josGetNoticeResp) {
        }
    }

    private ConnectService() {
    }

    public static InnerPendingResult<ResolveResult<CheckConnectResp>> checkconnect(ApiClient apiClient, CheckConnectInfo checkConnectInfo) {
    }

    public static PendingResult<ResolveResult<ConnectResp>> connect(ApiClient apiClient, ConnectInfo connectInfo) {
    }

    public static ResolvePendingResult<DisconnectResp> disconnect(ApiClient apiClient, DisconnectInfo disconnectInfo) {
    }

    public static PendingResult<ResolveResult<ConnectResp>> forceConnect(ApiClient apiClient, ConnectInfo connectInfo) {
    }

    public static PendingResult<ResolveResult<JosGetNoticeResp>> getNotice(ApiClient apiClient, int i2, String str) {
    }
}
