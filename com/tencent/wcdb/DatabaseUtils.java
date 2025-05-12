package com.tencent.wcdb;

import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.os.Parcel;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteProgram;
import com.tencent.wcdb.database.SQLiteStatement;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.Collator;
import java.util.HashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class DatabaseUtils {
    private static final boolean DEBUG = false;
    private static final char[] DIGITS = null;
    private static final int EX_HAS_REPLY_HEADER = -128;
    public static final int STATEMENT_ABORT = 6;
    public static final int STATEMENT_ATTACH = 3;
    public static final int STATEMENT_BEGIN = 4;
    public static final int STATEMENT_COMMIT = 5;
    public static final int STATEMENT_DDL = 8;
    public static final int STATEMENT_OTHER = 99;
    public static final int STATEMENT_PRAGMA = 7;
    public static final int STATEMENT_SELECT = 1;
    public static final int STATEMENT_UNPREPARED = 9;
    public static final int STATEMENT_UPDATE = 2;
    private static final String TAG = "WCDB.DatabaseUtils";
    private static Collator mColl;

    @Deprecated
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class InsertHelper {
        public static final int TABLE_INFO_PRAGMA_COLUMNNAME_INDEX = 1;
        public static final int TABLE_INFO_PRAGMA_DEFAULT_INDEX = 4;
        private HashMap<String, Integer> mColumns;
        private final SQLiteDatabase mDb;
        private String mInsertSQL;
        private SQLiteStatement mInsertStatement;
        private SQLiteStatement mPreparedStatement;
        private SQLiteStatement mReplaceStatement;
        private final String mTableName;

        public InsertHelper(SQLiteDatabase sQLiteDatabase, String str) {
        }

        private void buildSQL() throws SQLException {
        }

        private SQLiteStatement getStatement(boolean z) throws SQLException {
        }

        private long insertInternal(ContentValues contentValues, boolean z) {
        }

        public void bind(int i2, double d) {
        }

        public void bindNull(int i2) {
        }

        public void close() {
        }

        public long execute() {
        }

        public int getColumnIndex(String str) {
        }

        public long insert(ContentValues contentValues) {
        }

        public void prepareForInsert() {
        }

        public void prepareForReplace() {
        }

        public long replace(ContentValues contentValues) {
        }

        public void bind(int i2, float f) {
        }

        public void bind(int i2, long j2) {
        }

        public void bind(int i2, int i3) {
        }

        public void bind(int i2, boolean z) {
        }

        public void bind(int i2, byte[] bArr) {
        }

        public void bind(int i2, String str) {
        }
    }

    public static void appendEscapedSQLString(StringBuilder sb, String str) {
    }

    public static String[] appendSelectionArgs(String[] strArr, String[] strArr2) {
    }

    public static final void appendValueToSql(StringBuilder sb, Object obj) {
    }

    public static void bindObjectToProgram(SQLiteProgram sQLiteProgram, int i2, Object obj) {
    }

    public static String concatenateWhere(String str, String str2) {
    }

    public static void createDbFromSqlStatements(Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i2, String str2) {
    }

    public static void cursorDoubleToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
    }

    public static void cursorDoubleToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
    }

    public static void cursorDoubleToCursorValues(Cursor cursor, String str, ContentValues contentValues) {
    }

    public static void cursorFillWindow(Cursor cursor, int i2, CursorWindow cursorWindow) {
    }

    public static void cursorFloatToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
    }

    public static void cursorIntToContentValues(Cursor cursor, String str, ContentValues contentValues) {
    }

    public static void cursorIntToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
    }

    public static void cursorLongToContentValues(Cursor cursor, String str, ContentValues contentValues) {
    }

    public static void cursorLongToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
    }

    public static int cursorPickFillWindowStartPosition(int i2, int i3) {
    }

    public static void cursorRowToContentValues(Cursor cursor, ContentValues contentValues) {
    }

    public static void cursorShortToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
    }

    public static void cursorStringToContentValues(Cursor cursor, String str, ContentValues contentValues) {
    }

    public static void cursorStringToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
    }

    public static void cursorStringToInsertHelper(Cursor cursor, String str, InsertHelper insertHelper, int i2) {
    }

    public static void dumpCurrentRow(Cursor cursor) {
    }

    public static String dumpCurrentRowToString(Cursor cursor) {
    }

    public static void dumpCursor(Cursor cursor) {
    }

    public static String dumpCursorToString(Cursor cursor) {
    }

    private static char[] encodeHex(byte[] bArr) {
    }

    private static int extractSqlCode(String str) {
    }

    public static int findRowIdColumnIndex(String[] strArr) {
    }

    public static String getCollationKey(String str) {
    }

    private static byte[] getCollationKeyInBytes(String str) {
    }

    public static String getHexCollationKey(String str) {
    }

    private static int getKeyLen(byte[] bArr) {
    }

    public static int getSqlStatementType(String str) {
    }

    public static int getTypeOfObject(Object obj) {
    }

    public static long longForQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
    }

    public static boolean objectEquals(Object obj, Object obj2) {
    }

    public static boolean queryIsEmpty(SQLiteDatabase sQLiteDatabase, String str) {
    }

    public static long queryNumEntries(SQLiteDatabase sQLiteDatabase, String str) {
    }

    private static final int readExceptionCode(Parcel parcel) {
    }

    public static final void readExceptionFromParcel(Parcel parcel) {
    }

    public static void readExceptionWithFileNotFoundExceptionFromParcel(Parcel parcel) throws FileNotFoundException {
    }

    public static void readExceptionWithOperationApplicationExceptionFromParcel(Parcel parcel) throws OperationApplicationException {
    }

    public static String sqlEscapeString(String str) {
    }

    public static String stringForQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
    }

    public static final void writeExceptionToParcel(Parcel parcel, Exception exc) {
    }

    public static void cursorIntToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
    }

    public static void cursorLongToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
    }

    public static void cursorStringToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
    }

    public static void dumpCurrentRow(Cursor cursor, PrintStream printStream) {
    }

    public static void dumpCursor(Cursor cursor, PrintStream printStream) {
    }

    public static long queryNumEntries(SQLiteDatabase sQLiteDatabase, String str, String str2) {
    }

    public static long queryNumEntries(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
    }

    private static final void readExceptionFromParcel(Parcel parcel, String str, int i2) {
    }

    public static long longForQuery(SQLiteStatement sQLiteStatement, String[] strArr) {
    }

    public static String stringForQuery(SQLiteStatement sQLiteStatement, String[] strArr) {
    }

    public static void createDbFromSqlStatements(Context context, String str, int i2, String str2) {
    }

    public static void dumpCurrentRow(Cursor cursor, StringBuilder sb) {
    }

    public static void dumpCursor(Cursor cursor, StringBuilder sb) {
    }
}
