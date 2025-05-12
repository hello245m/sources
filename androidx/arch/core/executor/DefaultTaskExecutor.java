package androidx.arch.core.executor;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class DefaultTaskExecutor extends TaskExecutor {
    private final ExecutorService mDiskIO;
    private final Object mLock;
    private volatile Handler mMainHandler;

    /* renamed from: androidx.arch.core.executor.DefaultTaskExecutor$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements ThreadFactory {
        private static final String THREAD_NAME_STEM = "arch_disk_io_%d";
        private final AtomicInteger mThreadId;
        public final /* synthetic */ DefaultTaskExecutor this$0;

        public AnonymousClass1(DefaultTaskExecutor defaultTaskExecutor) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    private static Handler createAsync(Looper looper) {
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
}
