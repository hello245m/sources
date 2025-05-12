package k.i.d.b.e;

import android.database.SQLException;
import android.util.Pair;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.database.SQLiteCursorDriver;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteProgram;
import com.tencent.wcdb.support.CancellationSignal;
import j.u.a.j;
import j.u.a.k;
import java.io.IOException;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class c implements j.u.a.g {
    public static final String[] b = null;
    public final SQLiteDatabase a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ j a;

        public a(j jVar) {
        }

        @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteProgram sQLiteProgram) {
        }

        @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
        public SQLiteProgram newQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ j a;

        public b(j jVar) {
        }

        @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteProgram sQLiteProgram) {
        }

        @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
        public SQLiteProgram newQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
        }
    }

    public c(SQLiteDatabase sQLiteDatabase) {
    }

    public static /* synthetic */ void b(CancellationSignal cancellationSignal) {
    }

    public static final void g(CancellationSignal cancellationSignal) {
    }

    @Override // j.u.a.g
    public /* bridge */ /* synthetic */ android.database.Cursor E(j jVar) {
    }

    public final boolean a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // j.u.a.g
    public void beginTransaction() {
    }

    @Override // j.u.a.g
    public void beginTransactionNonExclusive() {
    }

    public Cursor c(j jVar) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public Cursor d(j jVar, android.os.CancellationSignal cancellationSignal) {
    }

    public Cursor e(String str) {
    }

    @Override // j.u.a.g
    public void endTransaction() {
    }

    @Override // j.u.a.g
    public void execSQL(String str) throws SQLException {
    }

    @Override // j.u.a.g
    public k f(String str) {
    }

    @Override // j.u.a.g
    public List<Pair<String, String>> getAttachedDbs() {
    }

    @Override // j.u.a.g
    public String getPath() {
    }

    @Override // j.u.a.g
    public boolean inTransaction() {
    }

    @Override // j.u.a.g
    public boolean isOpen() {
    }

    @Override // j.u.a.g
    public boolean isWriteAheadLoggingEnabled() {
    }

    @Override // j.u.a.g
    public /* bridge */ /* synthetic */ android.database.Cursor m(j jVar, android.os.CancellationSignal cancellationSignal) {
    }

    @Override // j.u.a.g
    public void setTransactionSuccessful() {
    }

    @Override // j.u.a.g
    public void setVersion(int i2) {
    }

    @Override // j.u.a.g
    public /* bridge */ /* synthetic */ android.database.Cursor x(String str) {
    }
}
