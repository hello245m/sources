package androidx.arch.core.executor;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class TaskExecutor {
    public abstract void executeOnDiskIO(Runnable runnable);

    public void executeOnMainThread(Runnable runnable) {
    }

    public abstract boolean isMainThread();

    public abstract void postToMainThread(Runnable runnable);
}
