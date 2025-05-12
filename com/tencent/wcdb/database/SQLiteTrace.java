package com.tencent.wcdb.database;

import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface SQLiteTrace {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class TraceInfo<T> {
        public final T info;
        public final int tid;
        public final long time;

        public TraceInfo(T t2, long j2, int i2) {
        }
    }

    void onConnectionObtained(SQLiteDatabase sQLiteDatabase, String str, long j2, boolean z);

    void onConnectionPoolBusy(SQLiteDatabase sQLiteDatabase, String str, long j2, boolean z, List<TraceInfo<String>> list, List<TraceInfo<StackTraceElement[]>> list2);

    void onDatabaseCorrupted(SQLiteDatabase sQLiteDatabase);

    void onSQLExecuted(SQLiteDatabase sQLiteDatabase, String str, int i2, long j2);
}
