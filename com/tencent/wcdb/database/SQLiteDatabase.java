package com.tencent.wcdb.database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteTransactionListener;
import android.util.Pair;
import android.util.Printer;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.SQLException;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.extension.SQLiteExtension;
import com.tencent.wcdb.support.CancellationSignal;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class SQLiteDatabase extends SQLiteClosable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CONFLICT_ABORT = 2;
    public static final int CONFLICT_FAIL = 3;
    public static final int CONFLICT_IGNORE = 4;
    public static final int CONFLICT_NONE = 0;
    public static final int CONFLICT_REPLACE = 5;
    public static final int CONFLICT_ROLLBACK = 1;
    private static final String[] CONFLICT_VALUES = null;
    public static final int CREATE_IF_NECESSARY = 268435456;
    public static final int ENABLE_IO_TRACE = 256;
    public static final int ENABLE_WRITE_AHEAD_LOGGING = 536870912;
    public static final int MAX_SQL_CACHE_SIZE = 100;
    public static final int NO_LOCALIZED_COLLATORS = 16;
    public static final int OPEN_READONLY = 1;
    public static final int OPEN_READWRITE = 0;
    private static final int OPEN_READ_MASK = 1;
    public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
    public static final int SYNCHRONOUS_EXTRA = 3;
    public static final int SYNCHRONOUS_FULL = 2;
    public static final int SYNCHRONOUS_NORMAL = 1;
    public static final int SYNCHRONOUS_OFF = 0;
    private static final String TAG = "WCDB.SQLiteDatabase";
    private static final WeakHashMap<SQLiteDatabase, Object> sActiveDatabases = null;
    private final SQLiteDatabaseConfiguration mConfigurationLocked;
    private SQLiteConnectionPool mConnectionPoolLocked;
    private final CursorFactory mCursorFactory;
    private final DatabaseErrorHandler mErrorHandler;
    private boolean mHasAttachedDbsLocked;
    private final Object mLock;
    private final ThreadLocal<SQLiteSession> mThreadSession;

    /* renamed from: com.tencent.wcdb.database.SQLiteDatabase$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 extends ThreadLocal<SQLiteSession> {
        public final /* synthetic */ SQLiteDatabase this$0;

        public AnonymousClass1(SQLiteDatabase sQLiteDatabase) {
        }

        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ SQLiteSession initialValue() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public SQLiteSession initialValue() {
        }
    }

    /* renamed from: com.tencent.wcdb.database.SQLiteDatabase$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class AnonymousClass2 implements FileFilter {
        public final /* synthetic */ String val$prefix;

        public AnonymousClass2(String str) {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface CursorFactory {
        Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteProgram sQLiteProgram);

        SQLiteProgram newQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface CustomFunction {
        void callback(String[] strArr);
    }

    private SQLiteDatabase(String str, int i2, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
    }

    private void collectDbStats(ArrayList<SQLiteDebug.DbStats> arrayList) {
    }

    public static SQLiteDatabase create(CursorFactory cursorFactory) {
    }

    public static boolean deleteDatabase(File file) {
    }

    private void dispose(boolean z) {
    }

    public static void dumpAll(Printer printer, boolean z) {
    }

    public static JSONArray dumpAllJSON(boolean z) throws JSONException {
    }

    private int executeSql(String str, Object[] objArr, CancellationSignal cancellationSignal) throws SQLException {
    }

    public static String findEditTable(String str) {
    }

    private static ArrayList<SQLiteDatabase> getActiveDatabases() {
    }

    public static ArrayList<SQLiteDebug.DbStats> getDbStats() {
    }

    private static boolean isMainThread() {
    }

    private boolean isReadOnlyLocked() {
    }

    private Set<String> keySet(ContentValues contentValues) {
    }

    private void open(byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i2) {
    }

    public static SQLiteDatabase openDatabase(String str, CursorFactory cursorFactory, int i2) {
    }

    private void openInner(byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i2) {
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, CursorFactory cursorFactory) {
    }

    public static SQLiteDatabase openOrCreateDatabaseInWalMode(String str, CursorFactory cursorFactory) {
    }

    public static SQLiteDatabase openOrCreateMemoryDatabaseInWalMode(CursorFactory cursorFactory) {
    }

    public static int releaseMemory() {
    }

    private void throwIfNotOpenLocked() {
    }

    private boolean yieldIfContendedHelper(boolean z, long j2) {
    }

    public long acquireNativeConnectionHandle(String str, boolean z, boolean z2) {
    }

    public void addExtension(SQLiteExtension sQLiteExtension) {
    }

    public void beginTransaction() {
    }

    public void beginTransactionNonExclusive() {
    }

    public void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
    }

    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener) {
    }

    public SQLiteStatement compileStatement(String str) throws SQLException {
    }

    public SQLiteSession createSession() {
    }

    public int delete(String str, String str2, String[] strArr) {
    }

    public void disableWriteAheadLogging() {
    }

    public void dump(Printer printer, boolean z) {
    }

    public JSONObject dumpJSON(boolean z) throws JSONException {
    }

    public boolean enableWriteAheadLogging() {
    }

    public void endTransaction() {
    }

    public void execSQL(String str) throws SQLException {
    }

    public void finalize() throws Throwable {
    }

    public boolean getAsyncCheckpointEnabled() {
    }

    public List<Pair<String, String>> getAttachedDbs() {
    }

    public SQLiteChangeListener getChangeListener() {
    }

    public SQLiteCheckpointListener getCheckpointCallback() {
    }

    public String getLabel() {
    }

    public long getMaximumSize() {
    }

    public long getPageSize() {
    }

    public final String getPath() {
    }

    @Deprecated
    public Map<String, String> getSyncedTables() {
    }

    public int getSynchronousMode() {
    }

    public int getThreadDefaultConnectionFlags(boolean z) {
    }

    public SQLiteSession getThreadSession() {
    }

    public SQLiteTrace getTraceCallback() {
    }

    public int getVersion() {
    }

    public boolean inTransaction() {
    }

    public long insert(String str, String str2, ContentValues contentValues) {
    }

    public long insertOrThrow(String str, String str2, ContentValues contentValues) throws SQLException {
    }

    public long insertWithOnConflict(String str, String str2, ContentValues contentValues, int i2) {
    }

    public boolean isDatabaseIntegrityOk() {
    }

    public boolean isDbLockedByCurrentThread() {
    }

    @Deprecated
    public boolean isDbLockedByOtherThreads() {
    }

    public boolean isInMemoryDatabase() {
    }

    public boolean isOpen() {
    }

    public boolean isReadOnly() {
    }

    public boolean isWriteAheadLoggingEnabled() {
    }

    @Deprecated
    public void markTableSyncable(String str, String str2) {
    }

    @Deprecated
    public void markTableSyncable(String str, String str2, String str3) {
    }

    public boolean needUpgrade(int i2) {
    }

    @Override // com.tencent.wcdb.database.SQLiteClosable
    public void onAllReferencesReleased() {
    }

    public void onCorruption() {
    }

    public Cursor query(boolean z, String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6) {
    }

    public Cursor queryWithFactory(CursorFactory cursorFactory, boolean z, String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6) {
    }

    public Cursor rawQuery(String str, Object[] objArr) {
    }

    public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String str, Object[] objArr, String str2) {
    }

    public void releaseNativeConnection(long j2, Exception exc) {
    }

    public void reopenReadWrite() {
    }

    public long replace(String str, String str2, ContentValues contentValues) {
    }

    public long replaceOrThrow(String str, String str2, ContentValues contentValues) throws SQLException {
    }

    public void setAsyncCheckpointEnabled(boolean z) {
    }

    public void setChangeListener(SQLiteChangeListener sQLiteChangeListener, boolean z) {
    }

    public void setCheckpointCallback(SQLiteCheckpointListener sQLiteCheckpointListener) {
    }

    public void setForeignKeyConstraintsEnabled(boolean z) {
    }

    public void setLocale(Locale locale) {
    }

    @Deprecated
    public void setLockingEnabled(boolean z) {
    }

    public void setMaxSqlCacheSize(int i2) {
    }

    public long setMaximumSize(long j2) {
    }

    public void setPageSize(long j2) {
    }

    public void setSynchronousMode(int i2) {
    }

    public void setTraceCallback(SQLiteTrace sQLiteTrace) {
    }

    public void setTransactionSuccessful() {
    }

    public void setVersion(int i2) {
    }

    public String toString() {
    }

    public int update(String str, ContentValues contentValues, String str2, String[] strArr) {
    }

    public int updateWithOnConflict(String str, ContentValues contentValues, String str2, String[] strArr, int i2) {
    }

    public Pair<Integer, Integer> walCheckpoint(String str, boolean z) {
    }

    @Deprecated
    public boolean yieldIfContended() {
    }

    public boolean yieldIfContendedSafely() {
    }

    private void beginTransaction(SQLiteTransactionListener sQLiteTransactionListener, boolean z) {
    }

    public static SQLiteDatabase openDatabase(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, int i2, DatabaseErrorHandler databaseErrorHandler, int i3) {
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
    }

    public static SQLiteDatabase openOrCreateDatabaseInWalMode(String str, CursorFactory cursorFactory, int i2) {
    }

    public void execSQL(String str, Object[] objArr) throws SQLException {
    }

    public Cursor query(boolean z, String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6, CancellationSignal cancellationSignal) {
    }

    public Cursor queryWithFactory(CursorFactory cursorFactory, boolean z, String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6, CancellationSignal cancellationSignal) {
    }

    public Cursor rawQuery(String str, Object[] objArr, CancellationSignal cancellationSignal) {
    }

    public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String str, Object[] objArr, String str2, CancellationSignal cancellationSignal) {
    }

    public boolean yieldIfContendedSafely(long j2) {
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i2) {
    }

    public static SQLiteDatabase openOrCreateDatabaseInWalMode(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i2) {
    }

    public void execSQL(String str, Object[] objArr, CancellationSignal cancellationSignal) {
    }

    public Cursor query(String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5) {
    }

    public static SQLiteDatabase openDatabase(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, int i2, DatabaseErrorHandler databaseErrorHandler) {
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, byte[] bArr, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
    }

    public static SQLiteDatabase openOrCreateDatabaseInWalMode(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory) {
    }

    public Cursor query(String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6) {
    }

    public static SQLiteDatabase openDatabase(String str, CursorFactory cursorFactory, int i2, DatabaseErrorHandler databaseErrorHandler) {
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, byte[] bArr, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i2) {
    }

    public static SQLiteDatabase openDatabase(String str, CursorFactory cursorFactory, int i2, DatabaseErrorHandler databaseErrorHandler, int i3) {
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, CursorFactory cursorFactory, int i2) {
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, CursorFactory cursorFactory) {
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, CursorFactory cursorFactory, boolean z) {
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i2) {
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i2) {
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
    }
}
