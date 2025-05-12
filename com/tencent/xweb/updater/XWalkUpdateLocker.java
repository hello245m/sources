package com.tencent.xweb.updater;

import android.annotation.SuppressLint;

@SuppressLint({"ApplySharedPref"})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWalkUpdateLocker {
    public static final String SP_KEY_Start_Time = "Start_Time";
    public static final String SP_KEY_UpdatingProcessId = "UpdatingProcessId";
    public static final String TAG = "XWalkUpdateLocker";
    public static boolean sIsUpdating = false;
    public static long sUpdateFinishedTime;

    public static synchronized void finishUpdatingProcess() {
    }

    public static long getUpdateFinishedTime() {
    }

    public static synchronized boolean isInUpdatingProgress() {
    }

    public static synchronized boolean startUpdatingProgress() {
    }
}
