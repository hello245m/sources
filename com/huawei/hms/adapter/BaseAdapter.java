package com.huawei.hms.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.adapter.sysobs.SystemObserver;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.ResponseWrap;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class BaseAdapter {
    private WeakReference<ApiClient> a;
    private WeakReference<Activity> b;
    private BaseCallBack c;
    private String d;
    private String e;
    private Parcelable f;
    private BaseCallBack g;
    private String h;

    /* renamed from: i, reason: collision with root package name */
    private Context f595i;

    /* renamed from: j, reason: collision with root package name */
    private RequestHeader f596j;

    /* renamed from: k, reason: collision with root package name */
    private ResponseHeader f597k;

    /* renamed from: l, reason: collision with root package name */
    private SystemObserver f598l;

    /* renamed from: com.huawei.hms.adapter.BaseAdapter$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements SystemObserver {
        public final /* synthetic */ BaseAdapter a;

        public AnonymousClass1(BaseAdapter baseAdapter) {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onNoticeResult(int i2) {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onSolutionResult(Intent intent, String str) {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onUpdateResult(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface BaseCallBack {
        void onComplete(String str, String str2, Parcelable parcelable);

        void onError(String str);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class BaseRequestResultCallback implements ResultCallback<ResolveResult<CoreBaseResponse>> {
        private AtomicBoolean a;
        public final /* synthetic */ BaseAdapter b;

        /* renamed from: com.huawei.hms.adapter.BaseAdapter$BaseRequestResultCallback$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 implements AvailableAdapter.AvailableCallBack {
            public final /* synthetic */ BaseCallBack a;
            public final /* synthetic */ BaseRequestResultCallback b;

            public AnonymousClass1(BaseRequestResultCallback baseRequestResultCallback, BaseCallBack baseCallBack) {
            }

            @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
            public void onComplete(int i2) {
            }
        }

        public BaseRequestResultCallback(BaseAdapter baseAdapter) {
        }

        private void a(String str, BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse, int i2) {
        }

        private void b(BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse) {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        public /* bridge */ /* synthetic */ void onResult(ResolveResult<CoreBaseResponse> resolveResult) {
        }

        /* renamed from: onResult, reason: avoid collision after fix types in other method */
        public void onResult2(ResolveResult<CoreBaseResponse> resolveResult) {
        }

        private void a(BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class MPendingResultImpl extends PendingResultImpl<ResolveResult<CoreBaseResponse>, CoreBaseResponse> {
        public MPendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        public /* bridge */ /* synthetic */ ResolveResult<CoreBaseResponse> onComplete(CoreBaseResponse coreBaseResponse) {
        }

        /* renamed from: onComplete, reason: avoid collision after fix types in other method */
        public ResolveResult<CoreBaseResponse> onComplete2(CoreBaseResponse coreBaseResponse) {
        }
    }

    public BaseAdapter(ApiClient apiClient) {
    }

    public static /* synthetic */ BaseCallBack a(BaseAdapter baseAdapter) {
    }

    public static /* synthetic */ String b(BaseAdapter baseAdapter) {
    }

    public static /* synthetic */ void c(BaseAdapter baseAdapter, Intent intent, BaseCallBack baseCallBack) {
    }

    public static /* synthetic */ Context d(BaseAdapter baseAdapter) {
    }

    public static /* synthetic */ Activity e(BaseAdapter baseAdapter) {
    }

    public static /* synthetic */ void f(BaseAdapter baseAdapter) {
    }

    private void g() {
    }

    private void h() {
    }

    private void i() {
    }

    public void baseRequest(String str, String str2, Parcelable parcelable, BaseCallBack baseCallBack) {
    }

    public static /* synthetic */ String a(BaseAdapter baseAdapter, int i2) {
    }

    public static /* synthetic */ boolean b(BaseAdapter baseAdapter, Intent intent, BaseCallBack baseCallBack) {
    }

    public static /* synthetic */ ResponseHeader c(BaseAdapter baseAdapter) {
    }

    private String d() {
    }

    private String e() {
    }

    private Parcelable f() {
    }

    public static /* synthetic */ void a(BaseAdapter baseAdapter, Context context, ResponseHeader responseHeader, long j2) {
    }

    public static /* synthetic */ String b(BaseAdapter baseAdapter, int i2) {
    }

    private Activity c() {
    }

    public static /* synthetic */ boolean a(BaseAdapter baseAdapter, Intent intent, BaseCallBack baseCallBack) {
    }

    private BaseCallBack b() {
    }

    public static /* synthetic */ void a(BaseAdapter baseAdapter, Context context, ResponseHeader responseHeader) {
    }

    public static /* synthetic */ void a(BaseAdapter baseAdapter, Activity activity, Parcelable parcelable) {
    }

    private void b(Context context, RequestHeader requestHeader) {
    }

    public BaseAdapter(ApiClient apiClient, Activity activity) {
    }

    public static /* synthetic */ ResponseWrap a(BaseAdapter baseAdapter, int i2, String str) {
    }

    private PendingResult<ResolveResult<CoreBaseResponse>> a(ApiClient apiClient, String str, CoreBaseRequest coreBaseRequest) {
    }

    private void a(Activity activity, Parcelable parcelable) {
    }

    private void c(int i2) {
    }

    private String b(int i2) {
    }

    private void b(String str) {
    }

    private boolean b(Intent intent, BaseCallBack baseCallBack) {
    }

    private void c(Intent intent, BaseCallBack baseCallBack) {
    }

    private void a(Context context, RequestHeader requestHeader) {
    }

    private void a(Context context, ResponseHeader responseHeader) {
    }

    private void a(Context context, ResponseHeader responseHeader, long j2) {
    }

    private ResponseWrap a(int i2, String str) {
    }

    private String a(int i2) {
    }

    private void a(String str) {
    }

    private void a(Parcelable parcelable) {
    }

    private BaseCallBack a() {
    }

    private void a(BaseCallBack baseCallBack) {
    }

    private void a(String str, String str2, Parcelable parcelable, BaseCallBack baseCallBack) {
    }

    private boolean a(Intent intent, BaseCallBack baseCallBack) {
    }
}
