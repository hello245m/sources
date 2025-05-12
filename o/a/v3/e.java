package o.a.v3;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o.a.v1;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class e extends v1 implements j, Executor {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = null;
    public final c a;
    public final int b;
    public final String c;
    public final int d;
    public final ConcurrentLinkedQueue<Runnable> e;
    private volatile /* synthetic */ int inFlightTasks;

    public e(c cVar, int i2, String str, int i3) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // o.a.o0
    public void dispatch(n.a0.g gVar, Runnable runnable) {
    }

    @Override // o.a.o0
    public void dispatchYield(n.a0.g gVar, Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
    }

    @Override // o.a.v3.j
    public void h() {
    }

    @Override // o.a.v3.j
    public int k() {
    }

    public final void p(Runnable runnable, boolean z) {
    }

    @Override // o.a.o0
    public String toString() {
    }
}
