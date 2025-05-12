package com.tencent.xweb;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebCoreContentProvider extends ContentProvider {
    public static final String MM_PACKAGE_NAME = "com.tencent.mm";
    public static final int OP_TYPE_GET_FILE = 2;
    public static final int OP_TYPE_INVALID = -1;
    public static final int OP_TYPE_REPORT_KV = 3;
    public static final int OP_TYPE_TEST = 1;
    public static final String URI_APPEND_STR = ".sdk.xweb.XWebCoreProvider";
    public static final String[] XWALK_CORE_PROVIDER_LIST = null;
    public static AtomicBoolean a;
    public static AtomicLong b;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class CachedInfoMgr {
        public static List<KVInfo> a;
        public static final Object b = null;

        public static void add(KVInfo kVInfo) {
        }

        public static void process() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class KVInfo {
        public int key;
        public String value;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class ReportInfo {
        public String currentPackageName;
        public int errCode;
        public UriInfo uriInfo;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class UriInfo {
        public String callerName;
        public int opType;
        public String targetFileName;
        public int targetVersion;
    }

    public static void a(Context context, ReportInfo reportInfo) {
    }

    public static Uri buildUri(String str, String str2, int i2, int i3, String str3) {
    }

    public static boolean isBusy() {
    }

    public static boolean isProvider(String str) {
    }

    public static boolean isSelfProvider() {
    }

    public static void onXWebInitFinished() {
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
    }

    public static Map<String, String> a(File file) {
    }

    public static UriInfo a(Uri uri) {
    }

    public static void a(Context context, UriInfo uriInfo) {
    }
}
