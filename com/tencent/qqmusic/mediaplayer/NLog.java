package com.tencent.qqmusic.mediaplayer;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class NLog {
    private static final int LEVEL_DEBUG = 1;
    private static final int LEVEL_ERROR = 4;
    private static final int LEVEL_INFO = 2;
    private static final int LEVEL_WARNING = 3;
    private static final String TAG = "NLog";
    private static volatile boolean mIsLoadSuccess = false;

    public static void D(String str, String str2) {
    }

    public static void E(String str, String str2) {
    }

    public static String GetLogPath() {
    }

    public static void I(String str, String str2) {
    }

    public static boolean Start(String str, int i2) {
    }

    public static void Stop() {
    }

    public static void W(String str, String str2) {
    }

    private static void WriteLogCallback(int i2, String str, String str2) {
    }

    private static native void d(String str, String str2);

    private static native void e(String str, String str2);

    private static native String getLogPath();

    private static native void i(String str, String str2);

    public static boolean init(String str, String str2, int i2) {
    }

    private static native void setLogWriteCallback(int i2);

    public static void setWriteCallback(boolean z) {
    }

    private static native boolean start(String str, int i2);

    private static native void stop();

    private static native void w(String str, String str2);

    public static void D(String str, String str2, Throwable th) {
    }

    public static void E(String str, String str2, Throwable th) {
    }

    public static void I(String str, String str2, Throwable th) {
    }

    public static void W(String str, String str2, Throwable th) {
    }
}
