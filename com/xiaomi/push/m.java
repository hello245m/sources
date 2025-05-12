package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class m {
    private static volatile m a;
    private ScheduledThreadPoolExecutor b;
    private Map<String, ScheduledFuture> c;
    private Object d;
    private SharedPreferences e;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static abstract class a implements Runnable {
        public abstract String a();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static class b implements Runnable {
        public a a;

        public b(a aVar) {
        }

        public void a() {
        }

        public void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private m(Context context) {
    }

    public static /* synthetic */ SharedPreferences a(m mVar) {
    }

    public static m a(Context context) {
    }

    public static /* synthetic */ Object b(m mVar) {
    }

    private static String b(String str) {
    }

    private ScheduledFuture b(a aVar) {
    }

    public static /* synthetic */ Map c(m mVar) {
    }

    public void a(Runnable runnable) {
    }

    public void a(Runnable runnable, int i2) {
    }

    public boolean a(a aVar) {
    }

    public boolean a(a aVar, int i2) {
    }

    public boolean a(a aVar, int i2, int i3) {
    }

    public boolean a(a aVar, int i2, int i3, boolean z) {
    }

    public boolean a(String str) {
    }

    public boolean b(a aVar, int i2) {
    }
}
