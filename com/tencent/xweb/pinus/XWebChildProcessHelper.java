package com.tencent.xweb.pinus;

import android.os.ParcelFileDescriptor;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebChildProcessHelper {
    public static ChildProcessCrashDumpFileCallback sChildProcessDumpFileCallback;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface ChildProcessCrashDumpFileCallback {
        void setupChildProcessCrashDumpFiles(String str, String str2);

        void setupIsolatedProcessCrashDumpFiles(ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2);
    }

    public static ChildProcessCrashDumpFileCallback getCrashDumpFileCallback() {
    }

    public static void setCrashDumpFileCallback(ChildProcessCrashDumpFileCallback childProcessCrashDumpFileCallback) {
    }
}
