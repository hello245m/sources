package com.huawei.hms.framework.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ExecutorsUtils {
    private static final String THREADNAME_HEADER = "NetworkKit_";

    /* renamed from: com.huawei.hms.framework.common.ExecutorsUtils$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements ThreadFactory {
        private final AtomicInteger threadNumbers;
        public final /* synthetic */ String val$threadName;

        public AnonymousClass1(String str) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    public static ThreadFactory createThreadFactory(String str) {
    }

    public static ExecutorService newCachedThreadPool(String str) {
    }

    public static ExecutorService newFixedThreadPool(int i2, String str) {
    }

    public static ScheduledExecutorService newScheduledThreadPool(int i2, String str) {
    }

    public static ExecutorService newSingleThreadExecutor(String str) {
    }
}
