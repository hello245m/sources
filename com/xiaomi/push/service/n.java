package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.widget.RemoteViews;
import com.xiaomi.push.dv;
import com.xiaomi.push.hd;
import com.xiaomi.push.hn;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class n {
    public static long a;
    private static final LinkedList<Pair<Integer, hn>> b = null;
    private static ExecutorService c;
    private static volatile u d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static class a implements Callable<Bitmap> {
        private String a;
        private Context b;
        private boolean c;

        public a(String str, Context context, boolean z) {
        }

        public Bitmap a() {
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ Bitmap call() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static class b {
        public Notification a;
        public long b;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static class c {
        public String a;
        public long b;
        public boolean c;
    }

    private static int a(Context context, String str, String str2) {
    }

    private static Notification a(Notification notification) {
    }

    private static PendingIntent a(Context context, hn hnVar, String str, byte[] bArr, int i2) {
    }

    private static PendingIntent a(Context context, hn hnVar, String str, byte[] bArr, int i2, int i3, boolean z) {
    }

    private static PendingIntent a(Context context, String str, hn hnVar, byte[] bArr, int i2, int i3) {
    }

    public static ComponentName a(String str) {
    }

    public static Intent a(Context context, String str, Map<String, String> map, int i2) {
    }

    private static Intent a(Context context, String str, Map<String, String> map, String str2, String str3, String str4, String str5) {
    }

    private static Bitmap a(Context context, int i2) {
    }

    public static Bitmap a(Drawable drawable) {
    }

    @TargetApi(16)
    private static dv a(Context context, hn hnVar, byte[] bArr, String str, int i2) {
    }

    @SuppressLint({"NewApi"})
    private static b a(Context context, hn hnVar, byte[] bArr, RemoteViews remoteViews, PendingIntent pendingIntent, int i2) {
    }

    public static c a(Context context, hn hnVar, byte[] bArr) {
    }

    private static String a(Context context, String str, Map<String, String> map) {
    }

    public static String a(hn hnVar) {
    }

    public static String a(Map<String, String> map, int i2) {
    }

    private static String a(Map<String, String> map, String str) {
    }

    private static void a(Context context, Intent intent, hn hnVar, hd hdVar, String str, int i2) {
    }

    public static void a(Context context, String str, int i2) {
    }

    public static void a(Context context, String str, int i2, int i3) {
    }

    public static void a(Context context, String str, String str2, String str3) {
    }

    public static void a(Context context, LinkedList<? extends Object> linkedList) {
    }

    private static void a(Intent intent) {
    }

    @TargetApi(16)
    private static void a(dv dvVar, Context context, String str, hn hnVar, byte[] bArr, int i2) {
    }

    private static boolean a(Context context, hn hnVar, String str) {
    }

    public static boolean a(Context context, String str) {
    }

    public static boolean a(Context context, String str, boolean z) {
    }

    private static boolean a(hd hdVar) {
    }

    private static boolean a(String str, String str2) {
    }

    public static boolean a(Map<String, String> map) {
    }

    private static String[] a(Context context, hd hdVar) {
    }

    public static Intent b(Context context, String str, Map<String, String> map, int i2) {
    }

    private static Bitmap b(Context context, String str, boolean z) {
    }

    private static RemoteViews b(Context context, hn hnVar, byte[] bArr) {
    }

    public static void b(Context context, String str) {
    }

    public static void b(Context context, String str, int i2) {
    }

    private static void b(Intent intent) {
    }

    public static boolean b(hn hnVar) {
    }

    private static boolean b(Map<String, String> map) {
    }

    private static int c(Context context, String str, Map<String, String> map, int i2) {
    }

    private static int c(Map<String, String> map) {
    }

    public static void c(Context context, String str) {
    }

    public static boolean c(hn hnVar) {
    }

    public static int d(Context context, String str) {
    }

    private static int d(Map<String, String> map) {
    }

    public static boolean d(hn hnVar) {
    }

    private static int e(Map<String, String> map) {
    }

    public static void e(Context context, String str) {
    }

    public static boolean e(hn hnVar) {
    }

    public static boolean f(Context context, String str) {
    }

    public static boolean f(hn hnVar) {
    }

    private static int g(Context context, String str) {
    }

    public static String g(hn hnVar) {
    }
}
