package com.tencent.wcdb.support;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class Log {
    public static final int LOGGER_DEFAULT = 1;
    public static final int LOGGER_NONE = 0;
    private static LogCallback mCallback;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface LogCallback {
        void println(int i2, String str, String str2);
    }

    private Log() {
    }

    public static void d(String str, String str2) {
    }

    public static void e(String str, String str2) {
    }

    public static void f(String str, String str2) {
    }

    public static void i(String str, String str2) {
    }

    private static native void nativePrintLn(int i2, String str, String str2);

    private static native void nativeSetLogger(int i2, LogCallback logCallback);

    public static void println(int i2, String str, String str2) {
    }

    public static void setLogger(int i2) {
    }

    public static void v(String str, String str2) {
    }

    public static void w(String str, String str2) {
    }

    public static void d(String str, String str2, Object... objArr) {
    }

    public static void e(String str, String str2, Object... objArr) {
    }

    public static void f(String str, String str2, Object... objArr) {
    }

    public static void i(String str, String str2, Object... objArr) {
    }

    public static void v(String str, String str2, Object... objArr) {
    }

    public static void w(String str, String str2, Object... objArr) {
    }

    public static void setLogger(LogCallback logCallback) {
    }
}
