package com.tencent.bugly.library;

import android.content.Context;
import java.util.Map;
import k.i.c.a.c;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class Bugly {
    private static final String TAG = "Bugly_Init";
    private static int sAPMMode = 0;
    private static String sAppVersion = null;
    private static String sAppVersionType = "Unknown";
    private static String sBuildNum = null;
    private static c sCrashStrategyBean = null;
    private static boolean sDebugMode = false;
    private static String sDeviceModel = "UNKNOWN";
    private static int sLogLevel;
    private static String sUniqueId;
    private static String sUserId;

    private static boolean checkNotNull(Object obj) {
    }

    public static boolean handleCatchException(Thread thread, Throwable th, String str, byte[] bArr) {
    }

    public static boolean init(Context context, String str, String str2) {
    }

    public static void postException(int i2, String str, String str2, String str3, Map<String, String> map) {
    }

    public static void putUserData(Context context, String str, String str2) {
    }

    public static String removeUserData(Context context, String str) {
    }

    public static void setAPMMode(int i2) {
    }

    public static void setAppChannel(Context context, String str) {
    }

    public static void setAppVersion(String str) {
    }

    public static void setAppVersionType(String str) {
    }

    public static void setBuildNum(String str) {
    }

    public static void setCountryName(Context context, String str) {
    }

    public static void setCrashStrategyBean(c cVar) {
    }

    public static void setDebugMode(boolean z) {
    }

    public static void setDeviceModel(String str) {
    }

    public static void setUniqueId(String str) {
    }

    public static void setUserId(String str) {
    }
}
