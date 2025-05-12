package j.u.a;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface g extends Closeable {
    Cursor E(j jVar);

    void beginTransaction();

    void beginTransactionNonExclusive();

    void endTransaction();

    void execSQL(String str) throws SQLException;

    k f(String str);

    List<Pair<String, String>> getAttachedDbs();

    String getPath();

    boolean inTransaction();

    boolean isOpen();

    boolean isWriteAheadLoggingEnabled();

    Cursor m(j jVar, CancellationSignal cancellationSignal);

    void setTransactionSuccessful();

    void setVersion(int i2);

    Cursor x(String str);
}
