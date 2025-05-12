package com.tencent.wcdb.database;

import android.database.sqlite.SQLiteTransactionListener;
import android.util.Pair;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.database.SQLiteConnection;
import com.tencent.wcdb.support.CancellationSignal;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class SQLiteSession {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int TRANSACTION_MODE_DEFERRED = 0;
    public static final int TRANSACTION_MODE_EXCLUSIVE = 2;
    public static final int TRANSACTION_MODE_IMMEDIATE = 1;
    private SQLiteConnection mConnection;
    private int mConnectionFlags;
    private final SQLiteConnectionPool mConnectionPool;
    private int mConnectionUseCount;
    private Transaction mTransactionPool;
    private Transaction mTransactionStack;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class Transaction {
        public boolean mChildFailed;
        public SQLiteTransactionListener mListener;
        public boolean mMarkedSuccessful;
        public int mMode;
        public Transaction mParent;

        private Transaction() {
        }

        public /* synthetic */ Transaction(AnonymousClass1 anonymousClass1) {
        }
    }

    public SQLiteSession(SQLiteConnectionPool sQLiteConnectionPool) {
    }

    private void acquireConnection(String str, int i2, boolean z, CancellationSignal cancellationSignal) {
    }

    private void beginTransactionUnchecked(int i2, SQLiteTransactionListener sQLiteTransactionListener, int i3, CancellationSignal cancellationSignal) {
    }

    private void endTransactionUnchecked(CancellationSignal cancellationSignal, boolean z) {
    }

    private boolean executeSpecial(String str, Object[] objArr, int i2, CancellationSignal cancellationSignal) {
    }

    private Transaction obtainTransaction(int i2, SQLiteTransactionListener sQLiteTransactionListener) {
    }

    private void recycleTransaction(Transaction transaction) {
    }

    private void releaseConnection() {
    }

    private void throwIfNestedTransaction() {
    }

    private void throwIfNoTransaction() {
    }

    private void throwIfTransactionMarkedSuccessful() {
    }

    private boolean yieldTransactionUnchecked(long j2, CancellationSignal cancellationSignal) {
    }

    public SQLiteConnection acquireConnectionForNativeHandle(int i2) {
    }

    public SQLiteConnection.PreparedStatement acquirePreparedStatement(String str, int i2, boolean z) {
    }

    public void beginTransaction(int i2, SQLiteTransactionListener sQLiteTransactionListener, int i3, CancellationSignal cancellationSignal) {
    }

    public void endTransaction(CancellationSignal cancellationSignal) {
    }

    public void execute(String str, Object[] objArr, int i2, CancellationSignal cancellationSignal) {
    }

    public int executeForChangedRowCount(String str, Object[] objArr, int i2, CancellationSignal cancellationSignal) {
    }

    public int executeForCursorWindow(String str, Object[] objArr, CursorWindow cursorWindow, int i2, int i3, boolean z, int i4, CancellationSignal cancellationSignal) {
    }

    public long executeForLastInsertedRowId(String str, Object[] objArr, int i2, CancellationSignal cancellationSignal) {
    }

    public long executeForLong(String str, Object[] objArr, int i2, CancellationSignal cancellationSignal) {
    }

    public String executeForString(String str, Object[] objArr, int i2, CancellationSignal cancellationSignal) {
    }

    public boolean hasConnection() {
    }

    public boolean hasNestedTransaction() {
    }

    public boolean hasTransaction() {
    }

    public void prepare(String str, int i2, CancellationSignal cancellationSignal, SQLiteStatementInfo sQLiteStatementInfo) {
    }

    public void releaseConnectionForNativeHandle(Exception exc) {
    }

    public void releasePreparedStatement(SQLiteConnection.PreparedStatement preparedStatement) {
    }

    public void setTransactionSuccessful() {
    }

    public Pair<Integer, Integer> walCheckpoint(String str, int i2) {
    }

    public boolean yieldTransaction(long j2, boolean z, CancellationSignal cancellationSignal) {
    }
}
