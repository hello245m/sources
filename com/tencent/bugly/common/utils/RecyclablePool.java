package com.tencent.bugly.common.utils;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import n.d0.d.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class RecyclablePool {
    public static final Companion Companion = null;
    public static final String TAG = "Bugly_RPool";
    private final int capacity;
    private AtomicInteger count;
    private AtomicInteger obtainCount;
    private final ConcurrentLinkedQueue<Recyclable> queue;
    private AtomicInteger recycleCount;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class Recyclable {
        private boolean isInPool;

        public final void inPool() {
        }

        public final boolean isInPool() {
        }

        public final void outPool() {
        }

        public void reset() {
        }
    }

    public RecyclablePool(Class<? extends Recyclable> cls, int i2) {
    }

    public final int getObtainCount() {
    }

    public final int getRecycleCount() {
    }

    public final Recyclable obtain(Class<? extends Recyclable> cls) {
    }

    public final void recycle(Recyclable recyclable) {
    }
}
