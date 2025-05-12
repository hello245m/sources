package k.i.d.b.e;

import android.content.Context;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteOpenHelper;
import j.u.a.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class d implements j.u.a.h {
    public final Context a;
    public final String b;
    public final h.a c;
    public a d;
    public final Object e;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a extends SQLiteOpenHelper {
        public static final C0300a d = null;
        public final c[] a;
        public final h.a b;
        public boolean c;

        /* renamed from: k.i.d.b.e.d$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static final class C0300a {
            public C0300a() {
            }

            public /* synthetic */ C0300a(n.d0.d.h hVar) {
            }

            public final c a(c[] cVarArr, SQLiteDatabase sQLiteDatabase) {
            }
        }

        public a(Context context, String str, c[] cVarArr, h.a aVar) {
        }

        public static final void a(c[] cVarArr, h.a aVar, SQLiteDatabase sQLiteDatabase) {
        }

        public static /* synthetic */ void e(c[] cVarArr, h.a aVar, SQLiteDatabase sQLiteDatabase) {
        }

        public final synchronized j.u.a.g b() {
        }

        public final c c(SQLiteDatabase sQLiteDatabase) {
        }

        @Override // com.tencent.wcdb.database.SQLiteOpenHelper
        public synchronized void close() {
        }

        public final synchronized j.u.a.g d() {
        }

        @Override // com.tencent.wcdb.database.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        }

        @Override // com.tencent.wcdb.database.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
        }

        @Override // com.tencent.wcdb.database.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        }

        @Override // com.tencent.wcdb.database.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
        }

        @Override // com.tencent.wcdb.database.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        }
    }

    public d(Context context, String str, h.a aVar) {
    }

    public final h.a a() {
    }

    public final Context b() {
    }

    public final a c() {
    }

    @Override // j.u.a.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final String d() {
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
