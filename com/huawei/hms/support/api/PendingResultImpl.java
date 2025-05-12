package com.huawei.hms.support.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.InnerPendingResult;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.transport.DatagramTransport;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class PendingResultImpl<R extends Result, T extends IMessageEntity> extends InnerPendingResult<R> {
    private CountDownLatch a;
    private R b;
    private WeakReference<ApiClient> c;
    private String d;
    private String e;
    private boolean f;
    public DatagramTransport transport;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements DatagramTransport.a {
        public final /* synthetic */ PendingResultImpl a;

        public a(PendingResultImpl pendingResultImpl) {
        }

        @Override // com.huawei.hms.support.api.transport.DatagramTransport.a
        public void a(int i2, IMessageEntity iMessageEntity) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements DatagramTransport.a {
        public final /* synthetic */ AtomicBoolean a;
        public final /* synthetic */ PendingResultImpl b;

        public b(PendingResultImpl pendingResultImpl, AtomicBoolean atomicBoolean) {
        }

        @Override // com.huawei.hms.support.api.transport.DatagramTransport.a
        public void a(int i2, IMessageEntity iMessageEntity) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements DatagramTransport.a {
        public final /* synthetic */ d a;
        public final /* synthetic */ ResultCallback b;
        public final /* synthetic */ PendingResultImpl c;

        public c(PendingResultImpl pendingResultImpl, d dVar, ResultCallback resultCallback) {
        }

        @Override // com.huawei.hms.support.api.transport.DatagramTransport.a
        public void a(int i2, IMessageEntity iMessageEntity) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d<R extends Result> extends Handler {
        public d(Looper looper) {
        }

        public void a(ResultCallback<? super R> resultCallback, R r2) {
        }

        public void b(ResultCallback<? super R> resultCallback, R r2) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
    }

    public static /* synthetic */ void a(PendingResultImpl pendingResultImpl, int i2, IMessageEntity iMessageEntity) {
    }

    public static /* synthetic */ Result b(PendingResultImpl pendingResultImpl) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final R await() {
    }

    @Override // com.huawei.hms.support.api.client.InnerPendingResult
    public final R awaitOnAnyThread() {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void cancel() {
    }

    public boolean checkApiClient(ApiClient apiClient) {
    }

    public Class<T> getResponseType() {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public boolean isCanceled() {
    }

    public abstract R onComplete(T t2);

    public R onError(int i2) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(ResultCallback<R> resultCallback) {
    }

    public static /* synthetic */ CountDownLatch a(PendingResultImpl pendingResultImpl) {
    }

    private void a(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<T> cls, int i2) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(Looper looper, ResultCallback<R> resultCallback) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await(long j2, TimeUnit timeUnit) {
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<T> cls) {
    }

    private void a(int i2, IMessageEntity iMessageEntity) {
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity, int i2) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void setResultCallback(ResultCallback<R> resultCallback, long j2, TimeUnit timeUnit) {
    }

    @Override // com.huawei.hms.support.api.client.InnerPendingResult
    public final R awaitOnAnyThread(long j2, TimeUnit timeUnit) {
    }

    private void a(int i2, int i3) {
    }
}
