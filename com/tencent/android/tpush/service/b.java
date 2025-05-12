package com.tencent.android.tpush.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.LocalServerSocket;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.tencent.tpns.baseapi.base.util.TTask;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class b {
    private static Context a = null;
    private static String b = "";
    private static LocalServerSocket c = null;
    private static LocalServerSocket d = null;
    private static volatile boolean e = false;
    private static volatile boolean f = false;
    private static volatile boolean g = false;
    private static boolean h = false;

    /* renamed from: i, reason: collision with root package name */
    private static ServiceConnection f806i;

    /* renamed from: j, reason: collision with root package name */
    private Handler f807j;

    /* renamed from: com.tencent.android.tpush.service.b$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.tencent.android.tpush.service.b$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass2 extends Handler {
        public final /* synthetic */ b a;

        /* renamed from: com.tencent.android.tpush.service.b$2$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 extends TTask {
            public final /* synthetic */ AnonymousClass2 a;

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
            }

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        }

        public AnonymousClass2(b bVar, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a {
        public static final b a = null;
    }

    public /* synthetic */ b(AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ boolean a(boolean z) {
    }

    public static /* synthetic */ boolean b(boolean z) {
    }

    public static Context e() {
    }

    public static ServiceConnection f() {
    }

    public static void g() {
    }

    public static String h() {
    }

    public static /* synthetic */ Context i() {
    }

    public static /* synthetic */ boolean j() {
    }

    private void k() {
    }

    public void c() {
    }

    public void d() {
    }

    private b() {
    }

    public static boolean a() {
    }

    public static b b() {
    }

    public static void b(Context context) {
    }

    public void a(Intent intent) {
    }

    public static void a(Context context) {
    }

    public static void a(Context context, long j2) {
    }

    public static void a(Context context, String str, long j2) {
    }
}
