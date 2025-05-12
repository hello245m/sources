package com.tencent.wcdb.repair;

import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.support.CancellationSignal;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class BackupKit implements CancellationSignal.OnCancelListener {
    public static final int FLAG_FIX_CORRUPTION = 4;
    public static final int FLAG_INCREMENTAL = 16;
    public static final int FLAG_NO_CIPHER = 1;
    public static final int FLAG_NO_COMPRESS = 2;
    public static final int FLAG_NO_CREATE_TABLE = 8;
    public static final int RESULT_CANCELED = 1;
    public static final int RESULT_FAILED = -1;
    public static final int RESULT_OK = 0;
    public static final String TAG = "WCDB.DBBackup";
    private SQLiteDatabase mDB;
    private String mLastError;
    private long mNativePtr;
    private int mStatementCount;
    private String[] mTableDesc;

    public BackupKit(SQLiteDatabase sQLiteDatabase, String str, byte[] bArr, int i2, String[] strArr) throws SQLiteException {
    }

    private static native void nativeCancel(long j2);

    private static native void nativeFinish(long j2);

    private static native long nativeInit(String str, byte[] bArr, int i2);

    private static native String nativeLastError(long j2);

    private static native int nativeRun(long j2, long j3, String[] strArr);

    private static native int nativeStatementCount(long j2);

    public void finalize() throws Throwable {
    }

    public String lastError() {
    }

    @Override // com.tencent.wcdb.support.CancellationSignal.OnCancelListener
    public void onCancel() {
    }

    public void release() {
    }

    public int run() {
    }

    public int statementCount() {
    }

    public int run(CancellationSignal cancellationSignal) {
    }
}
