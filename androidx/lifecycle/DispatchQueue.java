package androidx.lifecycle;

import android.annotation.SuppressLint;
import java.util.Queue;
import n.a0.g;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class DispatchQueue {
    private boolean finished;
    private boolean isDraining;
    private boolean paused;
    private final Queue<Runnable> queue;

    public static final /* synthetic */ void access$enqueue(DispatchQueue dispatchQueue, Runnable runnable) {
    }

    private final void enqueue(Runnable runnable) {
    }

    public final boolean canRun() {
    }

    @SuppressLint({"WrongThread"})
    public final void dispatchAndEnqueue(g gVar, Runnable runnable) {
    }

    public final void drainQueue() {
    }

    public final void finish() {
    }

    public final void pause() {
    }

    public final void resume() {
    }
}
