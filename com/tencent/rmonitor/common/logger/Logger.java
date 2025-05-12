package com.tencent.rmonitor.common.logger;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.concurrent.BlockingQueue;
import k.i.k.e.d.b;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class Logger implements ILoger {
    public static final k.i.k.e.d.a a = null;
    public static SimpleDateFormat b;
    public static boolean c;
    public static b d;
    public static k.i.k.e.d.a e;
    public static final Logger f = null;
    private static int intLevel;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a implements k.i.k.e.d.a {
        public final int a;
        public final StringBuffer b;
        public final BlockingQueue<String> c;
        public final BlockingQueue<String> d;
        public long e;
        public BlockingQueue<String> f;
        public BlockingQueue<String> g;
        public File h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f1938i;

        /* renamed from: com.tencent.rmonitor.common.logger.Logger$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class RunnableC0079a implements Runnable {
            public final /* synthetic */ a a;

            public RunnableC0079a(a aVar) {
            }

            @Override // java.lang.Runnable
            public final void run() {
            }
        }

        public static final /* synthetic */ long b(a aVar) {
        }

        public static final /* synthetic */ File c(a aVar) {
        }

        public static final /* synthetic */ StringBuffer d(a aVar) {
        }

        public static final /* synthetic */ BlockingQueue e(a aVar) {
        }

        public static final /* synthetic */ boolean f(a aVar) {
        }

        public static final /* synthetic */ void g(a aVar, boolean z) {
        }

        public static final /* synthetic */ void h(a aVar, long j2) {
        }

        public static final /* synthetic */ void i(a aVar, File file) {
        }

        @Override // k.i.k.e.d.a
        public void a(b bVar, String... strArr) {
        }

        public void j(String str) {
        }

        public final boolean k() {
        }

        public final void l() {
        }

        public final String m(b bVar, String str, String str2) {
        }

        public final void n() {
        }
    }

    public static final /* synthetic */ SimpleDateFormat a(Logger logger) {
    }

    public final void b(String str, String str2, Throwable th) {
    }

    public final void c(String str, Throwable th) {
    }

    @Override // com.tencent.rmonitor.common.logger.ILoger
    public void d(String... strArr) {
    }

    @Override // com.tencent.rmonitor.common.logger.ILoger
    public void e(String... strArr) {
    }

    public final int f() {
    }

    public final b g() {
    }

    public final k.i.k.e.d.a h() {
    }

    @Override // com.tencent.rmonitor.common.logger.ILoger
    public void i(String... strArr) {
    }

    public final void j(b bVar, String... strArr) {
    }

    public final void k(int i2) {
    }

    public final void l(b bVar) {
    }

    @Override // com.tencent.rmonitor.common.logger.ILoger
    public void v(String... strArr) {
    }

    @Override // com.tencent.rmonitor.common.logger.ILoger
    public void w(String... strArr) {
    }

    public final String i(Throwable th) {
    }
}
