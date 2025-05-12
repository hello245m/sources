package j.u.a.l;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import j.u.a.g;
import j.u.a.j;
import j.u.a.k;
import java.io.IOException;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class a implements g {
    public static final String[] b = null;
    public final SQLiteDatabase a;

    /* renamed from: j.u.a.l.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class C0180a implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ j a;

        public C0180a(a aVar, j jVar) {
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ j a;

        public b(a aVar, j jVar) {
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // j.u.a.g
    public Cursor E(j jVar) {
    }

    public boolean a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // j.u.a.g
    public void beginTransaction() {
    }

    @Override // j.u.a.g
    public void beginTransactionNonExclusive() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
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
    public Cursor m(j jVar, CancellationSignal cancellationSignal) {
    }

    @Override // j.u.a.g
    public void setTransactionSuccessful() {
    }

    @Override // j.u.a.g
    public void setVersion(int i2) {
    }

    @Override // j.u.a.g
    public Cursor x(String str) {
    }
}
