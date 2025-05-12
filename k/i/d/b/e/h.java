package k.i.d.b.e;

import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteTrace;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class h implements SQLiteTrace {
    @Override // com.tencent.wcdb.database.SQLiteTrace
    public void onConnectionObtained(SQLiteDatabase sQLiteDatabase, String str, long j2, boolean z) {
    }

    @Override // com.tencent.wcdb.database.SQLiteTrace
    public void onConnectionPoolBusy(SQLiteDatabase sQLiteDatabase, String str, long j2, boolean z, List<SQLiteTrace.TraceInfo<String>> list, List<SQLiteTrace.TraceInfo<StackTraceElement[]>> list2) {
    }

    @Override // com.tencent.wcdb.database.SQLiteTrace
    public void onDatabaseCorrupted(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // com.tencent.wcdb.database.SQLiteTrace
    public void onSQLExecuted(SQLiteDatabase sQLiteDatabase, String str, int i2, long j2) {
    }
}
