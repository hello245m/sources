package com.tencent.wcdb.database;

import com.tencent.wcdb.support.CancellationSignal;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class SQLiteDirectQuery extends SQLiteProgram {
    private static final int[] SQLITE_TYPE_MAPPING = null;
    private static final String TAG = "WCDB.SQLiteDirectQuery";
    private final CancellationSignal mCancellationSignal;

    public SQLiteDirectQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
    }

    private static native byte[] nativeGetBlob(long j2, int i2);

    private static native double nativeGetDouble(long j2, int i2);

    private static native long nativeGetLong(long j2, int i2);

    private static native String nativeGetString(long j2, int i2);

    private static native int nativeGetType(long j2, int i2);

    private static native int nativeStep(long j2, int i2);

    public byte[] getBlob(int i2) {
    }

    public double getDouble(int i2) {
    }

    public long getLong(int i2) {
    }

    public String getString(int i2) {
    }

    public int getType(int i2) {
    }

    @Override // com.tencent.wcdb.database.SQLiteProgram, com.tencent.wcdb.database.SQLiteClosable
    public void onAllReferencesReleased() {
    }

    public synchronized void reset(boolean z) {
    }

    public int step(int i2) {
    }
}
