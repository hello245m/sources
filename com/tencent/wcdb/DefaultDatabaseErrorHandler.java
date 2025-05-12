package com.tencent.wcdb;

import com.tencent.wcdb.database.SQLiteDatabase;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
    private static final String[] SUFFIX_TO_BACKUP = null;
    private static final String TAG = "WCDB.DefaultDatabaseErrorHandler";
    private final boolean mNoCorruptionBackup;

    public DefaultDatabaseErrorHandler() {
    }

    private void deleteDatabaseFile(String str) {
    }

    private static boolean deleteFile(String str) {
    }

    private static boolean moveOrDeleteFile(String str, String str2) {
    }

    @Override // com.tencent.wcdb.DatabaseErrorHandler
    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
    }

    public DefaultDatabaseErrorHandler(boolean z) {
    }
}
