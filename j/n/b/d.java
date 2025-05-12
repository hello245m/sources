package j.n.b;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class d<Params, Progress, Result> {
    public static final ThreadFactory f = null;
    public static final BlockingQueue<Runnable> g = null;
    public static final Executor h = null;

    /* renamed from: i, reason: collision with root package name */
    public static f f3411i;
    public final h<Params, Result> a;
    public final FutureTask<Result> b;
    public volatile g c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a implements ThreadFactory {
        public final AtomicInteger a;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends h<Params, Result> {
        public final /* synthetic */ d b;

        public b(d dVar) {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends FutureTask<Result> {
        public final /* synthetic */ d a;

        public c(d dVar, Callable callable) {
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
        }
    }

    /* renamed from: j.n.b.d$d, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static /* synthetic */ class C0163d {
        public static final /* synthetic */ int[] a = null;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e<Data> {
        public final d a;
        public final Data[] b;

        public e(d dVar, Data... dataArr) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class f extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class g {
        public static final g a = null;
        public static final g b = null;
        public static final g c = null;
        public static final /* synthetic */ g[] d = null;

        public g(String str, int i2) {
        }

        public static g valueOf(String str) {
        }

        public static g[] values() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class h<Params, Result> implements Callable<Result> {
        public Params[] a;
    }

    public static Handler e() {
    }

    public final boolean a(boolean z) {
    }

    public abstract Result b(Params... paramsArr);

    public final d<Params, Progress, Result> c(Executor executor, Params... paramsArr) {
    }

    public void d(Result result) {
    }

    public final boolean f() {
    }

    public void g() {
    }

    public void h(Result result) {
    }

    public void i(Result result) {
    }

    public void j() {
    }

    public void k(Progress... progressArr) {
    }

    public Result l(Result result) {
    }

    public void m(Result result) {
    }
}
