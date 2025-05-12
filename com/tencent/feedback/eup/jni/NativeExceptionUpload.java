package com.tencent.feedback.eup.jni;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class NativeExceptionUpload {
    public static final int ANDROID_LOG_DEBUG = 3;
    public static final int ANDROID_LOG_ERROR = 6;
    public static final int ANDROID_LOG_INFO = 4;
    public static final int ANDROID_LOG_WARN = 5;
    private static final String EXTRA_JNI_NATIVE_VERSION = "nativeRqd.2.1.0";
    public static final int JAR_JNI_VERSION = 1;
    public static NativeExceptionHandler instance;
    public static AtomicBoolean isEnable;

    public static native boolean appendNativeLog(String str, String str2, String str3);

    public static native boolean appendWholeNativeLog(String str);

    public static boolean checkExtraJni(String str) {
    }

    public static native void doNativeCrashForTest();

    public static native void enableHandler(boolean z);

    public static native String getNativeKeyValueList();

    public static native String getNativeLog();

    public static synchronized NativeExceptionHandler getmHandler() {
    }

    public static native boolean putNativeKeyValue(String str, String str2);

    public static native boolean registNativeExceptionHandler(String str, String str2, int i2);

    public static native String registNativeExceptionHandler2(String str, String str2, int i2, int i3);

    public static native String removeNativeKeyValue(String str);

    public static native void setLogMode(int i2);

    public static synchronized void setmHandler(NativeExceptionHandler nativeExceptionHandler) {
    }

    public static void testNativeCrash() {
    }
}
