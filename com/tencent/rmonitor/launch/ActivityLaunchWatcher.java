package com.tencent.rmonitor.launch;

import android.app.Activity;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ActivityLaunchWatcher {
    public final HashMap<Integer, b> a;
    public final OnLaunchCompleteListener b;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class MyListener implements ViewTreeObserver.OnWindowFocusChangeListener {
        public final b a;
        public final /* synthetic */ ActivityLaunchWatcher b;

        public MyListener(ActivityLaunchWatcher activityLaunchWatcher, b bVar) {
        }

        public final void a() {
        }

        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public void onWindowFocusChanged(boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface OnLaunchCompleteListener {
        void onActivityLaunchComplete(b bVar);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a implements Runnable {
        public final /* synthetic */ ActivityLaunchWatcher a;

        public a(ActivityLaunchWatcher activityLaunchWatcher) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class b {
        public final String a;
        public final WeakReference<Activity> b;
        public boolean c;
        public boolean d;
        public long e;
        public long f;
        public int g;
        public long h;

        /* renamed from: i, reason: collision with root package name */
        public long f1939i;

        /* renamed from: j, reason: collision with root package name */
        public MyListener f1940j;

        public b(Activity activity) {
        }

        public String toString() {
        }
    }

    public ActivityLaunchWatcher(OnLaunchCompleteListener onLaunchCompleteListener) {
    }

    public static /* synthetic */ HashMap a(ActivityLaunchWatcher activityLaunchWatcher) {
    }

    public static /* synthetic */ void b(ActivityLaunchWatcher activityLaunchWatcher, Activity activity, b bVar) {
    }

    public static /* synthetic */ void c(ActivityLaunchWatcher activityLaunchWatcher, b bVar) {
    }

    public final void d(Activity activity, b bVar) {
    }

    public void destroy() {
    }

    public b e(Activity activity) {
    }

    public final void f(b bVar) {
    }

    public final b g(Activity activity) {
    }

    public b h(Activity activity) {
    }

    public final void i(Activity activity, b bVar) {
    }

    public void onActivityCreate(Activity activity) {
    }

    public void onActivityDestroy(Activity activity) {
    }

    public void onActivityResume(Activity activity) {
    }
}
