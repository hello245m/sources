package com.jeremyliao.liveeventbus.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.core.content.FileProvider;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class AppUtils {
    private static final ActivityLifecycleImpl ACTIVITY_LIFECYCLE = null;
    private static final String PERMISSION_ACTIVITY_CLASS_NAME = "com.blankj.utilcode.util.PermissionUtils$PermissionActivity";

    @SuppressLint({"StaticFieldLeak"})
    private static Application sApplication;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class ActivityLifecycleImpl implements Application.ActivityLifecycleCallbacks {
        public final LinkedList<Activity> mActivityList;
        private int mConfigCount;
        public final Map<Activity, Set<OnActivityDestroyedListener>> mDestroyedListenerMap;
        private int mForegroundCount;
        private boolean mIsBackground;
        public final Map<Object, OnAppStatusChangedListener> mStatusListenerMap;

        private void consumeOnActivityDestroyedListener(Activity activity) {
        }

        private static void fixSoftInputLeaks(Activity activity) {
        }

        private Activity getTopActivityByReflect() {
        }

        private void postStatus(boolean z) {
        }

        private void setTopActivity(Activity activity) {
        }

        public void addOnActivityDestroyedListener(Activity activity, OnActivityDestroyedListener onActivityDestroyedListener) {
        }

        public void addOnAppStatusChangedListener(Object obj, OnAppStatusChangedListener onAppStatusChangedListener) {
        }

        public Activity getTopActivity() {
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

        public void removeOnActivityDestroyedListener(Activity activity) {
        }

        public void removeOnAppStatusChangedListener(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class FileProvider4UtilCode extends FileProvider {
        @Override // androidx.core.content.FileProvider, android.content.ContentProvider
        public boolean onCreate() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface OnActivityDestroyedListener {
        void onActivityDestroyed(Activity activity);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface OnAppStatusChangedListener {
        void onBackground();

        void onForeground();
    }

    private AppUtils() {
    }

    public static ActivityLifecycleImpl getActivityLifecycle() {
    }

    public static LinkedList<Activity> getActivityList() {
    }

    public static Application getApp() {
    }

    private static Application getApplicationByReflect() {
    }

    public static Context getTopActivityOrApp() {
    }

    public static void init(Context context) {
    }

    public static boolean isAppForeground() {
    }

    public static void init(Application application) {
    }
}
