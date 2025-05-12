package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ReportFragment extends Fragment {
    private static final String REPORT_FRAGMENT_TAG = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
    private ActivityInitializationListener mProcessListener;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface ActivityInitializationListener {
        void onCreate();

        void onResume();

        void onStart();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class LifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public static void dispatch(Activity activity, Lifecycle.Event event) {
    }

    private void dispatchCreate(ActivityInitializationListener activityInitializationListener) {
    }

    private void dispatchResume(ActivityInitializationListener activityInitializationListener) {
    }

    private void dispatchStart(ActivityInitializationListener activityInitializationListener) {
    }

    public static ReportFragment get(Activity activity) {
    }

    public static void injectIfNeededIn(Activity activity) {
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
    }

    @Override // android.app.Fragment
    public void onDestroy() {
    }

    @Override // android.app.Fragment
    public void onPause() {
    }

    @Override // android.app.Fragment
    public void onResume() {
    }

    @Override // android.app.Fragment
    public void onStart() {
    }

    @Override // android.app.Fragment
    public void onStop() {
    }

    public void setProcessListener(ActivityInitializationListener activityInitializationListener) {
    }

    private void dispatch(Lifecycle.Event event) {
    }
}
