package k.a.a.p.p.c0;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class a implements ExecutorService {
    public static final long b = 0;
    public static volatile int c;
    public final ExecutorService a;

    /* renamed from: k.a.a.p.p.c0.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class C0195a {
        public final boolean a;
        public int b;
        public int c;
        public c d;
        public String e;
        public long f;

        public C0195a(boolean z) {
        }

        public a a() {
        }

        public C0195a b(String str) {
        }

        public C0195a c(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b implements ThreadFactory {
        public final String a;
        public final c b;
        public final boolean c;
        public int d;

        /* renamed from: k.a.a.p.p.c0.a$b$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class C0196a extends Thread {
            public final /* synthetic */ b a;

            public C0196a(b bVar, Runnable runnable, String str) {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
            }
        }

        public b(String str, c cVar, boolean z) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface c {
        public static final c a = null;
        public static final c b = null;

        /* renamed from: k.a.a.p.p.c0.a$c$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class C0197a implements c {
            @Override // k.a.a.p.p.c0.a.c
            public void a(Throwable th) {
            }
        }

        void a(Throwable th);
    }

    public a(ExecutorService executorService) {
    }

    public static int a() {
    }

    public static C0195a b() {
    }

    public static a c() {
    }

    public static C0195a d() {
    }

    public static a e() {
    }

    public static C0195a f() {
    }

    public static a g() {
    }

    public static a h() {
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
    }

    public String toString() {
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException {
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t2) {
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
    }
}
