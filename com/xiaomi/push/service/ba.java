package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class ba implements t {
    private static volatile ba f;
    public Context a;
    private SharedPreferences b;
    private long c;
    private volatile boolean d;
    private ConcurrentHashMap<String, a> e;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static abstract class a implements Runnable {
        public String c;
        public long d;

        public a(String str, long j2) {
        }

        public abstract void a(ba baVar);

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private ba(Context context) {
    }

    public static ba a(Context context) {
    }

    public static /* synthetic */ ConcurrentHashMap a(ba baVar) {
    }

    public static /* synthetic */ boolean a(ba baVar, boolean z) {
    }

    public static /* synthetic */ SharedPreferences b(ba baVar) {
    }

    public static /* synthetic */ ba b() {
    }

    public String a(String str, String str2) {
    }

    @Override // com.xiaomi.push.service.t
    public void a() {
    }

    public void a(a aVar) {
    }

    public void a(String str, String str2, String str3) {
    }
}
