package k.a.a.p.p;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import k.a.a.p.p.p;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class a {
    public final boolean a;
    public final Executor b;
    public final Map<k.a.a.p.g, d> c;
    public final ReferenceQueue<p<?>> d;
    public p.a e;
    public volatile boolean f;
    public volatile c g;

    /* renamed from: k.a.a.p.p.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class ThreadFactoryC0192a implements ThreadFactory {

        /* renamed from: k.a.a.p.p.a$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class RunnableC0193a implements Runnable {
            public final /* synthetic */ Runnable a;

            public RunnableC0193a(ThreadFactoryC0192a threadFactoryC0192a, Runnable runnable) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Runnable {
        public final /* synthetic */ a a;

        public b(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface c {
        void a();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class d extends WeakReference<p<?>> {
        public final k.a.a.p.g a;
        public final boolean b;
        public v<?> c;

        public d(k.a.a.p.g gVar, p<?> pVar, ReferenceQueue<? super p<?>> referenceQueue, boolean z) {
        }

        public void a() {
        }
    }

    public a(boolean z) {
    }

    public synchronized void a(k.a.a.p.g gVar, p<?> pVar) {
    }

    public void b() {
    }

    public void c(d dVar) {
    }

    public synchronized void d(k.a.a.p.g gVar) {
    }

    public synchronized p<?> e(k.a.a.p.g gVar) {
    }

    public void f(p.a aVar) {
    }

    public void g() {
    }

    public a(boolean z, Executor executor) {
    }
}
