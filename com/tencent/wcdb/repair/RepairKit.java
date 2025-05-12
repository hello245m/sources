package com.tencent.wcdb.repair;

import android.database.Cursor;
import com.tencent.wcdb.AbstractCursor;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.support.CancellationSignal;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class RepairKit implements CancellationSignal.OnCancelListener {
    public static final int FLAG_ALL_TABLES = 2;
    public static final int FLAG_CHECK_TABLE_COLUMNS = 4;
    public static final int FLAG_NO_CREATE_TABLES = 1;
    private static final int INTEGRITY_DATA = 2;
    private static final int INTEGRITY_HEADER = 1;
    private static final int INTEGRITY_KDF_SALT = 4;
    public static final int RESULT_CANCELED = 1;
    public static final int RESULT_FAILED = -1;
    public static final int RESULT_IGNORE = 2;
    public static final int RESULT_OK = 0;
    private Callback mCallback;
    private RepairCursor mCurrentCursor;
    private int mIntegrityFlags;
    private MasterInfo mMasterInfo;
    private long mNativePtr;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface Callback {
        int onProgress(String str, int i2, Cursor cursor);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class MasterInfo {
        private byte[] mKDFSalt;
        private long mMasterPtr;

        private MasterInfo(long j2, byte[] bArr) {
        }

        public static /* synthetic */ byte[] access$000(MasterInfo masterInfo) {
        }

        public static /* synthetic */ long access$100(MasterInfo masterInfo) {
        }

        public static MasterInfo load(String str, byte[] bArr, String[] strArr) {
        }

        public static MasterInfo make(String[] strArr) {
        }

        public static boolean save(SQLiteDatabase sQLiteDatabase, String str, byte[] bArr) {
        }

        public void finalize() throws Throwable {
        }

        public void release() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class RepairCursor extends AbstractCursor {
        public long mPtr;

        private RepairCursor() {
        }

        private static native byte[] nativeGetBlob(long j2, int i2);

        private static native int nativeGetColumnCount(long j2);

        private static native double nativeGetDouble(long j2, int i2);

        private static native long nativeGetLong(long j2, int i2);

        private static native String nativeGetString(long j2, int i2);

        private static native int nativeGetType(long j2, int i2);

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public byte[] getBlob(int i2) {
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public int getColumnCount() {
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public String[] getColumnNames() {
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public int getCount() {
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public double getDouble(int i2) {
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public float getFloat(int i2) {
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public int getInt(int i2) {
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public long getLong(int i2) {
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public short getShort(int i2) {
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public String getString(int i2) {
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public int getType(int i2) {
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public boolean isNull(int i2) {
        }

        public /* synthetic */ RepairCursor(AnonymousClass1 anonymousClass1) {
        }
    }

    public RepairKit(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, MasterInfo masterInfo) {
    }

    public static /* synthetic */ long access$300(String[] strArr) {
    }

    public static /* synthetic */ long access$400(String str, byte[] bArr, String[] strArr, byte[] bArr2) {
    }

    public static /* synthetic */ boolean access$500(long j2, String str, byte[] bArr) {
    }

    public static /* synthetic */ void access$600(long j2) {
    }

    public static String lastError() {
    }

    private static native void nativeCancel(long j2);

    private static native void nativeFini(long j2);

    private static native void nativeFreeMaster(long j2);

    private static native long nativeInit(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, byte[] bArr2);

    private static native int nativeIntegrityFlags(long j2);

    private static native String nativeLastError();

    private static native long nativeLoadMaster(String str, byte[] bArr, String[] strArr, byte[] bArr2);

    private static native long nativeMakeMaster(String[] strArr);

    private native int nativeOutput(long j2, long j3, long j4, int i2);

    private static native boolean nativeSaveMaster(long j2, String str, byte[] bArr);

    private int onProgress(String str, int i2, long j2) {
    }

    public void finalize() throws Throwable {
    }

    public Callback getCallback() {
    }

    public boolean isDataCorrupted() {
    }

    public boolean isHeaderCorrupted() {
    }

    public boolean isSaltCorrupted() {
    }

    @Override // com.tencent.wcdb.support.CancellationSignal.OnCancelListener
    public void onCancel() {
    }

    public int output(SQLiteDatabase sQLiteDatabase, int i2) {
    }

    public void release() {
    }

    public void setCallback(Callback callback) {
    }

    public int output(SQLiteDatabase sQLiteDatabase, int i2, CancellationSignal cancellationSignal) {
    }
}
