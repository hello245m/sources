package com.tencent.wcdb.database;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class SQLiteGlobal {
    private static final String TAG = "WCDB.SQLiteGlobal";
    public static final String defaultJournalMode = "PERSIST";
    public static final int defaultPageSize = 0;
    public static final String defaultSyncMode = "FULL";
    public static final int journalSizeLimit = 524288;
    public static final int walAutoCheckpoint = 100;
    public static final int walConnectionPoolSize = 4;
    public static final String walSyncMode = "FULL";

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class Initializer {
        private Initializer() {
        }

        public static void init() {
        }
    }

    private SQLiteGlobal() {
    }

    public static /* synthetic */ void access$000(int i2) {
    }

    public static void initialize() {
    }

    public static void loadLib() {
    }

    private static native void nativeInitialize(int i2);

    private static native int nativeReleaseMemory();

    public static int releaseMemory() {
    }
}
