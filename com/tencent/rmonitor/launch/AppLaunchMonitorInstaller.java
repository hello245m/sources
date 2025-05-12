package com.tencent.rmonitor.launch;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class AppLaunchMonitorInstaller extends ContentProvider {
    public static final String ENABLE_LAUNCH_MONITOR_CHECK_FILE = "RMonitor_launch_monitor";
    public static final String ENABLE_PROTECT_CHECK_FILE = "RMonitor_enable_protect";
    public static final int MAX_MONITOR_UNSAFE_COUNT = 4;
    public static WeakReference<Context> a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static /* synthetic */ Context a() {
    }

    public static Context b() {
    }

    public static void c(String str, String str2, boolean z, Context context) {
    }

    public static void createFile(String str) {
    }

    public static void d() {
    }

    public static void deleteFile(String str) {
    }

    public static void install(Context context) {
    }

    public static void installAppLaunchMonitor(Application application) {
    }

    public static boolean isFileExist(String str) {
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
    }
}
