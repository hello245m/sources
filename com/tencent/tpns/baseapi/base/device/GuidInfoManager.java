package com.tencent.tpns.baseapi.base.device;

import android.content.Context;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class GuidInfoManager {
    public static void clearGuidInfo(Context context) {
    }

    public static void clearTokenCache() {
    }

    public static void forceExpired(Context context) {
    }

    public static int getEncryptLevel(Context context) {
    }

    public static long getExpiredSeconds(Context context) {
    }

    public static GUIDInfo getFinalGuidInfo(Context context, boolean z, String str) {
    }

    public static long getGuid(Context context) {
    }

    public static long getLastRefreshTime(Context context) {
    }

    public static synchronized String getLastResolvedGuidServerIP(Context context) {
    }

    public static String getMqttPassword(Context context) {
    }

    public static String getMqttServer(Context context) {
    }

    public static synchronized String getMqttServerIP(Context context) {
    }

    public static synchronized long getMqttServerRefreshTime(Context context) {
    }

    public static String getMqttUserName(Context context) {
    }

    public static int getRefuseRate(Context context) {
    }

    public static String getServerIPAddress(Context context, String str) {
    }

    public static String getToken(Context context) {
    }

    public static String getTokenList(Context context) {
    }

    public static boolean isExpired(Context context) {
    }

    public static boolean isMqttServerExpired(Context context) {
    }

    public static boolean isServerDestroy(Context context) {
    }

    public static synchronized GUIDInfo refreshConnectInfoSynchronized(Context context, int i2, RefreshCallback refreshCallback) {
    }

    public static synchronized void setLastResolvedGuidServerIP(Context context, String str) {
    }

    public static synchronized void setMqttServerIP(Context context, String str) {
    }

    public static synchronized void setMqttServerRefreshTime(Context context, long j2) {
    }

    public static void wrtieDebugInfo(Context context, String str, String str2) {
    }
}
