package com.tencent.xweb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class HttpAuthDatabase {
    public static final int DATABASE_VERSION = 1;
    public static final String HTTPAUTH_HOST_COL = "host";
    public static final String HTTPAUTH_PASSWORD_COL = "password";
    public static final String HTTPAUTH_REALM_COL = "realm";
    public static final String HTTPAUTH_TABLE_NAME = "httpauth";
    public static final String HTTPAUTH_USERNAME_COL = "username";
    public static final String ID_COL = "_id";
    public static final String[] ID_PROJECTION = null;
    public static final String TAG = "HttpAuthDatabase";
    public SQLiteDatabase mDatabase;
    public boolean mInitialized;
    public final Object mInitializedLock;

    /* renamed from: com.tencent.xweb.HttpAuthDatabase$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 extends Thread {
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ String val$databaseFile;
        public final /* synthetic */ HttpAuthDatabase val$httpAuthDatabase;

        public AnonymousClass1(HttpAuthDatabase httpAuthDatabase, Context context, String str) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    public static /* synthetic */ void access$000(HttpAuthDatabase httpAuthDatabase, Context context, String str) {
    }

    private void createTable() {
    }

    private void initDatabase(Context context, String str) {
    }

    private void initOnBackgroundThread(Context context, String str) {
    }

    public static HttpAuthDatabase newInstance(Context context, String str) {
    }

    private boolean waitForInit() {
    }

    public void clearHttpAuthUsernamePassword() {
    }

    public String[] getHttpAuthUsernamePassword(String str, String str2) {
    }

    public boolean hasHttpAuthUsernamePassword() {
    }

    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
    }
}
