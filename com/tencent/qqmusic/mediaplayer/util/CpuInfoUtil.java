package com.tencent.qqmusic.mediaplayer.util;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class CpuInfoUtil {
    private static final String CUR_CPU_FREQ = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq";
    private static final String TAG = "CpuInfoUtil";
    private static OutputCpuThread mCurrThread;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class OutputCpuThread extends Thread {
        public boolean isStop;

        public OutputCpuThread(String str) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    public static void outputCpuHZToLog() {
    }

    public static void outputThreadInfoToLog() {
    }

    public static synchronized void startProcessInfoOutput() {
    }

    public static synchronized void stopProcessInfoOutput() {
    }
}
