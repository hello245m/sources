package com.huawei.hms.support.api;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.Result;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ResolvePendingResult<T extends IMessageEntity> extends PendingResultImpl<ResolveResult<T>, T> {
    public ResolvePendingResult(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<T> cls) {
    }

    public static <R extends IMessageEntity> ResolvePendingResult<R> build(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<R> cls) {
    }

    public T get() {
    }

    @Override // com.huawei.hms.support.api.PendingResultImpl
    public /* bridge */ /* synthetic */ Result onComplete(IMessageEntity iMessageEntity) {
    }

    @Override // com.huawei.hms.support.api.PendingResultImpl
    public ResolveResult<T> onComplete(T t2) {
    }
}
