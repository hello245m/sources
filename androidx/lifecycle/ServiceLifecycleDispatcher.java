package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ServiceLifecycleDispatcher {
    private final Handler mHandler;
    private DispatchRunnable mLastDispatchRunnable;
    private final LifecycleRegistry mRegistry;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class DispatchRunnable implements Runnable {
        public final Lifecycle.Event mEvent;
        private final LifecycleRegistry mRegistry;
        private boolean mWasExecuted;

        public DispatchRunnable(LifecycleRegistry lifecycleRegistry, Lifecycle.Event event) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public ServiceLifecycleDispatcher(LifecycleOwner lifecycleOwner) {
    }

    private void postDispatchRunnable(Lifecycle.Event event) {
    }

    public Lifecycle getLifecycle() {
    }

    public void onServicePreSuperOnBind() {
    }

    public void onServicePreSuperOnCreate() {
    }

    public void onServicePreSuperOnDestroy() {
    }

    public void onServicePreSuperOnStart() {
    }
}
