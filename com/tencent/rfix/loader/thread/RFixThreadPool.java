package com.tencent.rfix.loader.thread;

import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class RFixThreadPool {
    private static final int CORE_POOL_SIZE = 0;
    private static final long KEEP_ALIVE_TIME = 60;
    private static final int MAX_POOL_SIZE = 5;
    private static RFixThreadPool sInstance;
    private final ExecutorService executor;

    private RFixThreadPool() {
    }

    public static RFixThreadPool getInstance() {
    }

    public void execute(Runnable runnable) {
    }
}
