package com.tencent.wcdb.repair;

import com.tencent.wcdb.database.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class DBDumpUtil {
    private static final String TAG = "WCDB.DBDumpUtil";

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface ExecuteSqlCallback {
        String preExecute(String str);
    }

    public static String buildColumnsString(ArrayList<String> arrayList) {
    }

    public static boolean doRecoveryDb(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
    }

    public static ArrayList<String> getColumnNamesFromSql(String str) {
    }

    public static String getTableNameFromSql(String str) {
    }

    private static native boolean nativeDumpDB(String str, String str2, String str3);

    private static native boolean nativeIsSqlComplete(String str);

    public static byte[] readFromFile(String str) {
    }

    public static boolean doRecoveryDb(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, List<String> list, List<String> list2, ExecuteSqlCallback executeSqlCallback, boolean z) {
    }
}
