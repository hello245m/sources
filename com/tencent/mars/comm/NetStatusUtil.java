package com.tencent.mars.comm;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class NetStatusUtil {
    public static final int CMNET = 6;
    public static final int CMWAP = 5;
    public static final int CTNET = 8;
    public static final int CTWAP = 7;
    public static final int LTE = 10;
    public static final int MOBILE = 9;
    public static final int NETTYPE_NOT_WIFI = 0;
    public static final int NETTYPE_WIFI = 1;
    public static final int NET_3G = 4;
    public static final int NON_NETWORK = -1;
    public static final int NO_SIM_OPERATOR = 0;
    public static final int POLICY_NONE = 0;
    public static final int POLICY_REJECT_METERED_BACKGROUND = 1;
    private static final String TAG = "MicroMsg.NetStatusUtil";
    public static final int TBACKGROUND_DATA_LIMITED = 2;
    public static final int TBACKGROUND_NOT_LIMITED = 0;
    public static final int TBACKGROUND_PROCESS_LIMITED = 1;
    public static final int TBACKGROUND_WIFI_LIMITED = 3;
    public static final int UNINET = 1;
    public static final int UNIWAP = 2;
    public static final int UNKNOW_TYPE = 999;
    public static final int WAP_3G = 3;
    public static final int WIFI = 0;
    private static int nowStrength;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class StrengthListener extends PhoneStateListener {
        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        }
    }

    public static /* synthetic */ int access$002(int i2) {
    }

    public static void dumpNetStatus(Context context) {
    }

    public static int getBackgroundLimitType(Context context) {
    }

    public static int getISPCode(Context context) {
    }

    public static String getISPName(Context context) {
    }

    public static int getNetType(Context context) {
    }

    public static int getNetTypeForStat(Context context) {
    }

    public static String getNetTypeString(Context context) {
    }

    public static int getNetWorkType(Context context) {
    }

    public static int getProxyInfo(Context context, StringBuffer stringBuffer) {
    }

    public static int getStrength(Context context) {
    }

    public static WifiInfo getWifiInfo(Context context) {
    }

    public static int getWifiSleeepPolicy(Context context) {
    }

    public static int guessNetSpeed(Context context) {
    }

    public static boolean is2G(Context context) {
    }

    public static boolean is3G(Context context) {
    }

    public static boolean is4G(Context context) {
    }

    public static boolean is5G(Context context) {
    }

    public static boolean isConnected(Context context) {
    }

    public static boolean isImmediatelyDestroyActivities(Context context) {
    }

    public static boolean isKnownDirectNet(Context context) {
    }

    public static boolean isLimited(int i2) {
    }

    public static boolean isMobile(Context context) {
    }

    public static boolean isNetworkConnected(Context context) {
    }

    public static boolean isWap(int i2) {
    }

    public static boolean isWap(Context context) {
    }

    public static boolean isWifi(int i2) {
    }

    public static boolean isWifi(Context context) {
    }

    private static Intent searchIntentByClass(Context context, String str) {
    }

    public static void startSettingItent(Context context, int i2) {
    }
}
