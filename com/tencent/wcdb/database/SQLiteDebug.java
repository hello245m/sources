package com.tencent.wcdb.database;

import android.annotation.SuppressLint;
import android.util.Printer;
import java.util.ArrayList;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class SQLiteDebug {
    private static final String TAG = "WCDB.SQLiteDebug";
    private static volatile int sLastErrorLine;
    private static volatile ArrayList<IOTraceStats> sLastIOTraceStats;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class DbStats {
        public String cache;
        public String dbName;
        public long dbSize;
        public int lookaside;
        public long pageSize;

        public DbStats(String str, long j2, long j3, int i2, int i3, int i4, int i5) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class IOTraceStats {
        public String dbName;
        public String journalMode;
        public long lastJournalReadOffset;
        public byte[] lastJournalReadPage;
        public long lastJournalWriteOffset;
        public byte[] lastJournalWritePage;
        public long lastReadOffset;
        public byte[] lastReadPage;
        public long lastWriteOffset;
        public byte[] lastWritePage;
        public long pageCount;
        public long pageSize;
        public String path;

        @SuppressLint({"DefaultLocale"})
        public String toString() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class PagerStats {
        public ArrayList<DbStats> dbStats;
        public int largestMemAlloc;
        public int memoryUsed;
        public int pageCacheOverflow;
    }

    private SQLiteDebug() {
    }

    public static void collectLastIOTraceStats(SQLiteConnection sQLiteConnection) {
    }

    public static void dump(Printer printer, String[] strArr) {
    }

    public static PagerStats getDatabaseInfo() {
    }

    public static int getLastErrorLine() {
    }

    public static ArrayList<IOTraceStats> getLastIOTraceStats() {
    }

    private static native void nativeGetIOTraceStats(long j2, ArrayList<IOTraceStats> arrayList);

    private static native int nativeGetLastErrorLine();

    private static native void nativeGetPagerStats(PagerStats pagerStats);

    private static native void nativeSetIOTraceFlags(int i2);

    public static void setIOTraceFlags(int i2) {
    }

    public static final boolean shouldLogSlowQuery(long j2) {
    }

    public static void collectLastIOTraceStats(SQLiteDatabase sQLiteDatabase) {
    }
}
