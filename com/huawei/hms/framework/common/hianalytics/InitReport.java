package com.huawei.hms.framework.common.hianalytics;

import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class InitReport {
    private static final int EVENT_LIMIT = 10;
    private static final String TAG = "HaReport";
    private static List<Runnable> eventsToReport = null;
    private static boolean hasConnectNet = false;

    /* renamed from: com.huawei.hms.framework.common.hianalytics.InitReport$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static /* synthetic */ void access$000() {
    }

    public static void enableConnectNet() {
    }

    public static void reportWhenInit(Runnable runnable) {
    }

    private static void submitAllEvents() {
    }
}
