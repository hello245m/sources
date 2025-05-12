package com.tencent.wcdb.database;

import android.util.Printer;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.database.SQLiteTrace;
import com.tencent.wcdb.support.CancellationSignal;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class SQLiteConnectionPool implements Closeable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CONNECTION_FLAG_INTERACTIVE = 4;
    public static final int CONNECTION_FLAG_PRIMARY_CONNECTION_AFFINITY = 2;
    public static final int CONNECTION_FLAG_READ_ONLY = 1;
    private static final long CONNECTION_POOL_BUSY_MILLIS = 3000;
    private static final int OPEN_FLAG_REOPEN_MASK = 268435473;
    private static final String TAG = "WCDB.SQLiteConnectionPool";
    private final WeakHashMap<SQLiteConnection, AcquiredConnectionStatus> mAcquiredConnections;
    private final ArrayList<SQLiteConnection> mAvailableNonPrimaryConnections;
    private SQLiteConnection mAvailablePrimaryConnection;
    private volatile SQLiteChangeListener mChangeListener;
    private volatile SQLiteCheckpointListener mCheckpointListener;
    private SQLiteCipherSpec mCipher;
    private final SQLiteDatabaseConfiguration mConfiguration;
    private final AtomicBoolean mConnectionLeaked;
    private ConnectionWaiter mConnectionWaiterPool;
    private ConnectionWaiter mConnectionWaiterQueue;
    private final WeakReference<SQLiteDatabase> mDB;
    private boolean mIsOpen;
    private final Object mLock;
    private int mMaxConnectionPoolSize;
    private int mNextConnectionId;
    private byte[] mPassword;
    private volatile SQLiteTrace mTraceCallback;

    /* renamed from: com.tencent.wcdb.database.SQLiteConnectionPool$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements CancellationSignal.OnCancelListener {
        public final /* synthetic */ SQLiteConnectionPool this$0;
        public final /* synthetic */ int val$nonce;
        public final /* synthetic */ ConnectionWaiter val$waiter;

        public AnonymousClass1(SQLiteConnectionPool sQLiteConnectionPool, ConnectionWaiter connectionWaiter, int i2) {
        }

        @Override // com.tencent.wcdb.support.CancellationSignal.OnCancelListener
        public void onCancel() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class AcquiredConnectionStatus {
        private static final /* synthetic */ AcquiredConnectionStatus[] $VALUES = null;
        public static final AcquiredConnectionStatus DISCARD = null;
        public static final AcquiredConnectionStatus NORMAL = null;
        public static final AcquiredConnectionStatus RECONFIGURE = null;

        private AcquiredConnectionStatus(String str, int i2) {
        }

        public static AcquiredConnectionStatus valueOf(String str) {
        }

        public static AcquiredConnectionStatus[] values() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class ConnectionWaiter {
        public SQLiteConnection mAssignedConnection;
        public int mConnectionFlags;
        public RuntimeException mException;
        public ConnectionWaiter mNext;
        public int mNonce;
        public int mPriority;
        public String mSql;
        public long mStartTime;
        public Thread mThread;
        public boolean mWantPrimaryConnection;

        private ConnectionWaiter() {
        }

        public /* synthetic */ ConnectionWaiter(AnonymousClass1 anonymousClass1) {
        }
    }

    private SQLiteConnectionPool(SQLiteDatabase sQLiteDatabase, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i2) {
    }

    public static /* synthetic */ Object access$000(SQLiteConnectionPool sQLiteConnectionPool) {
    }

    public static /* synthetic */ void access$100(SQLiteConnectionPool sQLiteConnectionPool, ConnectionWaiter connectionWaiter) {
    }

    private void cancelConnectionWaiterLocked(ConnectionWaiter connectionWaiter) {
    }

    private void closeAvailableConnectionsAndLogExceptionsLocked() {
    }

    private void closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked() {
    }

    private void closeConnectionAndLogExceptionsLocked(SQLiteConnection sQLiteConnection) {
    }

    private void closeExcessConnectionsAndLogExceptionsLocked() {
    }

    private void discardAcquiredConnectionsLocked() {
    }

    private void dispose(boolean z) {
    }

    private void finishAcquireConnectionLocked(SQLiteConnection sQLiteConnection, int i2) {
    }

    private ConnectionPoolBusyInfo gatherConnectionPoolBusyInfoLocked() {
    }

    private static int getPriority(int i2) {
    }

    private boolean isSessionBlockingImportantConnectionWaitersLocked(boolean z, int i2) {
    }

    private void logConnectionPoolBusy(ConnectionPoolBusyInfo connectionPoolBusyInfo, long j2, int i2) {
    }

    private void markAcquiredConnectionsLocked(AcquiredConnectionStatus acquiredConnectionStatus) {
    }

    private ConnectionWaiter obtainConnectionWaiterLocked(Thread thread, long j2, int i2, boolean z, String str, int i3) {
    }

    public static SQLiteConnectionPool open(SQLiteDatabase sQLiteDatabase, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
    }

    private SQLiteConnection openConnectionLocked(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, boolean z) {
    }

    private void reconfigureAllConnectionsLocked() {
    }

    private boolean recycleConnectionLocked(SQLiteConnection sQLiteConnection, AcquiredConnectionStatus acquiredConnectionStatus) {
    }

    private void recycleConnectionWaiterLocked(ConnectionWaiter connectionWaiter) {
    }

    private void setMaxConnectionPoolSizeLocked(int i2) {
    }

    private void throwIfClosedLocked() {
    }

    private SQLiteConnection tryAcquireNonPrimaryConnectionLocked(String str, int i2) {
    }

    private SQLiteConnection tryAcquirePrimaryConnectionLocked(int i2) {
    }

    private SQLiteConnection waitForConnection(String str, int i2, CancellationSignal cancellationSignal) {
    }

    private void wakeConnectionWaitersLocked() {
    }

    public SQLiteConnection acquireConnection(String str, int i2, CancellationSignal cancellationSignal) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void collectDbStats(ArrayList<SQLiteDebug.DbStats> arrayList) {
    }

    public void dump(Printer printer, boolean z) {
    }

    public JSONObject dumpJSON(boolean z) throws JSONException {
    }

    public void finalize() throws Throwable {
    }

    public SQLiteChangeListener getChangeListener() {
    }

    public SQLiteCheckpointListener getCheckpointListener() {
    }

    public SQLiteTrace getTraceCallback() {
    }

    public void notifyChanges(String str, String str2, long[] jArr, long[] jArr2, long[] jArr3) {
    }

    public void notifyCheckpoint(String str, int i2) {
    }

    public void onConnectionLeaked() {
    }

    public void reconfigure(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
    }

    public void releaseConnection(SQLiteConnection sQLiteConnection) {
    }

    public void setChangeListener(SQLiteChangeListener sQLiteChangeListener, boolean z) {
    }

    public void setCheckpointListener(SQLiteCheckpointListener sQLiteCheckpointListener) {
    }

    public void setTraceCallback(SQLiteTrace sQLiteTrace) {
    }

    public boolean shouldYieldConnection(SQLiteConnection sQLiteConnection, int i2) {
    }

    public String toString() {
    }

    public void traceExecute(String str, int i2, long j2) {
    }

    public static SQLiteConnectionPool open(SQLiteDatabase sQLiteDatabase, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i2) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class ConnectionPoolBusyInfo {
        public int activeConnections;
        public ArrayList<String> activeOperationDescriptions;
        public ArrayList<SQLiteTrace.TraceInfo<String>> activeSql;
        public ArrayList<SQLiteTrace.TraceInfo<StackTraceElement[]>> activeTransactions;
        public int availableConnections;
        public int idleConnections;
        public String label;

        private ConnectionPoolBusyInfo() {
        }

        public /* synthetic */ ConnectionPoolBusyInfo(AnonymousClass1 anonymousClass1) {
        }
    }

    private void open() {
    }
}
