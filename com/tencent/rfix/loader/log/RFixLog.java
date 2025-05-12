package com.tencent.rfix.loader.log;

import android.os.Handler;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class RFixLog {
    private static final String LOG_INLINE_FENCE_NAME = "com.tencent.rfix.loader.log.RFixLogInlineFence";
    private static final String TAG = "RFix.RFixLog";
    private static final IRFixLog sDefaultLogImpl = null;
    private static IRFixLog sLogImpl;
    private static final Object sLogImplLock = null;
    private static Handler sLogInlineFence;

    public static void d(String str, String str2) {
    }

    public static void e(String str, String str2) {
    }

    public static IRFixLog getLogImpl() {
    }

    public static void i(String str, String str2) {
    }

    public static boolean isDefaultLogImpl() {
    }

    private static void printLog(int i2, String str, String str2, Throwable th) {
    }

    private static void printPendingLogs() {
    }

    public static void setLogImpl(IRFixLog iRFixLog) {
    }

    public static void v(String str, String str2) {
    }

    public static void w(String str, String str2) {
    }

    public static void e(String str, String str2, Throwable th) {
    }

    public static void w(String str, String str2, Throwable th) {
    }
}
