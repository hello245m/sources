package com.tencent.xweb.pinus;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebBrowserProcessHelper {
    public static BrowserProcessCrashDumpFileCallback sBrowserProcessDumpFileCallback;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface BrowserProcessCrashDumpFileCallback {
        String getCrashDumpFolderPath();

        String getJavaCrashDumpFilePath(String str);

        String getNativeCrashDumpFilePath(String str);
    }

    public static BrowserProcessCrashDumpFileCallback getCrashDumpFileCallback() {
    }

    public static void setCrashDumpFileCallback(BrowserProcessCrashDumpFileCallback browserProcessCrashDumpFileCallback) {
    }
}
