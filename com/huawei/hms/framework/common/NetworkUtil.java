package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.SignalStrength;
import java.lang.reflect.Method;
import java.security.PrivilegedAction;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class NetworkUtil {
    private static final int INVALID_RSSI = -127;
    private static final String STR_NSA = "5G_NSA";
    private static final String STR_SA = "5G_SA";
    private static final String TAG = "NetworkUtil";
    private static final int TYPE_WIFI_P2P = 13;
    public static final int UNAVAILABLE = Integer.MAX_VALUE;

    /* renamed from: com.huawei.hms.framework.common.NetworkUtil$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements PrivilegedAction {
        public final /* synthetic */ Method val$method;

        public AnonymousClass1(Method method) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class NetType {
        public static final int TYPE_2G = 2;
        public static final int TYPE_3G = 3;
        public static final int TYPE_4G = 4;
        public static final int TYPE_4G_NSA = 7;
        public static final int TYPE_5G = 5;
        public static final int TYPE_5G_SA = 8;
        public static final int TYPE_MOBILE = 6;
        public static final int TYPE_NO_NETWORK = -1;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WIFI = 1;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class SignalType {
        public static final String LTE_CQI = "lteCqi";
        public static final String LTE_DBM = "lteDbm";
        public static final String LTE_RSRP = "lteRsrp";
        public static final String LTE_RSRQ = "lteRsrq";
        public static final String LTE_RSSI = "lteRssi";
        public static final String LTE_RSSNR = "lteRssnr";
        public static final String NR_CSIRSRP = "nrCSIRsrp";
        public static final String NR_CSIRSRQ = "nrCSIRsrq";
        public static final String NR_CSISINR = "nrCSISinr";
        public static final String NR_DBM = "nrDbm";
        public static final String NR_SSRSRP = "nrSSRsrp";
        public static final String NR_SSRSRQ = "nrSSRsrq";
        public static final String NR_SSSINR = "nrSSSinr";
    }

    public static String getDnsServerIps(Context context) {
    }

    @SuppressLint({"MissingPermission"})
    private static String[] getDnsServerIpsFromConnectionManager(Context context) {
    }

    public static String getHost(String str) {
    }

    @SuppressLint({"MissingPermission", "NewApi"})
    private static int getHwNetworkType(Context context) {
    }

    public static int getInfoWithReflect(SignalStrength signalStrength, String str) {
    }

    public static int getLteCqi(Context context) {
    }

    public static int getLteRsrp(Context context) {
    }

    public static int getLteRsrq(Context context) {
    }

    public static int getLteRssi(Context context) {
    }

    public static int getLteRssnr(Context context) {
    }

    public static Map<String, Integer> getLteSignalInfo(Context context) {
    }

    public static String getMNC(Context context) {
    }

    public static int getMobileRsrp(Context context) {
    }

    private static int getMobileSingalStrengthUpPPlatfrom(Context context) {
    }

    public static String getNetWorkNSAorSA() {
    }

    @SuppressLint({"MissingPermission"})
    public static NetworkInfo getNetworkInfo(Context context) {
    }

    @SuppressLint({"MissingPermission"})
    public static NetworkInfo.DetailedState getNetworkStatus(Context context) {
    }

    public static int getNetworkType(Context context) {
    }

    public static int getNrCsiRsrp(Context context) {
    }

    public static int getNrCsiRsrq(Context context) {
    }

    public static int getNrCsiSinr(Context context) {
    }

    public static Map<String, Integer> getNrSignalInfo(Context context) {
    }

    public static int getNrSsRsrp(Context context) {
    }

    public static int getNrSsRsrq(Context context) {
    }

    public static int getNrSsSinr(Context context) {
    }

    public static int getPrimaryNetworkType(Context context) {
    }

    private static SignalStrength getSignalStrength(Context context) {
    }

    public static String getWifiGatewayIp(Context context) {
    }

    public static int getWifiRssi(Context context) {
    }

    public static int getWifiRssiLevel(Context context) {
    }

    private static int groupNetworkType(int i2) {
    }

    public static boolean isChangeToConnected(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
    }

    public static boolean isConnectTypeChange(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
    }

    @Deprecated
    public static boolean isForeground(Context context) {
    }

    public static boolean isNetworkAvailable(Context context) {
    }

    public static boolean isSimReady(Context context) {
    }

    public static boolean isUserUnlocked(Context context) {
    }

    public static int netWork(Context context) {
    }

    @Deprecated
    public static NetworkInfo.DetailedState networkStatus(Context context) {
    }

    @SuppressLint({"MissingPermission"})
    public static int readDataSaverMode(Context context) {
    }

    public static int getNetworkType(NetworkInfo networkInfo, Context context) {
    }

    public static int getPrimaryNetworkType(NetworkInfo networkInfo) {
    }

    public static int getNetworkType(NetworkInfo networkInfo) {
    }
}
