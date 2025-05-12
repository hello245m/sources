package com.tencent.rfix.loader.utils;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ProcessUtils {
    private static final String PATCH_PROCESS_NAME = ":patch";
    private static final String TAG = "RFix.ProcessUtils";
    private static String mainProcessName;
    private static String processName;

    private static String getDefaultMainProcessName(Context context) {
    }

    public static String getProcessName(Context context) {
    }

    private static String getProcessNameFromAMS(Context context, int i2) {
    }

    @SuppressLint({"PrivateApi"})
    private static String getProcessNameFromActivityThread() {
    }

    private static String getProcessNameFromApplication() {
    }

    private static String getProcessNameFromCmdline(int i2) {
    }

    private static String getProcessNameInternal(Context context) {
    }

    public static boolean isInMainProcess(Context context) {
    }

    public static boolean isInPatchProcess(Context context) {
    }

    public static boolean isMainProcess(Context context, String str) {
    }

    public static void killProcessExceptMain(Context context) {
    }

    public static void setMainProcessName(String str) {
    }
}
