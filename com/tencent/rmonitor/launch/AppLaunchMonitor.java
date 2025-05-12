package com.tencent.rmonitor.launch;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import com.tencent.rmonitor.launch.ActivityLaunchWatcher;
import com.tencent.rmonitor.launch.ActivityThreadHacker;
import com.tencent.rmonitor.launch.LandingPageTracer;
import k.i.k.e.b.e;
import k.i.k.m.b;
import k.i.k.m.c;
import k.i.k.m.d;

@SuppressLint({"NewApi"})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class AppLaunchMonitor extends e implements ActivityThreadHacker.IApplicationCreateListener, ActivityLaunchWatcher.OnLaunchCompleteListener {

    /* renamed from: k, reason: collision with root package name */
    public static AppLaunchMonitor f1941k;
    public int a;
    public boolean b;
    public boolean c;
    public ActivityThreadHacker d;
    public ActivityLaunchWatcher e;
    public final b f;
    public final c g;
    public final LandingPageTracer h;

    /* renamed from: i, reason: collision with root package name */
    public k.i.k.m.e f1942i;

    /* renamed from: j, reason: collision with root package name */
    public d f1943j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class CheckAppLaunchStageFrom {
        public static final CheckAppLaunchStageFrom FROM_APP_FULL_LAUNCH = null;
        public static final CheckAppLaunchStageFrom FROM_ON_APPLICATION_CREATE_TIME_OUT = null;
        public static final CheckAppLaunchStageFrom FROM_WARM_LAUNCH = null;
        public static final /* synthetic */ CheckAppLaunchStageFrom[] a = null;

        public CheckAppLaunchStageFrom(String str, int i2) {
        }

        public static CheckAppLaunchStageFrom valueOf(String str) {
        }

        public static CheckAppLaunchStageFrom[] values() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a implements Runnable {
        public final /* synthetic */ AppLaunchMonitor a;

        public a(AppLaunchMonitor appLaunchMonitor) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static AppLaunchMonitor getInstance() {
    }

    public final void a() {
    }

    public void addActivityNameBeforeLanding(String str) {
    }

    public void addLandingActivityName(String str) {
    }

    public void addSpan(String str, String str2, long j2, long j3) {
    }

    public void addTag(String str) {
    }

    public void b() {
    }

    public LandingPageTracer.CheckResult c(ActivityLaunchWatcher.b bVar) {
    }

    public final void d() {
    }

    public final boolean e() {
    }

    public void enableCheckActivityBeforeLanding(boolean z) {
    }

    public final boolean f() {
    }

    public final boolean g() {
    }

    public AppLaunchMode getAppLaunchMode() {
    }

    public long getEarliestSpanStartTimeInMs() {
    }

    public void h(CheckAppLaunchStageFrom checkAppLaunchStageFrom) {
    }

    public void i(String str, long j2, long j3) {
    }

    public boolean isStarted() {
    }

    public void j(String str, String str2) {
    }

    @Override // com.tencent.rmonitor.launch.ActivityLaunchWatcher.OnLaunchCompleteListener
    public void onActivityLaunchComplete(ActivityLaunchWatcher.b bVar) {
    }

    public void onApplicationCreateEnd() {
    }

    @Override // com.tencent.rmonitor.launch.ActivityThreadHacker.IApplicationCreateListener
    public void onApplicationLaunchEnd(AppLaunchMode appLaunchMode) {
    }

    @Override // k.i.k.e.b.e, k.i.k.e.b.b
    public void onCreate(Activity activity) {
    }

    @Override // k.i.k.e.b.e, k.i.k.e.b.b
    public void onDestroy(Activity activity) {
    }

    @Override // k.i.k.e.b.e, k.i.k.e.b.b
    public void onResume(Activity activity) {
    }

    public void reportAppFullLaunch() {
    }

    public void setUseActivityThreadHacker(boolean z) {
    }

    public void spanEnd(String str) {
    }

    public void spanStart(String str, String str2) {
    }

    public void startOnApplicationOnCreate(Application application) {
    }

    public void stop() {
    }
}
