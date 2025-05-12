package com.tencent.bugly.common.thread;

import android.os.Handler;
import android.os.Looper;
import n.d0.d.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class ThreadManager {
    private static volatile Looper BATTERY_LOOPER;
    public static final Companion Companion = null;
    private static volatile Looper DUMP_LOOPER;
    private static volatile Looper LOG_LOOPER;
    private static volatile Looper MONITOR_LOOPER;
    private static volatile Handler mainThreadHandler;
    private static volatile Handler monitorThreadHandler;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class Companion {
        private Companion() {
        }

        private final void postDelayed(Runnable runnable, long j2, Handler handler) {
        }

        public static /* synthetic */ void postDelayed$default(Companion companion, Runnable runnable, long j2, Handler handler, int i2, Object obj) {
        }

        public static /* synthetic */ void runInMainThread$default(Companion companion, Runnable runnable, long j2, int i2, Object obj) {
        }

        public static /* synthetic */ void runInMonitorThread$default(Companion companion, Runnable runnable, long j2, int i2, Object obj) {
        }

        public final Looper getBatteryThreadLooper() {
        }

        public final Looper getDumpThreadLooper() {
        }

        public final Looper getLogThreadLooper() {
        }

        public final Looper getMonitorThreadLooper() {
        }

        public final void runInMainThread(Runnable runnable, long j2) {
        }

        public final void runInMonitorThread(Runnable runnable, long j2) {
        }

        public /* synthetic */ Companion(h hVar) {
        }
    }

    public static final /* synthetic */ Looper access$getBATTERY_LOOPER$cp() {
    }

    public static final /* synthetic */ Looper access$getDUMP_LOOPER$cp() {
    }

    public static final /* synthetic */ Looper access$getLOG_LOOPER$cp() {
    }

    public static final /* synthetic */ Looper access$getMONITOR_LOOPER$cp() {
    }

    public static final /* synthetic */ Handler access$getMainThreadHandler$cp() {
    }

    public static final /* synthetic */ Handler access$getMonitorThreadHandler$cp() {
    }

    public static final /* synthetic */ void access$setBATTERY_LOOPER$cp(Looper looper) {
    }

    public static final /* synthetic */ void access$setDUMP_LOOPER$cp(Looper looper) {
    }

    public static final /* synthetic */ void access$setLOG_LOOPER$cp(Looper looper) {
    }

    public static final /* synthetic */ void access$setMONITOR_LOOPER$cp(Looper looper) {
    }

    public static final /* synthetic */ void access$setMainThreadHandler$cp(Handler handler) {
    }

    public static final /* synthetic */ void access$setMonitorThreadHandler$cp(Handler handler) {
    }

    public static final Looper getBatteryThreadLooper() {
    }

    public static final Looper getDumpThreadLooper() {
    }

    public static final Looper getLogThreadLooper() {
    }

    public static final Looper getMonitorThreadLooper() {
    }

    public static final void runInMainThread(Runnable runnable, long j2) {
    }

    public static final void runInMonitorThread(Runnable runnable, long j2) {
    }
}
