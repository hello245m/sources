package com.tencent.wcdb.database;

import android.annotation.SuppressLint;
import android.util.Pair;
import android.util.Printer;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.database.SQLiteTrace;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.LruCache;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class SQLiteConnection implements CancellationSignal.OnCancelListener {
    private static final boolean DEBUG = false;
    private static final byte[] EMPTY_BYTE_ARRAY = null;
    private static final String[] EMPTY_STRING_ARRAY = null;
    private static final String[] HMAC_ALGO_MAPPING = null;
    private static final String[] PBKDF2_ALGO_MAPPING = null;
    private static final String TAG = "WCDB.SQLiteConnection";
    private static final Pattern TRIM_SQL_PATTERN = null;
    private StackTraceElement[] mAcquiredStack;
    private Thread mAcquiredThread;
    private int mAcquiredTid;
    private long mAcquiredTimestamp;
    private int mCancellationSignalAttachCount;
    private SQLiteCipherSpec mCipher;
    private final SQLiteDatabaseConfiguration mConfiguration;
    private final int mConnectionId;
    private long mConnectionPtr;
    private final boolean mIsPrimaryConnection;
    private final boolean mIsReadOnlyConnection;
    private int mNativeHandleCount;
    private Operation mNativeOperation;
    private boolean mOnlyAllowReadOnlyOperations;
    private byte[] mPassword;
    private final SQLiteConnectionPool mPool;
    private final PreparedStatementCache mPreparedStatementCache;
    private PreparedStatement mPreparedStatementPool;
    private final OperationLog mRecentOperations;

    @SuppressLint({"SimpleDateFormat"})
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class Operation {
        private static final SimpleDateFormat sDateFormat = null;
        public ArrayList<Object> mBindArgs;
        public int mCookie;
        public long mEndTime;
        public Exception mException;
        public boolean mFinished;
        public String mKind;
        public String mSql;
        public long mStartTime;
        public int mTid;
        public int mType;

        private Operation() {
        }

        public static /* synthetic */ String access$2000(Operation operation) {
        }

        private String getFormattedStartTime() {
        }

        private String getStatus() {
        }

        public void describe(StringBuilder sb, boolean z) {
        }

        public JSONObject dumpJSON(boolean z) throws JSONException {
        }

        public /* synthetic */ Operation(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class PreparedStatement {
        private WeakReference<SQLiteConnection> mConnection;
        private boolean mInCache;
        private boolean mInUse;
        private int mNumParameters;
        private Operation mOperation;
        private PreparedStatement mPoolNext;
        private boolean mReadOnly;
        private String mSql;
        private long mStatementPtr;
        private int mType;

        public PreparedStatement(SQLiteConnection sQLiteConnection) {
        }

        public static /* synthetic */ int access$100(PreparedStatement preparedStatement) {
        }

        public static /* synthetic */ int access$102(PreparedStatement preparedStatement, int i2) {
        }

        public static /* synthetic */ int access$200(PreparedStatement preparedStatement) {
        }

        public static /* synthetic */ int access$202(PreparedStatement preparedStatement, int i2) {
        }

        public static /* synthetic */ boolean access$300(PreparedStatement preparedStatement) {
        }

        public static /* synthetic */ boolean access$302(PreparedStatement preparedStatement, boolean z) {
        }

        public static /* synthetic */ boolean access$400(PreparedStatement preparedStatement) {
        }

        public static /* synthetic */ boolean access$402(PreparedStatement preparedStatement, boolean z) {
        }

        public static /* synthetic */ boolean access$500(PreparedStatement preparedStatement) {
        }

        public static /* synthetic */ boolean access$502(PreparedStatement preparedStatement, boolean z) {
        }

        public static /* synthetic */ String access$600(PreparedStatement preparedStatement) {
        }

        public static /* synthetic */ String access$602(PreparedStatement preparedStatement, String str) {
        }

        public static /* synthetic */ PreparedStatement access$700(PreparedStatement preparedStatement) {
        }

        public static /* synthetic */ PreparedStatement access$702(PreparedStatement preparedStatement, PreparedStatement preparedStatement2) {
        }

        public static /* synthetic */ long access$802(PreparedStatement preparedStatement, long j2) {
        }

        public void attachCancellationSignal(CancellationSignal cancellationSignal) {
        }

        public void beginOperation(String str, Object[] objArr) {
        }

        public void bindArguments(Object[] objArr) {
        }

        public void detachCancellationSignal(CancellationSignal cancellationSignal) {
        }

        public void endOperation(String str) {
        }

        public void failOperation(Exception exc) {
        }

        public long getPtr() {
        }

        public String getSQL() {
        }

        public int getType() {
        }

        public boolean isReadOnly() {
        }

        public void reset(boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class PreparedStatementCache extends LruCache<String, PreparedStatement> {
        public final /* synthetic */ SQLiteConnection this$0;

        public PreparedStatementCache(SQLiteConnection sQLiteConnection, int i2) {
        }

        public void dump(Printer printer) {
        }

        @Override // com.tencent.wcdb.support.LruCache
        public /* bridge */ /* synthetic */ void entryRemoved(boolean z, String str, PreparedStatement preparedStatement, PreparedStatement preparedStatement2) {
        }

        /* renamed from: entryRemoved, reason: avoid collision after fix types in other method */
        public void entryRemoved2(boolean z, String str, PreparedStatement preparedStatement, PreparedStatement preparedStatement2) {
        }
    }

    private SQLiteConnection(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i2, boolean z, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
    }

    public static /* synthetic */ void access$1000(SQLiteConnection sQLiteConnection, PreparedStatement preparedStatement, boolean z) {
    }

    public static /* synthetic */ void access$1100(SQLiteConnection sQLiteConnection, CancellationSignal cancellationSignal) {
    }

    public static /* synthetic */ void access$1200(SQLiteConnection sQLiteConnection, CancellationSignal cancellationSignal) {
    }

    public static /* synthetic */ OperationLog access$1300(SQLiteConnection sQLiteConnection) {
    }

    public static /* synthetic */ void access$1400(SQLiteConnection sQLiteConnection, PreparedStatement preparedStatement) {
    }

    public static /* synthetic */ String access$1500(String str) {
    }

    public static /* synthetic */ byte[] access$1700() {
    }

    public static /* synthetic */ int access$1800(SQLiteConnection sQLiteConnection) {
    }

    public static /* synthetic */ SQLiteConnectionPool access$1900(SQLiteConnection sQLiteConnection) {
    }

    public static /* synthetic */ void access$900(SQLiteConnection sQLiteConnection, PreparedStatement preparedStatement, Object[] objArr) {
    }

    private void applyBlockGuardPolicy(PreparedStatement preparedStatement) {
    }

    private void attachCancellationSignal(CancellationSignal cancellationSignal) {
    }

    private void bindArguments(PreparedStatement preparedStatement, Object[] objArr) {
    }

    private void detachCancellationSignal(CancellationSignal cancellationSignal) {
    }

    private void dispose(boolean z) {
    }

    private void finalizePreparedStatement(PreparedStatement preparedStatement) {
    }

    private SQLiteDebug.DbStats getMainDbStatsUnsafe(int i2, long j2, long j3) {
    }

    private static boolean isCacheable(int i2) {
    }

    private static native void nativeBindBlob(long j2, long j3, int i2, byte[] bArr);

    private static native void nativeBindDouble(long j2, long j3, int i2, double d);

    private static native void nativeBindLong(long j2, long j3, int i2, long j4);

    private static native void nativeBindNull(long j2, long j3, int i2);

    private static native void nativeBindString(long j2, long j3, int i2, String str);

    private static native void nativeCancel(long j2);

    private static native void nativeClose(long j2);

    private static native void nativeExecute(long j2, long j3);

    private static native int nativeExecuteForChangedRowCount(long j2, long j3);

    private static native long nativeExecuteForCursorWindow(long j2, long j3, long j4, int i2, int i3, boolean z);

    private static native long nativeExecuteForLastInsertedRowId(long j2, long j3);

    private static native long nativeExecuteForLong(long j2, long j3);

    private static native String nativeExecuteForString(long j2, long j3);

    private static native void nativeFinalizeStatement(long j2, long j3);

    private static native int nativeGetColumnCount(long j2, long j3);

    private static native String nativeGetColumnName(long j2, long j3, int i2);

    private static native int nativeGetDbLookaside(long j2);

    private static native int nativeGetParameterCount(long j2, long j3);

    private static native boolean nativeIsReadOnly(long j2, long j3);

    private native long nativeOpen(String str, int i2, String str2);

    private static native long nativePrepareStatement(long j2, String str);

    private static native void nativeRegisterCustomFunction(long j2, SQLiteCustomFunction sQLiteCustomFunction);

    private static native void nativeRegisterLocalizedCollators(long j2, String str);

    private static native void nativeResetCancel(long j2, boolean z);

    private static native void nativeResetStatement(long j2, long j3, boolean z);

    private static native long nativeSQLiteHandle(long j2, boolean z);

    private static native void nativeSetKey(long j2, byte[] bArr);

    private static native void nativeSetUpdateNotification(long j2, boolean z, boolean z2);

    private static native void nativeSetWalHook(long j2);

    private static native long nativeWalCheckpoint(long j2, String str);

    private void notifyChange(String str, String str2, long[] jArr, long[] jArr2, long[] jArr3) {
    }

    private void notifyCheckpoint(String str, int i2) {
    }

    private PreparedStatement obtainPreparedStatement(String str, long j2, int i2, int i3, boolean z) {
    }

    public static SQLiteConnection open(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i2, boolean z, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
    }

    private void recyclePreparedStatement(PreparedStatement preparedStatement) {
    }

    private void resetStatement(PreparedStatement preparedStatement, boolean z) {
    }

    private void setCheckpointStrategy() {
    }

    private void setCipherSpec() {
    }

    private void setForeignKeyModeFromConfiguration() {
    }

    private void setJournalMode(String str) {
    }

    private void setJournalSizeLimit() {
    }

    private void setLocaleFromConfiguration() {
    }

    private void setPageSize() {
    }

    private void setReadOnlyFromConfiguration() {
    }

    private void setSyncModeFromConfiguration() {
    }

    private void setUpdateNotificationFromConfiguration() {
    }

    private void setWalModeFromConfiguration() {
    }

    private void throwIfStatementForbidden(PreparedStatement preparedStatement) {
    }

    private static String trimSqlForDisplay(String str) {
    }

    public PreparedStatement acquirePreparedStatement(String str) {
    }

    public void close() {
    }

    public void collectDbStats(ArrayList<SQLiteDebug.DbStats> arrayList) {
    }

    public void collectDbStatsUnsafe(ArrayList<SQLiteDebug.DbStats> arrayList) {
    }

    public String describeCurrentOperationUnsafe() {
    }

    public void dump(Printer printer, boolean z) {
    }

    public JSONObject dumpJSON(boolean z) throws JSONException {
    }

    public void endNativeHandle(Exception exc) {
    }

    public void execute(String str, Object[] objArr, CancellationSignal cancellationSignal) {
    }

    public int executeForChangedRowCount(String str, Object[] objArr, CancellationSignal cancellationSignal) {
    }

    public int executeForCursorWindow(String str, Object[] objArr, CursorWindow cursorWindow, int i2, int i3, boolean z, CancellationSignal cancellationSignal) {
    }

    public long executeForLastInsertedRowId(String str, Object[] objArr, CancellationSignal cancellationSignal) {
    }

    public long executeForLong(String str, Object[] objArr, CancellationSignal cancellationSignal) {
    }

    public String executeForString(String str, Object[] objArr, CancellationSignal cancellationSignal) {
    }

    public void finalize() throws Throwable {
    }

    public int getConnectionId() {
    }

    public long getNativeHandle(String str) {
    }

    public boolean isPreparedStatementInCache(String str) {
    }

    public boolean isPrimaryConnection() {
    }

    @Override // com.tencent.wcdb.support.CancellationSignal.OnCancelListener
    public void onCancel() {
    }

    public void prepare(String str, SQLiteStatementInfo sQLiteStatementInfo) {
    }

    public void reconfigure(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
    }

    public void releasePreparedStatement(PreparedStatement preparedStatement) {
    }

    public void setAcquisitionState(boolean z, boolean z2) {
    }

    public void setOnlyAllowReadOnlyOperations(boolean z) {
    }

    public String toString() {
    }

    public SQLiteTrace.TraceInfo<String> traceCurrentOperationUnsafe() {
    }

    public SQLiteTrace.TraceInfo<StackTraceElement[]> tracePersistAcquisitionUnsafe() {
    }

    public Pair<Integer, Integer> walCheckpoint(String str) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class OperationLog {
        private static final int COOKIE_GENERATION_SHIFT = 8;
        private static final int COOKIE_INDEX_MASK = 255;
        private static final int MAX_RECENT_OPERATIONS = 20;
        private int mGeneration;
        private int mIndex;
        private final Operation[] mOperations;
        public final /* synthetic */ SQLiteConnection this$0;

        private OperationLog(SQLiteConnection sQLiteConnection) {
        }

        private boolean endOperationDeferLogLocked(Operation operation) {
        }

        private Operation getOperationLocked(int i2) {
        }

        private void logOperationLocked(Operation operation, String str) {
        }

        private int newOperationCookieLocked(int i2) {
        }

        public Operation beginOperation(String str, String str2, Object[] objArr) {
        }

        public String describeCurrentOperation() {
        }

        public void dump(Printer printer, boolean z) {
        }

        public JSONArray dumpJSON(boolean z) throws JSONException {
        }

        public void endOperation(int i2) {
        }

        public boolean endOperationDeferLog(int i2) {
        }

        public void failOperation(int i2, Exception exc) {
        }

        public void logOperation(int i2, String str) {
        }

        public SQLiteTrace.TraceInfo<String> traceCurrentOperation() {
        }

        public /* synthetic */ OperationLog(SQLiteConnection sQLiteConnection, AnonymousClass1 anonymousClass1) {
        }
    }

    private void open() {
    }
}
