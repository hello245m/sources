package com.tencent.rfix.loader.safemode;

import android.content.Context;
import com.tencent.rfix.loader.entity.RFixLoadResult;
import java.io.File;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class RFixSafeModeKeeper {
    private static final int P1_MAX_COUNT = 2;
    private static final long P2_DURATION = 2000;
    private static final int P2_MAX_COUNT = 5;
    private static final long P3_DURATION = 10000;
    private static final long P3_LATEST_CRASH_DURATION = 120000;
    private static final int P3_MAX_COUNT = 3;
    public static final int RESULT_OK = 0;
    public static final int RESULT_P1_LIMIT = -1;
    public static final int RESULT_P2_LIMIT = -2;
    public static final int RESULT_P3_LIMIT = -3;
    private static final String SAFE_MODE_FILE_PREFIX = "safe_mode_file_";
    private static final String TAG = "RFix.RFixSafeModeKeeper";
    public static volatile boolean hasLoadPatch;
    private static volatile boolean hasRegisterExceptionHandler;
    public static volatile boolean loadingPatch;
    public static volatile long patchLoadTime;
    public static volatile boolean useSafeMode;

    /* renamed from: com.tencent.rfix.loader.safemode.RFixSafeModeKeeper$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class AnonymousClass1 implements Runnable {
        public final /* synthetic */ RFixSafeModeInfo a;
        public final /* synthetic */ File b;

        public AnonymousClass1(RFixSafeModeInfo rFixSafeModeInfo, File file) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static int checkSafeMode(Context context, RFixLoadResult rFixLoadResult) {
    }

    private static File getSafeModeInfoFile(Context context) {
    }

    public static void handlePatchCrash(Context context, String str) {
    }

    public static void initialize(Context context) {
    }

    public static boolean isP3Crash(long j2, long j3) {
    }

    public static void onJavaCrash(Context context, Throwable th) {
    }

    public static void onLoadPatchEnd(Context context, RFixLoadResult rFixLoadResult) {
    }

    public static void onNativeCrash(Context context, String str) {
    }

    private static boolean reachP1Limit(RFixSafeModeInfo rFixSafeModeInfo) {
    }

    private static boolean reachP2Limit(RFixSafeModeInfo rFixSafeModeInfo) {
    }

    private static boolean reachP3Limit(List<Long> list) {
    }

    public static void resetSafeMode(Context context) {
    }

    public static String throwableToString(Throwable th) {
    }

    public static void writeLastCrashFile(Context context, String str) {
    }
}
