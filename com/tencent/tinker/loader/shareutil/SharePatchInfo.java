package com.tencent.tinker.loader.shareutil;

import java.io.File;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class SharePatchInfo {
    public String fingerPrint;
    public boolean isProtectedApp;
    public boolean isRemoveInterpretOATDir;
    public boolean isRemoveNewVersion;
    public String newVersion;
    public String oatDir;
    public String oldVersion;

    public SharePatchInfo(String str, String str2, boolean z, boolean z2, String str3, String str4, boolean z3) {
    }

    public static SharePatchInfo readAndCheckProperty(File file) {
    }

    public static SharePatchInfo readAndCheckPropertyWithLock(File file, File file2) {
    }

    public static boolean rewritePatchInfoFile(File file, SharePatchInfo sharePatchInfo) {
    }

    public static boolean rewritePatchInfoFileWithLock(File file, SharePatchInfo sharePatchInfo, File file2) {
    }
}
