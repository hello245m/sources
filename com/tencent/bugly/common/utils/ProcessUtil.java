package com.tencent.bugly.common.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import n.d0.d.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class ProcessUtil {
    public static final Companion Companion = null;
    public static final String TAG = "Bugly_ProcessUtil";
    private static String currProcessName;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class Companion {
        private Companion() {
        }

        private final String getCurrentProcessNameByActivityManager(Context context) {
        }

        @SuppressLint({"DiscouragedPrivateApi", "PrivateApi"})
        private final String getCurrentProcessNameByActivityThread() {
        }

        @SuppressLint({"NewApi"})
        private final String getCurrentProcessNameByApplication() {
        }

        public final String getCurrentProcessName(Context context) {
        }

        public final String getProcessNameByCmdLine(int i2) {
        }

        public final boolean isMainProcess(Context context) {
        }

        public /* synthetic */ Companion(h hVar) {
        }
    }

    public static final /* synthetic */ String access$getCurrProcessName$cp() {
    }

    public static final /* synthetic */ void access$setCurrProcessName$cp(String str) {
    }

    public static final String getCurrentProcessName(Context context) {
    }

    public static final String getProcessNameByCmdLine(int i2) {
    }

    public static final boolean isMainProcess(Context context) {
    }
}
