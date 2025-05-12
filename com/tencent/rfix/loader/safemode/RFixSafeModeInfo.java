package com.tencent.rfix.loader.safemode;

import java.io.File;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class RFixSafeModeInfo {
    private static final String P1_COUNT = "p1_count";
    private static final String P2_COUNT = "p2_count";
    private static final String P3_CRASH_TIMES = "p3_crash_times";
    private static final String TAG = "RFix.RFixSafeModeInfo";
    public int p1Count;
    public int p2Count;
    public List<Long> p3CrashTimes;

    public RFixSafeModeInfo(int i2, int i3, List<Long> list) {
    }

    private static List<Long> deserializeCrashTimes(String str) {
    }

    public static RFixSafeModeInfo readSafeModeInfo(File file) {
    }

    private static String serializeCrashTimes(List<Long> list) {
    }

    public static boolean writeSafeModeInfo(RFixSafeModeInfo rFixSafeModeInfo, File file) {
    }

    public String toString() {
    }
}
