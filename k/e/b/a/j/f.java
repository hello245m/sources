package k.e.b.a.j;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import k.e.b.a.g;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class f {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ g a;
        public final /* synthetic */ Callable b;

        public a(f fVar, g gVar, Callable callable) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b<TResult> implements Object, k.e.b.a.d {
        public final CountDownLatch a;

        @Override // k.e.b.a.d
        public final void a(Exception exc) {
        }

        public final void b(TResult tresult) {
        }
    }

    public static <TResult> TResult b(k.e.b.a.f<TResult> fVar) throws ExecutionException {
    }

    public static void c(String str) {
    }

    public final <TResult> k.e.b.a.f<TResult> a(Executor executor, Callable<TResult> callable) {
    }
}
