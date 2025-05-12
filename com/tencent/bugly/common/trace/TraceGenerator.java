package com.tencent.bugly.common.trace;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.Random;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class TraceGenerator {
    private static final int BYTE_RANGE = 255;
    private static final String PROCESS_LAUNCH_ID = null;
    public static final int SPAN_ID_LEN = 8;
    private static final String TAG = "RMonitor_trace";
    public static final int TRACE_ID_LEN = 16;
    private static final Random random = null;

    public static String generateRandomString(int i2) {
    }

    public static String generateSpanID() {
    }

    public static String generateTraceID() {
    }

    public static String getLaunchId(Context context) {
    }

    private static String getLaunchIdFromCache(Context context) {
    }

    public static String getProcessLaunchId() {
    }

    @SuppressLint({"ApplySharedPref"})
    public static void updateLaunchIdCache(Context context) {
    }
}
