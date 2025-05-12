package j.u.a.l;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import j.u.a.g;
import j.u.a.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class b implements h {
    public final Context a;
    public final String b;
    public final h.a c;
    public final boolean d;
    public final Object e;
    public a f;
    public boolean g;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a extends SQLiteOpenHelper {
        public final j.u.a.l.a[] a;
        public final h.a b;
        public boolean c;

        /* renamed from: j.u.a.l.b$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class C0181a implements DatabaseErrorHandler {
            public final /* synthetic */ h.a a;
            public final /* synthetic */ j.u.a.l.a[] b;

            public C0181a(h.a aVar, j.u.a.l.a[] aVarArr) {
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
            }
        }

        public a(Context context, String str, j.u.a.l.a[] aVarArr, h.a aVar) {
        }

        public static j.u.a.l.a c(j.u.a.l.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
        }

        public synchronized g a() {
        }

        public j.u.a.l.a b(SQLiteDatabase sQLiteDatabase) {
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
        }

        public synchronized g d() {
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        }
    }

    public b(Context context, String str, h.a aVar, boolean z) {
    }

    public final a a() {
    }

    @Override // j.u.a.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // j.u.a.h
    public String getDatabaseName() {
    }

    @Override // j.u.a.h
    public g s() {
    }

    @Override // j.u.a.h
    public void setWriteAheadLoggingEnabled(boolean z) {
    }

    @Override // j.u.a.h
    public g v() {
    }
}
