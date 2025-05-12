package com.huawei.hms.support.api;

import android.os.Looper;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.ResultCallback;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class ErrorResultImpl<R extends Result> extends PendingResult<R> {
    private R a;
    private int b;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ ResultCallback a;
        public final /* synthetic */ ErrorResultImpl b;
        public final /* synthetic */ ErrorResultImpl c;

        public a(ErrorResultImpl errorResultImpl, ResultCallback resultCallback, ErrorResultImpl errorResultImpl2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public ErrorResultImpl(int i2) {
    }

    public static /* synthetic */ int a(ErrorResultImpl errorResultImpl) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final R await() {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void cancel() {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public boolean isCanceled() {
    }

    public void postRunnable(Looper looper, ResultCallback<R> resultCallback, ErrorResultImpl errorResultImpl) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(ResultCallback<R> resultCallback) {
    }

    public static /* synthetic */ Result a(ErrorResultImpl errorResultImpl, int i2, ErrorResultImpl errorResultImpl2) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await(long j2, TimeUnit timeUnit) {
    }

    private R a(int i2, ErrorResultImpl errorResultImpl) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void setResultCallback(ResultCallback<R> resultCallback, long j2, TimeUnit timeUnit) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(Looper looper, ResultCallback<R> resultCallback) {
    }
}
