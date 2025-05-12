package com.tencent.tpns.baseapi.crosssp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.tpns.baseapi.base.SettingsContentProvider;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ProviderMessage {
    private static SettingsContentProvider a;
    private static ConcurrentHashMap<String, List<Long>> b;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class a<T> extends TTask {
        public static long a;
        public static long b;
        public static long c;
        public static long d;
        private Context e;
        private Uri g;
        private String[] h;

        /* renamed from: i, reason: collision with root package name */
        private String f1975i;

        /* renamed from: j, reason: collision with root package name */
        private String[] f1976j;

        /* renamed from: k, reason: collision with root package name */
        private String f1977k;

        /* renamed from: l, reason: collision with root package name */
        private ContentValues f1978l;

        /* renamed from: m, reason: collision with root package name */
        private String f1979m;

        /* renamed from: n, reason: collision with root package name */
        private int f1980n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f1981o;

        /* renamed from: p, reason: collision with root package name */
        private T f1982p;

        public a(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2, boolean z) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }

        public T a() {
        }

        public void a(T t2) {
        }

        public static Cursor a(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        }

        public a(Context context, Uri uri, ContentValues contentValues, boolean z) {
        }

        public static Uri a(Context context, Uri uri, ContentValues contentValues) {
        }

        public a(Context context, Uri uri, boolean z) {
        }

        public a(Context context, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        }

        public static String a(Context context, Uri uri) {
        }

        public a(Context context, Uri uri, String str, String[] strArr) {
        }

        public static int a(Context context, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        }

        public static int a(Context context, Uri uri, String str, String[] strArr) {
        }
    }

    public static /* synthetic */ SettingsContentProvider a() {
    }

    private static SettingsContentProvider b() {
    }

    public static int delete(Context context, String str, String str2, String str3, String[] strArr) {
    }

    public static String getType(Context context, Uri uri) {
    }

    public static Uri insert(Context context, Uri uri, ContentValues contentValues) {
    }

    public static void log(String str) {
    }

    public static Cursor query(Context context, String str, String str2, String[] strArr, String str3, String[] strArr2, String str4) {
    }

    public static int update(Context context, String str, String str2, ContentValues contentValues, String str3, String[] strArr) {
    }

    public static /* synthetic */ boolean a(Context context, Uri uri) {
    }

    public static String getType(Context context, String str, String str2) {
    }

    public static Uri insert(Context context, String str, String str2, ContentValues contentValues) {
    }

    private static boolean b(Context context, Uri uri) {
    }

    public static int delete(Context context, Uri uri, String str, String[] strArr) {
    }

    public static Cursor query(Context context, Uri uri, String[] strArr, String str) {
    }

    public static int update(Context context, Uri uri, ContentValues contentValues, String str, String[] strArr) {
    }

    public static Cursor query(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
    }
}
