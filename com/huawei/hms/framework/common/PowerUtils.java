package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class PowerUtils {
    private static final String TAG = "PowerUtils";

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class PowerMode {
        public static int POWER_MODE_DEFAULT_RETURN_VALUE = 0;
        public static int POWER_SAVER_MODE = 4;
        public static String SMART_MODE_STATUS = "SmartModeStatus";
    }

    public static boolean isAppIdleMode(Context context) {
    }

    public static boolean isDozeIdleMode(Context context) {
    }

    public static boolean isInteractive(Context context) {
    }

    public static boolean isWhilteList(Context context) {
    }

    @SuppressLint({"MissingPermission"})
    public static int readDataSaverMode(Context context) {
    }

    public static int readPowerSaverMode(Context context) {
    }
}
