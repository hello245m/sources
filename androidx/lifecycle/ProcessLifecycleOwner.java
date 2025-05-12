package androidx.lifecycle;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.ReportFragment;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ProcessLifecycleOwner implements LifecycleOwner {
    public static final long TIMEOUT_MS = 700;
    private static final ProcessLifecycleOwner sInstance = null;
    private Runnable mDelayedPauseRunnable;
    private Handler mHandler;
    public ReportFragment.ActivityInitializationListener mInitializationListener;
    private boolean mPauseSent;
    private final LifecycleRegistry mRegistry;
    private int mResumedCounter;
    private int mStartedCounter;
    private boolean mStopSent;

    /* renamed from: androidx.lifecycle.ProcessLifecycleOwner$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ ProcessLifecycleOwner this$0;

        public AnonymousClass1(ProcessLifecycleOwner processLifecycleOwner) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.lifecycle.ProcessLifecycleOwner$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass2 implements ReportFragment.ActivityInitializationListener {
        public final /* synthetic */ ProcessLifecycleOwner this$0;

        public AnonymousClass2(ProcessLifecycleOwner processLifecycleOwner) {
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onCreate() {
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onResume() {
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onStart() {
        }
    }

    /* renamed from: androidx.lifecycle.ProcessLifecycleOwner$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass3 extends EmptyActivityLifecycleCallbacks {
        public final /* synthetic */ ProcessLifecycleOwner this$0;

        /* renamed from: androidx.lifecycle.ProcessLifecycleOwner$3$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 extends EmptyActivityLifecycleCallbacks {
            public final /* synthetic */ AnonymousClass3 this$1;

            public AnonymousClass1(AnonymousClass3 anonymousClass3) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
            }
        }

        public AnonymousClass3(ProcessLifecycleOwner processLifecycleOwner) {
        }

        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
        }

        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    private ProcessLifecycleOwner() {
    }

    public static LifecycleOwner get() {
    }

    public static void init(Context context) {
    }

    public void activityPaused() {
    }

    public void activityResumed() {
    }

    public void activityStarted() {
    }

    public void activityStopped() {
    }

    public void attach(Context context) {
    }

    public void dispatchPauseIfNeeded() {
    }

    public void dispatchStopIfNeeded() {
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
    }
}
