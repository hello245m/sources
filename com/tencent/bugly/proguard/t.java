package com.tencent.bugly.proguard;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class t {
    public static boolean a = false;
    public static s b = null;
    private static int c = 10;
    private static long d = 300000;
    private static long e = 30000;
    private static long f = 0;
    private static int g = 0;
    private static long h = 0;

    /* renamed from: i, reason: collision with root package name */
    private static long f1077i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static long f1078j = 0;

    /* renamed from: k, reason: collision with root package name */
    private static Application.ActivityLifecycleCallbacks f1079k = null;

    /* renamed from: l, reason: collision with root package name */
    private static Class<?> f1080l = null;

    /* renamed from: m, reason: collision with root package name */
    private static boolean f1081m = true;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ BuglyStrategy b;

        public a(Context context, BuglyStrategy buglyStrategy) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    public static /* synthetic */ long a(long j2) {
    }

    public static /* synthetic */ long b(long j2) {
    }

    public static /* synthetic */ long c() {
    }

    public static /* synthetic */ long d() {
    }

    public static /* synthetic */ long e() {
    }

    public static /* synthetic */ long f() {
    }

    public static /* synthetic */ int g() {
    }

    public static /* synthetic */ int h() {
    }

    public static /* synthetic */ int i() {
    }

    public static /* synthetic */ boolean j() {
    }

    public static /* synthetic */ long k() {
    }

    public static /* synthetic */ long l() {
    }

    public static void a(Context context, BuglyStrategy buglyStrategy) {
    }

    public static /* synthetic */ Class b() {
    }

    private static void c(Context context, BuglyStrategy buglyStrategy) {
    }

    public static /* synthetic */ void b(Context context, BuglyStrategy buglyStrategy) {
    }

    public static void a(StrategyBean strategyBean, boolean z) {
    }

    public static void a() {
    }

    public static /* synthetic */ String a(String str, String str2) {
    }
}
