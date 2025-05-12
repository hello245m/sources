package com.huawei.hms.common.internal;

import android.content.Context;
import android.os.Parcelable;
import com.huawei.hms.adapter.BaseAdapter;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.core.aidl.IMessageEntity;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class HmsClient extends BaseHmsClient implements AnyClient {
    public HmsClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
    }

    @Override // com.huawei.hms.common.internal.AnyClient
    public void post(IMessageEntity iMessageEntity, String str, AnyClient.CallBack callBack) {
    }

    public void updateSessionId(String str) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class BaseAdapterCallBack implements BaseAdapter.BaseCallBack {
        private final AnyClient.CallBack a;
        private final WeakReference<HmsClient> b;

        public BaseAdapterCallBack(HmsClient hmsClient, AnyClient.CallBack callBack) {
        }

        private void a(String str) {
        }

        @Override // com.huawei.hms.adapter.BaseAdapter.BaseCallBack
        public void onComplete(String str, String str2, Parcelable parcelable) {
        }

        @Override // com.huawei.hms.adapter.BaseAdapter.BaseCallBack
        public void onError(String str) {
        }

        private void a(String str, String str2) {
        }

        private void a(String str, String str2, Parcelable parcelable) {
        }
    }
}
