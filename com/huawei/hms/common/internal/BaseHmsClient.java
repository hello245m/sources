package com.huawei.hms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.FailedBinderCallBack;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.support.api.client.AidlApiClient;
import com.huawei.hms.support.api.client.SubAppInfo;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class BaseHmsClient implements AidlApiClient {
    public static final int TIMEOUT_DISCONNECTED = 6;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f626i = null;

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicInteger f627j = null;

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicInteger f628k = null;

    /* renamed from: l, reason: collision with root package name */
    private static BinderAdapter f629l;

    /* renamed from: m, reason: collision with root package name */
    private static BinderAdapter f630m;
    private final Context a;
    private String b;
    private final ClientSettings c;
    private volatile IAIDLInvoke d;
    private final ConnectionCallbacks e;
    private final OnConnectionFailedListener f;
    private Handler g;
    private HuaweiApi.RequestHandler h;
    public String sessionId;

    /* renamed from: com.huawei.hms.common.internal.BaseHmsClient$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements BinderAdapter.BinderCallBack {
        public final /* synthetic */ BaseHmsClient a;

        /* renamed from: com.huawei.hms.common.internal.BaseHmsClient$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class C00081 implements FailedBinderCallBack.BinderCallBack {
            public final /* synthetic */ AnonymousClass1 a;

            public C00081(AnonymousClass1 anonymousClass1) {
            }

            @Override // com.huawei.hms.api.FailedBinderCallBack.BinderCallBack
            public void binderCallBack(int i2) {
            }
        }

        public AnonymousClass1(BaseHmsClient baseHmsClient) {
        }

        @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
        public void onBinderFailed(int i2) {
        }

        @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
        public void onNullBinding(ComponentName componentName) {
        }

        @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
        public void onServiceDisconnected(ComponentName componentName) {
        }

        @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
        public void onTimedDisconnected() {
        }

        @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
        public void onBinderFailed(int i2, Intent intent) {
        }
    }

    /* renamed from: com.huawei.hms.common.internal.BaseHmsClient$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass2 implements AvailableAdapter.AvailableCallBack {
        public final /* synthetic */ BaseHmsClient a;

        public AnonymousClass2(BaseHmsClient baseHmsClient) {
        }

        @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
        public void onComplete(int i2) {
        }
    }

    /* renamed from: com.huawei.hms.common.internal.BaseHmsClient$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass3 implements AvailableAdapter.AvailableCallBack {
        public final /* synthetic */ BaseHmsClient a;

        public AnonymousClass3(BaseHmsClient baseHmsClient) {
        }

        @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
        public void onComplete(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface ConnectionCallbacks {
        public static final int CAUSE_API_CLIENT_EXPIRED = 3;
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected();

        void onConnectionSuspended(int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class ConnectionResultWrapper {
        private HuaweiApi.RequestHandler a;
        private ConnectionResult b;

        public ConnectionResultWrapper(HuaweiApi.RequestHandler requestHandler, ConnectionResult connectionResult) {
        }

        public ConnectionResult getConnectionResult() {
        }

        public HuaweiApi.RequestHandler getRequest() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public BaseHmsClient(Context context, ClientSettings clientSettings, OnConnectionFailedListener onConnectionFailedListener, ConnectionCallbacks connectionCallbacks) {
    }

    public static /* synthetic */ void a(BaseHmsClient baseHmsClient, ConnectionResult connectionResult) {
    }

    public static /* synthetic */ ConnectionCallbacks b(BaseHmsClient baseHmsClient) {
    }

    private BinderAdapter.BinderCallBack c() {
    }

    private void d() {
    }

    private void e() {
    }

    public final void checkConnected() {
    }

    public void connect(int i2) {
    }

    public void connectedInternal(IBinder iBinder) {
    }

    public final void connectionConnected() {
    }

    public void disconnect() {
    }

    public BinderAdapter getAdapter() {
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public List<String> getApiNameList() {
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getAppID() {
    }

    public ClientSettings getClientSettings() {
    }

    public int getConnectionStatus() {
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public Context getContext() {
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getCpID() {
    }

    @Deprecated
    public int getMinApkVersion() {
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getPackageName() {
    }

    public int getRequestHmsVersionCode() {
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public IAIDLInvoke getService() {
    }

    public String getServiceAction() {
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getSessionId() {
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public SubAppInfo getSubAppInfo() {
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getTransportName() {
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public boolean isConnected() {
    }

    public boolean isConnecting() {
    }

    public void onConnecting() {
    }

    public final void setInternalRequest(HuaweiApi.RequestHandler requestHandler) {
    }

    public void setService(IAIDLInvoke iAIDLInvoke) {
    }

    public static /* synthetic */ IAIDLInvoke a(BaseHmsClient baseHmsClient, IAIDLInvoke iAIDLInvoke) {
    }

    private void b() {
    }

    public void connect(int i2, boolean z) {
    }

    public static /* synthetic */ Context a(BaseHmsClient baseHmsClient) {
    }

    public static /* synthetic */ void a(BaseHmsClient baseHmsClient, int i2) {
    }

    public void a() {
    }

    private void b(AvailableAdapter availableAdapter, int i2) {
    }

    private void a(String str, String str2) {
    }

    private void b(int i2) {
    }

    public void a(int i2) {
    }

    private void a(int i2, boolean z) {
    }

    private void a(AvailableAdapter availableAdapter, int i2) {
    }

    private void a(ConnectionResult connectionResult) {
    }
}
