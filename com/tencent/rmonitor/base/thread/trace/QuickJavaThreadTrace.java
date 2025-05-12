package com.tencent.rmonitor.base.thread.trace;

import java.util.ArrayList;
import k.i.k.c.g.b.b;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class QuickJavaThreadTrace {
    public static boolean g = false;
    public boolean a;
    public int b;
    public int c;
    public Thread d;
    public long e;
    public boolean f;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a implements Runnable {
        public final /* synthetic */ QuickJavaThreadTrace a;

        public a(QuickJavaThreadTrace quickJavaThreadTrace) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public QuickJavaThreadTrace(Thread thread, boolean z, boolean z2) {
    }

    public static /* synthetic */ long a(QuickJavaThreadTrace quickJavaThreadTrace) {
    }

    public static /* synthetic */ int b(QuickJavaThreadTrace quickJavaThreadTrace) {
    }

    public static /* synthetic */ int c(QuickJavaThreadTrace quickJavaThreadTrace) {
    }

    public static boolean f() {
    }

    public static native int nativeInit(int i2);

    public ArrayList<b> d(long j2, long j3) {
    }

    public boolean e() {
    }

    public boolean g(int i2, int i3) {
    }

    public boolean h() {
    }

    public boolean i() {
    }

    public native long nativeCreate(long j2, long j3, boolean z, boolean z2);

    public native void nativeDestroy(long j2);

    public native String nativeGetStackTrace(long j2, long j3, long j4);

    public native void nativePrepare(long j2, long j3, boolean z, int i2, int i3);

    public native void nativeStart(long j2);

    public native void nativeStop(long j2);
}
