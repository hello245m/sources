package com.tencent.wcdb.database;

import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.support.CancellationSignal;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class SQLiteQueryBuilder {
    private static final String TAG = "WCDB.SQLiteQueryBuilder";
    private static final Pattern sLimitPattern = null;
    private boolean mDistinct;
    private SQLiteDatabase.CursorFactory mFactory;
    private Map<String, String> mProjectionMap;
    private boolean mStrict;
    private String mTables;
    private StringBuilder mWhereClause;

    private static void appendClause(StringBuilder sb, String str, String str2) {
    }

    public static void appendColumns(StringBuilder sb, String[] strArr) {
    }

    public static String buildQueryString(boolean z, String str, String[] strArr, String str2, String str3, String str4, String str5, String str6) {
    }

    private String[] computeProjection(String[] strArr) {
    }

    private void validateQuerySql(SQLiteDatabase sQLiteDatabase, String str, CancellationSignal cancellationSignal) {
    }

    public void appendWhere(CharSequence charSequence) {
    }

    public void appendWhereEscapeString(String str) {
    }

    public String buildQuery(String[] strArr, String str, String str2, String str3, String str4, String str5) {
    }

    public String buildUnionQuery(String[] strArr, String str, String str2) {
    }

    public String buildUnionSubQuery(String str, String[] strArr, Set<String> set, int i2, String str2, String str3, String str4, String str5) {
    }

    public String getTables() {
    }

    public Cursor query(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4) {
    }

    public void setCursorFactory(SQLiteDatabase.CursorFactory cursorFactory) {
    }

    public void setDistinct(boolean z) {
    }

    public void setProjectionMap(Map<String, String> map) {
    }

    public void setStrict(boolean z) {
    }

    public void setTables(String str) {
    }

    public Cursor query(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
    }

    public Cursor query(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5, CancellationSignal cancellationSignal) {
    }

    @Deprecated
    public String buildUnionSubQuery(String str, String[] strArr, Set<String> set, int i2, String str2, String str3, String[] strArr2, String str4, String str5) {
    }

    @Deprecated
    public String buildQuery(String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
    }
}
