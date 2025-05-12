package com.tencent.wcdb.database;

import com.tencent.wcdb.database.SQLiteConnection;
import com.tencent.wcdb.support.CancellationSignal;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class SQLiteProgram extends SQLiteClosable {
    private static final String[] EMPTY_STRING_ARRAY = null;
    private static final String TAG = "WCDB.SQLiteProgram";
    private final Object[] mBindArgs;
    private SQLiteSession mBoundSession;
    private final String[] mColumnNames;
    private final SQLiteDatabase mDatabase;
    private final int mNumParameters;
    public SQLiteConnection.PreparedStatement mPreparedStatement;
    private final boolean mReadOnly;
    private final String mSql;

    public SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
    }

    private void bind(int i2, Object obj) {
    }

    public synchronized boolean acquirePreparedStatement(boolean z) {
    }

    public void bindAllArgs(Object[] objArr) {
    }

    public void bindAllArgsAsStrings(String[] strArr) {
    }

    public void bindBlob(int i2, byte[] bArr) {
    }

    public void bindDouble(int i2, double d) {
    }

    public void bindLong(int i2, long j2) {
    }

    public void bindNull(int i2) {
    }

    public void bindString(int i2, String str) {
    }

    public final void checkCorruption(SQLiteException sQLiteException) {
    }

    public void clearBindings() {
    }

    public void finalize() throws Throwable {
    }

    public final Object[] getBindArgs() {
    }

    public final String[] getColumnNames() {
    }

    public final int getConnectionFlags() {
    }

    public final SQLiteDatabase getDatabase() {
    }

    public final SQLiteSession getSession() {
    }

    public final String getSql() {
    }

    @Deprecated
    public final int getUniqueId() {
    }

    @Override // com.tencent.wcdb.database.SQLiteClosable
    public void onAllReferencesReleased() {
    }

    public synchronized void releasePreparedStatement() {
    }
}
