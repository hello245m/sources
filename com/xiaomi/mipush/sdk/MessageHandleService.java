package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class MessageHandleService extends BaseService {
    private static ConcurrentLinkedQueue<a> a;

    /* renamed from: a, reason: collision with other field name */
    private static ExecutorService f2a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class a {
        private Intent a;

        /* renamed from: a, reason: collision with other field name */
        private PushMessageReceiver f3a;

        public a(Intent intent, PushMessageReceiver pushMessageReceiver) {
        }

        public Intent a() {
        }

        /* renamed from: a, reason: collision with other method in class */
        public PushMessageReceiver m3a() {
        }
    }

    public static /* synthetic */ void a(Context context) {
    }

    public static void a(Context context, Intent intent) {
    }

    public static void a(Context context, a aVar) {
    }

    public static void addJob(Context context, a aVar) {
    }

    private static void b(Context context) {
    }

    private static void c(Context context) {
    }

    public static void startService(Context context) {
    }

    @Override // com.xiaomi.mipush.sdk.BaseService
    /* renamed from: a */
    public boolean mo9a() {
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public IBinder onBind(Intent intent) {
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public void onStart(Intent intent, int i2) {
    }
}
