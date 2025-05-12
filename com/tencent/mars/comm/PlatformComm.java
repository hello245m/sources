package com.tencent.mars.comm;

import android.content.Context;
import android.os.Handler;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class PlatformComm {
    public static final int EMobile = 2;
    public static final int ENoNet = -1;
    public static final int EOtherNet = 3;
    public static final int EWifi = 1;
    private static final boolean IS_PROXY_ON = false;
    public static final int NETTYPE_2G = 3;
    public static final int NETTYPE_3G = 4;
    public static final int NETTYPE_4G = 5;
    public static final int NETTYPE_NON = -1;
    public static final int NETTYPE_NOT_WIFI = 0;
    public static final int NETTYPE_UNKNOWN = 6;
    public static final int NETTYPE_WAP = 2;
    public static final int NETTYPE_WIFI = 1;
    private static final String TAG = "PlatformComm";
    private static ICallback callback;
    public static Context context;
    public static Handler handler;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class APNInfo {
        public String extraInfo;
        public int netType;
        public int subNetType;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class Assert {
        public static void assertTrue(String str, boolean z) {
        }

        public static void assertTrue(boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class C2Java {
        private static String exception2String(Exception exc) {
        }

        public static APNInfo getAPNInfo() {
        }

        public static int getCurRadioAccessNetworkInfo() {
        }

        public static SIMInfo getCurSIMInfo() {
        }

        public static WifiInfo getCurWifiInfo() {
        }

        public static int getNetInfo() {
        }

        public static int getProxyInfo(StringBuffer stringBuffer) {
        }

        public static long getSignal(boolean z) {
        }

        public static int getStatisticsNetType() {
        }

        public static boolean isNetworkConnected() {
        }

        public static boolean startAlarm(int i2, int i3, int i4) {
        }

        public static boolean stopAlarm(int i2) {
        }

        public static WakerLock wakeupLock_new() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface ICallback {
        APNInfo getAPNInfo();

        int getCurRadioAccessNetworkInfo();

        SIMInfo getCurSIMInfo();

        WifiInfo getCurWifiInfo();

        int getNetInfo();

        int getProxyInfo(StringBuffer stringBuffer);

        long getSignal(boolean z);

        int getStatisticsNetType();

        boolean isNetworkConnected();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class SIMInfo {
        public String ispCode;
        public String ispName;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class WifiInfo {
        public String bssid;
        public String ssid;
    }

    public static /* synthetic */ ICallback access$000() {
    }

    public static void init(Context context2, Handler handler2, ICallback iCallback) {
    }
}
