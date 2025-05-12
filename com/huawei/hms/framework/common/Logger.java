package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class Logger {
    private static final boolean DEBUG = false;
    private static final int MAX_STACK_DEEP_LENGTH = 20;
    private static final int MAX_STACK_DEEP_LENGTH_NORMAL = 8;
    private static final String SPLIT = "|";
    private static final String TAG = "NetworkKit_Logger";
    private static final String TAG_NETWORKKIT_PRE = "NetworkKit_";
    private static final String TAG_NETWORK_SDK_PRE = "NetworkSdk_";
    private static ExtLogger extLogger = null;
    private static boolean kitPrint = true;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class ThrowableWrapper extends Throwable {
        private static final long serialVersionUID = 7129050843360571879L;
        private String message;
        private Throwable ownerThrowable;
        private Throwable thisCause;

        public /* synthetic */ ThrowableWrapper(Throwable th, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ void access$100(ThrowableWrapper throwableWrapper, Throwable th) {
        }

        private void setCause(Throwable th) {
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
        }

        @Override // java.lang.Throwable
        public String getMessage() {
        }

        public void setMessage(String str) {
        }

        @Override // java.lang.Throwable
        public String toString() {
        }

        private ThrowableWrapper(Throwable th) {
        }
    }

    private static String complexAppTag(String str) {
    }

    private static String complexMsg(String str, int i2) {
    }

    private static String complexTag(String str) {
    }

    @SuppressLint({"LogTagMismatch"})
    public static void d(String str, Object obj) {
    }

    public static void e(String str, Object obj) {
    }

    private static void extLogPrintln(int i2, String str, String str2) {
    }

    private static String getCallMethodInfo(int i2) {
    }

    private static Throwable getNewThrowable(Throwable th) {
    }

    @SuppressLint({"LogTagMismatch"})
    public static void i(String str, Object obj) {
    }

    private static boolean isAPPLoggable(int i2) {
    }

    private static boolean isKitLoggable(int i2) {
    }

    public static boolean isLoggable(int i2) {
    }

    private static int logPrintln(int i2, String str, String str2) {
    }

    public static void println(int i2, String str, Object obj) {
    }

    public static void setExtLogger(ExtLogger extLogger2, boolean z) {
    }

    public static void v(String str, String str2, Object... objArr) {
    }

    public static void w(String str, Object obj) {
    }

    @SuppressLint({"LogTagMismatch"})
    public static void d(String str, String str2, Object... objArr) {
    }

    public static void e(String str, String str2, Object... objArr) {
    }

    @SuppressLint({"LogTagMismatch"})
    public static void i(String str, String str2, Object... objArr) {
    }

    public static void println(int i2, String str, String str2, Object... objArr) {
    }

    public static void v(String str, Object obj) {
    }

    public static void w(String str, String str2, Object... objArr) {
    }

    public static void e(String str, String str2, Throwable th) {
    }

    public static void w(String str, String str2, Throwable th) {
    }
}
