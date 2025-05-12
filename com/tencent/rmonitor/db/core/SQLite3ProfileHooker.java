package com.tencent.rmonitor.db.core;

import android.annotation.SuppressLint;
import k.i.k.l.a.a;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class SQLite3ProfileHooker implements a {
    private static String SQLITE_DEBUG_CLASS = null;
    private static String SQLITE_DEBUG_DECLARERION = null;
    private static final String TAG = "RMonitor_db_SQLite3ProfileHooker";
    private static volatile boolean isHook = false;
    private static volatile boolean oldDST = false;

    @SuppressLint({"LongLogTag"})
    private boolean doHook() {
    }

    private boolean doUnHook() {
    }

    @SuppressLint({"LongLogTag"})
    private boolean hookOpenSQLite3Profile() {
    }

    private static native boolean nativeDoHook();

    private static native void nativeStartProfile(int i2);

    private static native void nativeStopProfile();

    @SuppressLint({"LongLogTag"})
    private boolean unHookOpenSQLite3Profile() {
    }

    @Override // k.i.k.l.a.a
    @SuppressLint({"LongLogTag"})
    public boolean hook() {
    }

    @Override // k.i.k.l.a.a
    @SuppressLint({"LongLogTag"})
    public void unHook() {
    }
}
