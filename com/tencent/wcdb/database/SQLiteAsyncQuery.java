package com.tencent.wcdb.database;

import com.tencent.wcdb.support.CancellationSignal;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class SQLiteAsyncQuery extends SQLiteProgram {
    private static final String TAG = "WCDB.SQLiteAsyncQuery";
    private final int mResultColumns;

    public SQLiteAsyncQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
    }

    private static native int nativeCount(long j2);

    private static native int nativeFillRows(long j2, long j3, int i2, int i3);

    public void acquire() {
    }

    public int fillRows(ChunkedCursorWindow chunkedCursorWindow, int i2, int i3) {
    }

    public int getCount() {
    }

    public void release() {
    }

    public void reset() {
    }
}
