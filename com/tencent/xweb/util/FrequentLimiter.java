package com.tencent.xweb.util;

import android.annotation.SuppressLint;
import java.util.HashMap;

@SuppressLint({"ApplySharedPref"})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class FrequentLimiter {
    public static final long DAY_MILLS = 86400000;
    public static final long HOURS_MILLS = 3600000;
    public static final String KEY_CLEAR_DOWNLOAD_ZIP = "CLEAR_DOWNLOAD_ZIP";
    public static final String KEY_CLEAR_OLD_APK = "CLEAR_OLD_APK";
    public static final long MINITUE_MILLS = 60000;
    public static final long SECOND_MILLS = 1000;
    public static final String TAG = "FrequentLimiter";
    public static final long WEEK_MILLS = 604800000;
    public static HashMap<String, Long> a;

    public static synchronized boolean canDo(String str, long j2) {
    }

    public static synchronized boolean canDoDaily(String str) {
    }

    public static synchronized boolean canDoOnProcessLive(String str, long j2) {
    }

    public static synchronized void resetCanDoTimeStamp(String str) {
    }

    public static synchronized boolean valueChanged(String str, String str2) {
    }
}
