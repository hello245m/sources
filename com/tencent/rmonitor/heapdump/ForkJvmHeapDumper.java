package com.tencent.rmonitor.heapdump;

import java.util.concurrent.atomic.AtomicBoolean;
import k.i.k.j.b;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ForkJvmHeapDumper extends StripHeapDumper {
    public static boolean d = false;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a implements Runnable {
        public final /* synthetic */ AtomicBoolean a;
        public final /* synthetic */ int b;

        public a(ForkJvmHeapDumper forkJvmHeapDumper, AtomicBoolean atomicBoolean, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private static native void nDisableCrashProtect();

    private static native void nEnableCrashProtect();

    private static native void nExitProcess(int i2);

    private static native int nFork();

    private static native boolean nInitForkDump(int i2);

    private static native void nResumeVM(long j2);

    private static native int nSuspendVM(long j2);

    private static native int nWaitProcessExit(int i2);

    @Override // k.i.k.j.e
    public boolean a() {
    }

    @Override // k.i.k.j.e
    public int b(String str, b bVar) {
    }

    public final int l(String str, b bVar) {
    }
}
