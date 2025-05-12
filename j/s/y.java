package j.s;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.arch.core.util.Function;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class y implements j.u.a.h, d0 {
    public final j.u.a.h a;
    public final a b;
    public final x c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a implements j.u.a.g {
        public final x a;

        public a(x xVar) {
        }

        public static /* synthetic */ Object a(String str, j.u.a.g gVar) {
        }

        public static /* synthetic */ Boolean b(j.u.a.g gVar) {
        }

        public static /* synthetic */ Object c(j.u.a.g gVar) {
        }

        public static /* synthetic */ Object d(int i2, j.u.a.g gVar) {
        }

        @Override // j.u.a.g
        public Cursor E(j.u.a.j jVar) {
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

        public void e() {
        }

        @Override // j.u.a.g
        public void endTransaction() {
        }

        @Override // j.u.a.g
        public void execSQL(String str) throws SQLException {
        }

        @Override // j.u.a.g
        public j.u.a.k f(String str) {
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
        public Cursor m(j.u.a.j jVar, CancellationSignal cancellationSignal) {
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

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b implements j.u.a.k {
        public final String a;
        public final ArrayList<Object> b;
        public final x c;

        public b(String str, x xVar) {
        }

        private /* synthetic */ Object c(Function function, j.u.a.g gVar) {
        }

        public final void a(j.u.a.k kVar) {
        }

        public final <T> T b(Function<j.u.a.k, T> function) {
        }

        @Override // j.u.a.i
        public void bindBlob(int i2, byte[] bArr) {
        }

        @Override // j.u.a.i
        public void bindDouble(int i2, double d) {
        }

        @Override // j.u.a.i
        public void bindLong(int i2, long j2) {
        }

        @Override // j.u.a.i
        public void bindNull(int i2) {
        }

        @Override // j.u.a.i
        public void bindString(int i2, String str) {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public /* synthetic */ Object d(Function function, j.u.a.g gVar) {
        }

        public final void e(int i2, Object obj) {
        }

        @Override // j.u.a.k
        public long executeInsert() {
        }

        @Override // j.u.a.k
        public int executeUpdateDelete() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class c implements Cursor {
        public final Cursor a;
        public final x b;

        public c(Cursor cursor, x xVar) {
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i2, CharArrayBuffer charArrayBuffer) {
        }

        @Override // android.database.Cursor
        @Deprecated
        public void deactivate() {
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i2) {
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
        }

        @Override // android.database.Cursor
        public String getColumnName(int i2) {
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
        }

        @Override // android.database.Cursor
        public int getCount() {
        }

        @Override // android.database.Cursor
        public double getDouble(int i2) {
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
        }

        @Override // android.database.Cursor
        public float getFloat(int i2) {
        }

        @Override // android.database.Cursor
        public int getInt(int i2) {
        }

        @Override // android.database.Cursor
        public long getLong(int i2) {
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
        }

        @Override // android.database.Cursor
        public List<Uri> getNotificationUris() {
        }

        @Override // android.database.Cursor
        public int getPosition() {
        }

        @Override // android.database.Cursor
        public short getShort(int i2) {
        }

        @Override // android.database.Cursor
        public String getString(int i2) {
        }

        @Override // android.database.Cursor
        public int getType(int i2) {
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
        }

        @Override // android.database.Cursor
        public boolean isLast() {
        }

        @Override // android.database.Cursor
        public boolean isNull(int i2) {
        }

        @Override // android.database.Cursor
        public boolean move(int i2) {
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i2) {
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        }

        @Override // android.database.Cursor
        @Deprecated
        public boolean requery() {
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle bundle) {
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver contentResolver, List<Uri> list) {
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        }
    }

    public y(j.u.a.h hVar, x xVar) {
    }

    @Override // j.s.d0
    public j.u.a.h a() {
    }

    public x b() {
    }

    @Override // j.u.a.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // j.u.a.h
    public String getDatabaseName() {
    }

    @Override // j.u.a.h
    public j.u.a.g s() {
    }

    @Override // j.u.a.h
    public void setWriteAheadLoggingEnabled(boolean z) {
    }

    @Override // j.u.a.h
    public j.u.a.g v() {
    }
}
