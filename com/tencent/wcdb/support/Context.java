package com.tencent.wcdb.support;

import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteDatabase;
import java.io.File;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class Context {
    public static final int MODE_ENABLE_WRITE_AHEAD_LOGGING = 8;

    private static File getDataDirFile(android.content.Context context) {
    }

    private static File getDatabasesDir(android.content.Context context) {
    }

    private static File makeFilename(File file, String str) {
    }

    public static SQLiteDatabase openOrCreateDatabase(android.content.Context context, String str, int i2, SQLiteDatabase.CursorFactory cursorFactory) {
    }

    private static void setFilePermissionsFromMode(String str, int i2, int i3) {
    }

    private static File validateFilePath(android.content.Context context, String str, boolean z) {
    }

    public static SQLiteDatabase openOrCreateDatabase(android.content.Context context, String str, int i2, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
    }

    public static SQLiteDatabase openOrCreateDatabase(android.content.Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i2, SQLiteDatabase.CursorFactory cursorFactory) {
    }

    public static SQLiteDatabase openOrCreateDatabase(android.content.Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i2, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
    }

    public static SQLiteDatabase openOrCreateDatabase(android.content.Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i2, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i3) {
    }
}
