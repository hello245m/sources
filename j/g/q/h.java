package j.g.q;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class h {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a implements ThreadFactory {
        public String a;
        public int b;

        /* renamed from: j.g.q.h$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class C0139a extends Thread {
            public final int a;

            public C0139a(Runnable runnable, String str, int i2) {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
            }
        }

        public a(String str, int i2) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b<T> implements Runnable {
        public Callable<T> a;
        public j.g.s.a<T> b;
        public Handler c;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Runnable {
            public final /* synthetic */ j.g.s.a a;
            public final /* synthetic */ Object b;

            public a(b bVar, j.g.s.a aVar, Object obj) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public b(Handler handler, Callable<T> callable, j.g.s.a<T> aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static ThreadPoolExecutor a(String str, int i2, int i3) {
    }

    public static <T> void b(Executor executor, Callable<T> callable, j.g.s.a<T> aVar) {
    }

    public static <T> T c(ExecutorService executorService, Callable<T> callable, int i2) throws InterruptedException {
    }
}
