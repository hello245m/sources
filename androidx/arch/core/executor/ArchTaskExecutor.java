package androidx.arch.core.executor;

import java.util.concurrent.Executor;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ArchTaskExecutor extends TaskExecutor {
    private static final Executor sIOThreadExecutor = null;
    private static volatile ArchTaskExecutor sInstance;
    private static final Executor sMainThreadExecutor = null;
    private TaskExecutor mDefaultTaskExecutor;
    private TaskExecutor mDelegate;

    /* renamed from: androidx.arch.core.executor.ArchTaskExecutor$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class AnonymousClass1 implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
        }
    }

    /* renamed from: androidx.arch.core.executor.ArchTaskExecutor$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class AnonymousClass2 implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
        }
    }

    private ArchTaskExecutor() {
    }

    public static Executor getIOThreadExecutor() {
    }

    public static ArchTaskExecutor getInstance() {
    }

    public static Executor getMainThreadExecutor() {
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void executeOnDiskIO(Runnable runnable) {
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public boolean isMainThread() {
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void postToMainThread(Runnable runnable) {
    }

    public void setDelegate(TaskExecutor taskExecutor) {
    }
}
