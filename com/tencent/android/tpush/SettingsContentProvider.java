package com.tencent.android.tpush;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class SettingsContentProvider extends ContentProvider {
    public static Uri BASE_URI = null;
    public static final String BOOLEAN_TYPE = "boolean";
    public static final String FLOAT_TYPE = "float";
    public static final String INT_TYPE = "integer";
    public static final String KEY = "key";
    public static final String LONG_TYPE = "long";
    public static final String PREFFERENCE_AUTHORITY = "TPUSH_PROVIDER";
    public static final String STRING_TYPE = "string";
    public static final String TYPE = "type";
    private static UriMatcher a;
    private static String b;
    private SharedPreferences c;

    private void a(Context context) {
    }

    public static boolean getBooleanValue(Cursor cursor, boolean z) {
    }

    public static final Uri getContentUri(Context context, String str, String str2) {
    }

    public static float getFloatValue(Cursor cursor, float f) {
    }

    public static int getIntValue(Cursor cursor, int i2) {
    }

    public static long getLongValue(Cursor cursor, long j2) {
    }

    public static String getStringValue(Cursor cursor, String str) {
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"NewApi"})
    public Uri insert(Uri uri, ContentValues contentValues) {
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
    }
}
