package j.s;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class b1 implements Executor {
    public final Executor a;
    public final ArrayDeque<Runnable> b;
    public Runnable c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ Runnable a;
        public final /* synthetic */ b1 b;

        public a(b1 b1Var, Runnable runnable) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public b1(Executor executor) {
    }

    public synchronized void a() {
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
    }
}
