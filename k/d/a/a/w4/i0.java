package k.d.a.a.w4;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class i0 implements j0 {
    public static final c d = null;
    public static final c e = null;
    public static final c f = null;
    public final ExecutorService a;
    public d<? extends e> b;
    public IOException c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b<T extends e> {
        void j(T t2, long j2, long j3, boolean z);

        void k(T t2, long j2, long j3);

        c s(T t2, long j2, long j3, IOException iOException, int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class c {
        public final int a;
        public final long b;

        public /* synthetic */ c(int i2, long j2, a aVar) {
        }

        public static /* synthetic */ int a(c cVar) {
        }

        public static /* synthetic */ long b(c cVar) {
        }

        public boolean c() {
        }

        public c(int i2, long j2) {
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class d<T extends e> extends Handler implements Runnable {
        public final int a;
        public final T b;
        public final long c;
        public b<T> d;
        public IOException e;
        public int f;
        public Thread g;
        public boolean h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f5117i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ i0 f5118j;

        public d(i0 i0Var, Looper looper, T t2, b<T> bVar, int i2, long j2) {
        }

        public void a(boolean z) {
        }

        public final void b() {
        }

        public final void c() {
        }

        public final long d() {
        }

        public void e(int i2) throws IOException {
        }

        public void f(long j2) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface e {
        void a() throws IOException;

        void c();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface f {
        void i();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class g implements Runnable {
        public final f a;

        public g(f fVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class h extends IOException {
        public h(Throwable th) {
        }
    }

    public i0(String str) {
    }

    public static /* synthetic */ d b(i0 i0Var) {
    }

    public static /* synthetic */ d c(i0 i0Var, d dVar) {
    }

    public static /* synthetic */ IOException d(i0 i0Var, IOException iOException) {
    }

    public static /* synthetic */ ExecutorService e(i0 i0Var) {
    }

    public static c h(boolean z, long j2) {
    }

    @Override // k.d.a.a.w4.j0
    public void a() throws IOException {
    }

    public void f() {
    }

    public void g() {
    }

    public boolean i() {
    }

    public boolean j() {
    }

    public void k(int i2) throws IOException {
    }

    public void l() {
    }

    public void m(f fVar) {
    }

    public <T extends e> long n(T t2, b<T> bVar, int i2) {
    }
}
