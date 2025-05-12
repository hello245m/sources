package com.huawei.hms.common;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.RequestManager;
import com.huawei.hms.common.internal.ResolveClientBean;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.common.internal.TaskApiCallWrapper;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import k.e.b.a.f;
import k.e.b.a.g;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class HuaweiApi<TOption extends Api.ApiOptions> {
    private Context a;
    private TOption b;
    private Context c;
    private AbstractClientBuilder<?, TOption> d;
    private String e;
    private String f;
    private SubAppInfo g;
    private WeakReference<Activity> h;

    /* renamed from: i, reason: collision with root package name */
    private int f620i;

    /* renamed from: j, reason: collision with root package name */
    private int f621j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f622k;

    /* renamed from: l, reason: collision with root package name */
    private String f623l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f624m;

    /* renamed from: n, reason: collision with root package name */
    private RequestManager f625n;

    /* renamed from: com.huawei.hms.common.HuaweiApi$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ HuaweiApi a;
        public final /* synthetic */ g b;
        public final /* synthetic */ HuaweiApi c;

        public AnonymousClass1(HuaweiApi huaweiApi, HuaweiApi huaweiApi2, g gVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class RequestHandler<OptionsT extends Api.ApiOptions> implements BaseHmsClient.ConnectionCallbacks, BaseHmsClient.OnConnectionFailedListener {
        private final Queue<TaskApiCallbackWrapper> a;
        private final AnyClient b;
        private ConnectionResult c;
        public final Queue<TaskApiCallbackWrapper> callbackWaitQueue;
        private final HuaweiApi<OptionsT> d;
        private ResolveClientBean e;

        /* renamed from: com.huawei.hms.common.HuaweiApi$RequestHandler$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 implements AnyClient.CallBack {
            private AtomicBoolean a;
            public final /* synthetic */ TaskApiCallWrapper b;
            public final /* synthetic */ RequestHandler c;

            public AnonymousClass1(RequestHandler requestHandler, TaskApiCallWrapper taskApiCallWrapper) {
            }

            @Override // com.huawei.hms.common.internal.AnyClient.CallBack
            public void onCallback(IMessageEntity iMessageEntity, String str) {
            }
        }

        /* renamed from: com.huawei.hms.common.HuaweiApi$RequestHandler$2, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass2 implements AnyClient.CallBack {
            public final /* synthetic */ TaskApiCallbackWrapper a;
            public final /* synthetic */ RequestHeader b;
            public final /* synthetic */ RequestHandler c;

            /* renamed from: com.huawei.hms.common.HuaweiApi$RequestHandler$2$1, reason: invalid class name */
            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
            public class AnonymousClass1 implements Runnable {
                public final /* synthetic */ AnonymousClass2 a;

                public AnonymousClass1(AnonymousClass2 anonymousClass2) {
                }

                @Override // java.lang.Runnable
                public void run() {
                }
            }

            public AnonymousClass2(RequestHandler requestHandler, TaskApiCallbackWrapper taskApiCallbackWrapper, RequestHeader requestHeader) {
            }

            @Override // com.huawei.hms.common.internal.AnyClient.CallBack
            public void onCallback(IMessageEntity iMessageEntity, String str) {
            }
        }

        /* renamed from: com.huawei.hms.common.HuaweiApi$RequestHandler$3, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass3 implements Runnable {
            public final /* synthetic */ ConnectionResult a;
            public final /* synthetic */ RequestHandler b;

            public AnonymousClass3(RequestHandler requestHandler, ConnectionResult connectionResult) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.huawei.hms.common.HuaweiApi$RequestHandler$4, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass4 implements Runnable {
            public final /* synthetic */ RequestHandler a;

            public AnonymousClass4(RequestHandler requestHandler) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.huawei.hms.common.HuaweiApi$RequestHandler$5, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass5 implements Runnable {
            public final /* synthetic */ RequestHandler a;

            public AnonymousClass5(RequestHandler requestHandler) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public RequestHandler(HuaweiApi<OptionsT> huaweiApi) {
        }

        public static /* synthetic */ HuaweiApi a(RequestHandler requestHandler) {
        }

        public static /* synthetic */ void b(RequestHandler requestHandler) {
        }

        public static /* synthetic */ AnyClient c(RequestHandler requestHandler) {
        }

        public static /* synthetic */ Queue d(RequestHandler requestHandler) {
        }

        public static /* synthetic */ void e(RequestHandler requestHandler) {
        }

        public AnyClient getClient() {
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnected() {
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.OnConnectionFailedListener
        public void onConnectionFailed(ConnectionResult connectionResult) {
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnectionSuspended(int i2) {
        }

        public void postMessage(TaskApiCallbackWrapper taskApiCallbackWrapper) {
        }

        public static /* synthetic */ void a(RequestHandler requestHandler, ConnectionResult connectionResult) {
        }

        private TaskApiCallbackWrapper b(TaskApiCallWrapper taskApiCallWrapper) {
        }

        private void c() {
        }

        private void b(ConnectionResult connectionResult) {
        }

        public void a(TaskApiCallWrapper taskApiCallWrapper) {
        }

        private void b() {
        }

        private String a(String str, String str2) {
        }

        public synchronized void a(int i2, TaskApiCallbackWrapper taskApiCallbackWrapper) {
        }

        public void a() {
        }

        private void a(TaskApiCallbackWrapper taskApiCallbackWrapper) {
        }

        private String a(ConnectionResult connectionResult) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class RequestRunnable<OptionsT extends Api.ApiOptions> implements Runnable {
        private final HuaweiApi<OptionsT> a;
        private final TaskApiCallWrapper b;

        public RequestRunnable(HuaweiApi<OptionsT> huaweiApi, TaskApiCallWrapper taskApiCallWrapper) {
        }

        private void a(RequestHandler requestHandler, Exception exc) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class TaskApiCallbackWrapper {
        private final TaskApiCallWrapper a;
        private final AnyClient.CallBack b;

        public TaskApiCallbackWrapper(TaskApiCallWrapper taskApiCallWrapper, AnyClient.CallBack callBack) {
        }

        public TaskApiCallWrapper a() {
        }

        public AnyClient.CallBack b() {
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i2) {
    }

    public static /* synthetic */ void a(HuaweiApi huaweiApi, HuaweiApi huaweiApi2, g gVar) {
    }

    public static /* synthetic */ boolean b(HuaweiApi huaweiApi) {
    }

    public static /* synthetic */ Context c(HuaweiApi huaweiApi) {
    }

    @Deprecated
    public f<Boolean> disconnectService() {
    }

    public <TResult, TClient extends AnyClient> f<TResult> doWrite(TaskApiCall<TClient, TResult> taskApiCall) {
    }

    public Activity getActivity() {
    }

    public int getApiLevel() {
    }

    public String getAppID() {
    }

    public AnyClient getClient(Looper looper, RequestHandler requestHandler) {
    }

    public ClientSettings getClientSetting() {
    }

    public Context getContext() {
    }

    public int getKitSdkVersion() {
    }

    public TOption getOption() {
    }

    public List<Scope> getScopes() {
    }

    public String getSubAppID() {
    }

    public void setApiLevel(int i2) {
    }

    public void setHostContext(Context context) {
    }

    public void setInnerHms() {
    }

    public void setKitSdkVersion(int i2) {
    }

    public void setSubAppId(String str) throws ApiException {
    }

    @Deprecated
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
    }

    public static /* synthetic */ Context a(HuaweiApi huaweiApi) {
    }

    private void b(Context context) {
    }

    public static /* synthetic */ void a(HuaweiApi huaweiApi, Context context) {
    }

    private void a(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i2, String str) {
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i2, String str) {
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
    }

    private void a(Context context) {
    }

    private void a(HuaweiApi<?> huaweiApi, g<Boolean> gVar) {
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i2) {
    }

    private <TResult, TClient extends AnyClient> f<TResult> a(TaskApiCall<TClient, TResult> taskApiCall) {
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i2, String str) {
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
    }
}
