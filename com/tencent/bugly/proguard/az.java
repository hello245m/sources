package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.lang.Thread;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class az implements Thread.UncaughtExceptionHandler {
    private static String h;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f1021i = null;
    public final Context a;
    public final av b;
    public final ad c;
    public final ab d;
    public Thread.UncaughtExceptionHandler e;
    public Thread.UncaughtExceptionHandler f;
    public boolean g;

    /* renamed from: j, reason: collision with root package name */
    private int f1022j;

    public az(Context context, av avVar, ad adVar, ab abVar) {
    }

    private static void c() {
    }

    public final synchronized void a() {
    }

    public final synchronized void b() {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
    }

    private CrashDetailBean a(Thread thread, Throwable th, boolean z, String str, byte[] bArr) {
    }

    private static void a(CrashDetailBean crashDetailBean, Throwable th, boolean z) {
    }

    private static boolean a(Thread thread) {
    }

    public final void a(Thread thread, Throwable th, boolean z, String str, byte[] bArr, boolean z2) {
    }

    private static boolean a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
    }

    public final synchronized void a(StrategyBean strategyBean) {
    }

    private static String a(Throwable th, int i2) {
    }

    private static String a(Throwable th) {
    }
}
