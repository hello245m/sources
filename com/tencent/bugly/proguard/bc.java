package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class bc {

    /* renamed from: n, reason: collision with root package name */
    private static bc f1023n = null;

    /* renamed from: p, reason: collision with root package name */
    private static volatile String f1024p = null;

    /* renamed from: q, reason: collision with root package name */
    private static volatile long f1025q = -1;
    public final AtomicBoolean a;
    private final Context b;
    private final ActivityManager c;
    private final ab d;
    private final am e;
    private final ad f;
    private final av g;
    private final Object h;

    /* renamed from: i, reason: collision with root package name */
    private String f1026i;

    /* renamed from: j, reason: collision with root package name */
    private FileObserver f1027j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1028k;

    /* renamed from: l, reason: collision with root package name */
    private bj f1029l;

    /* renamed from: m, reason: collision with root package name */
    private int f1030m;

    /* renamed from: o, reason: collision with root package name */
    private long f1031o;

    /* renamed from: r, reason: collision with root package name */
    private final Object f1032r;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends FileObserver {
        public final /* synthetic */ bc a;

        /* renamed from: com.tencent.bugly.proguard.bc$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class RunnableC0025a implements Runnable {
            public final /* synthetic */ String a;
            public final /* synthetic */ a b;

            public RunnableC0025a(a aVar, String str) {
            }

            @Override // java.lang.Runnable
            public final void run() {
            }
        }

        public a(bc bcVar, String str) {
        }

        @Override // android.os.FileObserver
        public final void onEvent(int i2, String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Runnable {
        public final /* synthetic */ bc a;

        public b(bc bcVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements Runnable {
        public final /* synthetic */ bc a;

        public c(bc bcVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d extends FileObserver {
        public final /* synthetic */ bc a;

        public d(bc bcVar, String str) {
        }

        @Override // android.os.FileObserver
        public final void onEvent(int i2, String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e implements Runnable {
        public final /* synthetic */ bc a;

        public e(bc bcVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    private bc(Context context, ad adVar, ab abVar, am amVar, av avVar) {
    }

    public static /* synthetic */ am a(bc bcVar) {
    }

    private boolean b(boolean z) {
    }

    public static /* synthetic */ ab c(bc bcVar) {
    }

    public static /* synthetic */ void d(bc bcVar) {
    }

    public static /* synthetic */ String e(bc bcVar) {
    }

    private synchronized void f() {
    }

    private synchronized void g() {
    }

    private synchronized boolean h() {
    }

    private synchronized boolean i() {
    }

    private void j() {
    }

    private synchronized void k() {
    }

    private synchronized void l() {
    }

    public static /* synthetic */ void a(bc bcVar, long j2, String str) {
    }

    private synchronized void c(boolean z) {
    }

    private synchronized void d(boolean z) {
    }

    private CrashDetailBean e() {
    }

    public static bc a(Context context, ad adVar, ab abVar, am amVar, av avVar) {
    }

    public final synchronized void b() {
    }

    public static /* synthetic */ void b(bc bcVar) {
    }

    public static synchronized bc a() {
    }

    public final boolean d() {
    }

    private CrashDetailBean a(bb bbVar) {
    }

    public static void c() {
    }

    private static boolean a(String str, String str2, String str3) {
    }

    private static String a(List<be> list, long j2) {
    }

    public final void a(boolean z) {
    }

    private void a(long j2, String str) {
    }

    private boolean a(long j2) {
    }

    public static /* synthetic */ void a(bc bcVar, String str) {
    }

    public static /* synthetic */ boolean a(String str) {
    }
}
