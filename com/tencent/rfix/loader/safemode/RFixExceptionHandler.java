package com.tencent.rfix.loader.safemode;

import android.content.Context;
import java.lang.Thread;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class RFixExceptionHandler implements Thread.UncaughtExceptionHandler {
    private static final String TAG = "RFix.RFixExceptionHandler";
    private final Context context;
    private final Thread.UncaughtExceptionHandler oldExceptionHandler;

    public RFixExceptionHandler(Context context) {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
    }
}
