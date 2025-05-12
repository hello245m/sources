package com.tencent.tpns.dataacquisition;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.wifi.WifiInfo;
import java.util.List;
import java.util.Map;
import k.i.n.a.b;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class CustomDeviceInfos {
    private static final String DEVICEINFOS_REAL_CLASSNAME = "com.tencent.tpns.customdataacquisition.intf.CustomDeviceInfos";
    private static boolean isWarned = false;
    private static Boolean ismportImplClassFlag;

    public static String getAndroidId(Context context) {
    }

    public static List<PackageInfo> getAppPackages(Context context) {
    }

    public static String getFacilityIdentity(Context context) {
    }

    public static String getFacilityMacAddr(Context context) {
    }

    public static String getImsi(Context context) {
    }

    public static String getIp(Context context) {
    }

    public static Map<String, Integer> getRecentTasks(Context context) {
    }

    public static JSONObject getReportLocationJson(Context context) {
    }

    public static Map<String, ActivityManager.RunningAppProcessInfo> getRunningAppProces(Context context) {
    }

    public static Map<String, Integer> getRunningProcess(Context context) {
    }

    public static String getSimOperator(Context context) {
    }

    public static String getWiFiBBSID(Context context) {
    }

    public static String getWiFiSSID(Context context) {
    }

    public static WifiInfo getWifiInfo(Context context) {
    }

    public static JSONArray getWifiTopN(Context context, int i2) {
    }

    public static boolean isImportImplClass() {
    }

    private static void showWarnMessage(b bVar) {
    }
}
