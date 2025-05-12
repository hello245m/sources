package com.tencent.wcdb.database;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.HashSet;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class SQLiteAsyncCheckpointer implements SQLiteCheckpointListener, Handler.Callback {
    private static final int DEFAULT_BLOCKING_THRESHOLD = 300;
    private static final int DEFAULT_THRESHOLD = 100;
    private static HandlerThread gDefaultThread;
    private static final Object gDefaultThreadLock = null;
    private static int gDefaultThreadRefCount;
    private int mBlockingThreshold;
    private Handler mHandler;
    private int mLastSyncMode;
    private Looper mLooper;
    private final HashSet<Pair<SQLiteDatabase, String>> mPendingCheckpoints;
    private int mThreshold;
    private boolean mUseDefaultLooper;

    public SQLiteAsyncCheckpointer() {
    }

    private static Looper acquireDefaultLooper() {
    }

    private static void releaseDefaultLooper() {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
    }

    @Override // com.tencent.wcdb.database.SQLiteCheckpointListener
    public void onAttach(SQLiteDatabase sQLiteDatabase) {
    }

    public void onCheckpointResult(SQLiteDatabase sQLiteDatabase, int i2, int i3, long j2) {
    }

    @Override // com.tencent.wcdb.database.SQLiteCheckpointListener
    public void onDetach(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // com.tencent.wcdb.database.SQLiteCheckpointListener
    public void onWALCommit(SQLiteDatabase sQLiteDatabase, String str, int i2) {
    }

    public SQLiteAsyncCheckpointer(Looper looper) {
    }

    public SQLiteAsyncCheckpointer(Looper looper, int i2, int i3) {
    }
}
