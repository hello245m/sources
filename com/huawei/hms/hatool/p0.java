package com.huawei.hms.hatool;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class p0 {
    public static p0 b;
    public static p0 c;
    public static p0 d;
    public ThreadPoolExecutor a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a implements Runnable {
        public Runnable a;

        public a(Runnable runnable) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b implements ThreadFactory {
        public static final AtomicInteger d = null;
        public final ThreadGroup a;
        public final AtomicInteger b;
        public final String c;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    public static p0 a() {
    }

    public static p0 b() {
    }

    public static p0 c() {
    }

    public void a(o0 o0Var) {
    }
}
