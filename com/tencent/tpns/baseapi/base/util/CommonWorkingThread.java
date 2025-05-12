package com.tencent.tpns.baseapi.base.util;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class CommonWorkingThread {
    private static HandlerThread a;
    private static Handler b;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class CommonWorkingThreadHolder {
        public static CommonWorkingThread instance;
    }

    public /* synthetic */ CommonWorkingThread(AnonymousClass1 anonymousClass1) {
    }

    private static void a() {
    }

    public static CommonWorkingThread getInstance() {
    }

    public boolean execute(TTask tTask) {
    }

    public boolean executeAtTime(TTask tTask, int i2, long j2) {
    }

    public Handler getHandler() {
    }

    public void remove(int i2) {
    }

    private CommonWorkingThread() {
    }

    public boolean execute(TTask tTask, long j2) {
    }

    public void remove(TTask tTask) {
    }
}
