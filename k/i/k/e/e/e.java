package k.i.k.e.e;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.Printer;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import k.i.k.e.e.f;
import n.d0.d.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class e implements MessageQueue.IdleHandler, f.a {
    public static final ThreadLocal<e> g = null;
    public static final ConcurrentHashMap<Looper, Handler> h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final a f8160i = null;
    public final HashSet<d> a;
    public f b;
    public long c;
    public boolean d;
    public long e;
    public final Looper f;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {

        /* renamed from: k.i.k.e.e.e$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class RunnableC0730a implements Runnable {
            public final /* synthetic */ Looper a;
            public final /* synthetic */ d b;

            public RunnableC0730a(Looper looper, d dVar) {
            }

            @Override // java.lang.Runnable
            public final void run() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class b implements Runnable {
            public final /* synthetic */ Looper a;
            public final /* synthetic */ d b;

            public b(Looper looper, d dVar) {
            }

            @Override // java.lang.Runnable
            public final void run() {
            }
        }

        public a() {
        }

        public static final /* synthetic */ e a(a aVar, Looper looper, boolean z) {
        }

        public static final /* synthetic */ void b(a aVar, Looper looper) {
        }

        public final Handler c(Looper looper, boolean z) {
        }

        public final e d(Looper looper, boolean z) {
        }

        public final void e(Looper looper, d dVar) {
        }

        public final void f(Looper looper) {
        }

        public final void g(Looper looper, d dVar) {
        }

        public /* synthetic */ a(h hVar) {
        }
    }

    public e(Looper looper) {
    }

    public static final /* synthetic */ ConcurrentHashMap c() {
    }

    public static final /* synthetic */ ThreadLocal d() {
    }

    @Override // k.i.k.e.e.f.a
    public boolean a(Printer printer) {
    }

    @Override // k.i.k.e.e.f.a
    public void b(boolean z, String str) {
    }

    public final synchronized void e(Looper looper) {
    }

    public final void f(d dVar) {
    }

    public final void g() {
    }

    public final void h() {
    }

    public final void i(String str, long j2, long j3) {
    }

    public final void j(String str, long j2) {
    }

    public final boolean k() {
    }

    public final synchronized void l() {
    }

    public final synchronized void m(Looper looper) {
    }

    public final void n(d dVar) {
    }

    public final synchronized void o(Looper looper) {
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
    }
}
