package com.tencent.xweb.util;

import android.content.Context;
import com.tencent.xweb.report.KVReportForCheckStorage;
import java.io.File;
import java.util.HashSet;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebCleaner {
    public static final String CHECK_FILES_MD5_TIME_KEY = "CHECK_FILES_MD5_TIME_KEY";
    public static final int MIN_APK_VERSION_HAS_RESOURCE_CONFIG_FILE = 362;
    public static final String TAG = "XWebCleaner";
    public static volatile boolean sIsBusy = false;

    /* renamed from: com.tencent.xweb.util.XWebCleaner$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ Context val$context;

        public AnonymousClass1(Context context) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static /* synthetic */ boolean access$002(boolean z) {
    }

    public static void checkFiles(boolean z) {
    }

    public static void checkStorage(Context context) {
    }

    public static void clearAllVersion(Context context) {
    }

    public static void clearOldVersion(Context context) {
    }

    public static boolean clearVersion(int i2) {
    }

    public static boolean doCheckFiles(int i2) {
    }

    public static boolean doCheckResFiles(int i2) {
    }

    public static int getApkVersion(File file) {
    }

    public static File getFileListConfigFile(int i2) {
    }

    public static HashSet<String> getKeepVersionSet() {
    }

    public static long getTotalCoreSize(KVReportForCheckStorage kVReportForCheckStorage, File file, String str) {
    }

    public static long getTotalPluginSize(KVReportForCheckStorage kVReportForCheckStorage, File file) {
    }

    public static boolean isBusy() {
    }

    public static void tryClean(Context context) {
    }

    public static void tryCleanAllDownloadedZip(Context context, boolean z) {
    }

    public static boolean tryCleanDownloadedZip(int i2) {
    }

    public static void tryCleanUselessFiles(int i2) {
    }

    public static void tryClearOldVersion(Context context, boolean z) {
    }

    public static void tryClearTestSetting(Context context, boolean z) {
    }

    public static void clearOldVersion(File[] fileArr, HashSet<String> hashSet, int i2, int i3, int i4) {
    }
}
