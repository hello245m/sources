package com.tencent.mars.comm;

import android.content.Context;
import android.os.Handler;
import android.os.PowerManager;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class WakerLock {
    private static final String TAG = "MicroMsg.WakerLock";
    private Handler mHandler;
    private Runnable mReleaser;
    private PowerManager.WakeLock wakeLock;

    /* renamed from: com.tencent.mars.comm.WakerLock$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ WakerLock this$0;

        public AnonymousClass1(WakerLock wakerLock) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public WakerLock(Context context) {
    }

    public void finalize() throws Throwable {
    }

    public boolean isLocking() {
    }

    public void lock(long j2) {
    }

    public void unLock() {
    }

    public void lock() {
    }
}
