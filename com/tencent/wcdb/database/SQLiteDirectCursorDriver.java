package com.tencent.wcdb.database;

import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.support.CancellationSignal;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class SQLiteDirectCursorDriver implements SQLiteCursorDriver {
    private static SQLiteDatabase.CursorFactory DEFAULT_FACTORY;
    private final CancellationSignal mCancellationSignal;
    private final SQLiteDatabase mDatabase;
    private final String mEditTable;
    private SQLiteProgram mQuery;
    private final String mSql;

    public SQLiteDirectCursorDriver(SQLiteDatabase sQLiteDatabase, String str, String str2, CancellationSignal cancellationSignal) {
    }

    @Override // com.tencent.wcdb.database.SQLiteCursorDriver
    public void cursorClosed() {
    }

    @Override // com.tencent.wcdb.database.SQLiteCursorDriver
    public void cursorDeactivated() {
    }

    @Override // com.tencent.wcdb.database.SQLiteCursorDriver
    public void cursorRequeried(Cursor cursor) {
    }

    @Override // com.tencent.wcdb.database.SQLiteCursorDriver
    public Cursor query(SQLiteDatabase.CursorFactory cursorFactory, Object[] objArr) {
    }

    @Override // com.tencent.wcdb.database.SQLiteCursorDriver
    public void setBindArguments(String[] strArr) {
    }

    public String toString() {
    }
}
