package com.tencent.wcdb.database;

import android.content.Context;
import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.database.SQLiteDatabase;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class SQLiteOpenHelper {
    private static final boolean DEBUG_STRICT_READONLY = false;
    private static final String TAG = "WCDB.SQLiteOpenHelper";
    private SQLiteCipherSpec mCipher;
    private final Context mContext;
    private SQLiteDatabase mDatabase;
    private boolean mEnableWriteAheadLogging;
    private final DatabaseErrorHandler mErrorHandler;
    private final SQLiteDatabase.CursorFactory mFactory;
    private boolean mForcedSingleConnection;
    private boolean mIsInitializing;
    private int mMode;
    private final String mName;
    private boolean mNeedMode;
    private final int mNewVersion;
    private byte[] mPassword;

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i2) {
    }

    private SQLiteDatabase getDatabaseLocked(boolean z) {
    }

    private SQLiteDatabase getDatabaseLockedLast(SQLiteDatabase sQLiteDatabase) {
    }

    public synchronized void close() {
    }

    public String getDatabaseName() {
    }

    public SQLiteDatabase getReadableDatabase() {
    }

    public SQLiteDatabase getWritableDatabase() {
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onCreate(SQLiteDatabase sQLiteDatabase);

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3);

    public void setForcedSingleConnection(boolean z) {
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
    }

    public SQLiteOpenHelper(Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, SQLiteDatabase.CursorFactory cursorFactory, int i2, DatabaseErrorHandler databaseErrorHandler) {
    }

    public SQLiteOpenHelper(Context context, String str, byte[] bArr, SQLiteDatabase.CursorFactory cursorFactory, int i2, DatabaseErrorHandler databaseErrorHandler) {
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i2, DatabaseErrorHandler databaseErrorHandler) {
    }
}
