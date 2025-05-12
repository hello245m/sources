package com.tencent.rfix.loader.entity;

import java.io.File;
import java.util.Properties;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class RFixPatchInfo {
    private static final String CONFIG_ID = "config_id";
    private static final String CONFIG_TYPE = "config_type";
    private static final String EFFECT_IMMEDIATE = "effectImmediate";
    private static final String ENABLE_ASSERT_DEX = "enable_assert_dex";
    private static final String ENABLE_ASSERT_LIB = "enable_assert_lib";
    private static final String ENABLE_ASSERT_RES = "enable_assert_res";
    private static final String MAIN_PROC_VERIFIED = "main_proc_verified";
    private static final int MAX_EXTRACT_ATTEMPTS = 2;
    private static final String PATCH_ID = "patch_id";
    private static final String PATCH_PROCESS = "patch_process";
    private static final String PATCH_TYPE = "patch_type";
    public static final String PATCH_TYPE_QFIX = "QFix";
    public static final String PATCH_TYPE_REDIRECT = "Redirect";
    public static final String PATCH_TYPE_TINKER = "Tinker";
    private static final String REMOVE_PATCH = "remove_patch";
    private static final String TAG = "RFix.RFixPatchInfo";
    private static final String VERSION = "version";
    public int configId;
    public int configType;
    public boolean effectImmediate;
    public boolean enableAssertDex;
    public boolean enableAssertLib;
    public boolean enableAssertRes;
    public boolean mainProcVerified;
    public String patchId;
    public String patchProcess;
    public String patchType;
    public boolean removePatch;
    public String version;

    public RFixPatchInfo(String str, String str2, String str3, boolean z, boolean z2, int i2, int i3, String str4) {
    }

    public static boolean checkIfPatchTypeValid(String str) {
    }

    public static boolean getBooleanProperty(String str, Properties properties) {
    }

    public static int getIntegerProperty(String str, Properties properties) {
    }

    private static boolean isReadPatchSuccessful(String str, String str2, String str3) {
    }

    private static boolean isWritePatchSuccessful(RFixPatchInfo rFixPatchInfo, RFixPatchInfo rFixPatchInfo2) {
    }

    private static RFixPatchInfo readPatchInfo(File file) {
    }

    public static RFixPatchInfo readWithLock(File file, File file2) {
    }

    private static boolean writePatchInfo(RFixPatchInfo rFixPatchInfo, File file) {
    }

    public static boolean writeWithLock(RFixPatchInfo rFixPatchInfo, File file, File file2) {
    }

    public String toString() {
    }

    public RFixPatchInfo(String str, String str2, String str3, boolean z, boolean z2, int i2, int i3, String str4, boolean z3, boolean z4, boolean z5, boolean z6) {
    }
}
