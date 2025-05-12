package com.tencent.wcdb.repair;

import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.support.CancellationSignal;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class RecoverKit implements CancellationSignal.OnCancelListener {
    public static final int RESULT_CANCELED = 1;
    public static final int RESULT_FAILED = -1;
    public static final int RESULT_OK = 0;
    public static final String TAG = "WCDB.DBBackup";
    private SQLiteDatabase mDB;
    private int mFailedCount;
    private String mLastError;
    private long mNativePtr;
    private int mSuccessCount;

    public RecoverKit(SQLiteDatabase sQLiteDatabase, String str, byte[] bArr) throws SQLiteException {
    }

    private static native void nativeCancel(long j2);

    private static native int nativeFailureCount(long j2);

    private static native void nativeFinish(long j2);

    private static native long nativeInit(String str, byte[] bArr);

    private static native String nativeLastError(long j2);

    private static native int nativeRun(long j2, long j3, boolean z);

    private static native int nativeSuccessCount(long j2);

    public int failureCount() {
    }

    public void finalize() throws Throwable {
    }

    public String lastError() {
    }

    @Override // com.tencent.wcdb.support.CancellationSignal.OnCancelListener
    public void onCancel() {
    }

    public void release() {
    }

    public int run(boolean z) {
    }

    public int successCount() {
    }

    public int run(boolean z, CancellationSignal cancellationSignal) {
    }
}
