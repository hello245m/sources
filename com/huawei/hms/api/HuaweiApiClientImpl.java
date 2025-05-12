package com.huawei.hms.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.core.aidl.DataBuffer;
import com.huawei.hms.core.aidl.IAIDLCallback;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.BundleResult;
import com.huawei.hms.support.api.client.InnerApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.ConnectInfo;
import com.huawei.hms.support.api.entity.core.ConnectResp;
import com.huawei.hms.support.api.entity.core.DisconnectInfo;
import com.huawei.hms.support.api.entity.core.DisconnectResp;
import com.huawei.hms.support.api.entity.core.JosGetNoticeResp;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class HuaweiApiClientImpl extends HuaweiApiClient implements InnerApiClient, ServiceConnection {
    private static final Object A = null;
    private static final Object B = null;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    private int a;
    private final Context b;
    private final String c;
    private String d;
    private String e;
    private volatile IAIDLInvoke f;
    private String g;
    private WeakReference<Activity> h;

    /* renamed from: i, reason: collision with root package name */
    private WeakReference<Activity> f606i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f607j;

    /* renamed from: k, reason: collision with root package name */
    private AtomicInteger f608k;

    /* renamed from: l, reason: collision with root package name */
    private List<Scope> f609l;

    /* renamed from: m, reason: collision with root package name */
    private List<PermissionInfo> f610m;

    /* renamed from: n, reason: collision with root package name */
    private Map<Api<?>, Api.ApiOptions> f611n;

    /* renamed from: o, reason: collision with root package name */
    private SubAppInfo f612o;

    /* renamed from: p, reason: collision with root package name */
    private long f613p;

    /* renamed from: q, reason: collision with root package name */
    private int f614q;

    /* renamed from: r, reason: collision with root package name */
    private final Object f615r;

    /* renamed from: s, reason: collision with root package name */
    private final ReentrantLock f616s;

    /* renamed from: t, reason: collision with root package name */
    private final Condition f617t;
    private ConnectionResult u;
    private HuaweiApiClient.ConnectionCallbacks v;
    private HuaweiApiClient.OnConnectionFailedListener w;
    private Handler x;
    private Handler y;
    private CheckUpdatelistener z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Handler.Callback {
        public final /* synthetic */ HuaweiApiClientImpl a;

        public a(HuaweiApiClientImpl huaweiApiClientImpl) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Handler.Callback {
        public final /* synthetic */ HuaweiApiClientImpl a;

        public b(HuaweiApiClientImpl huaweiApiClientImpl) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends IAIDLCallback.Stub {
        public final /* synthetic */ ResultCallback a;

        public c(HuaweiApiClientImpl huaweiApiClientImpl, ResultCallback resultCallback) {
        }

        @Override // com.huawei.hms.core.aidl.IAIDLCallback
        public void call(DataBuffer dataBuffer) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d extends PendingResultImpl<Status, IMessageEntity> {
        public d(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        public /* bridge */ /* synthetic */ Status onComplete(IMessageEntity iMessageEntity) {
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        /* renamed from: onComplete, reason: avoid collision after fix types in other method */
        public Status onComplete2(IMessageEntity iMessageEntity) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e implements ResultCallback<ResolveResult<ConnectResp>> {
        public final /* synthetic */ HuaweiApiClientImpl a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Runnable {
            public final /* synthetic */ ResolveResult a;
            public final /* synthetic */ e b;

            public a(e eVar, ResolveResult resolveResult) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        private e(HuaweiApiClientImpl huaweiApiClientImpl) {
        }

        public void a(ResolveResult<ConnectResp> resolveResult) {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        public /* bridge */ /* synthetic */ void onResult(ResolveResult<ConnectResp> resolveResult) {
        }

        public /* synthetic */ e(HuaweiApiClientImpl huaweiApiClientImpl, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f implements ResultCallback<ResolveResult<DisconnectResp>> {
        public final /* synthetic */ HuaweiApiClientImpl a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Runnable {
            public final /* synthetic */ ResolveResult a;
            public final /* synthetic */ f b;

            public a(f fVar, ResolveResult resolveResult) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        private f(HuaweiApiClientImpl huaweiApiClientImpl) {
        }

        public void a(ResolveResult<DisconnectResp> resolveResult) {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        public /* bridge */ /* synthetic */ void onResult(ResolveResult<DisconnectResp> resolveResult) {
        }

        public /* synthetic */ f(HuaweiApiClientImpl huaweiApiClientImpl, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class g implements ResultCallback<ResolveResult<JosGetNoticeResp>> {
        public final /* synthetic */ HuaweiApiClientImpl a;

        private g(HuaweiApiClientImpl huaweiApiClientImpl) {
        }

        public void a(ResolveResult<JosGetNoticeResp> resolveResult) {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        public /* bridge */ /* synthetic */ void onResult(ResolveResult<JosGetNoticeResp> resolveResult) {
        }

        public /* synthetic */ g(HuaweiApiClientImpl huaweiApiClientImpl, a aVar) {
        }
    }

    public HuaweiApiClientImpl(Context context) {
    }

    public static /* synthetic */ AtomicInteger a(HuaweiApiClientImpl huaweiApiClientImpl) {
    }

    public static /* synthetic */ void b(HuaweiApiClientImpl huaweiApiClientImpl) {
    }

    public static /* synthetic */ WeakReference c(HuaweiApiClientImpl huaweiApiClientImpl) {
    }

    private DisconnectInfo d() {
    }

    private int e() {
    }

    private int f() {
    }

    private boolean g() {
    }

    private void h() {
    }

    private void i() {
    }

    private void j() {
    }

    private void k() {
    }

    private void l() {
    }

    private void m() {
    }

    private void n() {
    }

    public int asyncRequest(Bundle bundle, String str, int i2, ResultCallback<BundleResult> resultCallback) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void checkUpdate(Activity activity, CheckUpdatelistener checkUpdatelistener) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connect(Activity activity) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connectForeground() {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void disableLifeCycleManagement(Activity activity) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public PendingResult<Status> discardAndReconnect() {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void disconnect() {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public Map<Api<?>, Api.ApiOptions> getApiMap() {
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public List<String> getApiNameList() {
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getAppID() {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult getConnectionResult(Api<?> api) {
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public Context getContext() {
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getCpID() {
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getPackageName() {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public List<PermissionInfo> getPermissionInfos() {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public List<Scope> getScopes() {
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public IAIDLInvoke getService() {
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getSessionId() {
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public final SubAppInfo getSubAppInfo() {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public Activity getTopActivity() {
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getTransportName() {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectedApi(Api<?> api) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectionFailureListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectionSuccessListener(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult holdUpConnect() {
    }

    @Override // com.huawei.hms.support.api.client.InnerApiClient
    public boolean innerIsConnected() {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient, com.huawei.hms.support.api.client.ApiClient
    public boolean isConnected() {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean isConnecting() {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void onPause(Activity activity) {
    }

    public void onResult(int i2) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void onResume(Activity activity) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void print(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void reconnect() {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void removeConnectionFailureListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void removeConnectionSuccessListener(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
    }

    public void resetListener() {
    }

    public void setApiMap(Map<Api<?>, Api.ApiOptions> map) {
    }

    public void setAutoLifecycleClientId(int i2) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionCallbacks(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionFailedListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
    }

    public void setHasShowNotice(boolean z) {
    }

    public void setPermissionInfos(List<PermissionInfo> list) {
    }

    public void setScopes(List<Scope> list) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
    }

    public static /* synthetic */ void a(HuaweiApiClientImpl huaweiApiClientImpl, int i2) {
    }

    public static /* synthetic */ void b(HuaweiApiClientImpl huaweiApiClientImpl, ResolveResult resolveResult) {
    }

    private void c(int i2) {
    }

    public static /* synthetic */ void a(HuaweiApiClientImpl huaweiApiClientImpl, ResolveResult resolveResult) {
    }

    private void b(int i2) {
    }

    public static /* synthetic */ boolean a(HuaweiApiClientImpl huaweiApiClientImpl, boolean z) {
    }

    private void a() {
    }

    private ConnectInfo c() {
    }

    private void b() {
    }

    private void c(ResolveResult<ConnectResp> resolveResult) {
    }

    private void b(ResolveResult<DisconnectResp> resolveResult) {
    }

    private void a(int i2) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult holdUpConnect(long j2, TimeUnit timeUnit) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connect(int i2) {
    }

    private void a(ResolveResult<ConnectResp> resolveResult) {
    }
}
