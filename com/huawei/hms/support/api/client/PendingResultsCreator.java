package com.huawei.hms.support.api.client;

import com.huawei.hms.common.api.OptionalPendingResult;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class PendingResultsCreator {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class DiscardedPendingResult<R extends Result> extends EmptyPendingResult {
        public DiscardedPendingResult() {
        }

        @Override // com.huawei.hms.support.api.client.EmptyPendingResult, com.huawei.hms.support.api.client.PendingResult
        public boolean isCanceled() {
        }

        public DiscardedPendingResult(R r2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class InstantPendingResult<R extends Result> extends EmptyPendingResult {
        public InstantPendingResult(R r2) {
        }

        @Override // com.huawei.hms.support.api.client.EmptyPendingResult, com.huawei.hms.support.api.client.PendingResult
        public void cancel() {
        }

        @Override // com.huawei.hms.support.api.client.EmptyPendingResult, com.huawei.hms.support.api.client.PendingResult
        public void setResultCallback(ResultCallback resultCallback) {
        }
    }

    public static PendingResult<Status> discardedPendingResult() {
    }

    public static PendingResult<Status> instantPendingResult(Status status) {
    }

    public static <R extends Result> PendingResult<R> discardedPendingResult(R r2) {
    }

    public static <R extends Result> OptionalPendingResult<R> instantPendingResult(R r2) {
    }
}
