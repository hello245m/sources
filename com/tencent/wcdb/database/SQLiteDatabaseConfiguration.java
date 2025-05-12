package com.tencent.wcdb.database;

import com.tencent.wcdb.extension.SQLiteExtension;
import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class SQLiteDatabaseConfiguration {
    public static final String MEMORY_DB_PATH = ":memory:";
    public boolean customWALHookEnabled;
    public final LinkedHashSet<SQLiteExtension> extensions;
    public boolean foreignKeyConstraintsEnabled;
    public final String label;
    public Locale locale;
    public int maxSqlCacheSize;
    public int openFlags;
    public final String path;
    public int synchronousMode;
    public boolean updateNotificationEnabled;
    public boolean updateNotificationRowID;
    public String vfsName;

    public SQLiteDatabaseConfiguration(String str, int i2) {
    }

    public boolean isInMemoryDb() {
    }

    public void updateParametersFrom(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
    }

    public SQLiteDatabaseConfiguration(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
    }
}
