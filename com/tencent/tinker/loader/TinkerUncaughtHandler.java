package com.tencent.tinker.loader;

import android.content.Context;
import java.io.File;
import java.lang.Thread;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class TinkerUncaughtHandler implements Thread.UncaughtExceptionHandler {
    public final Context context;
    public final File crashFile;
    public final Thread.UncaughtExceptionHandler ueh;

    public TinkerUncaughtHandler(Context context) {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
    }
}
