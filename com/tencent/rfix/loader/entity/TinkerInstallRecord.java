package com.tencent.rfix.loader.entity;

import java.io.File;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class TinkerInstallRecord {
    private static final String CONFIG_ID = "config_id";
    private static final String CONFIG_TYPE = "config_type";
    private static final String ENABLE_ASSERT_DEX = "enable_assert_dex";
    private static final String ENABLE_ASSERT_LIB = "enable_assert_lib";
    private static final String ENABLE_ASSERT_RES = "enable_assert_res";
    private static final String PATCH_ID = "patch_id";
    private static final String PATCH_PROCESS = "patch_process";
    private static final String PATCH_TYPE = "patch_type";
    private static final String PATCH_VERSION = "patch_version";
    private static final String TAG = "RFix.TinkerInstallRecord";
    private static final String TINKER_PATCH_VERSION = "tinker_patch_version";
    public int configId;
    public int configType;
    public boolean enableAssertDex;
    public boolean enableAssertLib;
    public boolean enableAssertRes;
    public String patchId;
    public String patchProcess;
    public String patchType;
    public String patchVersion;
    public String tinkerPatchVersion;

    public TinkerInstallRecord(String str, String str2, String str3, String str4, int i2, int i3, String str5, boolean z, boolean z2, boolean z3) {
    }

    public static TinkerInstallRecord readInstallRecord(File file) {
    }

    public static boolean writeInstallRecord(TinkerInstallRecord tinkerInstallRecord, File file) {
    }

    public boolean isValid() {
    }

    public String toString() {
    }
}
