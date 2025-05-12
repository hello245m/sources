package com.tencent.tinker.lib.service;

import android.app.IntentService;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.atomic.AtomicBoolean;
import k.i.m.d.c.a;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class TinkerPatchService extends IntentService {
    public static a a = null;
    public static int b = -1119860829;
    public static Class<? extends AbstractResultService> c;
    public static AtomicBoolean d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class InnerService extends Service {
        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
        }

        @Override // android.app.Service
        public void onCreate() {
        }

        @Override // android.app.Service
        public void onDestroy() {
        }
    }

    public static /* synthetic */ int a() {
    }

    public static void b(Context context, Intent intent) {
    }

    public static String c(Intent intent) {
    }

    public static String d(Intent intent) {
    }

    public static boolean f(Context context) {
    }

    public static void g(Context context) {
    }

    public static void h(Context context, String str) {
    }

    public static void i(a aVar, Class<? extends AbstractResultService> cls) {
    }

    public static void j(Context context) {
    }

    public final void e() {
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
    }
}
