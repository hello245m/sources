package com.tencent.tinker.loader.shareutil;

import android.app.Application;
import android.content.Context;
import java.io.File;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ShareTinkerInternals {
    public static final boolean VM_IS_ART = false;
    public static final boolean VM_IS_JIT = false;
    public static String currentInstructionSet;
    public static Boolean isARKHotRunning;
    public static Boolean isPatchProcess;
    public static String processName;
    public static String tinkerID;

    public static ShareDexDiffPatchInfo changeTestDexToClassN(ShareDexDiffPatchInfo shareDexDiffPatchInfo, int i2) {
    }

    public static int checkPackageAndTinkerFlag(ShareSecurityCheck shareSecurityCheck, int i2) {
    }

    public static int checkSignatureAndTinkerID(Context context, File file, ShareSecurityCheck shareSecurityCheck) {
    }

    public static int checkTinkerPackage(Context context, int i2, File file, ShareSecurityCheck shareSecurityCheck) {
    }

    public static void cleanPatch(Application application) {
    }

    public static String getCurrentInstructionSet() {
    }

    public static String getCurrentOatMode(Context context, String str) {
    }

    public static String getExceptionCauseString(Throwable th) {
    }

    public static String getManifestTinkerID(Context context) {
    }

    public static String getProcessName(Context context) {
    }

    public static String getProcessNameInternal(Context context) {
    }

    public static int getSafeModeCount(Context context) {
    }

    public static String getTinkerSwitchSPKey(Context context) {
    }

    public static String getTypeString(int i2) {
    }

    public static boolean isAfterAndroidO() {
    }

    public static boolean isArkHotRuning() {
    }

    public static boolean isInMainProcess(Context context) {
    }

    public static boolean isInPatchProcess(Context context) {
    }

    public static boolean isNewerOrEqualThanVersion(int i2, boolean z) {
    }

    public static boolean isNullOrNil(String str) {
    }

    public static boolean isSystemOTA(String str) {
    }

    public static boolean isTinkerEnableWithSharedPreferences(Context context) {
    }

    public static boolean isTinkerEnabled(int i2) {
    }

    public static boolean isTinkerEnabledAll(int i2) {
    }

    public static boolean isTinkerEnabledForArkHot(int i2) {
    }

    public static boolean isTinkerEnabledForDex(int i2) {
    }

    public static boolean isTinkerEnabledForNativeLib(int i2) {
    }

    public static boolean isTinkerEnabledForResource(int i2) {
    }

    public static boolean isVmArt() {
    }

    public static boolean isVmJit() {
    }

    public static boolean isVmJitInternal() {
    }

    public static void killAllOtherProcess(Context context) {
    }

    public static void killProcessExceptMain(Context context) {
    }

    public static void setSafeModeCount(Context context, int i2) {
    }

    public static void setTinkerDisableWithSharedPreferences(Context context) {
    }

    public static String toVisualString(String str) {
    }

    public static boolean isVmArt(String str) {
    }
}
