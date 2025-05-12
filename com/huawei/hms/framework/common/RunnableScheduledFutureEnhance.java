package com.huawei.hms.framework.common;

import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class RunnableScheduledFutureEnhance<T> implements RunnableScheduledFuture<T> {
    private String parentName;
    private RunnableScheduledFuture<T> proxy;

    public RunnableScheduledFutureEnhance(RunnableScheduledFuture<T> runnableScheduledFuture) {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
    }

    public boolean equals(Object obj) {
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
    }

    public String getParentName() {
    }

    public int hashCode() {
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public boolean isPeriodic() {
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(Delayed delayed) {
    }

    @Override // java.util.concurrent.Future
    public T get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
    }
}
