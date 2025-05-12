package com.huawei.hms.utils;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class FileUtil {
    public static final String LOCAL_REPORT_FILE = "hms/HwMobileServiceReport.txt";
    public static final String LOCAL_REPORT_FILE_CONFIG = "hms/config.txt";
    public static final long LOCAL_REPORT_FILE_MAX_SIZE = 10240;
    public static boolean a = false;
    public static ScheduledExecutorService b;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a implements Runnable {
        public final /* synthetic */ File a;
        public final /* synthetic */ long b;
        public final /* synthetic */ String c;

        public a(File file, long j2, String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static boolean verifyHash(String str, File file) {
    }

    public static void writeFile(File file, String str, long j2) {
    }

    public static void writeFileReport(Context context, File file, File file2, String str, long j2, int i2) {
    }
}
