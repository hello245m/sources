package com.tencent.android.tpush.stat.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class MtaActivityLifeCycle {
    private static int a;
    private static long b;
    private static Activity c;

    /* renamed from: com.tencent.android.tpush.stat.lifecycle.MtaActivityLifeCycle$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements Application.ActivityLifecycleCallbacks {
        public final /* synthetic */ a a;

        public AnonymousClass1(a aVar) {
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
    }

    public static /* synthetic */ int a() {
    }

    public static /* synthetic */ int b(int i2) {
    }

    public static long getAppOnForegroundTime() {
    }

    public static Activity getCurrentTopActivity() {
    }

    public static Boolean registerActivityLifecycleCallbacks(Application application, a aVar) {
    }

    public static /* synthetic */ int a(int i2) {
    }

    public static /* synthetic */ long a(long j2) {
    }

    public static /* synthetic */ Activity a(Activity activity) {
    }
}
