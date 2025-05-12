package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class bm {
    private static volatile bm a;
    private Context b;
    private bl c;
    private final HashMap<String, bk> d;
    private ThreadPoolExecutor e;
    private final ArrayList<a> f;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static abstract class a implements Runnable {
        private String a;
        public String b;
        public bk c;
        private WeakReference<Context> d;
        private Random e;
        private int f;
        private a g;

        public a(String str) {
        }

        public Object a() {
        }

        public void a(Context context) {
        }

        public abstract void a(Context context, SQLiteDatabase sQLiteDatabase);

        public void a(Context context, Object obj) {
        }

        public void a(bk bkVar, Context context) {
        }

        public void a(a aVar) {
        }

        public void b(Context context) {
        }

        public boolean b() {
        }

        public String c() {
        }

        public SQLiteDatabase d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static abstract class b<T> extends a {
        private List<String> a;
        private String d;
        private String[] e;
        private String f;
        private String g;
        private String h;

        /* renamed from: i, reason: collision with root package name */
        private int f2062i;

        /* renamed from: j, reason: collision with root package name */
        private List<T> f2063j;

        public b(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i2) {
        }

        @Override // com.xiaomi.push.bm.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
        }

        public abstract void a(Context context, List<T> list);

        public abstract T b(Context context, Cursor cursor);

        @Override // com.xiaomi.push.bm.a
        public SQLiteDatabase d() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static class c extends a {
        private ArrayList<a> a;

        public c(String str, ArrayList<a> arrayList) {
        }

        @Override // com.xiaomi.push.bm.a
        public final void a(Context context) {
        }

        @Override // com.xiaomi.push.bm.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static class d extends a {
        private String a;
        public String[] d;

        public d(String str, String str2, String[] strArr) {
        }

        @Override // com.xiaomi.push.bm.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static class e extends a {
        private ContentValues a;

        public e(String str, ContentValues contentValues) {
        }

        @Override // com.xiaomi.push.bm.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
        }
    }

    private bm(Context context) {
    }

    public static bm a(Context context) {
    }

    public static /* synthetic */ ArrayList a(bm bmVar) {
    }

    private void a() {
    }

    private bk b(String str) {
    }

    public String a(String str) {
    }

    public void a(a aVar) {
    }

    public void a(Runnable runnable) {
    }

    public void a(ArrayList<a> arrayList) {
    }

    public void b(a aVar) {
    }
}
