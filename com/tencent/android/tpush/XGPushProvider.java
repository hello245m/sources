package com.tencent.android.tpush;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class XGPushProvider extends ContentProvider {
    public static String AUTH_PRIX = ".XGVIP_PUSH_AUTH";
    public static final String TAG = "XGPushProvider";
    private Context a;
    private String b;
    private UriMatcher c;

    /* renamed from: com.tencent.android.tpush.XGPushProvider$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = null;
    }

    private void a() {
    }

    private void b() {
    }

    public static void fetchProviderAuthorities(Context context) {
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
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
    }
}
