package com.tencent.bugly.common.reporter.data;

import n.d0.d.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class ReportStrategy {
    public static final Companion Companion = null;
    public static final int DEFAULT_BACKOFF_RETRY_DURATION = 60000;
    public static final int DEFAULT_CONNECT_TIMEOUT = 30000;
    public static final int DEFAULT_READ_TIMEOUT = 30000;
    public static final int DEFAULT_RETRY_TIMES = 3;
    private int alreadyRetryTimes;
    private int connectTimeout;
    private boolean needCache;
    private int priority;
    private int readTimeout;
    private RetryStrategy retryStrategy;
    private int retryTimes;
    private UploadStrategy uploadStrategy;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class RetryStrategy {
        private static final /* synthetic */ RetryStrategy[] $VALUES = null;
        public static final RetryStrategy RETRY_BACKOFF = null;
        public static final RetryStrategy RETRY_IMMEDIATELY = null;

        private RetryStrategy(String str, int i2) {
        }

        public static RetryStrategy valueOf(String str) {
        }

        public static RetryStrategy[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class UploadStrategy {
        private static final /* synthetic */ UploadStrategy[] $VALUES = null;
        public static final UploadStrategy UPLOAD_ANY = null;
        public static final UploadStrategy UPLOAD_NEXT_LAUNCH = null;
        public static final UploadStrategy UPLOAD_WIFI = null;

        private UploadStrategy(String str, int i2) {
        }

        public static UploadStrategy valueOf(String str) {
        }

        public static UploadStrategy[] values() {
        }
    }

    public final int getAlreadyRetryTimes() {
    }

    public final int getConnectTimeout() {
    }

    public final boolean getNeedCache() {
    }

    public final int getPriority() {
    }

    public final int getReadTimeout() {
    }

    public final RetryStrategy getRetryStrategy() {
    }

    public final int getRetryTimes() {
    }

    public final UploadStrategy getUploadStrategy() {
    }

    public final void setAlreadyRetryTimes(int i2) {
    }

    public final void setConnectTimeout(int i2) {
    }

    public final void setNeedCache(boolean z) {
    }

    public final void setPriority(int i2) {
    }

    public final void setReadTimeout(int i2) {
    }

    public final void setRetryStrategy(RetryStrategy retryStrategy) {
    }

    public final void setRetryTimes(int i2) {
    }

    public final void setUploadStrategy(UploadStrategy uploadStrategy) {
    }

    public String toString() {
    }
}
